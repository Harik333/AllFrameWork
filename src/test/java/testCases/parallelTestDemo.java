package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.ConfigFileReader;

public class parallelTestDemo {
   static WebDriver driver;
	
	ConfigFileReader config = new ConfigFileReader();
	
	@Test
	public void parallelLaunchA() {
	   config.initializeBrowser(driver);
	   driver.get("https://www.google.com/");
	}
	
	@Test
	public void parallelLaunchB() {
	   config.initializeBrowser(driver);
	   driver.get("https://www.facebook.com/");
	}
}
