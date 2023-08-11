package java_basics;

public class Child extends Parent{
	
	
	String name = "Mumbai";
	
	public Child() {
		super();
//		System.out.println("Child class constructor");
	}
	
	
	public void childMethod() {
		super.parentMethod();
		System.out.println(super.name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Child cd = new Child();
		
		System.out.println(cd.name);
		cd.childMethod();
		

	}

}
