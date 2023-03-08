package multiSelected;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RetriveTable {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.navigate().to("https://www.rediff.com/");
         driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
          List<WebElement> readTableEles = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
          Iterator irt = readTableEles.iterator();
          for(int i = 0; i<readTableEles.size(); i++)
          {
      
        	  System.out.println(readTableEles.get(i).getText());
          }
//         WebElement tableRead = driver.findElement(By.xpath("//div[@class='hmbseindicestable show']"));
//         System.out.println(tableRead.getText());
         
          Thread.sleep(3000);
          driver.close();
	}

}
