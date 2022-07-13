package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Enabled_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.discoveryplus.in/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//h6[text()='Sign In'][2]")).click();
        Thread.sleep(7000);
         WebElement mobileNo=driver.findElement(By.id("mobileNumber"));
         
         WebElement getOTPButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
         boolean result=getOTPButton.isEnabled();
         if(result=true) 
         {
        	 System.out.println("OTP button is enabled");
         }
         else 
         {
        	 System.out.println("OTP button is disabled");
         }
          mobileNo.sendKeys("7559167621");
          boolean result1=getOTPButton.isEnabled();
          if(result1=true) 
          {
         	 System.out.println("OTP button is enabled");
          }
          else 
          {
         	 System.out.println("Please enter mob no");
          }
	}

}
