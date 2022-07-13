package scrolling_view;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_size {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://vctcpune.com/");
    System.out.println(driver.manage().window().getSize());
//	
//     Dimension D=new Dimension(1000,10);
//     ((Dimension) driver.manage()).setSize(D);
//	System.out.println(driver.manage().window().getSize());
//	
	
	Dimension D=new Dimension(1000, 10);
	driver.manage().window().setSize(D);
	System.out.println(driver.manage().window().getSize());
	}

}
