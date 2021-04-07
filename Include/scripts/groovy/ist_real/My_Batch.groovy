package ist_real
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.sql.Connection
import java.sql.Driver

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import cucumber.api.java.en.Given
import groovy.json.JsonSlurper
import groovy.sql.Sql
import internal.GlobalVariable


class My_Batch {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	Connection connection = null
	def Connect_DB(String value){
		try {
			def driver = Class.forName('oracle.jdbc.driver.OracleDriver') as Driver
		}
		catch (ClassNotFoundException e) {
			println e.printStackTrace()
		}
		def url= GlobalVariable.DB_URL
		def username = GlobalVariable.DB_Username
		def password = GlobalVariable.DB_Pass
		def sql = Sql.newInstance(url, username, password)
		//		def data_Tbl_Mybatch = []
		try {
			sql.eachRow(value){ row ->

				//				data_Tbl_Mybatch.add(row)
				println(data_Tbl_Mybatch.size())
				return(data_Tbl_Mybatch)
			}

		}
		catch(Exception e) {
			System.err.&println("Could not retrieve data from database "+ e.getMessage())
		}
	}

	@Given("Consume Endpoint Scheduler Information")
	def My_Batch_Endpoint() {
		def response = WS.sendRequest(findTestObject('MY_BATCH'))
		WS.verifyResponseStatusCode(response, 200)
		WS.verifyElementsCount(response, "activeJob", 2)
		def body = response.getResponseBodyContent()
		JsonSlurper slurper = new JsonSlurper()
		Map parsedJson = slurper.parseText(body)

		int count_activeJob = WS.getElementsCount(response,"activeJob")
		assert count_activeJob==GlobalVariable.Number_Job_Active
		println("Active Job: "+count_activeJob)
		for(int i=0;i<count_activeJob;i++){
			Map value = parsedJson.get("activeJob").get(i)
			if(i==0){
				for(int k=0;k<value.size();k++){
					String content = value.get(GlobalVariable.My_Batch_Header[k])
					assert content==GlobalVariable.Active_Job_1[k]
					println(content)
				}
			}
			else if(i==1){
				for(int k=0;k<value.size();k++){
					String content = value.get(GlobalVariable.My_Batch_Header[k])
					assert content==GlobalVariable.Active_Job_2[k]
					println(content)
				}
			}
			else{
				System.err.&println("DATA NOT FOUND")
			}

		}

	}
}