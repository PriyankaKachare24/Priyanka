package scrolling_view;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition
{

	private static org.openqa.selenium.Point point;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://vctcpune.com/");
	    System.out.println(driver.manage().window().getPosition());
	    Thread.sleep(400);
	    
	    // point p = new point(800, 500);
	    Point p= new Point(800, 500);
		driver.manage().window().setPosition(p);
	}

}
