package Object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtilities_.WebDriver_Utility;

public class homePage {

	
	
	public homePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(linkText = "Sign in")
	private WebElement signbtn;

	
	
	public void clickonsignlink() {
		
		signbtn.click();
	}
	
	

	
	
}
