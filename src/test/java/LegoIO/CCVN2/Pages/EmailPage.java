package LegoIO.CCVN2.Pages;

import java.io.IOException;

import LegoIO.CCVN2.Drivers.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import LegoIO.CCVN2.Drivers.PageDriver;
import LegoIO.CCVN2.Utilities.GetScreenShot;
import junit.framework.Assert;

public class EmailPage extends BaseDriver {
	ExtentTest test;
	 public EmailPage(ExtentTest test) {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 this.test = test;
	 }
	 @FindBys({
			@FindBy(xpath="//td[@class='yX xY ']"),
			
		})
		
	 WebElement ClickInbox;
	 @FindBys({
		 @FindBy(xpath="//input[@placeholder='Search mail']"),
		 
	 })
	 
	 WebElement SearchMail;
	 @FindBys({
		 @FindBy(xpath="//a[contains(text(),'Click Here')]"),
		 
	 })
	 
	 WebElement ClickHere;

	 
	 public void EmailVerification() throws IOException {
		 try {
			 if(SearchMail.isDisplayed()) {
				 ClickInbox.click();
				 Thread.sleep(3000);
				 
				 ClickHere.click();
				 Thread.sleep(20000);
			
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Email Verification Failed</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FormTest_With_Existing_Email");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FormTest_With_Existing_Email.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(SearchMail.isDisplayed());
				PageDriver.getCurrentDriver().quit();
		 }
	 }
}
