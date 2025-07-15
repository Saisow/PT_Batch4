package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependsonMethods {

	@Test
	public void createContact()
	{

	System.out.println("contact created");
	
	int arr[] = {4 , 6, 2, 1 };
	
		System.out.println(arr[5]);

	}

	@Test(dependsOnMethods = "createContact")
	public void modifyContact()
	{
		System.out.println("modify contact");
	}
	
	@Test
	public void deleteContact()
	{
		System.out.println("delete contact");
	}

}

