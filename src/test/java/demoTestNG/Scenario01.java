package demoTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Scenario01 {

	@Test(groups={"greetings","English"})
	public void hey() {
		System.out.println("Hey");
	}
	@Test(groups={"greetings","Tamil"})
	public void vanakam() {
		System.out.println("vanakam");
	}	
	@Test(groups={"greetings","English"})
	public void wassup() {
		System.out.println("wassup");		
	}	
	
	@Test(groups={"English"})
	@Parameters({"CustomGreet"})
	public void custom(String customGreetings) {
		System.out.println("......."+ customGreetings);
	}
	
	@Test
	public void bye() {
		System.out.println("Hey");
	}
	
	By fn = By.id("something");
	
	
}
