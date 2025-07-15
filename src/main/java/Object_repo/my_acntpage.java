package Object_repo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CommonUtilities_.WebDriver_Utility;

public class my_acntpage {
	
	private WebDriver driver;
	
	public my_acntpage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText = "Women")
	private WebElement womenlink;
	
	@FindBy(xpath= "//a[@title='Blouses']")
	private WebElement bls;
	
	@FindBy(linkText ="Blouse")
	private WebElement prdctbls;
	
	
	public void moveronwlink() throws Exception {
	
		Thread.sleep(5000);
		
		
		womenlink.click();
		
		WebDriver_Utility wu = new WebDriver_Utility();
		
		wu.mouseHoverToEle(driver, womenlink);
		
		//bls.click();
		
		prdctbls.click();
	
		
	}
	

}
