package LegoIO.CCVN2.Drivers;

import org.openqa.selenium.WebDriver;

public class PageDriver {

	public static WebDriver webDriver ;
	private static PageDriver instance = null;
	
	private PageDriver() {
		
	}
	
	public static PageDriver getInstance() {
		if(instance == null) {
			instance = new PageDriver();
		}
		return instance;
	}
	
	public WebDriver getDriver() {
		return webDriver;
	}
	
	public void setDriver(WebDriver driver) {
		webDriver = driver;
	}
	
	public static WebDriver getCurrentDriver() {
		return getInstance().getDriver();
	}
}
