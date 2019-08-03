package com.guru.alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.properties.PropertyReader;

import junit.framework.Assert;

public class SimpleAlertMessageHandling {
    
	private  Alert alert;
	private WebDriver driver;
	private PropertyReader reader;
    private WebElement submitButtonDemoSiteGuru;
    private WebElement custmerIdTextDemoSiteGuru;
	@Test(priority = 0, enabled = true)
	public void startBrowser() {
		reader = new PropertyReader();
		String path = System.getProperty("user.dir");
		String chromeDriverPath = path + "//lib//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
	}

	@Test(priority = 1, enabled = true)
	public void alertGetText() {
		custmerIdTextDemoSiteGuru = driver.findElement(By.xpath("//input[@name='cusid']"));
		custmerIdTextDemoSiteGuru.sendKeys("53920");
        submitButtonDemoSiteGuru=driver.findElement(By.xpath("//input[@name='submit']"));
		submitButtonDemoSiteGuru.click();
         alert = driver.switchTo().alert();
        String expectedTextValue="Do you really want to delete this Customer?";
       	String actualTextValue = alert.getText();
       	if(expectedTextValue.contentEquals(actualTextValue))
       		Assert.assertEquals(expectedTextValue, actualTextValue);
       	else
       		Assert.fail("Test case fail:  Alert Value is not equal");
	}
	@Test(priority=2,enabled=true)
	public void alertAcceptDissmiss(){
		//click on cancel button
		 alert.dismiss();
		 //again click on submit button
		 submitButtonDemoSiteGuru.click();
		 //click on ok button
		 alert.accept();
		 alert.accept();
		 
      		
	}
}