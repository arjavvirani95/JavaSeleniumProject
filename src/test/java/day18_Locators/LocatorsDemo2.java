package day18_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class LocatorsDemo2 {

	public static void main(String[] args) {
		
		 
		WebDriver driver=new ChromeDriver();
		
		//Open app
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize(); // maximize browser window
		
		/*//Finding number of sliders on home page	
		List<WebElement> sliders=driver.findElements(By.className("carousel__snap-point vl-carousel__item"));
		System.out.println("Number of sliders:"+sliders.size());*/
		
		//Find Total number of images in home page
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		 
		System.out.println("Total number of images:"+images.size());
		
		//Find total number of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		
		
		//driver.quit();
		
		
	}

}
