$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Customer/SLIK Gateway Customer Checking.feature");
formatter.feature({
  "name": "SLIK Checking Customer",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "SLIK Gateway Customer Checking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
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
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to open browser with url: \u0027\u0027\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.openBrowser(OpenBrowserKeyword.groovy:81)\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.execute(OpenBrowserKeyword.groovy:67)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.openBrowser(WebUiBuiltInKeywords.groovy:61)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$openBrowser.call(Unknown Source)\n\tat ist_real.Login_IST.go_to_ISTools_URL(Login_IST.groovy:77)\n\tat ✽.Go to ISTools(/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Customer/SLIK Gateway Customer Checking.feature:24)\nCaused by: org.openqa.selenium.SessionNotCreatedException: session not created: This version of ChromeDriver only supports Chrome version 83\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027M-Chaidir-Pratama.local\u0027, ip: \u0027fe80:0:0:0:71:b31f:3b07:ba2f%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: CChromeDriver\nremote stacktrace: 0   chromedriver                        0x0000000100b09e99 chromedriver + 4808345\n1   chromedriver                        0x0000000100aa45f3 chromedriver + 4392435\n2   chromedriver                        0x000000010073029d chromedriver + 770717\n3   chromedriver                        0x000000010068d689 chromedriver + 104073\n4   chromedriver                        0x0000000100689940 chromedriver + 88384\n5   chromedriver                        0x0000000100686c99 chromedriver + 76953\n6   chromedriver                        0x00000001006b8fa3 chromedriver + 282531\n7   chromedriver                        0x00000001006b5da3 chromedriver + 269731\n8   chromedriver                        0x000000010068f8dd chromedriver + 112861\n9   chromedriver                        0x0000000100690875 chromedriver + 116853\n10  chromedriver                        0x0000000100acc47f chromedriver + 4555903\n11  chromedriver                        0x0000000100ad977a chromedriver + 4609914\n12  chromedriver                        0x0000000100ad9509 chromedriver + 4609289\n13  chromedriver                        0x0000000100ab0319 chromedriver + 4440857\n14  chromedriver                        0x0000000100ad9d03 chromedriver + 4611331\n15  chromedriver                        0x0000000100ac2083 chromedriver + 4513923\n16  chromedriver                        0x0000000100af0454 chromedriver + 4703316\n17  chromedriver                        0x0000000100b0ff57 chromedriver + 4833111\n18  libsystem_pthread.dylib             0x00007fff69af4d76 _pthread_start + 125\n19  libsystem_pthread.dylib             0x00007fff69af15d7 thread_start + 15\n\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat com.kms.katalon.selenium.driver.CChromeDriver.execute(CChromeDriver.java:19)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:147)\n\tat com.kms.katalon.selenium.driver.CChromeDriver.\u003cinit\u003e(CChromeDriver.java:13)\n\tat com.kms.katalon.core.webui.driver.DriverFactory.createNewChromeDriver(DriverFactory.java:392)\n\tat com.kms.katalon.core.webui.driver.DriverFactory.startNewBrowser(DriverFactory.java:350)\n\tat com.kms.katalon.core.webui.driver.DriverFactory.openWebDriver(DriverFactory.java:241)\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword$_openBrowser_closure1.doCall(OpenBrowserKeyword.groovy:74)\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword$_openBrowser_closure1.call(OpenBrowserKeyword.groovy)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.openBrowser(OpenBrowserKeyword.groovy:81)\n\tat com.kms.katalon.core.webui.keyword.builtin.OpenBrowserKeyword.execute(OpenBrowserKeyword.groovy:67)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.openBrowser(WebUiBuiltInKeywords.groovy:61)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$openBrowser.call(Unknown Source)\n\tat ist_real.Login_IST.go_to_ISTools_URL(Login_IST.groovy:77)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\n\tat cucumber.api.cli.Main.run(Main.java:35)\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:169)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\n\tat SLIK Gateway Customer Checking.run(SLIK Gateway Customer Checking:18)\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:339)\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:330)\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:309)\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:301)\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:235)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:191)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:141)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:90)\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\n\tat TempTestSuite1600881315732.run(TempTestSuite1600881315732.groovy:39)\n",
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
  "name": "Select Menu SLIK Gateway Customer",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Menu_SLIK_Gateway_Customer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Input Data KTP Number",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Input_KTP_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Input Data \"Name *\" with value \"OPEX TestingAuto\" for Check SLIK",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Input(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Input Date of Birth \"20-Feb-1990\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_DOB(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Gender \"Laki-laki\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Gender(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Select Purpose is \"Penilaian Calon Kemitraan\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Purpose(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Input Data \"Place of Birth\" with value \"Jakarta\" for Check SLIK",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Input(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Input Data \"Mother Maternity Name\" with value \"Tester Auto\" for Check SLIK",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Input(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Input KTP Address \"TESTING AUTO JAKARTA\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Ktp(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click button \"Check SLIK\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Get text from pop up \"Confirmation Submit Request\" with text \"Are you sure to submit this data ?\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.gettextconfirmationadd(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click button \"Yes\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify KTP Number Request Success",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Verify_KTP_Number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click button \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
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