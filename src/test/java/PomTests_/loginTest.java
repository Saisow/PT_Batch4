package PomTests_;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import CommonUtilities_.BaseClass;
import Object_repo.homePage;
import Object_repo.loginpage;

public class loginTest extends BaseClass {
	
	@Test
	
	public void login() {
		
		homePage hp = new homePage(driver);
		
		hp.clickonsignlink();
		
		loginpage lp = new loginpage(driver);
		
		lp.loginintomyshop("naga234@test.com", "Saisowmya@96");
		
	/*	lp.setUseraddress("naga234@test.com");
		
		lp.setPassword("Saisowmya@96");
		
		lp.setSlogin();
		*/
		
		
		
	}
	
	
		
	}
	
	


