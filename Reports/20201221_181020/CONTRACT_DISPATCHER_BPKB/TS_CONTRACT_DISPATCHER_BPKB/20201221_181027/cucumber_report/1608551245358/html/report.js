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
  "error_message": "java.sql.SQLRecoverableException: IO Error: Operation timed out (Read failed)\n\tat oracle.jdbc.driver.T4CConnection.logoff(T4CConnection.java:857)\n\tat oracle.jdbc.driver.PhysicalConnection.close(PhysicalConnection.java:2502)\n\tat java_sql_Connection$close$0.call(Unknown Source)\n\tat Conn_DB.connectDB(Conn_DB.groovy:63)\n\tat Conn_DB$connectDB.call(Unknown Source)\n\tat CustomKeywords.Conn_DB.connectDB(CustomKeywords.groovy:200)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)\n\tat org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite$StaticMetaMethodSiteNoUnwrapNoCoerce.invoke(StaticMetaMethodSite.java:151)\n\tat org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite.call(StaticMetaMethodSite.java:91)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\n\tat try_it_out_Conn_DB.Conn_DB(try_it_out_Conn_DB.groovy:62)\n\tat ✽.Connect to Database(/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/CONTRACT_DISPATCHER_BPKB/Update_Tbl_CDS_CDC_TRKRegMistake.feature:26)\nCaused by: java.net.SocketException: Operation timed out (Read failed)\n\tat java.net.SocketInputStream.socketRead0(Native Method)\n\tat java.net.SocketInputStream.socketRead(SocketInputStream.java:116)\n\tat java.net.SocketInputStream.read(SocketInputStream.java:171)\n\tat java.net.SocketInputStream.read(SocketInputStream.java:141)\n\tat oracle.net.ns.Packet.receive(Packet.java:311)\n\tat oracle.net.ns.DataPacket.receive(DataPacket.java:105)\n\tat oracle.net.ns.NetInputStream.getNextPacket(NetInputStream.java:305)\n\tat oracle.net.ns.NetInputStream.read(NetInputStream.java:249)\n\tat oracle.net.ns.NetInputStream.read(NetInputStream.java:171)\n\tat oracle.net.ns.NetInputStream.read(NetInputStream.java:89)\n\tat oracle.jdbc.driver.T4CSocketInputStreamWrapper.readNextPacket(T4CSocketInputStreamWrapper.java:123)\n\tat oracle.jdbc.driver.T4CSocketInputStreamWrapper.read(T4CSocketInputStreamWrapper.java:79)\n\tat oracle.jdbc.driver.T4CMAREngineStream.unmarshalUB1(T4CMAREngineStream.java:429)\n\tat oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:397)\n\tat oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:257)\n\tat oracle.jdbc.driver.T4C7Ocommoncall.doOLOGOFF(T4C7Ocommoncall.java:59)\n\tat oracle.jdbc.driver.T4CConnection.logoff(T4CConnection.java:844)\n\tat oracle.jdbc.driver.PhysicalConnection.close(PhysicalConnection.java:2502)\n\tat java_sql_Connection$close$0.call(Unknown Source)\n\tat Conn_DB.connectDB(Conn_DB.groovy:63)\n\tat Conn_DB$connectDB.call(Unknown Source)\n\tat CustomKeywords.Conn_DB.connectDB(CustomKeywords.groovy:200)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)\n\tat org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite$StaticMetaMethodSiteNoUnwrapNoCoerce.invoke(StaticMetaMethodSite.java:151)\n\tat org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite.call(StaticMetaMethodSite.java:91)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\n\tat try_it_out_Conn_DB.Conn_DB(try_it_out_Conn_DB.groovy:62)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:48)\n\tat cucumber.runtime.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:50)\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\n\tat cucumber.runner.PickleStepTestStep.run(PickleStepTestStep.java:53)\n\tat cucumber.runner.TestCase.run(TestCase.java:47)\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\n\tat cucumber.runtime.Runtime.runFeature(Runtime.java:120)\n\tat cucumber.runtime.Runtime.run(Runtime.java:106)\n\tat cucumber.api.cli.Main.run(Main.java:35)\n\tat cucumber.api.cli.Main$run.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy:76)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$_runFeatureFile_closure1.doCall(CucumberBuiltinKeywords.groovy)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:325)\n\tat org.codehaus.groovy.runtime.metaclass.ClosureMetaClass.invokeMethod(ClosureMetaClass.java:294)\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1024)\n\tat groovy.lang.Closure.call(Closure.java:414)\n\tat groovy.lang.Closure.call(Closure.java:408)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain.runKeyword(KeywordMain.groovy:68)\n\tat com.kms.katalon.core.keyword.internal.KeywordMain$runKeyword.call(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:46)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile$0.callStatic(Unknown Source)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords.runFeatureFile(CucumberBuiltinKeywords.groovy:169)\n\tat com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords$runFeatureFile.call(Unknown Source)\n\tat Script1602586173655.run(Script1602586173655.groovy:18)\n\tat com.kms.katalon.core.main.ScriptEngine.run(ScriptEngine.java:194)\n\tat com.kms.katalon.core.main.ScriptEngine.runScriptAsRawText(ScriptEngine.java:119)\n\tat com.kms.katalon.core.main.TestCaseExecutor.runScript(TestCaseExecutor.java:339)\n\tat com.kms.katalon.core.main.TestCaseExecutor.doExecute(TestCaseExecutor.java:330)\n\tat com.kms.katalon.core.main.TestCaseExecutor.processExecutionPhase(TestCaseExecutor.java:309)\n\tat com.kms.katalon.core.main.TestCaseExecutor.accessMainPhase(TestCaseExecutor.java:301)\n\tat com.kms.katalon.core.main.TestCaseExecutor.execute(TestCaseExecutor.java:235)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestCaseMainPhase(TestSuiteExecutor.java:191)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.accessTestSuiteMainPhase(TestSuiteExecutor.java:141)\n\tat com.kms.katalon.core.main.TestSuiteExecutor.execute(TestSuiteExecutor.java:90)\n\tat com.kms.katalon.core.main.TestCaseMain.startTestSuite(TestCaseMain.java:157)\n\tat com.kms.katalon.core.main.TestCaseMain$startTestSuite$0.call(Unknown Source)\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:48)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:113)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:141)\n\tat TempTestSuite1608549027003.run(TempTestSuite1608549027003.groovy:39)\n\tat groovy.lang.GroovyShell.runScriptOrMainOrTestOrRunnable(GroovyShell.java:263)\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:518)\n\tat groovy.lang.GroovyShell.run(GroovyShell.java:507)\n\tat groovy.ui.GroovyMain.processOnce(GroovyMain.java:653)\n\tat groovy.ui.GroovyMain.run(GroovyMain.java:384)\n\tat groovy.ui.GroovyMain.process(GroovyMain.java:370)\n\tat groovy.ui.GroovyMain.processArgs(GroovyMain.java:129)\n\tat groovy.ui.GroovyMain.main(GroovyMain.java:109)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.codehaus.groovy.tools.GroovyStarter.rootLoader(GroovyStarter.java:109)\n\tat org.codehaus.groovy.tools.GroovyStarter.main(GroovyStarter.java:131)\n",
  "status": "failed"
});
formatter.step({
  "name": "Update Tbl CONTRACT DISPATCHER SRC BPKB To Change PROCESSED From Y to N For BPKB",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Update_tbl_CDSB_Column_PROCESSED_BPKB()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Update Tbl CONTRACT DISPATCHER CLAIM To Delete PROCESS From Column STATUS",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Delete_value_PROCESS_from_column_STATUS()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Delete Contract From TRK_REGISTRATION_MISTAKE",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Delete_Contract_from_TRK_REGISTRATION_MISTAKE()"
});
formatter.result({
  "status": "skipped"
});
});