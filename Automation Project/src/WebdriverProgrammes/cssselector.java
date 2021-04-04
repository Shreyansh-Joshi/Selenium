package WebdriverProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.orangehrm.com/open-source/register-to-download/");
		
		driver.findElement(By.cssSelector("input#Form_submitRequest_FirstName")).clear();
		driver.findElement(By.cssSelector("input#Form_submitRequest_FirstName")).sendKeys("Shreyansh");
		
		driver.findElement(By.cssSelector("input#Form_submitRequest_CompanyName")).clear();
		driver.findElement(By.cssSelector("input#Form_submitRequest_CompanyName")).sendKeys("Vodafone");
		
		driver.findElement(By.cssSelector("input#Form_submitRequest_JobTitle")).clear();
		driver.findElement(By.cssSelector("input#Form_submitRequest_JobTitle")).sendKeys("Software Test Engineer");
		
		driver.findElement(By.cssSelector("input#Form_submitRequest_Phone")).clear();
		driver.findElement(By.cssSelector("input#Form_submitRequest_Phone")).sendKeys("9579917300");
		
		driver.findElement(By.cssSelector("input#Form_submitRequest_action_submitRequest")).click();
	}

}
