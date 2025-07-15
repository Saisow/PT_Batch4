package Object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	public loginpage(WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "email")     
	private WebElement useraddress;  


	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement slogin;
	
	
	//Bussiness logic
	
	public void loginintomyshop(String uname , String pwd) {
		
		useraddress.sendKeys(uname);
		password.sendKeys(pwd);
		slogin.click();
		
		
	}


/*getters and setters	
	public WebElement getUseraddress() {
		return useraddress;
	}


	public void setUseraddress(String uname) {
		
		getUseraddress().sendKeys(uname);
	}


	public WebElement getPassword() {
		return password;
	}


	public void setPassword(String pwd) {
		 getPassword().sendKeys(pwd);
		
	}


	public WebElement getSlogin() {
		return slogin;
	}


	public void setSlogin() {
		
		slogin.click();
	}

	*/
	
	
	
	
	
	
		
	

}
