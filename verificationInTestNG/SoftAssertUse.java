package verificationInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertUse {
	
  @Test
  public void myMethod() 
  {
	  String A = "ABC";
	  String B = null;
	  SoftAssert soft=new SoftAssert();
	  soft.assertEquals(A,B,"TC is failed values are not mathing");
	  //Reporter.log("TC is passed value are matching",true); 
	  
	  soft.assertNotNull(B,"TC is failed value is null");
	 // Reporter.log("TC is passed value is null",true); 
	  
	  soft.assertAll();
  }
}
