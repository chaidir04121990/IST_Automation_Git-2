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
  "status": "passed"
});
formatter.step({
  "name": "Select Menu \"SLIK Gateway Non Customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Title \"SLIK Gateway Non Customer\" Exists",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTiltle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Title \"Check SLIK\" Exists",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTiltle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Contents of Check SLIK Label in SLIK Gateway Non Customer Menu Exist",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Verify_content_Check_SLIK_Non_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Title \"Search Result\" Exists",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTiltle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Contents of Search Result",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Verify_contect_search_result()"
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