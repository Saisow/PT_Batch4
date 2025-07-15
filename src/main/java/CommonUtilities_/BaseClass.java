package CommonUtilities_;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Object_repo.homePage;
import Object_repo.loginpage;

public class BaseClass {
	
	 public WebDriver driver;   //instance variable
	 public CommonDatafile_ cf;
	 
	 public static WebDriver sdriver;   //static variable
	// public Logger logger;
	 
	 protected static final Logger logger = Logger.getLogger(BaseClass.class);	
	 
	 
	@BeforeClass
	
	public void browserlaunch() throws Exception {
	
	//	String browser ="edge";
		
		cf = new CommonDatafile_();
		String bname = cf.readDatafrompropfile("browser");
		
		switch(bname) {
		
		case "edge" : driver = new EdgeDriver();
						
						break;
		
		case "chrome" : driver = new ChromeDriver();
		
						break;
						
		case "firefox" : driver = new FirefoxDriver();
		
						break;
						
		case "default" : driver = new ChromeDriver();
		
		

		}
		
		sdriver = driver;
	
		driver.get(cf.readDatafrompropfile("url"));
		
			homePage hp = new homePage(driver);
		
				hp.clickonsignlink();
	
		
			String uname = cf.readDatafrompropfile("username");
			
			 String pwd = cf.readDatafrompropfile("password");
			  
			  loginpage lp = new loginpage(driver);
			
		lp.loginintomyshop(uname,pwd);
		
		
		//driver.get(prop.getProperty("uname"));
		
		WebDriver_Utility wu = new WebDriver_Utility();
		wu.maximizeWindow(driver);
	
	
	}
	
		@AfterClass
		public void tearDown() {
			
			driver.quit();
		}
	
	

}
