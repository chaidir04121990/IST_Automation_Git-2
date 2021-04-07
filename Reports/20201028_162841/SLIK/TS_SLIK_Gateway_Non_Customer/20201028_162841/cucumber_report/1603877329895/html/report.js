$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Non Customer/Open_Menu_SLIK_Gateway_Non_Customer.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Menu SLIK Gateway Non Customer in IST and Verify Element Needed Exist",
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
  "name": "Go to ISTools",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_ISTools_URL()"
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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to verify object \u0027Object Repository/Page_/h1_Welcome to IT Supporting Tools\u0027 is present\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.verifyElementPresent(VerifyElementPresentKeyword.groovy:92)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.execute(VerifyElementPresentKeyword.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementPresent(WebUiBuiltInKeywords.groovy:1460)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementPresent$5.call(Unknown Source)\n\tat ist_real.Login_IST.Login_Success_for_dispatcher(Login_IST.groovy:174)\n\tat ✽.Login Success for contract dispatcher(/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Non Customer/Open_Menu_SLIK_Gateway_Non_Customer.feature:29)\nCaused by: org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d86.0.4240.111)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027M-Chaidir-Pratama.local\u0027, ip: \u0027fe80:0:0:0:4fd:4647:ecb9:787c%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: com.kms.katalon.selenium.driver.CChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /var/folders/0s/4_d154xd6dq...}, goog:chromeOptions: {debuggerAddress: localhost:57766}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c7ce9c98afc75a8ec07d0a24985edb29\n*** Element info: {Using\u003dxpath, value\u003d//h1[contains(text(),\u0027Welcome to IT Supporting Tools\u0027)]}\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat com.kms.katalon.selenium.driver.CChromeDriver.execute(CChromeDriver.java:19)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:432)\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:348)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:311)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.lambda$new$1(EventFiringWebDriver.java:105)\n\tat com.sun.proxy.$Proxy18.findElements(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElements(EventFiringWebDriver.java:182)\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementByNormalMethods(WebUiCommonHelper.java:999)\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsBySelectedMethod(WebUiCommonHelper.java:894)\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsBySelectedMethod(WebUiCommonHelper.java:877)\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsBySelectedMethod(WebUiCommonHelper.java:872)\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsByDefault(WebUiCommonHelper.java:868)\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findElementsWithSelfHealing(WebUiCommonHelper.java:729)\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElements(WebUiCommonHelper.java:717)\n\tat com.kms.katalon.core.webui.common.WebUiCommonHelper.findWebElement(WebUiCommonHelper.java:1349)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword.findWebElement(WebUIAbstractKeyword.groovy:27)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword$_verifyElementPresent_closure1.doCall(VerifyElementPresentKeyword.groovy:79)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword$_verifyElementPresent_closure1.call(VerifyElementPresentKeyword.groovy)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.verifyElementPresent(VerifyElementPresentKeyword.groovy:92)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.execute(VerifyElementPresentKeyword.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementPresent(WebUiBuiltInKeywords.groovy:1460)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementPresent$5.call(Unknown Source)\n\tat ist_real.Login_IST.Login_Success_for_dispatcher(Login_IST.groovy:174)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\n\tat cucumber.api.cli.Main.run(Main.java:35)\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:169)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\n\tat Open Menu SLIK Gateway Non Customer.run(Open Menu SLIK Gateway Non Customer:18)\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:339)\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:330)\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:309)\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:301)\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:235)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:191)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:141)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:90)\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\n\tat TempTestSuite1603877321220.run(TempTestSuite1603877321220.groovy:39)\n",
  "status": "failed"
});
formatter.step({
  "name": "Select Menu \"SLIK Gateway Non Customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Title \"SLIK Gateway Non Customer\" Exists",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTiltle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Title \"Check SLIK\" Exists",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTiltle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Contents of Check SLIK Label in SLIK Gateway Non Customer Menu Exist",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Verify_content_Check_SLIK_Non_Customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Title \"Search Result\" Exists",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTiltle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Contents of Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Verify_contect_search_result()"
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