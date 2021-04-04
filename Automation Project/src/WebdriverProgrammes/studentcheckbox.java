package WebdriverProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class studentcheckbox {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement student = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		
		student.click();
		
		if(student.isSelected()){
			System.out.println("Checkbox working successfully");
		}
		else{
			System.out.println("Checkbox not working successfully");
		}
		
		
	}

}
