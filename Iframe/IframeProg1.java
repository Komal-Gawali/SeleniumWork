package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeProg1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		
//		Thread.sleep(3000);
//		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Log in']"));
//		loginBtn.click();
		WebElement switchToFrame = driver.findElement(By.xpath("//iframe[@title='W3Schools HTML Tutorial']"));
		driver.switchTo().frame(switchToFrame);
		Thread.sleep(3000);
		WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Log in']"));
		loginBtn.click();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(150000);
		driver.close();
		
	}

}
