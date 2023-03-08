package StartUseSele;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

    public class redBusDemo1  {


	       public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2300);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement fromTextBox = driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/input"));
//		Relative xpath - //input[@data-message= 'Please enter a source city']
		WebElement destinationTextBox = driver.findElement(By.xpath("//input[@data-message= 'Please enter a destination city']"));
		fromTextBox.sendKeys("Nagpur");
		Thread.sleep(300);
		destinationTextBox.sendKeys("Mumbai-CT");
		WebElement dateTextBox = driver.findElement(By.xpath("//label[text()='Date']"));    
		dateTextBox.click();
		 driver.findElement(By.xpath("//td[@class='next']")).click();
		driver.findElement(By.xpath("//td[text()='28']")).click();
		WebElement searchbtn = driver.findElement(By.xpath("//button[text()='Search Buses']"));
		System.out.println(searchbtn.isDisplayed());
		searchbtn.click();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo5.jpeg");
		FileHandler.copy(source, dest);
		Thread.sleep(3000);
		driver.close();

	}

}
