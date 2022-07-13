package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumCode {


	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.vctcpune.com");
		//driver.findElement(By.xpath("//a[text()='Courses']")).click();
		//driver.findElement(By.xpath("//input[@value='option2']")).click();
		//driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
		driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
	}
	
	
	
}

