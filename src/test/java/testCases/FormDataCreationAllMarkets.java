package testCases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.FormDataPage;
import utilities.StandardModules;

public class FormDataCreationAllMarkets {
    WebDriver driver;
    StandardModules sm = new StandardModules();
    FormDataPage formData;
        
	@BeforeMethod
	public void preCondition() {
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
	
	@Test(dataProvider="formDataCreation")
	public void formDataCreation(String firstName, String lastName, String age ) {
		driver.get("https://harkr.w3spaces.com/basicform.html");
		formData =  new FormDataPage(driver);
		formData.firstName().sendKeys(firstName);
		formData.lastName().sendKeys(lastName);
		formData.age().sendKeys(age);
		//formData.submit().click();
				
	}
		
	@AfterClass
	public void postCondition() {
		//driver.quit();
	}
	
	@DataProvider(name="formDataCreation")
	public Object[][] provideformDataCreation() throws Throwable {
		String formDataPath = "C:\\Temp\\TestData\\FormSubmissionAllMarkets.xlsx";
		String sheetName = "SC01-FormCreation";	
		int columnSize = 3; 
		int rowSize = 3;
		int x = 0, y = 0;
		Object[][] data = new Object[rowSize][columnSize];
		for(int i = 1; i<=rowSize; i++) {
			
			for(int j=1; j<=columnSize; j++) {				
				data[x][y] = sm.readExcelCell(formDataPath,sheetName , i, j);
				y++;
			}
			x++;
			y=0;
		}
		return data;
	}
	
	
	
}
