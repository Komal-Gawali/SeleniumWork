package StartUseSele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.marathimatrimony.com/");
	       Thread.sleep(5000);
	       driver.manage().window().maximize();
	       Thread.sleep(4500);
	       driver.navigate().to("https://upstox.com/");
	       Thread.sleep(4500);
	       driver.navigate().to("https://www.irctc.co.in/nget/train-search");
	       Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close();

	}

}
