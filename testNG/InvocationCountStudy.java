package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy {
  @Test(invocationCount=4)
  public void d() 
  {
	  Reporter.log("d method is running",true);
  }
  @AfterMethod
  public void afterMethod()
  {
	  Reporter.log("after method is running",true);
  }
}
