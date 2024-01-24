package LegoIO.CCVN2.Pages;

import java.io.IOException;

import LegoIO.CCVN2.Drivers.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
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
import org.openqa.selenium.support.ui.Select;

public class Payment extends BaseDriver {
	WebDriver driver= PageDriver.getCurrentDriver();
	ExtentTest test;
	 public Payment(ExtentTest test) {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 this.test = test;
	 }
	 
	 
	 @FindBys({
		 @FindBy(xpath="//iframe[@class='component-frame visible']"),
		 
	 })
	 
	WebElement paymentFrame1;
	 
	 
	@FindBys({
	     @FindBy(xpath="//div[@aria-label='Debit or Credit Card']"),
	 })
	 WebElement paymentOptionBtn;
	
	
	@FindBys({
	@FindBy(xpath = "//iframe[@class='zoid-visible']"),
	 })
   WebElement paymentFrame2;
	
	@FindBys({
	@FindBy(id = "credit-card-number"),
	})
	 WebElement cartNumberField;
	@FindBys({
	@FindBy(xpath = "//input[@name='expiry-date']"), 
	})
	 WebElement expDateField;
	@FindBys({
	@FindBy(xpath = "//input[@name='credit-card-security']"), 
	})
	 WebElement CSCField;

	@FindBys({
	@FindBy(xpath = "//select[@id='billingAddress.country']"),
	})
	WebElement SelectRegion;

	@FindBys({
   	  @FindBy(xpath = "//input[@name='givenName']"), 
	})
	 WebElement bFristNameField;
	
	@FindBys({
	  @FindBy(xpath = "//input[@name='familyName']"), 
	})
	 WebElement bLasstNameField;
	
	@FindBys({
	  @FindBy(xpath = "//input[@id='billingAddress.postcode']"),
	})
      WebElement bPostalCodeField;
	
	@FindBys({
	  @FindBy(xpath = "//input[@name='phone']"), 
	})
	 WebElement bPhoneNumberField;
	
	@FindBys({
	  @FindBy(xpath = "//input[@name='email']"), 
	})
	 WebElement bEmailField;
	@FindBys({
	  @FindBy(xpath = "//button[@id='submit-button']"), })
	 WebElement payNowBtn;

	@FindBys({
			@FindBy(xpath="/html/body/div[6]/nav/div/a/img"),

	})

	WebElement home;
	
	 public void PaymentOption() throws IOException {
		 
		
			
			
			 try {
				 if(paymentFrame1.isDisplayed()) {
						driver.switchTo().frame(paymentFrame1);
						Thread.sleep(5000);
						paymentOptionBtn.click();
						Thread.sleep(5000);
				        JavascriptExecutor js2 = (JavascriptExecutor) driver;
				        js2.executeScript("arguments[0].scrollIntoView(true);", paymentFrame2);
						driver.switchTo().frame(paymentFrame2);
						Thread.sleep(3000);
					 
				 }
			 }
			 catch(Exception e) {
				 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Payment Option is not opening Properly</b></p>");
				 Throwable t = new InterruptedException("Exception");
				 test.fail(t);
				 @SuppressWarnings("unused")
				 String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PaymentOption");
				 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				 Assert.assertTrue(paymentFrame1.isDisplayed());
			 }
	 }
	 public void PaymentForm() throws InterruptedException, IOException {
		 
		 
		 
		 
		 try {
			 if(cartNumberField.isDisplayed()&&expDateField.isDisplayed()) {
				cartNumberField.sendKeys("4032031956134851");
				Thread.sleep(2000);
				expDateField.sendKeys("03/27");
				Thread.sleep(2000);
				CSCField.sendKeys("123");
				Thread.sleep(2000);
				Select region = new Select(SelectRegion);
				region.selectByValue("US");
				Thread.sleep(2000);
				bFristNameField.sendKeys("Thana");
				Thread.sleep(2000);
				bLasstNameField.sendKeys("tos");
				Thread.sleep(2000);
				bPostalCodeField.sendKeys("94588");
				Thread.sleep(2000);
				bPhoneNumberField.sendKeys("4083516772");
				Thread.sleep(2000);
				bEmailField.sendKeys("magumathanatos838@gmail.com");
				Thread.sleep(2000);
				payNowBtn.click();
				Thread.sleep(5000);
				driver.get(url);
				Thread.sleep(3000);
				 
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Payment Form is not working Properly</b></p>");
			 Throwable t = new InterruptedException("Exception");
			 test.fail(t);
			 @SuppressWarnings("unused")
			 String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PaymentForm");
			 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			 Assert.assertTrue(cartNumberField.isDisplayed()&&expDateField.isDisplayed());
		 }
	 }
}
