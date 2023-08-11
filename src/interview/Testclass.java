package interview;

import java.util.ArrayList;

public class Testclass {
	

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 7, 3, 4, 2 };

		ArrayList<Integer> s = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;

			if (!s.contains(a[i])) {

				s.add(a[i]);
				k++;

				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						k++;

					}

				}
				System.out.println(a[i] + ":" + k);

			}
		}

	}

}
