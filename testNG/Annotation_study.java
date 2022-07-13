package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_study {
  @Test
  public void validateUserName() 
  {
	  Reporter.log("UserName Validated",true);
  }
  @Test
  public void validateDashboard() 
  {
	  Reporter.log("Dashboard Validated",true);
  }
  @BeforeMethod
  public void loginToKiteApp() 
  {
	  Reporter.log("login Sucess",true);
  }
  @AfterMethod
  public void logOutFromKiteApp() 
  {
	  Reporter.log("logged out",true);
  }
  @BeforeClass
  public void launchBrowser() 
  {
	  Reporter.log("launching browser",true);
  }
  @AfterClass
  public void closeBrowser() 
  {
	  Reporter.log("closing browser",true);
  }
 }
