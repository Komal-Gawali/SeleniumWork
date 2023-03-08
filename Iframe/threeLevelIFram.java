package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class threeLevelIFram {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
	  
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		 
		  driver.manage().window().maximize();
		  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		 WebElement searchbtn = driver.findElement(By.xpath("//input[@id='s'][1]"));
		searchbtn.sendKeys("GIT Cheat Sheet");
		
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.xpath("//header[@style='margin-top: 0px;']//form//input")).sendKeys("development");
		
         Thread.sleep(3000);
         driver.close();
         
       
	}

}
