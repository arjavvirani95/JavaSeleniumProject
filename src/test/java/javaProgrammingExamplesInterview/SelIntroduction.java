package javaProgrammingExamplesInterview;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {

		//Invoking browser
		//Chrome - ChromeDriver ->Methods
		//Firefox - FirefoxDriver ->Methods
		
		//System.setProperty("webdriver.chrome.dirver", "D:\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		String title = driver.getTitle();
		System.out.println(title); 
		
		String currURL = driver.getCurrentUrl();
		System.out.println(currURL); 
		
		driver.close();
		driver.quit();
		
	}

}
