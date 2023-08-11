package java_basics;

import java.util.ArrayList;

public class AscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 12, 2, 9, 4, 5, 3, 6, 7, 7, 8,10, };

	
		for (int i = 0; i < a.length; i++) {
			
				for (int j = i + 1; j < a.length; j++) {

					if (a[i]>a[j]) {
						
						int temp= a[j];
						a[j]=a[i];
						a[i]=temp;

						
					}

				}
			
		}
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
		}
	}

}
