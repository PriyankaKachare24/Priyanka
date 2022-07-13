package suiteLevelListerner;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.Base;
import kiteUtility.UtilityProp;

public class Listener extends Base implements ITestListener 
{
	
@Override
	public void onTestFailure(ITestResult result) 
    {
		try {
			UtilityProp.captureScreenshot(driver,result.getName());
			Reporter.log("TC failed and TC name is"+result.getName(),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
