package multiSelected;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowserProg {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		String str = "edge";
		
		if(str.equals("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
		else if(str.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
		else if(str.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
	
		Thread.sleep(3000);
		driver.close();

	}

}
