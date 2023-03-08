package StartUseSele;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TripodealAuto {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
     driver.get("https://www.tripodeal.com/bus/?source=bing_bus&msclkid=5d21514cc5401768e672323ff21e0d5a");
     Thread.sleep(4000);
       driver.findElement(By.tagName("input")).sendKeys("Nagpur");
         Thread.sleep(1000);
        driver.findElement(By.name("arrivebus")).sendKeys("Pune");
        Thread.sleep(1000);
       driver.findElement(By.id("dateNewBus")).click();
       Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='picker__nav--next']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='dateNewBus_1673289000000']")).click();
        File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest1 = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo6.jpeg");
        FileHandler.copy(source1, dest1);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@name='search']")).click();
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo7.jpeg");
        FileHandler.copy(source, dest);
    Thread.sleep(3000);
     driver.close();
	}

}
