package kiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KitePOMUsingTestNG.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;
import kiteBase.Base;
import kiteBase.BaseProp;
import kiteUtility.Utility;
import kiteUtility.UtilityProp;

@Listeners(kiteTest.Listner.class)
public class ValidateKiteUserIDUsing_Prop extends BaseProp
{
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
   // String TCID="223";
	
	@BeforeClass
	
    public void launchBrowser() throws InterruptedException, IOException 
     {
	  openBrowser();
	  login=new KiteLoginPage(driver);
	  pin=new KitePinPage(driver);
	  home=new KiteHomePage(driver);
     }
	
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException 
	{
		login.sendUserName(UtilityProp.readDataFromPropertyFile("UN"));
		login.sendPassword(UtilityProp.readDataFromPropertyFile("PWD"));
	    login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		pin.sendPin(UtilityProp.readDataFromPropertyFile("PIN") );
		pin.clickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	public void ValidateUserID() throws EncryptedDocumentException, IOException 
	{
		
		Assert.assertEquals(home.getActualUserID(),UtilityProp.readDataFromPropertyFile("UN"),"Actual And Expected User ID not matching TC FAILED");
		Reporter.log("Actual And Expected User ID matching TC PASSED",true);
	   //UtilityProp.captureScreenshot(driver,TCID);
		//Assert.fail();
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

