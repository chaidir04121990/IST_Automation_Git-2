
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.*

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.main.CustomKeywordDelegatingMetaClass
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import ist_real.Contract_Dispatcher
import java.sql.Connection
import java.sql.Driver
import java.sql.ResultSet
import java.sql.Statement
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.stringtemplate.v4.compiler.STParser.option_return
import org.openqa.selenium.WebDriver
import org.junit.Test
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import java.sql.DriverManager
import groovy.sql.Sql
import oracle.jdbc.driver.*



class Slik_Script {

	//XPATH
	String IST_SLIK_General_Menu ="//span[contains(text(),'{PARAM}')]"
	String IST_Slik_Check_Input = "//span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='{PARAM}']/../following-sibling::td[1]/input"
	String IST_Slik_Check_Textarea = "//span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='{PARAM}']/../following-sibling::td[1]/textarea"
	String IST_Slik_Search_Input = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='borderless z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='{PARAM}']/../following-sibling::td[1]/input"
	String IST_Slik_Approval_Ktp = "//span[text()='Waiting for Approval']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='borderless z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='KTP Number ']/../following-sibling::td[1]/input"
	String IST_Slik_Address = "//span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='KTP Address']/../following-sibling::td/textarea[@rows='5']"
	String IST_Radio_Button = "//span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='Gender *']/../following-sibling::td[1]//span/label[text()='{PARAM}']/preceding-sibling::input"
	String IST_Combo_Box = "//span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='Purpose *']/../following-sibling::td[1]//select"
	String IST_Status_Box = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='borderless z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='Status']/../following-sibling::td[1]//select"
	String IST_Status_Box1 = "//span[text()='Waiting for Approval']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='borderless z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='Status']/../following-sibling::td[1]//select"
	String IST_Slik_DOB = "//span[text()='Date of Birth *']//following::td[1]/span/input"
	String IST_Datepicker ="//span[text()='{PARAM}']/../following-sibling::td[1]/span/a[@class='z-datebox-button']"
	String IST_Slik_Date = "//span[text()='{PARAM}']//following::td[1]/span/input"
	String Testing = "//span[text()='Gender *']//following::td[1]/span/input[@type='radio' and @value= 'L']"
	String KTPTEST = "//span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='KTP Address']/../following-sibling::td[1]/span/input"
	String IST_General_Button = "//Button[text()='{PARAM}']"
	String IST_Slik_Serach_Input = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='{PARAM}']/../following-sibling::td[1]/input"
	////span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='Purpose *']/../following-sibling::td[1]//select]
	String IST_General_Popup_message_Slik = '//div[contains(text(),"IT Supporting Tools")]/following-sibling::div/table/tbody/tr/td/table/tbody/tr/td[5]/div/span[contains(text(),"KTP Number {PARAM} is requested successfully.")]'
	String Slik_Search_Ktp = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span[text()='{PARAM}']"
	String Slik_Search_Name = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span[text()='{PARAM}']/../../following-sibling::td[1]/div/span"
	String Slik_Search_Date = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span[text()='{PARAM}']/../../following-sibling::td[2]/div/span"
	String Slik_Get_Result_Date = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[4]/div/span"
	String Slik_Search_Status = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span[text()='{PARAM}']/../../following-sibling::td[3]/div/span"
	String Slik_Result_Status = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[5]/div/span"
	String Slik_Result_KTP = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span"
	String Slik_View_Detail = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[7]/div/div/span"
	String SLik_get_KTP_on_ResultStatus = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[5]/div/span[text()='{PARAM}']/../../preceding-sibling::td[3]/div/span"
	String IST_Slik_Text = "//span[text()='{PARAM}']"
	String Slik_Search_Ktp1 = "//span[text()='Waiting for Approval']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span[text()='{PARAM}']"
	String Slik_Search_Name1 = "//span[text()='Waiting for Approval']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span[text()='{PARAM}']/../../following-sibling::td[1]/div/span"
	String Slik_Ktp_Doc= "//span[text()='Waiting for Approval']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span[text()='{PARAM}']/../../following-sibling::td[2]/div/div/span"
	String Slik_App_Validate= "//span[text()='Waiting for Approval']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td[2]/div/span[text()='{PARAM}']/../../following-sibling::td[3]/div/span/input"
	String Checklist = "//span/label[contains(text(),' Saya Setuju')]/preceding-sibling::input[@type='checkbox']"
	String ListTable = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr[contains(@class,'z-row')]"


	//VARIABLE
	String KtpNum1
	String ClaimStatus
	String Menu
	String Type
	String Checker
	String Result_Status
	String Date_Start
	String Date_End


	def replace(String x,oldc,newc){
		String str =  new String(x)
		return str.replace(oldc, newc)
		return str
	}

	//CHECK SLIK
	@Given("Input Data \"([^\"]*)\" with value \"([^\"]*)\" for Check SLIK")
	def Slik_Input(String label, String value) {
		def xpath_invoice_amount = replace(IST_Slik_Check_Input, '{PARAM}', label)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
		WebUI.waitForElementVisible(new_obj, 30)
		WebUI.focus(new_obj)
		WebUI.setText(new_obj, value)
		WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/slik.png')


	}

	@And("Select Menu SLIK Gateway Customer")
	def Menu_SLIK_Gateway_Customer(){
		def xpath_span_menu = replace(IST_SLIK_General_Menu, "{PARAM}", "SLIK Gateway Customer")
		TestObject new_main_menu = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_span_menu)
		WebUI.waitForElementPresent(new_main_menu, 30)
		WebUI.click(new_main_menu)
		WebUI.waitForPageLoad(30)
		this.Menu="SLIK Gateway Customer"
		this.Type="C"
		println(Menu)
	}

	@And("Select Menu SLIK Gateway NonCustomer")
	def Menu_SLIK_Gateway_NonCustomer(){
		def xpath_span_menu = replace(IST_SLIK_General_Menu, "{PARAM}", "SLIK Gateway Non Customer")
		TestObject new_main_menu = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_span_menu)
		WebUI.waitForElementPresent(new_main_menu, 30)
		WebUI.click(new_main_menu)
		WebUI.waitForPageLoad(30)
		this.Menu="SLIK Gateway Non Customer"
		this.Type="NC"
		println(Menu)
	}

	@Given("Input Data KTP Number")
	def Input_KTP_Number(){
		if(Menu=="SLIK Gateway Customer"){
			def xpath_invoice_amount = replace(IST_Slik_Check_Input, '{PARAM}', "KTP Number *")
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
			WebUI.setText(new_obj, GlobalVariable.KTPnum_Customer)
		}
		else if(Menu=="SLIK Gateway Non Customer"){
			def xpath_invoice_amount = replace(IST_Slik_Check_Input, '{PARAM}', "KTP Number *")
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
			WebUI.setText(new_obj, GlobalVariable.KTPnum_Non_Customer)
		}
	}

	@And("Input Wrong KTP Number")
	def Input_Wrong_KTP_Number(){
		def xpath_invoice_amount = replace(IST_Slik_Check_Input, '{PARAM}', "KTP Number *")
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
		WebUI.setText(new_obj, "")
	}

	@And("Select Gender \"([^\"]*)\"")
	def Slik_Gender(String value) {
		println (value)
		switch(value){
			case 'Laki-laki':
				def xpath_textbox_label = replace(IST_Radio_Button,'{PARAM}', value)
				TestObject new_inputtextbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_textbox_label)
				WebUI.click(new_inputtextbox)
			//span[text()='Gender *']//following::td[1]/span/input[@value='L']
				break

			case 'Perempuan':
				def xpath_textbox_label = replace(IST_Radio_Button,'{PARAM}', value)
				TestObject new_inputtextbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_textbox_label)
				WebUI.click(new_inputtextbox)
				break
		}
	}

	@And("Select Purpose is \"([^\"]*)\"")
	def Slik_Purpose(String value) {
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, IST_Combo_Box)
		WebUI.selectOptionByValue(new_obj, value, true)
	}

	@And("Input Date of Birth \"([^\"]*)\"")
	def Slik_DOB(String value) {
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, IST_Slik_DOB)
		WebUI.setText(new_obj, value)
		WebUI.delay(3)
		//		def xpath_datepicker=replace(IST_Datepicker,'{PARAM}','Date of Birth *')
	}

	@And("Input KTP Address \"([^\"]*)\"")
	def Slik_Ktp(String value) {
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS,IST_Slik_Address)
		WebUI.setText(new_obj, value)
		def xpath_invoice_amount = replace(IST_Slik_Check_Input, '{PARAM}', 'KTP Number *')

	}

	@And("Verify KTP Number \"([^\"]*)\" Request Success")
	def Slik_Request(String value) {
		sleep(10000)
		def xpath_Ktp_Req = replace(IST_General_Popup_message_Slik, '{PARAM}', value)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_Ktp_Req)
		WebUI.verifyElementPresent(new_obj, 3)

	}

	@And("Verify KTP Number Request Success")
	def Verify_KTP_Number(){
		sleep(20000)
		if(Menu=="SLIK Gateway Customer"){
			def xpath_Ktp_Req = replace(IST_General_Popup_message_Slik, '{PARAM}', GlobalVariable.KTPnum_Customer)
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_Ktp_Req)
			WebUI.verifyElementPresent(new_obj, 3)
		}
		else if(Menu=="SLIK Gateway Non Customer"){
			def xpath_Ktp_Req = replace(IST_General_Popup_message_Slik, '{PARAM}', GlobalVariable.KTPnum_Non_Customer)
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_Ktp_Req)
			WebUI.verifyElementPresent(new_obj, 3)
		}
	}

	//SEARCH RESULT SLIK
	@And("Input Data \"([^\"]*)\" with value \"([^\"]*)\" for Search Result")
	def Slik_Search(String label, String value) {
		def xpath_invoice_amount = replace(IST_Slik_Search_Input, '{PARAM}', label)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
		WebUI.scrollToElement(new_obj, 3)
		WebUI.setText(new_obj, value)
	}

	@And("Input Data KTP Number for Search Result")
	def Input_KTP_Search_Result(){
		if(Menu=="SLIK Gateway Customer"){
			def xpath_invoice_amount = replace(IST_Slik_Search_Input, '{PARAM}', "KTP Number")
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
			WebUI.scrollToElement(new_obj, 3)
			WebUI.setText(new_obj, GlobalVariable.KTPnum_Customer)
		}
		else if(Menu=="SLIK Gateway Non Customer"){
			def xpath_invoice_amount = replace(IST_Slik_Search_Input, '{PARAM}', "KTP Number")
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
			WebUI.scrollToElement(new_obj, 3)
			WebUI.setText(new_obj, GlobalVariable.KTPnum_Non_Customer)
		}
		else{
			println("ERROR")
		}

	}

	@And("Select Status is \"([^\"]*)\"")
	def Slik_Status(String value) {
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, IST_Status_Box)
		WebUI.selectOptionByValue(new_obj, value, true)
		this.ClaimStatus = value
	}

	@And("Set Start Date with value \"([^\"]*)\" and End Date with value \"([^\"]*)\"")
	def Slik_Date_Search(String value1, String value2) {
		def xpath_invoice_amount = replace(IST_Slik_Date, '{PARAM}', 'Date Start')
		TestObject new_obj_Start = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
		def xpath_invoice_amount1 = replace(IST_Slik_Date, '{PARAM}', 'Date End')
		TestObject new_obj_End = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount1)
		WebUI.scrollToElement(new_obj_Start, 3)
		WebUI.verifyElementPresent(new_obj_Start, 5, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(new_obj_Start, value1)
		WebUI.verifyElementPresent(new_obj_End, 5, FailureHandling.STOP_ON_FAILURE)
		WebUI.setText(new_obj_End, value2)

		println("Date Start: "+ value1)
		println("Date End: "+ value2)

		def dateFormat ='dd MMMM yyyy'
		if(value1.length()>0){
			Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(value1)
			println(value1+"\t"+date1)
			String NewDateFormat = date1.format(dateFormat)
			println(NewDateFormat)
			this.Date_Start=NewDateFormat
		}

		if(value2.length()>0){
			Date date2=new SimpleDateFormat("dd-MM-yyyy").parse(value2)
			println(value2+"\t"+date2)
			String NewDateFormat2 = date2.format(dateFormat)
			println(NewDateFormat2)
			this.Date_End=NewDateFormat2
		}

	}

	@And("Verify Search Result with KTP Number \"([^\"]*)\"")
	def Slik_Verify_Ktp(String value) {
		def xpath_verify_text = replace(Slik_Search_Ktp, '{PARAM}', value)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		WebUI.verifyElementPresent(new_obj, 3)
		this.KtpNum1 = value
	}

	@And("Verify Search Result with KTP Number")
	def Verify_KTP_Number_Search_Result(){
		if(Menu=="SLIK Gateway Customer"){
			def xpath_verify_text = replace(Slik_Search_Ktp, '{PARAM}', GlobalVariable.KTPnum_Customer)
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
			def verifyElementKTP = WebUI.verifyElementPresent(new_obj, 3, FailureHandling.OPTIONAL)
			if(verifyElementKTP==true){
				this.KtpNum1 = GlobalVariable.KTPnum_Customer
				println("KTP Number Found")
			}
			else{
				System.err.&println("Data KTP not Found!!!")
				System.exit(0)
			}
			//			WebUI.verifyElementPresent(new_obj, 3)
			//			this.KtpNum1 = GlobalVariable.KTPnum_Customer
		}
		else if(Menu=="SLIK Gateway Non Customer"){
			def xpath_verify_text = replace(Slik_Search_Ktp, '{PARAM}', GlobalVariable.KTPnum_Non_Customer)
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
			def verifyElementKTP = WebUI.verifyElementPresent(new_obj, 3, FailureHandling.OPTIONAL)
			if(verifyElementKTP==true){
				this.KtpNum1 = GlobalVariable.KTPnum_Non_Customer
			}
			else{
				System.err.&println("Data KTP not Found!!!")
				new Contract_Dispatcher().close_browser()
				//				System.exit(0)
			}
			//			WebUI.verifyElementPresent(new_obj, 3)
			//			this.KtpNum1 = GlobalVariable.KTPnum_Non_Customer
		}
		else{
			println("Menu doesn't recognize")
		}
	}

	@And("Verify Search Result Based on Result Status")
	def Verify_Result_Status(){
		TestObject new_obj2 = new TestObject().addProperty('xpath',ConditionType.EQUALS, Slik_Result_Status)
		WebUI.scrollToElement(new_obj2, 3)
		if (ClaimStatus == ""){
			WebUI.verifyElementPresent(new_obj2, 3)
		}else if (ClaimStatus == "REQUESTED"){
			WebUI.verifyElementText(new_obj2, "REQUESTED -")
		}else if (ClaimStatus == "APPROVED"){
			WebUI.verifyElementText(new_obj2, "APPROVED - FAILED", FailureHandling.OPTIONAL) || WebUI.verifyElementText(new_obj2, "APPROVED - SUCCESS", FailureHandling.OPTIONAL) || WebUI.verifyElementText(new_obj2, "APPROVED -", FailureHandling.OPTIONAL)
		}else if (ClaimStatus == "NOT_APPROVED"){
			WebUI.verifyElementText(new_obj2, "NOT_APPROVED -")
		}else if(ClaimStatus=="SUCCESS"){
			WebUI.verifyElementText(new_obj2, "SUCCESS")
		}else if(ClaimStatus=="FAILED"){
			WebUI.verifyElementText(new_obj2, "FAILED")
		}
		String ResultStatus = WebUI.getText(new_obj2, FailureHandling.STOP_ON_FAILURE)
		if(ResultStatus=='REQUESTED -' || ResultStatus=='APPROVED -' || ResultStatus=='NOT_APPROVED -'){
			def xpath_KTP_on_Status = replace(SLik_get_KTP_on_ResultStatus,'{PARAM}',ResultStatus+' ')
			TestObject KTP_on_Status_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_KTP_on_Status)
			String KTP_Number = WebUI.getText(KTP_on_Status_obj, FailureHandling.STOP_ON_FAILURE)
			println("KTP: "+KTP_Number)
			println("Status: "+ResultStatus)
		}
		else if(ResultStatus=='APPROVED - SUCCESS'){
			def xpath_KTP_on_Status = replace(SLik_get_KTP_on_ResultStatus,'{PARAM}',ResultStatus)
			TestObject KTP_on_Status_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_KTP_on_Status)
			String KTP_Number = WebUI.getText(KTP_on_Status_obj, FailureHandling.STOP_ON_FAILURE)
			println("KTP: "+KTP_Number)
			println("Status: "+ResultStatus)
		}
		else{
			def xpath_KTP_on_Status = replace(SLik_get_KTP_on_ResultStatus,'{PARAM}',ResultStatus)
			TestObject KTP_on_Status_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_KTP_on_Status)
			String KTP_Number = WebUI.getText(KTP_on_Status_obj, FailureHandling.STOP_ON_FAILURE)
			println("KTP: "+KTP_Number)
			println("Status: "+ResultStatus)
		}
		this.Result_Status=ResultStatus
	}

	@And("Verify Search Result Based on Created Date")
	def Verify_date(){
		TestObject new_getDate = new TestObject().addProperty('xpath',ConditionType.EQUALS, Slik_Get_Result_Date)
		WebUI.verifyElementPresent(new_getDate, 5, FailureHandling.STOP_ON_FAILURE)
		String Get_Date_Obj = WebUI.getText(new_getDate, FailureHandling.STOP_ON_FAILURE)
		println("Created Date: "+Get_Date_Obj)
		if(Get_Date_Obj>=Date_Start && Get_Date_Obj<=Date_End){
			println("Created Date is Valid")
		}
		else{
			System.err.&println("Created Date is Out Of Range!!!!!")
			System.err.&println("Process is Aborted!!!")
			System.exit(0)
		}
	}

	@And("Verify Search Result data")
	def Slik_Verify_Result() {
		//VERIFY KTP NUMBER
		println (ClaimStatus + "<<<<<<INI ")
		def xpath_verify_text = replace(Slik_Search_Name, '{PARAM}', KtpNum1)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		WebUI.scrollToElement(new_obj, 30)
		//VERIFY DATE
		def xpath_verify_text1 = replace(Slik_Search_Date, '{PARAM}', KtpNum1)
		TestObject new_obj1 = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text1)
		WebUI.verifyElementPresent(new_obj1, 3)
		//VERIFY STATUS
		def xpath_verify_text2 = replace(Slik_Search_Status, '{PARAM}', KtpNum1)
		TestObject new_obj2 = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text2)
		if (ClaimStatus == ""){
			WebUI.verifyElementPresent(new_obj2, 3)
		}else if (ClaimStatus == "REQUESTED"){
			WebUI.verifyElementText(new_obj2, "REQUESTED -")
		}else if (ClaimStatus == "APPROVED"){
			WebUI.verifyElementText(new_obj2, "APPROVED - FAILED", FailureHandling.OPTIONAL) || WebUI.verifyElementText(new_obj2, "APPROVED - SUCCESS", FailureHandling.OPTIONAL) || WebUI.verifyElementText(new_obj2, "APPROVED -", FailureHandling.OPTIONAL)
		}else if (ClaimStatus == "NOT_APPROVED"){
			WebUI.verifyElementText(new_obj2, "NOT_APPROVED -")
		}else if(ClaimStatus=="SUCCESS"){
			WebUI.verifyElementText(new_obj2, "SUCCESS")
		}else if(ClaimStatus=="FAILED"){
			WebUI.verifyElementText(new_obj2, "FAILED")
		}
	}

	@And("Verify Search Result data with DB")
	def Verify_data_with_DB(){
		println (ClaimStatus + "<<<<<<This is Status ")
		String stmt = "SELECT * FROM SLIK_DATA_CUSTOMER WHERE STATUS="+"'"+ClaimStatus+"'"+ "AND TYPE="+"'"+Type+"'"+" AND IS_EXPIRED='N'"
		def exec_quer = CustomKeywords.'Conn_DB.slik_Check'(stmt)
	}

	@And("Click View Detail Link")
	def Slik_Verify_Detail() {
		println(Result_Status)
		//		def xpath_getstatus = replace(Slik_Search_Status,'{PARAM}', KtpNum1)
		//		TestObject getstatus_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_getstatus)
		//		String getText_status = WebUI.getText(getstatus_obj, FailureHandling.STOP_ON_FAILURE)
		//		println(getText_status)
		if(Result_Status=='APPROVED - SUCCESS' || Result_Status=='SUCCESS'){
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, Slik_View_Detail)
			WebUI.verifyElementPresent(new_obj, 3)
			WebUI.click(new_obj)
		}
		else{
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, Slik_View_Detail)
			WebUI.verifyElementNotPresent(new_obj, 3)
			System.err.&println('View Detail does not show because staus is not APPROVED-SUCCESS')
		}
		this.ClaimStatus=Result_Status

	}

	@And("Verify Slik Result Detail Link")
	def Slik_Verify_Detail_Result() {
		if(ClaimStatus=='APPROVED - SUCCESS'|| ClaimStatus=='SUCCESS'){
			def xpath_verify_text = replace(IST_Slik_Text, '{PARAM}', 'SLIK Result Detail')
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
			WebUI.scrollToElement(new_obj, 3)
			WebUI.verifyElementPresent(new_obj, 3)
			println("SLIK Result Detail is Available")
			def xpath_verify_text1 = replace(IST_Slik_Text, '{PARAM}', 'Customer Data')
			TestObject new_obj1 = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text1)
			WebUI.scrollToElement(new_obj1, 3)
			WebUI.verifyElementPresent(new_obj1, 3)
			println("Customer Data is Available")
			def xpath_verify_text2 = replace(IST_Slik_Text, '{PARAM}', 'Data Pokok Debitur')
			TestObject new_obj2 = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text2)
			WebUI.scrollToElement(new_obj2, 3)
			WebUI.verifyElementPresent(new_obj2, 3)
			println("Data Pokok Debitur is Available")
			def xpath_verify_text3 = replace(IST_Slik_Text, '{PARAM}', 'Ringkasan Fasilitas')
			TestObject new_obj3 = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text3)
			WebUI.scrollToElement(new_obj3, 3)
			WebUI.verifyElementPresent(new_obj3, 3)
			println("Ringkasan Fasilitas is Available")
			def xpath_verify_text4 = replace(IST_Slik_Text, '{PARAM}', 'Kredit / Pembiayaan')
			TestObject new_obj4 = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text4)
			WebUI.scrollToElement(new_obj4, 3)
			WebUI.verifyElementPresent(new_obj4, 3)
			println("Kredit/Pembiayaan is Available")
		}
		else{
			System.err.&println("Detail is not available")
		}

	}

	//SLIK APPROVAL NON CUSTOMER
	@And("Search Waiting Approval by KTP Number \"([^\"]*)\"")
	def Slik_App_Ktp(String value) {
		def xpath_verify_text = replace(IST_Slik_Approval_Ktp, '{PARAM}', value)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		WebUI.setText(new_obj, value)
		this.KtpNum1 = value
	}

	@And("Select Waiting Approval Status is \"([^\"]*)\"")
	def Slik_Status2(String value) {
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, IST_Status_Box1)
		WebUI.selectOptionByValue(new_obj, value, true)
	}

	@And("Verify Waiting Approval Search Result Table")
	def Slik_Status3() {
		def xpath_verify_text = replace(Slik_Search_Ktp1, '{PARAM}', KtpNum1)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		def xpath_verify_text1 = replace(Slik_Search_Name1, '{PARAM}', KtpNum1)
		TestObject new_obj1 = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text1)
		WebUI.verifyElementPresent(new_obj, 3)
		WebUI.verifyElementPresent(new_obj1, 3)
	}

	@And("Verify Link KTP Document")
	def Slik_Ktp_Doc() {
		def xpath_verify_text = replace(Slik_Ktp_Doc, '{PARAM}', KtpNum1)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		WebUI.verifyElementPresent(new_obj, 3)
		WebUI.click(new_obj)
	}

	@And("Checklist Validate Box")
	def Slik_Validate() {
		def xpath_verify_text = replace(Slik_App_Validate, '{PARAM}', KtpNum1)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		WebUI.verifyElementPresent(new_obj, 3)
		WebUI.click(new_obj)
	}

	@And("Verify Surat Pernyataan")
	def Slik_Pernyataan() {
		def xpath_verify_text = replace(IST_Slik_Text, '{PARAM}', 'Pernyataan')
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		WebUI.verifyElementPresent(new_obj, 3)
		TestObject new_obj1 = new TestObject().addProperty('xpath',ConditionType.EQUALS, Checklist)
		WebUI.click(new_obj1)
	}

	@And("Verify Contents of Check SLIK Label in SLIK Gateway Customer Menu Exist")
	def Verify_content_Check_SLIK(){
		//Verify Text
		for(int i=0;i < GlobalVariable.Check_SLIK_Contents_SLIK_Getway_Customer.size();i++){
			def new_xpath = replace(IST_Slik_Text,'{PARAM}',GlobalVariable.Check_SLIK_Contents_SLIK_Getway_Customer[i])
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_xpath)
			WebUI.verifyElementPresent(new_obj, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_obj, FailureHandling.STOP_ON_FAILURE)
		}
		//Verify Radiobutton
		def CheckpointRadiobutton = [
			"Laki-laki",
			"Perempuan"
		]
		for(int i=0;i<CheckpointRadiobutton.size();i++){
			def new_radiobutton = replace(IST_Radio_Button,'{PARAM}',CheckpointRadiobutton[i])
			TestObject new_radbutton = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_radiobutton)
			WebUI.verifyElementPresent(new_radbutton, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_radbutton, FailureHandling.STOP_ON_FAILURE)
		}
		//Verify Input
		for(int i=0;i < GlobalVariable.Check_SLIK_Input_SLIK_Getway_Customer.size();i++){
			def new_xpath = replace(IST_Slik_Check_Input,'{PARAM}',GlobalVariable.Check_SLIK_Input_SLIK_Getway_Customer[i])
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_xpath)
			WebUI.verifyElementPresent(new_obj, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_obj, FailureHandling.STOP_ON_FAILURE)
		}
		//Verify Date of Birth
		String DOBinput = "//span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='Date of Birth *']/../following-sibling::td[1]/span/input"
		TestObject new_obj_DOB = new TestObject().addProperty('xpath',ConditionType.EQUALS, DOBinput)
		WebUI.verifyElementPresent(new_obj_DOB, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_obj_DOB, FailureHandling.STOP_ON_FAILURE)

		//Verify Select
		TestObject new_obj_select = new TestObject().addProperty('xpath',ConditionType.EQUALS, IST_Combo_Box)
		WebUI.verifyElementPresent(new_obj_select, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_obj_select, FailureHandling.STOP_ON_FAILURE)

		//Verify Textarea KTP Address
		TestObject new_obj_textarea = new TestObject().addProperty('xpath',ConditionType.EQUALS, IST_Slik_Address)
		WebUI.verifyElementPresent(new_obj_textarea, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.focus(new_obj_textarea, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)

		//Verify Button
		def ButtonCheckSLIK=[
			"Cancel",
			"Check SLIK"
		]
		for(int i=0;i<ButtonCheckSLIK.size();i++){
			def new_button = replace(IST_General_Button,'{PARAM}',ButtonCheckSLIK[i])
			TestObject new_BUTTON = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_button)
			WebUI.verifyElementPresent(new_BUTTON, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_BUTTON, FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("Verify Contents of Check SLIK Label in SLIK Gateway Non Customer Menu Exist")
	def Verify_content_Check_SLIK_Non_Customer(){
		//Verify Text
		for(int i=0;i < GlobalVariable.Check_SLIK_Label_Non_Customer.size() ;i++){
			def new_xpath = replace(IST_Slik_Text,'{PARAM}',GlobalVariable.Check_SLIK_Label_Non_Customer[i])
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_xpath)
			WebUI.verifyElementPresent(new_obj, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_obj, FailureHandling.STOP_ON_FAILURE)
		}
		//Verify Radiobutton
		def CheckpointRadiobutton = [
			"Laki-laki",
			"Perempuan"
		]
		for(int i=0;i<CheckpointRadiobutton.size();i++){
			def new_radiobutton = replace(IST_Radio_Button,'{PARAM}',CheckpointRadiobutton[i])
			TestObject new_radbutton = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_radiobutton)
			WebUI.verifyElementPresent(new_radbutton, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_radbutton, FailureHandling.STOP_ON_FAILURE)
		}
		//Verify Input
		for(int i=0;i < GlobalVariable.Check_SLIK_Input_Non_Customer.size() ;i++){
			def new_xpath = replace(IST_Slik_Check_Input,'{PARAM}',GlobalVariable.Check_SLIK_Input_Non_Customer[i])
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_xpath)
			WebUI.verifyElementPresent(new_obj, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_obj, FailureHandling.STOP_ON_FAILURE)
		}
		//Verify Date of Birth
		String DOBinput = "//span[text()='Check SLIK']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='Date of Birth *']/../following-sibling::td[1]/span/input"
		TestObject new_obj_DOB = new TestObject().addProperty('xpath',ConditionType.EQUALS, DOBinput)
		WebUI.verifyElementPresent(new_obj_DOB, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_obj_DOB, FailureHandling.STOP_ON_FAILURE)

		//Verify Select
		TestObject new_obj_select = new TestObject().addProperty('xpath',ConditionType.EQUALS, IST_Combo_Box)
		WebUI.verifyElementPresent(new_obj_select, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_obj_select, FailureHandling.STOP_ON_FAILURE)

		//Verify Textarea KTP Address
		TestObject new_obj_textarea = new TestObject().addProperty('xpath',ConditionType.EQUALS, IST_Slik_Address)
		WebUI.verifyElementPresent(new_obj_textarea, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)
		WebUI.focus(new_obj_textarea, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(3)

		//Verify Button
		def ButtonCheckSLIK=[
			"Upload",
			"Cancel",
			"Check SLIK"
		]
		for(int i=0;i<ButtonCheckSLIK.size();i++){
			def new_button = replace(IST_General_Button,'{PARAM}',ButtonCheckSLIK[i])
			TestObject new_BUTTON = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_button)
			WebUI.verifyElementPresent(new_BUTTON, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_BUTTON, FailureHandling.STOP_ON_FAILURE)
		}
	}

	@And("Verify Contents of Search Result")
	def Verify_contect_search_result(){
		//Verify Text or label
		for(int i=0;i < GlobalVariable.Search_Result_Content.size();i++){
			def new_xpath = replace(IST_Slik_Text,'{PARAM}',GlobalVariable.Search_Result_Content[i])
			TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_xpath)
			WebUI.verifyElementPresent(new_obj, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_obj, FailureHandling.STOP_ON_FAILURE)
		}
		//Verify Input KTP Number
		def new_xpath_KTP_Num = replace(IST_Slik_Search_Input,'{PARAM}','KTP Number')
		TestObject new_obj_KTP_Num = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_xpath_KTP_Num)
		WebUI.verifyElementPresent(new_obj_KTP_Num, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_obj_KTP_Num, FailureHandling.STOP_ON_FAILURE)

		//Verify Input date
		def Search_Result_Date = [
			'Date Start',
			'Date End'
		]
		for(int i=0;i<Search_Result_Date.size();i++){
			String xpath_date = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='borderless z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='{PARAM}']/../following-sibling::td[1]/span/input"
			def new_xpath_Date = replace(xpath_date,'{PARAM}',Search_Result_Date[i])
			TestObject new_obj_Date = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_xpath_Date)
			WebUI.verifyElementPresent(new_obj_Date, 30, FailureHandling.STOP_ON_FAILURE)
			WebUI.focus(new_obj_Date, FailureHandling.STOP_ON_FAILURE)
		}
		//Verify select
		String xpath_select_status = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='borderless z-grid']/div[@class='z-grid-body']/table/tbody/tr/td/span[text()='Status']/../following-sibling::td[1]/select"
		TestObject new_obj_Status = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_select_status)
		WebUI.verifyElementPresent(new_obj_Status, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_obj_Status, FailureHandling.STOP_ON_FAILURE)

		//Verify Button
		def new_button = replace(IST_General_Button,'{PARAM}','Search')
		TestObject new_BUTTON = new TestObject().addProperty('xpath',ConditionType.EQUALS, new_button)
		WebUI.verifyElementPresent(new_BUTTON, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_BUTTON, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("TESTING XPATH")
	def I_verify_the_status_in_step() {
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, ListTable)
		WebUI.scrollToElement(new_obj, 2)
		WebDriver driver = DriverFactory.getWebDriver()
		int RowCount = driver.findElements(By.xpath(ListTable)).size()
		println (RowCount)
		if (ClaimStatus == ""){
			println ('TOTAL ROW = ' +RowCount)
			//WebUI.verifyElementPresent(new_obj2, 3)
		}else if (ClaimStatus == "REQUESTED"){
			for(int i=1;i<=RowCount();i++){
				String VerListStat = "//span[text()='Search Result']/../../../following-sibling::div[@class='z-groupbox-content']/div[@class='z-grid']/div[@class='z-grid-body']/table/tbody/tr[contains(@class,'z-row')]/td[5]/div/span"
				TestObject xpath_ver = new TestObject().addProperty('xpath',ConditionType.EQUALS, VerListStat)
				println (xpath_ver)
				WebUI.verifyElementText(xpath_ver, "REQUESTED -") || WebUI.verifyElementText(xpath_ver, "APPROVED -")
			}/*else if (ClaimStatus == "APPROVED"){
			 //WebUI.verifyElementText(new_obj2, "APPROVED - FAILED") || WebUI.verifyElementText(new_obj2, "APPROVED - SUCCESS")
			 }else if (ClaimStatus == "NOT_APPROVED"){
			 //WebUI.verifyElementText(new_obj2, "NOT_APPROVED -")
			 }*/
		}
	}
	@And("Check Sign in as")
	def CheckSigninas(){
		TestObject new_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[text()='Logout']/../../../../../../../../../preceding-sibling::td/div/div/table/tbody/tr/td/table/tbody/tr/td/span")
		String get_text=WebUI.getText(new_object)
		String user = get_text.substring(11)
		println("Sign in as: "+user)
		this.Checker=user
	}
	@And("Read CSV File \"([^\"]*)\"")
	def ReadCSVFile(String value){
		String path = System.getProperty("user.dir");
		println(path)
		String FilePath = path+"/"+value
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		br = new BufferedReader(new FileReader(FilePath));
		def arrayKTP = [];
		def arrayGender = [];
		try {

			//						br = new BufferedReader(new FileReader(FilePath));
			line=br.readLine()
			while ((line = br.readLine()) != null) {
				// use comma as separator
				String [] content = line.split(cvsSplitBy);
				arrayKTP.add(content[2])
				arrayGender.add(content[4])
				String query = "SELECT * FROM SLIK_DATA_CUSTOMER WHERE REFF_CODE="+"'"+content[0]+"'"+" AND NAME="+"'"+content[1]+"'"+" AND KTP="+"'"+content[2]+"'"+" AND DOB="+"'"+content[3]+"'"+" AND GENDER="+"'"+content[4]+"'"
				try {
					def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
				} catch (ClassNotFoundException e)
				{
					println e.printStackTrace()
				}
				def url= GlobalVariable.DB_URL
				def username = GlobalVariable.DB_Username
				def password = GlobalVariable.DB_Pass
				def sql = Sql.newInstance(url, username, password)
				try {
					println(query)
					//								sql.execute(query)
					sql.eachRow(query){ row ->
						println row.KTP
						String ktp_bulk = "${row.KTP}"
						assert ktp_bulk == content[2]
					}
				}finally {
					sql.close()
				}
			}
			println(arrayKTP)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@And("Connect to DB Table SLIK_CHECKER")
	def DB_Table_SLIK_Checker(){

		//		def exec_quer =CustomKeywords.'Conn_DB.DB_Table_SLIK_Checker'(stmt)
		Connection connection = null
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
			def url= GlobalVariable.DB_URL
			def username = GlobalVariable.DB_Username
			def password =GlobalVariable.DB_Pass
			//def sql = Sql.newInstance(url, username, password)
			connection = DriverManager.getConnection(url,username,password)
			println("Connected database successfully")
		}catch(ClassNotFoundException e){
			println("Can't connect to database")
		}
		try{
			String stmt = "SELECT DISTINCT MAKER_USERNAME,CHECKER_USERNAME,SLIK_DATA_CUSTOMER.KTP FROM SLIK_CHECKER LEFT JOIN SLIK_DATA_CUSTOMER ON SLIK_CHECKER.MAKER_USERNAME=SLIK_DATA_CUSTOMER.CREATED_BY WHERE CHECKER_USERNAME="+"'"+Checker+"'"+" AND SLIK_DATA_CUSTOMER.TYPE='NC' AND SLIK_DATA_CUSTOMER.IS_EXPIRED='N' AND SLIK_DATA_CUSTOMER.KTP="+"'"+GlobalVariable.KTPnum_Non_Customer+"'"
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery(stmt);
			println(stmt)

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				String data = results.getString("KTP")
				String dataMaker = results.getString("MAKER_USERNAME")
				String dataChecker = results.getString("CHECKER_USERNAME")
				println("KTP: " + data)
				println("Checker: " + dataMaker)
				println("Maker: " + dataChecker)
				TestObject new_obj_ktp = new TestObject().addProperty('xpath',ConditionType.EQUALS, "//div[@class='z-column-content' and text()='KTP Number']/../../../../../following-sibling::div/following-sibling::div/table/tbody/tr/td[2]/div/span")
				String getKTP = WebUI.getText(new_obj_ktp)
				assert data==getKTP : "KTP Number"
			}
		}catch(Exception e)
		{
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}
	@And("Verify Table Result Exist")
	def VerifyTableExist(){
		def Table_Result = "//div[@class='z-grid']"
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, Table_Result)
		WebUI.verifyElementPresent(new_obj, 5)
	}
	@And("Get Data From Table")
	def GetDataFromTable(){
		WebDriver driver = DriverFactory.getWebDriver()
		int trNum = driver.findElements(By.xpath("//div[@class='z-grid']/div[@class='z-grid-header']/following-sibling::div[@class='z-grid-body']/table/tbody[@class='z-rows']/tr")).size()
		println("Total number of rows in table: "+trNum)
		for(int i=0;i<trNum;i++){
			int count_data=i+1
			def list_of_tr = "//div[@class='z-grid']/div[@class='z-grid-header']/following-sibling::div[@class='z-grid-body']/table/tbody[@class='z-rows']/tr"+[count_data]
			TestObject new_obj_listoftr = new TestObject().addProperty('xpath', ConditionType.EQUALS, list_of_tr)
			WebUI.verifyElementPresent(new_obj_listoftr, 5, FailureHandling.STOP_ON_FAILURE)

			int count_column = driver.findElements(By.xpath(list_of_tr+"/td")).size()
			for(int j=0;j<count_column;j++){
				int count_content=j+1
				def list_of_contents = list_of_tr+"/td"+[count_content]
				TestObject new_obj_listoftd = new TestObject().addProperty('xpath', ConditionType.EQUALS, list_of_contents)
				println(WebUI.getText(new_obj_listoftd)+"\t")
			}
		}

	}
	@And("Click Checkbox Validate")
	def Checkbox_Validate(){
		def xpath_checkbox="//div[@class='z-grid']/div[@class='z-grid-header']/following-sibling::div[@class='z-grid-body']/table/tbody[@class='z-rows']/tr/td[5]/div/span/input"
		TestObject new_obj_checkbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_checkbox)
		def xpath_getKtp = "//div[@class='z-grid']/div[@class='z-grid-header']/following-sibling::div[@class='z-grid-body']/table/tbody[@class='z-rows']/tr/td[5]/div/span/input/../../../preceding-sibling::td[3]/div/span"
		TestObject new_obj_KTP = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_getKtp)
		println("Validating KTP "+WebUI.getText(new_obj_KTP))
		WebUI.click(new_obj_checkbox)
	}
	@Given("Consume Endpoint JFS Collectibility")
	def SLIKJFSColl(){
		def response = WS.sendRequest(findTestObject('SLIK_JFS'))
		WS.verifyResponseStatusCode(response, 200)
		println("Response Status Code: "+WS.getResponseStatusCode(response))
		WS.verifyElementPropertyValue(response, "col1m", 1)
		WS.verifyElementPropertyValue(response, "message", "found")
		WS.verifyElementPropertyValue(response, "status", "success")
		println(response.getResponseBodyContent())
		//		println(body)
		//		def arrayResponse=[]
	}
	@And("Search KTP Number in SLIK Gateway Customer")
	def SLIKJFS_SearchKTP(){
		def xpath_invoice_amount = replace(IST_Slik_Search_Input, '{PARAM}', "KTP Number")
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
		WebUI.scrollToElement(new_obj, 3)
		WebUI.setText(new_obj, "1871025401550001")
	}
	@And("Verify KTP Result with Request Body")
	def SLIKJFS_verifyKTPNumber(){
		def xpath_verify_text = replace(Slik_Search_Ktp, '{PARAM}', "1871025401550001")
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		def verifyElementKTP = WebUI.verifyElementPresent(new_obj, 3, FailureHandling.OPTIONAL)
		if(verifyElementKTP==true){
			//			this.KtpNum1 = GlobalVariable.KTPnum_Customer
			println("KTP Number Found")
		}
		else{
			System.err.&println("Data KTP not Found!!!")
			//			System.exit(0)
		}
	}
	@And("Click Checkbox Saya Setuju")
	def Checkbox_sayasetuju(){
		def xpath_checkbox = "//span[text()='Pernyataan']/../../../following-sibling::div/div[3]/div[3]/table/tbody/tr/td/span/label[text()=' Saya Setuju']/preceding-sibling::input[@type='checkbox']"
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_checkbox)
		WebUI.verifyElementPresent(new_obj, 5)
		WebUI.click(new_obj)
	}

	@And("Take Screenshot \"([^\"]*)\"")
	def takescreenshot(String value){
		String getDirectory = System.getProperty("user.dir");
		String screenshotLocation = getDirectory+"/img"
		println(screenshotLocation)
		WebUI.takeScreenshot(screenshotLocation+"/"+value)
	}
}