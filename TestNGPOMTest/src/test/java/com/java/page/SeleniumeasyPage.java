package com.java.page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.java.intializer.Utility;
import com.java.locators.SeleniumeasyLocators;

public class SeleniumeasyPage extends SeleniumeasyLocators {
	WebDriver driver;

	public SeleniumeasyPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterFirstName(String fn) {
		WebElement ele = driver.findElement(By.name(Firstname_name));
		Utility.highlight(driver, ele);
		ele.sendKeys(fn);
		

	}

	public void enterLastName(String ln) {
		Utility.highlight(driver, driver.findElement(By.name(Lastname_name)));
		driver.findElement(By.name(Lastname_name)).sendKeys(ln);
		
	}

	public void enterPhoneNo(String ph) {
		driver.findElement(By.name(PhoneNo_name)).sendKeys(ph);
	}

	public void enterAddress(String ad) {
		driver.findElement(By.name(Address_name)).sendKeys(ad);
	}

	public void enterCity(String cy) {
		driver.findElement(By.name(City_name)).sendKeys(cy);
	}

	public void selectState(String st) {
		WebElement states = driver.findElement(By.name(State_name));
		Select s1 = new Select(states);
		s1.selectByVisibleText(st);
    }
	public void selectHosting(String hs) {
		List<WebElement> checkboxes = driver.findElements(By.xpath(Hosting_xpath));
		Iterator<WebElement> itr = checkboxes.iterator();
		while (itr.hasNext()) {
			WebElement checkbox = (WebElement) itr.next();
			System.out.println(checkbox.getAttribute("value"));
			
			if(checkbox.getAttribute("value").trim().equalsIgnoreCase(hs)) {
				checkbox.click();
			}
				
		}
	}


}
