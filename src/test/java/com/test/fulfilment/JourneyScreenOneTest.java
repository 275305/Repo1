package com.test.fulfilment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.LoginPage;

public class JourneyScreenOneTest extends ReusableActions{
	
	 @BeforeClass
	    public void launchBrowser() throws Exception{
		 try {
	    System.setProperty("webdriver.chrome.driver", ".\\lib\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    logger.info("Test Started");
		prop = ReusableActions.readProperties();

	 	driver.get(prop.getProperty("SampleURL"));
	 	LoginPage.verifyloginpage();
	 			
	 	// Maximizing the browser window
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 	logger.info("Fulfilment URL opened successfully");
	 	
	 	LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
	 	logger.info("User logged in successfully");
		 }
		 catch (Exception e) {
	 			logger.error("Test case failed: " + e.getMessage());
	 			throw e;
	 		} 

	    }
	 
	 
	//TC -01 Verify the by default status of Nationality, Policy for and Proceed button on Journey Screen one
		@Test(priority = 0, enabled=true)
	    public void Indian() throws Exception{
			try{
				
				HomePage.clickNewApp();
				JourneyScreenOne.isIndianSelected();
				JourneyScreenOne.isSelfSelected();
				JourneyScreenOne.isProceedEnabled();
				
				}
			catch (Exception e) {
				logger.error("Test case failed: " + e.getMessage());
				throw e;
		 		}
	        }	
	 

	//TC -02 Test case for positive value for saving the first screen data
			@Test(priority = 1, enabled=true)
		    public void ScreenOneTestIndian() throws Exception{
				try{
					
					JourneyScreenOne.setAadhar(1,1,0);
					JourneyScreenOne.setPanNumber(1,1,1);
					JourneyScreenOne.setMobNumber(1,1,2);
					JourneyScreenOne.setEmailId(1,1,3);
					JourneyScreenOne.setPreIssuanceNumber(1,1,4);
					JourneyScreenOne.clickProceed();
					
				 	}
				catch (Exception e) {
					logger.error("Test case failed: " + e.getMessage());
					throw e;
			 		}
		        }	
			
			
			//TC -02 Test case for positive value for saving the first screen data
			@Test(priority = 2, enabled=false)
		    public void ScreenOneTestNRI() throws Exception{
				try{
					HomePage.clickDashboard();
					HomePage.clickNewApp();
					JourneyScreenOne.selectNRI();
					JourneyScreenOne.setAadhar(1,1,0);
					JourneyScreenOne.setPanNumber(1,1,1);
					JourneyScreenOne.setMobNumber(1,1,2);
					JourneyScreenOne.setEmailId(1,1,3);
					JourneyScreenOne.setPreIssuanceNumber(1,1,4);
					JourneyScreenOne.clickProceed();
					
				 	}
				catch (Exception e) {
					logger.error("Test case failed: " + e.getMessage());
					throw e;
			 		}
		        }	
			
			
			
	
	

}
