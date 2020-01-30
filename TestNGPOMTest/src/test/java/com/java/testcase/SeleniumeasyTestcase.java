package com.java.testcase;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.intializer.Initialize;
import com.java.intializer.ReadExcel;
import com.java.page.SeleniumeasyPage;

public class SeleniumeasyTestcase extends Initialize {
	WebDriver driver ;
	SeleniumeasyPage sep;
	
	@BeforeTest
	public void LaunchBrowser() {
		// System.setProperty("webdriver.chrome.driver", "E:\\pradeep\\selenium-2.45.0\\chromedriver.exe");
		// driver = new ChromeDriver();
		System.out.println("1");
		driver = init("URL_SeleniumEasy");
		 sep = new SeleniumeasyPage(driver);
		// driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	}
	@Test
	public void tc01() {
		ArrayList<String> data=ReadExcel.getExcelData();
		sep.enterFirstName(data.get(0));
		sep.enterLastName(data.get(1));
		sep.enterPhoneNo(data.get(2));
		sep.enterCity(data.get(3));
		sep.enterAddress(data.get(4));
		sep.selectState(data.get(5));
		sep.selectHosting(data.get(6));
	
		
	}
	
	
	@AfterTest
	public void CloseBrowser() {
	//	driver.close();
	}

}
