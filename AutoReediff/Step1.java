package AutoReediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Step1 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.rediff.com/");
       
        driver.findElement(By.xpath("//a[text()='Create Account']")).click();   
        WebElement homeBtn = driver.findElement(By.xpath("//a[text()='Home']"));
        int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        if(homeBtn.isDisplayed()==true)
        {   ////a[@href='http://register.rediff.com/register/register.php?FormName=user_details']
        	System.out.println(homeBtn.getText());
        	count++;
        }
        else
        	System.out.println("Not print.");
        System.out.println(count);
        WebElement rediffLogo = driver.findElement(By.xpath("//img[@title='Rediff.com']"));
       
        if(rediffLogo.isDisplayed()==true)
        	{
            System.out.println("Logo Text"+ rediffLogo.getText());
        	count1++;
        }
        else 
        	System.out.println("Not print.");
  
        System.out.println(count1);
        WebElement createAccountText = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']"));
        if(createAccountText.isDisplayed()==true)
        {
        	System.out.println("Create account text ");
        	count2++;
        }
        else
        	System.out.println("Not print ");
        System.out.println(count1);
        WebElement fullNameText = driver.findElement(By.xpath("//td[text()='Full Name']"));
        if(fullNameText.isDisplayed()==true)
        {
        	System.out.println("Full name");
        	count3++;
        }
        else
        	System.out.println("not print");
        System.out.println(count3);
        WebElement fullNameTextBox = driver.findElement(By.xpath("//input[contains(@name, 'name')]"));
        fullNameTextBox.sendKeys("Komal Prakash Gawali");  //   /html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input
        if(fullNameTextBox.isDisplayed()==true)
        {
        	System.out.println("Full name text box ");
        	count4++;
        }
        else
        	System.out.println("Not Print");
        System.out.println(count4);
        WebElement rediffMailID = driver.findElement(By.xpath("//td[text()='Choose a Rediffmail ID']"));
        if(rediffMailID.isDisplayed()==true)
        {
        	System.out.println("Choose a Rediffmail ID");
        	count4++;
        }
        else
        System.out.println("Not Print");
        WebElement rediffMailBox = driver.findElement(By.xpath("//input[contains(@name, 'login')]"));
        if(rediffMailBox.isDisplayed()==true)
        {
        System.out.println("Rediff Mail Box");
        count4++;
        }
        else
       	System.out.println("Not Print");
        rediffMailBox.sendKeys("komal123");
        WebElement password = driver.findElement(By.xpath("(//input[contains(@name, 'passwd')])[1]"));
        if(password.isDisplayed()==true)
        {
        	System.out.println("Password");
        	count4++;
        }
        else
        	System.out.println("Not Print");
        password.sendKeys("komal@123");
        System.out.println("Total element " + (count+count1+count2+count3+count4));
        
        Thread.sleep(3000);
        driver.close();
}

}

