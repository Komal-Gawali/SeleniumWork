package CollectionProg;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Programe2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator itr = windows.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		String win[] = new String[3];
		for(int i = 0; i<windows.size(); i++)
		{
		   win[i]= (String) itr.next();
			System.out.println(win[i]);
		}
		Thread.sleep(3000);
		driver.switchTo().window(win[1]);
		driver.manage().window().maximize();   // 
		Thread.sleep(3000);
		    WebElement searchBox = driver.findElement(By.xpath("/html/body/div/div/header/div[2]/div"));
		searchBox.click();
		WebElement searchText = driver.findElement(By.xpath("//input[@name='s']"));
		Actions a = new Actions(driver);
		a.moveToElement(searchText).build().perform();
//		a.sendKeys(Keys.valueOf("Selenium")).build().perform();
//		a.sendKeys(Keys.ENTER).build().perform();
		   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	       File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photoChildBrowser1.jpeg");  	
		   FileHandler.copy(source, dest);
		   Thread.sleep(3000);
		   
		Thread.sleep(3000);
		driver.close();
		
		Thread.sleep(3000);
		driver.switchTo().window(win[0]);
		driver.close();
	}

}
