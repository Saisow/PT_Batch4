package CommonUtilities_;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports implements ITestListener {

			ExtentReports report;
			ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
				  
				 test = report.createTest(result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
				test.log(Status.PASS, result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName());
		test.log(Status.FAIL, result.getThrowable() );
		WebDriver_Utility wu = new WebDriver_Utility();
		String screenshot="";
		try {
			screenshot = wu.takeScreenShotEx(BaseClass.sdriver, result.getName());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(screenshot);
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, result.getName());
		test.log(Status.SKIP, result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		String dateAndTime = new Date().toString().replace(" ", "_").replace(":", "_");
		ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport/report.html" +dateAndTime);
		spark.config().setDocumentTitle("Myshop.reports");
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setReportName("Srikanth");
	
		// System configure
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("executedBy", "Srikanth");
		report.setSystemInfo("reviewedBy", "sowmya");
			
	}
	

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

	

}
