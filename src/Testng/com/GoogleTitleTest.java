package Testng.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver" , "/Users/Amir/Downloads/chromedriver");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,	 TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
//validation: we are testing but if we dont validate there is no point to test, validation it the most important part
// in testing 		
		Assert.assertEquals(title, "Google","title is not matched");
	}
	@Test(priority = 2, groups = "logo")
	public void googleLogoTest() {
		
	boolean b =	driver.findElement(By.xpath("//*[@id=\"hplogo\"] ")).isDisplayed();
	
// Validation with Boolean: it will be True or False	
	
	Assert.assertTrue(b);
	Assert.assertEquals(b, true);
		
	}
	@Test(priority = 3, groups = "Linked Test")
	public void mailLinkTest() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
		
//Validation:		
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}

	
	
		@AfterMethod
		public void tearDown() {
			//driver.manage().deleteAllCookies();
			driver.quit();
		}
	
}
