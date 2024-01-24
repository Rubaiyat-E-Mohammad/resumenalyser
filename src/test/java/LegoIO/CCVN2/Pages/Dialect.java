package LegoIO.CCVN2.Pages;

import java.io.IOException;

import LegoIO.CCVN2.Drivers.BaseDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import LegoIO.CCVN2.Drivers.PageDriver;
import LegoIO.CCVN2.Utilities.GetScreenShot;
import junit.framework.Assert;

public class Dialect extends BaseDriver {
	ExtentTest test;
	 public Dialect(ExtentTest test) {
		 PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		 this.test = test;
	 }
	 
	 @FindBys({
			@FindBy(xpath="//a[@href='/rw/service/dialect/home']"),
			
		})
		
	 WebElement dialect;
	 
	 @FindBys({
			@FindBy(xpath="//body/section[4]"),
			
		})
		
	 WebElement Section5;
	 
	 @FindBys({
		 @FindBy(xpath="//a[contains(text(),'Show all')]"),
		 
	 })
	 
	 WebElement SeeAll;
	 @FindBys({
		 @FindBy(xpath="//a[contains(text(),'Provide specific Java and Spring Boot-related interview questions')]"),
		 
	 })
	 
	 WebElement Product;
	 @FindBys({
		 @FindBy(xpath="//input[@value='50 java related questions']"),
		 
	 })
	 
	 WebElement ServiceOption;
	 @FindBys({
		 @FindBy(xpath="//button[@class='card-link btn btn-primary btn-xs rounded-1']"),
		 
	 })
	 
	 WebElement AddCart;
	 @FindBys({
		 @FindBy(xpath="//button[contains(text(),'Remove from Cart')]"),
		 
	 })
	 
	 WebElement RemoveFromCart;
	 @FindBys({
		 @FindBy(xpath="//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"),
		 
	 })
	 
	 WebElement ScrollServiceOption;
	 @FindBys({
		 @FindBy(xpath="//body/div[6]/nav[1]/div[1]"),
		 
	 })
	 
	 WebElement ScrollNavBar;
	 

	 JavascriptExecutor Scroll = (JavascriptExecutor) PageDriver.getCurrentDriver();
	 
	 
	 public void DialectOption() throws IOException {
		 try {
			 if(dialect.isDisplayed()) {
				
				 dialect.click();
				 Thread.sleep(5000);
			
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Dialect option is not working</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "dialect");
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(dialect.isDisplayed());
		 }
	 }

	 public void ShowProduct() throws IOException {
		
		 try {
		  Scroll.executeScript("arguments[0].scrollIntoView();", Section5);
			 Thread.sleep(3000);
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px;font-size:13px; font-family: verdana;\"><b>Product is not scrolling</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Section5");
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Section5.isDisplayed());
		 }
		 
		 
		 try {
			  if(SeeAll.isDisplayed()) {
			   SeeAll.click();
				  Thread.sleep(7000);
			  }
			 }
			 catch(Exception e) {
				 test.fail("<p style=\"color:#FF5353; font-size:13px;font-size:13px; font-family: verdana;\"><b>Seee All button is not working</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Section5");
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(Section5.isDisplayed());
			 }
		 
		 
		 
		 try {
			 if(Product.isDisplayed()) {
				 Product.click();
				 Thread.sleep(3000);
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px; font-family: verdana;\"><b>Product is not Showing Details</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Product");
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(Product.isDisplayed());
		 }
		 
		 
		 
		 try {
			 if(ServiceOption.isDisplayed()) {
				 Scroll.executeScript("arguments[0].scrollIntoView();", ScrollServiceOption);
				 Thread.sleep(3000);
				  ServiceOption.click();
				 Thread.sleep(3000);
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px; font-family: verdana;\"><b>ServiceOption is not working or available</b></p>");
			 Throwable t = new InterruptedException("Exception");
			 test.fail(t);
			 @SuppressWarnings("unused")
			 String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ServiceOption");
			 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			 Assert.assertTrue(ServiceOption.isDisplayed());
		 }
		 
		
		 
	 }
	 
	 public void AddCart() throws IOException {
		 try {
			 if(AddCart.isDisplayed()) {
				 AddCart.click();
				 Thread.sleep(3000);
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px; font-family: verdana;\"><b>AddCart is not working or unavailable</b></p>");
			 Throwable t = new InterruptedException("Exception");
			 test.fail(t);
			 @SuppressWarnings("unused")
			 String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AddCart");
			 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			 Assert.assertTrue(AddCart.isDisplayed());
		 }
		 
		 
		 try {
			 if(RemoveFromCart.isDisplayed()) {
				 Scroll.executeScript("arguments[0].scrollIntoView();", ScrollNavBar);
				 Thread.sleep(3000);
				  System.out.println("Product added on Cart");
				 
			 }
		 }
		 catch(Exception e) {
			 test.fail("<p style=\"color:#FF5353; font-size:13px; font-family: verdana;\"><b>Cart is not working or unavailable</b></p>");
			 Throwable t = new InterruptedException("Exception");
			 test.fail(t);
			 @SuppressWarnings("unused")
			 String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RemoveFromCart");
			 test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			 Assert.assertTrue(RemoveFromCart.isDisplayed());
		 }
		 
	 }
}
