package day35_Annotations_DependencyMethods_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	void test()
	{
		//int x=10;
		//int y=15;

		/*if(x==y) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}*/

		//Assert.assertEquals(x,y);

		//Assert.assertTrue(true);  //pass
		//Assert.assertTrue(false);  //pass

		/*int a=20;
		int b=15;
		Assert.assertEquals(a, b, "We are expecting both the a and b value shoud be the same");
		Assert.assertEquals(a>b,true,"a is not greater than b");  //false
		*/

		/*String s1="abc";
		String s2="abc1";
		Assert.assertEquals(s1,s2,"string are not equal"); // pass
		Assert.assertNotEquals(s1, s2);  // fail
		*/
		
		if(false) {
			Assert.assertTrue(true);
		} else {
			//Assert.assertTrue(false);
			Assert.fail();

		}
	}
}
