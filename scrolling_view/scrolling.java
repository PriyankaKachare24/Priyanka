package scrolling_view;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
       JavascriptExecutor j=((JavascriptExecutor)driver);
       j.executeScript("window.scrollBy(80,900)");
       Thread.sleep(1000);
       j.executeScript("window.scrollBy(80,2000)");
       Thread.sleep(1000);
       j.executeScript("window.scrollBy(80,500)");
       Thread.sleep(1000);
       j.executeScript("window.scrollBy(80,-2000)");
	}

}
