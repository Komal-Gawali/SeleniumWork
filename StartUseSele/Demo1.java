package StartUseSele;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(6000);
		driver.get("https://www.hotstar.com/in");
		Thread.sleep(6000);
		driver.navigate().to("https://www.hotstar.com/in/tv/mahabharat/435/duryodhan-challenges-krishna/1000011910");
		Thread.sleep(100000);
      	driver.close();

	}
//   java.net.SocketException
}
// C:\\\\Users\\\\GANESH GOURI\\\\Downloads\\\\chromedriver_win32\\\\chromedriver_exe
//C:\\Users\\GANESH GOURI\\OneDrive\\Desktop\\28-05-2022 test\\Automation\\chromedriver.exe