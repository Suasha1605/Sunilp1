package java_basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {


		
		String s[]= {"Selenium", "Java","Rest API"};
		
		for (String k:s) {
			
			System.out.println(k);
		}
		
		   List<String> a= Arrays.asList(s);
		   System.out.println(a);
		   Collections.sort(a);
		   System.out.println(a);

	}

}
