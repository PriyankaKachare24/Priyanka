package kite_App_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://kite.zerodha.com/");
		 Thread.sleep(1000);
		 
         Kite_LoginPage Login=new Kite_LoginPage(driver);
         Login.sendUserName();
         Login.sendPassword();
         Login.clickOnLoginButton();
         Thread.sleep(1000);
         
         KitePinPage pin=new KitePinPage(driver);
         pin.sendPin();
         pin.clickOnContinueButton();
         Thread.sleep(1000);
         
         Kite_HomePage home=new Kite_HomePage(driver);
         home.validateUserName();
         home.logOut();
         driver.close();
	}

}
