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


class TRIS_Function {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	String TRIS_Credit_Left_beofre_90 = "//span[text()='Credit Left before 90%']/../following-sibling::td/span[@class='z-label']"

	@Given("Check_Credit_Left_before_90%")
	def Check_90_Credit_Limit() {
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, TRIS_Credit_Left_beofre_90)
		def value_90_Credit_Limit = WebUI.getText(new_obj,FailureHandling.OPTIONAL)
		if(value_90_Credit_Limit==0){
			WebUI.comment('Credit Limit is already 0, Please fill email and click submit to send Addendum')
		}
		else{
			println value_90_Credit_Limit
		}
	}

	@And("Verify Email Addendum Sent")
	def Email_Addendum(){

		TestObject inbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[@autoid="_lv_5" and @aria-hidden="false" and text()="Home Credit Info"]')
		WebUI.verifyElementPresent(inbox, 30)
		//		WebUI.click(inbox)

		TestObject inbox2 = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[@autoid="_lv_b"  and @aria-hidden="true" and text()="Addendum Perbedaan Tujuan untuk kontrak MPF"]')
		WebUI.verifyElementPresent(inbox2, 30)
		WebUI.click(inbox2)

		TestObject subject = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[text()="Addendum Perbedaan Tujuan untuk kontrak MPF" and @role="heading"]')
		WebUI.verifyElementPresent(subject, 30)

		TestObject sender = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[@autoid="_pe_9" and @aria-label="Home Credit Info <noreply@homecredit.co.id>. Press the Enter key to open the contact card." and text()="Home Credit Info <noreply@homecredit.co.id>"]')
		WebUI.verifyElementPresent(sender, 30)

		//verify attachment TRIS Addendum pdf
		TestObject Attach_pdf_Addendum = new TestObject().addProperty('xpath', ConditionType.EQUALS, '//span[@autoid="_az_2" and @class="_az_j ms-font-weight-regular ms-font-color-white _az_e _az_z" and text()="TRIS_ADDEND~.pdf"]')
		WebUI.verifyElementPresent(Attach_pdf_Addendum, 30)

	}

	@And("Type on Textbox label \"([^\"]*)\" with Active Contract Number in BSL and TRIS Credit Left Before 90=0")
	def Write_Active_Contract_Number_for_TRIS_CLB90_is_0(String label){
		def xpath_textbox_label = new Contract_Dispatcher().replace(new Contract_Dispatcher().IST_General_Textbox,'{PARAM}',label)
		TestObject new_inputtextbox = new TestObject().addProperty('xpath', ConditionType.EQUALS, xpath_textbox_label)
		WebUI.setText(new_inputtextbox, GlobalVariable.Active_contract_number_in_BSL_for_TRIS_0_PREPROD)
	}
}