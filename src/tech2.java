
public class tech2 {

	public static void main(String[] args) {

      int a[]= {1, 2, 5, 10, 20, 50, 100,200, 500,2000};
      
      long sum=1000000000;
      
      long temp = 0;
      for (int i=a.length-1; i>=0; i--)
    	  
      {
    	  
    	  if(sum>=a[i]&& sum>0) {
    		  
    		 temp = temp +sum/a[i]; 
    		  
    		 
    		  
    		  sum =sum%a[i];
    		  
    	  }  
    	
    	  
      }
    	  
    	  System.out.println(temp);

		

}

}
