$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/CONTRACT_DISPATCHER_BPKB/Column_PROCESSED_Turn_N_When_Status_RELEASE_BPKB.feature");
formatter.feature({
  "name": "Column PROCESSED in CONTRACT_DISPATCHER_SRC_BPKB change to be \u0027N\u0027 when STATUS in CONTRACT_DISPATCHER_CLAIM is RELEASE",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Claim Contract BPKB in Contract Dispatcher Menu then idle for 10 minutes, STATUS in Table CONTRACT_DISPATCHER_CLAIM turn RELEASE and PROCESSED in CONTRACT_DISPATCHER_SRC_BPKB turns N",
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
  "name": "Select Contract Number based on Type Contract \"BPKB\"",
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
  "name": "Sleep ten minutes",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.idle_contract_dispatcehr()"
});
formatter.result({
  "status": "passed"
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
  "name": "Exec Query idle for Ten Minutes \"SELECT * FROM CONTRACT_DISPATCHER_SRC_BPKB WHERE TEXT_CONTRACT_NUMBER\u003d\u0027333\u0027\"",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Execution_Query(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: PROCESSED Should be N. Expression: (prc \u003d\u003d N). Values: prc \u003d Y\n\tat org.codehaus.groovy.runtime.InvokerHelper.assertFailed(InvokerHelper.java:404)\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.assertFailed(ScriptBytecodeAdapter.java:650)\n\tat Conn_DB$_Execution_Query_closure3.doCall(Conn_DB.groovy:146)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:294)\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1024)\n\tat groovy.lang.Closure.call(Closure.java:414)\n\tat groovy.lang.Closure.call(Closure.java:430)\n\tat groovy.sql.Sql.eachRow(Sql.java:1196)\n\tat groovy.sql.Sql.eachRow(Sql.java:1152)\n\tat groovy.sql.Sql.eachRow(Sql.java:1091)\n\tat groovy.sql.Sql$eachRow$1.call(Unknown Source)\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\n\tat Conn_DB.Execution_Query(Conn_DB.groovy:143)\n\tat Conn_DB$Execution_Query$2.call(Unknown Source)\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\n\tat CustomKeywords.Conn_DB.Execution_Query(CustomKeywords.groovy:218)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)\n\tat org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite$StaticMetaMethodSiteNoUnwrapNoCoerce.invoke(StaticMetaMethodSite.java:151)\n\tat org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite.call(StaticMetaMethodSite.java:91)\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\n\tat try_it_out_Conn_DB.Execution_Query(try_it_out_Conn_DB.groovy:81)\n\tat ✽.Exec Query idle for Ten Minutes \"SELECT * FROM CONTRACT_DISPATCHER_SRC_BPKB WHERE TEXT_CONTRACT_NUMBER\u003d\u0027333\u0027\"(/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/CONTRACT_DISPATCHER_BPKB/Column_PROCESSED_Turn_N_When_Status_RELEASE_BPKB.feature:35)\n",
  "status": "failed"
});
formatter.step({
  "name": "Select Menu \"Contract Dispatcher\"",
  "keyword": "And "
});
formatter.match({
  "location": "Contract_Dispatcher.SelectMenu(String)"
});
formatter.result({
  "status": "skipped"
});
});