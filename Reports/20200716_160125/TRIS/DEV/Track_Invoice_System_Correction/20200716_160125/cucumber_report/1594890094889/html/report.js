$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/TRIS/DEV/Track_Invoice_System_Correction.feature");
formatter.feature({
  "name": "TRIS Correction",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Correction Check and Correction Remark",
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
  "name": "Do Correction Check and Correction Remark",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.correctionCheck()"
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
  "name": "Verify Update Checking Result in Invoice Summary",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.verifyCheckingResult()"
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
  "name": "Repeated Mistake Check",
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
  "name": "Do Repeated Mistake Check",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.repetMistakeCheck()"
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
  "name": "Verify Update Checking Result in Invoice Summary",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.verifyCheckingResult()"
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
});