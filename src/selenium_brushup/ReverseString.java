package selenium_brushup;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString db = new ReverseString();

		String reverse = db.stringReverseMethod("Welcome to Selenium java");

		System.out.println(reverse);
		StringBuffer reverse2 = db.stringBufferReverseMethod("Rest Assured");

		System.out.println(reverse2);

	}

	public String stringReverseMethod(String s) {

		String original = s;
		String rev = "";

		for (int i = 0; i < original.length(); i++) {

			rev = rev + original.charAt(original.length() - i - 1);

		}
		return rev;

	}

	public StringBuffer stringBufferReverseMethod(String s) {

		StringBuffer sbf = new StringBuffer(s);

		StringBuffer rev = sbf.reverse();

		return rev;

	}

}
