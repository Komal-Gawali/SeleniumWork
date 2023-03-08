package WaitInSelenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetScriptTimeOut {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(0, 500)");
		driver.close();
	}

}
