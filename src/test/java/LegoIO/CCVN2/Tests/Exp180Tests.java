package LegoIO.CCVN2.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Drivers.BaseDriver;
import LegoIO.CCVN2.Pages.Exp180;
import LegoIO.CCVN2.Utilities.ExtentFactory;

public class Exp180Tests extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	 public void OpenUrl() {
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"font-size:20px;font-family: verdana;font-weight: bold;\">Exp180 Page</p>").assignAuthor("LegoIO QA TEAM").assignDevice("MacOS");
	}
	@Test(priority = 0)
	public void Exp180Option() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Exp180 Option Tests</p>");
		Exp180 Exp180 = new Exp180(childTest);
		Exp180.Exp180Option();

	}
	@Test(priority = 1)
	public void ShowProduct() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Exp180-Show Product Tests</p>");
		Exp180 Exp180 = new Exp180(childTest);
		Exp180.ShowProduct();

	}
	
	@Test(priority = 2)

	public void AddCart() throws IOException {

		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Exp180-Add Cart Test</p>");
		Exp180 Exp180 = new Exp180(childTest);
		Exp180.AddCart();
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
