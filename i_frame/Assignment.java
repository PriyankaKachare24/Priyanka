package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.tagName("input")).sendKeys("Text Case");
		Thread.sleep(1000);
		
		//Switch to Frame1 to innerFrame
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
			 
		//Switch frame2 to main page
		Thread.sleep(500);
		driver.switchTo().defaultContent();
				
		//Switch main page to frame2
		driver.switchTo().frame("frame2");
		WebElement text = driver.findElement(By.id("animals"));
		Select m1=new Select(text);
		Thread.sleep(500);
		m1.selectByIndex(3);
				
		//Switch to main page
		driver.switchTo().defaultContent();   
		String n=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(n);
				
		
	}

	}


