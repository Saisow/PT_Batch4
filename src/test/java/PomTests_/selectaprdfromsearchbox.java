package PomTests_;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtilities_.BaseClass;
import CommonUtilities_.Mylisteners;
import Object_repo.productpage;
import Object_repo.searchpage;



public class selectaprdfromsearchbox extends BaseClass{

	
	@Test(priority = 1)
	public void productsearch() {
		
		searchpage sp = new searchpage(driver);
		
		sp.searchbar("Casual dresses");
		
		System.out.println("Casual dreeses is searched");
		
		logger.info("proudtc serach test case got executed successfully");
			
	}
	
	
	@Test(priority=2,dependsOnMethods="productsearch")
	public void prdctsel() {
			
		productpage pg = new productpage(driver);
		pg.product();
		
		System.out.println("product is selected");
		
		logger.debug("prdctsel testcase got executed");
		
	}
	
	
	
}
