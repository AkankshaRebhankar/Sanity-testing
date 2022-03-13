package newtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 {
	@Test(timeOut =1000)
	public void TC01() throws InterruptedException {
		Reporter.log("TC01 for dashboard is executed",true );
		Thread.sleep(2000);
		
		
	
	}
	@Test
	public void TC02() {
	Reporter.log("TC02 is for login is executed",true);
	}


	@Test
	public void TC03() {
		Reporter.log("TC03 for BUY order is executed",true);
	}
}
