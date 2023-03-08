package CollectionProg;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		Thread.sleep(200);
		driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator itr = windows.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		Thread.sleep(2000);
		System.out.println(windows.size());
		System.out.println("-------------------------------");
		String win[] = new String[3];	
				for(int i=0; i<windows.size(); i++)
				{
					win[i]=(String) itr.next();
					System.out.println(win[i]);
				}
				Thread.sleep(2000);
				driver.switchTo().window(win[1]);
			System.out.println("Small window title = " + driver.getTitle());
			driver.close();
				
			Thread.sleep(5000);
			driver.switchTo().window(win[0]);
			System.out.println("Small window title = " + driver.getTitle());
			driver.close();
				
//		Thread.sleep(3000);
//		driver.close();

	}

}
