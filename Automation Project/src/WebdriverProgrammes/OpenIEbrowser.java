package WebdriverProgrammes;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEbrowser {

	public static void main(String[] args) {
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");

	}

}
