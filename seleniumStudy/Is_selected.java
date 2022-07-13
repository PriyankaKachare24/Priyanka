package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
		boolean result = checkbox1.isSelected();
			if(result==true) 
			{
				System.out.println("Checkbox is already selected");
			}
			else 
			{

				System.out.println("Checkbox is not selected");
				
				 //checkbox1.click();
				boolean result1 = checkbox1.isSelected();
				 if(result1==true)
				 {
					 System.out.println("Checkbox is selected now");
				 }
				 else
				 {
					 System.out.println("Please select checkbox Option1");
				 }
	
			}
			
			}
		

	}


