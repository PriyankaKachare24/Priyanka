package kite_App_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage 
{
// 1.data members
	@FindBy(xpath = "//span[@class='user-id']")private WebElement username;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logOutButton;
//2.constructor	
	public Kite_HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//3.methods	
	
	public void validateUserName()
	{
		 String expexteduserName="ELR321";
		 String actualuserName=username.getText();
		 
		 if(expexteduserName.equals(actualuserName))
		 {
		 System.out.println("Actual and Expected User Id are matching TC is passed");
		 
		 }
		 else
		 {
		 System.out.println("Actual and Expected User Id are not matching TC is failed");
		 }
	}
		 public void logOut() throws InterruptedException
		 {
		 username.click();
		 Thread.sleep(200);
		 logOutButton.click();
}
}