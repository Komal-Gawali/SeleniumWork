package rediffProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartProj {

	public static void main(String[] args) throws Exception {
//		System - Class and setProperty - path give for launch 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();        // this is use for launching browser
  		driver.get("https://is.rediff.com/signup/register");
        WebElement rediffLink = driver.findElement(By.xpath("//a[text()='rediff.com']"));
        System.out.println(rediffLink.getText());
        WebElement rediffLogo = driver.findElement(By.xpath("//img[@class='halflogo']"));
        System.out.println(rediffLogo.isDisplayed());
        WebElement labelLogo = driver.findElement(By.xpath("//div[@id='div_register']//b"));
        System.out.println(labelLogo.getText());
        WebElement tellUsAbout = driver.findElement(By.xpath("//p[@class='grey1']"));
          String actTellUsAbout = tellUsAbout.getText();
          System.out.println(actTellUsAbout);
          String expTellUsAbout = "Tell us a few things about yourself and we will help you find classmates and\r\n"
          		+ "other friends among rediff.com's millions of world-wide users.";
          if(expTellUsAbout.equals(actTellUsAbout))
          {
        	  System.out.println("Task completed");
          }
          else
        	  System.out.println("Task completed");
          Thread.sleep(300);
          WebElement fullNameTextBox = driver.findElement(By.xpath("//input[@id='fullname']"));
          System.out.println("1"+ fullNameTextBox.isDisplayed());
          System.out.println("2"+ fullNameTextBox.isSelected());
          System.out.println("3"+ fullNameTextBox.isEnabled());
          System.out.println("_________________________________");
          fullNameTextBox.sendKeys("Lee min ho");
          WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='emailid']"));
          emailTextBox.sendKeys("min@1234lgmail.com");
          System.out.println(emailTextBox.isDisplayed());
          System.out.println(emailTextBox.isEnabled());
          System.out.println(emailTextBox.isSelected());
          System.out.println("_________________________________");
          WebElement passwordBox = driver.findElement(By.xpath("//input[@id='pass']"));
          passwordBox.sendKeys("min@1234");
          System.out.println(passwordBox.isDisplayed());
          System.out.println(passwordBox.isEnabled());
          System.out.println(passwordBox.isSelected());
          System.out.println("_________________________________");
          WebElement repasswordBox = driver.findElement(By.xpath("//input[@id='repass']"));
          repasswordBox.sendKeys("min@1234");
          System.out.println(repasswordBox.isDisplayed());
          System.out.println(repasswordBox.isEnabled());
          System.out.println(repasswordBox.isSelected());
          System.out.println("_________________________________");
          WebElement genderRadioBtn = driver.findElement(By.xpath("//input[@value='m']"));
          genderRadioBtn.click();
         System.out.println(genderRadioBtn.isDisplayed());
         System.out.println(genderRadioBtn.isEnabled());
         System.out.println(genderRadioBtn.isSelected());
         
       Thread.sleep(300);
       driver.findElement(By.xpath("//a[text()='rediff.com']")).click();
       Thread.sleep(3000);
       driver.close();
       
	}
}
