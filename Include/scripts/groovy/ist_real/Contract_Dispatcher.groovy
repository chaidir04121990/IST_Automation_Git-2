package ist_real
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.kms.katalon.core.testdata.DBData
import com.kms.katalon.core.testdata.InternalData
import java.util.Date

import internal.GlobalVariable
import io.cucumber.datatable.DataTable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import bsh.This

import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.stringtemplate.v4.compiler.STParser.element_return
import org.stringtemplate.v4.compiler.STParser.ifstat_return
import org.openqa.selenium.WebDriver
import org.codehaus.groovy.control.customizers.builder.ImportCustomizerFactory
import org.openqa.selenium.By
import org.openqa.selenium.Keys

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

import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import javax.swing.JComponent
import java.util.Scanner
import java.sql.*;
import groovy.sql.Sql
import java.io.BufferedReader
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import mypackage.MySelectors
import db_package.Demo_DB
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.remote.CapabilityType
import ist_real.Login_IST

public class Contract_Dispatcher {
	//	@Given("Call Login feature")
	//		def Calling_login_feature(){
	//			CucumberKW.runFeatureFile('Include/features/IST_Real/Login.feature')
	//		}

	//Variable Xpath
	String IST_Tbl_Consists_Contract_Number = "//tbody[@class='z-rows']/tr/td/div/span[text()='{PARAM}']"
	String IST_Sub_Menu = "//span[contains(text(),'{PARAM1}')]/preceding-sibling::span/i[@class='z-icon-caret-down z-tree-open']/../../../../following-sibling::tr/td/div/span[contains(text(),'{PARAM2}')]"
	String IST_Menu_Title = '//span[text()="{PARAM}"]'
	String IST_General_Menu = "//span[contains(text(),'{PARAM}')]"
	String IST_General_Radiobutton = "//span[text()='{PARAM}']/../../preceding-sibling::td//input[@type='radio']"
	String IST_General_Radiobutton_TRIS = "//span[contains(text(),'{PARAM}')]/../preceding-sibling::td//input[@type='radio']"
	String IST_General_text_TRIS = "//div[text()='{PARAM}']/../../../../../following-sibling::div/following-sibling::div/table/tbody/tr/td/div/input[@type='text']"
	//	String IST_General_Button = "//Button[contains(text(),'{PARAM}')]"
	String IST_General_Button = "//Button[text()='{PARAM}']"
	String IST_General_Textbox='//input[@placeholder="{PARAM}"]'
	String IST_General_Notif = '//span[contains(text(),"{PARAM}")]'
	String IST_General_Popup_message = '//div[contains(text(),"{PARAM}")]/following-sibling::div/table/tbody/tr/td/table/tbody/tr/td[5]/div/span[contains(text(),"{PARAM1}")]'
	String IST_General_editLinks = "//td/div/span[text()='{PARAM}']/../../following-sibling::td/div/a[contains(text(),'edit')]"
	//	String IST_General_Checkbox = "//span[contains(text(),'{PARAM}') and @class='z-label']/../../preceding-sibling::td//input[@type='checkbox']"
	String IST_General_Checkbox = "//span[text()='{PARAM}' and @class='z-label']/../../preceding-sibling::td//input[@type='checkbox']"
	String IST_General_Checkbox_Repeat = "//tbody[@class='z-rows']/tr/td[11]/div/span[not(contains(text(),'CORRECTED'))]/../../preceding-sibling::td[1]//input[@type='checkbox']"
	String IST_General_Checkbox_All = "//div[contains(text(),'{PARAM}')]/../preceding-sibling::th/div/span/input[@type='checkbox']"
	String IST_General_Checkbox_uncheck = "//input[@type='checkbox' and not(contains(@checked,'checked'))]"
	String IST_Corrected_Checkbox = "//div[@style='overflow: auto; width: 1156px;']/table/tbody/tr/td/div/span[text()=,'{PARAM}')]/../../../following-sibling::td[4]/div/span/input[@type='checkbox']"
	String IST_Delete_Button_ManagCity = "//span[contains(text(),'{PARAM}')]/../../following-sibling::td/div/div/button[@class='btn-default btn' and @title='Delete City']"
	String IST_Delete_Button_ManagUser = "//span[contains(text(),'{PARAM}')]/../../following-sibling::td/div/div/button[@class='btn-default btn' and @title='Delete User']"
	String IST_Edit_Button_ManagUser = "//span[contains(text(),'{PARAM}')]/../../following-sibling::td/div/div/button[@class='btn-default btn' and @title='Edit User']"
	String IST_SubMenu_ContractDispatcherAdmin = "//div/span[contains(text(),'Contract Dispatcher Admin')]/../../../following-sibling::tr/td/div/span[contains(text(),'{PARAM}')]"
	String IST_Dropdown_general = "//span[contains(text(),'{PARAM}')]/../following-sibling::select"
	String IST_Dropdown_MistakeName = "//td[@style='text-align:left;' and @class='z-row-inner']/div/span[contains(text(),'{PARAM}')]/../../following-sibling::td/div/select"
	String IST_Dropdown_DataInvoiceDetail = "//span[text()='{PARAM}']/../../following-sibling::td[1]/div/select"
	String IST_Dropdown_MistakeInvoiceDetail_2 = "//span[text()='{PARAM}']/../../following-sibling::td[2]/div/select"
	String IST_Dropdown_option = "//select/option[contains(text(),'{PARAM}')]"
	String IST_Dropdown_inTable = "//tr/td/span[contains(text(),'{PARAM}')]/../following-sibling::td/select"
	String IST_Dropdown_Role_Management = "//div[text()='Username']/../following-sibling::div/div/div/select"
	String IST_Input_DataInvoiceDetail = "//span[text()='{PARAM}']/../../following-sibling::td[1]/div/input"
	String IST_Input_date_InvoiceDetail = "//span[text()='Invoice date']/../../following-sibling::td[1]/div/span/input"
	String IST_Add_Success = '//span[contains(text(),"Add Success")]'
	String IST_Delete_Success = '//span[contains(text(),"Delete Success")]'
	String IST_Update_Success = '//span[contains(text(),"Update Success")]'
	String IST_Dropdown_MistakeCorr = "//span[contains(text(),'{PARAM}') and @class='z-label']/../../following-sibling::td//select"
	String IST_Textarea_Invoice_Detail = "//span[text()='{PARAM}']/../../following-sibling::td[3]/div/textarea"
	String IST_Textarea_not_Disabled = "//textarea[not(@disabled)]"
	String IST_Textarea_Disabled = "//textarea[@disabled]"
	String IST_notebefore_Mistake = "//td[@style='text-align:left;' and @class='z-row-inner']/div/span[contains(text(),'{PARAM}')]/../../following-sibling::td/div[1]/textarea[@class='z-textbox']"
	String IST_noteafter_Mistake = "//td[@style='text-align:left;' and @class='z-row-inner']/div/span[contains(text(),'{PARAM}')]/../../following-sibling::td[3]/div[1]/textarea[@class='z-textbox']"
	String IST_Checkbox_POS = "//span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Verify_TableEmpty = "//td[@style='display: table-cell;' and contains(text(),'-Empty-')]"
	String IST_Verify_TableFilled = "//td[@style='display:none' and contains(text(),'-Empty-')]"
	String IST_verify_bulk_table = "//div[@class='z-row-content']/span[@class='z-label']"
	String IST_Arrow_Menu = "//span[contains(text(),'{PARAM}')]/preceding-sibling::span/i[@class='z-icon-caret-right z-tree-close']"
	String IST_Chkbox_Assignment_POS = "//div/span/span[contains(text(),'Contract Type POS')]/../following-sibling::span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_POS_2 = "//div/span/span[contains(text(),'Contract Type POS')]/../../following-sibling::div[1]/span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_POS_3 = "//div/span/span[contains(text(),'Contract Type POS')]/../../following-sibling::div[2]/span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_MPF = "//div/span/span[contains(text(),'Contract Type MPF')]/../following-sibling::span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_MPF_2 = "//div/span/span[contains(text(),'Contract Type MPF')]/../../following-sibling::div[1]/span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_Online = "//div/span/span[contains(text(),'Contract Type Online')]/../following-sibling::span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_Online_2 = "//div/span/span[contains(text(),'Contract Type Online')]/../../following-sibling::div[1]/span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_Online_3 = "//div/span/span[contains(text(),'Contract Type Online')]/../../following-sibling::div[2]/span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_Credit_Card = "//div/span/span[contains(text(),'Contract Type Credit Card')]/../following-sibling::span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Assignment_Mistake_Correction = "//div/span/span[contains(text(),'Mistake Correction')]/../following-sibling::span/label[text()='{PARAM}']/preceding-sibling::input[@type='checkbox']"
	String IST_Chkbox_Role_Management ="//label[text()='{PARAM}']/preceding-sibling::input"
	String IST_Tab_Contract_Dispatcher = "//span[@class='z-tab-text' and contains(text(),'{PARAM}')]"
	String IST_Doc_tbl_TW_Hardcopy_Journey ="//tbody//tr/td/span[text()='{PARAM1}']/../../../tr/td/div/span[contains(text(),'{PARAM}')]/../../following-sibling::td/div/span/input[@type='checkbox']"
	String IST_General_Invoice_Summary = "//span[contains(text(),'{PARAM}') and @class='z-label']"
	String IST_InvoiceSum_InvDate = "//span[(text()='{PARAM}')]/../../following-sibling::td[1]/div/span"
	String IST_InvoiceSum_Amount = "//span[(text()='{PARAM}')]/../../following-sibling::td[2]/div/span"
	String IST_InvoiceSum_CheckingResult = "//span[(text()='{PARAM}')]/../../following-sibling::td[3]/div/span"
	String IST_InvoiceSum_User = "//span[(text()='{PARAM}')]/../../following-sibling::td[4]/div/span"
	String IST_InvoiceSum_File = "//span[(text()='{PARAM}')]/../../following-sibling::td[5]*/div/div/button/span"
	String IST_Invoice_CorrectedCheck = "//span[(text()='{PARAM}')]/../../following-sibling::td[4]/div/span/input[@type='checkbox']"
	String IST_Mistake_Remark_Disable = "//span[text()='{PARAM}']/../../following-sibling::td[3]/div/textarea"
	String IST_Input_Correction_Remark = "//span[text()='{PARAM}']/../../following-sibling::td[5]/div/textarea"
	String IST_Repeated_Mistake = "//span[(text()='{PARAM}')]/../../following-sibling::td[6]/div/span/input[@type='checkbox']"
	String IST_Pop_Up_Message_Error = "//div[@class='z-messagebox-icon z-messagebox-error z-div']"
	String IST_ADD_DETAIL = "//span[text()='Additional Detail']/../../../following-sibling::div[@class='z-groupbox-content']/div/div[@class='z-grid-body']/table/tbody/tr/td/div/span[contains(text(),'{PARAM}')]/../../following-sibling::td"
	String IST_General_Radiobutton_Contract_Dispatcher = "//span[text()='{PARAM}']/../../preceding-sibling::td//input[@type='radio']and @value='{PARAM1}']"
	String IST_General_Radiobutton_Check = "//span[text()='{PARAM}']/../../preceding-sibling::td[1]/div/span[text()='{PARAM1}']/../../preceding-sibling::td//input[@type='radio']"
	String IST_Contract_Dispatcher_Check = "//span[contains(text(),'{PARAM}')]/../../following-sibling::td[1]/div/span[contains(text(),'{PARAM1}')]"



	//VARIABLE
	String ContractNumber
	String SubContractNumber
	String InSumDate
	String InSumAmount
	String InSumCheckResult
	String InSumUser
	String InSumSellerName
	String InSumPurpose
	String InSumFile
	String DateUpdate
	String InvcFormat
	String TypeContract
	String Tippers_ID
	String Tippers_Dispatcher_Source_ID
	String Menu

	ChromeOptions options = new ChromeOptions();
	String ProjectDirectory=RunConfiguration.getProjectDir()
	String downloadPath = ProjectDirectory+"/Download"
	Map<String, Object> chromePrefs = new HashMap<String, Object>()
	DesiredCapabilities cap = DesiredCapabilities.chrome()





	@And("Select Menu Contract Dispatcher")
	def MenuContractDispatcher(){
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_/span_Contract Dispatcher'), 30)
		WebUI.click(findTestObject('Object Repository/Page_/span_Contract Dispatcher'))

	}

	@And('Verify Menu \"([^\"]*)\" Exists')
	def VerifyMenu(String value){
		def xpath_span_menu = replace(IST_General_Menu, "{PARAM}", value)
		TestObject new_main_menu = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_span_menu)
		WebUI.waitForElementPresent(new_main_menu, 30)
		WebUI.verifyElementPresent(new_main_menu, 10, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_main_menu, FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForPageLoad(30)
	}

	@And('Select Menu \"([^\"]*)\"')
	def SelectMenu(String value){
		WebUI.takeScreenshot(downloadPath+"/Menu"+value+".png")
		def xpath_span_menu = replace(IST_General_Menu, "{PARAM}", value)
		TestObject new_main_menu = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_span_menu)
		WebUI.waitForElementPresent(new_main_menu, 30)
		WebUI.click(new_main_menu)
		WebUI.waitForPageLoad(30)
		this.Menu=value
	}
	def Menut(){
		//		String Menn = Menu
		//		TestObject new_main_menu = new TestObject().addProperty('string', ConditionType.EQUALS, Menn)
		print(Menu)
	}
	//	@And('Select data from DB data')
	//	def Select_fromDB(){
	//		InternalData data = findTestData('Data Files/Coba_DB_BPKB')
	//		for(def index : (0..data.getRowNumbers()-1)) {
	//
	//		}
	//	}

	@And('Connect to database')
	def ConnectDB(){

	}

	def replace(String x,oldc,newc){
		String str =  new String(x)
		return str.replace(oldc, newc)
		return str
	}

	@And('Select Submenu \"([^\"]*)\" From Menu \"([^\"]*)\"')
	def selectSubmenu(String value1, String value2){
		def xpath_new = replace(IST_Sub_Menu, '{PARAM1}', value2)
		def xpath_new_new = replace(xpath_new, '{PARAM2}', value1)
		TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new_new)
		def verify_element_present = WebUI.verifyElementPresent(xpath_obj, 30, FailureHandling.STOP_ON_FAILURE)
		if(verify_element_present==true){
			println("Submenu "+value1+" is present")
			WebUI.click(xpath_obj)
		}
		else{
			println("Submenu doesn't exist")
		}
	}

	@And('Select Contract Number Credit Card Dispatcher')
	def selectCCDispatcher(){
		def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', GlobalVariable.Contract_Number_CC_Dispatcher)
		TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
		def verify_contract_present = WebUI.verifyElementPresent(xpath_obj, 30, FailureHandling.OPTIONAL)
		if(verify_contract_present==true){
			WebUI.click(xpath_obj)
		}
		else{
			WebUI.comment("Contract number doesn't exist")
		}
	}

	@And('Select Contract Number Credit Card in Contract Dispatcher Menu')
	def selectcontractCCContracctDispatcherMenu(){
		def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', GlobalVariable.Contract_Number_Dispatcher_CC)
		TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
		def verify_contract_present = WebUI.verifyElementPresent(xpath_obj, 30, FailureHandling.OPTIONAL)
		if(verify_contract_present==true){
			WebUI.click(xpath_obj)
		}
		else{
			WebUI.comment("Contract number doesn't exist")
		}
	}


	@And('Select Contract Number based on Type Contract \"([^\"]*)\"')
	def Contract_Number_based_Type_Contract(String value){
		def xpath_Menu_Title = replace(IST_Menu_Title, '{PARAM}', 'Contract Dispatcher')
		TestObject obj_menu_title = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_Menu_Title)
		WebUI.verifyElementPresent(obj_menu_title, 30, FailureHandling.STOP_ON_FAILURE)
		Date today = new Date()
		this.DateUpdate = today.format('dd-MM-yyyy')
		this.TypeContract = value
		switch (value) {
			case 'REGULAR POS':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", '')
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', value)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
					WebUI.verifyElementChecked(xpath_obj, 30, FailureHandling.STOP_ON_FAILURE)
					def gettext = WebUI.getText(new_contract_check, FailureHandling.STOP_ON_FAILURE)
					println(gettext)
				}
				else{
					System.err.&println("Contract number doesn't exist")
				}
				break
			case 'PAPERLESS POS':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", '')
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', value)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
					WebUI.verifyElementChecked(xpath_obj, 30, FailureHandling.STOP_ON_FAILURE)
				}
				else{
					System.err.&println("Contract number doesn't exist")
				}
				break
			case 'TWO_WHEELERS':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", GlobalVariable.Contract_Number_for_Two_Wheelers)
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', GlobalVariable.Contract_Number_for_Two_Wheelers)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
					WebUI.verifyElementChecked(xpath_obj, 30, FailureHandling.STOP_ON_FAILURE)
				}
				else{
					System.err.&println("Contract number doesn't exist")
				}
				break
			case 'BPKB':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", GlobalVariable.Contract_Number_Dispatcher_BPKB)
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', GlobalVariable.Contract_Number_Dispatcher_BPKB)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
				}
				else{
					System.err.&println("Contract number doesn't exist")
				}
				break
			case 'Credit Card':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", GlobalVariable.Contract_Number_Dispatcher_CC)
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', GlobalVariable.Contract_Number_Dispatcher_CC)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
				}
				else{
					System.err.&println("Contract number doesn't exist")
				}
				break
			case 'DONA_BLIBLI':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", GlobalVariable.Contract_Number_Dispatcher_Dona_BliBli)
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', GlobalVariable.Contract_Number_Dispatcher_Dona_BliBli)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
				}
				else{
					System.err.&println("Contract number doesn't exist")
				}
				break
			case 'DONA_BUKALAPAK_B2B':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", GlobalVariable.Contract_Number_Dispatcher_Dona_Bukalapak_B2B)
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', GlobalVariable.Contract_Number_Dispatcher_Dona_Bukalapak_B2B)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
				}
				else{
					System.err.&println("Contract number doesn't exist")
				}
				break
			case 'DONA_TOKOPEDIA':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", GlobalVariable.Contract_Number_Dispatcher_TOKOPEDIA)
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', GlobalVariable.Contract_Number_Dispatcher_TOKOPEDIA)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
				}
				else{
					System.err.&println("Contract number doesn't exist")
				}
				break
			default:
				System.err.&println("WRONG TYPE CONTRACT!!!!")
				break

		}
	}

	@And('Select Tippers ID based on Validation Type \"([^\"]*)\"')
	def Select_Tippers_ID(String value){
		def xpath_Menu_Title = replace(IST_Menu_Title, '{PARAM}', 'Contract Dispatcher')
		TestObject obj_menu_title = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_Menu_Title)
		WebUI.verifyElementPresent(obj_menu_title, 30, FailureHandling.STOP_ON_FAILURE)
		this.TypeContract = value
		switch (value) {
			case 'TIPPERS_CHECK':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", '')
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				String get_Tippers_ID = xpath_contract_check +"/../../../td[2]"
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', value)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
					WebUI.verifyElementChecked(xpath_obj, 30, FailureHandling.STOP_ON_FAILURE)
					def gettext = WebUI.getText(new_contract_check, FailureHandling.STOP_ON_FAILURE)
					println(gettext)

					TestObject Tippers_id = new TestObject().addProperty('xpath', ConditionType.EQUALS, get_Tippers_ID)
					def getTippersID = WebUI.getText(Tippers_id, FailureHandling.STOP_ON_FAILURE)
					this.Tippers_ID = getTippersID
					println(Tippers_ID)
					GlobalVariable.Tippers_ID_Contract = Tippers_ID
					println(GlobalVariable.Tippers_ID_Contract)
				}
				else{
					System.err.&println("Tippers ID doesn't exist")
				}
				break
			case 'TIPPERS_RECHECK':
				def rplc_Param = replace(IST_Contract_Dispatcher_Check, "{PARAM}", '')
				def xpath_contract_check = replace(rplc_Param, "{PARAM1}", value)
				TestObject new_contract_check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_contract_check)
				def verify_contract_present = WebUI.verifyElementPresent(new_contract_check, 30, FailureHandling.OPTIONAL)
				if(verify_contract_present==true){
					def xpath_new = replace(IST_General_Radiobutton, '{PARAM}', value)
					TestObject xpath_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.click(xpath_obj)
					WebUI.verifyElementChecked(xpath_obj, 30, FailureHandling.STOP_ON_FAILURE)
					def gettext = WebUI.getText(new_contract_check, FailureHandling.STOP_ON_FAILURE)
					println(gettext)

					TestObject Tippers_id = new TestObject().addProperty('xpath', ConditionType.EQUALS, get_Tippers_ID)
					def getTippersID = WebUI.getText(Tippers_id, FailureHandling.STOP_ON_FAILURE)
					this.Tippers_ID = getTippersID
					println(Tippers_ID)
					GlobalVariable.Tippers_ID_Contract = Tippers_ID
				}
				else{
					System.err.&println("Tippers ID doesn't exist")
				}
		}
	}

	@And("Update Tbl IST_TIPPERS_DISPATCHER_SOURCE To Change FLAG_PROCESSED To N")
	def Update_IST_TIPPERS_DISPATCHER_SOURCE(){
		println(GlobalVariable.Tippers_ID_Contract)
		String stmt = "UPDATE IST_TIPPERS_DISPATCHER_SOURCE SET FLAG_PROCESSED='N' WHERE TIPPERS_ID="+"'"+GlobalVariable.Tippers_ID_Contract+"'"
		String stmt2 = "SELECT * FROM IST_TIPPERS_DISPATCHER_SOURCE WHERE TIPPERS_ID="+"'"+GlobalVariable.Tippers_ID_Contract+"'"

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
			println(stmt)
			println(stmt2)
			sql.execute(stmt)
			sql.eachRow(stmt2){ row ->
				println row.FLAG_PROCESSED
				println row.ID
				this.Tippers_Dispatcher_Source_ID = row.ID
				String prc = "${row.FLAG_PROCESSED}"
				assert prc == "N" : "FLAG_PROCESSED Should be N After Update"
			}
		}finally {
			sql.close()
		}
	}

	@And("Update Tbl IST_TIPPERS_DISPATCHER_CLAIM to Change STATUS To Release")
	def Update_IST_TIPPERS_DISPATCHER_CLAIM(){
		String stmt = "SELECT * FROM IST_TIPPERS_DISPATCHER_CLAIM WHERE TIPPERS_DISPATCHER_SOURCE_ID="+"'"+Tippers_Dispatcher_Source_ID+"'"
		String stmt2 = "UPDATE IST_TIPPERS_DISPATCHER_CLAIM SET STATUS='RELEASE' WHERE TIPPERS_DISPATCHER_SOURCE_ID="+"'"+Tippers_Dispatcher_Source_ID+"'"+"AND STATUS='DONE'"

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
			println(stmt)
			println(stmt2)
			sql.execute(stmt2)
			sql.eachRow(stmt){ row ->
				println row.STATUS
				String prc = "${row.STATUS}"
				assert prc == "RELEASE" : "STATUS Should be RELEASE After Update"
			}
		}finally {
			sql.close()
		}
	}

	@And("Delete from IST_TIPPERS_REG_MISTAKE")
	def Delete_IST_TIPPERS_REG_MISTAKE(){
		String stmt = "DELETE FROM IST_TIPPERS_REG_MISTAKE WHERE TIPPERS_ID="+"'"+GlobalVariable.Tippers_ID_Contract+"'"

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
			//			sql.execute(query)
			int deleted = sql.executeUpdate(stmt)
			if (deleted!=0){
				println("Delete Success")
			}
			else{
				println("No Affected Rows")
			}
		}finally {
			sql.close()
		}
	}

	@And('Check DB Idle Tippers Process for 10 Minutes')
	def Tippers_idle_10_minutes(){
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
			String query="SELECT * FROM IST_TIPPERS_DISPATCHER_SOURCE WHERE TIPPERS_ID="+"'"+Tippers_ID+"'"
			println(query)
			sql.eachRow(query){ row ->
				println row.FLAG_PROCESSED
				String prc = "${row.FLAG_PROCESSED}"
				assert prc == "N" : "FLAG_PROCESSED Should be N"
			}
		}finally {
			sql.close()
		}
	}

	@And('Select Contract Number based on Type Contract Two Wheelers EFP and value is 331')
	def SelectContractNumber331(){
		String xpath_radiobutton_forTWEFP_331 = GlobalVariable.Xpath_radiobutton_TWEFP_331
		TestObject radiobuttonTWEFP_331=new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radiobutton_forTWEFP_331)
		def Element_present = WebUI.verifyElementPresent(radiobuttonTWEFP_331, 30, FailureHandling.OPTIONAL)
		if(Element_present==true){
			WebUI.click(radiobuttonTWEFP_331)
		}
		else{
			WebUI.comment("Cannot find contract number")
		}
	}

	@And('Verify type contract \"([^\"]*)\" with value 331 exists in contract dispatcher menu')
	def verifyTypeContractExist(String value){
		def rplc = replace(GlobalVariable.Xpath_Typecontract_331, '{PARAM}', value)
		TestObject radiobutton=new TestObject().addProperty('xpath', ConditionType.EQUALS, rplc)
		def Element_present = WebUI.verifyElementPresent(radiobutton, 30, FailureHandling.OPTIONAL)
		if(Element_present==true){
			WebUI.click(radiobutton)
			WebUI.comment("Type contract ${value} with value 331 exists")
		}
		else{
			WebUI.comment("Cannot find Type contract ${value}")
		}
	}

	@And('Select Email handling \"([^\"]*)\"')
	def SelectEmailHandling(String value){
		def xpath_new = replace(IST_General_Radiobutton_TRIS, '{PARAM}', value)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_new)
		WebUI.verifyElementPresent(new_obj, 30)
		WebUI.click(new_obj)
	}

	@And('Type EmailClient on \"([^\"]*)\" with value \"([^\"]*)\"')
	def TypeEmailClient(String label, String Emailclient){
		def xpath_new = replace(IST_General_text_TRIS, '{PARAM}', label)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
		WebUI.verifyElementPresent(new_obj, 30)
		WebUI.setText(new_obj, Emailclient)
	}

	@And('Click button \"([^\"]*)\"')
	def ClickButton(String value){
		def rplc = replace(IST_General_Button, '{PARAM}', value)
		WebUI.comment(">>>>>${rplc}")
		if(value=="Export Data"){
			TestObject new_button = new TestObject().addProperty('xpath', ConditionType.EQUALS, rplc)
			sleep(3000)
			//		WebUI.verifyElementPresent(new_button, 30)
			WebUI.click(new_button)
			WebUI.takeScreenshot(downloadPath+"/"+"Download_Data.png")
			downloadPath
			File file1 = new File(downloadPath+"/"+"coba_ccc_ocs.xlsx")
		}
		else if(value=="Upload Data"||value=="Upload"){
			TestObject new_button = new TestObject().addProperty('xpath', ConditionType.EQUALS, rplc)
			sleep(3000)
			WebUI.verifyElementPresent(new_button, 30)
			WebUI.click(new_button)
			WebUI.switchToWindowIndex(0, FailureHandling.STOP_ON_FAILURE)
		}
		else{
			TestObject new_button = new TestObject().addProperty('xpath', ConditionType.EQUALS, rplc)
			WebUI.delay(5)
			//		WebUI.verifyElementPresent(new_button, 30)
			WebUI.click(new_button)
			WebUI.takeScreenshot(downloadPath+"/"+"ss.png")
		}
	}

	@And('Click Delete City button based on City Name \"([^\"]*)\"')
	def DeleteButtonCity(String value){
		def xpath_delete_btn = replace(IST_Delete_Button_ManagCity, "{PARAM}", value)
		TestObject new_deletebutton = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_delete_btn)
		WebUI.click(new_deletebutton)
	}

	@And('Click Delete User button based on username \"([^\"]*)\"')
	def DeleteButtonUser(String value){
		def xpath_deleteUsr_btn = replace(IST_Delete_Button_ManagUser, "{PARAM}", value)
		TestObject new_deleteusr_btn = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_deleteUsr_btn)
		WebUI.click(new_deleteusr_btn)
	}

	@And('Click Edit User button based on username \"([^\"]*)\"')
	def EditButtonUser(String value){
		def xpath_editUsr_btn = replace(IST_Edit_Button_ManagUser, "{PARAM}", value)
		TestObject new_editusr_btn = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_editUsr_btn)
		WebUI.click(new_editusr_btn)
	}

	@And('Get text from pop up \"([^\"]*)\" with text \"([^\"]*)\"')
	def gettextconfirmationadd(String label, String TextAlert){
		WebUI.takeScreenshot(downloadPath+"/"+"popup.png")
		def rplc_Param = replace(IST_General_Popup_message, "{PARAM}", label)
		def xpath_popupMessage = replace(rplc_Param, "{PARAM1}", TextAlert)
		TestObject new_popup_Message = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_popupMessage)
		//		WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/popupslik.png')
		WebUI.verifyElementPresent(new_popup_Message, 30)
		WebUI.waitForPageLoad(10)
		WebUI.waitForPageLoad(10)
	}

	//	@And('Select Contract Number based on Type Contract')
	//	def SelectContract(DataTable table){
	//		List<Map<String, String>> data = table.asMaps(String.class, String.class);
	//	}

	@And("Select Arrow Menu \"([^\"]*)\"")
	def ArrowMenu(String value){
		def xpath_arrow = replace(IST_Arrow_Menu, "{PARAM}", value)
		TestObject new_arrow_menu = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_arrow)
		WebUI.click(new_arrow_menu)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Select-'+value+'.png')
	}

	@And("Select Username \"([^\"]*)\" of Management Assignment")
	def UsernameofManagementAssignment(String value){
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/dropdown_list_username_assignment'), value,
				true)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Select_User-'+value+'.png')
	}

	@And("Check for username if already assigned to \"([^\"]*)\"")
	def CheckUsername(String value){
		def checkbox_xpath = replace(IST_Checkbox_POS, '{PARAM}', value)
		def Submit_button = replace(IST_General_Button,'{PARAM}','Submit')
		def OK_button = replace(IST_General_Button,'{PARAM}','OK')
		TestObject Submit = new TestObject().addProperty('xpath', ConditionType.EQUALS, Submit_button)
		TestObject OK = new TestObject().addProperty('xpath', ConditionType.EQUALS, OK_button)
		println(">>>>>>${checkbox_xpath}")
		TestObject new_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, checkbox_xpath)
		println(">>>>>>${new_object}")
		sleep(3000)
		WebUI.scrollToElement(new_object, 3)
		WebUI.waitForElementPresent(new_object, 30, FailureHandling.STOP_ON_FAILURE)
		WebDriver driver = DriverFactory.getWebDriver()
		def element = WebUI.verifyElementChecked(new_object, 30, FailureHandling.OPTIONAL)
		println(">>>>>>${element}")
		if (element==true){
			KeywordUtil.logInfo("Element is already Checked")
		}
		else{
			KeywordUtil.logInfo("Element is not Checked, This Step will Check the element")
			WebUI.waitForElementPresent(new_object, 30)
			WebUI.click(new_object)
			WebUI.click(Submit)
			WebUI.waitForElementPresent(OK, 30)
			WebUI.click(OK)
			def xpath_notif = replace(IST_General_Notif, "{PARAM}", "Update Success")
			TestObject new_notif_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_notif)
			WebUI.verifyElementPresent(new_notif_object, 30)
		}
	}

	@And("Check unchecked contract type POS")
	def CheckUncheckedContractTypePOS(){
		/*
		 **Testing/debug to click checkbox Paperless and verify element not checked must be error
		 def test = replace(IST_Chkbox_Assignment_POS, '{PARAM}', arrayTypeContractPOS[0])
		 TestObject new_test = new TestObject().addProperty('xpath',ConditionType.EQUALS, test)
		 WebUI.click(new_test)
		 */
		def arrayTypeContractPOS = [
			"Paperless",
			"School Financing"
		]
		for (int i=0;i<arrayTypeContractPOS.size();i++){
			def checkbox_obj = replace(IST_Chkbox_Assignment_POS,'{PARAM}',arrayTypeContractPOS[i])
			println(checkbox_obj)
			TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, checkbox_obj)
			WebUI.verifyElementPresent(new_obj, 30)
			WebUI.verifyElementNotChecked(new_obj, 30)
		}
		def arrayTypeContractPOS_2 = [
			"POS Buyback",
			"Polo",
			"POS EFP"
		]
		for(int i=0;i<arrayTypeContractPOS_2.size();i++){
			def check_obj_2 = replace(IST_Chkbox_Assignment_POS_2, '{PARAM}', arrayTypeContractPOS_2[i])
			println(check_obj_2)
			TestObject new_obj_2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, check_obj_2)
			WebUI.verifyElementPresent(new_obj_2, 30)
			WebUI.verifyElementNotChecked(new_obj_2, 30)
		}
		def arrayTypeContractPOS_3 = [
			"Two Wheelers",
			"Two Wheelers EFP",
			"BPKB"
		]
		for(int i=0;i<arrayTypeContractPOS_3.size();i++){
			def check_obj_3 = replace(IST_Chkbox_Assignment_POS_3, '{PARAM}', arrayTypeContractPOS_3[i])
			println(check_obj_3)
			TestObject new_obj_3 = new TestObject().addProperty('xpath',ConditionType.EQUALS, check_obj_3)
			WebUI.verifyElementPresent(new_obj_3, 30)
			WebUI.verifyElementNotChecked(new_obj_3, 30)
		}
		def arrayTypeContractMPF = [
			"Paperless",
			"Telco Lead",
			"Telco AMPH"
		]
		for(int i=0;i<arrayTypeContractMPF.size();i++){
			def check_obj_mpf = replace(IST_Chkbox_Assignment_MPF, '{PARAM}', arrayTypeContractMPF[i])
			println(check_obj_mpf)
			TestObject new_obj_mpf = new TestObject().addProperty('xpath',ConditionType.EQUALS, check_obj_mpf)
			WebUI.verifyElementPresent(new_obj_mpf, 30)
			WebUI.verifyElementNotChecked(new_obj_mpf, 30)
		}
		def arrayTypeContractMPF_2 = ["FF Mobile"]
		for(int i=0;i<arrayTypeContractMPF_2.size();i++){
			def check_obj_mpf_2 = replace(IST_Chkbox_Assignment_MPF_2, '{PARAM}', arrayTypeContractMPF_2[i])
			println(check_obj_mpf_2)
			TestObject new_obj_mpf_2 = new TestObject().addProperty('xpath',ConditionType.EQUALS, check_obj_mpf_2)
			WebUI.verifyElementPresent(new_obj_mpf_2, 30)
			WebUI.verifyElementNotChecked(new_obj_mpf_2, 30)
		}
		def arrayTypeContractOnline = [
			"DONA",
			"DONA O2O",
			"DONA Call Me/Offline"
		]
		for(int i=0;i<arrayTypeContractOnline.size();i++){
			def check_obj_online = replace(IST_Chkbox_Assignment_Online, '{PARAM}', arrayTypeContractOnline[i])
			println(check_obj_online)
			TestObject new_obj_online = new TestObject().addProperty('xpath', ConditionType.EQUALS, check_obj_online)
			WebUI.verifyElementPresent(new_obj_online, 30)
			WebUI.verifyElementNotChecked(new_obj_online, 30)
		}
		def arrayTypeContractOnline_2 = [
			"Paperless",
			"Airlines",
			"Dona B2B"
		]
		for(int i=0;i<arrayTypeContractOnline_2.size();i++){
			def check_obj_online_2 = replace(IST_Chkbox_Assignment_Online_2, '{PARAM}', arrayTypeContractOnline_2[i])
			println(check_obj_online_2)
			TestObject new_obj_online_2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, check_obj_online_2)
			WebUI.verifyElementPresent(new_obj_online_2, 30)
			WebUI.verifyElementNotChecked(new_obj_online_2, 30)
		}
		def arrayTypeContractOnline_3 = ["Dona e-Wallet"]
		for(int i=0;i<arrayTypeContractOnline_3.size();i++){
			def check_obj_online_3 = replace(IST_Chkbox_Assignment_Online_3, '{PARAM}', arrayTypeContractOnline_3[i])
			println(check_obj_online_3)
			TestObject new_obj_online_3 = new TestObject().addProperty('xpath', ConditionType.EQUALS, check_obj_online_3)
			WebUI.verifyElementPresent(new_obj_online_3, 30)
			WebUI.verifyElementNotChecked(new_obj_online_3, 30)
		}
		def arrayTypeContractCREDITCARD = [
			"Credit Card",
			"Loan On Phone"
		]
		for(int i=0;i<arrayTypeContractCREDITCARD.size();i++){
			def check_obj_CREDITCARD = replace(IST_Chkbox_Assignment_Credit_Card, '{PARAM}', arrayTypeContractCREDITCARD[i])
			println(check_obj_CREDITCARD)
			TestObject new_obj_CREDITCARD = new TestObject().addProperty('xpath', ConditionType.EQUALS, check_obj_CREDITCARD)
			WebUI.verifyElementPresent(new_obj_CREDITCARD, 30)
			WebUI.verifyElementNotChecked(new_obj_CREDITCARD, 30)
		}
		def arrayTypeContractMISTAKECORRECTION = [
			"Save and Deviation",
			"Undo",
			"Save and Cancel"
		]
		for(int i=0;i<arrayTypeContractMISTAKECORRECTION.size();i++){
			def check_obj_MISTAKECORRECTION = replace(IST_Chkbox_Assignment_Mistake_Correction, '{PARAM}', arrayTypeContractMISTAKECORRECTION[i])
			println(check_obj_MISTAKECORRECTION)
			TestObject new_obj_MISTAKECORRECTION = new TestObject().addProperty('xpath', ConditionType.EQUALS, check_obj_MISTAKECORRECTION)
			WebUI.verifyElementPresent(new_obj_MISTAKECORRECTION, 30)
			WebUI.verifyElementNotChecked(new_obj_MISTAKECORRECTION, 30)
		}
	}


	@And('Select Sub-Menu \"([^\"]*)\" from Contract Dispatcher Admin')
	def SubMenufromContractDispatcherAdmin(String value){
		def span_xpath = replace(IST_SubMenu_ContractDispatcherAdmin, '{PARAM}', value)
		TestObject new_span = new TestObject().addProperty('xpath', ConditionType.EQUALS, span_xpath)
		WebUI.click(new_span)
	}

	@And("Type on textbox label Username with value: \"([^\"]*)\"")
	def type_on_textbox_label_username(String value){
		WebUI.setText(findTestObject("Page_/input_Username_q9EPe5"), value)
	}

	@And("Click dropdown Base City with values")
	def dropdown_BaseCity(DataTable table){
		List<Map<String, String>> data = table.asMaps(String.class,String.class);
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_/DropdownList_BaseCity'), data[0].city,
				true)
	}

	@And("Edit dropdown based on label \"([^\"]*)\" with values \"([^\"]*)\"")
	def dropdown_Edit_BaseCity(String label, String value){
		def xpath_dropdown_basecity = replace(IST_Dropdown_general, '{PARAM}', label)
		TestObject new_dropdown_basecity = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_dropdown_basecity)
		WebUI.selectOptionByValue(new_dropdown_basecity, value, true)
	}

	@And("Type on Textbox label \"([^\"]*)\" with value \"([^\"]*)\"")
	def FillCityCodeValue(String label, String value){
		def xpath_textbox_label = replace(IST_General_Textbox,'{PARAM}',label)
		TestObject new_inputtextbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_textbox_label)
		WebUI.setText(new_inputtextbox, value)
		this.ContractNumber = value

	}
	@And("Type on Textbox label \"([^\"]*)\" with invoice number")
	def FillInvoiceNumber(String label){
		def xpath_textbox_label = replace(IST_General_Textbox,'{PARAM}',label)
		TestObject new_inputtextbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_textbox_label)
		WebUI.setText(new_inputtextbox, GlobalVariable.Invoice_Number)
		this.ContractNumber = GlobalVariable.Invoice_Number
	}

	@And("Verify Contract Number Exists")
	def verifyContractExists(){
		def xpath_new = replace(IST_Tbl_Consists_Contract_Number, '{PARAM}', ContractNumber)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
		def verify_element_present = WebUI.verifyElementPresent(new_obj, 30, FailureHandling.STOP_ON_FAILURE)
		if(verify_element_present==true){
			println("Contract Number Exists")
		}
		else{
			println("Contract Number Doesn't Exist!!!")
		}
	}

	@And('Notification \"([^\"]*)\"')
	def Notif(String value){
		def xpath_notif = replace(IST_General_Notif, "{PARAM}", value)
		TestObject new_notif_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_notif)
		WebUI.verifyElementPresent(new_notif_object, 30)
	}

	@And('Click edit based on type contract \"([^\"]*)\"')
	def GeneralEditLink(String value){
		def xpath_editlinks = replace(IST_General_editLinks, '{PARAM}', value)
		TestObject new_editlink = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_editlinks)
		WebUI.click(new_editlink)
	}

	@And('Choose Checkbox Mistake Correction based on contract number \"([^\"]*)\"')
	def checkboxMistakeCorrection(String value){
		def xpath_checkbox = replace(IST_General_Checkbox, "{PARAM}", value)
		TestObject new_checkbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_checkbox)
		WebUI.click(new_checkbox)
	}

	@And('Choose Checkbox Mistake Correction based on contract status \"([^\"]*)\"')
	def checkboxMistakeCorrectionUndo(String status){
		def xpath_checkbox = replace(IST_General_Checkbox, "{PARAM}", status)
		TestObject new_checkbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_checkbox)
		WebUI.click(new_checkbox)
	}

	@And('Right Click Invoice Want to Update based on sub contract number \"([^\"]*)\"')
	def selectUpdateInvoice(String status){
		def xpath_invoice = replace(IST_General_Invoice_Summary, "{PARAM}", status)
		TestObject new_rightclick = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoice)
		this.SubContractNumber = status
		WebUI.scrollToElement(new_rightclick,3)
		WebUI.rightClick(new_rightclick)
	}

	@And("Checked checkbox table before label \"([^\"]*)\"")
	def checkedALL(String value){
		def xpath_checkbox_tbl=replace(IST_General_Checkbox_All, "{PARAM}", value)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_checkbox_tbl)
		WebUI.click(new_obj)
	}

	@Given("Go for testing")
	def go_to_testing(){
		WebUI.openBrowser('')
		//WebUI.takeScreenshot('C:\\Users\\ramsey.loloyanto\\Pictures\\testing.png')
		//		WebUI.navigateToUrl("https://id-ist01.id.nonprod/foundation/")
	}

	@And('Upload file \"([^\"]*)\"')
	def UploadFile(String value){
		//		WebUI.switchToWindowIndex(0)
		String path = System.getProperty("user.dir");
		println(path)
		String FilePath = path+"/"+value
		StringSelection ss = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//		Robot robot = new Robot();
		//		println("ini Robot object for key event")
		//		WebUI.switchToWindowIndex(0, FailureHandling.STOP_ON_FAILURE)
		String x = "//input[@type='file']"
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, x)
		WebUI.uploadFile(new_obj, FilePath)
		WebUI.delay(2)
		WebUI.takeScreenshot(downloadPath+"/upload_file.png")

		//		robot.delay(3000)
		//		robot.keyPress(KeyEvent.VK_META);
		//		robot.keyPress(KeyEvent.VK_SHIFT);
		//		robot.keyPress(KeyEvent.VK_G);
		//
		//		robot.keyRelease(KeyEvent.VK_META);
		//		robot.keyRelease(KeyEvent.VK_SHIFT);
		//		robot.keyRelease(KeyEvent.VK_G)
		//		robot.delay(3000)
		//		robot.keyPress(KeyEvent.VK_META);
		//		robot.keyPress(KeyEvent.VK_V);
		//
		//		robot.keyRelease(KeyEvent.VK_META);
		//		robot.keyRelease(KeyEvent.VK_V);
		//		robot.delay(3000)
		//		robot.keyPress(KeyEvent.VK_ENTER);
		//		robot.keyRelease(KeyEvent.VK_ENTER);
		//
		//		robot.keyPress(KeyEvent.VK_ENTER);
		//		robot.keyRelease(KeyEvent.VK_ENTER);
		//		robot.delay(5000)

	}

	@And("Verify Pop Up Window Invoice Detail")
	def VerifyNewWindow(){
		String xpath_popup_window_invoice_detail = "//div[@class = 'z-window z-window-modal z-window-shadow']"
		String xpath_Invoice_Detail = "//div[text()='Invoice Detail']"
		TestObject new_obj_1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_popup_window_invoice_detail)
		TestObject new_obj_2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_Invoice_Detail)
		WebUI.verifyElementPresent(new_obj_1, 30)
		WebUI.verifyElementPresent(new_obj_2, 30)
	}

	@And("Click dropdown \"([^\"]*)\" and select value \"([^\"]*)\"")
	def dropdownReportType(String label, String value){
		def xpath_dropdown_report = replace(IST_Dropdown_inTable, "{PARAM}", label)
		TestObject new_obj_dropdown = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_dropdown_report)
		WebUI.selectOptionByValue(new_obj_dropdown, value, true)
	}

	@And("Choose Mistake value based on Check point")
	def ChooseMistakeLoop(){
		def xpath_invoice_format = replace(IST_Dropdown_inTable, "{PARAM}", "Invoice Format")
		TestObject new_invoice_format = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_format)

		if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "Cetak", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def new_xpath = replace(IST_Dropdown_MistakeInvoiceDetail_2, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, new_xpath)
				WebUI.selectOptionByIndex(new_obj, 2)
			}
		}
		else if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "General", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def new_xpath = replace(IST_Dropdown_MistakeInvoiceDetail_2, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, new_xpath)
				WebUI.selectOptionByIndex(new_obj, 2)
			}
		}
		else if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "HCI format", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Client signature",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def new_xpath = replace(IST_Dropdown_MistakeInvoiceDetail_2, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, new_xpath)
				WebUI.selectOptionByIndex(new_obj, 1)
			}
		}
		else
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def new_xpath = replace(IST_Dropdown_MistakeInvoiceDetail_2, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, new_xpath)
				WebUI.selectOptionByIndex(new_obj, 1)
			}
		}
	}

	@And("Choose Data value based on Check point")
	def ChooseDataValueInvoiceDetail(){
		def new_xpath = replace(IST_Dropdown_DataInvoiceDetail, '{PARAM}', "Purpose")
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, new_xpath)
		WebUI.selectOptionByIndex(new_obj, 2)
	}

	@And("Input Data value based on Check point")
	def InputDataValueInvoiceDetail(){
		def xpath_invoice_amount = replace(IST_Input_DataInvoiceDetail, '{PARAM}', 'Invoice Amount')
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
		WebUI.setText(new_obj, "5000000")

		def arrayCheckpoint = [
			"Seller name",
			"Seller address or phone or stamp with address/phone"
		]
		for(int i=0;i<arrayCheckpoint.size();i++){
			def new_xpath = replace(IST_Input_DataInvoiceDetail, '{PARAM}', arrayCheckpoint[i])
			TestObject new_obj_2 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath)
			WebUI.setText(new_obj_2, "Test")
		}
	}

	@And("Input date \"([^\"]*)\"")
	def inputdate(String value){
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS,IST_Input_date_InvoiceDetail)
		WebUI.setText(new_obj, value)
	}

	@And("Type Mistake Remark based on Check point")
	def TypeMistakeRemarkInvoiceDetail(){
		def xpath_invoice_format = replace(IST_Dropdown_inTable, "{PARAM}", "Invoice Format")
		TestObject new_invoice_format = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_format)

		if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "Cetak", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				TestObject textareaNotDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_not_Disabled)
				WebUI.verifyElementPresent(textareaNotDisable, 30)
				WebUI.setText(new_obj, "TESTING")
			}
		}
		else if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "General", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				TestObject textareaNotDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_not_Disabled)
				WebUI.verifyElementPresent(textareaNotDisable, 30)
				WebUI.setText(new_obj, "TESTING")
			}
		}
		else if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "HCI format", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Client signature",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				TestObject textareaNotDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_not_Disabled)
				WebUI.verifyElementPresent(textareaNotDisable, 30)
				WebUI.setText(new_obj, "TESTING")
			}
		}
		else
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				TestObject textareaNotDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_not_Disabled)
				WebUI.verifyElementPresent(textareaNotDisable, 30)
				WebUI.setText(new_obj, "TESTING")
			}
		}
	}

	@And("Verify Invoice Amount")
	def VerifyInvoiceAmount(){

	}

	@And("Click Repeat Checkbox where Status Not Corrected yet")
	def RepeatCheckboxNotCorrectedStatus(){
		TestObject new_repeat_checkbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, IST_General_Checkbox_Repeat)
		WebUI.click(new_repeat_checkbox)
	}

	@And("Click on Tab \"([^\"]*)\"")
	def clickonTab(String value){
		def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', value)
		println(xpath_new)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
		WebUI.verifyElementPresent(new_obj, 30)
		WebUI.focus(new_obj)
		WebUI.delay(3)
		WebUI.click(new_obj)



		//		def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', value)
		//		println(xpath_new)
		//		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
		//		WebUI.verifyElementPresent(new_obj, 30)
		//		WebUI.verifyElementClickable(new_obj, FailureHandling.STOP_ON_FAILURE)
		//		WebUI.delay(3)
		//		WebUI.click(new_obj)
	}

	@And("Checkbox General Mistake \"([^\"]*)\"")
	def checkboxGeneralMistake(String value){
		def xpath_chkbox_general_mistake = replace(IST_General_Checkbox, "{PARAM}", value)
		TestObject new_general_checkbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_chkbox_general_mistake)
		WebUI.click(new_general_checkbox)
		WebUI.waitForPageLoad(10)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Checkbox_Mistake.png')
	}

	@And("Choose Dropdown mistake type \"([^\"]*)\" from mistake name \"([^\"]*)\"")
	def Dropdown_mistaketypefrommistakename(String ValueType,String ValueName){
		def xpath_dropdown = replace(IST_Dropdown_MistakeName, "{PARAM}", ValueName)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_dropdown)
		//		WebUI.selectOptionByValue(new_obj, ValueType, false)
		WebUI.selectOptionByIndex(new_obj, 1)
		WebUI.waitForPageLoad(10)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Dropdown_Mistake_Type.png')
	}

	@And("Choose mistake type dropdown based on contract number \"([^\"]*)\" with value \"([^\"]*)\"")
	def MistakeTypeDropdown(String number, String value){
		def xpath_dropdown_mistaketype = replace(IST_Dropdown_MistakeCorr, "{PARAM}", number)
		TestObject xpath_mistake_type_corr = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_dropdown_mistaketype)
		WebUI.selectOptionByValue(xpath_mistake_type_corr, value, true)
	}

	@And("Type on textarea note before based on mistake name \"([^\"]*)\" with value \"([^\"]*)\"")
	def notebeforeonmistakename(String ValueName, String value){
		def xpath_obj = replace(IST_notebefore_Mistake, "{PARAM}", ValueName)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_obj)
		WebUI.setText(new_obj, value)
		WebUI.waitForPageLoad(10)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Textarea_NoteBefore-'+value+'.png')
	}

	@And("Type on textarea note after based on mistake name \"([^\"]*)\" with value \"([^\"]*)\"")
	def noteafteronmistakename(String ValueName, String value){
		def xpath_obj = replace(IST_noteafter_Mistake, "{PARAM}", ValueName)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_obj)
		WebUI.setText(new_obj, value)
		WebUI.waitForPageLoad(10)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Textarea_NoteAfter'+value+'.png')
	}

	@And("Edit Textbox for note before with value \"([^\"]*)\"")
	def TextboxNoteBefore(String value){
		TestObject new_textbox_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, IST_Textarea_not_Disabled)
		WebUI.setText(new_textbox_object, value)
	}

	@And("Type on big textbox labeled Reason with value \"([^\"]*)\"")
	def textareaDelReason(String value){
		TestObject new_textbox_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, IST_Textarea_not_Disabled)
		WebUI.setText(new_textbox_object, value)
	}

	@And("Verify Table Empty")
	def VerifyTblEmpty(){
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, IST_Verify_TableEmpty)
		WebUI.verifyElementPresent(new_obj, 30)
	}

	@And("Verify Table Filled")
	def VerifyTblFilled(){
		TestObject new_obj_tbl_filled = new TestObject().addProperty('xpath', ConditionType.EQUALS, IST_Verify_TableFilled)
		if(WebUI.verifyElementPresent(new_obj_tbl_filled, 3, FailureHandling.OPTIONAL)){
			println("Table exist and filled")
		}
		else{
			System.err.&println("DATA DOES NOT EXIST!!!!")
		}
	}

	@And("Verify Table present")
	def TableBulkMistake(){
		TestObject new_obj_tbl_bulk = new TestObject().addProperty('xpath', ConditionType.EQUALS, IST_verify_bulk_table)
		WebUI.verifyElementPresent(new_obj_tbl_bulk, 30)
	}

	//	@Then("Login Success")
	//	def Login_Success_for_contract_dispatcher() {
	//		WebUI.comment("Login Success")
	//		WebUI.maximizeWindow()
	//		WebUI.verifyElementPresent(findTestObject('Page_/h1_Welcome to IT Supporting Tools'), 30)
	//	}

	@And("Verify Tab \"([^\"]*)\" is present and clickable")
	def VerifyTabDispatcher(String value){
		def xpath_obj = replace(IST_Tab_Contract_Dispatcher, "{PARAM}", value)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_obj)
		WebUI.verifyElementPresent(new_obj, 30)
		WebUI.click(new_obj)
	}

	//VERIFY TAB MISTAKE MATRIX
	@And("Verify Tab Mistake Matrix Base on Type Contract")
	def VerifyTabMatrix(){
		//		def xpath_Menu_Title = replace(IST_Menu_Title, '{PARAM}', TypeContract)
		//		TestObject obj_menu_title = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_Menu_Title)
		//		WebUI.verifyElementPresent(obj_menu_title, 30, FailureHandling.STOP_ON_FAILURE)
		switch(TypeContract){
			case 'TIPPERS_CHECK':
				for(int i=0;i<GlobalVariable.Array_Tab_Tippers.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.Array_Tab_Tippers[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'TWO_WHEELERS':
				for(int i=0;i<GlobalVariable.array_tab_TW.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_TW[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'TWO_WHEELERS':
				for(int i=0;i<GlobalVariable.array_tab_TW_EFP_MOBILE.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_TW_EFP_MOBILE[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'TWO_WHEELERS_EFP_MOBILE':
				for(int i=0;i<GlobalVariable.array_tab_TW_EFP_MOBILE.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_TW_EFP_MOBILE[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'BPKB':
				for(int i=0;i<GlobalVariable.BPKB.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.BPKB[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'DONA_TOKOPEDIA':
			case 'DONA_BLIBLI':
			case 'DONA_BUKALAPAK_B2B':
				for(int i=0;i<GlobalVariable.array_tab_Dona_B2B.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_Dona_B2B[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'CREDIT_CARD':
				for(int i=0;i<GlobalVariable.array_tab_CreditCard.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_CreditCard[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'PAPERLESS POS':
				for(int i=0;i<GlobalVariable.array_tab_PAPERLESS_POS.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_PAPERLESS_POS[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'WCF_PAPERLESS':
				for(int i=0;i<GlobalVariable.Array_Tab_WCF_Paperless.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.Array_Tab_WCF_Paperless[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
			case 'WCF_MOBILE':
				for(int i=0;i<GlobalVariable.Array_Tab_WCF_Mobile.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.Array_Tab_WCF_Mobile[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
			case 'Bukalapak':
				def array_tab_bukalapak = [
					"KTP",
					"CFA",
					"Application Form",
					"Health Declaration",
					"Internet Banking"
				]
			//loop for verify tab matrix
				for(int i=0;i<array_tab_bukalapak.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', array_tab_bukalapak[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
				}
				break
		}
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Verify_Tab_Matrix-'+value+'.png')
	}




	@And('Choose Dropdown Username \"([^\"]*)\"')
	def UsernameRoleManagement(String value){
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, IST_Dropdown_Role_Management)
		WebUI.verifyElementPresent(new_obj, 30)
		WebUI.selectOptionByValue(new_obj, value, true)
	}

	@And('Select Role \"([^\"]*)\"')
	def SelectRole(String value){
		def xpath_new = replace(IST_Chkbox_Role_Management, '{PARAM}', value)
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_new)
		WebUI.verifyElementPresent(new_obj, 30)
		def element = WebUI.verifyElementChecked(new_obj, 30, FailureHandling.OPTIONAL)
		if (element==true){
			KeywordUtil.logInfo("Element is already Checked")
		}
		else{
			sleep(3000)
			WebUI.click(new_obj)
		}
	}

	@And('Click checkbox for \"([^\"]*)\" from \"([^\"]*)\"')
	def Click_checkbox_tw_hardcopyJourney(String value, String value1){
		def xpath_new = replace(IST_Doc_tbl_TW_Hardcopy_Journey,'{PARAM1}',value1)
		def xpath_final = replace(xpath_new,'{PARAM}',value)
		println(xpath_final)
	}

	@And('Verify Table Exist')
	def hardcopyjournettwtable(){
		if(this.Menu=="Batch New Employee"||"Outgoing Payment Monitoring"){
			String TW_Hardcopy_Journey_table = "//div[@class='z-grid']"
			TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, TW_Hardcopy_Journey_table)
			WebUI.delay(3)
			WebUI.verifyElementPresent(new_obj, 30)
		}
		else{
			def TW_Hardcopy_Journey_table = "//div[@class='z-grid'][2]"
			TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, TW_Hardcopy_Journey_table)
			WebUI.verifyElementPresent(new_obj, 30)
		}

	}

	@And('Verify Table Approval Status Exist')
	def ApprovalStatustable(){
		def TW_Hardcopy_Journey_table = "//div[@class='z-grid'][2]/div[@class='z-grid-body']/table/tbody/tr/td/div"
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, TW_Hardcopy_Journey_table)
		WebUI.delay(20)
		WebUI.verifyElementPresent(new_obj, 30)
	}

	@And('Verify Unchecked Documents of Table 1 Hardcopy Journey')
	def Unchecked_Hardcopy_Journey(){
		def Table_1_Doc = [
			"Chassis Number Letter",
			"Engine Number Letter",
			"Delivery Order (DO)",
			"POA for Fiduciary",
			"Invoice Partner"
		]
		def list_not_checked = []
		for(int i=0;i<Table_1_Doc.size();i++){
			String Table_1_Hardcopy = "1. Received Hardcopy Document from Dealer"
			def xpath_new = replace(IST_Doc_tbl_TW_Hardcopy_Journey, '{PARAM1}', Table_1_Hardcopy)
			def xpath_final = replace(xpath_new,'{PARAM}',Table_1_Doc[i])
			TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_final)
			WebUI.verifyElementPresent(new_obj, 30)
			def verify_not_checked = WebUI.verifyElementNotChecked(new_obj, 30, FailureHandling.OPTIONAL)
			if (verify_not_checked==true){
				println(Table_1_Doc[i] +" is not checked")
				list_not_checked.add(Table_1_Doc[i])
			}
			else{
				println(Table_1_Doc[i]+" is checked")
			}
			GlobalVariable.List_unchecked_Docs = list_not_checked
		}
		println(GlobalVariable.List_unchecked_Docs)
	}

	@And('Verify Mistake Hardcopy Journey Sent in Email')
	def verify_mistake_HCJ_TW(){
		//This for verify the sender of email
		TestObject sender = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[@autoid="_pe_9" and @aria-label="Home Credit Info <noreply@homecredit.co.id>. Press the Enter key to open the contact card." and text()="Home Credit Info <noreply@homecredit.co.id>"]')
		WebUI.verifyElementPresent(sender, 30)

		println(GlobalVariable.List_unchecked_Docs)
		//Looping as much as mistake from table 1
		for(int i=0;i<GlobalVariable.List_unchecked_Docs.size();i++){
			//define greeting of email
			def greetings = "//div/p[text()='Kepada tirani,']"
			TestObject new_obj_greetings = new TestObject().addProperty('xpath', ConditionType.EQUALS, greetings)
			def new_obj_greetings_value = WebUI.getText(new_obj_greetings)

			//define Mistake value from table 1
			def xpath_new = replace("//div/div/ol/li[contains(text(),'{PARAM}')]", '{PARAM}', GlobalVariable.List_unchecked_Docs[i])
			TestObject new_obj_mistake = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
			def new_obj_mistake_value = WebUI.getText(new_obj_mistake)

			String mistake_Step_Final = GlobalVariable.List_unchecked_Docs[i] + "\nMohon Sales Agent menindaklanjuti kepada Dealer untuk mengirimkan hard copy dokumen ke Home Credit."
			println(mistake_Step_Final)

			//Verify that Greeting of email
			assert new_obj_greetings_value == "Kepada tirani,"

			//Verify for mistake list of table 1 is same with the main content of email
			assert new_obj_mistake_value == mistake_Step_Final
		}
	}

	@And('Sleep ten minutes')
	def idle_contract_dispatcehr(){
		//		Thread.sleep(630000)
		WebUI.delay(600)
	}

	@And('Comment \"([^\"]*)\"')
	def Comment(String value){
		WebUI.comment(value)
	}

	@And('Wait page for load')
	def waitpageload(){
		WebUI.waitForPageLoad(30)
	}
	@And("sleep")
	def sleepers(){
		sleep(5000)
	}

	@And("Close browser")
	def close_browser(){
		WebUI.closeBrowser()
	}

	@And("Update Data Value Based on Check Point")
	def UpdateChooseDataValueInvoiceDetail(){
		def new_xpath_idx = replace(IST_Dropdown_DataInvoiceDetail, '{PARAM}', "Purpose")
		TestObject new_obj_idx = new TestObject().addProperty('xpath', ConditionType.EQUALS, new_xpath_idx)
		GlobalVariable.IstPurposeIdx = 9
		WebUI.selectOptionByIndex(new_obj_idx, GlobalVariable.IstPurposeIdx)

		switch (GlobalVariable.IstPurposeIdx) {
			case 0:
				GlobalVariable.IstPurposeWording = 'AKSESORIS MOBIL DAN MOTOR - Perbaikan, Penggantian, Modifikasi, dll'
				break
			case 1:
				GlobalVariable.IstPurposeWording = 'AKSESORIS PERNIKAHAN/PERAYAAN KHUSUS'
				break
			case 2:
				GlobalVariable.IstPurposeWording = 'HIBURAN - Biaya Keanggotaan, Pakaian, Perhiasaan, dll'
				break
			case 3:
				GlobalVariable.IstPurposeWording = 'Handphone/Tablet/Gadget'
				break
			case 4:
				GlobalVariable.IstPurposeWording = 'ISI RUMAH - Perabotan, Peralatan Rumah Tangga, dll'
				break
			case 5:
				GlobalVariable.IstPurposeWording = 'LIBURAN - Tiket Pesawat, Tiket Kereta, Biaya Travel, dll'
				break
			case 6:
				GlobalVariable.IstPurposeWording = 'PENDIDIKAN - Biaya Sekolah, Kuliah, Kursus, dll'
				break
			case 7:
				GlobalVariable.IstPurposeWording = 'PENGOBATAN - Pemeriksaan, Rawat Inap, Melahirkan, Spesialis, dll'
				break
			case 8:
				GlobalVariable.IstPurposeWording = 'PERBAIKAN RUMAH - Renovasi, Dekorasi, Biaya Jasa, dll'
				break
			case 9:
				GlobalVariable.IstPurposeWording = 'None'
				break
		}
		println (GlobalVariable.IstPurposeWording)

		def xpath_invoice_amount = replace(IST_Input_DataInvoiceDetail, '{PARAM}', 'Invoice Amount')
		TestObject new_obj_amount = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
		this.InSumAmount = '2350000'
		WebUI.setText(new_obj_amount, InSumAmount)
		println(InSumAmount)
		TestObject new_obj_date = new TestObject().addProperty('xpath',ConditionType.EQUALS,IST_Input_date_InvoiceDetail)
		String vDate = "16-01-2020"
		WebUI.setText(new_obj_date, vDate)
		//		this.InSumDate = vDate.substring(3,5)+'/'+vDate.substring(0,2)+'/'+vDate.substring(6,10)
		this.InSumDate = vDate.substring(0,2)+'/'+vDate.substring(3,5)+'/'+vDate.substring(6,10)
		println(InSumDate)
		def xpath_invoice_file = replace(IST_General_Invoice_Summary, '{PARAM}', 'Invoice Photo')
		TestObject new_obj_file = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_amount)
		this.InSumFile = WebUI.getText(new_obj_file)
		this.InSumSellerName = 'Test Update'
		def arrayCheckpoint = [
			"Seller name",
			"Seller address or phone or stamp with address/phone"
		]
		for(int i=0;i<arrayCheckpoint.size();i++){
			def new_xpath = replace(IST_Input_DataInvoiceDetail, '{PARAM}', arrayCheckpoint[i])
			TestObject new_obj_2 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath)
			WebUI.setText(new_obj_2, InSumSellerName)
		}
		Date today = new Date()
		this.DateUpdate = today.format('dd/MM/yyyy')
	}

	@And("Update ")
	def UpdateDataValueInvoiceDetail(){

		def arrayCheckpoint1 = [
			"Invoice picture",
			"Purpose",
			"Invoice Amount",
			"Invoice date",
			"Seller name",
			"Seller address or phone or stamp with address/phone"
		]
		int count
		for(int i=0;i<arrayCheckpoint1.size();i++){
			def new_xpath1 = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint1[i])
			TestObject new_obj_3 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath1)
			def Result = WebUI.verifyElementChecked(new_obj_3, 3, FailureHandling.OPTIONAL)
			if (Result == true){
				count++
			}
		}
		if (count == 6){
			this.InSumCheckResult = 'All Ok'
		}else{
			this.InSumCheckResult = 'Mistake'
		}
	}

	@And("Checklist corrected check")
	def ChecklistCorrected(){
		def xpath_new = replace(IST_Corrected_Checkbox, '{PARAM}', 'Invoice picture')
		TestObject corrected_checkbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
		WebUI.click(corrected_checkbox)
	}

	@And("Verify Update Data in Invoice Summary")
	def VerifyAllInvoiceUpdate(){
		def xpath_invoiceSum1 = replace(IST_InvoiceSum_InvDate, "{PARAM}", SubContractNumber)
		TestObject new_InSum_Date = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum1)
		String InDate = WebUI.getText(new_InSum_Date)
		assert InSumDate == InDate

		def xpath_invoiceSum2 = replace(IST_InvoiceSum_Amount, "{PARAM}", SubContractNumber)
		TestObject new_InSum_Amount = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum2)
		String InAmount = WebUI.getText(new_InSum_Amount)
		assert InSumAmount == InAmount.replace(".", "")

		def xpath_invoiceSum3 = replace(IST_InvoiceSum_CheckingResult, "{PARAM}", SubContractNumber)
		TestObject new_InSum_CheckResult = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum3)
		String InCheckResult = WebUI.getText(new_InSum_CheckResult)
		assert InSumCheckResult == InCheckResult

		def xpath_invoiceSum4 = replace(IST_InvoiceSum_User, "{PARAM}", SubContractNumber)
		TestObject new_InSum_User = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum4)
		String InCheckUser = WebUI.getText(new_InSum_User)
		assert InSumUser == InCheckUser

		//def xpath_invoiceSum5 = replace(IST_InvoiceSum_File, "{PARAM}", SubContractNumber)
		//TestObject new_InSum_File= new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoice5)
		//String InFile = WebUI.getText(new_InSum_File)

		println (InDate)
		println (InAmount)
		println (InCheckResult)
		println (InCheckUser)
		//println (InFile)


	}

	@And("Check User Login for Update")
	def CheckUserLogin(){
		def xpath_ist = replace(IST_General_Invoice_Summary, '{PARAM}', 'Sign in as')
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_ist)
		String istUser = WebUI.getText(new_obj)
		this.InSumUser = istUser.substring(istUser.lastIndexOf('s ') + 2)
		println (InSumUser)
	}

	@And('Check Corrected Result')
	def TestingTestingCode(){
		def xpath_invoice_format = replace(IST_Dropdown_inTable, "{PARAM}", "Invoice Format")
		TestObject new_invoice_format = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_format)
		int checked
		int enable
		if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "Cetak", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				def Disable = WebUI.getAttribute(new_obj, 'disabled')
				println (Disable)

				if (Disable == null){
					def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
					def Result = WebUI.verifyElementChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					enable++
					println (Result)
					if (Result == true){
						checked++
					}
				}
			}
			if (checked == enable){
				this.InSumCheckResult = 'All Ok'
			}else{
				this.InSumCheckResult = 'Mistake'
			}

			println (InSumCheckResult)
			println (checked)
			println (enable)
		}
		else if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "General", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				def Disable = WebUI.getAttribute(new_obj, 'disabled')
				println (Disable)

				if (Disable == null){
					def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
					def Result = WebUI.verifyElementChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					enable++
					if (Result == true){
						checked++
					}
				}
			}
			if (checked == enable){
				this.InSumCheckResult = 'All Ok'
			}else{
				this.InSumCheckResult = 'Mistake'
			}

			println (InSumCheckResult)
			println (checked)
			println ()
		}
		else if(WebUI.verifyOptionSelectedByValue(new_invoice_format, "HCI format", true, 30,FailureHandling.OPTIONAL))
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Client signature",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				def Disable = WebUI.getAttribute(new_obj, 'disabled')
				println (Disable)

				if (Disable == null){
					def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
					def Result = WebUI.verifyElementChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					enable++
					if (Result == true){
						checked++
					}
				}
			}
			if (checked == enable){
				this.InSumCheckResult = 'All Ok'
			}else{
				this.InSumCheckResult = 'Mistake'
			}

			println (InSumCheckResult)
			println (checked)
			println (enable)
		}
		else
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				def Disable = WebUI.getAttribute(new_obj, 'disabled')
				println (Disable)

				if (Disable == null){
					def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
					def Result = WebUI.verifyElementChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					enable++
					if (Result == true){
						checked++
					}
				}
			}
			if (checked == enable){
				this.InSumCheckResult = 'All Ok'
			}else{
				this.InSumCheckResult = 'Mistake'
			}

			println (InSumCheckResult)
			println (checked)
			println (enable)
		}
	}

	@And("Check Invoice Format is \"([^\"]*)\"")
	def checkFormat(String value){
		def xpath_invoice_format = replace(IST_Dropdown_inTable, "{PARAM}", "Invoice Format")
		TestObject new_invoice_format = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_invoice_format)
		WebUI.verifyOptionSelectedByValue(new_invoice_format, value, true, 30,FailureHandling.STOP_ON_FAILURE)
		this.InvcFormat = value
	}

	@And("Verify Update Data in Additional Detail")
	def updateAddDetail(){

		def xpath_invoice = replace(IST_General_Invoice_Summary, "{PARAM}", SubContractNumber)
		TestObject new_click = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoice)
		WebUI.scrollToElement(new_click,3)
		WebUI.click(new_click)

		def xpath_invoiceSum1 = replace(IST_ADD_DETAIL, "{PARAM}", 'Purpose')
		TestObject new_Ad_Purpose = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum1)
		String AdPurpose = WebUI.getText(new_Ad_Purpose)
		println (AdPurpose + InSumPurpose)
		assert GlobalVariable.IstPurposeWording == AdPurpose

		def xpath_invoiceSum2 = replace(IST_ADD_DETAIL, "{PARAM}", 'Invoice Date')
		TestObject new_Ad_Date = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum2)
		String AdDate = WebUI.getText(new_Ad_Date)
		assert InSumDate == AdDate

		def xpath_invoiceSum3 = replace(IST_ADD_DETAIL, "{PARAM}", 'Contract Number')
		TestObject new_Ad_ConNum = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum3)
		String AdConNum = WebUI.getText(new_Ad_ConNum)
		assert ContractNumber == AdConNum

		def xpath_invoiceSum4 = replace(IST_ADD_DETAIL, "{PARAM}", 'Seller Name')
		TestObject new_Ad_SelName = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum4)
		String AdSelName = WebUI.getText(new_Ad_SelName)
		assert InSumSellerName == AdSelName

		def xpath_invoiceSum5 = replace(IST_ADD_DETAIL, "{PARAM}", 'Seller Address')
		TestObject new_Ad_SelAdd = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum5)
		String AdSelAdd = WebUI.getText(new_Ad_SelAdd)
		assert InSumSellerName == AdSelAdd

		def xpath_invoiceSum6 = replace(IST_ADD_DETAIL, "{PARAM}", 'Last update by')
		TestObject new_Ad_UserUp = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum6)
		String AdUserUp = WebUI.getText(new_Ad_UserUp)
		assert InSumUser == AdUserUp

		/*def xpath_invoiceSum7 = replace(IST_Input_DataInvoiceDetail, "{PARAM}", SubContractNumber)
		 TestObject new_Ad_DateCheck = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum4)
		 String AdDateCheck = WebUI.getText(new_InSum_User)
		 assert InSumUser == InCheckUser
		 def xpath_invoiceSum8 = replace(IST_Input_DataInvoiceDetail, "{PARAM}", SubContractNumber)
		 TestObject new_InSum_User888 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum4)
		 String InCheckUser551 = WebUI.getText(new_InSum_User)
		 assert InSumUser == InCheckUser */

		def xpath_invoiceSum8 = replace(IST_ADD_DETAIL, "{PARAM}", 'Update Date')
		TestObject new_Ad_DateUpdate = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum8)
		String AdDateUpdate = WebUI.getText(new_Ad_DateUpdate)
		assert DateUpdate == AdDateUpdate

	}

	@And("Do Correction Check and Correction Remark")
	def correctionCheck(){

		int checked
		int enable
		if(InvcFormat == 'Cetak')
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				def Disable = WebUI.getAttribute(new_obj, 'disabled')
				println (Disable)

				if (Disable == null){
					def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
					def Result = WebUI.verifyElementNotChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					println (Result)
					if (Result == true){
						def new_xpath_checked1 = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
						TestObject new_obj_checked1 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked1)
						WebUI.click(new_obj_checked1)
						def xpath_text_correction = replace(IST_Input_Correction_Remark, '{PARAM}', arrayCheckpoint[i])
						TestObject new_obj_correction = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_text_correction)
						TestObject textareaNotDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_not_Disabled)
						WebUI.verifyElementPresent(textareaNotDisable, 30)
						WebUI.setText(new_obj_correction, "TESTING CHECK")
					}
				}
			}
		}
		else if(InvcFormat == 'General')
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				def Disable = WebUI.getAttribute(new_obj, 'disabled')
				println (Disable)

				if (Disable == null){
					def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
					def Result = WebUI.verifyElementNotChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					println (Result)
					if (Result == true){
						def new_xpath_checked1 = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
						TestObject new_obj_checked1 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked1)
						WebUI.click(new_obj_checked1)
						def xpath_text_correction = replace(IST_Input_Correction_Remark, '{PARAM}', arrayCheckpoint[i])
						TestObject new_obj_correction = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_text_correction)
						TestObject textareaNotDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_not_Disabled)
						WebUI.verifyElementPresent(textareaNotDisable, 30)
						WebUI.setText(new_obj_correction, "TESTING CHECK")
					}
				}
			}
		}
		else if(InvcFormat == 'HCI format')
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Client signature",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				def Disable = WebUI.getAttribute(new_obj, 'disabled')
				println (Disable)

				if (Disable == null){
					def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
					def Result = WebUI.verifyElementNotChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					println (Result)
					if (Result == true){
						def new_xpath_checked1 = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
						TestObject new_obj_checked1 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked1)
						WebUI.click(new_obj_checked1)
						def xpath_text_correction = replace(IST_Input_Correction_Remark, '{PARAM}', arrayCheckpoint[i])
						TestObject new_obj_correction = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_text_correction)
						TestObject textareaNotDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_not_Disabled)
						WebUI.verifyElementPresent(textareaNotDisable, 30)
						WebUI.setText(new_obj_correction, "TESTING CHECK")
					}
				}
			}
		}
		else
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]
			for(int i=0;i<arrayCheckpoint.size();i++){
				def xpath_new = replace(IST_Textarea_Invoice_Detail, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_new)
				def Disable = WebUI.getAttribute(new_obj, 'disabled')
				println (Disable)

				if (Disable == null){
					def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
					def Result = WebUI.verifyElementNotChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					println (Result)
					if (Result == true){
						def new_xpath_checked1 = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
						TestObject new_obj_checked1 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked1)
						WebUI.click(new_obj_checked1)
						def xpath_text_correction = replace(IST_Input_Correction_Remark, '{PARAM}', arrayCheckpoint[i])
						TestObject new_obj_correction = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_text_correction)
						TestObject textareaNotDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_not_Disabled)
						WebUI.verifyElementPresent(textareaNotDisable, 30)
						WebUI.setText(new_obj_correction, "TESTING CHECK")
					}

				}
			}
		}
	}

	@And("Verify Update Checking Result in Invoice Summary")
	def verifyCheckingResult(){
		def xpath_invoiceSum3 = replace(IST_InvoiceSum_CheckingResult, "{PARAM}", SubContractNumber)
		TestObject new_InSum_CheckResult = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_invoiceSum3)
		String InCheckResult = WebUI.getText(new_InSum_CheckResult)
		assert InSumCheckResult == InCheckResult

	}

	@And("Do Repeated Mistake Check")
	def repetMistakeCheck(){

		if(InvcFormat == 'Cetak')
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]

			for(int i=0;i<arrayCheckpoint.size();i++){
				def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
				def Result = WebUI.verifyElementChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
				println (Result)
				if (Result == true){
					def new_xpath_checked1 = replace(IST_Repeated_Mistake, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked1 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked1)
					WebUI.click(new_obj_checked1)
					WebUI.verifyElementNotChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					def xpath_text_correction = replace(IST_Input_Correction_Remark, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_correction = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_text_correction)
					TestObject textareaDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_Disabled)
					WebUI.verifyElementPresent(textareaDisable, 30)
				}
			}
		}
		else if(InvcFormat == 'General')
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Seller name",
				"Seller address or phone or stamp with address/phone"
			]

			for(int i=0;i<arrayCheckpoint.size();i++){
				def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
				def Result = WebUI.verifyElementChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
				println (Result)
				if (Result == true){
					def new_xpath_checked1 = replace(IST_Repeated_Mistake, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked1 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked1)
					WebUI.click(new_obj_checked1)
					WebUI.verifyElementNotChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					def xpath_text_correction = replace(IST_Input_Correction_Remark, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_correction = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_text_correction)
					TestObject textareaDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_Disabled)
					WebUI.verifyElementPresent(textareaDisable, 30)
				}
			}
		}

		else if(InvcFormat == 'HCI format')
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Client signature",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]

			for(int i=0;i<arrayCheckpoint.size();i++){
				def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
				def Result = WebUI.verifyElementChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
				println (Result)
				if (Result == true){
					def new_xpath_checked1 = replace(IST_Repeated_Mistake, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked1 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked1)
					WebUI.click(new_obj_checked1)
					WebUI.verifyElementNotChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					def xpath_text_correction = replace(IST_Input_Correction_Remark, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_correction = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_text_correction)
					TestObject textareaDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_Disabled)
					WebUI.verifyElementPresent(textareaDisable, 30)
				}
			}
		}

		else
		{
			def arrayCheckpoint = [
				"Invoice picture",
				"Purpose",
				"Invoice Amount",
				"Invoice date",
				"Contract number",
				"Seller name",
				"Seller sign or stamp",
				"Seller address or phone or stamp with address/phone"
			]

			for(int i=0;i<arrayCheckpoint.size();i++){
				def new_xpath_checked = replace(IST_Invoice_CorrectedCheck, '{PARAM}', arrayCheckpoint[i])
				TestObject new_obj_checked = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked)
				def Result = WebUI.verifyElementChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
				println (Result)
				if (Result == true){
					def new_xpath_checked1 = replace(IST_Repeated_Mistake, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_checked1 = new TestObject().addProperty('xpath',ConditionType.EQUALS,new_xpath_checked1)
					WebUI.click(new_obj_checked1)
					WebUI.verifyElementNotChecked(new_obj_checked, 3, FailureHandling.OPTIONAL)
					def xpath_text_correction = replace(IST_Input_Correction_Remark, '{PARAM}', arrayCheckpoint[i])
					TestObject new_obj_correction = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_text_correction)
					TestObject textareaDisable = new TestObject().addProperty('xpath', ConditionType.EQUALS,IST_Textarea_Disabled)
					WebUI.verifyElementPresent(textareaDisable, 30)
				}
			}
		}
	}

	@And("Verify Email Handling")
	def verify_email_handling(){
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, IST_Pop_Up_Message_Error)
		WebUI.verifyElementNotPresent(new_obj, 10)
	}

	@And("Ngetest Cuy")
	def Ngetest_Cuy(){
		switch (TypeContract){
			case 'DONA BliBli':
				def array_tab_Dona_BliBli =[
					"KTP",
					"CFA",
					"Application Form",
					"Internet Banking",
					"Health Declaration",
				]
				for(int i=0;i<array_tab_Dona_BliBli.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', array_tab_Dona_BliBli[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.click(new_obj)
					println (i)
					if (i == 0 )
						for(int j=0;j<GlobalVariable.KTP.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.KTP[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
						}
					else if (i == 1)
						for(int j=0;j<GlobalVariable.CFA.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.CFA[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj2, 30)
							WebUI.verifyElementNotChecked(new_obj2, 30)
						}
					else if (i == 2)
						for(int j=0;j<GlobalVariable.Application_Form.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Application_Form[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj3 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj3, 30)
							WebUI.verifyElementNotChecked(new_obj3, 30)
						}
					else if (i == 3)
						for(int j=0;j<GlobalVariable.Internet_Banking.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Internet_Banking[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj4 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj4, 30)
							WebUI.verifyElementNotChecked(new_obj4, 30)
						}
					else if (i == 4)
						for(int j=0;j<GlobalVariable.Health_Declaration.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Health_Declaration[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj5 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj5, 30)
							WebUI.verifyElementNotChecked(new_obj5, 30)
						}
				}
				break
		}
	}

	@And("Verify Data Found")
	def tippers_Data_found(){
		String Error_popup = '//div[contains(text(),"Error")]/following-sibling::div/table/tbody/tr/td/table/tbody/tr/td[5]/div/span[contains(text(),"DATA NOT FOUND !")]'
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, Error_popup)
		if(WebUI.verifyElementPresent(new_obj, 3, FailureHandling.OPTIONAL)==true){
			def rplc = replace(IST_General_Button, '{PARAM}', "OK")
			TestObject new_button = new TestObject().addProperty('xpath', ConditionType.EQUALS, rplc)
			WebUI.click(new_button)
			System.err.&println("DATA NOT FOUND")
			//			call Select_Tippers_ID()

		}
	}

	@And("Verify Tippers Data")
	def verify_tippers_data(){
		//Tippers Data
		def xpath_verify_text = replace(IST_Menu_Title, '{PARAM}', 'Tippers Data')
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		WebUI.verifyElementPresent(new_obj, 3, FailureHandling.STOP_ON_FAILURE)

		def tippers_data_1 = [
			"Tippers User ID",
			"First Name",
			"Last Name",
			"Email",
			"Phone Number"
		]
		for(int i=0;i<tippers_data_1.size();i++){
			def xpath_tippers_data_1 = replace(IST_Menu_Title, '{PARAM}', tippers_data_1[i])
			TestObject new_obj_1 = new TestObject().addProperty('xpath', ConditionType.EQUALS,xpath_tippers_data_1)
			WebUI.verifyElementPresent(new_obj_1, 3, FailureHandling.STOP_ON_FAILURE)
			String getvalue = "//span[text()='"+tippers_data_1[i]+"']/../following-sibling::td[1]/span[2]"
			TestObject new_get_value = new TestObject().addProperty('xpath',ConditionType.EQUALS,getvalue)
			if(WebUI.verifyElementPresent(new_get_value,10,FailureHandling.OPTIONAL)){
				println(tippers_data_1[i]+" : "+WebUI.getText(new_get_value, FailureHandling.STOP_ON_FAILURE))
			}
			else{
				println(tippers_data_1[i]+" is NULL")
			}
		}

		def tippers_data_2 = [
			"KTP Number",
			"NPWP Number",
			"NPWP's Address",
			"Bank Name",
			"Bank Account Number",
			"Name on Bank Account"
		]
		for(int i=0;i<tippers_data_2.size();i++){
			def xpath_tippers_data_2 = replace(IST_Menu_Title, '{PARAM}', tippers_data_2[i])
			TestObject new_obj_2 = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_tippers_data_2)
			WebUI.verifyElementPresent(new_obj_2, 3, FailureHandling.STOP_ON_FAILURE)
			String Get_getvalue_2 = '//span[text()="'+tippers_data_2[i]+'"]/../following-sibling::td/span[2]'
			TestObject new_get_value = new TestObject().addProperty('xpath',ConditionType.EQUALS,Get_getvalue_2)
			if(WebUI.verifyElementPresent(new_get_value,10,FailureHandling.OPTIONAL)){
				println(tippers_data_2[i]+" : "+WebUI.getText(new_get_value, FailureHandling.STOP_ON_FAILURE))
			}
			else{
				println(tippers_data_2[i]+" is NULL")
			}
		}
	}

	@And("Verify Tippers Document")
	def verify_tippers_doc(){
		//Tippers Document
		def xpath_verify_text = replace(IST_Menu_Title, '{PARAM}', 'Tippers Document')
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_verify_text)
		WebUI.verifyElementPresent(new_obj, 3, FailureHandling.STOP_ON_FAILURE)

		def tippers_document=[
			"Tippers Photo",
			"KTP",
			"Bank Account",
			"NPWP"
		]
		for(int i=0;i<tippers_document.size();i++){
			def xpath_tippers_doc_item = replace(IST_Menu_Title, '{PARAM}', tippers_document[i])
			TestObject new_obj_item = new TestObject().addProperty('xpath',ConditionType.EQUALS, xpath_tippers_doc_item)
			WebUI.verifyElementPresent(new_obj_item, 3, FailureHandling.STOP_ON_FAILURE)

			def item = [
				"Revision",
				"Filename",
				"Upload Datetime",
				"Upload By"
			]
			for(int j=0;j<item.size();j++){
				String detail_item = '//span[text()='+'"'+tippers_document[i]+'"'+']/../../div[2]/div[3]/div/table/tbody/tr/th/div[text()='+'"'+item[j]+'"'+']'
				println(detail_item)
				TestObject new_obj_ = new TestObject().addProperty('xpath',ConditionType.EQUALS, detail_item)
				WebUI.verifyElementPresent(new_obj_, 3, FailureHandling.STOP_ON_FAILURE)
			}

		}
	}

	def KTP_Mistakes(){
		for(int j=0;j<GlobalVariable.KTP_Partner.size();j++){
			def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.KTP_Partner[j])
			println(xpath_radio_mistake_matrix)
			TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
			WebUI.verifyElementPresent(new_obj1, 30)
			WebUI.verifyElementNotChecked(new_obj1, 30)
			println (j)
			println (GlobalVariable.KTP_Partner[j])
		}
	}
	def CFA_Mistakes(){
		for(int j=0;j<GlobalVariable.CFA.size();j++){
			def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.CFA[j])
			println(xpath_radio_mistake_matrix)
			TestObject new_obj2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
			WebUI.verifyElementPresent(new_obj2, 30)
			WebUI.verifyElementNotChecked(new_obj2, 30)
			println (j)
			println (GlobalVariable.CFA[j])
		}
	}
	def HealthDeclaration_Mistakes(){
		for(int j=0;j<GlobalVariable.Health_Declaration.size();j++){
			def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Health_Declaration[j])
			println(xpath_radio_mistake_matrix)
			TestObject new_obj7 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
			WebUI.verifyElementPresent(new_obj7, 30)
			WebUI.verifyElementNotChecked(new_obj7, 30)
			println(j)
			println(GlobalVariable.Health_Declaration[j])
		}
	}
	def InternetBanking_Mistakes(){
		for(int j=0;j<GlobalVariable.Internet_Banking.size();j++){
			def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Internet_Banking[j])
			println(xpath_radio_mistake_matrix)
			TestObject new_obj4 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
			WebUI.verifyElementPresent(new_obj4, 30)
			WebUI.focus(new_obj4)
			WebUI.verifyElementNotChecked(new_obj4, 30)
			println(j)
			println(GlobalVariable.Internet_Banking[j])
		}
	}
	//loop for verify tab matrix
	@And("Varify the mistake detail already match with the matrix Base on Type Contract")
	def Tab_Matrix(){
		switch (TypeContract){
			case 'WCF_PAPERLESS':
				for(int i=0;i<GlobalVariable.Array_Tab_WCF_Paperless.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.Array_Tab_WCF_Paperless[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.click(new_obj)
					println (i)
					if(i==0){
						KTP_Mistakes()
					}
					else if(i==1){
						CFA_Mistakes()
					}
					else if(i==2){
						HealthDeclaration_Mistakes()
					}
					else{
						InternetBanking_Mistakes()
					}
				}
			case 'TIPPERS_CHECK':
				for(int i=0;i<GlobalVariable.Array_Tab_Tippers.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.Array_Tab_Tippers[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.click(new_obj)
					println (i)
					if (i == 0 ){
						for(int j=0;j<GlobalVariable.KTP_Partner.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.KTP_Partner[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
							println (j)
						}
					}
					else if(i==1){
						for(int j=0;j<GlobalVariable.Partner_Data.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Partner_Data[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
							println (j)
						}
					}
					else if(i==2){
						for(int j=0;j<GlobalVariable.NPWP_Partner.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.NPWP_Partner[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
							println (j)
						}
					}
					else{
						for(int j=0;j<GlobalVariable.Internet_Banking_Partner.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Internet_Banking_Partner[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
							println (j)
						}
					}
				}
				break
			case 'BPKB':
				for(int i=0;i<GlobalVariable.array_tab_BPKB.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_BPKB[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.click(new_obj)
					println (i)

					if (i == 0 ){
						for(int j=0;j<GlobalVariable.Motor_Vehicle_Invoice.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Motor_Vehicle_Invoice[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
							println (j)
						}
					}
					else if (i == 1){
						for(int j=0;j<GlobalVariable.BPKB.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.BPKB[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj2, 30)
							WebUI.verifyElementNotChecked(new_obj2, 30)
							println (j)
						}
					}
				}
				break

			case 'TWO_WHEELERS':
				for(int i=0;i<GlobalVariable.array_tab_TW.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_TW[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.click(new_obj)

					if (i == 0 ){
						for(int j=0;j<GlobalVariable.KTP.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.KTP[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
						}
					}
					else if (i == 1){
						for(int j=0;j<GlobalVariable.CFA.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.CFA[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj2, 30)
							WebUI.verifyElementNotChecked(new_obj2, 30)
						}
					}
					else if (i == 2){
						for(int j=0;j<GlobalVariable.Application_Form.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Application_Form[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj3 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj3, 30)
							WebUI.verifyElementNotChecked(new_obj3, 30)
						}
					}
					else if (i == 3){
						for(int j=0;j<GlobalVariable.Consent_Form.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Consent_Form[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj4 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj4, 30)
							WebUI.verifyElementNotChecked(new_obj4, 30)
						}
					}
					else if (i == 4){
						for(int j=0;j<GlobalVariable.Second_Doc.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Second_Doc[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj5 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj5, 30)
							WebUI.verifyElementNotChecked(new_obj5, 30)
						}
					}
					else if (i == 5){
						for(int j=0;j<GlobalVariable.Employee_ID.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Employee_ID[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj6 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj6, 30)
							WebUI.verifyElementNotChecked(new_obj6, 30)
						}
					}
					else if (i == 6){
						for(int j=0;j<GlobalVariable.Health_Declaration.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Health_Declaration[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj7 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj7, 30)
							WebUI.verifyElementNotChecked(new_obj7, 30)
						}
					}
					else if (i == 7){
						for(int j=0;j<GlobalVariable.Chassis_Number_Letter.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Chassis_Number_Letter[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj8 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj8, 30)
							WebUI.verifyElementNotChecked(new_obj8, 30)
						}
					}
					else if (i == 8){
						for(int j=0;j<GlobalVariable.Engine_Number_Letter.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Engine_Number_Letter[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj9 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj9, 30)
							WebUI.verifyElementNotChecked(new_obj9, 30)
						}
					}
					else if (i == 9){
						for(int j=0;j<GlobalVariable.Delivery_Order.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Delivery_Order[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj10 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj10, 30)
							WebUI.verifyElementNotChecked(new_obj10, 30)
						}
					}
					else if (i == 10){
						for(int j=0;j<GlobalVariable.POA_Fiduciary.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.POA_Fiduciary[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj11 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj11, 30)
							WebUI.verifyElementNotChecked(new_obj11, 30)
						}
						TestObject new_obj_Arrow_Right = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@class='z-tabbox-icon z-tabbox-right-scroll']")
						WebUI.click(new_obj_Arrow_Right)
						WebUI.click(new_obj_Arrow_Right)
						WebUI.click(new_obj_Arrow_Right)
					}
					else if (i == 11){
						for(int j=0;j<GlobalVariable.Partner_Invoice.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Partner_Invoice[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj12 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj12, 30)
							WebUI.verifyElementNotChecked(new_obj12, 30)
						}
					}
					else if (i == 12){
						for(int j=0;j<GlobalVariable.Motor_Vehicle_Invoice.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Motor_Vehicle_Invoice[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj12 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj12, 30)
							WebUI.verifyElementNotChecked(new_obj12, 30)
						}
					}
					else{
						for(int j=0;j<GlobalVariable.BPKB.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.BPKB[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj12 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj12, 30)
							WebUI.verifyElementNotChecked(new_obj12, 30)
						}
						TestObject new_obj_Arrow_Right = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//div[@class='z-tabbox-icon z-tabbox-left-scroll']")
						WebUI.click(new_obj_Arrow_Right)
						WebUI.click(new_obj_Arrow_Right)
						WebUI.click(new_obj_Arrow_Right)
					}

				}
				break

			case 'TWO_WHEELERS_EFP_MOBILE':
				for(int i=0;i<GlobalVariable.array_tab_TW_EFP_MOBILE.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_TW_EFP_MOBILE[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.click(new_obj)

					if (i == 0 )
						for(int j=0;j<GlobalVariable.KTP.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.KTP[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
						}
					else if (i == 1)
						for(int j=0;j<GlobalVariable.CFA.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.CFA[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj2, 30)
							WebUI.verifyElementNotChecked(new_obj2, 30)
						}
					else if (i == 2)
						for(int j=0;j<GlobalVariable.Employee_ID.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Employee_ID[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj3 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj3, 30)
							WebUI.verifyElementNotChecked(new_obj3, 30)
						}
					else if (i == 3)
						for(int j=0;j<GlobalVariable.Health_Declaration.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Health_Declaration[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj4 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj4, 30)
							WebUI.verifyElementNotChecked(new_obj4, 30)
						}
					else if (i == 4)
						for(int j=0;j<GlobalVariable.Salary_Deduction_Form.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Salary_Deduction_Form[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj6 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj6, 30)
							WebUI.verifyElementNotChecked(new_obj6, 30)
						}
					else if (i == 5)
						for(int j=0;j<GlobalVariable.Chassis_Number_Letter.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Chassis_Number_Letter[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj7 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj7, 30)
							WebUI.verifyElementNotChecked(new_obj7, 30)
						}
					else if (i == 6)
						for(int j=0;j<GlobalVariable.Engine_Number_Letter.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Engine_Number_Letter[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj8 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj8, 30)
							WebUI.verifyElementNotChecked(new_obj8, 30)
						}
				}
				break
			case 'CREDIT_CARD':
				for(int i=0;i<GlobalVariable.array_tab_CreditCard.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_CreditCard[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.click(new_obj)

					if (i == 0 )
						for(int j=0;j<GlobalVariable.KTP.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.KTP[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
						}
					else if (i == 1)
						for(int j=0;j<GlobalVariable.CFA.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.CFA[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj2, 30)
							WebUI.verifyElementNotChecked(new_obj2, 30)
						}
					else if (i == 2)
						for(int j=0;j<GlobalVariable.Employee_ID.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Employee_ID[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj3 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj3, 30)
							WebUI.verifyElementNotChecked(new_obj3, 30)
						}
					else if (i == 3)
						for(int j=0;j<GlobalVariable.Income_Proof_CC.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Income_Proof_CC[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj4 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj4, 30)
							WebUI.verifyElementNotChecked(new_obj4, 30)
						}
				}
				break;

			case 'PAPERLESS POS':
				for(int i=0;i<GlobalVariable.array_tab_PAPERLESS_POS.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_PAPERLESS_POS[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.click(new_obj)

					if (i == 0 )
						for(int j=0;j<GlobalVariable.KTP.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.KTP[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.verifyElementNotChecked(new_obj1, 30)
						}
					else if (i == 1)
						for(int j=0;j<GlobalVariable.CFA.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.CFA[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj2, 30)
							WebUI.verifyElementNotChecked(new_obj2, 30)
						}
					else if (i == 2)
						for(int j=0;j<GlobalVariable.Application_Form.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Application_Form[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj3 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj3, 30)
							WebUI.verifyElementNotChecked(new_obj3, 30)
						}
					else if (i == 3)
						for(int j=0;j<GlobalVariable.Second_Doc.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Second_Doc[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj4 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj4, 30)
							WebUI.verifyElementNotChecked(new_obj4, 30)
						}
					else if (i == 4)
						for(int j=0;j<GlobalVariable.Consent_Form.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Consent_Form[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj5 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj5, 30)
							WebUI.verifyElementNotChecked(new_obj5, 30)
						}
					else if (i == 5)
						for(int j=0;j<GlobalVariable.Employee_ID.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Employee_ID[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj6 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj6, 30)
							WebUI.verifyElementNotChecked(new_obj6, 30)
						}
					else if (i == 6)
						for(int j=0;j<GlobalVariable.Health_Declaration.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Health_Declaration[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj7 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj7, 30)
							WebUI.verifyElementNotChecked(new_obj7, 30)
						}
				}
				break;

			case "DONA_BLIBLI":
			case "DONA_TOKOPEDIA":
			case 'DONA_BUKALAPAK_B2B':
				for(int i=0;i<GlobalVariable.array_tab_Dona_B2B.size();i++){
					def xpath_new = replace(IST_Tab_Contract_Dispatcher, '{PARAM}', GlobalVariable.array_tab_Dona_B2B[i])
					println(xpath_new)
					TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_new)
					WebUI.verifyElementPresent(new_obj, 30)
					WebUI.focus(new_obj)
					WebUI.delay(3)
					WebUI.click(new_obj)

					if (i == 0 )
						for(int j=0;j<GlobalVariable.KTP.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.KTP[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj1 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj1, 30)
							WebUI.focus(new_obj1)
							WebUI.verifyElementNotChecked(new_obj1, 30)
						}

					else if (i == 1)
						for(int j=0;j<GlobalVariable.CFA.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.CFA[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj2, 30)
							WebUI.focus(new_obj2)
							WebUI.verifyElementNotChecked(new_obj2, 30)
						}
					else if (i == 2)
						for(int j=0;j<GlobalVariable.Application_Form.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Application_Form[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj3 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj3, 30)
							WebUI.focus(new_obj3)
							WebUI.verifyElementNotChecked(new_obj3, 30)
						}
					else if (i == 3)
						for(int j=0;j<GlobalVariable.Internet_Banking.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Internet_Banking[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj4 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj4, 30)
							WebUI.focus(new_obj4)
							WebUI.verifyElementNotChecked(new_obj4, 30)
						}
					else if (i == 4)
						for(int j=0;j<GlobalVariable.Health_Declaration.size();j++){
							def xpath_radio_mistake_matrix = replace(IST_General_Checkbox,'{PARAM}',GlobalVariable.Health_Declaration[j])
							println(xpath_radio_mistake_matrix)
							TestObject new_obj5 = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_radio_mistake_matrix)
							WebUI.verifyElementPresent(new_obj5, 30)
							WebUI.focus(new_obj5)
							WebUI.verifyElementNotChecked(new_obj5, 30)
						}
				}
				break
		}

	}
	@And("Verify Contract Number in Contract History \"([^\"]*)\"")
	def NumberContractHistory(String value){
		def xpath_txt_check = replace(IST_General_Menu, "{PARAM}", value)
		TestObject new_Text_Check = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_txt_check)
		WebUI.verifyElementPresent(new_Text_Check, 5)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Checkbox_Mistake.png')
	}
	@And("Verify Title \"([^\"]*)\" Exists")
	def VerifyTiltle(String value){
		def xpath_menu_title = replace(IST_Menu_Title,'{PARAM}', value)
		TestObject new_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_menu_title)
		WebUI.verifyElementPresent(new_object, 30, FailureHandling.STOP_ON_FAILURE)
		WebUI.focus(new_object, FailureHandling.STOP_ON_FAILURE)
	}
	@And("Get Error Notification \"([^\"]*)\"")
	def Get_Notif(String value){
		def xpath_general_notif = replace(IST_General_Notif,'{PARAM}', value)
		TestObject new_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_general_notif)
		WebUI.verifyElementPresent(new_object, 5, FailureHandling.STOP_ON_FAILURE)
	}
	@And("Input Email on Dashboard with value \"([^\"]*)\"")
	def input_email_on_dashboard(String value){
		String xpath = "//div[2]/span/span/../../input[@type='text']"
		TestObject new_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath)
		WebUI.delay(2)
		WebUI.verifyElementPresent(new_object, 3, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		WebUI.setText(new_object, value, FailureHandling.STOP_ON_FAILURE)
	}
	@And("Input Account Number with value \"([^\"]*)\"")
	def input_account_number(String value){
		String xpath = "//div[1]/span/span/../../input[@type='text']"
		TestObject new_object = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath)
		WebUI.delay(2)
		WebUI.verifyElementPresent(new_object, 3, FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(2)
		WebUI.setText(new_object, value, FailureHandling.STOP_ON_FAILURE)
	}
}