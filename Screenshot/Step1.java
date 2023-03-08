package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Step1 {
	public static void chromeScreenshot() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		File source = ((ChromeDriver)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo9.jpeg");
		FileHandler.copy(source, dest);
		System.out.println(source);
		driver.close();
	}

	 public static void main(String[] args) throws Exception {
		 chromeScreenshot();
		 Thread.sleep(3000);
//		 //import io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver();
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photoK1.jpeg");
		FileHandler.copy(source, dest);
		Thread.sleep(3000);
		driver.quit();
	}
}
