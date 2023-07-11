package extentReports;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtendReportNG {

	public void getReportObject() {
		String path = "C:\\EclipseProject\\Reports\\result.html";
		//File reportPath = new File(path);
		//Setting report details with ExtentSparkReporter class
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Test Execution Report");
		reporter.config().setDocumentTitle("Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Harish");
		extent.createTest(path);	
			
		
	}
}
