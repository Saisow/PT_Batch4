package CommonUtilities_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class CommonDatafile_ {
	
	public 	String readDatafrompropfile(String key) throws Exception {
		

		//step1: Creating teh object for the propertiess
		Properties prop = new Properties();
		
		//Step2: Acces the file by using filepath
		FileInputStream fis = new FileInputStream("./src/test/resources/properties");
		
		//step3: load the values  by uind file
		prop.load(fis);
		
		//step4:
					String value = prop.getProperty(key);      
					
		return value;
			
			
			
			


		
		
	}

}
