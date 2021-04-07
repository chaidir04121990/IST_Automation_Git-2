package ist_real
import java.sql.*
import java.text.DateFormat
import java.text.SimpleDateFormat

import org.eclipse.persistence.exceptions.QueryException
import org.openqa.selenium.By as By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver as WebDriver

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import db_commission_engine.DB_ComEng
import internal.GlobalVariable
import java.util.stream.*
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import groovy.json.JsonSlurper



public class Commision_Engine {

	String xpath_username = "//tr/th/label[text()='Username:']/../following-sibling::td/input[@name='username']"
	String xpath_Pass = "//tr/th/label[text()='Password:']/../following-sibling::td/input[@name='password']"
	String btn_login_rabbitmq = "//tr/td/input[@type='submit' and @value='Login']"
	String btn_logout_rabbitmq = "//form/input[@type='submit' and @value='Log out']"
	String RabbitMQ_Logo = "//div/a/img[@alt='RabbitMQ logo']"
	String Contract_Number
	String Dates_in_RabbitMQ
	Float Presented_Interest_Rate
	Integer Loan_Amount
	String Incentive_Amount
	String Product_Profile_Code
	String Service_Name_Rabbit
	String Table_Incentive
	String ID_SALES_AGENT
	String SA_CODE
	String CODE_EMPLOYEE
	Date DATE_ACTIVE
	Date CURRENT_DATE
	Date RESIGN_DATE
	Date MIN_DATE
	Long WORKING_DAYS
	Long TOTAL_THRESHOLD
	String STATUS_CE_STG_SA
	String ID_MASTER_DATA

	String SALES_ROOM_MASTER_DATA
	Integer AMOUNT_VAS_BONUS
	Float value_paid_int
	Float value_int
	Date Due_Date_RM
	Date Paid_Date_RM
	Long DPD
	Integer Total_Value
	Integer ID_SUBSCHEME
	

	Connection connection = null

	DB_ComEng obj = new DB_ComEng()

	def date_conversion(Date value){
		//		java.util.Date utilDate = new java.util.Date(value);
		//		println(utilDate)
		//		java.sql.Date sqlDate = new java.sql.Date(value.getTime());
		//		println(sqlDate)
		DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
		DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S")
		Date dateparse = inputFormat.parse(value)
		//		println(dateparse)
		String outputDateText = outputFormat.format(dateparse)
		return outputDateText
	}

	@Given("Go to RabbitMQ")
	def Navigate_to_RabbitMQ(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.RabbitMQ_Endpoint)
	}
	@When("Login RabbitMQ with valid credentials")
	def Login_with_Valid_Credentials(){
		WebDriver driver = DriverFactory.getWebDriver()
		driver.findElement(By.xpath(xpath_username)).sendKeys(GlobalVariable.RabbitMQ_Username)
		driver.findElement(By.xpath(xpath_Pass)).sendKeys(GlobalVariable.RabbitMQ_Pass)
		driver.findElement(By.xpath(btn_login_rabbitmq)).click()
	}
	@Then("Login to RabbitMQ Success")
	def Login_Success(){
		TestObject xpath_obj_btn = new TestObject().addProperty('xpath', ConditionType.EQUALS, RabbitMQ_Logo)
		WebUI.comment("Login to RabbitMQ Success")
		WebUI.verifyElementPresent(xpath_obj_btn, 3, FailureHandling.STOP_ON_FAILURE)
	}
	@And("Click button Log out")
	def Button_Log_out(){
		WebDriver driver = DriverFactory.getWebDriver()
		driver.findElement(By.xpath(btn_logout_rabbitmq)).click()
	}

	@Given("Connect Database Commision Engine")
	def Connect_DB_Commision_Engine(){
		//		def conn = obj.Connect_DB()
		//		return conn
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
			def url= GlobalVariable.DB_URL_ComEng
			def username = GlobalVariable.DB_Username_ComEng
			def password =GlobalVariable.DB_Pass_ComEng
			//def sql = Sql.newInstance(url, username, password)
			connection = DriverManager.getConnection(url,username,password)
			println("Connected database successfully")
		}catch(ClassNotFoundException e){
			println("Can't connect to database")
		}
	}
	@And("Select Contract Number from Table CE_MONTHLY_FOCUS")
	def Contract_Number_Monthly_Focus(){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery("SELECT CONTRACT_NUMBER FROM CE_MONTHLY_FOCUS WHERE ID='1'");
			//			println(value)

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("CONTRACT_ID")
				results.beforeFirst()
				while(results.next()==true){
					String contractID = results.getString("CONTRACT_NUMBER")
					this.Contract_Number=contractID
					println(Contract_Number)
				}
			}
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}
	@And("Select Contract Number \"([^\"]*)\"")
	def select_contract_number_Hardcoded(String value){
		try{
			Statement stm = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
			ResultSet rst = stm.executeQuery("SELECT * FROM CE_MASTER_DATA WHERE CONTRACT_NUMBER='"+value+"'")

			rst.beforeFirst()
			if(rst.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				rst.beforeFirst()
				while(rst.next()==true){
					String
				}
			}
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Select Tab \"([^\"]*)\"")
	def select_tab(String value){
		String xpath_tab = "//div[@id='menu']/ul[@id='tabs']/li/a[text()='"+value+"']"
		WebDriver driver = DriverFactory.getWebDriver()
		Thread.sleep(2000)
		driver.findElement(By.xpath(xpath_tab)).click()
	}
	@And("Set Filter \"([^\"]*)\"")
	def set_filter(String value){
		WebDriver driver = DriverFactory.getWebDriver()
		String filter_xpath = '//div[@id="main"]/div[@class="section section-visible"]/div[@class="hider"]/div[@class="filter"]/table/tbody/tr/th/span/input'
		//		driver.findElement(By.xpath(filter_xpath)).clear()
		Thread.sleep(2000);
		driver.findElement(By.xpath(filter_xpath)).sendKeys(value)
		Thread.sleep(2000);
		driver.findElement(By.xpath(filter_xpath)).sendKeys(Keys.ENTER)
	}
	@And("Click Service Name RabbitMQ \"([^\"]*)\"")
	def Click_Service_RabbitMQ(String value){
		this.Service_Name_Rabbit=value
		WebDriver driver = DriverFactory.getWebDriver()
		String serviceName = "//table/tbody/tr/td[1]/a[text()='"+value+"']"
		Thread.sleep(2000)
		driver.findElement(By.xpath(serviceName)).click()
	}
	@And("Fill payload")
	def fill_payload(){
		WebDriver driver = DriverFactory.getWebDriver()
		String payload_H2 ="//h2[text()='Publish message']"
		String payload_textarea = "//div[@class='hider']/form/table[@class='form']/tbody/tr/td/textarea[@name='payload']"
		Thread.sleep(2000)
		driver.findElement(By.xpath(payload_H2)).click()
		Thread.sleep(2000)
		driver.findElement(By.xpath(payload_textarea)).sendKeys('{"cuid":"xxx","contractNumber":"'+Contract_Number+'"}')
		println('{"cuid":"xxx","contractNumber":"'+Contract_Number+'"}')
	}
	@And("Fill payload Risk Malus Monthly Bonus")
	def fill_payload_RM_MB(){
		WebDriver driver = DriverFactory.getWebDriver()
		String payload_H2 ="//h2[text()='Publish message']"
		String payload_textarea = "//div[@class='hider']/form/table[@class='form']/tbody/tr/td/textarea[@name='payload']"
		Thread.sleep(2000)
		driver.findElement(By.xpath(payload_H2)).click()
		Thread.sleep(2000)
		driver.findElement(By.xpath(payload_textarea)).sendKeys('{"cuid":"xxx","contractNumber":"'+Contract_Number+'","subschemeId":"'+ID_SUBSCHEME+'"}')
		println('{"cuid":"xxx","contractNumber":"'+Contract_Number+'","subschemeId":"'+ID_SUBSCHEME+'"}')
	}
	@And("Fill payload Risk Malus VAS Bonus")
	def fill_payload_RM_VB(){
		WebDriver driver = DriverFactory.getWebDriver()
		String payload_H2 ="//h2[text()='Publish message']"
		String payload_textarea = "//div[@class='hider']/form/table[@class='form']/tbody/tr/td/textarea[@name='payload']"
		Thread.sleep(2000)
		driver.findElement(By.xpath(payload_H2)).click()
		Thread.sleep(2000)
		driver.findElement(By.xpath(payload_textarea)).sendKeys('{"cuid":"xxx","contractNumber":"'+Contract_Number+'","subschemeId":"15"}')
		println('{"cuid":"xxx","contractNumber":"'+Contract_Number+'","subschemeId":"15"}')
	}
	@And("Click button in RabbitMQ \"([^\"]*)\"")
	def click_button(String value){
		WebDriver driver = DriverFactory.getWebDriver()
		String button = "//input[@type='submit' and @value='"+value+"']"
		driver.findElement(By.xpath(button)).click()
		Thread.sleep(2000)
		driver.findElement(By.xpath("//div[@class='form-popup-info']/span[text()='Close']")).click()
		Thread.sleep(2000)
		String dates = driver.findElement(By.xpath("//li/label[@id='status']/span[@class='status-ok']")).getText()
		String sub_dates = dates.substring(10, 20)
		this.Dates_in_RabbitMQ=sub_dates
		println(Dates_in_RabbitMQ)
	}
	@And("Select Contract Number from Table CE_COMMISSION to verify publish message")
	def select_ce_commission_to_verify_message(){
		WebDriver driver = DriverFactory.getWebDriver()
		DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
		//		DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
		Date dateparse = Date.valueOf(Dates_in_RabbitMQ)
		//		Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
		String outputDateText = outputFormat.format(dateparse)
		println(outputDateText)
		return outputDateText
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"')"
			println(query)
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
				results.beforeFirst()
				while(results.next()==true){
					String contractID = results.getString("CONTRACT_NUMBER")
					String Dtime = results.getString("CREATED_DTIME")
					String Dtimesubstring=Dtime.substring(0,10)
					assert Dtimesubstring==Dates_in_RabbitMQ
					Integer Bonus = results.getInt("AMOUNT")
					assert Bonus!=0
					println(contractID+" "+Dtimesubstring+" "+Bonus)
				}
			}
		}
		catch(Exception e) {
			System.err.&println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Select Contract Number from CE_MASTER_DATA Where PRODUCT_PROFILE_CODE=\"([^\"]*)\" baru lagi")
	def Select_baru(String value){

	}


	@And("Select Contract Number from CE_MASTER_DATA Where PRODUCT_PROFILE_CODE=\"([^\"]*)\" baru")
	def select_contract_based_on_PRODUCT_PROFILE_CODE_baru(String value){
		this.Product_Profile_Code=value
		switch(value){
			case 'PP_BUYBACK':
				this.Contract_Number='4000012431'
			//1 = 4000012431 - id tippers null
			//2 = 4000016320 - id tippers is not null
				break
			case 'PP_AIRLINES':
				this.Contract_Number='4000013273'
				break
			case 'PP_MPF':
				this.Contract_Number='4000012090'
				break
			case 'PP_SAI':
				this.Contract_Number='4000012491'
				break
			case 'PP_UNSEC':
				this.Contract_Number='4000015856'
			//1=4100000837 - ada tuvxw incentive 40000
			//2=4000015856 - gak ada tuvxw
			//3=4000011871 - ada tuvxw incentive 55000
				break
			default:
				System.err.&println("WRONG PRODUCT PROFILE CODE!!!!")
				break
		}
		String query = "SELECT * FROM CE_MASTER_DATA WHERE PRODUCT_PROFILE_CODE='"+value+"' AND CONTRACT_NUMBER='"+Contract_Number+"'"
		def conn = obj.Select_CE_MASTER_DATA(query)
		return conn
		println conn
	}


	@And("Select Contract Number from CE_MASTER_DATA Where PRODUCT_PROFILE_CODE=\"([^\"]*)\" AND PRESENTED_INTEREST_RATE IS NOT NULL AND LOAN_AMOUNT IS NOT NULL")
	def select_contract_number(String value){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM CE_MASTER_DATA WHERE PRODUCT_PROFILE_CODE='"+value+"' AND PRESENTED_INTEREST_RATE IS NOT NULL AND LOAN_AMOUNT IS NOT NULL"
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()
			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("CONTRACT_NUMBER"+" "+"PRESENTED_INTEREST_RATE"+" "+"LOAN_AMOUNT")
				//				results.beforeFirst()
				String contractID = results.getString("CONTRACT_NUMBER")
				Float PresentedInterestRate = results.getFloat("PRESENTED_INTEREST_RATE")
				Integer LoanAmount = results.getInt("LOAN_AMOUNT")
				this.Contract_Number=contractID
				this.Presented_Interest_Rate=PresentedInterestRate
				this.Loan_Amount=LoanAmount
				println(Contract_Number+" "+Presented_Interest_Rate+" "+Loan_Amount)
			}
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Select Contract Number from CE_MASTER_DATA Where PRODUCT_PROFILE_CODE=\"([^\"]*)\"")
	def select_contract_based_on_PRODUCT_PROFILE_CODE(String value){
		this.Product_Profile_Code=value
		try{
			switch(value){
				case 'PP_BUYBACK':
					this.Contract_Number='4000012431'
				//1 = 4000012431 - id tippers null
				//2 = 4000016320 - id tippers is not null
					break
				case 'PP_AIRLINES':
					this.Contract_Number='4000013273'
					break
				case 'PP_MPF':
					this.Contract_Number='4000012090'
					break
				case 'PP_SAI':
					this.Contract_Number='4000012491'
					break
				case 'PP_UNSEC':
					this.Contract_Number='4000015856'
				//1=4100000837 - ada tuvxw incentive 40000
				//2=4000015856 - gak ada tuvxw
				//3=4000011871 - ada tuvxw incentive 55000
					break
				default:
					System.err.&println("WRONG PRODUCT PROFILE CODE!!!!")
					break
			}
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM CE_MASTER_DATA WHERE PRODUCT_PROFILE_CODE='"+value+"' AND CONTRACT_NUMBER='"+Contract_Number+"'"
			println(query)
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("CONTRACT_NUMBER"+" "+"PRESENTED_INTEREST_RATE"+" "+"LOAN_AMOUNT")
				results.beforeFirst()
				while(results.next()==true){
					String contractID = results.getString("CONTRACT_NUMBER")
					Float PresentedInterestRate = results.getFloat("PRESENTED_INTEREST_RATE")
					Integer LoanAmount = results.getInt("LOAN_AMOUNT")
					this.Contract_Number=contractID
					this.Presented_Interest_Rate=PresentedInterestRate
					this.Loan_Amount=LoanAmount
					println(Contract_Number+" "+Presented_Interest_Rate+" "+Loan_Amount)
				}
			}
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Compare PRESENTED_INTEREST_RATE and LOAN_AMOUNT of the Contract Number with MIN_INTEREST AND MAX_INTEREST AND MIN_CONTRACT_AMOUNT AND MAX_CONTRACT_AMOUNT")
	def compare_PRESENTED_INTEREST_RATE(){
		println("Contract Number= "+Contract_Number)
		println("Presented Interest Rate= "+Presented_Interest_Rate)
		println("Loan Amount= "+Loan_Amount)
		println("Profuct Profile Code= "+Product_Profile_Code)
		if(Product_Profile_Code=='PP_MPF'||Product_Profile_Code=='PP_MPF2'){
			try{
				String ID_CE_PARAMETER
				if(Service_Name_Rabbit=='ce.contract-incentive.queue'){
					ID_CE_PARAMETER='SYS_CONTRACT_INCENTIVE_AMOUNT_MPF'
				}
				else{
					ID_CE_PARAMETER='SYS_LEAD_INCENTIVE_AMOUNT_MPF'
				}
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				String query = "SELECT VALUE FROM CE_PARAMETER WHERE ID='"+ID_CE_PARAMETER+"'"
				println(query)
				ResultSet results = statement.executeQuery(query);
				results.beforeFirst()
				if(results.next()==false){
					System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
				}
				else{
					String value=results.getString("VALUE")
					println("SYS_CONTRACT_INCENTIVE_AMOUNT_MPF= "+value)
					this.Incentive_Amount=value
				}
			}
			catch(Exception e) {
				println("Could not retrieve data from database "+ e.getMessage())
			}

			WebDriver driver = DriverFactory.getWebDriver()
			DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
			DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
			Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
			String outputDateText = outputFormat.format(dateparse)
			println(outputDateText)
			try{
				if(Service_Name_Rabbit=='ce.contract-incentive.queue'){
					String ID_SubScheme = '3'
					this.Service_Name_Rabbit=ID_SubScheme
				}
				else if(Service_Name_Rabbit=='ce.lead-incentive.queue'){
					String ID_SubScheme = '4'
					this.Service_Name_Rabbit=ID_SubScheme
				}
				else{
					println("laennya entar")
				}
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				String query = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
				println(query)
				ResultSet results = statement.executeQuery(query);

				results.beforeFirst()

				if(results.next()==false){
					System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
				}
				else{
					println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
					results.beforeFirst()
					while(results.next()==true){
						String contractID = results.getString("CONTRACT_NUMBER")
						String Dtime = results.getString("CREATED_DTIME")
						String Dtimesubstring=Dtime.substring(0,10)
						assert Dtimesubstring==Dates_in_RabbitMQ
						String Bonus = results.getString("AMOUNT")
						assert Bonus==Incentive_Amount
						println(contractID+" "+Dtimesubstring+" "+Bonus)
					}
				}
			}
			catch(Exception e) {
				System.err.&println("Could not retrieve data from database "+ e.getMessage())
			}
		}
		//		else if(Product_Profile_Code=='PP_UNSEC'){
		//			//AMOUNT DIKURANGI 10000
		//			try{
		//				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//				String query = "SELECT PRODUCT_CODE FROM CE_MASTER_DATA WHERE CONTRACT_NUMBER='"+Contract_Number+"'"
		//				println(query)
		//				ResultSet results = statement.executeQuery(query);
		//
		//				results.beforeFirst()
		//				if(results.next()==false){
		//					System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
		//				}
		//				else{
		//					String productCode = results.getString("PRODUCT_CODE")
		//					String sub_productCode = productCode.substring(0, 3)
		//					if(sub_productCode=="T"||sub_productCode=="U"||sub_productCode=="V"||sub_productCode=="X"||sub_productCode=="W"){
		//						Statement statement_productCode = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//						String query_productCode = ""
		//						println(query_productCode)
		//						ResultSet results_productCode = statement_productCode.executeQuery(query_productCode);
		//					}
		//
		//
		//				}
		//			}
		//			catch(Exception e) {
		//				System.err.&println("Could not retrieve data from database "+ e.getMessage())
		//			}
		//		}
		else if(Product_Profile_Code=='PP_SAI'){
			WebDriver driver = DriverFactory.getWebDriver()
			DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
			DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
			Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
			String outputDateText = outputFormat.format(dateparse)
			println(outputDateText)
			try{
				if(Service_Name_Rabbit=='ce.contract-incentive.queue'){
					String ID_SubScheme = '3'
					this.Service_Name_Rabbit=ID_SubScheme
				}
				else if(Service_Name_Rabbit=='ce.lead-incentive.queue'){
					String ID_SubScheme = '4'
					this.Service_Name_Rabbit=ID_SubScheme
				}
				else{
					println("laennya entar")
				}
				Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
				String query = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
				println(query)
				ResultSet results = statement.executeQuery(query);

				results.beforeFirst()

				if(results.next()==false){
					System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
				}
				else{
					println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
					results.beforeFirst()
					while(results.next()==true){
						String contractID = results.getString("CONTRACT_NUMBER")
						String Dtime = results.getString("CREATED_DTIME")
						String Dtimesubstring=Dtime.substring(0,10)
						assert Dtimesubstring==Dates_in_RabbitMQ
						Integer Bonus = results.getInt("AMOUNT")
						assert Bonus==0
						println(contractID+" "+Dtimesubstring+" "+Bonus)
					}
				}
			}
			catch(Exception e) {
				System.err.&println("Could not retrieve data from database "+ e.getMessage())
			}
		}
		else{
			if(Service_Name_Rabbit=='ce.contract-incentive.queue'){
				this.Table_Incentive='CE_CONTRACT_INCENTIVE_DETAIL'
			}
			else{
				this.Table_Incentive='CE_LEAD_INCENTIVE_DETAIL'
			}

			if(Service_Name_Rabbit=='ce.contract-incentive.queue'){
				String ID_SubScheme = '3'
				this.Service_Name_Rabbit=ID_SubScheme
				println("SUBSCHEME= "+Service_Name_Rabbit)
			}
			else if(Service_Name_Rabbit=='ce.lead-incentive.queue'){
				String ID_SubScheme = '4'
				this.Service_Name_Rabbit=ID_SubScheme
				println("SUBSCHEME= "+Service_Name_Rabbit)
			}
			else{
				println("laennya entar")
			}

			if(Presented_Interest_Rate>=0 && Presented_Interest_Rate<=100){

				if(Loan_Amount>=0 && Loan_Amount<=3999999){
					try{
						Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
						String query = "SELECT INCENTIVE_AMOUNT FROM "+Table_Incentive+" WHERE MIN_CONTRACT_AMOUNT=0 AND MAX_CONTRACT_AMOUNT=3999999"
						println(query)
						ResultSet results = statement.executeQuery(query);
						results.beforeFirst()

						if(results.next()==false){
							System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
						}
						else{
							results.beforeFirst()
							while(results.next()==true){
								String incentiveAmount=results.getString("INCENTIVE_AMOUNT")
								println("Incentive Amount from Table= "+incentiveAmount)
								this.Incentive_Amount=incentiveAmount
							}

						}
					}
					catch(Exception e) {
						System.err.&println("Could not retrieve data from database "+ e.getMessage())
					}

					if(Product_Profile_Code=='PP_UNSEC' && Service_Name_Rabbit=='3'){
						try{
							Statement statement_productCode = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
							String query_productCode = "SELECT * FROM CE_MASTER_DATA WHERE CONTRACT_NUMBER='"+Contract_Number+"'"
							println(query_productCode)
							ResultSet results_productCode = statement_productCode.executeQuery(query_productCode)

							results_productCode.beforeFirst()

							if(results_productCode.next()==false){
								System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
							}
							else{
								results_productCode.beforeFirst()
								while(results_productCode.next()==true){
									String get_productCode=results_productCode.getString("PRODUCT_CODE")
									String sub_get_productCode=get_productCode.substring(2,3)
									println("HURUF KETIGA DARI PRODUCT CODE ADALAH= "+sub_get_productCode)

									if(sub_get_productCode=='T'||sub_get_productCode=='U'||sub_get_productCode=='V'||sub_get_productCode=='X'||sub_get_productCode=='W'){
										try{
											Statement statement_zero_ci = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
											String query_zero_ci="SELECT * FROM CE_PARAMETER WHERE ID='CI_ZERO_CONDITIONAL_AMOUNT'"
											println(query_zero_ci)
											ResultSet results_zero_ci = statement_zero_ci.executeQuery(query_zero_ci)

											results_zero_ci.beforeFirst()

											if(results_zero_ci==false){
												System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
											}
											else{
												results_zero_ci.beforeFirst()
												while(results_zero_ci.next()==true){
													String value_zero_ci = results_zero_ci.getString("VALUE")
													int value_zero_ci_int =Integer.parseInt(value_zero_ci)
													int Incentive_Amount_int = Integer.parseInt(Incentive_Amount)
													Incentive_Amount_int = Incentive_Amount_int - value_zero_ci_int
													println("Incentive Amount - CI_ZERO_CONDITIONAL_AMOUNT= "+Incentive_Amount_int)
													this.Incentive_Amount=String.format("%d",Incentive_Amount_int)

													WebDriver driver = DriverFactory.getWebDriver()
													DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
													DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
													Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
													String outputDateText = outputFormat.format(dateparse)
													println(outputDateText)
													try{
														Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
														String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
														println(query_ce_commission)
														ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

														results_ce_commission.beforeFirst()

														if(results_ce_commission.next()==false){
															System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
														}
														else{
															println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
															results_ce_commission.beforeFirst()
															while(results_ce_commission.next()==true){
																String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
																String Dtime = results_ce_commission.getString("CREATED_DTIME")
																String Dtimesubstring=Dtime.substring(0,10)
																assert Dtimesubstring==Dates_in_RabbitMQ
																String Bonus = results_ce_commission.getString("AMOUNT")
																assert Bonus==Incentive_Amount
																println(contractID+" "+Dtimesubstring+" "+Bonus)
															}
														}
													}
													catch(Exception e) {
														System.err.&println("Could not retrieve data from database "+ e.getMessage())
													}
												}
											}
										}
										catch(Exception e) {
											System.err.&println("Could not retrieve data from database "+ e.getMessage())
										}
									}
									else{
										try{
											WebDriver driver = DriverFactory.getWebDriver()
											DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
											DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
											Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
											String outputDateText = outputFormat.format(dateparse)
											println(outputDateText)
											println("Incentive Amount = "+Incentive_Amount)
											try{
												Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
												String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
												println(query_ce_commission)
												ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

												results_ce_commission.beforeFirst()

												if(results_ce_commission.next()==false){
													System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
												}
												else{
													println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
													results_ce_commission.beforeFirst()
													while(results_ce_commission.next()==true){
														String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
														String Dtime = results_ce_commission.getString("CREATED_DTIME")
														String Dtimesubstring=Dtime.substring(0,10)
														assert Dtimesubstring==Dates_in_RabbitMQ
														String Bonus = results_ce_commission.getString("AMOUNT")
														assert Bonus==Incentive_Amount
														println(contractID+" "+Dtimesubstring+" "+Bonus)
													}
												}
											}
											catch(Exception e) {
												System.err.&println("Could not retrieve data from database "+ e.getMessage())
											}
										}
										catch(Exception e) {
											System.err.&println("Could not retrieve data from database "+ e.getMessage())
										}
									}
								}
							}
						}
						catch(Exception e) {
							System.err.&println("Could not retrieve data from database "+ e.getMessage())
						}
					}
					else{
						WebDriver driver = DriverFactory.getWebDriver()
						DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
						DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
						Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
						String outputDateText = outputFormat.format(dateparse)
						println(outputDateText)
						try{
							Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
							String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
							println(query_ce_commission)
							ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

							results_ce_commission.beforeFirst()

							if(results_ce_commission.next()==false){
								System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
							}
							else{
								println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
								results_ce_commission.beforeFirst()
								while(results_ce_commission.next()==true){
									String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
									String Dtime = results_ce_commission.getString("CREATED_DTIME")
									String Dtimesubstring=Dtime.substring(0,10)
									assert Dtimesubstring==Dates_in_RabbitMQ
									String Bonus = results_ce_commission.getString("AMOUNT")
									assert Bonus==Incentive_Amount
									println(contractID+" "+Dtimesubstring+" "+Bonus)
								}
							}
						}
						catch(Exception e) {
							System.err.&println("Could not retrieve data from database "+ e.getMessage())
						}
					}
				}




				else if(Loan_Amount>=4000000 && Loan_Amount<=6000000){
					try{
						Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
						String query = "SELECT INCENTIVE_AMOUNT FROM "+Table_Incentive+" WHERE MIN_CONTRACT_AMOUNT=4000000 AND MAX_CONTRACT_AMOUNT=6000000"
						println(query)
						ResultSet results = statement.executeQuery(query);
						results.beforeFirst()

						if(results.next()==false){
							System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
						}
						else{
							results.beforeFirst()
							while(results.next()==true){
								String incentiveAmount=results.getString("INCENTIVE_AMOUNT")
								println("Incentive Amount from Table= "+incentiveAmount)
								this.Incentive_Amount=incentiveAmount
							}

						}
					}
					catch(Exception e) {
						System.err.&println("Could not retrieve data from database "+ e.getMessage())
					}

					if(Product_Profile_Code=='PP_UNSEC' && Service_Name_Rabbit=='3'){
						try{
							Statement statement_productCode = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
							String query_productCode = "SELECT * FROM CE_MASTER_DATA WHERE CONTRACT_NUMBER='"+Contract_Number+"'"
							println(query_productCode)
							ResultSet results_productCode = statement_productCode.executeQuery(query_productCode)

							results_productCode.beforeFirst()

							if(results_productCode.next()==false){
								System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
							}
							else{
								results_productCode.beforeFirst()
								while(results_productCode.next()==true){
									String get_productCode=results_productCode.getString("PRODUCT_CODE")
									String sub_get_productCode=get_productCode.substring(2,3)
									println("HURUF KETIGA DARI PRODUCT CODE ADALAH= "+sub_get_productCode)

									if(sub_get_productCode=='T'||sub_get_productCode=='U'||sub_get_productCode=='V'||sub_get_productCode=='X'||sub_get_productCode=='W'){
										try{
											Statement statement_zero_ci = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
											String query_zero_ci="SELECT * FROM CE_PARAMETER WHERE ID='CI_ZERO_CONDITIONAL_AMOUNT'"
											println(query_zero_ci)
											ResultSet results_zero_ci = statement_zero_ci.executeQuery(query_zero_ci)

											results_zero_ci.beforeFirst()

											if(results_zero_ci==false){
												System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
											}
											else{
												results_zero_ci.beforeFirst()
												while(results_zero_ci.next()==true){
													String value_zero_ci = results_zero_ci.getString("VALUE")
													int value_zero_ci_int =Integer.parseInt(value_zero_ci)
													int Incentive_Amount_int = Integer.parseInt(Incentive_Amount)
													Incentive_Amount_int = Incentive_Amount_int - value_zero_ci_int
													println("Incentive Amount - CI_ZERO_CONDITIONAL_AMOUNT= "+Incentive_Amount_int)
													this.Incentive_Amount=String.format("%d",Incentive_Amount_int)

													WebDriver driver = DriverFactory.getWebDriver()
													DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
													DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
													Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
													String outputDateText = outputFormat.format(dateparse)
													println(outputDateText)
													try{
														Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
														String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
														println(query_ce_commission)
														ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

														results_ce_commission.beforeFirst()

														if(results_ce_commission.next()==false){
															System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
														}
														else{
															println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
															results_ce_commission.beforeFirst()
															while(results_ce_commission.next()==true){
																String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
																String Dtime = results_ce_commission.getString("CREATED_DTIME")
																String Dtimesubstring=Dtime.substring(0,10)
																assert Dtimesubstring==Dates_in_RabbitMQ
																String Bonus = results_ce_commission.getString("AMOUNT")
																assert Bonus==Incentive_Amount
																println(contractID+" "+Dtimesubstring+" "+Bonus)
															}
														}
													}
													catch(Exception e) {
														System.err.&println("Could not retrieve data from database "+ e.getMessage())
													}
												}
											}
										}
										catch(Exception e) {
											System.err.&println("Could not retrieve data from database "+ e.getMessage())
										}
									}
									else{
										WebDriver driver = DriverFactory.getWebDriver()
										DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
										DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
										Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
										String outputDateText = outputFormat.format(dateparse)
										println(outputDateText)
										try{
											println("Incentive Amount = "+Incentive_Amount)
											try{
												Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
												String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
												println(query_ce_commission)
												ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

												results_ce_commission.beforeFirst()

												if(results_ce_commission.next()==false){
													System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
												}
												else{
													println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
													results_ce_commission.beforeFirst()
													while(results_ce_commission.next()==true){
														String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
														String Dtime = results_ce_commission.getString("CREATED_DTIME")
														String Dtimesubstring=Dtime.substring(0,10)
														assert Dtimesubstring==Dates_in_RabbitMQ
														String Bonus = results_ce_commission.getString("AMOUNT")
														assert Bonus==Incentive_Amount
														println(contractID+" "+Dtimesubstring+" "+Bonus)
													}
												}
											}
											catch(Exception e) {
												System.err.&println("Could not retrieve data from database "+ e.getMessage())
											}
										}
										catch(Exception e) {
											System.err.&println("Could not retrieve data from database "+ e.getMessage())
										}
									}
								}
							}
						}
						catch(Exception e) {
							System.err.&println("Could not retrieve data from database "+ e.getMessage())
						}
					}
					else{
						WebDriver driver = DriverFactory.getWebDriver()
						DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
						DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
						Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
						String outputDateText = outputFormat.format(dateparse)
						println(outputDateText)
						try{
							Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
							String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
							println(query_ce_commission)
							ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

							results_ce_commission.beforeFirst()

							if(results_ce_commission.next()==false){
								System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
							}
							else{
								println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
								results_ce_commission.beforeFirst()
								while(results_ce_commission.next()==true){
									String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
									String Dtime = results_ce_commission.getString("CREATED_DTIME")
									String Dtimesubstring=Dtime.substring(0,10)
									assert Dtimesubstring==Dates_in_RabbitMQ
									String Bonus = results_ce_commission.getString("AMOUNT")
									assert Bonus==Incentive_Amount
									println(contractID+" "+Dtimesubstring+" "+Bonus)
								}
							}
						}
						catch(Exception e) {
							System.err.&println("Could not retrieve data from database "+ e.getMessage())
						}
					}

				}
				else{
					try{
						Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
						String query = "SELECT INCENTIVE_AMOUNT FROM "+Table_Incentive+" WHERE MIN_CONTRACT_AMOUNT=6000001 AND MAX_CONTRACT_AMOUNT=100000000000"
						println(query)
						ResultSet results = statement.executeQuery(query);
						results.beforeFirst()

						if(results.next()==false){
							System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
						}
						else{
							results.beforeFirst()
							while(results.next()==true){
								String incentiveAmount=results.getString("INCENTIVE_AMOUNT")
								println("Incentive Amount from Table= "+incentiveAmount)
								this.Incentive_Amount=incentiveAmount
							}

						}
					}
					catch(Exception e) {
						System.err.&println("Could not retrieve data from database "+ e.getMessage())
					}

					if(Product_Profile_Code=='PP_UNSEC' && Service_Name_Rabbit=='3'){
						try{
							Statement statement_productCode = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
							String query_productCode = "SELECT * FROM CE_MASTER_DATA WHERE CONTRACT_NUMBER='"+Contract_Number+"'"
							println(query_productCode)
							ResultSet results_productCode = statement_productCode.executeQuery(query_productCode)

							results_productCode.beforeFirst()

							if(results_productCode.next()==false){
								System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
							}
							else{
								results_productCode.beforeFirst()
								while(results_productCode.next()==true){
									String get_productCode=results_productCode.getString("PRODUCT_CODE")
									String sub_get_productCode=get_productCode.substring(2,3)
									println("HURUF KETIGA DARI PRODUCT CODE ADALAH= "+sub_get_productCode)

									if(sub_get_productCode=='T'||sub_get_productCode=='U'||sub_get_productCode=='V'||sub_get_productCode=='X'||sub_get_productCode=='W'){
										try{
											Statement statement_zero_ci = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
											String query_zero_ci="SELECT * FROM CE_PARAMETER WHERE ID='CI_ZERO_CONDITIONAL_AMOUNT'"
											println(query_zero_ci)
											ResultSet results_zero_ci = statement_zero_ci.executeQuery(query_zero_ci)

											results_zero_ci.beforeFirst()

											if(results_zero_ci==false){
												System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
											}
											else{
												results_zero_ci.beforeFirst()
												while(results_zero_ci.next()==true){
													String value_zero_ci = results_zero_ci.getString("VALUE")
													int value_zero_ci_int =Integer.parseInt(value_zero_ci)
													int Incentive_Amount_int = Integer.parseInt(Incentive_Amount)
													Incentive_Amount_int = Incentive_Amount_int - value_zero_ci_int
													println("Incentive Amount - CI_ZERO_CONDITIONAL_AMOUNT= "+Incentive_Amount_int)
													this.Incentive_Amount=String.format("%d",Incentive_Amount_int)

													WebDriver driver = DriverFactory.getWebDriver()
													DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
													DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
													Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
													String outputDateText = outputFormat.format(dateparse)
													println(outputDateText)
													try{
														Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
														String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
														println(query_ce_commission)
														ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

														results_ce_commission.beforeFirst()

														if(results_ce_commission.next()==false){
															System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
														}
														else{
															println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
															results_ce_commission.beforeFirst()
															while(results_ce_commission.next()==true){
																String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
																String Dtime = results_ce_commission.getString("CREATED_DTIME")
																String Dtimesubstring=Dtime.substring(0,10)
																assert Dtimesubstring==Dates_in_RabbitMQ
																String Bonus = results_ce_commission.getString("AMOUNT")
																assert Bonus==Incentive_Amount
																println(contractID+" "+Dtimesubstring+" "+Bonus)
															}
														}
													}
													catch(Exception e) {
														System.err.&println("Could not retrieve data from database "+ e.getMessage())
													}
												}
											}
										}
										catch(Exception e) {
											System.err.&println("Could not retrieve data from database "+ e.getMessage())
										}
									}
									else{
										try{
											println("Incentive Amount = "+Incentive_Amount)
											try{
												Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
												String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
												println(query_ce_commission)
												ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

												results_ce_commission.beforeFirst()

												if(results_ce_commission.next()==false){
													System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
												}
												else{
													println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
													results_ce_commission.beforeFirst()
													while(results_ce_commission.next()==true){
														String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
														String Dtime = results_ce_commission.getString("CREATED_DTIME")
														String Dtimesubstring=Dtime.substring(0,10)
														assert Dtimesubstring==Dates_in_RabbitMQ
														String Bonus = results_ce_commission.getString("AMOUNT")
														assert Bonus==Incentive_Amount
														println(contractID+" "+Dtimesubstring+" "+Bonus)
													}
												}
											}
											catch(Exception e) {
												System.err.&println("Could not retrieve data from database "+ e.getMessage())
											}
										}
										catch(Exception e) {
											System.err.&println("Could not retrieve data from database "+ e.getMessage())
										}
									}
								}
							}
						}
						catch(Exception e) {
							System.err.&println("Could not retrieve data from database "+ e.getMessage())
						}
					}
					else{
						WebDriver driver = DriverFactory.getWebDriver()
						DateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy")
						DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd")
						Date dateparse = inputFormat.parse(Dates_in_RabbitMQ)
						String outputDateText = outputFormat.format(dateparse)
						println(outputDateText)
						try{
							Statement statement_ce_commission = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
							String query_ce_commission = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TRUNC(CREATED_DTIME)=TO_DATE('"+outputDateText+"') AND ID_SUBSCHEME='"+Service_Name_Rabbit+"'"
							println(query_ce_commission)
							ResultSet results_ce_commission = statement_ce_commission.executeQuery(query_ce_commission)

							results_ce_commission.beforeFirst()

							if(results_ce_commission.next()==false){
								System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
							}
							else{
								println("CONTRACT_ID"+" "+"CREATED_DTIME"+" "+"BONUS")
								results_ce_commission.beforeFirst()
								while(results_ce_commission.next()==true){
									String contractID = results_ce_commission.getString("CONTRACT_NUMBER")
									String Dtime = results_ce_commission.getString("CREATED_DTIME")
									String Dtimesubstring=Dtime.substring(0,10)
									assert Dtimesubstring==Dates_in_RabbitMQ
									String Bonus = results_ce_commission.getString("AMOUNT")
									assert Bonus==Incentive_Amount
									println(contractID+" "+Dtimesubstring+" "+Bonus)
								}
							}
						}
						catch(Exception e) {
							System.err.&println("Could not retrieve data from database "+ e.getMessage())
						}
					}
				}
			}
		}
	}


	@And("Get ID_SALES_AGENT From CE_MASTER_DATA")
	def Get_Id_Sales_Agent(){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM CE_MASTER_DATA WHERE PRESENTED_INTEREST_RATE IS NOT NULL AND LOAN_AMOUNT IS NOT NULL AND CONTRACT_NUMBER='4100001237'"
			println(query)
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("CONTRACT_ID"+" "+"ID_SALES_AGENT")
				results.beforeFirst()
				results.next()
				String contractID = results.getString("CONTRACT_NUMBER")
				String idSalesAgent = results.getString("ID_SALES_AGENT")
				this.ID_SALES_AGENT=idSalesAgent
				this.Contract_Number=contractID
				println(contractID+" "+idSalesAgent)

			}
		}
		catch(Exception e) {
			System.err.&println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Get SA_CODE From CE_SALES_AGENT_DETAIL")
	def Get_Sa_Code(){
		println(ID_SALES_AGENT)
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM CE_SALES_AGENT_DETAIL WHERE ID='"+ID_SALES_AGENT+"'"
			println(query)
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("SA_CODE"+" "+"SA_NAME")
				results.beforeFirst()
				results.next()
				String sa_code = results.getString("SA_CODE")
				String sa_name = results.getString("SA_NAME")
				this.SA_CODE=sa_code
				println(sa_code+" "+sa_name)

			}
		}
		catch(Exception e) {
			System.err.&println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Get CODE_EMPLOYEE From CE_STG_SA")
	def Get_Code_Employee(){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM CE_STG_SA WHERE CODE_EMPLOYEE='"+SA_CODE+"'"
			println(query)
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("CODE_EMPLOYEE"+" "+"FIRST_NAME"+" "+"LAST_NAME"+"STATUS"+" "+"RESIGN_DATE"+" "+"DATE_ACTIVE")
				results.beforeFirst()
				results.next()
				String code_employee = results.getString("CODE_EMPLOYEE")
				String first_name = results.getString("FIRST_NAME")
				String last_name = results.getString("LAST_NAME")
				String status = results.getString("STATUS")
				Date resign_date = results.getDate("RESIGN_DATE")
				Date date_active = results.getDate("DATE_ACTIVE")
				this.DATE_ACTIVE=date_active
				this.STATUS_CE_STG_SA=status
				this.RESIGN_DATE=resign_date
				println(code_employee+" "+first_name+" "+last_name+" "+status+" "+resign_date+" "+DATE_ACTIVE)

			}
		}
		catch(Exception e) {
			System.err.&println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Check STATUS of Employee")
	def Status_Employee(){
		if(STATUS_CE_STG_SA=="Terminated"){
			return("NOT ELIGIBLE")
		}
	}

	@And("Get Join Date and Current Date")
	def Get_Date_Active(){
		println("Date Active is "+DATE_ACTIVE)

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd")
		Calendar cal = Calendar.getInstance();
		//		cal.setTime(DATE_ACTIVE);

		cal.add(Calendar.MONTH,-1)
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		String CD = sdf.format(cal.getTime())
		Date date = Date.valueOf(CD)
		this.CURRENT_DATE=date
		println("Current Date is "+CURRENT_DATE)
	}

	@And("Count Total Threshold")
	def Count_Working_Days(){
		Long dateDifference
		if(STATUS_CE_STG_SA!='Active'){
			dateDifference = Math.abs((RESIGN_DATE.getTime() - DATE_ACTIVE.getTime())/(1000*60*60*24))
		}
		else{
			dateDifference = Math.abs((CURRENT_DATE.getTime() - DATE_ACTIVE.getTime())/(1000*60*60*24))
		}

		this.WORKING_DAYS=dateDifference
		println("Working Days: "+WORKING_DAYS+" Days")
		println("Total Threshold= "+category_month(WORKING_DAYS))
	}

	def category_month(Long value){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM CE_LOW_SALES_THRESHOLD"
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				results.beforeFirst()
				while(results.next()==true){
					String category = results.getString("CATEGORY")
					Long category_month = results.getLong("CATEGORY_MONTH")
					Long min_work_days = results.getLong("MIN_WORKING_DAYS")
					Long max_work_days = results.getLong("MAX_WORKING_DAYS")
					Long threshold_before = results.getLong("THRESHOLD_BEFORE")
					Long threshold_diff = results.getLong("THRESHOLD_DIFF")
					if(min_work_days<=value && max_work_days>=value){
						println("Category Month= "+category_month)
						println("Threshold Before= "+threshold_before)
						println("Threshold Diff= "+threshold_diff)
						long total = threshold_before + (value - ((category_month - 1)*30)/30)*threshold_diff
						this.TOTAL_THRESHOLD=total
						return(TOTAL_THRESHOLD)
					}


				}

			}
		}
		catch(Exception e)
		{
			System.err.&println("Could not retrieve data from database "+ e.getMessage())
		}
	}


	def List_Contract_Number(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy")
		String CD = sdf.format(CURRENT_DATE)
		String MD = sdf.format(MIN_DATE)

		println("Current Date= "+CD)
		println("Minimum Date= "+MD)

		String query
		try{
			if(STATUS_CE_STG_SA!='Active'){
				String RD = sdf.format(RESIGN_DATE)
				println("Resign Date= "+RD)
				query = "SELECT SUM(LOAN_AMOUNT) FROM CE_MASTER_DATA WHERE ID_SALES_AGENT='"+ID_SALES_AGENT+"' AND SIGNED_DATE>=TO_DATE('"+MD+"') AND SIGNED_DATE<=TO_DATE('"+RD+"')"
			}
			else{
				query="SELECT SUM(LOAN_AMOUNT) FROM CE_MASTER_DATA WHERE ID_SALES_AGENT='"+ID_SALES_AGENT+"' AND SIGNED_DATE>=TO_DATE('"+MD+"') AND SIGNED_DATE<=TO_DATE('"+CD+"')"
			}
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			//			String query = "SELECT SUM(LOAN_AMOUNT) FROM CE_MASTER_DATA WHERE ID_SALES_AGENT='"+ID_SALES_AGENT+"' AND SIGNED_DATE>=TO_DATE('"+MD+"') AND SIGNED_DATE<=TO_DATE('"+CD+"')"
			println(query)
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				results.beforeFirst()
				while(results.next()==true){
					Long Sum_Loan_Amount = results.getLong("SUM(LOAN_AMOUNT)")
					println("Total Loan Amount= "+Sum_Loan_Amount)
					println("Total Threshold= "+TOTAL_THRESHOLD)
					if(Sum_Loan_Amount>TOTAL_THRESHOLD){
						println("Low Sales Deduction = 0 because Summary of Loan Amount > Total Threshold")
						println("NO DEDUCTION")
						String qry_amount_id_subscheme_11 = "SELECT AMOUNT FROM CE_COMMISSION WHERE ID_SUBSCHEME=11"
						println(qry_amount_id_subscheme_11)
						ResultSet result_amount_11 = statement.executeQuery(qry_amount_id_subscheme_11)

						result_amount_11.beforeFirst()

						if(result_amount_11.next()==false){
							System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
						}
						else{
							result_amount_11.beforeFirst()
							result_amount_11.next()
							Integer amount_low_sales = result_amount_11.getInt("AMOUNT")
							assert amount_low_sales==0
						}
					}
					else{
						Statement stm = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
						String qry = "SELECT CONTRACT_NUMBER FROM CE_MASTER_DATA WHERE ID_SALES_AGENT='"+ID_SALES_AGENT+"' AND CONTRACT_NUMBER='"+Contract_Number+"' AND SIGNED_DATE>=TO_DATE('"+MD+"') AND SIGNED_DATE<=TO_DATE('"+CD+"')"
						println(qry)
						ResultSet rslt = stm.executeQuery(qry)

						rslt.beforeFirst()

						if(rslt.next()==false){
							System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
						}
						else{
							rslt.beforeFirst()
							rslt.next()
							String Contr_num = rslt.getString("CONTRACT_NUMBER")
							Statement stm_ce_com_eng = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY)
							String qry_ce_com_eng = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contr_num+"' AND ID_SUBSCHEME!=11"
							println(qry_ce_com_eng)
							ResultSet rslt_ce_com_eng = stm_ce_com_eng.executeQuery(qry_ce_com_eng)
							rslt_ce_com_eng.beforeFirst()
							if(rslt_ce_com_eng.next()==false){
								System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
							}
							else{
								rslt_ce_com_eng.beforeFirst()
								def array_tot_amount = []
								int sum = 0
								while(rslt_ce_com_eng.next()==true){

									String con_num_ce_com = rslt_ce_com_eng.getString("CONTRACT_NUMBER")
									String id_subscheme = rslt_ce_com_eng.getString("ID_SUBSCHEME")
									Long amount = rslt_ce_com_eng.getLong("AMOUNT")
									array_tot_amount.add(amount)
								}
								println(array_tot_amount)
								for( int num : array_tot_amount) {
									sum = sum+num;
								}
								println(sum)
								//								int sum = Arrays.stream(array_tot_amount)

								String tot_amount_idsubscheme_11 = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contr_num+"' AND ID_SUBSCHEME=11"
								ResultSet rslt_ce_com_eng_11 = stm_ce_com_eng.executeQuery(tot_amount_idsubscheme_11)
								rslt_ce_com_eng_11.beforeFirst()
								rslt_ce_com_eng_11.next()
								Integer amount_idsubscheme_11 = rslt_ce_com_eng_11.getInt("AMOUNT")
								assert amount_idsubscheme_11==sum
							}
						}
					}
					return("Sum Loan Amount= "+Sum_Loan_Amount)
				}
			}
		}
		catch(Exception e)
		{
			System.err.&println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Count Low Sales Commission")
	def count_commission(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd")
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH,-1)
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH))
		String Minimum_Date = sdf.format(cal.getTime())
		println(Minimum_Date)
		Date Min_Date = Date.valueOf(Minimum_Date)
		this.MIN_DATE=Min_Date
		println(List_Contract_Number())


		//		def contract_number = List_Contract_Number()
		//		println(contract_number)
	}
	def Today(){
		long millis=System.currentTimeMillis();
		java.sql.Date date=new java.sql.Date(millis);
		return date
	}
	
	@Given("Consume Endpoint Get Second Installment")
	def Get_Second_Installment(){
		this.ID_SUBSCHEME=15
		def response = WS.sendRequestAndVerify(findTestObject('Get_Second_Installment_Schedule'))
		WS.verifyResponseStatusCode(response, 200)
		WS.verifyElementsCount(response, 'GetInstallmentScheduleResponse.installments.installment[0].numInstallment', 1)
		WS.verifyElementsCount(response, 'GetInstallmentScheduleResponse.installments.installment[1].numInstallment', 1)
		println("Count of Element Installment= "+WS.getElementsCount(response, 'GetInstallmentScheduleResponse.installments.installment'))
		
		String value = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[1].value')
		String value_paid = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[1].valuePaid')
		String due_date = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[1].dateDue')
		String paid_date = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[1].datePaid')
		
		this.value_int = Float.valueOf(value)
		this.value_paid_int = Float.valueOf(value_paid)
		this.Due_Date_RM = Date.valueOf(due_date)
		this.Paid_Date_RM = Date.valueOf(paid_date)
		this.Total_Value = value_int - value_paid_int
		
		println("value= "+value+"\t"+"value paid= "+value_paid+"\t"+"due date= "+due_date+"\t"+"paid date= "+paid_date+"\t"+"Current Date= "+Today())
	}
	
	@Given("Consume Endpoint Get Installment")
	def Get_Installment(){
//		def response = WS.sendRequest(findTestObject('Get_Installment_Schedule'))
		this.ID_SUBSCHEME=9
		def response = WS.sendRequestAndVerify(findTestObject('Get_Installment_Schedule'))
		WS.verifyResponseStatusCode(response, 200)
		WS.verifyElementsCount(response, 'GetInstallmentScheduleResponse.installments.installment[0].numInstallment', 1)
		println("Count of Element Installment= "+WS.getElementsCount(response, 'GetInstallmentScheduleResponse.installments.installment'))
		
		String value = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[0].value')
		String value_paid = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[0].valuePaid')
		String due_date = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[0].dateDue')
		String paid_date = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[0].installmentItems.installmentItem[0].datePaid')
		
		this.value_int = Float.valueOf(value)
		this.value_paid_int = Float.valueOf(value_paid)
		this.Due_Date_RM = Date.valueOf(due_date)
		this.Paid_Date_RM = Date.valueOf(paid_date)
		this.Total_Value = value_int - value_paid_int
		
		println("value= "+value+"\t"+"value paid= "+value_paid+"\t"+"due date= "+due_date+"\t"+"paid date= "+paid_date+"\t"+"Current Date= "+Today())
	}
	
	@Given("Consume Endpoint Get Installment DPD below Threshold")
	def Get_Installment_below_Threshold(){
		this.ID_SUBSCHEME=9
		def response = WS.sendRequestAndVerify(findTestObject('Get_Installment_Schedule_DPD_below_Threshold'))
		WS.verifyResponseStatusCode(response, 200)
		WS.verifyElementsCount(response, 'GetInstallmentScheduleResponse.installments.installment[0].numInstallment', 1)
		println("Count of Element Installment= "+WS.getElementsCount(response, 'GetInstallmentScheduleResponse.installments.installment'))
		
		String value = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[0].value')
		String value_paid = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[0].valuePaid')
		String due_date = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[0].dateDue')
		String paid_date = WS.getElementPropertyValue(response, 'GetInstallmentScheduleResponse.installments.installment[0].installmentItems.installmentItem[0].datePaid')
		
		this.value_int = Float.valueOf(value)
		this.value_paid_int = Float.valueOf(value_paid)
		this.Due_Date_RM = Date.valueOf(due_date)
		this.Paid_Date_RM = Date.valueOf(paid_date)
		this.Total_Value = value_int - value_paid_int
		
		println("value= "+value+"\t"+"value paid= "+value_paid+"\t"+"due date= "+due_date+"\t"+"paid date= "+paid_date+"\t"+"Current Date= "+Today())
	}
	
	def Calculate_Total_Value(){
		if(Total_Value>0){
			this.DPD = Today() - Due_Date_RM
			println("DPD= "+DPD)
		}
		else if(Total_Value==0){
			this.DPD = Paid_Date_RM - Due_Date_RM
			println("DPD= "+DPD)
		}
	}
	
	def Risk_Malus_VAS_Bonus(){
		Calculate_Total_Value()
		if(DPD>30){
			String query_RM_Monthly = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND ID_SUBSCHEME=2"
			ResultSet rs = QueryExecution(query_RM_Monthly)
			rs.beforeFirst()
			if(rs.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				def array_amount = []
				rs.beforeFirst()
				while(rs.next()==true){
					String contract_number=rs.getString("CONTRACT_NUMBER")
					String id_subscheme=rs.getString("ID_SUBSCHEME")
					Integer amount=rs.getInt("AMOUNT")
					String description=rs.getString("DESCRIPTION")
					array_amount.add(amount)
				}
				println(array_amount)
				Integer sum = 0
				for(int i=0;i<array_amount.size();i++){
					sum = sum + array_amount[i]
				}
				println sum
				sum = -(sum*2)
				String sum_string = String.valueOf(sum)
				String Query_RM_VAS_Bonus="SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND ID_SUBSCHEME="+ID_SUBSCHEME+" AND GROUP_DISBURSEMENT='VAS_BONUS'"
				ResultSet rs2 = QueryExecution(Query_RM_VAS_Bonus)
				rs2.beforeFirst()
				rs2.next()
				String amount_RM_VB = rs2.getString("AMOUNT")
				assert sum_string==amount_RM_VB
				return sum
			}
		}
		else{
			println("NO RISK MALUS DEDUCTION")
			String Query_NO_RM = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND NOT EXISTS(SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND ID_SUBSCHEME="+ID_SUBSCHEME+")"
			ResultSet rs2=QueryExecution(Query_NO_RM)
			rs2.beforeFirst()
			rs2.next()==true
		}
	}
		
	def Risk_Malus_Monthly_Bonus(){
		Calculate_Total_Value()
		if(DPD>30){
			String query_RM_Monthly = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND ID_SUBSCHEME IN (1,3,4)"
			ResultSet rs = QueryExecution(query_RM_Monthly)
			rs.beforeFirst()
			if(rs.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				def array_amount = []
				rs.beforeFirst()
				while(rs.next()==true){
					String contract_number=rs.getString("CONTRACT_NUMBER")
					String id_subscheme=rs.getString("ID_SUBSCHEME")
					Integer amount=rs.getInt("AMOUNT")
					String description=rs.getString("DESCRIPTION")
					array_amount.add(amount)
				}
				println(array_amount)
				Integer sum = 0
				for(int i=0;i<array_amount.size();i++){
					sum = sum + array_amount[i]
				}
				println sum
				sum = -(sum*2)
				String sum_string = String.valueOf(sum)
				String Query_RM_Monthly_Bonus="SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND ID_SUBSCHEME="+ID_SUBSCHEME+" AND GROUP_DISBURSEMENT='MONTHLY_BONUS'"
				ResultSet rs2 = QueryExecution(Query_RM_Monthly_Bonus)
				rs2.beforeFirst()
				rs2.next()
				String amount_RM_MB = rs2.getString("AMOUNT")
				assert sum_string==amount_RM_MB
				return sum
			}
		}
		else{
			println("NO RISK MALUS DEDUCTION")
			String Query_NO_RM = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND NOT EXISTS(SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND ID_SUBSCHEME="+ID_SUBSCHEME+")"
			ResultSet rs2=QueryExecution(Query_NO_RM)
			rs2.beforeFirst()
			rs2.next()==true
		}
	}
	
	@And("Verify ValuePaid")
	def Verify_ValuePaid_RM(){
		println Risk_Malus_Monthly_Bonus()
		println Risk_Malus_VAS_Bonus()
	}
	def QueryExecution(String Queue){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery(Queue);
			//			results.beforeFirst()
			return results
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@Given("Select from CE_MASTER_DATA \"([^\"]*)\"")
	def Get_Value_from_CE_MASTER_DATA(String Queue){
		ResultSet rs = QueryExecution(Queue)
		rs.beforeFirst()
		if(rs.next()==false){
			System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
		}
		else{
			//				while(rs.next()==true){
			String contractID = rs.getString("CONTRACT_NUMBER")
			String id = rs.getString("ID")
			String salesroom = rs.getString("SALESROOM")
			this.Contract_Number=contractID
			this.ID_MASTER_DATA=id
			this.SALES_ROOM_MASTER_DATA=salesroom
			println(ID_MASTER_DATA+"\t"+Contract_Number)
			//				}
		}
	}


	@Given("Select from CE_VAS")
	def Get_Value_from_CE_VAS(){
		//		String Query = "SELECT COUNT(*) FROM CE_VAS WHERE ID_MASTER_DATA='"+ID_MASTER_DATA+"'"
		//		ResultSet rs = QueryExecution(Query)
		//		rs.next()
		//		println(rs.getInt("count(*)"))


		String Query2 = "SELECT * FROM CE_VAS WHERE ID_MASTER_DATA='"+ID_MASTER_DATA+"'"
		ResultSet rs2 = QueryExecution(Query2)
		rs2.beforeFirst()
		if(rs2.next()==false){
			System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
		}
		else{
			rs2.beforeFirst()
			while(rs2.next()==true){
				String id = rs2.getString("ID")
				String id_master_data = rs2.getString("ID_MASTER_DATA")
				String service_id = rs2.getString("SERVICE_ID")
				String service_code = rs2.getString("SERVICE_CODE")
				String service_type = rs2.getString("SERVICE_TYPE")
				String service_name = rs2.getString("SERVICE_NAME")
				String service_description = rs2.getString("SERVICE_DESCRIPTION")
				String valid_from = rs2.getString("VALID_FROM")
				String insurance_status = rs2.getString("INSURANCE_STATUS")
				String insurance_contract = rs2.getString("INSURANCE_CONTRACT")
				String insured_from = rs2.getString("INSURED_FROM")
				String insured_to = rs2.getString("INSURED_TO")
				Integer sum_insured_amount = rs2.getInt("SUM_INSURED_AMOUNT")
				Integer premium_amount = rs2.getInt("PREMIUM_AMOUNT")
				String signed_date = rs2.getString("SIGNED_DATE")
				String automatic_prolongation = rs2.getString("AUTOMATIC_PROLONGATION")
				GlobalVariable.SERVICE_CODE_VAS.add(service_code)
				println(id+"\t"+id_master_data+"\t"+service_id+"\t"+service_code+"\t"+service_type+"\t"+service_name+"\t"+service_description)
			}
			println(GlobalVariable.SERVICE_CODE_VAS)

		}
		rs2.last()
		println(rs2.getRow())
		return rs2.getRow()
	}
	@Given("Select from CE_VAS_EXCLUSION")
	def Get_Value_from_CE_VAS_EXCLUSION(){
		for(int i=0;i<GlobalVariable.SERVICE_CODE_VAS.size();i++){
			String Query="SELECT * FROM CE_VAS_EXCLUSION WHERE SERVICE_CODE='"+GlobalVariable.SERVICE_CODE_VAS[i]+"' AND SALES_ROOM='"+SALES_ROOM_MASTER_DATA+"'"
			ResultSet rs = QueryExecution(Query)
			rs.beforeFirst()
			if(rs.next()==false){
				println("Service_Code "+GlobalVariable.SERVICE_CODE_VAS[i]+" doesn't exist in VAS Exclusion")
			}
			else{
				rs.beforeFirst()
				rs.next()
				String service_code = rs.getString("SERVICE_CODE")
				GlobalVariable.SERVICE_CODE_VAS_EXCLUSION.add(service_code)
			}
			println("Count VAS Exclusion = "+GlobalVariable.SERVICE_CODE_VAS_EXCLUSION.size())
		}
		return GlobalVariable.SERVICE_CODE_VAS_EXCLUSION.size()

	}
	@Given("Select from CE_VAS_BONUS")
	def Get_Value_from_CE_VAS_BONUS(){
		println(GlobalVariable.SERVICE_CODE_VAS)
		println(GlobalVariable.SERVICE_CODE_VAS_EXCLUSION)
		Integer vas_level = GlobalVariable.SERVICE_CODE_VAS.size() - GlobalVariable.SERVICE_CODE_VAS_EXCLUSION.size()
		println("VAS LEVEL= "+vas_level)
		String Query = "SELECT * FROM CE_VAS_BONUS WHERE VAS_LEVEL="+vas_level+""
		ResultSet rs = QueryExecution(Query)
		rs.beforeFirst()
		if(rs.next()==false){
			System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
		}
		else{
			String id = rs.getString("ID")
			Integer vas_Level = rs.getInt("VAS_LEVEL")
			Integer amount = rs.getInt("AMOUNT")
			this.AMOUNT_VAS_BONUS = amount
			println(AMOUNT_VAS_BONUS)
		}
		GlobalVariable.SERVICE_CODE_VAS.clear()
		GlobalVariable.SERVICE_CODE_VAS_EXCLUSION.clear()
	}
	@Given("Verify Commission")
	def Verify_Commission(){
		String Query = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' AND TO_DATE(CREATED_DTIME)=TO_DATE('"+select_ce_commission_to_verify_message()+"','dd-MM-yyyy')"
		//		String Query = "SELECT * FROM CE_COMMISSION WHERE CONTRACT_NUMBER='"+Contract_Number+"' ORDER BY CREATED_DTIME DESC"
		ResultSet rs = QueryExecution(Query)
		rs.beforeFirst()
		if(rs.next()==false){
			System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
		}
		else{
			String contract_number = rs.getString("CONTRACT_NUMBER")
			String id_subscheme = rs.getString("ID_SUBSCHEME")
			String amount = rs.getString("AMOUNT")
			Date created_dtime = rs.getDate("CREATED_DTIME")
			String vas_bonus = String.valueOf(AMOUNT_VAS_BONUS)
			String date = String.valueOf(created_dtime)
			assert vas_bonus==amount
			println(amount+"\t"+date)
		}
	}
}
