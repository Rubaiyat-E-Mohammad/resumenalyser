package LegoIO.CCVN2.Tests;

import java.io.IOException;

import LegoIO.CCVN2.Pages.OrderCancel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import LegoIO.CCVN2.Utilities.ExtentFactory;

public class OrderCancelTests {

    ExtentReports report;
    ExtentTest parentTest;
    ExtentTest childTest;

    @BeforeClass
    public void Report() {

        report = ExtentFactory.getInstance();
        parentTest = report.createTest("<p style=\"font-size:20px;font-family: verdana;font-weight: bold;\">Order Cancel Process</p>").assignAuthor("LegoIO QA TEAM").assignDevice("MacOS");
    }

    @Test(priority = 0)
    public void OrderHistory() throws IOException, InterruptedException {

        childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Order History Tests</p>");
        OrderCancel Order = new OrderCancel(childTest);
        Order.orderHistory();

    }
    @Test(priority = 1)
    public void CancelOrder() throws IOException, InterruptedException {

        childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:18px; font-family: verdana;font-weight: bold;\">Order Cancel Tests</p>");
        OrderCancel Order = new OrderCancel(childTest);
        Order.cancelOrder();

    }

    @AfterClass
    public void afterClass() {
        report.flush();
    }

}
