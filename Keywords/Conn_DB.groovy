	import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import java.sql.DriverManager
import java.sql.Driver

import java.sql.ResultSet

import java.sql.Statement
import java.lang.ref.ReferenceQueue.Null
import java.sql.*
import groovy.sql.Sql

//import com.kms.katalon.core.annotation.Keyword

import java.sql.Connection
import oracle.jdbc.driver.*
import internal.GlobalVariable

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.CallableStatement;

public class Conn_DB {
	private static Connection connection = null;

	/**
	 * Open and return a connection to database
	 * @param dataFile absolute file path
	 * @return an instance of java.sql.Connection
	 */

	//Establishing a connection to the DataBase

	@Keyword

	def connectDB(String Username, String Password){

		//Load driver class for your specific database type

		//		String conn = "jdbc:oracle:thin:@INFID04.ID.INFRA:1521/ID00C1HD.ID.INFRA"
		String conn = GlobalVariable.DB_URL

		//Class.forName("org.sqlite.JDBC")

		//String connectionString = "jdbc:sqlite:" + dataFile

		if(connection != null && !connection.isClosed()){

			connection.close()

		}

		connection = DriverManager.getConnection(conn, Username, Password)

		return connection

	}

	/**
	 * execute a SQL query on database
	 * @param queryString SQL query string
	 * @return a reference to returned data collection, an instance of java.sql.ResultSet
	 */

	//Executing the constructed Query and Saving results in result set

	@Keyword
	def executeQuery() {
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= "jdbc:oracle:thin:@INFID04.ID.INFRA:1521/ID00C1HD.ID.INFRA"
		def username = "APP_ACCOUNT"
		def password = "APP_ACCOUNT"
		def sql = Sql.newInstance(url, username, password)
		try {
			sql.eachRow("SELECT * FROM CONTRACT_DISPATCHER_SRC_BPKB WHERE TEXT_CONTRACT_NUMBER='331'"){ row ->
				//				println "CONTRACT NUMBER: " + row.TEXT_CONTRACT_NUMBER
				//				println "TYPE CONTRACT: " + row.TYPE_CONTRACT
				//				println "PROCESSED: " + row.PROCESSED
				println row.PROCESSED
				String prc = "${row.PROCESSED}"
				assert prc == "Y" : "PROCESSED Should be Y"
			}
		} finally {
			sql.close()
		}
	}

	@Keyword
	def Select_PROCESSED_in_tbl_CONTRACT_DISPATCHER_SRC_BPKB_when_STATUS_in_tbl_CONTRACT_DISPATCHER_CLAIM_is_RELEASE(){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= "jdbc:oracle:thin:@INFID04.ID.INFRA:1521/ID00C1HD.ID.INFRA"
		def username = "APP_ACCOUNT"
		def password = "APP_ACCOUNT"
		def sql = Sql.newInstance(url, username, password)
		try {
			sql.eachRow("SELECT * FROM CONTRACT_DISPATCHER_SRC_BPKB WHERE TEXT_CONTRACT_NUMBER='331'"){ row ->
				println row.PROCESSED
				String prc = "${row.PROCESSED}"
				assert prc == "N" : "PROCESSED Should be N"
			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def Execution_Query(String query){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= "jdbc:oracle:thin:@INFID04.ID.INFRA:1521/ID00C1HD.ID.INFRA"
		def username = "APP_ACCOUNT"
		def password = "APP_ACCOUNT"
		def sql = Sql.newInstance(url, username, password)
		try {
			sql.eachRow(query){ row ->
				println row.PROCESSED
				String prc = "${row.PROCESSED}"
				assert prc == "N" : "PROCESSED Should be N"
			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def Update_table_CONTRACT_DISPATCHER_SOURCE(String query,String query2){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		try {
			println(query)
			println(query2)
			sql.execute(query)
			sql.eachRow(query2){ row ->
				println row.PROCESSED
				String prc = "${row.PROCESSED}"
				assert prc == "N" : "PROCESSED Should be N After Update"
			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def Update_table_SLIK_DATA_CUSTOMER(String query, String query2){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		try {
			println(query)

			sql.execute(query)
			sql.eachRow(query2){ row ->
				println row.KTP
				println row.STATUS
				String sts = "${row.STATUS}"
				//				assert sts == "N" : "PROCESSED Should be N After Update"
			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def Delete_from_Table(String query){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		try {
			//			sql.execute(query)
			int deleted = sql.executeUpdate(query)
			if (deleted!=0){
				println("Delete Success")
			}
			else{
				println("No Affected Rows")
			}
			//			sql.eachRow("SELECT * FROM CONTRACT_DISPATCHER_SOURCE WHERE TEXT_CONTRACT_NUMBER='332'"){ row ->
			//				println row.PROCESSED
			//				String prc = "${row.PROCESSED}"
			//				assert prc == "N" : "PROCESSED Should be N After Update"
			//			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def Execution_Query_Delete_Contract_Dispatcher_Claim(String Query){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		try {
			sql.eachRow(Query){ row ->
				println row.CONTRACT_NUMBER
				println row.TYPE_CONTRACT
				println row.STATUS
				String Con_number = "${row.CONTRACT_NUMBER}"
				String Type_Contract = "${row.TYPE_CONTRACT}"
				String Status = "${row.STATUS}"
				assert STATUS == "RELEASE" : "STATUS Should be DONE"
			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def Contract_Dispatcher_Claim(String Query){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		try {
			sql.eachRow(Query){ row ->
				println row.STATUS
				String prc = "${row.STATUS}"
				if (GlobalVariable.Quary_DB =='CLAIM_DATE_END IS NULL'){
					assert prc == "PROCESS" : "STATUS Should be PROCESS"}
				else if (GlobalVariable.Quary_DB =="STATUS='DONE'"){
					assert prc == "DONE" : "STATUS Should be DONE"
				}
			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def TRK_Registration_Mistake(String Query){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		try {
			sql.eachRow(Query){ row ->
				println row.TEXT_CONTRACT_NUMBER
				println row.CODE_PRODUCT
				String tcn = "${row.TEXT_CONTRACT_NUMBER}"
			}
		}finally {
			sql.close()
		}
	}

	//	@Keyword
	//	def slik_Check(String Query){
	//		try {
	//			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
	//		} catch (ClassNotFoundException e)
	//		{
	//			println e.printStackTrace()
	//		}
	//		def url= GlobalVariable.DB_URL
	//		def username = GlobalVariable.DB_Username
	//		def password = GlobalVariable.DB_Pass
	//		def sql = Sql.newInstance(url, username, password)
	//		println("Connected database successfully")
	//		try {
	//			sql.eachRow(Query){ row ->
	//				println "KTP= "+row.KTP
	//				println "Type= "+row.TYPE
	//				println "Status= "+row.STATUS
	//				String ktp = "${row.KTP}"
	//				String type = "${row.TYPE}"
	//				String status = "${row.STATUS}"
	//				assert ktp == GlobalVariable.KtpNum : "KTP NUMBER"
	//			}
	//		}
	//		finally {
	//			sql.close()
	//		}
	//	}

	@Keyword
	def slik_Check(String Query){
		Connection connection = null
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
			def url= GlobalVariable.DB_URL
			def username = GlobalVariable.DB_Username
			def password =GlobalVariable.DB_Pass
			//def sql = Sql.newInstance(url, username, password)
			connection = DriverManager.getConnection(url,username,password)
			println("Connected database successfully")
		}catch(ClassNotFoundException e){
			println("Can't connect to database")
		}
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery(Query);
			println(Query)

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				String data = results.getString("KTP")
				println(results.getRow() + ": " + data)
				println("Status: "+ results.getString("STATUS"))
				println("Type: "+ results.getString("TYPE"))
			}

			//			while (results.next()) {
			////				String data = results.getString(3);
			//				String data = results.getString("KTP")
			//				println(results.getRow() + ": " + data)
			//			}
		}catch(Exception e)
		{
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@Keyword
	def Ist_Mst_Corr_Log(String Query){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		try {
			sql.eachRow(Query){ row ->
				println row.CONTRACT_NUMBER
				println row.DESCRIPTION
				println row.STATUS
			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def Contract_Dispatcher_Source_Process(String Query){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		} catch (ClassNotFoundException e)
		{
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		try {
			sql.eachRow(Query){ row ->
				println row.PROCESSED
				String prc = "${row.PROCESSED}"
				assert prc == "Y" : "PROCESSED Should be Y"
			}
		}finally {
			sql.close()
		}
	}

	@Keyword
	def DB_Table_SLIK_Checker(String Query){
		Connection connection = null
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
			def url= GlobalVariable.DB_URL
			def username = GlobalVariable.DB_Username
			def password =GlobalVariable.DB_Pass
			//def sql = Sql.newInstance(url, username, password)
			connection = DriverManager.getConnection(url,username,password)
			println("Connected database successfully")
		}catch(ClassNotFoundException e){
			println("Can't connect to database")
		}
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery(Query);
			println(Query)

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				String data = results.getString("KTP")
				println(results.getRow() + ": " + data)
				TestObject new_obj_ktp = new TestObject().addProperty('xpath',ConditionType.EQUALS, "//div[@class='z-column-content' and text()='KTP Number']/../../../../../following-sibling::div/following-sibling::div/table/tbody/tr/td[2]/div/span")
				String getKTP = WebUI.getText(new_obj_ktp)
				assert data==getKTP
			}
		}catch(Exception e)
		{
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}


	//		def executeQuery(String queryString) {
	//
	//			Statement stm = connection.createStatement()
	//
	//			ResultSet rs = stm.executeQuery(queryString)
	//
	//			ResultSetMetaData md = rs.getMetaData();
	//
	//			int columns = md.getColumnCount();
	//
	//			List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
	//
	//			while (rs.next())
	//			{
	//
	//				Map<String, Object> row = new HashMap<String, Object>(columns);
	//
	//				for(int i = 1; i <= columns; ++i)
	//				{
	//
	//					row.put(md.getColumnName(i), rs.getObject(i));
	//
	//				}
	//
	//				rows.add(row);
	//				return row
	//				println row
	//
	//			}
	//			return rows
	//			println rows
	//		}
	//
	//		//			println rs
	//		//
	//		//			return rs
	//
	//		//		}
	//
	//		//Closing the connection

	@Keyword

	def closeDatabaseConnection() {

		if(connection != null && !connection.isClosed()){

			connection.close()

		}

		connection = null

	}

	/**
	 * Execute non-query (usually INSERT/UPDATE/DELETE/COUNT/SUM...) on database
	 * @param queryString a SQL statement
	 * @return single value result of SQL statement
	 */

	@Keyword

	def execute(String queryString) {

		Statement stm = connection.createStatement()

		boolean result = stm.execute(queryString)

		return result

	}
}
