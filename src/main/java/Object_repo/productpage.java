package Object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtilities_.WebDriver_Utility;

public class productpage {
	
	public productpage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="group_1")
	public WebElement size;
	
	@FindBy(xpath="//select[@id='group_1']")
	public WebElement sizee;
	
	@FindBy(id="color_13")
	public WebElement clr;
	
	@FindBy(id="color_8")
	private WebElement clr1;
	
	@FindBy(name = "Submit")
	public WebElement acart;


	@FindBy(xpath="//span[text()='Add to cart']")
	public WebElement acart1;
	
	//Bussiness logic
	
	public void product() {
		
		WebDriver_Utility wu = new WebDriver_Utility();
		wu.dropDown(size, "2");
		
		clr.click();
		acart.click();
		
	}
	
	public void aproduct() throws Exception {
		
		WebDriver_Utility wu = new WebDriver_Utility();
		wu.dropDown(sizee, "2");
		
		clr1.click();
		Thread.sleep(2000);;
		acart1.click();
		
	}
	
	
	
	
	

}
