$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/RTD/Check_MPF_DONE.feature");
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
  "name": "Check Contract from RTD_CONTRACT where STATUS is DONE",
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
  "name": "Select Contract from Table in DB with Query \"SELECT RTD_CONTRACT_TEMP.KTP,RTD_CONTRACT_TEMP.CONTRACT_ID,RTD_CONTRACT_TEMP.RECIPIENT_BANK_ACCOUNT_NUMBER,RTD_CONTRACT_TEMP.STATUS FROM RTD_CONTRACT_TEMP LEFT JOIN RTD_CONTRACT ON RTD_CONTRACT_TEMP.CONTRACT_ID\u003dRTD_CONTRACT.CONTRACT_ID WHERE RTD_CONTRACT_TEMP.TYPE_CONTRACT\u003d\u0027MPF\u0027 AND RTD_CONTRACT.STATUS\u003d11 AND RTD_CONTRACT_TEMP.IS_RTD\u003d\u0027Y\u0027 AND RTD_CONTRACT.PGW_RESPONSE_CODE\u003d\u002700\u0027\"",
  "keyword": "And "
});
formatter.match({
  "location": "RTD.Query_to_Table(String)"
});
formatter.result({
  "status": "passed"
});
});