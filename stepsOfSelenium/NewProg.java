package stepsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewProg {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();      // This is syntx for launch browser
            driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
            WebElement fullNameText = driver.findElement(By.tagName("input"));
//             Absolute xpath  For full name text box (/html/body/center/form/div/table[2]/tbody/tr[3]//td[3]/input)
            WebElement RediffMailText = driver.findElement(By.xpath("(//input)[2]"));
//         Absolute xpath for email text box (/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input)
            WebElement passwordTextBox = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
           WebElement symbol = driver.findElement(By.xpath("//a[text()='Home']"));
           fullNameText.sendKeys("Komal");
           RediffMailText.sendKeys("komal123");
           passwordTextBox.sendKeys("komal@123");
           Select s1 = new Select(symbol);
          
           Thread.sleep(3000);
//           driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
           Thread.sleep(3000);
           driver.close();
	}

}
