package parallelexecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SuperClass {

	public WebDriver driver;

	@Parameters({ "browser" })
	@BeforeMethod

	public void preCondition(String browser) {
		if (browser.equals("firefox1")) {
			// System.setProperty("webdriver.gecko.marionette",
			// "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if (browser.equals("chrome1")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");// u can use "//" also
			// Open the browser
			driver = new ChromeDriver();
		}

		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void postCondition() {
		driver.quit();
	}

}
