package WaitInSelenium;

import java.time.Duration;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitTimeOut {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
//		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));   deprecate method and not code is not affected by this`
		driver.get("https://www.google.com/");
		
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Jav");
		 
		List<WebElement> autoSug = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(autoSug.size());
		for(int i = 0; i< autoSug.size(); i++) {
			System.out.println(autoSug.get(i).getText());
				if(autoSug.get(i).getText().equals("javascript")) {
					autoSug.get(i).click();
					break;
				}
			
		}
		driver.close();
	}

}
