package com.guru.alerts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.properties.PropertyReader;
import com.reusable.constant.ReusableConstant;

public class MultipleWindowsHandlings {

	private Alert alert;
	private WebDriver driver;
	private PropertyReader reader;
	private WebElement submitButtonDemoSiteGuru;
	private WebElement clickhearlinkDemoSiteGuru;
	private static final Logger logger = Logger.getLogger(SimpleAlertMessageHandling.class.getName());

	@BeforeClass
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
		driver.get(PropertyReader.windowUrl());
		logger.info("Test Case: nevigate to the application sucessfully");
	}

	@Test(priority = 0, enabled = true)
	public void getWindowHandles() {
		clickhearlinkDemoSiteGuru = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		clickhearlinkDemoSiteGuru.click();
		logger.info("Test Case: click on the link sucessfully");
		String mainWindow = driver.getWindowHandle();
		Set<String> allOpenWindow = driver.getWindowHandles();
		Iterator<String> itr = allOpenWindow.iterator();
		while (itr.hasNext()) {
			String childWindow = itr.next();
			if (!mainWindow.equalsIgnoreCase(childWindow)) {
				// switch to the child window
				driver.switchTo().window(childWindow);
				// close the child window
				driver.close();
				
			}

		}
	}

}