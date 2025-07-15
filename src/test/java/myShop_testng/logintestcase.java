package myShop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logintestcase {

	@Test
	public void loginwithvalidcred() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("naga234@test.com");
		driver.findElement(By.id("passwd")).sendKeys("Saisowmya@96");
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	
	@Test
	public void loginwithinvalidcred() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("naga34@test.com");
		driver.findElement(By.id("passwd")).sendKeys("Saisowmya@96");
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	
	@Test
	public void loginwithinvalidbtn() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("naga34@test.com");
		driver.findElement(By.id("passwd")).sendKeys("Saisowmya@96");
		driver.findElement(By.id("SubmitLogin")).click();
		
	}
	
	
	
	
}
