package Facebook;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomateFacebookStep2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://www.facebook.com/");
     
     WebElement creatAccountBtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
     creatAccountBtn.click();
     driver.manage().window().maximize();
     Thread.sleep(3000);
     WebElement fullNameBox = driver.findElement(By.xpath("//input[@name='firstname']"));
     WebElement surnameTextBox = driver.findElement(By.xpath("//input[@name='lastname']"));
     WebElement emailOrPhoneTextBox = driver.findElement(By.xpath("//input[@name='reg_email__']"));
      WebElement passwordTextBox = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
     WebElement dayDropDown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
     WebElement monthDropDown = driver.findElement(By.xpath("//select[@name='birthday_month']"));
     WebElement yearDropDown = driver.findElement(By.xpath("//select[@name='birthday_year']"));
     
     
      FileInputStream file  = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\Book4.xlsx");
      Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
      fullNameBox.sendKeys(excel.getRow(0).getCell(0).getStringCellValue());
      surnameTextBox.sendKeys(excel.getRow(0).getCell(1).getStringCellValue());
      emailOrPhoneTextBox.sendKeys(excel.getRow(0).getCell(2).getStringCellValue());
      passwordTextBox.sendKeys(excel.getRow(0).getCell(3).getStringCellValue());
      dayDropDown.sendKeys(excel.getRow(0).getCell(4).getStringCellValue());
      monthDropDown.sendKeys(excel.getRow(0).getCell(5).getStringCellValue());
      yearDropDown.sendKeys(excel.getRow(0).getCell(6).getStringCellValue());
      WebElement genderRadioBtn = driver.findElement(By.xpath("//label[text()='Female']"));
      genderRadioBtn.click();
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\ScreenShot\\fb1Photo.jpeg");
        FileHandler.copy(source, dest);
     Thread.sleep(3000);
     driver.close();
	}

}














