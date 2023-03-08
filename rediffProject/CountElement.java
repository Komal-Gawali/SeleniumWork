package rediffProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountElement {

	public static <takeScreenShort> void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome,driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		WebElement rediffLink = driver.findElement(By.xpath("//a[text()='rediff.com']"));
		int count = 0;
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
//WebElement logo = driver.findElement(By.xpath("//img[@alt='rediff on the net']"));
//System.out.println(logo.isDisplayed());