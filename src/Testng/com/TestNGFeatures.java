package Testng.com;

import org.testng.annotations.Test;  

public class TestNGFeatures {
	
	//Let's say test case are dependant to 
//each other: eg. Login test needs to be done before other test. and 
//one day your log in is not working, since login is not working there is no reason to excute other test 
//since log in is not working we can't go inside application, no point to waste time		
// we have @Test(dependsOnMethods = "methods name which depends on this test to execute") if that fails than no point to execute this method
//if main test fail, all dependent test will be ignored or skipped	
	
	
	@Test									//if this test fails
	public void loginTest() {
		System.out.println("log in test");
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "loginTest")	// this test will be ignored
	public void homePageTest() {
		System.out.println("homePageTest");
	}
	
	@Test(dependsOnMethods = "loginTest")  // this test will be ignored
	public void searchPage() {
		System.out.println("searchPage");  
	}
	@Test(dependsOnMethods = "loginTest")  // this test will be ignored
	public void registration() {
		System.out.println("registration");
	}
	
	
	
	
	

}
