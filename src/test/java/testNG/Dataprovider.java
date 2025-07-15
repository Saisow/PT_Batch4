package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.Java_Utility;

public class Dataprovider {
	
	@Test(dataProvider="testData")
	public void booktickets(String src,String dest,int noofpp) {
		
		System.out.println("Book tickets from" +src+ "to" +dest+" "+noofpp);
		
		
	}
	
	@Test
	public void login(){
		
		System.out.println("Login functionality");
		
	}
	
	@DataProvider(name="testData")
	public Object[][] dataprovider(){     //Object -- It will accept any type of data
		
		Object[][] data = new Object[4][3];
		
		Java_Utility jlib = new Java_Utility();
		int randomnum = jlib.getRandomNum();
	
	

			data[0][0] = "Banglore"+randomnum;
			data[0][1] = "Hyderabad";
			data[0][2] = 4;
		
			
			data[1][0] = "Hyderabad";
			data[1][1] = "Banglore";
			data[1][2] = 5;
			
			data[2][0] = "Vizag";
			data[2][1] = "Thirupathi";
			data[2][2] = 2;
		
			
			data[3][0] = "Andhra";
			data[3][1] = "Telangana";
			data[3][2] = 6;
		
			
			return data;
		
		
	}
	
	
	
	

	
	
	
	
	

}
