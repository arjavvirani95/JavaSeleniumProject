package day35_Annotations_DependencyMethods_Assert.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	void abc()
	{
		System.out.println("this is abc from Class 1");
	}
	
	@BeforeTest
	void m()
	{
		System.out.println("this is before TEST method...");
	}
	
	@AfterTest
	void n()
	{
		System.out.println("this is after TEST method..");
	}
	
	@BeforeSuite
	void bs()
	{
	 System.out.println("this is Before SUITE method...");	
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("this is After SUITE method");
	}
}
