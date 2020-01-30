package com.java.testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.java.intializer.Initialize;
import com.java.page.JQueryAutocompletePage;

public class JqueryAutocompleteTestcase extends Initialize {
	
	WebDriver driver ;
	JQueryAutocompletePage jq;
	
	@BeforeTest
	public void LaunchBrowser() {
		// System.setProperty("webdriver.chrome.driver", "E:\\pradeep\\selenium-2.45.0\\chromedriver.exe");
		 //driver = new ChromeDriver();
		 driver = init("URL_JQuery");
		// driver.get("https://jqueryui.com/autocomplete/");
		 driver.switchTo().frame(0);
		 jq = new JQueryAutocompletePage(driver);
		 
	}
	@Test
	public void TestAutocomplete() throws InterruptedException {
		
		jq.enterChar("a");	
	}
	@AfterTest
	public void CloseBrowser() {
	//	driver.close();
	}
	
}
