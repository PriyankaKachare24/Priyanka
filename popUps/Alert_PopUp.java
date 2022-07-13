package popUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(1000);
		driver.findElement(By.id("alertButton")).click();
		 Alert alt=driver.switchTo().alert();
		 Thread.sleep(1500);
		 System.out.println("text in first alert is: "+alt.getText());
		 alt.accept();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("timerAlertButton")).click();
		 Thread.sleep(8500);
		 //Alert alt2=driver.switchTo().alert();
		 System.out.println("text in second  alert is: "+alt.getText());
		 alt.accept();
		
	}

}
