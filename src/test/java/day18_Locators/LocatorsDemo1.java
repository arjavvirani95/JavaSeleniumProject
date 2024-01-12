package day18_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize(); // maximize browser window
		
		//search box
		driver.findElement(By.id("gh-ac")).sendKeys("T-shirts");
		
		//search button
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		
		//link text & partial linktext
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		//driver.findElement(By.partialLinkText("Printed Chiffon")).click();
		
		
		
		
	}

}
