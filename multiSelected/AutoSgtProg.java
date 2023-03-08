package multiSelected;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AutoSgtProg {

	public	static	void	main(String[]args)	throws	Exception	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Sugar");
//		Thread.sleep(1000);
		List<WebElement> autoSugEle	= driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div/div/div[2]/div[2]/div/div/div/ul/li"));
//		for(int i =0 ; i<autoSugEle.size(); i++)
//		System.out.println(autoSugEle.get(i).getText());
		    
			
		for(int i =0; i<autoSugEle.size(); i++) 
		{	
			if(autoSugEle.get(i).getText().equals("sugar lipstick"))
			{
				
				autoSugEle.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		driver.quit();
		}
	}


