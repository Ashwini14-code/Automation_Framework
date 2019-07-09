package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SuperClassGrid 
{
 /*below is working code
  */
    public WebDriver driver;
  //@Parameters({"browser"})
   @BeforeClass
   
   public void precondition() throws MalformedURLException
   {
	   //System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	   URL HubURL = new URL("http://192.168.0.4:4444/wd/hub");
	   //System.setProperty("webdriver.chrome.driver","C://AutomationFramework//AutomationFramework//Automation_Framework2//Drivers//chromedriver.exe");
	   DesiredCapabilities whichBrowser= DesiredCapabilities.firefox();
	   driver = new RemoteWebDriver(HubURL, whichBrowser);
	   
	   driver.get("http://192.168.0.4:4444/login.do");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	   
   }
   @AfterClass
   
   public void postCondition()
   {
	   driver.quit(); 
	      
   }
   public WebDriver driver;
   @Parameters({"Browser"})
   @BeforeClass
   
   public void preCondition(String Browser) throws MalformedURLException
   {
	   if (Browser.equals("firefox1"))
	   {
		   URL HubURL = new URL("http://192.168.0.74:4444/wd/hub");
			DesiredCapabilities whichBrowser1 =new DesiredCapabilities.chrome();
		   driver = new RemoteWebDriver(HubURL1, whichBrowser1);
		   
	   }
	   if(browser.equals("chrome1"))
		{
			URL HubURL1 = new URL("http://192.168.0.40:4444/wd/hub");
			//System.setProperty("webdriver.chrome.driver","D://Automation_Project_GitHub//Automation_POM1//Drivers//chromedriver.exe");	
			DesiredCapabilities whichBrowser1= DesiredCapabilities.chrome();
			driver=new RemoteWebDriver(HubURL1, whichBrowser1);
		}
	   
	   
	   driver.get("http://192.168.0.4:4444/login.do");//url
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
   }
   @AfterClass
   
   public void postCondition()
   {
	   driver.quit();
	   
   }
   
}
   
   
   
   
   
   
   
   
   
   
   
   
}
