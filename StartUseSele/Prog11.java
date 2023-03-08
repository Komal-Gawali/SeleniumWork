package StartUseSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Prog11 {

	public static void main(String[] args) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  Thread.sleep(200);
	  WebElement placeFromTakeTrain = driver.findElement(By.xpath("//input[@aria-controls='pr_id_1_list']"));
	  WebElement placeToReach = driver.findElement(By.xpath("//input[@aria-controls='pr_id_2_list']"));
//	  WebElement dateOfBooking = driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']"));
   WebElement dropDown = driver.findElement(By.xpath(null));
	  Thread.sleep(200);
      placeFromTakeTrain.sendKeys("Nagpur");
      Thread.sleep(200);
      placeToReach.sendKeys("Mumbai-MMCT");
//      Select s = new Select(dateOfBooking);
//      Thread.sleep(200);
//      s.selectByVisibleText("12/12/2022");
      Thread.sleep(2000);
      driver.close();
      
	}

}
