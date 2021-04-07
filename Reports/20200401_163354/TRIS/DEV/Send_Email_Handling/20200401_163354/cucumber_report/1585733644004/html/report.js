$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ramsey.loloyanto/Documents/ist-Katalon/Include/features/IST_Real/TRIS/DEV/Send_Email_Handling.feature");
formatter.feature({
  "name": "Send Email Handling",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Send Email by Select Menu Email Handling from Invoice System then Generate Email Handling",
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
  "name": "Select Arrow Menu \"Invoice System\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ArrowMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Menu \"Email Handling\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Email handling \"Email tidak terdaftar\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectEmailHandling(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Type EmailClient on \"Alamat Email yang digunakan client\" with value \"ramsey.loloyanto@homecredit.co.id\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.TypeEmailClient(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click button \"Generate Email\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.ClickButton(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Email Handling",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.verify_email_handling()"
});
formatter.result({
  "error_message": "groovy.lang.MissingPropertyException: No such property: IST_Pop_Up_Message_Error for class: ist_real.Contract_Dispatcher\r\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.unwrap(ScriptBytecodeAdapter.java:53)\r\n\tat org.codehaus.groovy.runtime.callsite.GetEffectivePogoPropertySite.getProperty(GetEffectivePogoPropertySite.java:87)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callGroovyObjectGetProperty(AbstractCallSite.java:307)\r\n\tat ist_real.Contract_Dispatcher.verify_email_handling(Contract_Dispatcher.groovy:2187)\r\n\tat ✽.Verify Email Handling(C:/Users/ramsey.loloyanto/Documents/ist-Katalon/Include/features/IST_Real/TRIS/DEV/Send_Email_Handling.feature:36)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});