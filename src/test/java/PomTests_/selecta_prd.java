package PomTests_;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtilities_.BaseClass;
import Object_repo.my_acntpage;
import Object_repo.productpage;

public class selecta_prd extends BaseClass {
	
	
	@Test
	public  void productblouse() throws Exception {
	
		my_acntpage ma = new my_acntpage(driver);
		
		ma.moveronwlink();
		
		//logger.info("productblouse Test case exeucted successfully");
		
		//System.out.println("Page title: " + driver.getTitle());
		
		productpage pg = new productpage(driver);
		
		pg.aproduct();
		
		logger.info("productblouse Test case exeucted successfully");
		
		
		
	}


}
