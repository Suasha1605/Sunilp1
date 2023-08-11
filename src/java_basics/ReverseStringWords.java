package java_basics;

public class ReverseStringWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "Welcome to Java";
		System.out.println(s);
		String array[]= s.split(" ");
		
		
		String revString="";
		
		
		for(String word:array) {
			
			String revWord="";
			
			for(int i=word.length()-1; i>=0; i--) {
				
				revWord=revWord+word.charAt(i);
				
			}
			
			revString= revString+revWord+" ";
		}
		
		System.out.println(revString);
		

	}

}
