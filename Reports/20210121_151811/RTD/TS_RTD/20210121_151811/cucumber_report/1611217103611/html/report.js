$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/RTD/Check_MPF_Waiting_for_Approval_from_InPayment.feature");
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
  "name": "Check Contract from RTD_CONTRACT_TEMP where Status is Waiting for approval from In Payment",
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
  "name": "Select Contract from Table in DB with Query \"SELECT * FROM RTD_CONTRACT WHERE STATUS\u003d3\"",
  "keyword": "And "
});
formatter.match({
  "location": "RTD.Query_to_Table(String)"
});
formatter.result({
  "status": "passed"
});
});