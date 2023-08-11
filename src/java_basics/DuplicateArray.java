package java_basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 2, 3, 4, 5, 3, 6, 7, 7, 8,9, };

		ArrayList<Integer> s = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (!s.contains(a[i])) {
				s.add(a[i]);
			}
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {

						System.out.println(a[i]);
					}

				}
			
		}
		
		
		
//		 Hashset method approch
		
		System.out.println("###########################");
		
		int b[] = { 1, 2, 2, 3, 4, 5, 3, 6, 7, 7, 8,9, };
		
		HashSet<Integer> hs= new HashSet<Integer>();
		
		
		for(int no:b) {
			
			if(hs.add(no)==false) {
				
				System.out.println(no);
				
			}
		}

	}

}
