package Amazon;

import java.awt.Dimension;
import java.awt.geom.Dimension2D;
import java.io.Serializable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Step1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		org.openqa.selenium.Dimension d = new org.openqa.selenium.Dimension(100, 300);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement accountAndSingin = driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"));
		Actions a = new Actions(driver);
		a.moveToElement(accountAndSingin).build().perform();
		
		Thread.sleep(100);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(100);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(100);
		a.sendKeys(Keys.DOWN).build().perform();
		
		
		Thread.sleep(3000);
        driver.close();
	}

}
