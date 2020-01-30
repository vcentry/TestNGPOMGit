package com.java.intializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
	WebDriver driver;
	public WebDriver init(String URL) {
		System.out.println("2");
		String Browser = ReadProperty.getProperties("Browser");
		System.out.println(Browser);
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\pradeep\\selenium-2.45.0\\chromedriver.exe");
			 driver = new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Firefox")) {
			
		}
		System.out.println("=======");
		System.out.println(URL);
		System.out.println(ReadProperty.getProperties(URL));
		System.out.println("=======");
		driver.get(ReadProperty.getProperties(URL));
		
		
	return driver;		
		
	}
	

}
