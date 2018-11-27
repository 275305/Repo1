package WebTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.ReusableActions;
import uielements.loginpage;

public class JourneyScreenOneTest extends ReusableActions{

	@BeforeTest
	@Parameters(value = { "browser", "version", "platform","testrun"})
	public void setUp(String browser, String version, String platform,String testrun) throws Exception {
		String testRun= testrun;
		/*String testRun1=testrun1;*/
		if (testRun.equals("run"))
			//if (testRun.equals("runbsw"))
			{
			
			try {
				DesiredCapabilities capability = new DesiredCapabilities();
				capability.setCapability("platform", platform);
				capability.setCapability("browserName", browser);
				capability.setCapability("browserVersion", version);
				// capability.setCapability("browserstack.local", "true");
				capability.setCapability("browserstack.debug", "true");
				capability.setCapability("project", "MaxlifeInsurance");
				capability.setCapability("build", "BrowserStack_WebSeries1");
				driver = new RemoteWebDriver(
						new URL("https://kanchangupta2:xWbVkws9u8oEYR1Nsqx6@hub-cloud.browserstack.com/wd/hub"),
						capability);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				ReusableActions.logStep("=========Execution Started on Browsers=========");
				System.out.println("Execution Started on : " + browser + " " + version + " " + platform);
				ReusableActions.attachScreen(driver);
			} catch (Exception e) {
				//System.out.println("Test case failed: " + e.getMessage());
				throw e;
			}
			//break;
		}
			
		else
			if(testRun.equals("runfa"))
			//if(testRun.equals("run")) {
			// @BeforeClass
			//public void launchBrowser() throws Exception{

			try {
				//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "C:\\Matrix\\AutomationQA\\automationqa\\src\\test\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				//logger.error("Test case failed: " + e.getMessage());
				throw e;
			}

		}
	
	 
	 
	//TC -01 Verify the by default status of Nationality, Policy for and Proceed button on Journey Screen one
		@Test(priority = 0, enabled=true)
	    public void Indian() throws Exception{
			try{
				prop = ReusableActions.readProperties();

			 	driver.get(prop.getProperty("SampleURL"));
			 	loginpage.verifyloginpage();
			 			
			 	// Maximizing the browser window
			 	driver.manage().window().maximize();
			 	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			 	logger.info("Fulfilment URL opened successfully");
			 	
			 	loginpage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			 	logger.info("User logged in successfully");
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
			@Test(priority = 1, enabled=false)
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
					JourneyScreenOne.optionNRI();
					JourneyScreenOne.setPassportNumber(1,1,5);
					JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
					JourneyScreenThree.currentDatePicker();
					JourneyScreenOne.passportIssuingCountry(1, 1, 6);
					JourneyScreenOne.setAadhar(1,1,0);
					JourneyScreenOne.setPanNumber(1,1,1);
					JourneyScreenOne.isdCode(1, 1, 7);
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
			
			//Test case---> describing all the fields are present on the screen first when NRI is selected.
			 
			@Test(priority = 3, enabled=false)
		    public void checkNRIFeildsDisabled() throws Exception{
				try{
					HomePage.clickDashboard();
					HomePage.clickNewApp();
					JourneyScreenOne.isAllTheFeildsOfNRIDisplayed();
			
			 // Test case---> drop down list for visa when NRI is selected on first screen.
			 
					JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
				 	}
				catch (Exception e) {
					logger.error("Test case failed: " + e.getMessage());
					throw e;
			 		}
		        }	

			
			public void checkInsurersDetailsIsPresentOnScreenSelectingDependent() throws Exception{
				try{
					HomePage.clickDashboard();
					HomePage.clickNewApp();
					JourneyScreenOne.dependentOption();
					//JourneyScreenOne.clickDonthaveAadhar();
					//JourneyScreenOne.neverApplied();
					//JourneyScreenOne.jammuKashmir();
					//JourneyScreenOne.popupProceedButton();
					JourneyScreenOne.dontHavePAN();
					JourneyScreenOne.setMobNumber(1,1,2);
					JourneyScreenOne.setEmailId(1,1,3);
					JourneyScreenOne.setPreIssuanceNumber(1,1,4);
					JourneyScreenOne.clickProceed();
					JourneyScreenOne.checkIsurersDetailsIsPresent();
					JourneyScreenTwo.setFirstName(3, 1, 0);
					JourneyScreenTwo.setLastName(3, 1, 1);
				    JourneyScreenTwo.setDateBirthPersonalDetails();
					JourneyScreenTwo.selectByDropdown();
					JourneyScreenTwo.setHouseNo(3, 1, 3);
					JourneyScreenTwo.setRoadNo(3, 1, 4);
					JourneyScreenTwo.setVillageTown(3, 1, 5);
					JourneyScreenTwo.setCountry(3, 1, 6);
					JourneyScreenTwo.setState(3, 1, 7);
					JourneyScreenTwo.setCity(3, 1, 8);
					JourneyScreenTwo.setPinCode(3, 1, 9);
					JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);}
					catch (Exception e) {
						logger.error("Test case failed: " + e.getMessage());
						throw e;
				 		}
				}
			
			
			public void bankDetailsSectionFillingData() throws Exception

			{
				try {
					Thread.sleep(500);
					PageFactory.initElements(driver, JourneyScreenThree.class);
					JourneyScreenThree.setIFCPositive(4, 1, 2);
					JourneyScreenThree.setMICR(4, 1, 3);
					JourneyScreenThree.setBankAccountNumber(4, 1, 5);
					JourneyScreenThree.setAccountHoldersName(4, 1, 6);
					JourneyScreenThree.typeOfAccountOptionSelectionInsurer();
					
				} catch (Exception e) {
					logger.error("Test case failed " + e.getMessage());
					throw e;

				}}
			
			public void personalDetailsSection() throws Exception

			{
				try {
					Thread.sleep(500);
					JourneyScreenTwo.fathersName(9, 1, 0);
					JourneyScreenTwo.mothersName(9, 1, 1);
					JourneyScreenTwo.maritalStatusOptionSelection();
					JourneyScreenTwo.educationDropDownOptionList();
					JourneyScreenTwo.industryDropDownOptionSelection();
					JourneyScreenTwo.organizationTypeOptionSelection();
					JourneyScreenTwo.occupationOptionSelection();
				} catch (Exception e) {
					logger.error("Test case failed " + e.getMessage());
					throw e;

				}

			}
			
	//Test case---> describing Insurers details on screen two and three,Select dependent on first screen.
			@Test(priority = 4, enabled=false)
		    public void checkInsurersDetailsIsPresent() throws Exception{
				try{
					checkInsurersDetailsIsPresentOnScreenSelectingDependent();
					JourneyScreenOne.checkAllTheInsurersDetailsFeildsPresentOrNot();
					JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
					JourneyScreenOne.insurersGenderFemale();
					JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
					//Test case--> describing the dropDown list of relationship with proposer First screen--Select dependent and check on Insurers Details section
					JourneyScreenOne.selectAndCheckRelationshipWithProposerOption();
					JourneyScreenTwo.traditional();
					JourneyScreenTwo.selectByDropdownCancerInsurancePlan();
					Thread.sleep(1000);
					JourneyScreenTwo.fillingAllTheRequiredFeildsForCIPIsurersDetails();
					JourneyScreenTwo.clickSubmitButton();
					JourneyScreenThree.generatingPDFToReachToScreenThree();
					JourneyScreenOne.insureresOtherDetailsIsPresent();
					//JourneyScreenOne.feildSupressFuctionalityInsurersDetails();
					JourneyScreenOne.checkAllTheIsurersDetailsFeildsIsPresentForScreenThree();
				    JourneyScreenOne.checkAllTheIsurersDetailsFeildsDropDownListIsPresentForScreenThree();
				 	}
				catch (Exception e) {
					logger.error("Test case failed: " + e.getMessage());
					throw e;
			 		}
		        }
			
			
			@Test(priority = 4, enabled=true)
		    public void insurerDetailsFillingAllTheFeildsToReachScreenFourSelectingDependent() throws Exception{
				try{
					checkInsurersDetailsIsPresentOnScreenSelectingDependent();
					//JourneyScreenOne.feildSupressFuctionalityInsurersDetails();
					JourneyScreenOne.fllIssurersNameValidation(1, 1, 8);
					JourneyScreenOne.insurersGenderFemale();
					JourneyScreenThree.fillDateBirthInsurersDetails(1, 1, 9);
					JourneyScreenOne.selectkRelationshipWithProposerOption();
					JourneyScreenTwo.traditional();
					JourneyScreenTwo.selectByDropdownCancerInsurancePlan();
					Thread.sleep(1000);
					JourneyScreenTwo.fillingAllTheRequiredFeildsForCIPIsurersDetails();
					JourneyScreenTwo.clickSubmitButton();
					JourneyScreenThree.generatingPDFToReachToScreenThree();
					JourneyScreenOne.isurersDetailsFeildsDropDownForScreenThree();
				    bankDetailsSectionFillingData();
				    personalDetailsSection();
				    JourneyScreenOne.annualIncomePersonalDetailsDependent();
				    
				 	}
				catch (Exception e) {
					logger.error("Test case failed: " + e.getMessage());
					throw e;
			 		}
		        }

}
