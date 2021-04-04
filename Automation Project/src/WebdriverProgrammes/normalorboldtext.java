package WebdriverProgrammes;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class normalorboldtext {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		
		String ttagname = driver.findElement(By.xpath("//*[@id='applet_p_50000313']/div/div/div[1]/div/div/a/div[2]/div/p")).getTagName();
		
		if(ttagname.equals("p")){
			System.out.println("Normal Text");
		}
		else{
			System.out.println("Bold Text");
		}
		
		
		
		
		
		
		
	}

}
