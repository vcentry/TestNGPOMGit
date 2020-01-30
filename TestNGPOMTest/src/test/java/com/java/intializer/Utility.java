package com.java.intializer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	public static void highlight(WebDriver driver, WebElement en) {
		
		for (int i = 0; i < 3; i++) {
			((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','background-color:green')", en);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			((JavascriptExecutor)driver).executeScript("arguments[0].setAttribute('style','background-color:white')", en);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
