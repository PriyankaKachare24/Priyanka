package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse
{
	@Test(timeOut=2000)
	  public void h() throws InterruptedException 
	  {
		 Thread.sleep(1000);
		  Reporter.log("h method is running",true);
	  }
	  @Test
	  public void m() 
	  {
		  Reporter.log("m method is running",true);
	  }
	  @Test
	  public void p() 
	  {
		  Reporter.log("p method is running",true);
	  }
}
