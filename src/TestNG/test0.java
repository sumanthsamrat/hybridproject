package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test0 {
	@Test
	public void demo() {
		Reporter.log("hello selenium",true);
		Reporter.log("hello java",false);
		
	}

}
