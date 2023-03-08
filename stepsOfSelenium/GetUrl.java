package stepsOfSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          
          driver.get("https://www.instagram.com/accounts/emailsignup/");
          Thread.sleep(200);
          driver.navigate().to("https://www.facebook.com/");
          Thread.sleep(200);
          driver.navigate().back();
          Thread.sleep(200);
          driver.navigate().refresh();
          Thread.sleep(200);
          driver.navigate().forward();
          Thread.sleep(3000);
          driver.close();
          
	}

}
