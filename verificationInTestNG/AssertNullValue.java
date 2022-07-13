package verificationInTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullValue {
  @Test
  public void myMethod() 
  {
	 String a = null;
	 String b="abc";
// if text is null then TC is passed
	 
        //Assert.assertNull(a, "TC is failed value is not null");
        //Reporter.log("tc is passed value is null",true);
	 
//	 
	  Assert.assertNotNull(b, "TC is failed value is null");
	  Reporter.log("tc is passed value is not null",true);
	  Assert.fail();//it is used for intentionally failed test case 
  }
}
