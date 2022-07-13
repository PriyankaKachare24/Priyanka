package popUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_assignment {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> AllID = driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<String>(AllID);
		driver.switchTo().window(al.get(1));//address of child browser
		
		driver.findElement(By.name("emailid")).sendKeys("kacharepriyanka24@gmail.com");
		
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(1500);
		driver.close();
		
		driver.switchTo().window(al.get(0));//address of main page
		driver.findElement(By.xpath("a[text()='Agile Project']")).click();
		 

	}

}
