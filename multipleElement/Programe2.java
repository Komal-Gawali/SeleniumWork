package multipleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Programe2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().fullscreen();
//		driver.manage().window().minimize();
		WebElement helpLink = driver.findElement(By.xpath("//a[@href='/gp/help/customer/display.html?nodeId=200507590&ref_=footer_gw_m_b_he']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(helpLink).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		driver.close();
		
	}

}
