package com.test.fulfilment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
public class JourneyScreenTwoTest extends ReusableActions{
	
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
			
			@Test(priority = 2, enabled=true)
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
       public void LE2ServiceIntegrationForTradProducts() throws Exception{
    	   try {
    		JourneyScreenTwo.setFirstName(3, 1, 0);
    		JourneyScreenTwo.setLastName(3, 1, 1);
    		JourneyScreenThree.datePicker();
    		JourneyScreenTwo.selectByDropdown();
    		Thread.sleep(5000);
    		JourneyScreenTwo.setHouseNo(3, 1, 3);
    		JourneyScreenTwo.setRoadNo(3, 1, 4);
    		JourneyScreenTwo.setVillageTown(3, 1, 5);
    		JourneyScreenTwo.setCountry(3, 1, 6);
    		JourneyScreenTwo.setState(3, 1, 7);
    		JourneyScreenTwo.setCity(3, 1, 8);
    		JourneyScreenTwo.setPinCode(3, 1, 9);
    		JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
    		JourneyScreenTwo.traditional();
    		JourneyScreenTwo.selectByDropdownProductName();
    		Thread.sleep(1500);
    		JourneyScreenTwo.isAllTheRequiredFeildIsPresentAsPerPayorDetailssectionOfSuperTermPlan();
    		Thread.sleep(1500);
    		JourneyScreenTwo.selectByDropdownCancerInsurancePlan();
    		JourneyScreenTwo.isAllTheRequiredFeildIsPresentAsPerPayorDetailssectionofCancerInsurancePlan();
    		JourneyScreenTwo.fillingAllTheRequiredFeildsToReachThirdScreen();
    		JourneyScreenTwo.clickSubmitButton();
    	   }catch(Exception e) {
    		   logger.error("Test case failed " + e.getMessage());
				throw e; 
    		   
    	   
    	   }
    	
    		
    	  
    	   
	

}}