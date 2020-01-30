package com.java.page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.java.locators.JQueryAutocomplete;

public class JQueryAutocompletePage extends JQueryAutocomplete {
	WebDriver driver;
	public JQueryAutocompletePage(WebDriver driver) {
		this.driver = driver;
	}
	public void enterChar(String Ch) throws InterruptedException {
		driver.findElement(By.xpath(Tags_xpath)).sendKeys(Ch);
		
		Thread.sleep(1500);
		List<WebElement> tags = driver.findElements(By.xpath(TagsList_xpath));
		Iterator<WebElement> itr = tags.iterator();

		while (itr.hasNext()) {
			WebElement tag = (WebElement) itr.next();
			System.out.println(tag.getText());

			if (tag.getText().trim().equalsIgnoreCase("ActionScript"))
				tag.click();

		}
	}

}
