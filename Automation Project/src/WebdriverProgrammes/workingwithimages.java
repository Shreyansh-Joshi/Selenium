package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithimages {

	public static void main(String[] args) {
		
		// No of images

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("No of images are"+"  "+images.size());
		
		// To get src of images
		
		for(int i=0;i<images.size();i++){
			System.out.println(images.get(i).getAttribute("src"));
		}
	}

}
