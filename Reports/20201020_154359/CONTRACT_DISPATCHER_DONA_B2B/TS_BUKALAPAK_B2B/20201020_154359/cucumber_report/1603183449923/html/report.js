$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/CONTRACT_DISPATCHER_DONA_B2B/BUKALAPAK/Contract_Dispatcher_BUKALAPAK_B2B.feature");
formatter.feature({
  "name": "Contract Dispatcher for DONA BUKALAPAK B2B",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Assign User to Contract Dona B2B",
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
  "name": "Go to IST",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_IST_URL()"
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
  "name": "Select Arrow Menu \"Contract Dispatcher Admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ArrowMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Menu \"Management Assignment\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Username \"mobile.test\" of Management Assignment",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.UsernameofManagementAssignment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check for username if already assigned to \"Dona B2B\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.CheckUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait page for load",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.waitpageload()"
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
formatter.scenario({
  "name": "Select Menu Contract Dispatcher and Select Contract based on type contract DONA_BUKALAPAK_B2B",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.step({
  "name": "Go to IST",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_IST.go_to_IST_URL()"
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
  "name": "Select Menu \"Contract Dispatcher\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Contract Number based on Type Contract \"DONA_BUKALAPAK_B2B\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.Contract_Number_based_Type_Contract(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Claim\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Tab Mistake Matrix Base on Type Contract",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.VerifyTabMatrix()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Varify the mistake detail already match with the matrix Base on Type Contract",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.Tab_Matrix()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Tab \"KTP\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.clickonTab(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Checkbox General Mistake \"20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.checkboxGeneralMistake(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Choose Dropdown mistake type \"Beda RT\" from mistake name \"20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.Dropdown_mistaketypefrommistakename(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type on textarea note before based on mistake name \"20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP\" with value \"TESTING\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.notebeforeonmistakename(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type on textarea note after based on mistake name \"20. KTP atau Resi - Alamat tetap pemohon pada sistem (HoS) berbeda dengan KTP\" with value \"TESTING after\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.noteafteronmistakename(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Save\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get text from pop up \"IT Supporting Tools\" with text \"Mistake has been saved\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.gettextconfirmationadd(String,String)"
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