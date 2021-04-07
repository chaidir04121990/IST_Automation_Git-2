$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Non Customer/SLIK Gateway Non Customer Checking.feature");
formatter.feature({
  "name": "SLIK Checking Non Customer",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "SLIK Gateway Non Customer Checking",
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
  "name": "Input Data KTP Number",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Input_KTP_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Data \"Name *\" with value \"OPEX TestingAuto\" for Check SLIK",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Input(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Date of Birth \"20-02-1990\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_DOB(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Gender \"Laki-laki\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Gender(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Purpose is \"Penilaian Calon Kemitraan\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Purpose(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Data \"Place of Birth\" with value \"Jakarta\" for Check SLIK",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Input(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input Data \"Mother Maternity Name\" with value \"Tester Auto\" for Check SLIK",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Input(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input KTP Address \"TESTING AUTO JAKARTA\"",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Slik_Ktp(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Upload\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Upload file \"new_captcha1500.png\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.UploadFile(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Check SLIK\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get text from pop up \"Confirmation Submit Request\" with text \"Are you sure to submit this data ?\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.gettextconfirmationadd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Yes\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify KTP Number Request Success",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Verify_KTP_Number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
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