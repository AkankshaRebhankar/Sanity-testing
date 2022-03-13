package com.testng.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.foxconfig.Configuration1;


public class CrossTest {
	
	@Test
	
	public void browser(String browserName) {
		
		System.out.println("value from xml file:"+browserName);
		
		if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", Configuration1.foxPath);
			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		}
		else {
			
			System.setProperty("webdriver.chrome.driver", Configuration1.driverPath1);
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
	}
	
	
	

}
