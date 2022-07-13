package KitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserID {
	
	WebDriver driver;//globally declared
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	Sheet mySheet;
	
	@BeforeClass
	public void launchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("disable notification");
	    driver = new ChromeDriver();//locally assign
	    driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Laucing Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		File myFile = new File("C:\\Selenium\\Book1.xlsx");
	    mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
    }
	
	@BeforeMethod
	public void loginToKiteApp()
	{
		String UN = mySheet.getRow(1).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(1).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(1).getCell(2).getStringCellValue();
		
		login.sendUserName(UN);
		Reporter.log("sending username",true);
		login.sendPassword(PIN);
		Reporter.log("sending password",true);
		login.clickOnLoginButton();
		Reporter.log("clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(PIN);
		Reporter.log("sending pin",true);
		pin.clickOnContinueButton();
		Reporter.log("clicking on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

  @Test
  public void ValidateUserID() 
  {
	  String expectedUID = mySheet.getRow(1).getCell(0).getStringCellValue(); 
	  String actualUID = home.getActualUserID();
	  Assert.assertEquals(actualUID, expectedUID,"actual and expected userID are not matching then TC is failed"); 
	  Reporter.log("actual and expected userID are matching then TC is pass",true);
  }
  @AfterMethod
  public void logOutFromKiteApp() throws InterruptedException 
  {
	  home.clickOnLogOut();
	  Reporter.log("logging out",true);
  }
  
  @AfterClass
  public void closeBrowser() throws InterruptedException 
  {
	  Thread.sleep(2000);
	  Reporter.log("closing browser",true);
	  driver.close();
  }
}
