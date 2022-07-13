package listBox;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listBox1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
       Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(5000);
        
   
       WebElement Day=driver.findElement(By.id("day"));
       Select s=new Select(Day);
      // s.selectByValue("23");
       s.selectByIndex(21);
       
       Thread.sleep(1000);
      
       WebElement Month=driver.findElement(By.id("month"));
       Select m=new Select(Month);
      // m.selectByIndex(0);
         m.selectByValue("11");
       Thread.sleep(1000);
       
       WebElement Year=driver.findElement(By.id("year"));
       Select y=new Select(Year);
       //y.selectByVisibleText("1996");
       y.selectByValue("2005");
       Thread.sleep(2000);
       
       
       
	}
	
}
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       


