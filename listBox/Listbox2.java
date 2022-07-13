package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox2 {

	public static void main(String[] args) throws InterruptedException {
	//15-10-1998
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);
		
		//1.Identify list box to be handled and store it in reference variable
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		
		Select a = new Select(day);
		Select b = new Select(month);
		Select c = new Select(year);
		
		//3.By using one of the select class methods we can select values form list box like
		
		//a.selectByIndex(18); //  Day -- Text
		a.selectByValue("19");
		//a.selectByVisibleText("18");
		Thread.sleep(1000);
		
		
		//b.selectByValue("9"); // Month -- Index
		b.selectByIndex(8);
		//b.selectByVisibleText("Feb");
		Thread.sleep(1000);
		
		c.selectByVisibleText("1992"); //Visible Text
		//c.selectByIndex(1992);
		//c.selectByValue("1992");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
	}
}