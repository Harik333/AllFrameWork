package testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utilities.ConfigFileReader;

public class Amazon {
	
    WebDriver driver;
    ConfigFileReader configFileReader = new ConfigFileReader();;
    
    @BeforeClass
    public void preCondition() {    	
    	System.out.println(configFileReader.getDriverPath());
		System.getProperty("webdriver.edge.driver", configFileReader.getDriverPath());
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(configFileReader.getImplicitWait()));
    }
    
	@Test
	public void mobileClick() {
		driver.get("https://www.amazon.in/s?k=mobiles&crid=1OGQMF0XMJO16&sprefix=mobiles%2Caps%2C300&ref=nb_sb_noss_1");
		List<WebElement> mobileList = driver.findElements(By.xpath("//span[@class='a-price-whole' and text()='16,999']//preceding::span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		WebElement firstMobile = mobileList.get(0);
		firstMobile.click();
		
	}
}
