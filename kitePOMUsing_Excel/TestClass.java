package kitePOMUsing_Excel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import kite_App_POM.KitePinPage;
import kite_App_POM.Kite_HomePage;
import kite_App_POM.Kite_LoginPage;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		File myFile = new File("C:\\Selenium\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		  
		String UN = mySheet.getRow(1).getCell(0).getStringCellValue();
		String PWD = mySheet.getRow(1).getCell(1).getStringCellValue();
		String PIN = mySheet.getRow(1).getCell(2).getStringCellValue();
		
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


