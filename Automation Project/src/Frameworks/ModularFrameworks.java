package Frameworks;

import org.testng.annotations.Test;

public class ModularFrameworks {
	
	@Test
	public void Tc() throws InterruptedException
	{
		ReusableMethods rm = new ReusableMethods();  //Created Object
		
		rm.open();
		rm.login("admin", "admin123");
		Thread.sleep(2000);
		
		rm.logout();
		Thread.sleep(2000);
		rm.close();
	}

}
