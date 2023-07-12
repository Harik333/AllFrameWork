package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormDataPage {
    WebDriver driver;
    
	public FormDataPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By firstName = By.id("fname");
	By lastName = By.id("lname");
	By age = By.id("age");
	By submit = By.xpath("//input[@type='submit']");
	
	public WebElement firstName() {
		return driver.findElement(firstName);
	}
	public WebElement lastName() {
		return driver.findElement(lastName);
	}
	public WebElement age() {
		return driver.findElement(age);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	
}
