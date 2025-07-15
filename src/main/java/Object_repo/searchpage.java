package Object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage {
	
	
	public searchpage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="search_query_top")
	WebElement searchbox;
	
	@FindBy(name="submit_search")
	WebElement searchicon;
	
	@FindBy(xpath = "//ul[@class='product_list grid row']/li[2]")
	WebElement prdct;
	
	
	
	//Bussiness logic
	
	public void searchbar(String text) {
		
		searchbox.sendKeys(text);
		searchicon.click();
		prdct.click();
		
		
		
	}
	
	

}
