package Popup;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupProg3 {
	
	public void popupAlert() throws Exception {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo11.jpeg");
		 FileHandler.copy(source, dest);
		 Thread.sleep(400);
		 driver.close();
		 
	}

	public static void main(String[] args) throws Exception {
		AlertPopupProg3 k = new AlertPopupProg3();
		k.popupAlert();

	}

}
