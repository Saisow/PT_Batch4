package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng2 {
	
	@BeforeClass
	public void bc() {
		
		System.out.println("This is bfore class1");
	}
	
	
	@Test(invocationCount = 3 , priority = 2)
	public void login() {
		
		System.out.println("Welcome to application");
	}

	@Test(dependsOnMethods="login")
	public void logout() {
		
		System.out.println("Logout to application");
	}
	
	
	
	@AfterClass
	public void ac() {
		
		System.out.println("This is after class");
	}
}
