package Testng.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasics {
	//all tage @ has to follow method
	
	//Pre-condition section  annotations ---- starting with @before	
	//Test case section  starting @test   --> this is where we do testing
	//Post condtions section ---- starting with @After	
	
	
	
	
	/*
	 * 
	 */
	
	

	@BeforeSuite
	public void setUp() {
		System.out.println("@BeforeSuite -- setup system property for chrome");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest -- lunch the browser");
		
	}
	@BeforeClass
	public void login() {
		System.out.println("@BeforeClass -- login app");
	}

	/*This is how test sequence of execution will work
	 * it will create 3 pairs since we have 3 @Test
	 * 
	 * @beforeMethod
	 * @test 1
	 * @afterMethod
	 * 
	 * @beforeMethod
	 * @test 2
	 * @afterMethod
	 * 
	 * @beforeMethod
	 * @test 3
	 * @afterMethod
	 */
	
	
	
	
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("@BeforeMethod -- enter URL");
	}
	
	@Test(priority = 1)
	public void googleTitleTest() {
		System.out.println("@Test1 --  test Title ");
		
	}
	@Test(priority = 2)
	public void searchTest() {
		System.out.println("@Test 2 -- search test");
	}
	
	@Test(priority = 3)
	public void googleLogoTest() {
		System.out.println("@Test3 -- google logo test");
	}

	@AfterMethod()
	public void logOut() {
		System.out.println("@AfterMethod -- log out from app");
	}
	
	
	
	
	
	
	
	
	
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("@AfterTest -- deleteAll Cookies");
		
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass -- Close Browser");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite -- generate test report");
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
}
