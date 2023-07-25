package cucumberTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormDataPage;
import utilities.StandardModules;

public class SimpleFormsPage {
    WebDriver driver;
    StandardModules sm = new StandardModules();
    FormDataPage formData;
    
	@Given("Launch form data URL in edge browser and perform login")
	public void launch_form_data_url_in_edge_browser_and_perform_login() {
		System.getProperty("webdriver.edge.driver", "C:\\Temp\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sm.getImplicitWait()));
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}
	@When("Enter general form data for particual company code like {string}, {string} and {string}")
	public void enter_general_form_data_for_particual_company_code(String firstName, String lastName, String age) {
		driver.get("https://harkr.w3spaces.com/basicform.html");
		formData =  new FormDataPage(driver);
		formData.firstName().sendKeys(firstName);
		formData.lastName().sendKeys(lastName);
		formData.age().sendKeys(age);
	}
	
	@Then("message is {string}")
	public void data_should_entered_successfully(String message) {
          System.out.println("form data created for different markets " + message);
	}
}
