package javaProgrammingExamplesInterview;

public class reverseString {

	public static void main(String[] args) {
		// reverse stirng "arjav"
		String s = "arjav";
		String t = "";
		//System.out.println(s.length());
		
		for(int i = s.length()-1; i>=0; i--) {
			//System.out.println(s.charAt(i));
			t = t + s.charAt(i);
		}
		if(t==s) {
			System.out.println("stirg is palindrome");
		}else {
			System.out.println("string is not palindrome");
		}
		System.out.println(t);

	}

}
