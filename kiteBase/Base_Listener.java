package kiteBase;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import kiteUtility.UtilityProp;

public class Base_Listener 
{
	protected static WebDriver driver;
public void openBrowser() throws IOException 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	driver = new ChromeDriver(opt);//locally assign
	driver.get(UtilityProp.readDataFromPropertyFile("URL"));
}
public static void captureScreenshot(WebDriver driver,String TCID) throws IOException 
{
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File ("C:\\Selenium\\ScreenShot\\MyScreenshot"+TCID+".png");
	FileHandler.copy(source, dest);
}
}
