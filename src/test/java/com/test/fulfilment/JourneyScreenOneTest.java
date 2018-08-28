package com.test.fulfilment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenTwo;
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
				Thread.sleep(2000);
				JourneyScreenOne.isIndianSelected();
				Thread.sleep(2000);
				JourneyScreenOne.isSelfSelected();
				Thread.sleep(2000);
				JourneyScreenOne.isProceedEnabled();
				
				}
			catch (Exception e) {
				logger.error("Test case failed: " + e.getMessage());
				throw e;
		 		}
	        }	
	 
		
		
		//TC -02 Test case for entering invalid OTP and click at Ok button
		@Test(priority = 1, enabled=true)
	    public void InvalidAadharTest() throws Exception{
			try{
				
				Thread.sleep(2000);
				JourneyScreenOne.setAadhar(1,1,0);
				Thread.sleep(2000);
				JourneyScreenOne.clickGetOTP();
				
				
				JourneyScreenOne.verifyInvalidAadharPage();
				Thread.sleep(2000);
				JourneyScreenOne.ClickInvalidAadharOk();
				
			
				
									
			 	}
			catch (Exception e) {
				logger.error("Test case failed: " + e.getMessage());
				throw e;
		 		}
	        }	
		
		
		//TC -03 Test case for entering invalid OTP and click at Ok button
		@Test(priority = 2, enabled=true)
	    public void InvalidOTPTest() throws Exception{
			try{
				Thread.sleep(2000);
				JourneyScreenOne.setAadhar(1,2,0);
				Thread.sleep(2000);
				JourneyScreenOne.clickGetOTP();
				Thread.sleep(2000);
				JourneyScreenOne.verifyOtpPage();
				Thread.sleep(2000);
				JourneyScreenOne.setOTPfld1(4, 1, 0);
				Thread.sleep(2000);
				JourneyScreenOne.setOTPfld2(4, 1, 1);
				Thread.sleep(2000);
				JourneyScreenOne.setOTPfld3(4, 1, 2);
				Thread.sleep(2000);
				JourneyScreenOne.setOTPfld4(4, 1, 3);
				Thread.sleep(2000);
				JourneyScreenOne.setOTPfld5(4, 1, 4);
				Thread.sleep(2000);
				JourneyScreenOne.setOTPfld6(4, 1, 5);
				Thread.sleep(2000);
				
				JourneyScreenOne.verifyInvalidOtpPage();
				Thread.sleep(2000);
				JourneyScreenOne.ClickInvalidOTPOK();
				Thread.sleep(2000);
				JourneyScreenOne.ClickMaxLogo();
				
				//driver.findElement(By.xpath("//a[@class='Logo__logohead__2fZWZ']")).click();
				
				
				/*JourneyScreenOne.setOTPfld1(3, 1, 0);
				JourneyScreenOne.setOTPfld2(3, 1, 1);
				JourneyScreenOne.setOTPfld3(3, 1, 2);
				JourneyScreenOne.setOTPfld4(3, 1, 3);
				JourneyScreenOne.setOTPfld5(3, 1, 4);
				JourneyScreenOne.setOTPfld6(3, 1, 5);
				
				JourneyScreenOne.verifyInvalidOtpPage();
				JourneyScreenOne.ClickInvalidOTPProceed();*/
				
				//driver.switchTo();	
			 	}
			catch (Exception e) {
				logger.error("Test case failed: " + e.getMessage());
				throw e;
		 		}
	        }	

	//TC -04 Test case for positive value for saving the first screen data
			@Test(priority = 3, enabled=true)
		    public void ScreenOneTestIndian() throws Exception{
				try{
					
					JourneyScreenOne.clearAadhar();
					Thread.sleep(2000);
					JourneyScreenOne.clickDonthaveAadhar();
					Thread.sleep(2000);
					JourneyScreenOne.neverApplied();
					Thread.sleep(2000);
					JourneyScreenOne.jammuKashmir();
					Thread.sleep(2000);
					JourneyScreenOne.popupProceedButton();
					Thread.sleep(2000);
					JourneyScreenOne.setPanNumber(1,1,1);
					Thread.sleep(2000);
					JourneyScreenOne.setMobNumber(1,1,2);
					Thread.sleep(2000);
					JourneyScreenOne.setEmailId(1,1,3);
					Thread.sleep(2000);
					JourneyScreenOne.setPreIssuanceNumber(1,1,4);
					Thread.sleep(2000);
					JourneyScreenOne.clickProceed();
					
				 	}
				catch (Exception e) {
					logger.error("Test case failed: " + e.getMessage());
					throw e;
			 		}
		        }	
			
			
			@Test(priority = 4, enabled=true)
			   public void screenTwoProceedButtonClickability() throws Exception{
				   try {
					   Thread.sleep(2000);
					JourneyScreenTwo.setFirstName(3, 1, 0);
					Thread.sleep(2000);
					JourneyScreenTwo.setLastName(3, 1, 1);
					JourneyScreenTwo.setHouseNo(3, 1, 3);
					Thread.sleep(2000);
					JourneyScreenTwo.setRoadNo(3, 1, 4);
					Thread.sleep(2000);
					JourneyScreenTwo.setVillageTown(3, 1, 5);
					Thread.sleep(2000);
					JourneyScreenTwo.setCountry(3, 1, 6);
					Thread.sleep(2000);
					JourneyScreenTwo.setState(3, 1, 7);
					Thread.sleep(2000);
					JourneyScreenTwo.setCity(3, 1, 8);
					Thread.sleep(2000);
					JourneyScreenTwo.setPinCode(3, 1, 9);
					Thread.sleep(2000);
					JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
					Thread.sleep(2000);
					JourneyScreenTwo.clickSubmitButton();
				   }catch(Exception e) {
					   logger.error("Test case failed " + e.getMessage());
						throw e; 
					   
				   
				   }
			}
				
			
			
	
	

}
