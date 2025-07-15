package testNG;


import org.testng.annotations.*;

public class textNg1 {
	
	
	//By default the order of execution will be happen in the Alphabetical order
	//By using priority attribute we can customize the order of execution
	
	@BeforeClass
	public void bc(){
		
		System.out.println("This is before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("This is before method");
	}
	
	
	@Test(priority=-1)
	public void loginwithvalidcredentials() {
		
		System.out.println("logging into application");
		
	}
	
	
	@Test(enabled=false)
	public void loginwithinvalidcred() {
		
		System.out.println("Logging with invalid uname and pwd");
	}
	
	@Test
	public void forgotpassword() {
		
		System.out.println("Clicking on forgot password link");
	}
	
	
	@AfterMethod
	public void at() {
		
		System.out.println("This is after method");
	}
	
	@AfterClass
	public void ac() {
		
		System.out.println("This is after class");
	}
	

}
