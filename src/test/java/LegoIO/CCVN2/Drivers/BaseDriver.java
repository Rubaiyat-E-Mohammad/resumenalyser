package LegoIO.CCVN2.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

import LegoIO.CCVN2.Tests.SignInTests;

public class BaseDriver {
	public static String url = "https://ns26njj87sh.dataflightit.com/rw/";
	public static WebDriver driver;
	
	@BeforeSuite
	public static void start() {
		String browser = System.getProperty("browser", "edge");
		
		if(browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		PageDriver.getInstance().setDriver(driver);

	}
	
//	@AfterSuite
//	public static void close() {
//
//		PageDriver.getCurrentDriver().close();
//	}
}
