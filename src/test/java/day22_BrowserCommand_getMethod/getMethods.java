package day22_BrowserCommand_getMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*get(url)
getTitle()
getCurrentUrl()
getPageSource()
getWindowHandle()
getwindowHandles()*/

public class getMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("title of the web page: " + driver.getTitle());
		
		System.out.println("Get the current URL of the open web page: " + driver.getCurrentUrl());
		
		//System.out.println("page source-----------------");
		//System.out.println(driver.getPageSource());
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String>  windowList = driver.getWindowHandles();
		for(String windID : windowList) {
			System.out.println(windID);
		}
		
		
	}
}
