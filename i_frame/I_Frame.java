package i_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class I_Frame {

	
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
				
				Thread.sleep(1000);
			
				driver.switchTo().frame("iframeResult");
				WebElement test=driver.findElement(By.xpath("//button[@type='button']"));
				test.click();
				driver.switchTo().parentFrame();
				
				driver.findElement(By.xpath("//a[@title='Change Theme'][1]")).click();
				
				
			}


	}


