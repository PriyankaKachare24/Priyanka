package kiteTest;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import kiteBase.BaseProp;
import kiteUtility.UtilityProp;

public class Listner extends BaseProp implements ITestListener
	{
		@Override
		public void onTestFailure(ITestResult result) 
		{
			try {
				UtilityProp.captureScreenshot(driver, result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		@Override
		public void onTestSuccess(ITestResult result)
		{
		Reporter.log("test case passed and TC name is "+result.getName(),true);
		}
		
	}

