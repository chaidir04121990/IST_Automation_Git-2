$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Non Customer/SLIK_Gateway_Non_Customer_View_Detail_when_Status_APPROVED-SUCCESS.feature");
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
  "name": "Select Status is \"APPROVED\"",
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
  "name": "Verify Search Result Based on Result Status",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Verify_Result_Status()"
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
  "status": "passed"
});
formatter.step({
  "name": "Take Screenshot \"View_detail_NonCutomer.png\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.takescreenshot(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Slik Result Detail Link",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Verify_Detail_Result()"
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