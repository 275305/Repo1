package com.test.fulfilment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	public static Logger JourneyScreenOnelogger = LoggerFactory.getLogger(JourneyScreenOneTest.class);
	public static Logger JourneyScreenTwologger = LoggerFactory.getLogger(JourneyScreenTwoTest.class);


	
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
	
	
			
			// Function for Read the data from Properties File
			public static File file = null;
			public static FileInputStream fileInput = null;
		    //public String filepath="D:\\Max_Life Resolved Issues\\MAX_QA_FunctionalTest\\File Paths\\geckodriver.exe";
			public static Properties prop;
			
			public static Properties readProperties()
			{
				file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Input.properties");
				FileInputStream fileInput = null;

				try {
					fileInput = new FileInputStream(file);
					prop = new Properties();
					prop.load(fileInput);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

				catch (IOException e1) {
					logger.error(e1.getMessage());
				}
			
			return prop;
			}

			
			
			
			
	public static WebElement waitTillElementLocated(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
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
	
	
	public static String readingdata(int sheetno, int rownum, int colnum) throws Exception {
		File file = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\MasterData.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(sheetno);
		XSSFCell cell = sheet.getRow(rownum).getCell(colnum);
		DataFormatter df = new DataFormatter();
		String data = df.formatCellValue(cell);
		hssfWorkbook.close();
		return data;

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

	/*public static void captureScreenShot(WebDriver ldriver) {
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile method

			FileUtils.copyFile(src, new File("C:/selenium/" + System.currentTimeMillis() + ".png"));
		} catch (IOException e)

		{
			System.out.println(e.getMessage());
		}
}*/
	
	//Selecting value by date picker
	 public static void datePicker(List<WebElement> columns,int i,String Y) throws Exception{
		   // List<WebElement> columns=driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div/div[1]/div"));
		    {
		    for (WebElement cell: columns){
		    	// String datePickerText=cell.getText();
		    	// System.out.print("dataaaa"+datePickerText);
		    	// boolean date=cell.getText().equals("3");
		    	// System.out.print(date);
		    	// String X="3";
		       if (cell.getText().equals(i)){
		    	  //  Y="//div[contains(@class, 'react-datepicker__month-container')]/div[2]/div[1]/div[text()="+Z+"]";
		    	   cell.findElement(By.xpath(Y)).click();
		          break;
		     }}}
		    }
	
	 
	 
	 
	
}
