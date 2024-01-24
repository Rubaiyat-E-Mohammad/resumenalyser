package LegoIO.CCVN2.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Drivers.BaseDriver;
import LegoIO.CCVN2.Drivers.PageDriver;
import LegoIO.CCVN2.Pages.SignUpPage;
import LegoIO.CCVN2.Utilities.ExtentFactory;


public class SignUpPageTests extends BaseDriver{
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@BeforeClass
	 public void openUrl() {
		  PageDriver.getCurrentDriver().manage().window().maximize(); 
		  PageDriver.getCurrentDriver().get(url);
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>Sign-Up Page</b></p>").assignAuthor("LegoIO QA TEAM").assignDevice("MacOS");
	}
	@Test(priority = -1)
	public void FormTest_With_Existing_Email() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>FormTest With Existing Email</b></p>");
		SignUpPage SignUpPage = new SignUpPage(childTest);
		SignUpPage.FormTest_With_Existing_Email();
	}
	@Test(priority = 0 )
	public void FormTest_With_Diffarent_Password() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>FormTest With Diffarent Password</b></p>");
		SignUpPage SignUpPage = new SignUpPage(childTest);
		SignUpPage.FormTest_With_Diffarent_Password();
	}
	@Test(priority = 1)
	public void FormTest_With_Only_Numaric_Password() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>FormTest With Only Numaric Password</b></p>");
		SignUpPage SignUpPage = new SignUpPage(childTest);
		SignUpPage.FormTest_With_Only_Numaric_Password();
	}
	@Test(priority = 2)
	public void FormTest_With_All_Valied_Values() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>FormTest With All Valied Values</b></p>");
		SignUpPage SignUpPage = new SignUpPage(childTest);
		SignUpPage.FormTest_With_All_Valied_Values();
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}

	}
