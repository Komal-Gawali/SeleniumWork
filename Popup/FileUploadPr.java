package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPr {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));
		uploadFile.sendKeys("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\KomalG.txt");
		
		Thread.sleep(3000);
		WebElement pressBtn = driver.findElement(By.xpath("//input[@value='Press']"));
		pressBtn.click();
		Thread.sleep(3000);
		driver.close();
	}

}
