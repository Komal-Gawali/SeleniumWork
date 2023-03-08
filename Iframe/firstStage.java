package Iframe;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;


public class firstStage {

	public static void main(String[] args) throws Exception {
      
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
//		String id
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	      File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\workspace-Eclipse\\Automation\\ScreenShot\\phtttt1.jpeg");
	      FileHandler.copy(source, dest);
	      Thread.sleep(4000);
		driver.close();
	}

}
