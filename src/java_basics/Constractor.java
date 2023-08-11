package java_basics;

public class Constractor {
	
	
	public Constractor() {
		
		System.out.println("Hello from constructor");
	}
	
     public Constractor(String s) {
		
		System.out.println(s);
	}

	public static void main(String[] msd) {
		
		Constractor cd = new Constractor();
		
		Constractor cd2 = new Constractor("string parameter");
		

	}

}
