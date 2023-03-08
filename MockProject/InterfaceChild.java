package MockProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterfaceChild implements InterfaceP1, InterfaceP2{

	WebDriver driver ;
	

	@Override
	public void parametrisationOfRediff() throws  Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		WebElement fullNameTextbox = driver.findElement(By.xpath("//input[@name='fullname']"));
		WebElement emailTextbox = driver.findElement(By.xpath("//input[@name='emailid']"));
		WebElement newPasswordTextbox = driver.findElement(By.xpath("//input[@name='pass']")); 
		WebElement retypePasswordTextbox = driver.findElement(By.xpath("//input[@name='repass']"));
		WebElement genderRadioBtn = driver.findElement(By.xpath("//input[@value='f']"));
		WebElement locationTextbox = driver.findElement(By.xpath("//input[@name='city']"));
		WebElement schoolNameTextbox = driver.findElement(By.xpath("(//input[@class='txtbox1'])[5]"));
		WebElement collegeNameTextbox = driver.findElement(By.xpath("//input[@name='college']"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\Book4.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
		String value1 = excel.getRow(0).getCell(0).getStringCellValue();
		String value2 = excel.getRow(0).getCell(1).getStringCellValue();
		String value3 = excel.getRow(0).getCell(2).getStringCellValue();
		String value4 = excel.getRow(0).getCell(3).getStringCellValue();
		String value5 = excel.getRow(0).getCell(4).getStringCellValue();
		String value6 = excel.getRow(0).getCell(5).getStringCellValue();
		String value7 = excel.getRow(0).getCell(6).getStringCellValue();
		fullNameTextbox.sendKeys(value1);
		emailTextbox.sendKeys(value2);
		newPasswordTextbox.sendKeys(value3);
		retypePasswordTextbox.sendKeys(value4);
		genderRadioBtn.click();
		locationTextbox.sendKeys(value5);
		schoolNameTextbox.sendKeys(value6);
		collegeNameTextbox.sendKeys(value7);
		
	}

	@Override
	public void screenshotOfPage() throws Exception {

                   File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
                   File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\p1111.jpeg");
                   FileHandler.copy(source, dest);
	}

	@Override
	public void screenshotOfFullPage() throws Exception {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.trivago.in/");
	    File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\p2222.jpeg");
	    FileHandler.copy(source, dest);
		
	}
	
	
   
}
