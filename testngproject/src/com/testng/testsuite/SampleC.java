package com.testng.testsuite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleC {
	@Test(groups="sell")
	public void TC09() {
		Reporter.log("TC01 is passed");
	}
	@Test(groups="intraday")
	public void TC10() {
		Assert.fail();
		Reporter.log("TC01 is passed");
	}

}
