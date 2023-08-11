package java_basics;

public class OverRiding extends Overloading {
	
public void test() {
		
		System.out.println("USA is overridden");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverRiding r= new OverRiding();
		r.test();
		r.test(10, "metjsb");
		r.test("Testing",30);

	}

}
