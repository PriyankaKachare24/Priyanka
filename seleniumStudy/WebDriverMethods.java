package seleniumStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
      //  1. get- to enter url in browser or to open an application.
        
           driver.get("https://vctcpune.com/selenium/practice.html");
        
      // 2. close: to close the current tab of the browser opened by Selenium tool.
           //driver.close();
        
       // 3. quit: to close the all the tabs present in browser opened by Selenium tool.
          // driver.quit();

       // 4. maximize/ minimize() - used to maximize/ minimize the browser
             //  driver.manage().window().maximize();
             // driver.manage().window().minimize();
           
        //  5. navigate: this method is use to open an application, move forward, backward & refresh the webpage.
           
           //driver.get("https://vctcpune.com/");
           // Thread.sleep(1000);
           
           // driver.navigate().to("https://www.google.com/");
           // Thread.sleep(500);
            
           // driver.navigate().back();
    		//Thread.sleep(2000);
    		
    		//driver.navigate().forward();
    		//Thread.sleep(800);
    		
    		//driver.navigate().refresh();
          
       //6. getTitle: this method is use to get title of a webpage. return type of getTitle method is String.
           
           //driver.get("https://vctcpune.com/");
           //Thread.sleep(500);
             //System.out.println(driver.getTitle());
            // String Title = driver.getTitle();
           	//System.out.println("Title is "+Title);
           	
        //7. getCurrentURL: this method is use to get URL of a webpage. return type of getCurrentURL method is String

           	driver.get("https://vctcpune.com/selenium/practice.html");
           	Thread.sleep(700);
          //  System.out.println(driver.getCurrentUrl());
        	
        	String url = driver.getCurrentUrl();
        	System.out.println("Url is "+url);

    		
    		
    		
    		






	}

}
