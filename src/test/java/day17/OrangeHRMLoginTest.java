package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Test case
--------
1) Launch browser
2) open url
	https://opensource-demo.orangehrmlive.com/
3) Provide username  - Admin
4) Provide password  - admin123
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : OrangeHRM
7) close browser*/

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(3000);
		String dashboardTitle =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String expectedTitle = "Dashboard";
		if(expectedTitle.equals(dashboardTitle)) {
			System.out.println("i am on dashboard page");
		}else {
			System.out.println("test failed");
		}
		
		/*
		String title = driver.getTitle();
		System.out.println(title);
		
		String expectedTitle = "OrangeHRM";
		if(expectedTitle.equals(title)) {
			System.out.println("i am on dashboard page");
		}else {
			System.out.println("test failed");
		}*/
		
		driver.quit();
		
	}

}