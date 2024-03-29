package com.selenium.seleniumConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pages.PropertyReader;

public interface LanchBrowserI {
	public static final WebDriver driver=null;
	PropertyReader reader = new PropertyReader();
    @BeforeTest
	public static void initBrowser() {
		System.setProperty("webdriver.chrome.driver", reader.getChromeDriver());
		WebDriver driver = new ChromeDriver();
		String url = reader.getApplicationUrl();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(reader.getImplicitWait(), TimeUnit.SECONDS);
		driver.get(url);
	}

}
