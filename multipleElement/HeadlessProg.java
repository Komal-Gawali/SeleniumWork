package multipleElement;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessProg {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
//		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://qavalidation.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source1);
		File dest1 = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\src\\Screenshot\\photoM1.jpeg");
		FileHandler.copy(source1, dest1);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.tripodeal.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		File source2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source2);
		File dest2 = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\src\\Screenshot\\photoM2.jpeg");
		FileHandler.copy(source2, dest2);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.redbus.in/");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		File source3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source3);
		File dest3 = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\src\\Screenshot\\photoM3.jpeg");
		FileHandler.copy(source3, dest3);
		
		
		
		
		
		
		Thread.sleep(3000);
			driver.close();

	}

}
