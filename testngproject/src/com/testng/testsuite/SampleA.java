package com.testng.testsuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleA {
	
	@Test(groups="buy")
	public void TC01() {
		Assert.fail();
		Reporter.log("TC01 is passed");
	}
	
	@Test(groups="intraday")
	public void TC02() {
		Reporter.log("TC02 is passed");
	}
	
	@Test(groups="sell")
	public void TC03() {
		Reporter.log("TC03 is passed");
	}
	
	@Test(groups="buy")
	public void TC04() {
		Reporter.log("TC04 is passed");
	}

}
