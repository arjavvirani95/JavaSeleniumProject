package javaProgrammingExamplesInterview;

public class reverseNumber {

	public static void main(String[] args) {
		//reverse this number 1280521
		
		int a = 1280521;
		 
		int newNumber = 0;
		
		
		for(int i=0; i<7; i++) {
			int lastDigit = a%10; //1
			newNumber = lastDigit + newNumber*10; 
			a = a/10; 
			
			
		}
		System.out.println(newNumber);
	}

}
