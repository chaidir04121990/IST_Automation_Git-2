package db_commission_engine

import java.sql.Connection
import java.sql.Driver
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

import com.kms.katalon.core.annotation.Keyword

import internal.GlobalVariable

public class DB_ComEng {
	private static Connection connection = null;

	@Keyword
	def Connect_DB(){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
			def url= GlobalVariable.DB_URL_ComEng
			def username = GlobalVariable.DB_Username_ComEng
			def password =GlobalVariable.DB_Pass_ComEng
			connection = DriverManager.getConnection(url,username,password)
			println("Connected database successfully")
		}catch(ClassNotFoundException e){
			println("Can't connect to database")
		}
	}

	@Keyword
	def Select_CE_MASTER_DATA(String value){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery(value)
			println(value)

			results.beforeFirst()
			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				println("CONTRACT_NUMBER"+" "+"PRESENTED_INTEREST_RATE"+" "+"LOAN_AMOUNT")
				String contractID = results.getString("CONTRACT_NUMBER")
				Float PresentedInterestRate = results.getFloat("PRESENTED_INTEREST_RATE")
				Integer LoanAmount = results.getInt("LOAN_AMOUNT")
				return contractID
			}
		}
		catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}


	@Keyword
	def Execute_Query(String query){
		try{
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet results = statement.executeQuery(query);
			println(query)

			results.beforeFirst()

			if(results.next()==false){
				System.err.&println("DATA DOES NOT EXIST!!! Please Check your query")
			}
			else{
				String Contract_Number = results.getString("CONTRACT_NUMBER")
				String ID_Sales_Agent = results.getString("ID_SALES_AGENT")
				String Product_Profile_Code = results.getString("PRODUCT_PROFILE_CODE")
				println(Contract_Number+" "+ID_Sales_Agent+" "+Product_Profile_Code)
			}
		}catch(Exception e) {
			println("Could not retrieve data from database "+ e.getMessage())
		}
	}
}
