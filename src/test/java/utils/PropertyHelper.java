package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {
	
	public static  Properties loadData() {
		//String environment = System.getProperty("env"); 
		String environment = "dev";
		Properties p = new Properties();
   
		try {
			if (environment.equalsIgnoreCase("dev")) {
				FileInputStream f = new FileInputStream("data/data.properties");
				p.load(f);
			}
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;
	}
}