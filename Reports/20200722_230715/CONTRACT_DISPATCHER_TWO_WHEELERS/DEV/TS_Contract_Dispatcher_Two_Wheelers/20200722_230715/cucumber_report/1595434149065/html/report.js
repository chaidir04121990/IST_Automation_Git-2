$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/CONTRACT_DISPATCHER_TWO_WHEELERS/DEV/Delete_ContractNumber_from_TRK_REGISTRATION_MISTAKE.feature");
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
  "name": "Delete Contract from TRK_REGISTRATION_MISTAKE",
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
  "name": "Connect to APP_ACCOUNT C1",
  "keyword": "Given "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Conn_DB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete Contract From TRK_REGISTRATION_MISTAKE",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Delete_Contract_from_TRK_REGISTRATION_MISTAKE()"
});
formatter.result({
  "status": "passed"
});
});