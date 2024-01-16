package javaProgrammingExamplesInterview;

public class testPyramid {

	public static void main(String[] args) {
	
		//   *   
		//  ***  
		// ***** 
		//*******
		//*   
		//**  
		//***
		//****
		System.out.println("This is pyramid from Arjav EST zone");
		for(int i=0; i<5; i++)
		{
			for(int j=5-i; j>1; j--) 
			{
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		

	}

}
