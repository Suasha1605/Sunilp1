package java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {


		
		int a[]= {1,2,2,3,4,5,3,6,7,4,4,7,8,5,8,8,9,3};
		
		ArrayList<Integer> a1= new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,5,3,6,7,4,4,7,8,5,8,8,9,3));
		
		HashSet<Integer> hs= new HashSet<Integer>(a1);
		
		ArrayList<Integer> a2= new ArrayList<Integer>(hs);
		
		System.out.println(a2);
		
		
		System.out.println("********************");
		
		List<Object> uniqueList = a1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(uniqueList);
		
		System.out.println("********************");
		
		ArrayList<Integer> b= new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++)
		{
			
			int k=0;
			
			if(!b.contains(a[i])) {
				b.add(a[i]);
				k++;
				for(int j=i+1; j<a.length;j++) {
					
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i]+": "+k);
			}
		}

	}

}
