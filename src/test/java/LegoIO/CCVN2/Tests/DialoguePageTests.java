package LegoIO.CCVN2.Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Drivers.BaseDriver;
import LegoIO.CCVN2.Pages.DialoguePage;
import LegoIO.CCVN2.Utilities.ExtentFactory;

public class DialoguePageTests extends BaseDriver{
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	@BeforeClass
	 public void report() {
		  report = ExtentFactory.getInstance();
		  parentTest = report.createTest("<p style=\"font-size:20px;font-family: verdana;font-weight: bold;\">Dialogue Page</p>").assignAuthor("LegoIO QA TEAM").assignDevice("MacOS");
	}
	@Test(priority = 0)
	public void BandwithOption() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Dialogue Option Tests</p>");
		DialoguePage HomePage = new DialoguePage(childTest);
		HomePage.BandwithOption();

	}
	@Test(priority = 1)
	public void ShowProduct() throws IOException {
		
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Dialogue-Show Product Tests</p>");
		DialoguePage BandwithPage = new DialoguePage(childTest);
		BandwithPage.ShowProduct();

	}
	
	@Test(priority = 2)

	public void AddCart() throws IOException {

		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Dialogue-Add Cart Test</p>");
		DialoguePage BandwithPage = new DialoguePage(childTest);
		BandwithPage.AddCart();
	}
	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
