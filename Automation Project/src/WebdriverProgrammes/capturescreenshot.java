package WebdriverProgrammes;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class capturescreenshot {

	public static void main(String[] args) throws Exception {

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Shreyansh Joshi\\Desktop\\Screenshots\\proof.png"));
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		File srcfile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile2, new File("C:\\Users\\Shreyansh Joshi\\Desktop\\Screenshots\\proof2.png"));
		
	}

}
