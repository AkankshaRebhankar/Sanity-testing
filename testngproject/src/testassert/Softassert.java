package testassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	public void m1 () {
		String str1 = "xyz";
		String str2 = "abc";
		SoftAssert asrt = new SoftAssert();
		asrt.assertEquals(str1, str2);
		System.out.println("---After assertion---");
		asrt.assertEquals(str1, str2);
		System.out.println("---end of assert---");
	}
}
