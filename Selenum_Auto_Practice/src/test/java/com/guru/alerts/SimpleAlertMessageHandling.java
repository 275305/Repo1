package com.guru.alerts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.properties.PropertyReader;
import com.read.excel.file.ReadExcelFile;
import com.reusable.constant.ReusableConstant;

import junit.framework.Assert;

public class SimpleAlertMessageHandling {

	private Alert alert;
	private WebDriver driver;
	private PropertyReader reader;
	private WebElement submitButtonDemoSiteGuru;
	private WebElement custmerIdTextDemoSiteGuru;
	private static final Logger logger = Logger.getLogger(SimpleAlertMessageHandling.class.getName());

	@Test(priority = 0, enabled = true)
	public void startBrowser() {
		reader = new PropertyReader();
		String path = System.getProperty("user.dir");
		String chromeDriverPath = path + ReusableConstant.INPUT_WEB_DRIVER;
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		logger.info("Test Case: webDriver initialize sucessfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(PropertyReader.getImplicitExplicitWait(), TimeUnit.SECONDS);

		// read url from config.properties
		driver.get(PropertyReader.alertUrl());

		logger.info("Test Case: webDriver initialize sucessfully");
	}

	@Test(priority = 1, enabled = true)
	public void alertGetText() {
		
		try{
		custmerIdTextDemoSiteGuru = driver.findElement(By.xpath("//input[@name='cusid']"));
		
			ReadExcelFile.readExcel_Files(2, 1, 0);
		
		custmerIdTextDemoSiteGuru.sendKeys(ReadExcelFile.readExcel_Files(2, 1, 0));
		submitButtonDemoSiteGuru = driver.findElement(By.xpath("//input[@name='submit']"));
		submitButtonDemoSiteGuru.click();

		alert = driver.switchTo().alert();
		String expectedTextValue = "Do you really want to delete this Customer?";
		String actualTextValue = alert.getText();

		if (expectedTextValue.contentEquals(actualTextValue)) {
			Assert.assertEquals(expectedTextValue, actualTextValue);
			logger.info("Test Case:Expected value are equals to the Actual value");
		} else
			Assert.fail("Test case fail:  Alert Value is not equal");
		logger.info("Test Case fail: Alert Value is not equal");
	}

	
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@Test(priority = 2, enabled = true)
	public void alertAcceptDissmiss() {
		/* click on cancel button */
		alert.dismiss();
		logger.info("Test Case : click on cancle button at alert");
		/* again click on submit button */
		submitButtonDemoSiteGuru.click();
		/* click on ok button */
		alert.accept();
		logger.info("Test Case : click on ok button at alert");
		alert.accept();
		logger.info("Test Case : click on cancle button at alert");

	}
}