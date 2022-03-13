package newtestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 {
	@Test
	public void login() {
		Assert.fail();
		Reporter.log("login is successful",true);
	}
@Test
public void logout() {
	Reporter.log("logout is successful",true);
}
	
}
