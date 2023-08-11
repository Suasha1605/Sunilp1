package java_basics;

public class Overloading {

	public void test() {
		
		System.out.println("USA");
	}
	
	public void test(int a , String d) {
		
		System.out.println("UK");
	}
	public void test(String d,int a ) {
		
		System.out.println("INDIA");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overloading vr = new Overloading();
		vr.test();
		vr.test(5, "demo");
		vr.test("Pune",5);
		
		

	}

}
