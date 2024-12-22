package Testng.com;

import org.testng.annotations.Test;

public class invocationCountTest {
	
	//invocationCount -- it like a loop @Test(invocationCount = 10) it will be execute 10 times
	
	@Test(invocationCount = 10)
	public void sum1() {
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("sum is===" + c);
	}
	
	
	
	
	
	

}
