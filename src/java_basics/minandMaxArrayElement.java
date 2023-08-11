package java_basics;

public class minandMaxArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { -10, 12, 2, 9, 4, 5, 3, 6, 7, 7, 8, 10, };

//		int max = a[0];
//		for (int i = 0; i < a.length; i++) {
//
//			if (a[i] > max) {
//
//				max = a[i];
//
//			}
//
//		}
		
		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {

				min = a[i];

			}

		}

		System.out.println(min);

	}

}
