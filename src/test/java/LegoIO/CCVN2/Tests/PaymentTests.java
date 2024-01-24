package LegoIO.CCVN2.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Pages.Payment;
import LegoIO.CCVN2.Utilities.ExtentFactory;

public class PaymentTests {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	 public void Report() {
		
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"font-size:20px;font-family: verdana;font-weight: bold;\">Payment Page</p>").assignAuthor("LegoIO QA TEAM").assignDevice("MacOS");
	}
	
	@Test(priority = 0)
	public void PaymentOption() throws IOException, InterruptedException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Payment Option Tests</p>");
		Payment Payment = new Payment(childTest);
		Payment.PaymentOption();

	}
	@Test(priority = 1)
	public void PaymentForm() throws IOException, InterruptedException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Payment Form  Tests</p>");
		Payment Payment = new Payment(childTest);
		Payment.PaymentForm();
		
	}
	
//	@AfterClass
//	public void afterClass() {
//		report.flush();
//	}
	
}
