package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noofdropdownandnamesofdropdown {

	public static void main(String[] args) {
		
		//No of dropdowns

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		List<WebElement>dropdowns=driver.findElements(By.tagName("select"));
		System.out.println("No of dropdowns are"+"  "+dropdowns.size());
		
		//Names of dropdowns
		
		for(int i=0;i<dropdowns.size();i++){
			System.out.println(dropdowns.get(i).getAttribute("name"));
		}
		
	}

}
