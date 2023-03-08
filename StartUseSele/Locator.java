package StartUseSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(3000);
		driver.findElement(By.tagName("input")).sendKeys("Rohan");
		Thread.sleep(1000);
		driver.findElement(By.id("emailid")).sendKeys("rohan@123gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("rohan@1223");
		Thread.sleep(1000);
		driver.findElement(By.name("repass")).sendKeys("rohan@1223");
		Thread.sleep(1000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("date_day")).sendKeys("28");
		Thread.sleep(1000);
		driver.findElement(By.id("date_mon")).sendKeys("DEC");
		Thread.sleep(1000);
		driver.findElement(By.id("signup_city")).sendKeys("Nagpur");
		Thread.sleep(1000);
		driver.findElement(By.name("school")).sendKeys("Shivaji Science, Nagpur");
		Thread.sleep(1000);
		driver.findElement(By.name("college")).sendKeys("Gov. Institute Of Science, Nagpur ");
		Thread.sleep(1000);
		driver.findElement(By.linkText("rediff.com")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
