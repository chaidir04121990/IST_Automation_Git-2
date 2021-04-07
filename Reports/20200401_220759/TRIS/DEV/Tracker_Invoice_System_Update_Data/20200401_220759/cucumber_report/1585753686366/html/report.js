$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ramsey.loloyanto/Documents/ist-Katalon/Include/features/IST_Real/TRIS/DEV/Tracker_Invoice_System_Update_Data.feature");
formatter.feature({
  "name": "TRIS update",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Update Invoice Data Cetak",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Go to IST",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_IST_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login IST with valid credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mobile.test",
        "heMxIzEAyQpycx257HePHg\u003d\u003d"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login_IST.I_want_to_login_to_IST(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Success for contract dispatcher",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_IST.Login_Success_for_dispatcher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check User Login for Update",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.CheckUserLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Arrow Menu \"Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ArrowMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Menu \"Tracker Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type on Textbox label \"contract number of email address\" with value \"9999999999\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.FillCityCodeValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Search\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Table Filled",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTblFilled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Right Click Invoice Want to Update based on sub contract number \"9999999999-7\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.selectUpdateInvoice(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Invoice Format is \"Cetak\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.checkFormat(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Update Data Value Based on Check Point",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.UpdateChooseDataValueInvoiceDetail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Corrected Result",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.TestingTestingCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Save Invoice\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Update Data in Invoice Summary",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyAllInvoiceUpdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Update Data in Additional Detail",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.updateAddDetail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Logout\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update Invoice Data General",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "Go to IST",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_IST_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login IST with valid credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mobile.test",
        "heMxIzEAyQpycx257HePHg\u003d\u003d"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login_IST.I_want_to_login_to_IST(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Success for contract dispatcher",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_IST.Login_Success_for_dispatcher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check User Login for Update",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.CheckUserLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Arrow Menu \"Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ArrowMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Menu \"Tracker Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type on Textbox label \"contract number of email address\" with value \"9999999999\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.FillCityCodeValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Search\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Table Filled",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTblFilled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Right Click Invoice Want to Update based on sub contract number \"9999999999-5\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.selectUpdateInvoice(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Invoice Format is \"General\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.checkFormat(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Update Data Value Based on Check Point",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.UpdateChooseDataValueInvoiceDetail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Corrected Result",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.TestingTestingCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Save Invoice\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Update Data in Invoice Summary",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyAllInvoiceUpdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Update Data in Additional Detail",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.updateAddDetail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Logout\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Update Invoice Data HCI Format",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "Go to IST",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_IST_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login IST with valid credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mobile.test",
        "heMxIzEAyQpycx257HePHg\u003d\u003d"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login_IST.I_want_to_login_to_IST(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login Success for contract dispatcher",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_IST.Login_Success_for_dispatcher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check User Login for Update",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.CheckUserLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Arrow Menu \"Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ArrowMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Menu \"Tracker Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type on Textbox label \"contract number of email address\" with value \"9999999999\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.FillCityCodeValue(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Search\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Table Filled",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTblFilled()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Right Click Invoice Want to Update based on sub contract number \"9999999999-3\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.selectUpdateInvoice(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Invoice Format is \"HCI format\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.checkFormat(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Update Data Value Based on Check Point",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.UpdateChooseDataValueInvoiceDetail()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check Corrected Result",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.TestingTestingCode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Save Invoice\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Update Data in Invoice Summary",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyAllInvoiceUpdate()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to get text of object \u0027\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.GetTextKeyword.getText(GetTextKeyword.groovy:88)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.GetTextKeyword.execute(GetTextKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.getText(WebUiBuiltInKeywords.groovy:914)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$getText$6.call(Unknown Source)\r\n\tat ist_real.Contract_Dispatcher.VerifyAllInvoiceUpdate(Contract_Dispatcher.groovy:1651)\r\n\tat ✽.Verify Update Data in Invoice Summary(C:/Users/ramsey.loloyanto/Documents/ist-Katalon/Include/features/IST_Real/TRIS/DEV/Tracker_Invoice_System_Update_Data.feature:87)\r\nCaused by: org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027ID-L3891\u0027, ip: \u0027192.168.43.212\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: com.kms.katalon.core.webui.driver.firefox.CGeckoDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 74.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200309095159, moz:geckodriverVersion: 0.23.0, moz:headless: false, moz:processID: 22236, moz:profile: C:\\Users\\ramsey.loloyanto\\A..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, proxy: Proxy(direct), rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5cfab809-dc84-4f4c-830d-8ff8d8840831\n*** Element info: {Using\u003dxpath, value\u003d//span[(text()\u003d\u00279999999999-3\u0027)]/../../following-sibling::td[2]/div/span}\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat com.kms.katalon.selenium.driver.CFirefoxDriver.execute(CFirefoxDriver.java:27)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:432)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.lambda$new$1(EventFiringWebDriver.java:105)\r\n\tat com.sun.proxy.$Proxy17.findElements(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElements(EventFiringWebDriver.java:182)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElements(WebUiCommonHelper.java:789)\r\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1150)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.GetTextKeyword$_getText_closure1.doCall(GetTextKeyword.groovy:78)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.GetTextKeyword$_getText_closure1.call(GetTextKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.GetTextKeyword.getText(GetTextKeyword.groovy:88)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.GetTextKeyword.execute(GetTextKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.getText(WebUiBuiltInKeywords.groovy:914)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$getText$6.call(Unknown Source)\r\n\tat ist_real.Contract_Dispatcher.VerifyAllInvoiceUpdate(Contract_Dispatcher.groovy:1651)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:169)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Tracker_Invoice_System_Update_Data.run(Tracker_Invoice_System_Update_Data:18)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:337)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:328)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:307)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:299)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:233)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:169)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:142)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:91)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1585753679055.run(TempTestSuite1585753679055.groovy:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Verify Update Data in Additional Detail",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.updateAddDetail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click button \"Logout\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Update Invoice Data School Invoice",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "Go to IST",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_IST_URL()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to open browser with url: \u0027\u0027\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.openBrowser(OpenBrowserKeyword.groovy:81)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.execute(OpenBrowserKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.openBrowser(WebUiBuiltInKeywords.groovy:60)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$openBrowser.call(Unknown Source)\r\n\tat ist_real.Login_IST.go_to_IST_URL(Login_IST.groovy:67)\r\n\tat ✽.Go to IST(C:/Users/ramsey.loloyanto/Documents/ist-Katalon/Include/features/IST_Real/TRIS/DEV/Tracker_Invoice_System_Update_Data.feature:94)\r\nCaused by: org.openqa.selenium.NoSuchSessionException: Tried to run command without establishing a connection\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027ID-L3891\u0027, ip: \u0027192.168.43.212\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: com.kms.katalon.core.webui.driver.firefox.CGeckoDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 74.0, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20200309095159, moz:geckodriverVersion: 0.23.0, moz:headless: false, moz:processID: 22236, moz:profile: C:\\Users\\ramsey.loloyanto\\A..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, proxy: Proxy(direct), rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 5cfab809-dc84-4f4c-830d-8ff8d8840831\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat com.kms.katalon.selenium.driver.CFirefoxDriver.execute(CFirefoxDriver.java:27)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.quit(RemoteWebDriver.java:452)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.lambda$new$1(EventFiringWebDriver.java:105)\r\n\tat com.sun.proxy.$Proxy17.quit(Unknown Source)\r\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.quit(EventFiringWebDriver.java:211)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.closeWebDriver(DriverFactory.java:1291)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.startNewBrowser(DriverFactory.java:293)\r\n\tat com.kms.katalon.core.webui.driver.DriverFactory.openWebDriver(DriverFactory.java:208)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword$_openBrowser_closure1.doCall(OpenBrowserKeyword.groovy:74)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword$_openBrowser_closure1.call(OpenBrowserKeyword.groovy)\r\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.openBrowser(OpenBrowserKeyword.groovy:81)\r\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.execute(OpenBrowserKeyword.groovy:67)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:72)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.openBrowser(WebUiBuiltInKeywords.groovy:60)\r\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$openBrowser.call(Unknown Source)\r\n\tat ist_real.Login_IST.go_to_IST_URL(Login_IST.groovy:67)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\r\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\r\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\r\n\tat cucumber.api.cli.Main.run(Main.java:35)\r\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\r\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:169)\r\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\r\n\tat Tracker_Invoice_System_Update_Data.run(Tracker_Invoice_System_Update_Data:18)\r\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\r\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:337)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:328)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:307)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:299)\r\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:233)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:169)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:142)\r\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:91)\r\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\r\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\r\n\tat TempTestSuite1585753679055.run(TempTestSuite1585753679055.groovy:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Login IST with valid credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "mobile.test",
        "heMxIzEAyQpycx257HePHg\u003d\u003d"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Login_IST.I_want_to_login_to_IST(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Login Success for contract dispatcher",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_IST.Login_Success_for_dispatcher()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Check User Login for Update",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.CheckUserLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Arrow Menu \"Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ArrowMenu(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Menu \"Tracker Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Type on Textbox label \"contract number of email address\" with value \"9999999999\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.FillCityCodeValue(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click button \"Search\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Table Filled",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTblFilled()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Right Click Invoice Want to Update based on sub contract number \"9999999999-1\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.selectUpdateInvoice(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Check Invoice Format is \"School Invoice\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.checkFormat(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Update Data Value Based on Check Point",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.UpdateChooseDataValueInvoiceDetail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Check Corrected Result",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.TestingTestingCode()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click button \"Save Invoice\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Update Data in Invoice Summary",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyAllInvoiceUpdate()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Update Data in Additional Detail",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.updateAddDetail()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click button \"Logout\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});