package myShop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class logintestcase2 {

	public static WebDriver driver;
	
	

	@BeforeClass()
	public void urlwithbrowser() {
		
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void launchurl() {
		
		driver.get("http://www.automationpractice.pl/index.php");
	}

	@Test()
	public void loginwithvalidcrd() {
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("naga234@test.com");
		driver.findElement(By.id("passwd")).sendKeys("Saisowmya@96");
		driver.findElement(By.id("SubmitLog")).click();
		
		
	}
	

	
	@Test(priority=2)
	public void signout() {
		
		System.out.println("Logout from application");
	}
	

	@Test(priority=1,dependsOnMethods="loginwithvalidcrd")
	public void searchbox() {
	
		driver.findElement(By.id("search_query_top")).sendKeys("casual dresses");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("//ul[@class='product_list grid row']/li[2]")).click();
		
		
	}
	
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
		
	}
	
	
}
