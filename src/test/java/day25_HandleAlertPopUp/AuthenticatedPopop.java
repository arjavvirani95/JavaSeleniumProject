package day25_HandleAlertPopUp;

import org.openqa.selenium.By; 
import org.openqa.selenium.chrome.ChromeDriver; 

public class AuthenticatedPopop {

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver=new ChromeDriver();
		 
		//http://the-internet.herokuapp.com/basic_auth
		//http://admin:admin@the-internet.herokuapp.com/basic_auth 

		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();

		if(text.contains("Congratulations"))
		{
			System.out.println("successful login");
		}
		else
		{
			System.out.println("login failed");
		}
		
		Thread.sleep(2000);
		driver.quit();
	}

}
