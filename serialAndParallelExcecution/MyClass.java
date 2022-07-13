package serialAndParallelExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void myMethod() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

 WebDriver driver= new ChromeDriver();
 driver.get("https://kite.zerodha.com/");
 Reporter.log("MyMethod is running",true);
 Thread.sleep(1000);
  }

}
