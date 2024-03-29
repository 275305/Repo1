package com.selenium.seleniumConcept;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.PropertyReader;

public class LaunchBrowser{
	protected static WebDriver driver;
    
	PropertyReader reader=new PropertyReader();
	@BeforeTest
	public void initBrowser() {
		//String PATH = System.getProperty("user.dir");
		//PATH + "\\lib\\chromedriver.exe"
		System.setProperty("webdriver.chrome.driver",reader.getChromeDriver());
		driver = new ChromeDriver();
		String url = reader.getApplicationUrl();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(reader.getImplicitWait(), TimeUnit.SECONDS);
		driver.get(url);
			}
	
}
