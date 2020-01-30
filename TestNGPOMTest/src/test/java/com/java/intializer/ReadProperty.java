package com.java.intializer;

import java.io.FileReader;
import java.util.Properties;

public class ReadProperty {
	public static String getProperties(String key)  {
		String st = "";
		try {
			FileReader file= new FileReader("C:\\Users\\A PRASHANTH\\eclipse-workspace\\TestNGPOMTest\\src\\test\\resources\\config.property");
			Properties pro =new Properties();
			pro.load(file);
		    st = pro.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
		
		
		
	}
	

}
