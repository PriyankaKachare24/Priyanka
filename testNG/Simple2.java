package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple2 {
  @Test
  public void Display1() 
  {
	  Reporter.log("good night",true);
	  Reporter.log("test case is pass");
  }
}
