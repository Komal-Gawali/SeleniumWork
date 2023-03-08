package StartUseSele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4500);
		driver.manage().window().maximize();
       driver.get("https://www.redbus.in/");
       Thread.sleep(4500);
       driver.manage().window().minimize();
       driver.navigate().to("https://www.marathimatrimony.com/");
       Thread.sleep(5000);
       driver.manage().window().maximize();
       Thread.sleep(4500);
       driver.navigate().to("https://upstox.com/");
       Thread.sleep(4500);
       driver.navigate().to("https://www.irctc.co.in/nget/train-search");
       Thread.sleep(1000);
       driver.close();
	}

}
