package CollectionProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programe3 {

	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://qavalidation.com/");
	
	
	Thread.sleep(3000);
	driver.close();
	
	
	
	}

}
