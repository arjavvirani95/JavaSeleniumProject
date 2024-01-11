package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		//isSelected
		WebElement maleRadio = driver.findElement(By.id("gender-male"));
		WebElement femaleRadio = driver.findElement(By.id("gender-female"));
		System.out.println("Before Selection of Male ----------"); 
		System.out.println("status of male radio button: " + maleRadio.isSelected());
		System.out.println("status of female radio button: " + femaleRadio.isSelected());
		
		//Selecting male radio
		System.out.println("After Selection of Male -----------");
		maleRadio.click(); 
		System.out.println("status of male radio button: " + maleRadio.isSelected());
		System.out.println("status of female radio button: " + femaleRadio.isSelected());
		
		//Selecting female radio
		System.out.println("After Selection of Female -----------");
		femaleRadio.click();
		System.out.println("status of male radio button: " + maleRadio.isSelected());
		System.out.println("status of female radio button: " + femaleRadio.isSelected());
		
		Thread.sleep(3000);
		driver.quit();
	}
}
