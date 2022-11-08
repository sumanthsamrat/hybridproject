package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class privority2 {
	@Test
	public void calls() {
	Reporter.log("call",true);
		
	}
	
	@Test(priority=1)
	public void settings() {
	Reporter.log("settings",true);
		
	}
	@Test(priority=1)
	public void chats() {
	Reporter.log("chats",true);
		
	}
	
	

}



