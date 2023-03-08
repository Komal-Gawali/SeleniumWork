package Facebook;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class AutomateFacebook {

	 public static void main(String[]args) throws Exception {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/"); 
    driver.manage().window().maximize();
    String expTitle = "Facebook – log in or sign up";
        String actTitle = driver.getTitle();
        if(expTitle.equals(actTitle))
        {
        	System.out.println("Test case is pass");
        }
        else
        	System.out.println("Test case is fail");
        System.out.println(actTitle);
        WebElement emailOrPhoneNumBox = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='pass']"));
        Thread.sleep(300);
        emailOrPhoneNumBox.sendKeys("komal@123gmail.com");
        Thread.sleep(300);
         passwordBox.sendKeys("komal@123");
        Thread.sleep(200);
        driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
           File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo2.jpeg");
           FileHandler.copy(source, dest);
       Thread.sleep(3000);
    driver.close();           
          
        }
}
