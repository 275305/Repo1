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
	static 	WebElement emailText;

	// span[contains(text(),'Next')]
	@FindBy(xpath = "//span[contains(text(),'Next')]")
	static WebElement nextButton;

	//// div[@id='passwordNext']
	@FindBy(xpath = "//span[@class='CwaK9']//span[text()='Next']")
	WebElement nextPassBtn;

	/* x-path for email password */
	@FindBy(xpath = "//input[@name='password']")
	WebElement emailPassword;

	public static void setEmailID(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		emailText.clear();
		ReusableTest.readingdata(x, y, z);
		//type(emailText, ReusableTest.readingdata(x, y, z));
		/*//String mobileNumberPassedFromExcel = emailText.getAttribute("value");
		int size = mobileNumberPassedFromExcel.length();
		if (size == 10 && !mobileNumberPassedFromExcel.contains("A") && mobileNumberPassedFromExcel.contains("9")
				&& !mobileNumberPassedFromExcel.contains("@")) {
			LOGGER.info(
					"Test case pass:- As Mobile number feild length is 10 and accepting only numeric value,not accepting special character and alphabets ");
		} else {
			Assert.fail(
					"Test case fail:-As either Mobile number feild length is not 10 or not accepting only numeric value,accepting special character or alphabets");
		}*/

	}

	public static void type(WebElement textbox, String inputdata) throws Exception {
		Thread.sleep(2000);
		for (int i = 0; i <= 15; i++) {
			try {
				textbox.clear();
				textbox.sendKeys(inputdata);
				break;

			} catch (Exception e) {
				if (i == 15) {
					throw e;

				} else {
					Thread.sleep(2000);
				}
			}
		}
	}

	// enter the email id
	public void emailIdTextGmailLoginPage(int sheetNo,int columnNo,int rowNo) {
		try {
			GmailLoginPage.setEmailID(sheetNo, columnNo, rowNo);
			//emailText.sendKeys(emailtext);
			nextButton.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// enter the password
	public void emailPassword(String emailtext) {
		try {
			emailPassword.sendKeys(emailtext);
			nextPassBtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void emailIdTextGmailLoginPage(String emailCellValue) {
		
		
	}
}
