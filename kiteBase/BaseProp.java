package kiteBase;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import kiteUtility.UtilityProp;



public class BaseProp
{
	  protected static WebDriver driver;
	public void openBrowser() throws InterruptedException, IOException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityProp.readDataFromPropertyFile("URL"));
//        Reporter.log("Launching Browser",true);
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      
	}

}
