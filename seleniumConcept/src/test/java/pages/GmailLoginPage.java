package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GmailLoginPage {

	WebDriver driver;

	public GmailLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	/* x-path for email-id */
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailText;

	// span[contains(text(),'Next')]
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	WebElement nextButton;
	
	////div[@id='passwordNext']
	@FindBy(xpath="//span[@class='CwaK9']//span[text()='Next']")
	WebElement nextPassBtn;

	/* x-path for email password */
	@FindBy(xpath = "//input[@name='password']")
	WebElement emailPassword;

	// enter the email id
	public void emailText(String emailtext) {
		/*
		 * Actions actions = new Actions(driver);
		 * actions.moveToElement(emailText);
		 * actions.click().sendKeys(emailtext); //actions.sendKeys();
		 * actions.build().perform();
		 */
		try {
			emailText.sendKeys(emailtext);
			nextButton.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// enter the password
	public void emailPassword(String emailtext) {
		try {
			emailPassword.sendKeys(emailtext);
			nextPassBtn.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
