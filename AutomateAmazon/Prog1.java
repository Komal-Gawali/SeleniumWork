package AutomateAmazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
    	WebElement searchTextbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    	searchTextbox.sendKeys("Boat Headphones");
    	Thread.sleep(1000);
    	Actions a = new Actions(driver);
    	a.sendKeys(Keys.ENTER).build().perform();
    	for(int i = 0; i<=15; i++) {
    		Thread.sleep(1000);
    		a.sendKeys(Keys.ARROW_DOWN).build().perform();
    	}
    	Thread.sleep(3000);
    	a.sendKeys(Keys.ENTER).build().perform();
    	
		Thread.sleep(3000);
		driver.close();

	}

}
