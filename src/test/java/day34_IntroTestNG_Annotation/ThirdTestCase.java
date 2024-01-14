package day34_IntroTestNG_Annotation;

import org.testng.annotations.Test;

public class ThirdTestCase 
{
  
	@Test(priority=0)
	void test1()
	{
		System.out.println("testing 1");
	}
	
	@Test(priority=1)
	void test2()
	{
		System.out.println("testing 2");
		
	}
	
	@Test(priority=2)
	void test3()
	{
		System.out.println("testing 3");
	}
	
}
