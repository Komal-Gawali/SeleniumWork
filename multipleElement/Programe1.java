package multipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Programe1 {

	public static void main(String[] args) throws Exception  {
		
		WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		  System.out.println("Title 2 = "+ driver.getTitle());
		
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
//		  System.out.println(links.size());
//		  
//		  for(int i = 0; i < links.size(); i++)
//		  {
//			  System.out.println(links.get(i).getText());
//		  }
		  for(int j=0; j<links.size(); j++ ) {
			  String expTitle = "Sign in";
			  String actTitle = links.get(j).getText();
			  
			  if(expTitle.equals(actTitle))
			  {
				  links.get(j).click();
				  System.out.println("Title 2 = "+ driver.getTitle());
				  break;
			  }
			 
			  
			  
		  }
		  
		  
		  
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
