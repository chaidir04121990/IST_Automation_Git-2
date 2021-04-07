import java.sql.Connection
import java.sql.Driver
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement
import java.text.SimpleDateFormat

import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.BrowserNotOpenedException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable
import ist_real.Contract_Dispatcher


class RTD {
	private String x
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	WebDriver driver
	RTD() {
		System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())
		try{
			driver = DriverFactory.getWebDriver()
		}
		catch (BrowserNotOpenedException e){
			WebUI.openBrowser('')
			driver = DriverFactory.getWebDriver()
			WebUI.closeBrowser()
		}
	}
	//	WebDriver driver = DriverFactory.getWebDriver()
	String today
	String yesterday
	String Input_Label =  "//span[text()='Order ID']/../following-sibling::td[1]/input"
	String Status
	String Contract_Number
	String Submenu_RTD
	String Start_Date_Hold_Payment
	String Release_Date
	String Created_At

	String path = System.getProperty("user.dir");
	String downloadPath = path+"/Screenshot"




	Connection connection = null
	@Given("Connect to Database RTD")
	def Connect_to_DB_RTD() {

		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
			def url= GlobalVariable.DB_URL_RTD
			def username = GlobalVariable.DB_Username_RTD
			def password =GlobalVariable.DB_Pass_RTD
			//def sql = Sql.newInstance(url, username, password)
			connection = DriverManager.getConnection(url,username,password)
			println("Connected database successfully")
		}catch(ClassNotFoundException e){
			println("Can't connect to database")
		}
	}

	@And("Select Contract from Table in DB with Query \"([^\"]*)\"")
	def Query_to_Table(String value){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery(value);
			println(value)

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("KTP"+" "+"CONTRACT_ID"+" "+"STATUS")
				results.beforeFirst()
				while(results.next()==true){
					String ktp = results.getString("KTP")
					String contractID = results.getString("CONTRACT_ID")
					String status = results.getString("STATUS")
					println(ktp+" "+contractID+" "+status)
				}
			}
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@When("Select Contract MPF that Eligible to Disburse")
	def Eligible_MPF_to_Disburse() {
		try{
			String query = "SELECT RTD_CONTRACT_TEMP.KTP,RTD_CONTRACT_TEMP.CONTRACT_ID,RTD_CONTRACT_TEMP.RECIPIENT_BANK_ACCOUNT_NUMBER,RTD_CONTRACT_TEMP.STATUS FROM RTD_CONTRACT_TEMP LEFT JOIN RTD_CONTRACT ON RTD_CONTRACT_TEMP.CONTRACT_ID=RTD_CONTRACT.CONTRACT_ID WHERE RTD_CONTRACT_TEMP.TYPE_CONTRACT='MPF' AND RTD_CONTRACT.STATUS=1 AND RTD_CONTRACT_TEMP.IS_RTD='Y'"
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery(query);
			println(query)

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("KTP"+" "+"CONTRACT ID"+" "+"RECIPIENT BANK ACCOUNT NUMBER"+" "+"STATUS")
				results.beforeFirst()
				while(results.next()==true){
					String ktp = results.getString("KTP")
					String contractID = results.getString("CONTRACT_ID")
					String recipientNumber = results.getString("RECIPIENT_BANK_ACCOUNT_NUMBER")
					String status = results.getString("STATUS")
					println(ktp+" "+contractID+" "+recipientNumber+" "+status)
				}
				println("CONTRACTS ABOVE ARE ELIGIBLE TO DISBURSE")
			}
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}
	@Given("Get Date of Today")
	def Get_Today(){
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy")
		String strDate= formatter.format(date)
		//		Calendar c = Calendar.getInstance()
		//		c.setTime(date);
		//		c.add(Calendar.DAY_OF_MONTH, -1)
		//		date = c.getTime();
		//		String yesterday = formatter.format(date)
		println(strDate)
		this.today=strDate
		//		this.yesterday=yesterday
	}
	@Then("Select Contract RTD perToday")
	def Select_contract_Today(){
		String query = "SELECT CONTRACT_ID FROM RTD_CONTRACT_TEMP WHERE TRUNC(CREATED_DATE)=TO_DATE("+"'"+today+"'"+","+"'dd-mm-yyyy') AND IS_RTD='Y' AND PGW_RESPONSE_CODE='00'"
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet results = statement.executeQuery(query);
		println(query)

		results.beforeFirst()
		if(results.next()==false){
			System.err.&println("DATA DOES NOT EXIST!!!")
		}
		else{
			while(results.next()==true){
				String contract_id=results.getString("CONTRACT_ID")
				println(contract_id)
			}
		}
	}
	@And("Input Contract RTD in Contract Number label")
	def Input_Contract_ID(){
		String Contract_Number_Input = "//span[text()='Contract Number']/../following-sibling::td[1]/input"
		//		driver.findElement(By.xpath(Contract_Number_Input)).sendKeys("4000014162")
		TestObject Input_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, Contract_Number_Input)
		//		WebUI.setText(Input_obj, '4003376577', FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(Input_obj, '4000014162', FailureHandling.STOP_ON_FAILURE)//===NONPRODUCTION====
	}
	@And("Select STATUS \"([^\"]*)\"")
	def Select_STATUS(String value){
		String Status = "//span[text()='Status']/../following-sibling::td/select"
		//		def xpath_new = new Contract_Dispatcher().replace(Status,'{PARAM}',value)
		TestObject Select_Status = new TestObject().addProperty('xpath', ConditionType.EQUALS, Status)
		WebUI.selectOptionByValue(Select_Status, value, true, FailureHandling.STOP_ON_FAILURE)
	}
	@And("Verify Search Result Presents")
	def Search_Result_Presents(){
		//		if(new Contract_Dispatcher().VerifyTblFilled()){
		//			println("Search Result Present")
		//			WebDriver driver = DriverFactory.getWebDriver()

		new Contract_Dispatcher().VerifyTblFilled()
		//			=====================ITS FOR TABLE HEADER=====================
		WebElement table_header_row = driver.findElement(By.xpath("//div[@class='z-grid'][2]/div[1]/table/tbody/tr"))
		List<WebElement> table_header = table_header_row.findElements(By.cssSelector("th[class='z-column']"))
		int table_header_count = table_header.size()
		println("There are "+table_header_count+" Table header")
		for(int i=0;i<table_header_count;i++){
			List<WebElement> column = table_header.get(i).findElements(By.cssSelector("div[class='z-column-content']"))
			for(WebElement webElement : column){
				String content = webElement.getText()
				print(content+" , ")
			}
		}
		//			=====================ITS FOR TABLE CONTENTt=====================
		WebElement table_result = driver.findElement(By.xpath("//div[@class='z-grid'][2]/div[1]/table/tbody/tr/th/div[@class='z-column-content' and text()='Contract Number']/../../../../../following-sibling::div[2]/table/tbody[1]"))
		List<WebElement> content_table_tr = table_result.findElements(By.tagName("tr"))
		int content_table_tr_count = content_table_tr.size()
		println("")
		println("With "+content_table_tr_count+" detail data")
		for(int i=0;i<content_table_tr_count;i++){
			List<WebElement> detail_data = content_table_tr.get(i).findElements(By.tagName("td"))
			int detail_data_count = detail_data.size()
			//println("with "+detail_data_count+" component")
			println()
			for(int j=0;j<detail_data_count;j++){
				List<WebElement> component_detail = detail_data.get(j).findElements(By.cssSelector("div[class='z-row-content']"))
				int component_detail_count = component_detail.size()
				for(int row_detail=0;row_detail<component_detail_count;row_detail++){
					List<WebElement> get_detail_text = component_detail.get(row_detail).findElements(By.tagName("span"))
					for(WebElement webElement : get_detail_text){
						String get_text = webElement.getText()
						print(get_text+" , ")
					}
				}
			}
			println()
		}
		//		}
		//		else{
		//			System.err.&println("Search Result is NULL!!!")
		//		}
	}
	@And("Click View Detail")
	def view_detail_dashboard_RTD(){
		String xpath_viewdetails = "//div[@class='z-row-content']/div/span[@class='z-label']"
		TestObject obj_ViewDetail = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_viewdetails)
		WebUI.verifyElementPresent(obj_ViewDetail, 3, FailureHandling.STOP_ON_FAILURE)
		WebUI.click(obj_ViewDetail)
	}
	@And("Verify Information in View Detail")
	def view_details_information(){
		String ContractNumber = "//span[text()='Contract Number']/../following-sibling::td[1]/input"
		TestObject obj_detail_1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, ContractNumber)
		WebUI.delay(3)
		String value_contract_number = WebUI.getAttribute(obj_detail_1, 'value')
		println("Contract Number: "+value_contract_number)

		String CustomerName = "//span[text()='Customer Name']/../following-sibling::td[1]/input[@type='text']"
		TestObject obj_detail_2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, CustomerName)
		WebUI.delay(3)
		String value_customer_name = WebUI.getAttribute(obj_detail_2, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Customer Name: "+value_customer_name)

		String ContractStatus = "//span[text()='Contract Status']/../following-sibling::td[1]/input[@type='text']"
		TestObject obj_detail_3 = new TestObject().addProperty('xpath', ConditionType.EQUALS, ContractStatus)
		WebUI.delay(3)
		String value_contract_status = WebUI.getAttribute(obj_detail_3, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Customer Name: "+value_contract_status)

		String Amount = "//span[text()='Amount']/../following-sibling::td/input[@type='text']"
		TestObject obj_detail_4 = new TestObject().addProperty('xpath', ConditionType.EQUALS, Amount)
		WebUI.delay(3)
		String value_amount = WebUI.getAttribute(obj_detail_4, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Amount: "+value_amount)

		String BankName = "//span[text()='Bank Name']/../following-sibling::td/input[@type='text']"
		TestObject obj_detail_5 = new TestObject().addProperty('xpath', ConditionType.EQUALS, BankName)
		WebUI.delay(3)
		String value_bank_name = WebUI.getAttribute(obj_detail_5, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Bank Name: "+value_bank_name)

		String BankAccNum = "//span[text()='Bank Account Number']/../following-sibling::td/input[@type='text']"
		TestObject obj_detail_6 = new TestObject().addProperty('xpath', ConditionType.EQUALS, BankAccNum)
		WebUI.delay(3)
		String value_bank_account_number = WebUI.getAttribute(obj_detail_6, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Bank Account Number: "+value_bank_account_number)

		String BankHoldName = "//span[text()='Bank Holder Name']/../following-sibling::td/input[@type='text']"
		TestObject obj_detail_7 = new TestObject().addProperty('xpath', ConditionType.EQUALS, BankHoldName)
		WebUI.delay(3)
		String value_bank_holder_name = WebUI.getAttribute(obj_detail_7, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Bank Holder Name: "+value_bank_holder_name)

		String BankBranchName = "//span[text()='Bank Branch Name']/../following-sibling::td/input[@type='text']"
		TestObject obj_detail_8 = new TestObject().addProperty('xpath', ConditionType.EQUALS, BankBranchName)
		WebUI.delay(3)
		String value_bank_branch_name = WebUI.getAttribute(obj_detail_8, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Bank Branch Name: "+value_bank_branch_name)

		String DateDisburse = "//span[text()='Date of Disbursement']/../following-sibling::td/input[@type='text']"
		TestObject obj_detail_9 = new TestObject().addProperty('xpath', ConditionType.EQUALS, DateDisburse)
		WebUI.delay(3)
		String value_detail_disburse = WebUI.getAttribute(obj_detail_9, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Date of Disbursement: "+value_detail_disburse)

		String TicketNumber = "//span[text()='Ticket Number']/../following-sibling::td/input[@type='text']"
		TestObject obj_detail_10 = new TestObject().addProperty('xpath', ConditionType.EQUALS, TicketNumber)
		WebUI.delay(3)
		String value_tiket_number = WebUI.getAttribute(obj_detail_10, 'value', FailureHandling.STOP_ON_FAILURE)
		println("Ticket Number: "+value_tiket_number)

		//		==========================================TABLE==========================================
		WebDriver driver = DriverFactory.getWebDriver()
		String header = "//div[@class='z-grid'][2]/div[1]/table/tbody/tr/th[@class='z-column']/div[@class='z-column-content']"
		def array_header_table=[]
		for(int i=1;i<6;i++){
			String Header_table_xpath = "//div[@class='z-grid'][2]/div[1]/table/tbody/tr/th[@class='z-column']["+i+"]"+"/div[@class='z-column-content']"
			TestObject obj_header = new TestObject().addProperty('xpath', ConditionType.EQUALS, Header_table_xpath)
			String header_text = WebUI.getText(obj_header)
			array_header_table.add(header_text)
		}
		println(Arrays.toString("Table Header = "+array_header_table))
		WebElement content_table=driver.findElement(By.xpath("//table[@style='table-layout:fixed;']/tbody[@class='z-rows']"))
		List<WebElement> content_table_tr = content_table.findElements(By.tagName("tr"))
		int content_table_tr_count = content_table_tr.size()
		println("There are "+content_table_tr_count+" detail data")
		for(int i=0;i<content_table_tr_count;i++){
			List<WebElement> content_row = content_table_tr.get(i).findElements(By.tagName("td"))
			int content_row_count = content_row.size()
			assert content_row_count == array_header_table.size() :"COUNT OF TABLE HEADER AND CONTENT ROW MUST BE EQUAL;"
			for(int j=0;j<content_row_count;j++){
				String content_row_text = content_row.get(j).getText()
				println(content_row_text)
			}
		}
	}
	@And('Click Checkbox')
	def click_checkbox(){
		//		String xpath_checkbox = "//tr/td[7]/div/span/input[@type='checkbox']"
		String xpath_checkbox = "//div[@class='z-grid'][2]/div[1]/table/tbody/tr/th/div[@class='z-column-content' and text()='Contract Number']/../../../../../following-sibling::div[2]/table/tbody[1]/tr/td/div/span/input"
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_checkbox)
		WebUI.click(new_obj)
	}

	@And('Input \"([^\"]*)\" for \"([^\"]*)\"')
	def Input_label(String value, String menu){
		def xpath_new = new Contract_Dispatcher().replace(Input_Label,'{PARAM}',value)
		TestObject New_Obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
		WebUI.setText(New_Obj, "10037914991", FailureHandling.STOP_ON_FAILURE)
	}

	@And("Get Checkbox data of Menu \"([^\"]*)\" before Hold Payment")
	def Get_Checkbox_data(String Menu){
		this.Submenu_RTD = Menu
		switch(Menu){
			case 'Partner Disbursement':
				String span_contract_number = "//div[@class='z-grid'][2]/div[1]/table/tbody/tr/th/div[@class='z-column-content' and text()='Contract Number']/../../../../../following-sibling::div[2]/table/tbody[1]/tr/td[1]/div/span"
				String get_contract_number = driver.findElement(By.xpath(span_contract_number)).getText()
				String span_status = "//div[@class='z-grid'][2]/div[1]/table/tbody/tr/th/div[@class='z-column-content' and text()='Contract Number']/../../../../../following-sibling::div[2]/table/tbody[1]/tr/td[8]/div/span"
				String get_status = driver.findElement(By.xpath(span_status)).getText()
				println("Contract number "+get_contract_number+" Status is "+get_status+" before Hold Payment")
				this.Contract_Number = get_contract_number
				this.Status = get_status
				break
			default:
				break
		}
	}

	@And("Input reason of Hold Payment")
	def Reason_Hold_Payment(){
		//		String alert_box = '//div[@class="z-window z-window-noheader z-window-modal z-window-shadow"]/div/div[5]/div[3]/table/tbody/tr/td/input'
		//		String alert_box = "//body[@class='webkit webkit1 breeze']/div[3]"
		//		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, alert_box)
		//		WebUI.switchToFrame(new_obj, 10)
		WebUI.switchToWindowIndex(0)
		println("LOLOS")
		WebUI.delay(3)
		driver.findElement(By.xpath('//div[@class="z-window z-window-noheader z-window-modal z-window-shadow"]/div/div[5]/div[3]/table/tbody/tr/td/input')).sendKeys("Testing mobile_test")
	}

	@And("Select Hold Contract Number and make sure status is Hold Payment Recreation")
	def cek_Status_after_Hold(){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String query = "SELECT * FROM RTD_CONTRACT_TEMP WHERE CONTRACT_ID="+"'"+Contract_Number+"'"
			println(query)
			ResultSet results = statement.executeQuery(query);

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("KTP"+" "+"CONTRACT_ID"+" "+"STATUS")
				results.beforeFirst()
				while(results.next()==true){
					String ktp = results.getString("KTP")
					String contractID = results.getString("CONTRACT_ID")
					String status = results.getString("STATUS")
					assert status == '14' :"14 IS HOLD PAYMENT RECREATION"
					println(ktp+" "+contractID+" "+status)
				}
			}
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@And("Input \"([^\"]*)\" with value \"([^\"]*)\"")
	def Input_(String label, String date){
		WebUI.delay(3)
		String xpath_date_input= "//td/span[text()='"+label+"']/../following-sibling::td/span/input"
		driver.findElement(By.xpath(xpath_date_input)).sendKeys(date)
		switch(label){
			case 'Start Date':
				this.Start_Date_Hold_Payment=date
				println(Start_Date_Hold_Payment)
				break
			case 'End Date':
				this.Release_Date=date
				println(Release_Date)
				break
			default:
				System.err.&println("can't find label")
				break
		}
	}

	@And("Verify Result")
	def result_of_table(){
		WebElement header = driver.findElement(By.xpath("//div[@class='z-grid'][2]/div[@class='z-grid-header']/table/tbody/tr"))
		List<WebElement> content_table_th = header.findElements(By.cssSelector("th[class='z-column']"))
		int content_table_th_count = content_table_th.size()
		println("There are "+content_table_th_count+" detail data")
		def Hold_Payment_Header = [
			"Start Date",
			"End Date",
			"Created By",
			"Created At",
			"Release By",
			"Release At",
			"Total Amount",
			"Action"
		]
		for(int i=0;i<content_table_th_count;i++){
			String content_header_text = content_table_th.get(i).getText()
			assert content_header_text==Hold_Payment_Header[i]
			println(content_header_text)
		}

		String xpath_text = "//div[@class='z-grid'][2]/div[3]/table/tbody/tr/td/div/span[text()='"+Start_Date_Hold_Payment+"']"
		WebUI.delay(3)
		if(driver.findElement(By.xpath(xpath_text))!=null){
			println("start date present "+Start_Date_Hold_Payment)
		}
		WebUI.takeScreenshot(downloadPath+"/"+"result date.png")
	}

	@And("Click button \"([^\"]*)\" and Verify data")
	def button_release_and_its_Data(String btn){
		WebUI.delay(3)
		String xpath_button = "//tbody/tr/td/div/button[text()='"+btn+"']"
		String Start_Date = xpath_button+"/../../preceding-sibling::td[7]/div/span"
		String End_Date = xpath_button+"/../../preceding-sibling::td[6]/div/span"
		String Created_By = xpath_button+"/../../preceding-sibling::td[5]/div/span"
		String Created_At = xpath_button+"/../../preceding-sibling::td[4]/div/span"
		String Release_By = xpath_button+"/../../preceding-sibling::td[3]/div/span"
		String Release_At = xpath_button+"/../../preceding-sibling::td[2]/div/span"
		String Total_Amount = xpath_button+"/../../preceding-sibling::td[1]/div/span"

		String get_StartDate = driver.findElement(By.xpath(Start_Date)).getText()
		String get_EndDate = driver.findElement(By.xpath(End_Date)).getText()
		String get_CreatedBy = driver.findElement(By.xpath(Created_By)).getText()
		String get_CreatedAt = driver.findElement(By.xpath(Created_At)).getText()
		String get_ReleaseBy = driver.findElement(By.xpath(Release_By)).getText()
		String get_ReleaseAt = driver.findElement(By.xpath(Release_At)).getText()
		String get_TotalAmount = driver.findElement(By.xpath(Total_Amount)).getText()
		println("Start Date: "+get_StartDate)
		println("End Date: "+get_EndDate)
		println("Created By: "+get_CreatedBy)
		println("Created At: "+get_CreatedAt)
		println("Release By: "+get_ReleaseBy)
		println("Release At: "+get_ReleaseAt)
		println("Total Amount: "+get_TotalAmount)
		driver.findElement(By.xpath(xpath_button)).click()
		println("Button Release Clicked")
		this.Start_Date_Hold_Payment = get_StartDate
		this.Release_Date = get_EndDate
		this.Created_At = get_CreatedAt
	}

	@And("Verify Data dont Exist")
	def data_disappear_from_table(){
		WebUI.delay(3)
		String xpath_StartDate = "//tbody/tr/td/div/button[text()='Release']/../../preceding-sibling::td[4]/div/span[text()='"+Start_Date_Hold_Payment+"']"
		TestObject StartDate_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_StartDate)
		WebUI.verifyElementNotPresent(StartDate_obj, 3)
		String xpath_EndDate = "//tbody/tr/td/div/button[text()='Release']/../../preceding-sibling::td[3]/div/span[text()='"+Release_Date+"']"
		TestObject EndDate_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_EndDate)
		WebUI.verifyElementNotPresent(EndDate_obj, 3)
	}
	@And("Verify Button \"([^\"]*)\" Exists")
	def Verify_Button_Exist(String btn){
		String xpath_button = new Contract_Dispatcher().IST_General_Button
		String btn_objet = new Contract_Dispatcher().replace(xpath_button,'{PARAM}',btn)
		driver.findElement(By.xpath(btn_objet))
	}
}