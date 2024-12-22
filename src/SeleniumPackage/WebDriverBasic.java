package SeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Amir/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		
		driver.get("http://www.google.com");
		
		boolean logo = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
