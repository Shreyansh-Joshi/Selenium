package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activeorinactivedropdown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='themes']"));
		List<WebElement>values=dropdown.findElements(By.tagName("option"));
		
		for(int i=0;i<values.size();i++){
			String vname = values.get(i).getText();
			values.get(i).click();
			
			if(values.get(i).isDisplayed()){
				System.out.println(vname+"  "+"Active" );
			}
			
			else{
				System.out.println(vname+"  "+"Inactive");
			}
		}
		
		
		
		
	}

}
