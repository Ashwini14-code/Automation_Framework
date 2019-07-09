package seleniumGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumGrid.SuperClassGrid;

public class Test1 extends SuperClassGrid {
	@Test
	public void test1() throws InterruptedException {
		System.out.println("Running test on firefox");
		String title = driver.getTitle();
		System.out.println("Title of the Browser is:" + title);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		WebElement logout = driver.findElement(By.id("logoutLink"));
		String text = logout.getText();
		System.out.println("Text of logout link is:" + text);
		logout.click();
		System.out.println("Closed the firefox browser");

	}
}
