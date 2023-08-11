package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {
	
	
	
	@Test (groups= {"Smoke"})
	public void testloan1() {
		
		
		System.out.println("Personal Loan");
	}
	
	 @Parameters({"URL"})
	@Test
	public void testloan2(String url) {
	
		
		System.out.println("Bussiness Loan");
		System.out.println(url);
	}
	 
	 
	 
	 @Parameters({"browser"})
	@Test
	public void browserLaunch(String brname) {
	
		
		System.out.println("Bussiness Loan");
		
		if(brname.contentEquals("CHROME")){
			
		System.out.println(brname);
	 }
		
		else if(brname.contentEquals("IX")) {
			
			System.out.println(brname);
		 }
        else if(brname.contentEquals("Firefox")) {
			
			System.out.println(brname);
		 }
	}
	 
	 
		
		private void elseIf(boolean contentEquals) {
		// TODO Auto-generated method stub
		
	}

		@Test (dataProvider= "getData")
		public void testloan3(String ur, String pass) {
			
			
			System.out.println(ur+": "+pass);
		}
		
		@DataProvider
		public Object[][] getData() {
			
			Object [][] data= new Object[2][2];
			
			data[0][0]="user1";
			data[0][1]="pass1";
			data[1][0]="user2";
			data[1][1]="pass2";
			
			return data;
			
		}

}
