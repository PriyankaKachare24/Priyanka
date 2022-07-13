package popUps;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_PopUp {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		String mainPageID = driver.getWindowHandle();
		System.out.println(mainPageID);//id of main page
		System.out.println("%%%%%%%%%%%%%%%%");
		//open child window
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		
		//to handle multiple windows -->get multiple id
		Set<String> allPagesID = driver.getWindowHandles();
		
		Iterator<String>it=allPagesID.iterator();
		//while(it.hasNext())
		//{
		//	System.out.println(it.next());
		//}
		String mainPageId=it.next();//return main page id
		String childPageId=it.next();//return child page id
		
	//to switch focus to child window
		driver.switchTo().window(childPageId);// changing focus from main page to childpage
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
		// driver.close(); will close only current focused tab
		// driver.quit();// will close all tabs/pages opened by selenium
		driver.switchTo().window(mainPageId);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		//driver.close();
		//driver.quit();
		driver.switchTo().window(mainPageId);
		WebElement myElement=driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
		System.out.println(myElement.getText());
		
	}

}
