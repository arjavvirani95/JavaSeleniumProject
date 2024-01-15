package day36_DataProviders_Grouping;

import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test; 

public class DataProviderDemo {
	ChromeDriver driver;

	@BeforeClass
	void setup()
	{ 
		driver=new ChromeDriver();
	}

	@Test(dataProvider="dp")
	void testLogin(String email, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();

		String exp_title = "nopCommerce demo store";
		String act_title = driver.getTitle();

		Assert.assertEquals(exp_title, act_title);
	}

	@DataProvider(name="dp")
	String [][] loginData()
	{
		String data[][]= {  
				{ "abc@gmail.com", "test123" }, 
				{ "pavanol@gmail.com", "test@123" },
				{ "pavanoltraining@gmail.com", "test3" },
				{ "pavanoltraining@gmail.com", "test@123" },
				{ "arjav.virani95@yopmail.com", "Urt#4567" } 
		};

		return data;
	}

	@AfterClass
	void tearDown()
	{
		driver.close();
	}



}
