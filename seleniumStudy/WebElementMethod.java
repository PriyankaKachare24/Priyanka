package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");
        
       // 1. Sendkeys():  This method is use to enter value in the input/text field
             driver.findElement(By.xpath("//div[@class='v5yQqb']")).sendKeys("mobile");//enter text in google search bar mobile
             Thread.sleep(1000);
             
      //2. Clear():This method is use to clear value in the text field.
     
       driver.findElement(By.xpath("//div[@class='v5yQqb']")).clear();//clear text in google search bar 
       //3. Click(): Click method is use to click on buttons, links also use to select radio buttons & checkboxes.
         
	}
	

}
