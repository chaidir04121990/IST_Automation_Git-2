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

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
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
import com.kms.katalon.core.exception.StepErrorException as StepErrorException


class BSL_try {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	String Button_BSL_General = "//input[@type='submit' and @value='{PARAM}']"
	String Select_Contract_Management = "//div[text()='{PARAM}']"
	String Tab_Menu_Search_for_Contract = "//span[text()='{PARAM}']"
	String Contract_Status_from_Search_for_contract = "//span[@class='title' and text()='Contract status:']/following-sibling::span[@data-uid='contract-detail-panel:status']"

	@And('Select \"([^\"]*)\"')
	def select(String value){
		def rplc = CustomKeywords.'mypackage.MySelectors.replace'(Select_Contract_Management, '{PARAM}', value)
		println rplc
		TestObject SelectMenu = new TestObject().addProperty('xpath', ConditionType.EQUALS, rplc)
		WebUI.click(SelectMenu)
	}

	@And('Write Contract number \"([^\"]*)\"')
	def Write_Contract_number(String value){
		String Contract_number_HS = "//label[contains(text(),'Contract number:')and @id='labelForid19']/following-sibling::input[@type='text']"
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, Contract_number_HS)
		WebUI.setText(new_obj, value)
	}

	@And('Write Active Contract Number')
	def Write_BSL_Active_Contract_Number(){
		String Contract_number_HS = "//label[contains(text(),'Contract number:')and @id='labelForid19']/following-sibling::input[@type='text']"
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, Contract_number_HS)
		WebUI.setText(new_obj, GlobalVariable.Active_contract_number_in_BSL_for_TRIS_0)
	}

	@And('Click Button \"([^\"]*)\"')
	def click_btn(String value){
		def rplc = CustomKeywords.'mypackage.MySelectors.replace'(Button_BSL_General, '{PARAM}', value)
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, rplc)
		WebUI.click(new_obj)
	}

	@And('Check Contract Status BSL')
	def check_ContractStatus(){
		TestObject new_obj = new TestObject().addProperty('xpath', ConditionType.EQUALS, Contract_Status_from_Search_for_contract)
		def contractstatus = WebUI.getText(new_obj, FailureHandling.OPTIONAL)
		println contractstatus

		if(contractstatus=='Cancelled'){
			WebUI.comment('Contract Cancelled')
			WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Contract_cancelled.png')
			WebUI.closeBrowser()
		}
		else if(contractstatus=='Active'){
			WebUI.comment('Contract Active, Please check Credit Limit left before 90% in IST')
		}
	}
}