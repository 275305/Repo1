package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import tests.ReusableTest;

public class GmailLoginPage {

	WebDriver driver;
	private static final Logger LOGGER = Logger.getLogger(GmailLoginPage.class.getName());

	public GmailLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	/* x-path for email-id */
	@FindBy(xpath = "//input[@type='email']")
	static WebElement emailText;

	// span[contains(text(),'Next')]
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	static WebElement nextButton;

	//// div[@id='passwordNext']
	@FindBy(xpath = "//span[@class='CwaK9']//span[text()='Next']")
	static WebElement nextPassBtn;

	/* x-path for email password */
	@FindBy(xpath = "//input[@name='password']")
	static WebElement emailPassword;

	public static void setEmailIDGmailLoginPage(int sheet, int row, int column) throws Exception {
		emailText.clear();
		type(emailText, ReusableTest.readingdata(sheet, row, column));
	}

	public static void setPasswordGmailLoginPage(int sheet, int row, int column) throws Exception {
		Thread.sleep(2000);
		emailPassword.clear();
		type(emailPassword, ReusableTest.readingdata(sheet, row, column));
	}

	public static void type(WebElement textbox, String inputDataFromExcel) {

		for (int i = 0; i <= 15; i++) {
			try {
				textbox.clear();
				textbox.sendKeys(inputDataFromExcel);
				break;

			} catch (Exception e) {

			}
		}
	}

	// enter the email id
	public void emailIdTextGmailLoginPage(int sheetNo, int columnNo, int rowNo) {
		try {
			GmailLoginPage.setEmailIDGmailLoginPage(sheetNo, columnNo, rowNo);
			nextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// enter the password
	public void emailPasswordGmailLoginPage(int sheetNo, int columnNo, int rowNo) {
		try {
			GmailLoginPage.setPasswordGmailLoginPage(sheetNo, columnNo, rowNo);
			nextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
