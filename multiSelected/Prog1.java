package multiSelected;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		  WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='cars']"));
//		  dropdown1.click();
//		  Thread.sleep(300);
           Select s= new Select(dropdown1);
           s.selectByVisibleText("Audi");
//           Thread.sleep(300);
           s.selectByVisibleText("Saab");
           Thread.sleep(300);
           s.selectByVisibleText("Volvo");
           Thread.sleep(300);
           s.selectByVisibleText("Opel");
           System.out.println(s.isMultiple());;
//           Thread.sleep(3000);
           System.out.println("All	selected	options");	
//           java.util.List<WebElement>	selectedOptions	=	s.getAllSelectedOptions();	
//          Object WebElement;
//		for(WebElement	value	:	selectedOptions)
//		{
//			WebElement fstOption = s.getFirstSelectedOption();	
//		}
//           System.out.println("First	Option	=	"	+	fstOption.getText());	
//
//           System.out.println(value.getText());

//           s.deselectByValue("Saab");
//		Thread.sleep(300);
		driver.close();
	}

}
