package verificationInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod() 
  {
	  String A="Priyanka";
	  String B="Priyanka";
	  Assert.assertEquals(A, B,"actual and expected are not equal");
  }
}
