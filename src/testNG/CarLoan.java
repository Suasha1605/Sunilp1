package testNG;

import org.testng.annotations.Test;

public class CarLoan {
	
	
	
	
	@Test(timeOut=1000)
	public void carTest1() throws InterruptedException {
		Thread.sleep(2000);
		
		System.out.println("Car Loan");
	}
	
	
	@Test(enabled=true )
	public void JCBTest2() {
		
		
		System.out.println("JCB Loan");
	}
	
	@Test(groups= {"Smoke"},dependsOnMethods="carTest1")
	public void homeTest3() {
		
		
		System.out.println("Home Loan");
	}

}
