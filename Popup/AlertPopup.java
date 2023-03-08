package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	Thread.sleep(300);
	Alert a = driver.switchTo().alert();
	a.accept();


	
	Thread.sleep(3000);
	driver.close();
			
	
	}
}
