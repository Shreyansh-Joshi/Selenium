package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class noandnameoflinks {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("No of links are"+" "+links.size());
		
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
		}
		
		
		
	}

}
