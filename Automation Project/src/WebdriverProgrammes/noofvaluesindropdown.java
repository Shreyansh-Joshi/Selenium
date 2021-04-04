package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class noofvaluesindropdown {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement Dropdown=driver.findElement(By.xpath("//*[@id='themes']"));
		
		List<WebElement>values=Dropdown.findElements(By.tagName("option"));
		
		System.out.println(values.size());
		
		for(int i=0;i<values.size();i++){
			System.out.println(values.get(i).getText());
		}
		
	}

}
