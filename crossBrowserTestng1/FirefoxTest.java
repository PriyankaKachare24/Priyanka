package crossBrowserTestng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void ff() throws InterruptedException 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.guru99.com/");
		Thread.sleep(1000);  
	  
}
}