package myShop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class logintestcase1 {
	
	public WebDriver driver;
	
	@BeforeSuite()
	public void beforeSuite() {
		System.out.println("DataBase Connection");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Parallel Exceution ");
	}


	@BeforeClass()
	public void beforeClass(String browser) throws Throwable {
		
		System.out.println("Launching browser:" +browser);
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		
		else {
			
			driver = new EdgeDriver();
		}
		
		//driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		
	}
	



	@BeforeMethod()
	public void beforeMethod(String url) throws Throwable {
		
		driver.get(url);
	}

	@Parameters()
	@Test()
	public void loginwithvalidcred(String username,String passwrd) {
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("passwd")).sendKeys(passwrd);
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	

	@Ignore
	@Test(priority=1,invocationCount=2,groups="regressionTest")
	public void loginwithinvalidcred() {
	
	//	driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("naga234@test.com");
		driver.findElement(By.id("passwd")).sendKeys("Saisowmya@96");
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	
	@Ignore
	@Test(priority=3,groups="smokeTest")
	public void loginwithinvalidbtn() {
	
		driver.findElement(By.id("email")).sendKeys("naga234@test.com");
		driver.findElement(By.id("passwd")).sendKeys("Saisonwya@96");
		driver.findElement(By.id("SubmitLogin")).click();
		
	}

	
	@AfterMethod(groups= {"smokeTest" , "regressionTest"})
	public void afterMethod() throws Exception {
	
		WebElement sout = driver.findElement(By.linkText("Sign out"));
		if(sout.isDisplayed()) {
			sout.click();
			Thread.sleep(1000);
			System.out.println("User successfully logged out form application");
			
		}
		else {
			
			System.out.println("There is no need of signout from application");
		}
	
	}

	@AfterClass(groups= {"smokeTest" , "regressionTest"})
	public void afterClass() {
		driver.quit();
		System.out.println("close the browser");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("close parallel execution");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Close the DataBase");
	}
	
	
	
	
	
	
	
	
	

}
