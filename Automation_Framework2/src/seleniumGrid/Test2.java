package seleniumGrid;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends SuperClassGrid{
	@Test
	public void test2() throws InterruptedException
	{
		
		System.out.println("Running test on Chrome");
		
		
		driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        Thread.sleep(5000);
        
        //click on help button
        driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
        //click on About your actiTIME
        driver.findElement(By.linkText("About your actiTIME")).click();
        
        System.out.println("clicked on Help icon and clicked on About your actiTIME link");
        Thread.sleep(2000);
        //close the popup
        driver.findElement(By.xpath("//div[@id='aboutPopupCloseButtonId']")).click();
        
        WebElement logout = driver.findElement(By.id("logoutLink"));
        String text = logout.getText();
        System.out.println("Chrome-Text of Log out Link is: " +text);
        Thread.sleep(6000);
        logout.click(); 
        System.out.println("Closed Chrome browser");
	}
}
