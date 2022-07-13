package crossBrowserTestng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CT {
	@Parameters("browserName")
	  @Test
	  public void CTTest(String name) throws InterruptedException 
	  {
			WebDriver driver=null;//declare globally
			if(name.equals("firefox"))
			{
			   System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		       driver = new FirefoxDriver();
			}
			else if(name.equals("chrome"))
			{
			   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			   driver = new ChromeDriver();
			}
			 driver.get("https://paytm.com/");
			 
			 Thread.sleep(2000);
			 driver.close();
}
}