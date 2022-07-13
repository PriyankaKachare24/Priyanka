package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest2
{
	@Test
	public void myMethod4() 
	{
		Reporter.log("My Method4 is running",true);
	}
	@Test
	public void myMethod5() 
	{
		Assert.fail();
		Reporter.log("My Method5 is running",true);
	}
	@Test(dependsOnMethods = {"myMethod5"})
	public void myMethod6() 
	{
		Reporter.log("My Method6 is running",true);
	}
}
