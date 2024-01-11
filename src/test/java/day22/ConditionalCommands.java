package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed
		Boolean statusLogo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Display status of logo: " + statusLogo);
		
		//isEnabled
		Boolean statusSeach = driver.findElement(By.id("small-searchterms")).isEnabled();
		System.out.println("Search box enabled or disabled status: " + statusSeach);
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
