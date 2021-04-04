package WebdriverProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class workingwithdropdown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='themes']"));
		
		Select st= new Select(dropdown);
		//st.selectByVisibleText("Family");
		
		st.selectByIndex(5);
		
	}

}
