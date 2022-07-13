package miscellaneous;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlagAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=indian+flag&sxsrf=ALiCzsYepAi6eqP1nPvGlyv6v_moQSvZcw:1654790356981&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiU9Z673qD4AhX5yIsBHdGmCogQ_AUoAXoECAIQAw&biw=1366&bih=569&dpr=1");
		
		Thread.sleep(1000);
		
		List<WebElement> flag = driver.findElements(By.tagName("img"));
	
		System.out.println(flag.size());
		
		Iterator<WebElement> it = flag.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next().getText());	
		}


	}

	}


