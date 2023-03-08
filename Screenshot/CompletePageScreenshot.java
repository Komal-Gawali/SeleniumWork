package Screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CompletePageScreenshot {

static WebDriver driver;
	
	public static void completepagescreesho1() throws Exception {
		
		
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo8aa.jpeg");
        FileHandler.copy(source, dest);
	}
	public static void main(String[] args) throws NullPointerException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(300);
        driver.get("https://www.redbus.in/bus-tickets/");
        Thread.sleep(300);
        driver.manage().window().maximize();
        
         completepagescreesho1();
         Thread.sleep(300);
       
             driver.close();
	}

}
