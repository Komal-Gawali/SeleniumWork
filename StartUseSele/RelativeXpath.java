package StartUseSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RelativeXpath {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
        driver.get("https://is.rediff.com/signup/register");
         WebElement rediffSmallLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
         WebElement rediffLink = driver.findElement(By.xpath("//a[text()='rediff.com']"));
         WebElement fullNameTextbox = driver.findElement(By.xpath("//input[@id='fullname']"));
         WebElement emailTextbox = driver.findElement(By.xpath("//input[@name='emailid']"));
        WebElement passwordTextbox = driver.findElement(By.xpath("//input[@name='pass']"));
        WebElement rePasswordTextbox = driver.findElement(By.xpath("//input[@name='repass']"));
        WebElement genderRadioButton = driver.findElement(By.xpath("//input[@value='f']"));
        WebElement dateSelect = driver.findElement(By.xpath("//select[@name='date_day']"));
        WebElement monthSelect = driver.findElement(By.xpath("//select[@name='date_mon']"));
        WebElement yearSelect = driver.findElement(By.xpath("//select[@name='Date_Year']"));
       WebElement locationTextbox = driver.findElement(By.xpath("//input[@id='signup_city']"));
        Thread.sleep(200);
     System.out.println( rediffSmallLogo.isDisplayed());
        
        fullNameTextbox.sendKeys("Kunal");
        Thread.sleep(200);
        emailTextbox.sendKeys("kunal@123gmail.com");
        Thread.sleep(200);
        passwordTextbox.sendKeys("kunal@123");
        Thread.sleep(200);
        rePasswordTextbox.sendKeys("kunal@123");
        Thread.sleep(200);
        genderRadioButton.click();
        Thread.sleep(200);
        dateSelect.sendKeys("28");
        Thread.sleep(200);
        monthSelect.sendKeys("DEC");
        Thread.sleep(200);
        yearSelect.sendKeys("1999");
        locationTextbox.sendKeys("Nagpur");
        rediffLink.click();
        Thread.sleep(2000);
        driver.close();
			
	}

}
