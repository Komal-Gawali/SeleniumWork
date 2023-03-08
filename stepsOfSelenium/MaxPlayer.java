package stepsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxPlayer {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();        // UpCasting / Override and it is syntax for browser launch
		driver.manage().window().maximize();
        driver.get("https://account.familyid.com/signup");
      
        WebElement firstNameBox = driver.findElement(By.xpath("//input[@name='first name']"));
       
        firstNameBox.sendKeys("Trusha");
        WebElement lastNameBox = driver.findElement(By.xpath("//input[@name='last name']"));
        Thread.sleep(300);
        lastNameBox.sendKeys("Dhole");
        WebElement emailIDBox = driver.findElement(By.xpath("//input[@name='email']"));
        Thread.sleep(300);
        emailIDBox.sendKeys("dholeT76.DT@gmail.com");
//        Thread.sleep(300);
//        Thread.sleep(300);
//        Thread.sleep(300);

        Thread.sleep(3000);
        driver.close();
	}

}
//driver.findElement(By.xpath("//select[@id='parent_locale_select']")).click();
//driver.findElements(By.xpath("//html/body/div/div/section/div[1]/div/div/select/option[5]")).click();
