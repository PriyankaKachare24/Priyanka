package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.findElement(By.xpath("//input[@type='text']")).click();
		//driver.findElement(By.xpath("//input[@type='text']")).click();
		//driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).click();
		
		
	//3.Contains(1.by text method)
		
		//driver.findElement(By.xpath("//h2[text()='Facebook helps.']")).click();//to reduce value
		
		//3.Contains(1.by Attribute method)
		
		//driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[contains@title,sea]")).click();//to reduce value
		
	//4.x-path by index
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//input[@type='radio'][3]")).click();
		
	//absolute and relative x-path
	}

}
