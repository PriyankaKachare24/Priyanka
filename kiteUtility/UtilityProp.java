package kiteUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityProp {
	public static String readDataFromPropertyFile(String key) throws IOException 
	{
	Properties prop=new Properties();//create object of propertyClass
	FileInputStream myfile=new FileInputStream("C:\\Users\\gauri\\eclipse-workspace\\seleniumStudy\\Priya_property.properties");
	prop.load(myfile);
	String value=prop.getProperty(key);
	return value;
	}
	public static void captureScreenshot(WebDriver driver,String TCID) throws IOException 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Selenium\\ScreenShot\\MyScreenshot"+TCID+".png");
		FileHandler.copy(source, dest);
    }

	
		
	}
	
	
	

