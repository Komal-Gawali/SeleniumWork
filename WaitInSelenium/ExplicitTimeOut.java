package WaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitTimeOut {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
//		 WebElement button1 = driver.findElement(By.xpath("//button[@id='alert']"));
		
//		 WebElement button2 = driver.findElement(By.xpath("//button[@id='populate-text']"));
//		 WebElement text = driver.findElement(By.xpath("//h2[@class='target-text']"));
		
//		 WebElement button3 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
//		 WebElement enableBtn = driver.findElement(By.xpath("//button[@id='hidden']"));
		 
//		 WebElement button4 = driver.findElement(By.xpath("//button[@id='enable-button']"));
//		 WebElement btn = driver.findElement(By.xpath("//button[@id='disable']"));
		 
		 WebElement button5 = driver.findElement(By.xpath("//button[@id='checkbox']"));
         WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		 
//		 button1.click(); 
//		 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
//		 w.until(ExpectedConditions.alertIsPresent());
//		 driver.switchTo().alert().accept();
		 
		 
//		 button2.click();
//		 WebDriverWait v = new WebDriverWait(driver, Duration.ofSeconds(30));
//		 v.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
		 
//		 button3.click();
//		 WebDriverWait u = new WebDriverWait(driver, Duration.ofSeconds(30));
//		 u.until(ExpectedConditions.visibilityOf(enableBtn));
		 
//		 button4.click();
//		 WebDriverWait x = new WebDriverWait(driver, Duration.ofSeconds(30));
//		 x.until(ExpectedConditions.visibilityOf(btn));
		 
		 button5.click();
		 WebDriverWait y = new WebDriverWait(driver, Duration.ofSeconds(30));
		 y.until(ExpectedConditions.visibilityOf(checkBox));
		 
    	driver.close();
	}

}
