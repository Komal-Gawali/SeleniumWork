package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopup {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		Thread.sleep(3000);
		WebElement opnBtn = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		opnBtn.click();
		
		 Set<String> nwindows = driver.getWindowHandles();
		Iterator<String> itr = nwindows.iterator();
		String parentWindo = itr.next();
		String childWindow = itr.next();
//		if(itr.hasNext()) {
//			driver.switchTo().window(childWindow);
//			
//		}
		driver.switchTo().window(childWindow);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.close();
		driver.switchTo().window(parentWindo);
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
