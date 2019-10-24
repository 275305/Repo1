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
	@FindBy(xpath="//input[@id='email']")
	static WebElement emailIdTextBoxSparkMeterCloud;

	public static String getSparkDataUrlValueFromExcel(int sheetNo, int rowNo, int columnNo) throws Exception {
		try {
			//SparkMeterDataPage.setSparkDataUrlValueFromExcel(sheetNo, columnNo, rowNo);

			String urlData=ReusableActions.readingSparkdata(sheetNo, rowNo, columnNo);
			  return urlData;
			  
		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}
	}
	public static String getSparkEmailIdValueFromExcel(int sheetNo, int rowNo, int columnNo) throws Exception {
		try {
			SparkMeterDataPage.setSparkEmailValueFromExcel(sheetNo, columnNo, rowNo);

			String urlData=ReusableActions.readingSparkdata(sheetNo, rowNo, columnNo);
			  return urlData;
			  
		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}
	}

	public static void setSparkEmailValueFromExcel(int sheet, int row, int column) throws Exception {
		emailIdTextBoxSparkMeterCloud.clear();
		type(emailIdTextBoxSparkMeterCloud, ReusableActions.readingdata(sheet, row, column));
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
