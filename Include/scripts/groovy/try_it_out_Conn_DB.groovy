import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import oracle.jdbc.driver.*
import groovy.sql.Sql
import java.sql.Driver


class try_it_out_Conn_DB {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	String ContractNumber

	@Given("Connect to Database")
	def Conn_DB() {

		def conn = CustomKeywords.'Conn_DB.connectDB'(GlobalVariable.DB_Username, GlobalVariable.DB_Pass)
		return conn
	}

	@When("Execute Query")
	def Exec_query() {
		def exec_quer = CustomKeywords.'Conn_DB.executeQuery'()
		//		String prc = "${exec_quer}"
		//		TestObject new_obj = new TestObject().addProperty('query', ConditionType.EQUALS , exec_quer)
		//		println prc
		//		assert prc == "Y"
	}

	@And("Exec Query idle for Ten Minutes")
	def Exec_query_idle(){
		def exec_quer = CustomKeywords.'Conn_DB.Select_PROCESSED_in_tbl_CONTRACT_DISPATCHER_SRC_BPKB_when_STATUS_in_tbl_CONTRACT_DISPATCHER_CLAIM_is_RELEASE'()
	}

	@And('Exec Query idle for Ten Minutes \"([^\"]*)\"')
	def Execution_Query(String value){
		def exec_quer = CustomKeywords.'Conn_DB.Execution_Query'(value)
	}


	@And('Check Contract Number in Contract_Dispatcher_Claim \"([^\"]*)\"')
	def Execution_Query_Claim(String value){
		GlobalVariable.Quary_DB = value.substring(value.lastIndexOf("AND ") + 4)
		String test = GlobalVariable.Quary_DB
		println(test)
		def exec_quer = CustomKeywords.'Conn_DB.Contract_Dispatcher_Claim'(value)
	}

	@And('Check KTP Number in Slik DB \"([^\"]*)\"')
	def Execution_Query_Slik(String value){
		String SubKtp = value.substring(value.lastIndexOf("KTP") + 4)
		println(SubKtp)
		String SubKtp1 = SubKtp.split("AND")[0]
		println(SubKtp1)
		GlobalVariable.KtpNum = SubKtp1.replace("'", "").replaceAll("\\s+","")
		println(GlobalVariable.KtpNum)
		value=value+" WHERE KTP="+"'"+GlobalVariable.KTPnum_Customer+"'"
		def exec_quer = CustomKeywords.'Conn_DB.slik_Check'(value)
	}

	@And('Check KTP Number Customer in DB')
	def Select_KTP_Number_Customer_in_DB(){
		String value="SELECT * FROM SLIK_DATA_CUSTOMER WHERE KTP="+"'"+GlobalVariable.KTPnum_Customer+"'"
		GlobalVariable.KtpNum=GlobalVariable.KTPnum_Customer
		def exec_quer = CustomKeywords.'Conn_DB.slik_Check'(value)
	}

	@And('Check KTP Number Non Customer in DB')
	def Select_KTP_Number_Non_Customer_in_DB(){
		String value="SELECT * FROM SLIK_DATA_CUSTOMER WHERE KTP="+"'"+GlobalVariable.KTPnum_Non_Customer+"'"
		GlobalVariable.KtpNum=GlobalVariable.KTPnum_Non_Customer
		def exec_quer = CustomKeywords.'Conn_DB.slik_Check'(value)
	}

	@And('Check Contract Number in TRK_Registration_Mistake \"([^\"]*)\"')
	def Execution_Query_TRK(String value){
		def exec_quer = CustomKeywords.'Conn_DB.TRK_Registration_Mistake'(value)
	}

	@And('Check Contract Number in Ist_Mst_Corr_Log \"([^\"]*)\"')
	def Execution_Query_Ist(String value){
		def exec_quer = CustomKeywords.'Conn_DB.Ist_Mst_Corr_Log'(value)
	}

	@And('Check Contract Number Process in Contract_Dispatcher_Source \"([^\"]*)\"')
	def Execution_Query_Status(String value){
		def exec_quer = CustomKeywords.'Conn_DB.Contract_Dispatcher_Source_Process'(value)
	}

	@And('Exec Query for Delete Data From DB_C1 with query \"([^\"]*)\"')
	def Execution_query_Delete(String Query){
		def exec_quer = CustomKeywords.'Conn_DB.Execution_Query_Delete_Contract_Dispatcher_Claim'(Query)
	}

	@And('Update Tbl CONTRACT DISPATCHER SOURCE To Change PROCESSED From Y to N For TWO WHEELERS')
	def Update_tbl_CDS_Column_PROCESSED(){
		String stmt = "UPDATE CONTRACT_DISPATCHER_SOURCE SET PROCESSED='N' WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_for_Two_Wheelers+"'"
		String stmt2 = "SELECT * FROM CONTRACT_DISPATCHER_SOURCE WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_for_Two_Wheelers+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_CONTRACT_DISPATCHER_SOURCE'(stmt,stmt2)
		this.ContractNumber = GlobalVariable.Contract_Number_for_Two_Wheelers
	}

	@And('Update Tbl CONTRACT DISPATCHER SOURCE To Change PROCESSED From Y to N For TWO WHEELERS EFP')
	def Update_tbl_CDS_Column_PROCESSED_TW_EFP(){
		String stmt = "UPDATE CONTRACT_DISPATCHER_SOURCE SET PROCESSED='N' WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_for_Two_Wheelers_EFP+"'"
		String stmt2 = "SELECT * FROM CONTRACT_DISPATCHER_SOURCE WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_for_Two_Wheelers_EFP+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_CONTRACT_DISPATCHER_SOURCE'(stmt,stmt2)
		this.ContractNumber = GlobalVariable.Contract_Number_for_Two_Wheelers_EFP
	}

	@And('Update Tbl CONTRACT DISPATCHER SOURCE To Change PROCESSED From Y to N For TWO WHEELERS BPKB')
	def Update_tbl_CDS_Column_PROCESSED_BPKB(){
		String stmt = "UPDATE CONTRACT_DISPATCHER_SOURCE SET PROCESSED='N' WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_BPKB+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_CONTRACT_DISPATCHER_SOURCE'(stmt)
		this.ContractNumber = GlobalVariable.Contract_Number_Dispatcher_BPKB
	}

	@And('Update Tbl CONTRACT DISPATCHER SRC BPKB To Change PROCESSED From Y to N For BPKB')
	def Update_tbl_CDSB_Column_PROCESSED_BPKB(){
		String stmt = "UPDATE CONTRACT_DISPATCHER_SRC_BPKB SET PROCESSED='N' WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_BPKB+"'"
		String stmt2 = "SELECT * FROM CONTRACT_DISPATCHER_SRC_BPKB WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_BPKB+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_CONTRACT_DISPATCHER_SOURCE'(stmt,stmt2)
		this.ContractNumber = GlobalVariable.Contract_Number_Dispatcher_BPKB
	}

	@And('Update Tbl CONTRACT DISPATCHER SOURCE To Change PROCESSED From Y to N For BLIBLI')
	def Update_tbl_CDS_Column_PROCESSED_BLIBLI(){
		String stmt = "UPDATE CONTRACT_DISPATCHER_SOURCE SET PROCESSED='N' WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_Dona_BliBli+"'"
		String stmt2 = "SELECT * FROM CONTRACT_DISPATCHER_SOURCE WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_Dona_BliBli+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_CONTRACT_DISPATCHER_SOURCE'(stmt,stmt2)
		this.ContractNumber = GlobalVariable.Contract_Number_Dispatcher_Dona_BliBli
	}

	@And('Update Tbl CONTRACT DISPATCHER SOURCE To Change PROCESSED From Y to N For Bukalapak B2B')
	def Update_tbl_CDS_Column_PROCESSED_Bukalapak_B2B(){
		String stmt = "UPDATE CONTRACT_DISPATCHER_SOURCE SET PROCESSED='N' WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_Dona_Bukalapak_B2B+"'"
		String stmt2 = "SELECT * FROM CONTRACT_DISPATCHER_SOURCE WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_Dona_Bukalapak_B2B+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_CONTRACT_DISPATCHER_SOURCE'(stmt,stmt2)
		this.ContractNumber = GlobalVariable.Contract_Number_Dispatcher_Dona_Bukalapak_B2B
	}

	@And('Update Tbl CONTRACT DISPATCHER SOURCE To Change PROCESSED From Y to N For Credit Card')
	def Update_tbl_CDS_Column_PROCESSED_CreditCard(){
		String stmt = "UPDATE CONTRACT_DISPATCHER_SOURCE SET PROCESSED='N' WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_CC+"'"
		String stmt2 = "SELECT * FROM CONTRACT_DISPATCHER_SOURCE WHERE TEXT_CONTRACT_NUMBER="+"'"+GlobalVariable.Contract_Number_Dispatcher_CC+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_CONTRACT_DISPATCHER_SOURCE'(stmt,stmt2)
		this.ContractNumber = GlobalVariable.Contract_Number_Dispatcher_CC
	}

	@And('Update Tbl CONTRACT DISPATCHER CLAIM To Delete PROCESS From Column STATUS')
	def Delete_value_PROCESS_from_column_STATUS(){
		println(ContractNumber)
		String stmt = "DELETE FROM CONTRACT_DISPATCHER_CLAIM WHERE CONTRACT_NUMBER="+"'"+ContractNumber+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Delete_from_Table'(stmt)
	}

	@And('Delete Contract From TRK_REGISTRATION_MISTAKE')
	def Delete_Contract_from_TRK_REGISTRATION_MISTAKE(){
		String stmt = "DELETE FROM TRK_REGISTRATION_MISTAKE WHERE TEXT_CONTRACT_NUMBER="+"'"+ContractNumber+"'"
		println(ContractNumber)
		def exec_quer = CustomKeywords.'Conn_DB.Delete_from_Table'(stmt)
	}

	@And('Delete Contract From SLIK_DATA_CUSTOMER')
	def Delete_KTPnum_from_SLIK_DATA_CUSTOMER(){
		String stmt = "DELETE FROM SLIK_DATA_CUSTOMER WHERE KTP="+"'"+GlobalVariable.KTPnum_Customer+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Delete_from_Table'(stmt)
	}

	@And('Delete Contract From SLIK_DATA_NonCUSTOMER')
	def Delete_KTPnum_from_SLIK_DATA_NONCUSTOMER(){
		String stmt = "DELETE FROM SLIK_DATA_CUSTOMER WHERE KTP="+"'"+GlobalVariable.KTPnum_Non_Customer+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Delete_from_Table'(stmt)
	}

	@And("Update Status \"([^\"]*)\" in Table SLIK_DATA_CUSTOMER")
	def Update_Status(String value){
		String query1 = "UPDATE SLIK_DATA_CUSTOMER SET STATUS="+"'"+value+"'"+ " WHERE KTP="+"'"+GlobalVariable.KTPnum_Customer+"'"
		String query2 = "SELECT * FROM SLIK_DATA_CUSTOMER WHERE KTP="+"'"+GlobalVariable.KTPnum_Customer+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_SLIK_DATA_CUSTOMER'(query1,query2)
	}

	@And("Update Status \"([^\"]*)\" in Table SLIK_DATA_NonCUSTOMER")
	def Update_StatusNC(String value){
		String query1 = "UPDATE SLIK_DATA_CUSTOMER SET STATUS="+"'"+value+"'"+ " WHERE KTP="+"'"+GlobalVariable.KTPnum_Non_Customer+"'"
		String query2 = "SELECT * FROM SLIK_DATA_CUSTOMER WHERE KTP="+"'"+GlobalVariable.KTPnum_Non_Customer+"'"
		def exec_quer = CustomKeywords.'Conn_DB.Update_table_SLIK_DATA_CUSTOMER'(query1,query2)
	}
}