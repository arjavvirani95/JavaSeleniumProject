package day35_Annotations_DependencyMethods_Assert;

import org.testng.annotations.*;

public class AllAnnotations {

	@BeforeSuite
	void bs()
	{
		System.out.println("This is before SUITE.....");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is after SUITE.....");
	}
	
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is before TEST method.....");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is after TEST method.....");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("This is before CLASS method.....");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is after CLASS method.....");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is before METHOD.....");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is after METHOD.....");
	}
	
	@Test(priority=1)
	void tm1()
	{
		System.out.println("This is Test Method1...");
	}
	
	@Test(priority=2)
	void tm2()
	{
		System.out.println("This is Test Method2...");
	}
	
}
