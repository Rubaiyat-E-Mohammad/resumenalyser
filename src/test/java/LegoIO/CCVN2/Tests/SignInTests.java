package LegoIO.CCVN2.Tests;

import java.io.IOException;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Pages.SignIn;
import LegoIO.CCVN2.Utilities.ExtentFactory;
import LegoIO.CCVN2.Drivers.BaseDriver;

public class SignInTests {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@BeforeClass
	 public void report() {
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>SignIn  Page Tests</b></p>").assignAuthor("LegoIO QA TEAM").assignDevice("MacOS");
		  //BaseDriver.start();
	}
	
	@Test(priority = 1)
	public void SignInProcess() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>SignIn Process Test</b></p>");
		SignIn SignIn =new SignIn(childTest);
		SignIn.SignInProcess();
	}
	
	@Test(priority = 2)
	public void SignInForm() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>SignIn Form Test</b></p>");
		SignIn SignIn =new SignIn(childTest);
		SignIn.SignInForm();
	}
	@AfterClass
	public void afterClass() {
		report.flush();
		//BaseDriver.close();
	}

}
