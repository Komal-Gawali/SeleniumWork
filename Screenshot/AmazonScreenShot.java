package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonScreenShot {

    public static void main(String[] args) throws Exception {
		
    	
    	     WebDriverManager.edgedriver().setup();
    	     WebDriver driver = new EdgeDriver();
    	     driver.get("https://www.amazon.in/");
    	      File source = ((EdgeDriver)driver).getScreenshotAs(OutputType.FILE);
    	      File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\amazonPhoto.jpeg");
    	      FileHandler.copy(source, dest);
    	      driver.close();
	}
   


   }
	
	   
