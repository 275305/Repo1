package com.test.fulfilment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThreeUpdate;
import uielements.JourneyScreenTwoUpdate;
import uielements.LoginPage;
import uielements.JourneyScreenOnePANOCR;

public class JourneyScreenOnePANOCRTest extends ReusableActionsUpdate{
	
	
	@BeforeClass
    public void launchBrowser() throws Exception{
	 try {
    System.setProperty("webdriver.chrome.driver", ".\\lib\\Drivers\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "C:\\Matrix\\AutomationQA\\automationqa\\src\\test\\resources\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
    
    logger.info("Test Started");
	prop = ReusableActionsUpdate.readProperties();

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
	
	
	//TC -02 Test case for positive value for saving the first screen data
	@Test(priority = 1, enabled=true)
    public void aadhaarOCRPrepopulatedDataValidation() throws Exception{
		try{
			//PageFactory.initElements(driver, journeyScreenOnePANOCRTest.class);
			HomePage.clickNewApp();
			JourneyScreenOnePANOCR.prePopulationOCRAadhar();
			JourneyScreenOnePANOCR.setPanNumber(1,1,1);
			JourneyScreenOnePANOCR.setMobNumberOCR(1,1,2);
			JourneyScreenOnePANOCR.setEmailId(1,1,3);
			JourneyScreenOnePANOCR.setPreIssuanceNumber(1,1,4);
			JourneyScreenOnePANOCR.clickProceed();
			Thread.sleep(4000);
			JourneyScreenOnePANOCR.checkPrePopulatedDataAfterAadhaarOCR();
			
		 	}
		catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
	 		}
        }	
	
	

	@Test(priority = 2, enabled=true)
    public void PANOCRPrepopulatedDataValidation() throws Exception{
		try{
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOnePANOCR.setAadhar(1,1,0);
			Thread.sleep(5000);
			JourneyScreenOnePANOCR.prePopulationPanOCR();
			JourneyScreenOnePANOCR.setMobNumber(1,1,2);
			JourneyScreenOnePANOCR.setEmailId(1,1,3);
			JourneyScreenOnePANOCR.setPreIssuanceNumber(1,1,4);
			JourneyScreenOnePANOCR.clickProceed();
			Thread.sleep(4000);
			JourneyScreenOnePANOCR.checkPrePopulatedDataAfterPANOCR();
		 	}
		catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
	 		}
        }	
	
	
	

	
	
	



}