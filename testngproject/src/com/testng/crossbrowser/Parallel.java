package com.testng.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.foxconfig.Configuration1;

public class Parallel {
	@Test
	public void TC01() {
	
		System.setProperty("webdriver.chrome.driver",Configuration1.driverPath1); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void TC02() {
	
		System.setProperty("webdriver.chrome.driver",Configuration1.driverPath1); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		

}
}
