package WebdriverProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithcssexample {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input#email")).clear();
		driver.findElement(By.cssSelector("input#email")).sendKeys("dashing_shreyansh2006@yahoo.co.in");
		

		driver.findElement(By.cssSelector("input#pass")).clear();
		driver.findElement(By.cssSelector("input#pass")).sendKeys("9826243200");
		
		driver.findElement(By.cssSelector("button#u_0_b")).click();

		
		
		
		
		
		
		
	}

}
