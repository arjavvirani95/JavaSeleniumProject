package day34_IntroTestNG_Annotation;

import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 

public class SecondTest {
	ChromeDriver driver;
	
	//@BeforeClass
	@Test(priority=1)
	void openApp()
	{  
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	//@AfterClass
	@Test(priority=3)
	void closeApp()
	{
		driver.quit();
	}
	
	
}
