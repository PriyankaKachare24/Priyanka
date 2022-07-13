package verificationInTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertStudy {
  
	SoftAssert soft = new SoftAssert();
	
@Test
  public void myMethod() 
  {
	  String ExpectedResult = "vctcPune";
	  String ActualResult = "vctc";
	  
	  soft.assertEquals(ActualResult,ExpectedResult,"Value is not matching");
	  Reporter.log("myMethod softAssert is running",true);
	  
	  soft.assertNotNull(ActualResult);
	  Reporter.log("running TC",true);
	  soft.assertAll();
  }


	
}


	
	


