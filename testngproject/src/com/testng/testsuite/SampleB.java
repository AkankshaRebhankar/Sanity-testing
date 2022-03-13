package com.testng.testsuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleB {
	@Test(groups="buy")
	public void TC05() {
		Reporter.log("TC05 is passed");
	}
	@Test(groups="intraday")
	public void TC06() {
		Reporter.log("TC06 is passed");
	}
	@Test(groups="sell")
	public void TC07() {
		Assert.fail();
		Reporter.log("TC07 is passed");
	}
	@Test(groups="intraday")
	public void TC08() {
		Reporter.log("TC08 is passed");
	}
}
