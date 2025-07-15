package testNG;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	@Test
	public void samplemethod() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		//Hard Assertion () -- 
		
		/*1.Assertequals()
		 * 2.Assertnotequals()
		 * 3.AssertTrue()
		 * 4.AssertFalse()
		 * 5.Assertnull()
		 * 6.assertnotNull()
		 * 7.fail()
		 */
		
		//SoftAssert softassert = new SoftAssert();
			String v = null;
		
			String actualurl = driver.getCurrentUrl();
			
			String expectedurl = "https://omayo.blogspot.com/";
			
			Assert.assertEquals(actualurl, expectedurl, "Expected validation");
			
			//Assert.assertNotEquals(actualurl, expectedurl, "Not an expected validation");
			
			WebElement img = driver.findElement(By.xpath("//div[@id='HTML29']//img"));
			
			Assert.assertTrue(img.isDisplayed());
			
		//	Assert.assertFalse(img.isDisplayed());
			
			//Assert.assertNull(v);
			
		
			Assert.assertNotNull(img);
			
			Assert.fail("expected message");
			
			driver.findElement(By.name("q")).sendKeys("Selenium143");
			
			Actions act = new Actions(driver);
			
			act.sendKeys(Keys.ENTER);
			
			//softAssert.assertAll();
			
		
	}

}
