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
import io.cucumber.datatable.DataTable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
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
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.remote.CapabilityType


class Login_IST {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */


	String Username_BSL_C1 = "//label[text()='Username']/following-sibling::input[@type='text']"
	String Password_BSL_C1 = "//label[text()='Password']/following-sibling::input[@type='text']"
	String BTN_Login_BSL_C1 = "//input[@type='submit' and @value='Log In']"
	String Outlook_Usrname = "//input[@id='username']"
	String Outlook_Pass = "//input[@id='password' and @name='password']"
	String sign_outlook = "//span[@class='signinTxt' and text()='sign in']"
	String SignInAs



	@Given("Go to IST")
	def go_to_IST_URL(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.URL_IST_TRACKER)
		WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/IST_Page.png')
		//		WebUI.navigateToUrl("https://id-ist01.id.nonprod/foundation/")

	}

	@Given("Go to ISTools")
	def go_to_ISTools_URL(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.urlLoginISTOOLS)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/IST_Page.png')
		//		WebUI.navigateToUrl("https://id-ist01.id.nonprod/foundation/")

	}

	@Given("Go to BSL C1")
	def go_to_BSL_C1(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.BSL)
		WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/BSL_C1.png')
		//		WebUI.navigateToUrl("https://id-ist01.id.nonprod/foundation/")
	}

	@Given("Go to IST Tracker")
	def go_to_IST_Tracker_Prod(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.urlLoginProd)
	}

	@Given("Go to Portal HCID")
	def go_to_Portal_HCID(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.urlLoginPortalHCID)
	}

	@Given("Go to Outlook")
	def go_to_Outlook_url(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.Email_Outlook)
		WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/'+GlobalVariable.Email_Outlook+'.png')
		//		WebUI.navigateToUrl("https://id-ist01.id.nonprod/foundation/")
	}

	@When("Login BSL C1 with valid credentials")
	def I_want_to_login_to_BSL_C1() {
		println("\n Login with valid credentials")
		TestObject Username = new TestObject().addProperty('xpath',ConditionType.EQUALS, Username_BSL_C1)
		TestObject Password = new TestObject().addProperty('xpath',ConditionType.EQUALS, Password_BSL_C1)
		TestObject Login_BTN = new TestObject().addProperty('xpath',ConditionType.EQUALS, BTN_Login_BSL_C1)
		WebUI.setText(Username, GlobalVariable.user_BSL_C1)
		WebUI.setEncryptedText(Password, GlobalVariable.pass_BSL_C1)
		WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Login_Valid_Credentials.png')
		WebUI.click(Login_BTN)
	}

	@When("Login IST with valid credentials")
	def I_want_to_login_to_IST(DataTable table) {
		println("\n Login with valid credentials")
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		WebUI.setText(findTestObject('Object Repository/Page_/input_Username_j_username'), data[0].username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_j_password'), data[0].password)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Login_Valid_Credentials.png')
		WebUI.click(findTestObject('Page_/button_Login'))
		this.SignInAs=data[0].username
	}

	@When("Login Outlook with valid credentials")
	def I_want_to_login_to_Outlook() {
		println("\n Login with valid credentials")
		TestObject Username_Outlook = new TestObject().addProperty('xpath',ConditionType.EQUALS, Outlook_Usrname)
		TestObject Passeword_Outlook = new TestObject().addProperty('xpath',ConditionType.EQUALS, Outlook_Pass)
		TestObject SignIn_Outlook = new TestObject().addProperty('xpath',ConditionType.EQUALS, sign_outlook)
		WebUI.setText(Username_Outlook,GlobalVariable.Username_Outlook)
		WebUI.setEncryptedText(Passeword_Outlook, GlobalVariable.Pass_Outlook)
		//		WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Login_Valid_Credentials.png')
		WebUI.click(SignIn_Outlook)
	}

	@When("Login IST with valid credentials GlobalVariable")
	def Login_with_credentials_from_GlobalVariable(){
		WebUI.setText(findTestObject('Object Repository/Page_/input_Username_j_username'),GlobalVariable.userChaidir)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_j_password'), GlobalVariable.passChaidir)
		WebUI.click(findTestObject('Page_/button_Login'))
	}

	@Then("Login BSL C1 Succeed")
	def Login_BSL_C1_Success() {
		String HomerSelect = "//span[@class='application-name' and text()='Homer Select']"
		TestObject Homer_Select = new TestObject().addProperty('xpath',ConditionType.EQUALS, HomerSelect)
		WebUI.comment("Login Success")
		WebUI.maximizeWindow()
		WebUI.verifyElementPresent(Homer_Select, 30)
	}

	@Then("Login Success")
	def Login_Success() {
		WebUI.comment("Login Success")
		WebUI.maximizeWindow()
		WebUI.verifyElementPresent(findTestObject('Page_/h1_Welcome to IT Supporting Tools'), 30)
	}

	@Then("Login Success for contract dispatcher")
	def Login_Success_for_dispatcher() {
		WebUI.comment("Login Success")
		WebUI.maximizeWindow()
		WebUI.verifyElementPresent(findTestObject('Page_/h1_Welcome to IT Supporting Tools'), 30)
		//WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Login_Success.png')
	}

	@Then("Login Outlook Succeed")
	def Login_Success_for_outlook() {
		WebUI.comment("Login Success")
		WebUI.maximizeWindow()
		def verifyOutlook = "//span[@class='_hl_r ms-font-weight-regular ms-font-color-white owaimg csimg image-owa_brand-png' and @role='presentation']"
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, verifyOutlook)
		WebUI.verifyElementPresent(new_obj, 30)
		//		WebUI.takeScreenshot('/Users/chaidir.pratama01/Documents/Docs/Katalon Studio/Screenshot/Login_Success.png')
	}

	@When("Login IST with wrong credentials")
	def I_want_to_Login_with_wrong_username(DataTable table){
		println("\n Login with wrong credentials")
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		WebUI.setText(findTestObject('Object Repository/Page_/input_Username_j_username'), data[0].username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_Password_j_password'), data[0].password)
		WebUI.click(findTestObject('Page_/button_Login'))
	}

	@Then("Login Failed")
	def Login_Failed(){
		WebUI.comment("Login Fail")
		WebUI.maximizeWindow()
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_/span_Bad credentials'), 30)
		WebUI.closeBrowser()
	}

	@And('Verify Email Sent')
	def Email_Sent_TW_HCJ(){
		TestObject new_obj = new TestObject().addProperty('xpath',ConditionType.EQUALS, '//span[text()="Home Credit Info" and @style!="display: none;"]')
		WebUI.verifyElementPresent(new_obj, 30)
		WebUI.click(new_obj)
	}
}