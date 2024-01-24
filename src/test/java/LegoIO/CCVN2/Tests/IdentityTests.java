package LegoIO.CCVN2.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Pages.Identity;
import LegoIO.CCVN2.Utilities.ExtentFactory;

public class IdentityTests {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	 public void report() {
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"font-size:20px;font-family: verdana;font-weight: bold;\">Identity Page</p>").assignAuthor("LegoIO QA TEAM").assignDevice("MacOS");
	}
	@Test(priority = 0)
	public void IdentityOption() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Identity Option Tests</p>");
		Identity Identity = new Identity(childTest);
		Identity.IdentityOption();

	}
	@Test(priority = 1)
	public void ShowProduct() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Identity-Show Product Tests</p>");
		Identity Identity = new Identity(childTest);
		Identity.ShowProduct();

	}
	
	@Test(priority = 2)

	public void AddCart() throws IOException {

		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Identity-Add Cart Test</p>");
		Identity Identity = new Identity(childTest);
		Identity.AddCart();
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
