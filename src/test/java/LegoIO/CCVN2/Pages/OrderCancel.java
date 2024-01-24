package LegoIO.CCVN2.Pages;

import LegoIO.CCVN2.Drivers.BaseDriver;
import LegoIO.CCVN2.Drivers.PageDriver;
import LegoIO.CCVN2.Utilities.GetScreenShot;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import junit.framework.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class OrderCancel extends BaseDriver {

    WebDriver driver= PageDriver.getCurrentDriver();
    ExtentTest test;
    public OrderCancel(ExtentTest test) {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
        this.test = test;
    }

    @FindBys({
            @FindBy(xpath="//span[@class='fs-sm fw-bolder text-primary']"),

    })

    WebElement profile;

    @FindBys({
            @FindBy(xpath="//h6[normalize-space()='Profile Home']"),

    })

    WebElement profilehome;

    @FindBys({
            @FindBy(xpath = "//a[normalize-space()='My Order History']"),
    })

    WebElement myorder;

    @FindBys({
            @FindBy(xpath = "//a[@class='btn btn-outline-secondary active']"),
    })

    WebElement dashboard;

    @FindBys({
            @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/ul[1]/li[2]/a[1]"),
    })

    WebElement cancelorder;

    @FindBys({
            @FindBy(xpath = "//textarea[@id='id_message']"),
    })

    WebElement message;

    @FindBys({
            @FindBy(xpath = "//button[@type='submit']"),
    })

    WebElement confirmcancel;

    @FindBys({
            @FindBy(xpath = "/html[1]/body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/ul[1]/li[1]"),
    })

    WebElement canceldone;


    public void orderHistory() throws IOException {

        try {
            if(profile.isDisplayed()) {;
                profile.click();
                profilehome.click();
                Thread.sleep(2000);
                myorder.click();
                Thread.sleep(2000);
                JavascriptExecutor js2 = (JavascriptExecutor) driver;
                js2.executeScript("arguments[0].scrollIntoView(true);", dashboard);

            }
        }
        catch(Exception e) {
            test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Order history is not opening Properly</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PaymentOption");
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(dashboard.isDisplayed());
        }

    }

    public void cancelOrder() throws IOException {

        try {
            if(cancelorder.isDisplayed()) {;
                cancelorder.click();
                Thread.sleep(2000);
                JavascriptExecutor js2 = (JavascriptExecutor) driver;
                js2.executeScript("arguments[0].scrollIntoView(true);", dashboard);
                message.sendKeys("ok");
                confirmcancel.click();
                Thread.sleep(2000);
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", dashboard);

                String cancellation = "The order has been cancelled by the user. As a result, we have stopped processing this order. Your refund is on the way.";

            }
        }
        catch(Exception e) {
            test.fail("<p style=\"color:#FF5353; font-size:13px\"><b>Order history is not opening Properly</b></p>");
            Throwable t = new InterruptedException("Exception");
            test.fail(t);
            @SuppressWarnings("unused")
            String dest = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PaymentOption");
            test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
            Assert.assertTrue(dashboard.isDisplayed());
        }

    }

}
