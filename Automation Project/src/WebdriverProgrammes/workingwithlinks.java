package WebdriverProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithlinks {

	public static void main(String[] args) {
		
		//Open Browser,navigate to google

		ChromeDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
	
		//Click on Gmail
		
		driver.findElement(By.linkText("Gmail")).click();
		
		//Get the title of gmail as Gmail-Email from google.
		
		String Actual = driver.getTitle();
		System.out.println(Actual);
		
		//If Actual = Expected print as pass.
		
		String Expected = "Gmail";
		
		if(Actual.contains(Expected)){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
		
		//Close the window
		
		driver.close();
		
	}

}
