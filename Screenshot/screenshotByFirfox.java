package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotByFirfox {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");
		  File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		  File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo9.jpeg");
		  FileHandler.copy(source, dest);
	}

}
