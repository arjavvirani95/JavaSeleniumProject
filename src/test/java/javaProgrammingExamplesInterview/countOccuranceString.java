package javaProgrammingExamplesInterview;

public class countOccuranceString {

	public static void main(String[] args) {
		
		
		int count = countStringOccurances("arjav",'a');
	}

	private static int countStringOccurances(String name, char fchar) {
		int k = 0;
		for(int i=0; i<name.length(); i++) {
			
			if(name.charAt(i) == fchar) {
				k++;
			}
			
		}
		System.out.println("character 'a' occure this "+k+" times");
		return 0;
	}

}
