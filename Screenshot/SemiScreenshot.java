package Screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SemiScreenshot {
	 
	static WebDriver driver;
	
	public static void completepagescreesho1() throws Exception {

        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo8aa.jpeg");
        FileHandler.copy(source, dest);
	}
	
	public static void logoScreenshot() throws Exception {
		
		WebElement logo = driver.findElement(By.xpath("//i[@class='icon icon-redBus_Logo D121_logo_main']"));
		 File source = logo.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\PhotoLogo1.jpeg");
		 FileHandler.copy(source, dest);
	}
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.redbus.in/bus-tickets/");
          completepagescreesho1();
          logoScreenshot();
        
              driver.close();
	}

}
