package java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistCompare {

	public static void main(String[] args) {
		
		String s1[]= {"A","B","C","D","F"};
		String s2[]= {"A","C","B","D","E"};
		String s3[]= {"D","B","C","A","F","G"};
		
//		Comparing 2 lists:
		
		ArrayList<String> l1= new  ArrayList<String>(Arrays.asList(s1));
		ArrayList<String> l2= new  ArrayList<String>(Arrays.asList(s2));
		ArrayList<String> l3= new  ArrayList<String>(Arrays.asList(s3));
		
	    Collections.sort(l1);
	    Collections.sort(l2);
	    Collections.sort(l3);
	    
	    System.out.println(l1);
	    System.out.println(l2);
	    System.out.println(l3);
	    
	    
	    System.out.println(l1.equals(l2));
	    System.out.println(l3.equals(l2));
	    
	    
//	     How to find out missing element 
	    
//	    l1.removeAll(l2);
//	    System.out.println(l1);
//	    l2.removeAll(l1);
//	    
//	    System.out.println(l2);
	    
	    l1.retainAll(l3);
	    
	    System.out.println(l1);
	    
	    
	    
	    

	}

}