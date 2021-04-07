$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Non Customer/SLIK_Gateway_Non_Customer_View_Detail.feature");
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
  "name": "SLIK Gateway Non Customer View Detail Link",
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
  "status": "passed"
});
formatter.step({
  "name": "Select Menu SLIK Gateway NonCustomer",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Menu_SLIK_Gateway_NonCustomer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Data KTP Number for Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Input_KTP_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Status is \"REQUESTED\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Status(String)"
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
  "name": "Verify Search Result with KTP Number",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Verify_KTP_Number_Search_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Search Result data",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Verify_Result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click View Detail Link",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Verify_Detail()"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to verify object \u0027\u0027 is present\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.verifyElementPresent(VerifyElementPresentKeyword.groovy:92)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.execute(VerifyElementPresentKeyword.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementPresent(WebUiBuiltInKeywords.groovy:1460)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementPresent$5.call(Unknown Source)\n\tat Slik_Script.Slik_Verify_Detail(Slik_Script.groovy:341)\n\tat ✽.Click View Detail Link(/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Non Customer/SLIK_Gateway_Non_Customer_View_Detail.feature:38)\nCaused by: com.kms.katalon.core.exception.StepFailedException: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027\u0027 located by \u0027//span[text()\u003d\u0027Search Result\u0027]/../../../following-sibling::div[@class\u003d\u0027z-groupbox-content\u0027]/div[@class\u003d\u0027z-grid\u0027]/div[@class\u003d\u0027z-grid-body\u0027]/table/tbody/tr/td[7]/div/div/span\u0027 not found\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword$_verifyElementPresent_closure1.doCall(VerifyElementPresentKeyword.groovy:85)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword$_verifyElementPresent_closure1.call(VerifyElementPresentKeyword.groovy)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.verifyElementPresent(VerifyElementPresentKeyword.groovy:92)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.execute(VerifyElementPresentKeyword.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementPresent(WebUiBuiltInKeywords.groovy:1460)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementPresent$5.call(Unknown Source)\n\tat Slik_Script.Slik_Verify_Detail(Slik_Script.groovy:341)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\n\tat cucumber.api.cli.Main.run(Main.java:35)\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:169)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\n\tat SLIK Gateway Non Customer View Detail.run(SLIK Gateway Non Customer View Detail:18)\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:339)\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:330)\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:309)\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:301)\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:235)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:191)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:141)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:90)\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\n\tat TempTestSuite1600937049329.run(TempTestSuite1600937049329.groovy:39)\n",
  "status": "failed"
});
formatter.step({
  "name": "Take Screenshot \"View_detail_NonCutomer.png\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.takescreenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Slik Result Detail Link",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Verify_Detail_Result()"
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