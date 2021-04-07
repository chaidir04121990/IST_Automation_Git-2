$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Approval Non Customer/Approve_KTP_Number.feature");
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
  "name": "Approve KTP Number by Checker",
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
    },
    {
      "cells": [
        "chaidir.pratama01",
        "LuLCKUUfG0dXlkzFaBQKvHwwWO/i8Paf"
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
  "name": "Select Menu \"SLIK Gateway Approval Non Customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Table Result Exist",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.VerifyTableExist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get Data From Table",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.GetDataFromTable()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Checkbox Validate",
  "keyword": "And "
});
formatter.match({
  "location": "Slik_Script.Checkbox_Validate()"
});
