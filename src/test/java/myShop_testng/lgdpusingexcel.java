package myShop_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utilities.Excel_Utility;

public class lgdpusingexcel {

	
	public static WebDriver driver;

		@Test(dataProvider = "logintest")
		public void logintest(String username,String password) {
			driver = new ChromeDriver();
			
			driver.get("http://www.automationpractice.pl/index.php?controller=authentication&back=my-account");
			
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("passwd")).sendKeys(password);
			driver.findElement(By.id("SubmitLogin")).click();
			
			
		}
		
		@DataProvider(name="logintest")
		public Object[][] readData() throws Throwable{
			
			Excel_Utility eu = new Excel_Utility();
			eu.readDataUsingDataProvider("sheet1");
			
			Object[][] arr = new Object[2][2];
			
			arr[0][0] = "naga234@test.com";
			arr[0][1] = "Saisowmya@96";
			
			arr[1][0] = "naga34@test.com";
			arr[1][1] = "Saisomwya@96";
			return arr;
			
			
			
		}
		

	}

	

