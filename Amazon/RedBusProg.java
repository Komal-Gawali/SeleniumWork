package Amazon;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusProg {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photoRedBus.jpeg");
		FileHandler.copy(source, dest);
		
		
		Thread.sleep(30000);
		driver.close();
		
		
	}

}
