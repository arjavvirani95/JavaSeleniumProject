package day23;

import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
	 
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit command
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
					
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	
		driver.quit();
	}

}
