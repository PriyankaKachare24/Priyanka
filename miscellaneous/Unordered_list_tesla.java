package miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unordered_list_tesla {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Infosys");
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.xpath("(//ul[@class='o3j99 c93Gbe'])[1]//li"));
		System.out.println(searchResult.size());
		Thread.sleep(700);
		
		//for each loop
		for(WebElement result:searchResult) 
		{
         System.out.println(result.getText());
		
		}
		for(WebElement result:searchResult)
		{
			 String actualText=result.getText();
			 String expectedText="Infosys career";
			   
			    if(actualText.equals(expectedText))
			    {
			    	result.click();
			    	break;
			    }
		}
			    	driver.findElement(By.linkText("Images")).click();
			    	
		
	}

}
