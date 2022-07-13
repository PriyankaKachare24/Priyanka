package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testClass1 {
	@Test
	  public void m() 
	  {
		  Reporter.log("m method is running",true);
	  }
	  @Test
	  public void n() 
	  {
		  Reporter.log("n method is running",true);
	  }
	  @Test
	  public void o() 
	  {
		  Reporter.log("o method is running",true);
	  }
}
