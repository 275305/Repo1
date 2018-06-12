package com.test.Fulfilment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;
import uielements.LoginPage;

public class ReusableActions {
	
	//WebDriver driver;
	public static WebDriver driver;
	
	
	public static Logger logger = LoggerFactory.getLogger(LoginPage.class);


	
	//Function for Print the steps in allure report
			@Step("{0}")
			 public static void logStep(String stepName ){
			
			 }
			
			//Function for take the screen shot in allure report
			@Attachment("Screenshot")
		    public static byte[] attachScreen(WebDriver driver ) {
		        logStep("Taking screenshot");
		        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    }
			
			@Attachment("Error_Screenshot")
		    public static byte[] attachScreen_TestCaseError(WebDriver driver ) {
		        logStep("Taking screenshot");
		        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    }
	
	
	public static WebElement waitTillElementLocated(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elementloaded = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elementloaded;
	}
    
	public static WebElement waitTillElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elementloaded = wait.until(ExpectedConditions.visibilityOf(element));
		return elementloaded;
	}
	
	public static WebElement waitTillElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elementloaded = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elementloaded;
	}
	
	public static WebElement waitTillpresenceofElementLoacted(By element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elementloaded = wait.until(ExpectedConditions.presenceOfElementLocated(element));
		return elementloaded;
	}
	
	
	public static void type(WebElement textbox, String inputdata) throws Exception {
		Thread.sleep(1000);
		for (int i = 0; i <= 15; i++) {
			try {
				textbox.clear();
				textbox.sendKeys(inputdata);
				break;

			} catch (Exception e) {
				if (i == 15) {
					throw e;

				} else {
					Thread.sleep(1000);
				}
			}
		}
	}
	
	
	
	public static void click(WebElement locator) throws Exception {
		Thread.sleep(1000);

		for (int i = 0; i <= 40; i++) {
			try {
				locator.click();
				break;

			} catch (Exception e) {
				if (i == 40) {
					throw e;

				} else {
					Thread.sleep(1000);
				}
			}
		}
	}
	
	
	public static void waitTillPageLoaded(WebDriver driver) {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		Wait<WebDriver> wait = new WebDriverWait(driver, 30);
		try {
			wait.until(expectation);
		} catch (Throwable error) {
		}
	}

	public static void captureScreenShot(WebDriver ldriver) {
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile method

			FileUtils.copyFile(src, new File("C:/selenium/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e)

		{
			System.out.println(e.getMessage());
		}

	}

}
