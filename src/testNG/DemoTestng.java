package testNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class DemoTestng {
	
	@BeforeSuite
	void beforeSuite() {
   
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	void beforeTest() {
   
		System.out.println("Before Test");
	}
    
	@BeforeMethod
	void beforeMethod() {
   
		System.out.println("Before Method");
	}
    
	@Test (priority=1, groups= {"Sanity","Regression"})
	void test1() {
		System.out.println("Test1");
	}
	
	@Test (priority=2, groups= {"Sanity"})
	void test2() {
		System.out.println("Test2");
	}

	@Test (priority=3, groups= {"Sanity"})
	void test3() {
		System.out.println("Test3");
	}
	
	@Test (priority=4, groups= {"Regression"})
	void test4() {
		System.out.println("Test4");
	}
	
	@Test (priority=5, groups= {"Regression"}, invocationCount=5)
	void test5() {
		System.out.println("Test5");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("After Method");
	}

}
