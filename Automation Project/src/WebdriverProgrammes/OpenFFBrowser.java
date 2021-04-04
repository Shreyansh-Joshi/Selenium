package WebdriverProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFFBrowser {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
	}
	

}
