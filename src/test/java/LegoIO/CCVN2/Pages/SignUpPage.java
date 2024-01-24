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


public class SignUpPage extends BaseDriver {
	ExtentTest test;
	 public SignUpPage(ExtentTest test) {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 this.test = test;
	 }
	 
	 @FindBys({
			@FindBy(xpath="//input[@id='id_first_name']"),
			
		})
		
	 WebElement FirstName;
	 @FindBys({
		 @FindBy(xpath="//input[@id='id_last_name']"),
		 
	 })
	 
	 WebElement LastName;
	 @FindBys({
		 @FindBy(xpath="//input[@id='id_email']"),
		 
	 })
	 
	 WebElement Email;
	 @FindBys({
		 @FindBy(xpath="//input[@id='id_password1']"),
		 
	 })
	 
	 WebElement Password;
	 @FindBys({
		 @FindBy(xpath="//input[@id='id_password2']"),
		 
	 })
	 
	 WebElement Confirm_Password;
	 
	 @FindBys({
		 @FindBy(xpath="//p[@id='error_1_id_email']"),
		 
	 })
	 
	 WebElement EmailError;
	 
	 @FindBys({
		 @FindBy(xpath="//p[@id='error_1_id_password2']"),
		 
	 })
	 
	 WebElement PasswordError1;
	 
	 @FindBys({
		 @FindBy(xpath="//p[@id='error_1_id_password2']"),
		 
	 })
	 
	 WebElement PasswordError2;
	 
	 @FindBys({
		 @FindBy(xpath="//button[contains(text(),'Signup')]"),
		 
	 })
	 
	 WebElement Signup;
	 
	 
	 
//	Form Test with Existing email address:
	
	 public void FormTest_With_Existing_Email() throws IOException {
		 try {
			 if(FirstName.isDisplayed()&& LastName.isEnabled()&& Email.isEnabled()&& Password.isEnabled()&& Confirm_Password.isEnabled()) {
				 FirstName.sendKeys("Abdullah");
				 Thread.sleep(2000);
				 LastName.sendKeys("Sayid");
				 Thread.sleep(2000);
				 Email.sendKeys("abdullahsayid1218@gmail.com");
				 Thread.sleep(2000);
				 Password.sendKeys("SI..12ing");
				 Thread.sleep(2000);
				 Confirm_Password.sendKeys("SI..12ing");
				 Thread.sleep(2000);
				 Signup.click();
				 Thread.sleep(2000);
			 }
			 
		 }
		 catch(Exception e) 
		 {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>FormTest With Existing Email Failed</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FormTest_With_Existing_Email");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FormTest_With_Existing_Email.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(FirstName.isDisplayed()&& LastName.isEnabled()&& Email.isEnabled()&& Password.isEnabled()&& Confirm_Password.isEnabled());
				PageDriver.getCurrentDriver().quit();
	     
	     }
		 
		 
		 
		 try {
			 if(EmailError.getText()=="A user with that email address already exists in our system. Please try a different email or Reset Password.") 
			 {
				 System.out.print("FormTest_With_Existing_Email Passed");
			 }
		 }
		 catch(Exception e) 
		 {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Existing Email error not shwoing</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "EmailError");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "EmailError.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(EmailError.getText()=="A user with that email address already exists in our system. Please try a different email or Reset Password.");
				PageDriver.getCurrentDriver().quit();
	     
	     }
		 
		 
	 }
	 
//	 FormTest_With_Diffarent_Password:
	 
	 public void FormTest_With_Diffarent_Password() throws IOException {
		 try {
			 if( Email.isEnabled()&& Password.isEnabled()&& Confirm_Password.isEnabled()) {
				 Email.clear();
				 Thread.sleep(2000);
				 Email.sendKeys("sqaking543@gmail.com");
				 Thread.sleep(2000);
				 Password.clear();
				 Thread.sleep(2000);
				 Password.sendKeys("SR..12ing");
				 Thread.sleep(2000);
				 Confirm_Password.clear();
				 Thread.sleep(2000);
				 Confirm_Password.sendKeys("SI..12ing");
				 Thread.sleep(2000);
				 Signup.click();
				 Thread.sleep(2000);
				
			 }
		 }
		 catch(Exception e) 
		 {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>FormTest With Diffarent Password Test Failed</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FormTest_With_Diffarent_Password");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FormTest_With_Diffarent_Password.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Email.isEnabled()&& Password.isEnabled()&& Confirm_Password.isEnabled());
				PageDriver.getCurrentDriver().quit();
			 
		 }
		 
		 try {
			 if(PasswordError1.getText()=="Passwords didnot match") 
			 {
				 System.out.print("FormTest With Diffarent Password Test Passed");
			 }
		 }
		 catch(Exception e) 
		 {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Passwords didnot match not showing</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PasswordError1");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PasswordError1.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(PasswordError1.getText()=="Passwords didnot match");
				PageDriver.getCurrentDriver().quit();
	     
	     }
		 
	 }
//	 FormTest_With_Only_Numaric_Password:
	 
	 public void FormTest_With_Only_Numaric_Password() throws IOException {
		 try {
			 if(FirstName.isDisplayed()&& LastName.isEnabled()&& Email.isEnabled()&& Password.isEnabled()&& Confirm_Password.isEnabled()) {
				 Password.clear();
				 Thread.sleep(2000);
				 Password.sendKeys("12345678");
				 Confirm_Password.clear();
				 Thread.sleep(2000);
				 Confirm_Password.sendKeys("12345678");
				 Thread.sleep(2000);
				 Signup.click();
				 Thread.sleep(2000);
			 }
		 }
		 catch(Exception e) 
		 {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>FormTest With Only_Numaric Password Test Failed</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FormTest_With_Only_Numaric_Password");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FormTest_With_Only_Numaric_Password.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Password.isEnabled()&& Confirm_Password.isEnabled());
				PageDriver.getCurrentDriver().quit();
			 
		 }
		 
		 
		 try {
			 if(PasswordError2.getText()=="This password is entirely numeric.") 
			 {
				 System.out.print("FormTest With Only Numaric Password Test Passed");
			 }
		 }
		 catch(Exception e) 
		 {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>This password is entirely numeric not showing</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PasswordError2");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PasswordError2.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(PasswordError2.getText()=="This password is entirely numeric.");
				PageDriver.getCurrentDriver().quit();
	     
	     
	     }
		 
	 }
	 
	 
	 
//	 FormTest_With_All_Valied_Values:
	 
	 public void FormTest_With_All_Valied_Values() throws IOException {
		 try {
			 if(FirstName.isDisplayed()&& LastName.isEnabled()&& Email.isEnabled()&& Password.isEnabled()&& Confirm_Password.isEnabled()) {
				 Password.clear();
				 Thread.sleep(2000);
				 Password.sendKeys("SI..12ing");
				 Confirm_Password.clear();
				 Thread.sleep(2000);
				 Confirm_Password.sendKeys("SI..12ing");
				 Thread.sleep(2000);
				 Signup.click();
				 Thread.sleep(2000);
			 }
		 }
		 catch(Exception e) 
		 {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>FormTest With All Valied Values Test Failed</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FormTest_With_All_Valied_Values");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FormTest_With_All_Valied_Values.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Password.isEnabled()&& Confirm_Password.isEnabled());
				PageDriver.getCurrentDriver().quit();
			 
		 }
		 
		 
	 }
}
