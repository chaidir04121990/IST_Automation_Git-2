$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Non Customer/Update_STATUS_APPROVED_SUCCESS.feature");
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
  "name": "Update STATUS from Table SLIK_DATA_CUSTOMER",
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
  "name": "Connect to Database",
  "keyword": "Given "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Conn_DB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Update Status \"SUCCESS\" in Table SLIK_DATA_NonCUSTOMER",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Update_StatusNC(String)"
});
formatter.result({
  "status": "passed"
});
});