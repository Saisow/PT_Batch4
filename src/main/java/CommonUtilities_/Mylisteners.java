package CommonUtilities_;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylisteners implements ITestListener {

	public void onTestStart(ITestResult result) {
	   
				String testname = result.getName();
				System.out.println("starting the execution" +testname);
		
	  }
	
	public  void onTestSuccess(ITestResult result) {
	    
		String test = result.getMethod().getMethodName();
		System.out.println(" success testName:"  +test);
		
		
	  }
	
	public void onTestFailure(ITestResult result) {
		String test1 = result.getMethod().getMethodName();
		System.out.println("failure testName:"  +test1);
		
		WebDriver_Utility wu = new WebDriver_Utility();
		
		try {
			wu.takeScreenShotEx(BaseClass.sdriver,"myreport.png");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	  }

	 public  void onTestSkipped(ITestResult result) {
		    
		 String testname = result.getName();
			System.out.println("skipped testName1:" +testname);
		 
		  }
	 
	 public  void onStart(ITestContext context) {
		   
		 
		 System.out.println("Test execution starts");
		  }

	 public  void onFinish(ITestContext context) {
		  
		 	System.out.println("Test Execution completed");
		  }
	
	
	
	
	
	
	
	
}
