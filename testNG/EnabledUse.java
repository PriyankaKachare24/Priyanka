package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
  @Test
  public void x() 
  {
	  Reporter.log("x is running",true);
  }
  @Test
  public void y() 
  {
	  Reporter.log("y is running",true);
  }
  @Test(enabled=false)
  public void z() 
  {
	  Reporter.log("z is running",true);
  }
}
