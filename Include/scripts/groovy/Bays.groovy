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

import internal.GlobalVariable
import java.text.SimpleDateFormat

public class Bays {
	private static String getMethodName(final int depth) {
		final StackTraceElement[] ste = Thread.currentThread().getStackTrace();

		//System. out.println(ste[ste.length-depth].getClassName()+"#"+ste[ste.length-depth].getMethodName());
		// return ste[ste.length - depth].getMethodName();  //Wrong, fails for depth = 0
		//return ste[ste.length - 1 - depth].getMethodName(); //Thank you Tom Tresansky
		return ste[2 + depth].getMethodName(); //Thank you Tom Tresansky
	}

	public static String getCurrentDate(String format) {

		Date dt = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(dt);
	}

	public static void testx(String x) {
		System.out.print("(" + getCurrentDate("d/M H:m:s:SSS") + ")<" + getMethodName(1) + "> " + x);
	}


	public static void wait(int second) {
		//test("Thread.sleep.. " + second + " sec");
		try {

			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
			System.out.println("gabisa");
		}
	}
}
