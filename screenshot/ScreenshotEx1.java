package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotEx1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();

driver.get("https://demoqa.com/alerts");

Thread.sleep(1000);

File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

String str=RandomString.make(3); // for multiple screen shot in one folder
File dest = new File ("C:\\Selenium\\ScreenShot\\MyScreenshot"+str+".png");

//FileHandler.copy(source, dest);

FileHandler.copy(source, dest);

driver.manage().window().maximize();

}


}
