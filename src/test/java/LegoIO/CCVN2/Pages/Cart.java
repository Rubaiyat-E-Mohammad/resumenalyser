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

public class Cart extends BaseDriver {
	ExtentTest test;

	public Cart(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBys({
			@FindBy(xpath = "//body/div[6]/nav[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]"),

	})

	WebElement Cart;
	@FindBys({
			@FindBy(xpath = "//a[@class='btn btn-link btn-sm text-danger fw-bolder text-decoration-none']"),

	})

	WebElement EmptyCartButton;
	@FindBys({
			@FindBy(xpath = "//a[@id='cart_go_to_fileupload_btn']"),

	})

	WebElement Continue;
	@FindBys({
			@FindBy(id = "id_document"),

	})

	WebElement FillInput;
	@FindBys({
			@FindBy(xpath = "//button[@value='submit']"),

	})

	WebElement UploadAndContinueButton;

	JavascriptExecutor Scroll = (JavascriptExecutor) PageDriver.getCurrentDriver();

	public void CartOparetions() throws IOException {

		try {
			if (Cart.isDisplayed()) {
				Cart.click();
				Thread.sleep(2000);
				Scroll.executeScript("arguments[0].scrollIntoView();", EmptyCartButton);
				Thread.sleep(2000);
				Continue.click();
				Thread.sleep(2000);

			}
		} catch (Exception e) {
			System.out.println(e);
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Cart is not working Properly</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Cart");
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Cart.isDisplayed());
		}

	}

	public void FileUplaod() throws IOException {
		try {
				FillInput.sendKeys("/Users/rubaiyatemohammad/work/LegoIO LLC/CCVN2/upload.docx");
			Thread.sleep(2000);
				UploadAndContinueButton.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
			test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>FileUplaod is not working Properly</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FileUplaod");
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(FillInput.isDisplayed() && UploadAndContinueButton.isDisplayed());
		}
	}
}
