package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupProg2 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		Alert b = driver.switchTo().alert();
		b.accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(3000);
         Alert c = driver.switchTo().alert();
		c.dismiss();
		Thread.sleep(300);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
		Alert d = driver.switchTo().alert(); 
		d.sendKeys("Komal");
		System.out.println(d.getText());
		Thread.sleep(3000);
		driver.quit();
	}

}
