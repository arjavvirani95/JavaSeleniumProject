package javaProgrammingExamplesInterview;
import java.util.ArrayList;

public class printUniqueNumber {

	public static void main(String[] args) {
		
		
		//Print unique number from list- 4,4,5,6,9,5,6,9,8,7,7
		
		int a[] = {4,4,5,6,9,5,6,9,8,7,7};
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			int k = 0;
			if(!ab.contains(a[i])) {
				
				ab.add(a[i]);
				k++;
				for(int j=i+1; j<a.length; j++) {
					if(a[i] == a[j]) {
						k++;
					}
				}
				System.out.println("this number " +a[i]+ " repeat this many times=" +k);
				if(k == 1) {
					System.out.println("This is unique number " + a[i]);
				}
			}
		}
		System.out.println("this is unique number from list " + ab);
	}
}
