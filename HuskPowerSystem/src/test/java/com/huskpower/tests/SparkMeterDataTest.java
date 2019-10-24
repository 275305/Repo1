package com.huskpower.tests;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.huskpower.pages.PropertyReader;
import com.huskpower.pages.SparkMeterDataPage;

import util.ReusableActions;

public class SparkMeterDataTest extends ReusableActions {

	PropertyReader reader = new PropertyReader();
	private static Logger lOGGER = Logger.getLogger(SparkMeterDataTest.class.getName());

	/* Test cases for read the url from excel sheets */
	@Test(priority = 0, enabled = true)
	public void getUrlValueFromPropertiesFile() throws Exception {
		PageFactory.initElements(driver, SparkMeterDataPage.class);
		try {
			int sheet = 0, row = 0, column = 0;
			List<Integer> list = reader.getSparkUrlValue();
			Iterator<Integer> itr = list.iterator();
			while (itr.hasNext()) {
				sheet = itr.next();
				row = itr.next();
				column = itr.next();
			}

			String url = SparkMeterDataPage.getSparkDataUrlValueFromExcel(sheet, row, column);
			ReusableActions.initializeSparkBrowser(url);

		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}

	}
	/* Test cases for read the EmailId from excel sheets */
	@Test(priority = 1, enabled = true)
	public void getEmailIDFromPropertiesFile() throws Exception {
		PageFactory.initElements(driver, SparkMeterDataPage.class);
		try {
			int sheet = 0, row = 0, column = 0;
			List<Integer> list = reader.getSparkEmailIdValue();
			Iterator<Integer> itr = list.iterator();
			while (itr.hasNext()) {
				sheet = itr.next();
				row = itr.next();
				column = itr.next();
			}

			String url = SparkMeterDataPage.getSparkDataUrlValueFromExcel(sheet, row, column);
			ReusableActions.initializeSparkBrowser(url);

		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}

	}
	/* Test cases for read the EmailId from excel sheets */
	@Test(priority = 1, enabled = true)
	public void getPasswordFromPropertiesFile() throws Exception {
		PageFactory.initElements(driver, SparkMeterDataPage.class);
		try {
			int sheet = 0, row = 0, column = 0;
			List<Integer> list = reader.getSparkPasswordValue();
			Iterator<Integer> itr = list.iterator();
			while (itr.hasNext()) {
				sheet = itr.next();
				row = itr.next();
				column = itr.next();
			}

			String url = SparkMeterDataPage.getSparkDataUrlValueFromExcel(sheet, row, column);
			ReusableActions.initializeSparkBrowser(url);

		} catch (Exception e) {
			lOGGER.info("Test case failed" + e.getMessage());
			throw e;
		}

	}
}
