package newtestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeMethod
	public void login() {
		System.out.println("Application login");
	}
		
		@AfterMethod
		public void logout() {
			System.out.println("Application logout");
			
		}
		@BeforeClass
		public void launchBrowser() {
			System.out.println("Browser is opened");
			}
		@AfterClass
		public void closeBrowser() {
			System.out.println("Browser is closed");
		}
		@Test(priority=3)    // priority will be at 3rd place
		public void TC01() {
			System.out.println("TC01 is executed");
	}
		@Test(enabled=false)    // this test case will not execute
		public void TC02() {
			System.out.println("TC02 is executed");
	}
		@Test(invocationCount=5)   // this test will execute 5 times
		
		public void TC03() {
			System.out.println("TC03 is executed");
	}

}
