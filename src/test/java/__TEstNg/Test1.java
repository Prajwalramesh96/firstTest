package __TEstNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority = 1,invocationCount = 3)
	public void calls(){
		Reporter.log("calling",true);
	}
	
	@Test(priority = 0,enabled = false)
	public void settings() {
		Reporter.log("set caler tone",true);
	}
	
	@Test(priority = -1)
	public void chats() {
		Reporter.log("texting",true);
	}

}
