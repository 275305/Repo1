package com.test.fulfilment;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
public class JourneyScreenThreeTest extends ReusableActions{
	
	 @BeforeClass
	    public void launchBrowser() throws Exception{
		 try {
	  //  System.setProperty("webdriver.chrome.driver",".\\lib\\Drivers\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sp104\\Desktop\\code backup\\qa\\lib\\Drivers\\chromedriver.exe");
		PageFactory.initElements(driver, JourneyScreenThree.class);
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
					
					//JourneyScreenOne.setAadhar(1,1,0);
					JourneyScreenOne.clickDonthaveAadhar();
					JourneyScreenOne.neverApplied();
					JourneyScreenOne.jammuKashmir();
					JourneyScreenOne.popupProceedButton();
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
			
			@Test(priority = 2, enabled=false)
		    public void screenTwoProceedButtonEnablility() throws Exception{
			try {
			JourneyScreenTwo.isProceedEnabled();
			}catch(Exception e) 
			{
				logger.error("Test case failed: " + e.getMessage());
				throw e;
			}
			}
		        
			
       @Test(priority = 3, enabled=true)
       public void fillingAllTheRequiredFeildForScreen3() throws Exception{
    	   PageFactory.initElements(driver, JourneyScreenTwo.class);
    	   try {
    		  
    	     JourneyScreenTwo.setFirstName(3, 1, 0);
    		 JourneyScreenTwo.setLastName(3, 1, 1);
       		JourneyScreenThree.currentDatePicker();
    		JourneyScreenTwo.selectByDropdown();
    		Thread.sleep(1000);
    		JourneyScreenTwo.setHouseNo(3, 1, 3);
    		JourneyScreenTwo.setRoadNo(3, 1, 4);
    		JourneyScreenTwo.setVillageTown(3, 1, 5);
    		JourneyScreenTwo.setCountry(3, 1, 6);
    		JourneyScreenTwo.setState(3, 1, 7);
    		JourneyScreenTwo.setCity(3, 1, 8);
    		JourneyScreenTwo.setPinCode(3, 1, 9);
    		JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
    		JourneyScreenTwo.traditional();
    		JourneyScreenTwo.selectByDropdownCancerInsurancePlan();
    		Thread.sleep(1000);
    		JourneyScreenTwo.fillingAllTheRequiredFeildsToReachThirdScreen();
    		JourneyScreenTwo.clickSubmitButton();
    	   }catch(Exception e) {
    		   logger.error("Test case failed " + e.getMessage());
				throw e; 
    		   
    	   
    	   }}
    	
       
       @Test(priority = 4, enabled=true)
	   public void isPayorDetailsNoOptionSelectedByDefault() throws Exception
	   {
	  PageFactory.initElements(driver, JourneyScreenThree.class);
	   try {
		   JourneyScreenTwo.clickSubmitButton();
		   waitTillPageLoaded(driver);
		   waitTillElementLocated(JourneyScreenThree.payorDetailsNo);
		   JourneyScreenThree.isPayorDetailsNoOptionSelectedByDefault();
		   
	   }
	   catch(Exception e) {
		   logger.error("Test case failed " + e.getMessage());
			throw e; 
		   
	   }
	   
	   }	
       
   //Ful2-140 Nominee Details section    
    	   @Test(priority = 5, enabled=true)
    	   public void PayorDetailsSection() throws Exception
    	   {
    	  PageFactory.initElements(driver, JourneyScreenThree.class);
    	   try {
    		   JourneyScreenThree.nomineeNamePositiveValidation(4, 1, 1);
    		   JourneyScreenThree.checkTheDateOfBirthFormatAndFutureDateRestrictions();
    		   JourneyScreenThree.checkGenderMaleFemaleOption();
    		   JourneyScreenThree.checkRelationshipWithNomineeDropDownvalues();
    		   JourneyScreenThree.otherIsSelectedThen2MoreTextFieldsWillOen();
    		  
    	   }
    	   catch(Exception e) {
    		   logger.error("Test case failed " + e.getMessage());
				throw e; 
    		   
    	   }
    	   
    	   }	
    	  
 //Ful2-152 bank details section   	   
    	   @Test(priority = 6, enabled=true)
    	   public void bankDetailsSection() throws Exception
    	 
    	   {
    		   try {
    			   PageFactory.initElements(driver, JourneyScreenThree.class);
    		    	  JourneyScreenThree.iFCPositiveAndNegativeValidation(4, 1, 2);
    		    	  JourneyScreenThree.mICRPositiveAndNegativeValidation(4, 1, 3);
    		    	  JourneyScreenThree.bankNamePositiveNegativeValidation(4, 1, 4);
    		    	  JourneyScreenThree.bankBranchPositiveNegativeValidation(4, 1, 4);
    		    	  JourneyScreenThree.bankAccountPositiveNegativeValidation(4,1,5);
    		    	  JourneyScreenThree.accountHoldersNamePositiveNegativeValidation(4, 1, 6);
    	   }
    	   catch(Exception e) {
    		   logger.error("Test case failed " + e.getMessage());
				throw e; 
    		   
    	   }
    	   
    	   }

}