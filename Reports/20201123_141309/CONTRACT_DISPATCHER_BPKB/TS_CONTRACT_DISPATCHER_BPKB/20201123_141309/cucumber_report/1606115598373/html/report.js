$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/CONTRACT_DISPATCHER_BPKB/Update_Tbl_CDS_CDC_TRKRegMistake.feature");
formatter.feature({
  "name": "Update Table CONTRACT_DISPATCHER_SOURCE and CONTRACT_DISPATCHER_CLAIM for Contract Two Wheelers",
  "description": "  I want to use this template for Update Column Processed in CONTRACT_DISPATCHER_SOURCE and CONTRACT_DISPATCHER_CLAIM to make Contract Two Wheelers exist in Menu\n  Contract Dipatcher IST.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Update Table CONTRACT_DISPATCHER_SOURCE and CONTRACT_DISPTACHER_CLAIM",
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
  "name": "Update Tbl CONTRACT DISPATCHER SRC BPKB To Change PROCESSED From Y to N For BPKB",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Update_tbl_CDSB_Column_PROCESSED_BPKB()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Update Tbl CONTRACT DISPATCHER CLAIM To Delete PROCESS From Column STATUS",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Delete_value_PROCESS_from_column_STATUS()"
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