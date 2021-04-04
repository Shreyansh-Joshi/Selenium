package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bingehiddenlinks {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		
		//To get no of links
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		//To get visible links
		
		int count=0;
		
		for(int i=0;i<links.size();i++){
			if(links.get(i).isDisplayed()){
				count++;
			}
		}
		
		System.out.println("No of links are"+" "+links.size());
		System.out.println("No of visible links are"+" "+count);
		System.out.println("No of hidden links are"+" "+(links.size()-count));
		
		
	}

}
