package utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConfigFileReader {
	static WebDriver driver;
    
	private Properties properties = new Properties();;
	private String globalSettingsFilePath = "C:\\EclipseProject\\AllFrameWork\\globalSettings.properties";
	//Load Properties file Constructor
	public ConfigFileReader() 	{
		
			try {
				FileInputStream inputStreamconfigFilePath;
				inputStreamconfigFilePath = new FileInputStream(globalSettingsFilePath);				
				properties.load(inputStreamconfigFilePath);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("Config File not found");
			} 			
	}
	
	
	public String getDriverPath() {
		String driverPath = properties.getProperty("edgeDriverPath");		
		return driverPath;
	}
	
	public long getImplicitWait() {		
		String implicitWait = properties.getProperty("implicitWait");		
		return Long.parseLong(implicitWait);		
	}

	public void initializeBrowser(WebDriver driver) {
		
		String browserName = properties.getProperty("browser");	
		System.out.println(browserName);
		String driverPath;
		if(browserName.equalsIgnoreCase("Edge")) {
			driverPath = properties.getProperty("edgeDriverPath");
			System.getProperty("webdriver.edge.driver", driverPath);			
			driver = new EdgeDriver();
			System.out.println(driverPath);
		}
		if(browserName.equalsIgnoreCase("Chrome")) {
			driverPath = properties.getProperty("chromeDriverPath");
			System.getProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
		}			
		driver.manage().window().maximize();
		
		
	}
	
	
	
}
