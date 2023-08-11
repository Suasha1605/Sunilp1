package interview;

import java.util.ArrayList;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "sunil has earned 898 points";
// first Approach
 
		char[] c = s.toCharArray();

		ArrayList<Character> a = new ArrayList<Character>();
		
		int sum=0;
		for (int i = 0; i < c.length; i++) {
			
			if(Character.isLetter(c[i])) {
			int k = 0;
			if (!a.contains(c[i])) {
				a.add(c[i]);
				
				k++;
			
				for (int j = i + 1; j < c.length; j++) {

					if (c[i] == c[j]) {
						k++;
					}
				}
				System.out.println(c[i] + " : " + k);
			}
			
			}
			
			else{
				if(Character.isDigit(c[i])) {
				sum= sum+Character.getNumericValue(c[i]);
				
				
				}
				
			}
			
		}
		
        System.out.println(sum);


	}



}
