package KitePOMUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	
		// 1.data members
		@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;
		@FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
	//2.constructor	
		public KiteHomePage (WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//3.methods	
		
//		public void validateUserName()
//		{
//			 String expextedUserID="ELR321";
//			 String actualUserID=username.getText();
//			 
//			 if(expextedUserID.equals(expextedUserID))
//			 {
//			 System.out.println("Actual and Expected User Id are matching TC is passed");
//			 
//			 }
//			 else
//			 {
//			 System.out.println("Actual and Expected User Id are not matching TC is failed");
//			 }
//		}
		public String getActualUserID() 
		{
			String actualUID = userID.getText();
	        return actualUID;
		}
		
			 public void clickOnLogOut() throws InterruptedException
			 {
			 userID.click();
			 Thread.sleep(200);
			 logOutButton.click();
	}

			

			
}
