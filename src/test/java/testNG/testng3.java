package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class testng3 {

	
		@Parameters("URL")
		@Test(groups="regression")
		
		public void createContact() {
			
			WebDriver driver = new ChromeDriver();
			driver.findElement(By.id("email")).sendKeys("saisowmya@96");
			System.out.println("create Contact");
			
			
			
		}
		
		@Test(dependsOnMethods="createContact" , groups="regression")
		public void modifyContact() {
			
			System.out.println("modify contact");
		}
		
		@Test(groups="smoke")
		public void deletecontact() {
			
			System.out.println("Delete contact");
		}
		

	}


