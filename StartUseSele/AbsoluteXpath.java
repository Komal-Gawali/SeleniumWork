package StartUseSele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
// Absolute Xpath
public class AbsoluteXpath {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		//  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[2]/input")).sendKeys("Janvhi");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[5]/input")).sendKeys("janvhi@123gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[8]/input")).sendKeys("janvhi@123");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[11]/input")).sendKeys("janvhi@123");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[14]/input[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[16]/select[1]")).sendKeys("28");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[16]/select[2]")).sendKeys("DEC");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[16]/select[3]")).sendKeys("1998");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[18]/input")).sendKeys("Nagpur");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[21]/input")).sendKeys("Shivaji Science School and College, Nagpur");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/form/div[24]/input")).sendKeys("GOV. Institute of science, Nagpur");
		Thread.sleep(50000);
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/a")).click();
   Thread.sleep(1000);
   driver.close();
	}

}
// /html/body/div[3]/div[4]/div[1]   (Absolute Xpath For Register page)