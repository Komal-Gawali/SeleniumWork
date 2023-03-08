package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupProg1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		driver.findElement(By.xpath("//button[normalize-space(text())='click the button to display an alert box:']")).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space(text())='Alert with OK & Cancel']")).click();
		driver.findElement(By.xpath("//button[normalize-space(text())='click the button to display a confirm box']")).click();
		Thread.sleep(3000);
		Alert b = driver.switchTo().alert();
		b.dismiss();
		driver.findElement(By.xpath("//a[normalize-space(text())='Alert with Textbox']")).click();
		driver.findElement(By.xpath("//button[normalize-space(text())='click the button to demonstrate the prompt box']")).click();
		Thread.sleep(3000);
		Alert c = driver.switchTo().alert();
		c.sendKeys("Komal");
		Thread.sleep(3000);
		System.out.println(c.getText());
		Thread.sleep(3000);
	    driver.quit();
	}

}
