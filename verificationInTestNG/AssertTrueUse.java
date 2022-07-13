package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void myMethod()
  {
	  boolean a = true;
	  boolean b = false;
// TC should pass if value is true
	  
//      Assert.assertTrue(a, "TC is failed values is FALSE");
//     Reporter.log("TC is passed value is true",true);
     
  // TC should pass if value is false
     
     Assert.assertFalse(b, "TC is failed values is TRUE");
     Reporter.log("TC is passed value is true",true);
  }
}
