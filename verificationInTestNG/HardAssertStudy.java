package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssertStudy {
  @Test
  public void myMethod() 
  {
	  String a="PRIYA";
	  String b="PRIYA";
	  
	 Assert.assertEquals(a,b,"value is not equal TC is failed");
	 Reporter.log("value is equal TC is passed",true);
	 
	 Assert.assertNull(b,"value is not null");
	 Reporter.log("value is null TC is passed",true);
  }
}
