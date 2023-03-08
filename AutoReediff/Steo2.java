package AutoReediff;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Steo2 {

	

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		WebElement fullName = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement emailBox = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement passwordBox = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement repasswordBox = driver.findElement(By.xpath("//input[@name='repass']"));
		WebElement locationbox = driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement schoolName = driver.findElement(By.xpath("//input[@id='school']"));
		fullName.sendKeys("Komal");
		emailBox.sendKeys("komal1234@gmail.com");
		passwordBox.sendKeys("kmal@123");
		repasswordBox.sendKeys("kmal@123");
		locationbox.sendKeys("Nagpur");
		schoolName.sendKeys("Shivaji science, Nagpur");
		driver.findElement(By.xpath("//input[@value='f']")).click();
		WebElement dayDrop = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select s1 = new Select(dayDrop);
		s1.selectByVisibleText("28");
		WebElement monthDrop = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select s2 = new Select(monthDrop);
		s2.selectByVisibleText("DEC");
		WebElement yearDrop = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s3 = new Select(yearDrop);
		s3.selectByVisibleText("1998");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);
        File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo3.jpeg");
        FileHandler.copy(source, dest);
        Thread.sleep(3000);
        driver.close();
	}

}
