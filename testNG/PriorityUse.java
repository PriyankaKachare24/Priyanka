package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse
{
  @Test(priority=1)
  public void h() 
  {
	  Reporter.log("h method is running",true);
  }
  @Test(priority=-1)
  public void m() 
  {
	  Reporter.log("m method is running",true);
  }
  @Test(priority=3)
  public void p() 
  {
	  Reporter.log("p method is running",true);
  }
}
