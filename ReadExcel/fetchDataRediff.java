package ReadExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fetchDataRediff {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement fullNameTextbox = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement emailIDTextbox = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement passwordTextbox = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement retypePasswordTextbox = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='date_day']"));
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='date_mon']"));
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		WebElement locationTextbox = driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement schoolTextbox = driver.findElement(By.xpath("//input[@id='school']"));
	    WebElement collegeTextbox = driver.findElement(By.xpath("//input[@id='college']"));
		WebElement genderRadioBtn = driver.findElement(By.xpath("//input[@value='f']"));
	    
		FileInputStream file = new FileInputStream("C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\testData\\Data.txt.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet2");
		String value1 = excel.getRow(0).getCell(1).getStringCellValue();
		String value2 = excel.getRow(0).getCell(0).getStringCellValue();
		String value3 = excel.getRow(0).getCell(2).getStringCellValue();
		String value4 = excel.getRow(0).getCell(3).getStringCellValue();
		String value5 = excel.getRow(0).getCell(4).getStringCellValue();
		String value6 = excel.getRow(0).getCell(5).getStringCellValue();
		String value7 = excel.getRow(0).getCell(6).getStringCellValue();
		String value8 = excel.getRow(0).getCell(7).getStringCellValue();
  		String value9 = excel.getRow(0).getCell(8).getStringCellValue();
  		String value10 = excel.getRow(0).getCell(9).getStringCellValue();
 		
		fullNameTextbox.sendKeys(value2);
		Thread.sleep(2000);
		emailIDTextbox.sendKeys(value1);
		Thread.sleep(2000);
		passwordTextbox.sendKeys(value3);
		Thread.sleep(2000);
		retypePasswordTextbox.sendKeys(value4);
		Thread.sleep(2000);
		genderRadioBtn.click();
		Thread.sleep(2000);
		dayDropDown.sendKeys(value5);
		Thread.sleep(2000);
		monthDropDown.sendKeys(value6);
		Thread.sleep(2000);
		yearDropDown.sendKeys(value7);
		Thread.sleep(2000);
		locationTextbox.sendKeys(value8);
		Thread.sleep(2000);
		schoolTextbox.sendKeys(value9);
		Thread.sleep(2000);
		collegeTextbox.sendKeys(value10);
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
