package Frameworks;

import java.io.IOException;

import org.testng.annotations.Test;

public class HybridFrameworks {
	
	@Test
	public void TC() throws IOException, InterruptedException
	{
		HReusableMethods hr = new HReusableMethods();
		hr.open();
		hr.login();
		Thread.sleep(2000);
		hr.close();
	}

}
