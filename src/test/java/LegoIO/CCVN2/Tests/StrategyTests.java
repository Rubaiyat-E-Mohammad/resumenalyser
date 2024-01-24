package LegoIO.CCVN2.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Pages.Strategy;
import LegoIO.CCVN2.Utilities.ExtentFactory;

public class StrategyTests {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	 public void report() {
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"font-size:20px;font-family: verdana;font-weight: bold;\">Strategy Page</p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}
	@Test(priority = 0)
	public void IdentityOption() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Strategy Option Tests</p>");
		Strategy Strategy = new Strategy(childTest);
		Strategy.StrategyOption();

	}
	@Test(priority = 1)
	public void ShowProduct() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Strategy-Show Product Tests</p>");
		Strategy Strategy = new Strategy(childTest);
		Strategy.ShowProduct();

	}
	
	@Test(priority = 2)

	public void AddCart() throws IOException {

		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Strategy-Add Cart Test</p>");
		Strategy Strategy = new Strategy(childTest);
		Strategy.AddCart();
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
