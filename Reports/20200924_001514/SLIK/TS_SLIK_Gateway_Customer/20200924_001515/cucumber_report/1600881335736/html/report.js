$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Customer/Delete_KTPNumber_From_DB.feature");
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
  "name": "Delete_KTPNumber_From_DB",
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
  "error_message": "java.sql.SQLException: ORA-00604: error occurred at recursive SQL level 1\nORA-20100: You are not allowed to connect to the database in this time.\nORA-06512: at line 91\n\n\tat oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:450)\n\tat oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:392)\n\tat oracle.jdbc.driver.T4CTTIoer.processError(T4CTTIoer.java:385)\n\tat oracle.jdbc.driver.T4CTTIfun.processError(T4CTTIfun.java:1018)\n\tat oracle.jdbc.driver.T4CTTIoauthenticate.processError(T4CTTIoauthenticate.java:501)\n\tat oracle.jdbc.driver.T4CTTIfun.receive(T4CTTIfun.java:522)\n\tat oracle.jdbc.driver.T4CTTIfun.doRPC(T4CTTIfun.java:257)\n\tat oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:437)\n\tat oracle.jdbc.driver.T4CTTIoauthenticate.doOAUTH(T4CTTIoauthenticate.java:954)\n\tat oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:639)\n\tat oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:666)\n\tat oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:32)\n\tat oracle.jdbc.driver.OracleDriver.connect(OracleDriver.java:566)\n\tat java.sql.DriverManager.getConnection(DriverManager.java:664)\n\tat java.sql.DriverManager.getConnection(DriverManager.java:247)\n\tat java_sql_DriverManager$getConnection.call(Unknown Source)\n\tat Conn_DB.connectDB(Conn_DB.groovy:67)\n\tat Conn_DB$connectDB.call(Unknown Source)\n\tat CustomKeywords.Conn_DB.connectDB(CustomKeywords.groovy:200)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:93)\n\tat org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite$StaticMetaMethodSiteNoUnwrapNoCoerce.invoke(StaticMetaMethodSite.java:151)\n\tat org.codehaus.groovy.runtime.callsite.StaticMetaMethodSite.call(StaticMetaMethodSite.java:91)\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:133)\n\tat try_it_out_Conn_DB.Conn_DB(try_it_out_Conn_DB.groovy:61)\n\tat ✽.Connect to Database(/Users/chaidir.pratama01/Katalon Studio/IST_Automation_Git/Include/features/IST_Real/SLIK/SLIK Gateway Customer/Delete_KTPNumber_From_DB.feature:25)\n",
  "status": "failed"
});
formatter.step({
  "name": "Delete Contract From SLIK_DATA_CUSTOMER",
  "keyword": "And "
});
formatter.match({
  "location": "try_it_out_Conn_DB.Delete_KTPnum_from_SLIK_DATA_CUSTOMER()"
});
formatter.result({
  "status": "skipped"
});
});