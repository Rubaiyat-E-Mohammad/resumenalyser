package LegoIO.CCVN2.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Pages.Cart;
import LegoIO.CCVN2.Utilities.ExtentFactory;

public class CartTests {
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	 public void report() {
		
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"font-size:20px;font-family: verdana;font-weight: bold;\">Cart Page</p>").assignAuthor("LegoIO QA TEAM").assignDevice("MacOS");
	}
	@Test(priority = 0)
	public void CartOparetions() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Cart Option Tests</p>");
		Cart Cart = new Cart(childTest);
		Cart.CartOparetions();

	}
	@AfterClass
	@Test(priority = 1)
	public void FileUplaod() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">File Uplaod  Tests</p>");
		Cart Cart = new Cart(childTest);
		Cart.FileUplaod();
		
	}
	
//	@AfterClass
//	public void afterClass(){
//		report.flush();
//	}
}
