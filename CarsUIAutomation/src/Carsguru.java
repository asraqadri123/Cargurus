import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Carsguru {

	WebDriver driver;
	
	@BeforeMethod
public void openbrowser() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Automation Selenium\\chromedriver.exe");
	driver = new ChromeDriver();
		
		//driver = new FirefoxDriver();
	 String url = "https://www.cars.com";
	 driver.get(url);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 System.out.println("Print this page");
	 
}
	



}
