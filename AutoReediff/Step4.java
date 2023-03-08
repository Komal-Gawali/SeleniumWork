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

public class Step4 {

	public static void main(String[] args) throws Exception {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://is.rediff.com/signup/register");
       driver.manage().window().maximize();
       WebElement fullNameBox = driver.findElement(By.xpath("//input[@id='fullname']"));
       WebElement emailIDBox = driver.findElement(By.xpath("//input[@id='emailid']"));
       WebElement passwordBox = driver.findElement(By.xpath("//input[@id='pass']"));
       WebElement repasswordBox = driver.findElement(By.xpath("//input[@id='repass']"));
       WebElement radioBtn = driver.findElement(By.xpath("//input[@value='f']"));
       WebElement dayBox = driver.findElement(By.xpath("//select[@name='date_day']"));
       WebElement monthBox = driver.findElement(By.xpath("//select[@name='date_mon']"));
       WebElement yearBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
       WebElement locationBox = driver.findElement(By.xpath("//input[@name='city']"));
       WebElement schoolBox = driver.findElement(By.xpath("//input[@name='school']"));
       WebElement collegeBox = driver.findElement(By.xpath("//input[@name='college']"));
       WebElement captchaBox = driver.findElement(By.xpath("//input[@name='fld_captcha']")); 
      WebElement singUpBtn = driver.findElement(By.id("btn_register"));
       
       FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\Book2.xlsx");
       Sheet excel = WorkbookFactory.create(file).getSheet("Sheet3");
	      String value2 = excel.getRow(0).getCell(0).getStringCellValue();
	      String value3 = excel.getRow(0).getCell(1).getStringCellValue();
	      String value4 = excel.getRow(0).getCell(2).getStringCellValue();
	      String value5 = excel.getRow(0).getCell(3).getStringCellValue();
	      String value6 = excel.getRow(0).getCell(4).getStringCellValue();
	      String value7 = excel.getRow(0).getCell(5).getStringCellValue();
	      String value8 = excel.getRow(0).getCell(6).getStringCellValue();
	      String value9 = excel.getRow(0).getCell(7).getStringCellValue();
	      String value10 = excel.getRow(0).getCell(8).getStringCellValue();
	      String value11 = excel.getRow(0).getCell(9).getStringCellValue();
//	      String value12 = excel.getRow(0).getCell(10).getStringCellValue();
	      Thread.sleep(300);
	      fullNameBox.sendKeys(value2);
	      Thread.sleep(300);
	      emailIDBox.sendKeys(value3);
	      Thread.sleep(300);
	      passwordBox.sendKeys(value4);
	      Thread.sleep(300);
	      repasswordBox.sendKeys(value5);
	      Thread.sleep(300);
	       radioBtn.click();
	      Thread.sleep(300);
	      dayBox.sendKeys(value6);
	      Thread.sleep(300);
	      monthBox.sendKeys(value7);
	      Thread.sleep(300);
	      yearBox.sendKeys(value8);
	      Thread.sleep(300);
	      locationBox.sendKeys(value9);
	      Thread.sleep(300);
	      schoolBox.sendKeys(value10);
	      Thread.sleep(300);
	      collegeBox.sendKeys(value11);
//	      Thread.sleep(300);
//	      captchaBox.sendKeys(value12);
	         System.out.println( captchaBox.isDisplayed());
	      Thread.sleep(300);
	      singUpBtn.click();
	         File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\rediffPhoto1.jpeg");
	         FileHandler.copy(source, dest);
      Thread.sleep(3000);
     driver.close();
      
	}

}
