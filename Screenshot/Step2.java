package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Step2 {
	
	public static void useFirefox() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo1flipkart.jpeg");
		FileHandler.copy(source, dest);
		System.out.println(source);
		Thread.sleep(3000);
		driver.quit();
	}
	
		public static void main(String[] args) throws Throwable  {
		
			useFirefox();

	}

}
