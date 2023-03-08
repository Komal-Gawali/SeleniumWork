package MockProject;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractP1 {

	  public void screenshot() throws Exception {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		    File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\fbPhoto.jpeg");
		    FileHandler.copy(source, dest);
		    Thread.sleep(2000);
		    driver.close();
		    }
	  public void fullScreenshot() throws Exception {
		  WebDriverManager.firefoxdriver().setup();
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://hello.familyid.com/");
		   File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		   File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo10.jpeg");
		   FileHandler.copy(source, dest);
		   Thread.sleep(2000);
		   driver.quit();
	  }
}
