package excelSheetStudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_app_using_ExelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
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
		
		WebElement userID = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
	    userID.sendKeys(UN);
		password.sendKeys(PWD);
        loginButton.click();
        Thread.sleep(1000);
        
        WebElement pin = driver.findElement(By.id("pin"));
        WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
         
        pin.sendKeys(PIN);
        continueButton.click();
        Thread.sleep(1000);
        
        WebElement userName=driver.findElement(By.xpath("//span[@class='user-id']"));
        String actualUserID = userName.getText();
        String expectedUserID = UN;
        
        if(actualUserID.equals(expectedUserID))
        {
        	System.out.println("UserID is matching TestCase is Passed");
        }
        else 
        {
        	System.out.println("UserID is not matching TestCase is Failed");
        }
         userName.click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[@target='_self']")).click();//logout button
         Thread.sleep(2000);
         driver.close();
		
		
		
		
		
		
		
		
	}

}
