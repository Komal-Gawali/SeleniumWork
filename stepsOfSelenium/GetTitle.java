package stepsOfSelenium;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(300);
        Dimension z = new Dimension(600, 400);
        driver.manage().window().setSize(z);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        driver.manage().window().maximize();
        String expTitle = "Facebook – log in or sign up";
        String actTitle = driver.getTitle();
        String currUrl = driver.getCurrentUrl();
        if(expTitle.equals(actTitle)) {
        	System.out.println("Case is Pass.");
        }
        else {
        	System.out.println("Case is fail.");
        }
        	System.out.println(driver.getTitle());
        	System.out.println(currUrl);
        	Thread.sleep(3000);
          driver.close();
	}

}

