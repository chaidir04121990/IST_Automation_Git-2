$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/CONTRACT_DISPATCHER_DONA_B2B/BLIBLI/Contract_Dispatcher_BLIBLI.feature");
formatter.feature({
  "name": "Contract Dispatcher for DONA BLIBLI",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Assign User to Contract Dona B2B",
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
  "name": "Select Arrow Menu \"Contract Dispatcher Admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ArrowMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Menu \"Management Assignment\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Username \"mobile.test\" of Management Assignment",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.UsernameofManagementAssignment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check for username if already assigned to \"Dona B2B\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.CheckUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait page for load",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.waitpageload()"
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
  "name": "Select Menu Contract Dispatcher and Select Contract based on type contract DONA_BLIBLI",
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
  "name": "Select Menu \"Contract Dispatcher\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Contract Number based on Type Contract \"DONA_BLIBLI\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.Contract_Number_based_Type_Contract(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Claim\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Tab Mistake Matrix Base on Type Contract",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTabMatrix()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Varify the mistake detail already match with the matrix Base on Type Contract",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.Tab_Matrix()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Tab \"KTP\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.clickonTab(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Checkbox General Mistake \"20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.checkboxGeneralMistake(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Dropdown mistake type \"Beda RT\" from mistake name \"20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.Dropdown_mistaketypefrommistakename(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type on textarea note before based on mistake name \"20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP\" with value \"TESTING\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.notebeforeonmistakename(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type on textarea note after based on mistake name \"20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP\" with value \"TESTING after\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.noteafteronmistakename(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Save\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get text from pop up \"IT Supporting Tools\" with text \"Mistake has been saved\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.gettextconfirmationadd(String,String)"
});
formatter.result({
  "error_message": "com.kms.katalon.core.exception.StepFailedException: Unable to verify object \u0027\u0027 is present\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:26)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.verifyElementPresent(VerifyElementPresentKeyword.groovy:92)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.execute(VerifyElementPresentKeyword.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementPresent(WebUiBuiltInKeywords.groovy:1460)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementPresent$6.call(Unknown Source)\n\tat ist_real.Contract_Dispatcher.gettextconfirmationadd(Contract_Dispatcher.groovy:643)\n\tat ✽.Get text from pop up \"IT Supporting Tools\" with text \"Mistake has been saved\"(/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/CONTRACT_DISPATCHER_DONA_B2B/BLIBLI/Contract_Dispatcher_BLIBLI.feature:55)\nCaused by: com.kms.katalon.core.exception.StepFailedException: com.kms.katalon.core.webui.exception.WebElementNotFoundException: Web element with id: \u0027\u0027 located by \u0027//div[contains(text(),\"IT Supporting Tools\")]/following-sibling::div/table/tbody/tr/td/table/tbody/tr/td[5]/div/span[contains(text(),\"Mistake has been saved\")]\u0027 not found\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.stepFailed(WebUIKeywordMain.groovy:64)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword$_verifyElementPresent_closure1.doCall(VerifyElementPresentKeyword.groovy:85)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword$_verifyElementPresent_closure1.call(VerifyElementPresentKeyword.groovy)\n\tat com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain.runKeyword(WebUIKeywordMain.groovy:20)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.verifyElementPresent(VerifyElementPresentKeyword.groovy:92)\n\tat com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword.execute(VerifyElementPresentKeyword.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordExecutor.executeKeywordForPlatform(KeywordExecutor.groovy:73)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords.verifyElementPresent(WebUiBuiltInKeywords.groovy:1460)\n\tat com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords$verifyElementPresent$6.call(Unknown Source)\n\tat ist_real.Contract_Dispatcher.gettextconfirmationadd(Contract_Dispatcher.groovy:643)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\n\tat cucumber.api.cli.Main.run(Main.java:35)\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:169)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\n\tat TC BLIBLI - Contract Dispatcher BLIBLI.run(TC BLIBLI - Contract Dispatcher BLIBLI:18)\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:339)\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:330)\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:309)\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:301)\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:235)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:191)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:141)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:90)\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\n\tat TempTestSuite1606145390827.run(TempTestSuite1606145390827.groovy:39)\n",
  "status": "failed"
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