package Testng.com;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	//we can use @Test(invocationTimeOut = 2000)	
	@Test(invocationTimeOut = 2000)
	public void infiniteLoop() {
		
		int i = 1;
		while(i == 1) {
			System.out.println(i);
		}
	}
	//Output: it will print infinite 1, if you want to beake; you have to do manually
	
	
//Exception handling:
	@Test(invocationTimeOut = 2000, expectedExceptions = NumberFormatException.class)
	public void timeOutInLoop() {
		int i = 1;
		while(i == 1) {
			System.out.println(i);
	}
		
	}
	
	
	// this test will fail because of expected Exeption, how can we avoid
	// we can add @Test(expectedExeptions = NumberFormatException.class) --> basically we are saying TestNG to skip when you see this exception
	
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";  
		Integer.parseInt(x);  //why fail: we cant part A to number, thats why it fails
	}
	
	
	
	
	
	
	
	
	
}
