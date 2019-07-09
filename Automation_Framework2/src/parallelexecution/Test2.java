package parallelexecution;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 extends SuperClass {
	@Test
	public void test2() throws InterruptedException {
		System.out.println("Running test on chrome");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(2000);

		// Click on help button
		driver.findElement(By.xpath("//div[contains text(),'Help']")).click();
		// Click on about your actiTime
		driver.findElement(By.linkText("About your actiTime")).click();
		System.out.println("Clicked on Help icon and clicked on about your actiTime link");
		driver.findElement(By.xpath("//div[@id='aboutPopupCloseButtonId']")).click();

		// To find the the text of the logout link
		WebElement logout = driver.findElement(By.id("logoutLink"));
		String text = logout.getText();
		System.out.println("Test of the link is:" + text);
		Thread.sleep(2000);
		logout.click();
		System.out.println("Browser is closed");

	}
}
