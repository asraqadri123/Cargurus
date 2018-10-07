

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.*;
/*1. BeforeClass (This is Before Class method)
 * 2.BeforeMethod (This is Before Method)
 * 3.Test (Priority 1)
 * This is Test 1 Method
 * 4. AfterMethod (THis is the After method)
 * 5. BeforeMethod (This is Before Method)
 * 6.Test (Priority 2)
 * 7. This is Test Class method
 * 8. AfterMethod (THis is the After method)
 * 9.AfterClass

*/
	public class Cars2 {
	   // private static final String priority1 = null;
		WebDriver driver;

	@BeforeClass
	public void StartClass() {
		System.out.println("This is Before Class method");
	}
	
	    @Test(priority =2)
	    public void verfiyTitleOfCars() {
	        String actualTitle = driver.getTitle();
	        assertTrue(actualTitle.contains("Cars.com"));
	        System.out.println("This is Test  Class method");
	    }
	    
	    @BeforeMethod
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Automation Selenium\\chromedriver.exe\\");
	        driver = new ChromeDriver();
	        driver.get("http://www.cargurus.com");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        System.out.println("This is Before Method");
	    }
	    
	    @Test(priority=1)
	    public void SearchCarsForAZipCode() {
	        /*driver.findElement(By.id("dealFinderZipUsedId")).sendKeys("11554");
	        driver.findElement(By.id("dealFinderForm_0")).click();
	        String actualTitle = driver.getTitle();
	        assertTrue(actualTitle.contains("East Meadow, NY"));
	        System.out.println("This is Test 1 Method");*/
	    	
	    	driver.findElement(By.xpath("//a[@target='_self']")).click();
	    	driver.findElement(By.id("shopindex-make")).click();
	    	driver.findElement(By.className("ng-pristine ng-valid ng-not-empty ng-touched")).click();
	    	driver.findElement(By.xpath("//option[@Label='Kia']")).click();
	    	driver.findElement(By.className("ng-pristine ng-valid ng-not-empty ng-touched")).click();
	    	driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("76002");
	    	driver.findElement(By.id("search-widget-submit")).click();
	    	System.out.println("This is Test 1 Method");
	    }
	    
	    @AfterClass
	    
	    public void EndingClass() {
	    	System.out.println("THis is the After Class method");
	    }
	    
	    @AfterMethod
	    public void tearDown() {
	        driver.quit();     
	    	System.out.println("THis is the After method");
	    }

	}


