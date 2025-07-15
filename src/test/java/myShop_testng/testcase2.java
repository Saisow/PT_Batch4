package myShop_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testcase2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		driver.findElement(By.className("login")).click();
		
		driver.findElement(By.id("email")).sendKeys("naga234@test.com");
		
		driver.findElement(By.id("passwd")).sendKeys("Saisowmya@96");
		
		driver.findElement(By.id("SubmitLogin")).click();
		
		/*driver.findElement(By.linkText("Women")).click();
		
		driver.findElement(By.xpath("//img[@title='Blouse']")).click();
		
		WebElement size = driver.findElement(By.id("group_1"));
		
		Select sele = new Select(size);
		
		sele.selectByValue("2");
		
		driver.findElement(By.id("color_8")).click();
		
		driver.findElement(By.name("Submit")).click();
		*/


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

       WebElement womenLink = wait.until(
               ExpectedConditions.visibilityOfElementLocated(By.linkText("WOMEN"))
           );
		
			
		
		//WebElement womenLink = driver.findElement(By.linkText("Women"));
           System.out.println("Found 'WOMEN' link.");

           // 4. Perform Mouse Hover on "WOMEN" link
           Actions actions = new Actions(driver);
           actions.moveToElement(womenLink).perform();
           System.out.println("Mouse hovered over 'WOMEN' link.");

           // Give a short pause to ensure the sub-menu is visible
           Thread.sleep(1000); 
           
           driver.findElement(By.linkText("Blouses")).click();
         
           System.out.println("Clicked on 'Blouses' link.");

           // You can add further assertions here to verify if the correct page loaded
           System.out.println("Current URL: " + driver.getCurrentUrl());
           System.out.println("Current Page Title: " + driver.getTitle());
           
           driver.findElement(By.xpath("//img[@title='Blouse']")).click();
           
       	
   		WebElement size = driver.findElement(By.id("group_1"));
   		
   		Select sele = new Select(size);
   		
   		sele.selectByValue("2");
   		
   		driver.findElement(By.id("color_8")).click();
   		
   		driver.findElement(By.name("Submit")).click();

		
	}

}
