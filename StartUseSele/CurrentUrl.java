package StartUseSele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hotstar.com/in");
	String expTitle = "Disney+ Hotstar - Watch TV Shows, Movies, Specials, Live Cricket & Football";
		String actTitle = driver.getTitle() ;
		if(expTitle.equals(actTitle)) 
 	 	{ 
 	 	 	System.out.println("Title - Test case pass"); 
 	 	} 
 	 	else 
 	 	{ 
 	 	 	System.out.println("Title - Test case failed"); 
 	 	} 
		System.out.println("Actual Title = " + actTitle);
		String currURl = driver.getCurrentUrl();
 	 	 
    System.out.println("Current url = " + currURl);
    Thread.sleep(5000);
    driver.close();
    }
}

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe"); 
// 	 	WebDriver driver = new ChromeDriver();  	 	
// 	 	Thread.sleep(2000); 
// 	 	driver.manage().window().maximize();  	 	
// 	 	Thread.sleep(2000); 
// 	 	driver.get("https://www.hotstar.com/in"); 
// 	 	 
// 	 	String expTitle = "Disney+ Hotstar - Watch TV Shows, Movies, Specials, Live Cricket & Football"; 
// 	 	 
// 	 	String actTitle = driver.getTitle();   
// 	 	 
// 	 	if(expTitle.equals(actTitle)) 
// 	 	{ 
// 	 	 	System.out.println("Title - Test case pass"); 
// 	 	} 
// 	 	else 
// 	 	{ 
// 	 	 	System.out.println("Title - Test case failed"); 
// 	 	} 
// 	 	 
// 	 	System.out.println("Actual Title = " + actTitle); 
// 	 	 
// 	 	String currURL = driver.getCurrentUrl(); 
// 	 	 
// 	 	System.out.println("URL :- " + currURL); 
// 	 	 
// 	 	driver.close();  
// 	} 
//} 
