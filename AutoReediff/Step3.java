package AutoReediff;


import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Step3 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://is.rediff.com/signup/register");
        WebElement fullNameText = driver.findElement(By.xpath("//input[@name='fullname']"));
        WebElement rediffEmailText = driver.findElement(By.xpath("//input[@name='emailid']"));
        WebElement passwordText = driver.findElement(By.xpath("//input[@name='pass']"));
        WebElement repasswordText = driver.findElement(By.xpath("//input[@name='repass']"));
        
        FileInputStream	file	=	new	FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\Book2.xlsx");	
         Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
         String value1 = excel.getRow(0).getCell(0).getStringCellValue();
         
         System.out.println(value1);
         fullNameText.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
         rediffEmailText.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
         passwordText.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
         repasswordText.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
          File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\photo4.jpeg");
          FileHandler.copy(source, dest);
         
        Thread.sleep(3000);
        driver.close();
	}

}
