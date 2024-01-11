package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("nopCommerce")).click();
		
		Thread.sleep(2000);
		//driver.close(); //if we open new window through first one it will close focused window means first window.
		driver.quit(); //close all the windows which was open by webdriver instance
	}

}
