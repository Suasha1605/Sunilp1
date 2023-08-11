package interview;

public class ThisDemo {

	int a = 10;// Global

	public void getData() {

		int a = 30;// local

		System.out.println(a);
		System.out.println(this.a);

		int b = this.a + a;
		System.out.println("SUM= " + b);

	}

	public static void main(String[] args) {

		ThisDemo d = new ThisDemo();
		d.getData();

	}

}
