package LegoIO.CCVN2.Pages;

import java.io.IOException;
import java.util.ArrayList;

import LegoIO.CCVN2.Drivers.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import LegoIO.CCVN2.Drivers.PageDriver;
import LegoIO.CCVN2.Utilities.GetScreenShot;
import junit.framework.Assert;

public class SignIn extends BaseDriver {

	WebDriver driver = PageDriver.getCurrentDriver();

	ExtentTest test;
	 public SignIn(ExtentTest test) {
		 PageFactory.initElements(driver, this);
		 this.test = test;
	 }

	@FindBys({
			@FindBy(id="navbarAccount"),

	})

	WebElement MyAccount;


	 @FindBys({
		 @FindBy(xpath="//h6[contains(text(),'Sign In')]"),
		 
	 })
	 
	 WebElement SignInMenu;
	 
	 @FindBys({
		 @FindBy(id="id_email"),
		 
	 })
	 
	 WebElement Email;
	 
	 @FindBys({
		 @FindBy(id="id_password"),
		 
	 })
	 
	 WebElement Password;
	 
	 @FindBys({
		 @FindBy(xpath="//button[contains(text(),'Signin')]"),
		 
	 })
	 
	 WebElement SingInButton;

	@FindBys({
			@FindBy(xpath="//img[@alt='...']"),

	})

	WebElement home;
	 
	 public void SignInProcess() throws InterruptedException, IOException {

		 Thread.sleep(4000);
		 try {
			 MyAccount.click();
			 Thread.sleep(2000);
			 SignInMenu.click();
			 Thread.sleep(2000);
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>SignIn Process Failed</b></p>");
			 Throwable t = new InterruptedException("Exception");
			 test.fail(t);
			 String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SignInProcess");
			 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			 Assert.assertTrue(MyAccount.isDisplayed());
		 }
	 }
	 public void SignInForm() throws IOException {
		 try {
			 Email.sendKeys("rubaiyat.e.mohammad@g.bracu.ac.bd");
			 Thread.sleep(2000);
			 Password.sendKeys("T464656464656");
			 Thread.sleep(2000);
			 SingInButton.click();
			 Thread.sleep(10000);
			 home.click();
			 Thread.sleep(2000);
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>SignIn Form Failed</b></p>");
			 Throwable t = new InterruptedException("Exception");
			 test.fail(t);
			 String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SignInForm");
			 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			 Assert.assertTrue(MyAccount.isDisplayed());
		 }
	 }
}
