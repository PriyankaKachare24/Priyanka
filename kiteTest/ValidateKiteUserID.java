package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KitePOMUsingTestNG.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;
import kiteBase.Base;
import kiteUtility.Utility;

public class ValidateKiteUserID extends Base 
{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	String TCID="223";
	
	@BeforeClass
    public void launchBrowser() 
     {
	  openBrowser();
	  login=new KiteLoginPage(driver);
	  pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
     }
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException 
	{
		login.sendUserName(Utility.readDataFromexcel(1, 0));
		login.sendPassword(Utility.readDataFromexcel(1, 1));
	    login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(Utility.readDataFromexcel(1, 2) );
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	public void ValidateUserID() throws EncryptedDocumentException, IOException 
	{
		Assert.assertEquals(home.getActualUserID(),Utility.readDataFromexcel(1, 0),"Actual and expected are not matching TC failed");
	}
	@AfterMethod
	public void logOutFromKite() throws InterruptedException 
	{
	home.clickOnLogOut();	
	}
	@AfterClass
	public void closeBrowser() 
	{
	 driver.close();	
	}
	
	
}


