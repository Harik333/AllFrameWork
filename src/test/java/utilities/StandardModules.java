package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class StandardModules {
	Properties properties = new Properties();
	FileInputStream inputStream;
	

	 public String readExcelCell(String excelPath, String sheetName, int row, int column ) throws Throwable {
		
		File file = new File(excelPath);
		
		FileInputStream fileInput = new FileInputStream(file);
		
		XSSFWorkbook excel = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = excel.getSheet(sheetName);
		//Read Excel data		
		XSSFCell cell = sheet.getRow(row).getCell(column);
		DataFormatter df = new DataFormatter();
		String cellValue  = df.formatCellValue(cell);
		return cellValue;				
	}
	 
	public int getImplicitWait() throws Throwable {
		inputStream = new FileInputStream("C:\\EclipseProject\\AllFrameWork\\globalSettings.properties");
		properties.load(inputStream);
		String implicitWait = properties.getProperty("implicitWait");
		return Integer.parseInt(implicitWait);		
	}
	
	public void takeScreenshot(WebDriver driver, String destinationFilePath) throws Throwable {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(destinationFilePath);
		FileHandler.copy(sourceFile, destinationFile);		
	}
}
