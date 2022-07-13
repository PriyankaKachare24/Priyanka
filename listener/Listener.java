package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
	@Override  
public void onTestSuccess(ITestResult result) 
   {
    Reporter.log("test case passed successfully",true);
    result.getName();
    Reporter.log("Name of test method completed successfully is"+result.getName(),true);
   }
	@Override  
	public void onTestFailure(ITestResult result) 
	{
	 Reporter.log("test case failed plz check again",true);
	 result.getName();
	 Reporter.log("Name of test method failed is"+result.getName(),true);
	}
	public void onTestSkipped(ITestResult result) 
	{
	 Reporter.log("test case skipped, plz check dependant method again",true);
	 result.getName();
	 Reporter.log("Name of test method skipped is"+result.getName(),true);
	}
}
