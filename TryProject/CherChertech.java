package TryProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CherChertech {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		 System.out.println(driver.getPageSource());
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 driver.close();
	}

}
