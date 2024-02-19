package day35_Annotations_DependencyMethods_Assert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {

	@Test(priority = 1)
	void test_hardassertions()
	{

		System.out.println("testing Hard assertion...."); 

		Assert.assertEquals(1, 1);  // if it will fail then below statement will not be executed..

		System.out.println("hard assertion completed.....");
		Assert.assertEquals(1, 1);
	}

	@Test(priority = 2)
	void test_softassertions()
	{
		System.out.println("testing Soft assertion...."); 

		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 1); 

		System.out.println("soft assertion completed.....");
		sa.assertEquals(1, 1);

		sa.assertAll(); // mandatory

	}

}


