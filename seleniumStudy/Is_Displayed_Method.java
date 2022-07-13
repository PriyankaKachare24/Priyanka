package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Displayed_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        
       WebElement hidebutton =driver.findElement(By.id("hide-textbox"));
       
      WebElement showbutton =driver.findElement(By.id("show-textbox"));
      
      WebElement textbox=driver.findElement(By.id("displayed-text"));
      
      hidebutton.click();
     boolean result = textbox.isDisplayed();
     
     if(result==true) 
     {
    	 System.out.println("textbox is displayed");
     }
     else
     {
    	 System.out.println("textbox is not displayed");
     }
     boolean result1 = textbox.isDisplayed();
	if(result1==true) 
     {
    	 System.out.println(" thank u textbox is displayed");
     }
     else
     {
    	 System.out.println("please click on show button");
     }

	}

}
