package java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int s[]= {4,5,5,5,4,6,6,4,9};// Print the unique number and its count
		
	      ArrayList<Integer> a = new ArrayList<Integer>();
	      
	      for(int i=0; i<s.length; i++) {
	    	  int k=0;
	    	  if(!a.contains(s[i])) {
	    		  
	    		  a.add(s[i]);
	    		  k++;
	    		  for(int j=i+1; j<s.length; j++) {
	    			  
	    			if(s[i]==s[j]) 
	    				k++;
	    		  }
	    		  
	    		  System.out.println(s[i]+": " +k);
	    	  }
	    	  
	      }
	}

}
