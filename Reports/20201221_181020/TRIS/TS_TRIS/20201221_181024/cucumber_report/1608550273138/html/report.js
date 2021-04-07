$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/TRIS/Addendum_Check_Contract_Status_in_BSL_And_CreditLimit_TRIS.feature");
formatter.feature({
  "name": "Addendum",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Check Contract Status from BSL is Active and Credit Left before 90%\t in TRIS is 0 Purpopse in BSL and TRIS are different",
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
  "name": "Go to BSL C1",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_BSL_C1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login BSL C1 with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "Login_IST.I_want_to_login_to_BSL_C1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login BSL C1 Succeed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_IST.Login_BSL_C1_Success()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \"Search for contract\"",
  "keyword": "And "
});
formatter.match({
  "location": "BSL_try.select(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Write Active Contract Number",
  "keyword": "And "
});
formatter.match({
  "location": "BSL_try.Write_BSL_Active_Contract_Number()"
});
formatter.result({
  "error_message": "groovy.lang.MissingPropertyException: No such property: Active_contract_number_in_BSL_for_TRIS_0 for class: internal.GlobalVariable\n\tat groovy.lang.MetaClassImpl.invokeStaticMissingProperty(MetaClassImpl.java:1004)\n\tat groovy.lang.MetaClassImpl.getProperty(MetaClassImpl.java:1859)\n\tat groovy.lang.MetaClassImpl.getProperty(MetaClassImpl.java:1835)\n\tat groovy.lang.MetaClassImpl.getProperty(MetaClassImpl.java:3735)\n\tat org.codehaus.groovy.runtime.callsite.ClassMetaClassGetPropertySite.getProperty(ClassMetaClassGetPropertySite.java:51)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callGetProperty(AbstractCallSite.java:296)\n\tat BSL_try.Write_BSL_Active_Contract_Number(BSL_try.groovy:79)\n\tat ✽.Write Active Contract Number(/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/TRIS/Addendum_Check_Contract_Status_in_BSL_And_CreditLimit_TRIS.feature:29)\n",
  "status": "failed"
});
formatter.step({
  "name": "Click Button \"Search\"",
  "keyword": "And "
});
formatter.match({
  "location": "BSL_try.click_btn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Check Contract Status BSL",
  "keyword": "And "
});
formatter.match({
  "location": "BSL_try.check_ContractStatus()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Go to ISTools",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_ISTools_URL()"
});
formatter.result({
  "status": "skipped"
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
  "name": "Type on Textbox label \"contract number of email address\" with Active Contract Number in BSL and TRIS Credit Left Before 90\u003d0",
  "keyword": "And "
});
formatter.match({
  "location": "TRIS_Function.Write_Active_Contract_Number_for_TRIS_CLB90_is_0(String)"
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
  "name": "Check_Credit_Left_before_90%",
  "keyword": "And "
});
formatter.match({
  "location": "TRIS_Function.Check_90_Credit_Limit()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click Button \"Submit\"",
  "keyword": "And "
});
formatter.match({
  "location": "BSL_try.click_btn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Get text from pop up \"Confirm\" with text \"Apakah Kamu yakin akan memproses invoice ini\"",
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
  "name": "Wait page for load",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.waitpageload()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Get text from pop up \"IT Supporting Tools\" with text \"Successfully submitted\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.gettextconfirmationadd(String,String)"
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
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.close_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Go to Outlook",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_Outlook_url()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Login Outlook with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "Login_IST.I_want_to_login_to_Outlook()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Login Outlook Succeed",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_IST.Login_Success_for_outlook()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Verify Email Addendum Sent",
  "keyword": "And "
});
formatter.match({
  "location": "TRIS_Function.Email_Addendum()"
});
formatter.result({
  "status": "skipped"
});
});