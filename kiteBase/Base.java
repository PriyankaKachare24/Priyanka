package kiteBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base {
	 protected   WebDriver driver;
	public void openBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	//opt.addArguments("disable notification");
    driver = new ChromeDriver(opt);//locally assign
	driver.get("https://kite.zerodha.com/");
	Reporter.log("launching browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
}
