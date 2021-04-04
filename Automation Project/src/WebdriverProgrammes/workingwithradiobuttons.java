package WebdriverProgrammes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithradiobuttons {

	public static void main(String[] args) {

		//To get no of radiobuttons
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		
		List<WebElement>radios = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("No of radiobuttons are"+"  "+radios.size());
		
		//To get names of radiobuttons
		
		for(int i=0;i<radios.size();i++){
			System.out.println(radios.get(i).getAttribute("name"));
		}
		
		//Default status of radiobutton whenever we are opening a particular page
		
		for(int i =0;i<radios.size();i++){
		String rname=radios.get(i).getAttribute("name");
			
		if(radios.get(i).isSelected()){
			System.out.println(rname+"   "+"Active" );
		}
		
		else{
			System.out.println(rname+"  "+"Inactive");
		}
		
		
		
		
		
		}
		}
		}

