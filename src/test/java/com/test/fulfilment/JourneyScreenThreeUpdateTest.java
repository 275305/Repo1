package com.test.fulfilment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThreeUpdate;
import uielements.JourneyScreenTwoUpdate;
import uielements.LoginPage;

public class JourneyScreenThreeUpdateTest extends ReusableActionsUpdate{
	
	
	@BeforeClass
    public void launchBrowser() throws Exception{
	 try {
    System.setProperty("webdriver.chrome.driver", ".\\lib\\Drivers\\chromedriver.exe");
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
	
	
	//TC -01 Test case for Reaching at Journey screen 3
	@Test(priority = 0, enabled=true)
    public void ScreenOneTestIndian() throws Exception{
		try{
			HomePage.clickNewApp();
			JourneyScreenOne.isIndianSelected();
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
			//Thread.sleep(5000);
			JourneyScreenTwoUpdate.setFirstName(3, 1, 0);
    		JourneyScreenTwoUpdate.setLastName(3, 1, 1);
    		JourneyScreenTwoUpdate.currentDatePicker();
    		JourneyScreenTwoUpdate.selectByDropdown();
    		//Thread.sleep(5000);
    		JourneyScreenTwoUpdate.setHouseNo(3, 1, 3);
    		JourneyScreenTwoUpdate.setRoadNo(3, 1, 4);
    		JourneyScreenTwoUpdate.setVillageTown(3, 1, 5);
    		JourneyScreenTwoUpdate.setCountry(3, 1, 6);
    		JourneyScreenTwoUpdate.setState(3, 1, 7);
    		JourneyScreenTwoUpdate.setCity(3, 1, 8);
    		JourneyScreenTwoUpdate.setPinCode(3, 1, 9);
    		JourneyScreenTwoUpdate.setAlternateMobileNo(3, 1, 10);
    		JourneyScreenTwoUpdate.traditional();
    		JourneyScreenTwoUpdate.selectByDropdownProductName();
    		//Thread.sleep(2000);
    		JourneyScreenTwoUpdate.isAllTheRequiredFeildIsPresentAsPerPayorDetailssectionOfSuperTermPlan();
    		//Thread.sleep(5000);
    		JourneyScreenTwoUpdate.selectByDropdownCancerInsurancePlan();
    		JourneyScreenTwoUpdate.isAllTheRequiredFeildIsPresentAsPerPayorDetailssectionofCancerInsurancePlan();
    		JourneyScreenTwoUpdate.fillingAllTheRequiredFeildsToReachThirdScreen();
    		JourneyScreenTwoUpdate.clickSubmitButton();
			
		 	}
		catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
	 		}
        }	
	
	//TC -02 Test case for verifying landing at Journey screen 3
		@Test(priority = 1, enabled=true)
	    public void VerifyJourneyScreenThreeLanding() throws Exception{
			try{
				JourneyScreenThreeUpdate.verifyJourneyScreenThree();
			}
			
				catch (Exception e) {
					logger.error("Test case failed: " + e.getMessage());
					throw e;
			 		}
		        }	
 

		//TC -03 Test case for entering father name and mother name at Journey screen 3
				@Test(priority = 2, enabled=true)
			    public void EnterFatherName() throws Exception{
					try{
						JourneyScreenThreeUpdate.setFatherName(5, 1, 0);
						JourneyScreenThreeUpdate.setMotherName(5, 1, 1);
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }	
				
				
				//TC -04 Test case for verifying all the option at Marital dropdown at Journey screen 3
				@Test(priority = 3, enabled=true)
			    public void VerifyMaritalStatusList() throws Exception{
					try{
						
						JourneyScreenThreeUpdate.VerifyMaritalList();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }	
		
				
				
				//TC -05 Test case for selecting Single option at Marital dropdown at Journey screen 3
				@Test(priority = 4, enabled=true)
			    public void SelectMaritalStatus() throws Exception{
					try{
						
						JourneyScreenThreeUpdate.setMaritalStatus();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }	
		
				
				
				//TC -06 Test case for verifying all the option at Education dropdown at Journey screen 3
				@Test(priority = 5, enabled=true)
			    public void VerifyEducationList() throws Exception{
					try{
						Thread.sleep(5000);
						JourneyScreenThreeUpdate.VerifyEducation();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }
				
				
				//TC -07 Test case for selecting High School option at Education dropdown at Journey screen 3
				@Test(priority = 6, enabled=true)
			    public void SelectEducation() throws Exception{
					try{
						
						JourneyScreenThreeUpdate.setEducation();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }
				
				
				//TC -08 Test case for entering Income at Journey screen 3
				@Test(priority = 7, enabled=true)
			    public void EnterIncome() throws Exception{
					try{
						JourneyScreenThreeUpdate.setIncome(5, 1, 2);
						
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }	
				
				
				//TC -09 Test case for verifying all the option at Industry Type dropdown at Journey screen 3
				@Test(priority = 8, enabled=true)
			    public void VerifyIndustryTypeList() throws Exception{
					try{
						Thread.sleep(5000);
						JourneyScreenThreeUpdate.VerifyIndustry();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }
				
				

				//TC -10 Test case for selecting Defence option from Industry Type dropdown at Journey screen 3
				@Test(priority = 9, enabled=true)
			    public void SelectIndustryType() throws Exception{
					try{
						
						JourneyScreenThreeUpdate.setIndustryType();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }
				
				
				
				//TC -11 Test case for verifying all the option at Organisation Type dropdown at Journey screen 3
				@Test(priority = 10, enabled=true)
			    public void VerifyOrganisationTypeList() throws Exception{
					try{
						Thread.sleep(5000);
						JourneyScreenThreeUpdate.VerifyOrganisation();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }
				
				

				//TC -12 Test case for selecting Govt option from Organisation Type dropdown at Journey screen 3
				@Test(priority = 11, enabled=true)
			    public void SelectOrganisationType() throws Exception{
					try{
						
						JourneyScreenThreeUpdate.setOrganisationType();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }
				
				
				
				
				//TC -13 Test case for verifying all the option at Occupation dropdown at Journey screen 3
				@Test(priority = 12, enabled=true)
			    public void VerifyOccupationTypeList() throws Exception{
					try{
						Thread.sleep(5000);
						JourneyScreenThreeUpdate.VerifyOccupation();
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }
				
				
				//TC -14 Test case for selecting salaried option from Occupation dropdown at Journey screen 3
				@Test(priority = 13, enabled=true)
			    public void SelectOccupationType() throws Exception{
					try{
						
						JourneyScreenThreeUpdate.setOccupationSalaried();
						JourneyScreenThreeUpdate.setNameofCompany();
						
					}
					
						catch (Exception e) {
							logger.error("Test case failed: " + e.getMessage());
							throw e;
					 		}
				        }
				
				
}
