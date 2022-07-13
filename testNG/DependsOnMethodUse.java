package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodUse {
	
	@Test
	  public void d() 
	  {
		  Reporter.log("d method is running",true);
	  }
	  @Test
	  public void z() 
	  {
		  Reporter.log("z method is running",true);
	  }
	  @Test(dependsOnMethods = {"z","d"})
	  public void a()
	  { 
	  
		  Reporter.log("p method is running",true);
	  }
}
