package pages;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.CustomIndexedColorMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.ReusableActions;

public class AlertGuruPage {

	static WebDriver driver;
	private static final Logger lOGGER = Logger.getLogger(AlertGuruPage.class.getName());

	public AlertGuruPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@name='cusid']")
	static WebElement custIdGuru;
	
	@FindBy(xpath="//input[@name='submit']")
	static WebElement submitbtnGuru;
	
	public void submitBtnGuruPage(){
		submitbtnGuru.click();
	}

	

	public static void setTextBoxAlertGuruPage(int sheet, int row, int column) throws Exception {
		custIdGuru.clear();
		type(custIdGuru, ReusableActions.readingdata(sheet, row, column));
	}

	public void textBoxAlertGuruPage(int sheetNo, int columnNo, int rowNo) throws Exception {
		try {
			AlertGuruPage.setTextBoxAlertGuruPage(sheetNo, columnNo, rowNo);
			lOGGER.info("Customer Id Entered Sucessfully");
			// nextButton.click();
			lOGGER.info("navigate to the next page");
			
		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}
	}

	public static void type(WebElement textbox, String inputDataFromExcel) {

		for (int i = 0; i <= 15; i++) {
			try {
				textbox.clear();
				textbox.sendKeys(inputDataFromExcel);
				break;

			} catch (Exception e) {
				lOGGER.info("Test case failed" + e.getMessage());
				throw e;
			}
		}
	}

}
