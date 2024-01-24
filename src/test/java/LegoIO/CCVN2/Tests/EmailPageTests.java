package LegoIO.CCVN2.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Pages.EmailPage;
import LegoIO.CCVN2.Utilities.ExtentFactory;


public class EmailPageTests {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@BeforeClass
	 public void report() {
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Email Inbox Page</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}
	@Test
	public void EmailVerification() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>Email Verification Test</b></p>");
		EmailPage EmailPage = new EmailPage(childTest);
		EmailPage.EmailVerification();
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
