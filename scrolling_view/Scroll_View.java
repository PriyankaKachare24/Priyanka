
package scrolling_view;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_View {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		 driver.get("https://vctcpune.com/");
	     Thread.sleep(1000);
    
		WebElement Ref = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		JavascriptExecutor js=((JavascriptExecutor)driver);		
		Thread.sleep(1000);		
		js.executeScript("argument[0].Scroll_view(true);",Ref);	
				
				
	}

}
