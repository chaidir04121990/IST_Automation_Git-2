$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/RTD/Check_MPF_Eligible_to_Disburse.feature");
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
  "name": "Check Contract MPF Eligible to Disburse",
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
  "name": "Connect to Database RTD",
  "keyword": "Given "
});
formatter.match({
  "location": "RTD.Connect_to_DB_RTD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Contract MPF that Eligible to Disburse",
  "keyword": "And "
});
formatter.match({
  "location": "RTD.Eligible_MPF_to_Disburse()"
});
formatter.result({
  "status": "passed"
});
});