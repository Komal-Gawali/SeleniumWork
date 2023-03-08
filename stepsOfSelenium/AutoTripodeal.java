package stepsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoTripodeal {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripodeal.com/bus/?source=bing_bus&msclkid=5d21514cc5401768e672323ff21e0d5a");
		driver.manage().window().maximize();
		WebElement textBoxDepartPlace = driver.findElement(By.xpath("//input[@name='departbus']"));
		Thread.sleep(200);
		textBoxDepartPlace.sendKeys("Hyderabad city");
		WebElement textBoxDestination = driver.findElement(By.xpath("//input[@name='arrivebus']"));
		Thread.sleep(200);
		textBoxDestination.sendKeys("Nagpur Airport");
		WebElement date = driver.findElement(By.xpath("//input[@name='depart_date']"));
		Thread.sleep(200);
		date.click();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
