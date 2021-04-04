package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithcheckbox {

	public static void main(String[] args) {

		// No of checkboxes.
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		List<WebElement>checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No of checkboxes are"+"   "+checkbox.size());
		
		// Names of checkboxes.
		
		for(int i=0;i<checkbox.size();i++){
			System.out.println(checkbox.get(i).getAttribute("name"));
		}
		
		// Default status of checkbox
		
		for(int i=0;i<checkbox.size();i++){
			String name = checkbox.get(i).getAttribute("name");
			
		if(checkbox.get(i).isSelected()){
			System.out.println(name+"  "+"Active");
		}
		else{
			System.out.println(name+"  "+"Inactive");
		}
		}
		
	}

}
