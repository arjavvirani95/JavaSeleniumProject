package day26_HandleFrameWindows;

import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class HandleInnerFramesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver(); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
		
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");
		
		//inner frame
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div.AB7Lab")).click(); // select first radio button in frame
		
		driver.switchTo().defaultContent();
		
		
		//frame2
		WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("22222");
		
		driver.switchTo().defaultContent();
		
		//frame 4
		WebElement frm4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("44444");
		
		driver.switchTo().defaultContent();
		
		
		//frame 5
		WebElement frm5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frm5);
		
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("555555");
		WebElement linkVar =  driver.findElement(By.cssSelector("a[href='https://a9t9.com']"));
		System.out.println(linkVar);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
