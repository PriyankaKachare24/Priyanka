package serialAndParallelExcecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass1 {
  @Test
  public void myMethod1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

 WebDriver driver= new ChromeDriver();
 driver.get("https://www.google.com/");
 Reporter.log("MyMethod is running",true);
 Thread.sleep(1000);
  }

}
