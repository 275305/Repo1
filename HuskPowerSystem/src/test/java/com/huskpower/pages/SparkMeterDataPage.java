package com.huskpower.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.ReusableActions;

public class SparkMeterDataPage {

	WebDriver driver;
	private static final Logger lOGGER = Logger.getLogger(HuskHomePage.class);

	public SparkMeterDataPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	/* x-path for emailtext text */
	@FindBy(xpath = "//input[@name='email']")
	static WebElement emailIdTextBoxSparkMeterCloud;

	/* x-path for password text */
	@FindBy(xpath = "//input[@name='password']")
	static WebElement passwordTextBoxSparkMasterCloud;
	
	
	/* x-path for password text */
	@FindBy(xpath = "//li[@class='toolbar-link']")
	static WebElement toolBarDropDownTransactionPage;
	
	//need
	
	/* x-path for login button */
	@FindBy(xpath = "//button[@type='submit']")
	static WebElement loginButtonSparkMasterCloudChanpatiya;

	@FindBy(xpath = "//a[@class='cog']")
	static WebElement myGlobalSelsAccountDropDown;

	@FindBy(xpath = "//span[contains(text(),'History ')]")
	static WebElement historyTabHomePage;

	@FindBy(xpath = "//a[@href='/transaction/transactions']")
	static WebElement transactionTabHomePage;
	
	/*x-path for tool bar link at transaction page*/
	@FindBy(xpath = "//li[@class='toolbar-link']")
	static WebElement toolbarLinkTransactionTab;
	
	/*method for tool bar link at transaction page*/
	public static void toolbarLinkTransactionTab(){
		toolbarLinkTransactionTab.click();
	}
	
	public static void toolBarDropDownTransactionPage(){
	toolBarDropDownTransactionPage.click();
	}

	public static String getSparkDataUrlValueFromExcel(int sheetNo, int rowNo, int columnNo) throws Exception {
		try {
			// SparkMeterDataPage.setSparkDataUrlValueFromExcel(sheetNo,
			// columnNo, rowNo);

			String urlData = ReusableActions.readingSparkdata(sheetNo, rowNo, columnNo);
			return urlData;

		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}
	}

	public static void getSparkEmailIdValueFromExcel(int sheetNo, int rowNo, int columnNo) throws Exception {
		try {
			emailIdTextBoxSparkMeterCloud.clear();
			type(emailIdTextBoxSparkMeterCloud, ReusableActions.readingSparkdata(sheetNo, rowNo, columnNo));
			// SparkMeterDataPage.setSparkEmailValueFromExcel(sheetNo, columnNo,
			// rowNo);

		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}
	}
	
	public static void getSparkEmailIdValueFromExcelAgain() throws Exception {
		try {
			emailIdTextBoxSparkMeterCloud.clear();
			emailIdTextBoxSparkMeterCloud.sendKeys("v-apavan@huskpowersystems.com");
		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}
	}
	
	public static void getSparkPasswordValueFromExcelAgain()throws Exception {
		try {
			passwordTextBoxSparkMasterCloud.clear();
			passwordTextBoxSparkMasterCloud.sendKeys("husk@power");

		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}
	}

	public static void getSparkPasswordValueFromExcel(int sheetNo, int rowNo, int columnNo) throws Exception {
		try {
			passwordTextBoxSparkMasterCloud.clear();
			type(passwordTextBoxSparkMasterCloud, ReusableActions.readingSparkdata(sheetNo, rowNo, columnNo));

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

	/* method for login button spark Data cloud */
	public static void loginButtonSparkChanpatiya() throws InterruptedException {
		loginButtonSparkMasterCloudChanpatiya.click();
		Thread.sleep(7000);
	}

	public static void historyTabHomePage() throws InterruptedException {
		historyTabHomePage.click();
		Thread.sleep(2000);
	}

	public static void transactionTabHomePage() throws InterruptedException {
		transactionTabHomePage.click();
		Thread.sleep(7000);
	}

	public static void myGlobalSelsAccountDropDown() throws InterruptedException {
		myGlobalSelsAccountDropDown.click();
		Thread.sleep(7000);
	}
}
