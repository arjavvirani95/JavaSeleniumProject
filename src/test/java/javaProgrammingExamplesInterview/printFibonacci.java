package javaProgrammingExamplesInterview;

public class printFibonacci {

	public static void main(String[] args) {
		// Print Fibonacci series i.e 1,2,3,5,8,13,21
		
		int fibbo = 0;
		int a = 0;
		int b = 1;
		int i = 1;
		while(i<8) {
			
			fibbo = a + b;
			System.out.println(fibbo);
			a = b; 
			b = fibbo;
			
			i++;
		}
		
	}

}
