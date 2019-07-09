package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import generic.AutoUtils;
import generic.IAutoConstants;
import org.testng.Assert;

public class EnterPage {

	@FindBy(xpath = "//div[contains(text(),'Help')]")
	private WebElement help;
	@FindBy(linkText = "About your actiTime")
	private WebElement aboutAT;
	@FindBy(xpath = "//span[@class='productVersion']")
	private WebElement version;

	public EnterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Methods
	public void clickHelp() {
		help.click();
	}

	public void clickAboutActiTime() {
		aboutAT.click();
	}

	public void verifyProductVersion(String ExpectedVersion) {
		String ActualVersion = version.getText();
		Assert.assertEquals(ActualVersion, ExpectedVersion);
	}

	public void verifyHomePageDisplayed(WebDriver driver, String eTitle) {
		String strETO = AutoUtils.getProperty(IAutoConstants.CONFIG_PATH, "ETO");
		long ETO = Long.parseLong(strETO);
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		try {
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Homepage is displayed", true);
		} catch (Exception e)
		{
			Reporter.log("Homepage not displayed", true);
			Assert.fail();
		}

	}

}
