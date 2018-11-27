package WebTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFComment;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.ReusableActions;
import uielements.loginpage;

public class JourneyScreenThreeTest extends ReusableActions {

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
			//if(testRun.equals("run"))
		{
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
	}
	
	@Test(priority = 0, enabled=true)
    public void India() throws Exception{
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
		 	HomePage.clickDashboard();
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

	// TC -01 Verify the by default status of Nationality, Policy for and Proceed
	// button on Journey Screen one
	@Test(priority = 1, enabled = false)
	public void Indian() throws Exception {
		try {

			HomePage.clickNewApp();
			JourneyScreenOne.isIndianSelected();
			JourneyScreenOne.isSelfSelected();
			JourneyScreenOne.isProceedEnabled();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// TC -02 Test case for positive value for saving the first screen data
	@Test(priority = 2, enabled = false)
	public void ScreenOneTestIndian() throws Exception {
		try {
			// JourneyScreenOne.setAadhar(1,1,0);
			JourneyScreenOne.clickDonthaveAadhar();
			JourneyScreenOne.neverApplied();
			JourneyScreenOne.jammuKashmir();
			JourneyScreenOne.popupProceedButton();
			//JourneyScreenOne.setPanNumber(1, 1, 1);
			JourneyScreenOne.dontHavePAN();
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}
	

	public static void ScreenOneTestIndianFuntn() throws Exception {
		try {

			// JourneyScreenOne.setAadhar(1,1,0);
			//JourneyScreenOne.clickDonthaveAadhar();
			//JourneyScreenOne.neverApplied();
			//JourneyScreenOne.jammuKashmir();
			//JourneyScreenOne.popupProceedButton();
			//JourneyScreenOne.setPanNumber(1, 1, 1);
			JourneyScreenOne.dontHavePAN();
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority =3 , enabled = false)
	public void screenTwoProceedButtonEnablility() throws Exception {
		try {
			JourneyScreenTwo.isProceedEnabled();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	public static void fillingAllTheRequiredFeildForScreen2() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
		    JourneyScreenTwo.setDateBirthPersonalDetails();
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
			//JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
			//JourneyScreenOne.insurersGender();
			//JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
			//JourneyScreenOne.selectAndCheckRelationshipWithProposerOption();
			
		}catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	/*Test case:-To check PDF is generating or not for CANCER INSURANCE PLAN
	*/
	@Test(priority = 4, enabled = false)
	public void CheckproductConfigrationCancerAndPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownCIP();
			Thread.sleep(1000);
			JourneyScreenTwo.fillingAllTheRequiredFeildsForCIP();
			JourneyScreenTwo.clickSubmitButton();
			JourneyScreenThree.checkPDFIsOpenedOrNotCheckMsg();
			
			
			   	   
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}
	
	/*Test case:-To check PDF is generating or not for SUPER TERM PLAN
	*/
	@Test(priority = 5, enabled = false)
	public void CheckproductConfigrationSTPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTP();
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	/*Test case:-To check PDF is generating or not for MAX LIFE MONTHLY INCOME ADVANTAGE PLAN
	*/
	@Test(priority = 6, enabled = false)
	public void CheckproductConfigrationMIAPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForMIAP();
			
			
			  	   
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	@Test(priority = 7, enabled = false)
	public void CheckproductConfigrationWLSGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownWLS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForWLS();
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	@Test(priority = 8, enabled = false)
	public void CheckproductConfigrationSAPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
			
			   	   
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	@Test(priority = 8, enabled = false)
	public void CheckproductConfigrationFTSPUlipGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSP();
			//JourneyScreenTwo.clickSubmitButton();
			   
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	
	
	
	
	
	/*Test case:-To check whether all the fields for all the traditional product is present or not
	*MAX LIFE SUPER TERM PLAN
	*MAX LIFE MONTHLY INCOME ADVANTAGE PLAN
	*MAX LIFE CANCER INSURANCE PLAN
	*MAX LIFE WHOLE LIFE INSURANCE
	*MAX LIFE SAVINGS ADVANTAGES PLAN
	*/
	
	@Test(priority = 9, enabled = false)
	public void checkingAllTheFeildsForTraditionalProduct() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndian();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownTradAllProduct();
			/*JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
		    JourneyScreenTwo.setDateBirthPersonalDetails(1, 1, 9);
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
			//JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
			//JourneyScreenOne.insurersGender();
			//JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
			//JourneyScreenOne.selectAndCheckRelationshipWithProposerOption();
			JourneyScreenTwo.traditional();*/
			//fillingAllTheRequiredFeildForScreen3();
			
			//JourneyScreenTwo.selectByDropdownCIP();
			//Thread.sleep(1000);
			//JourneyScreenTwo.fillingAllTheRequiredFeildsForScreenThree();
			   	   
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	@Test(priority = 9, enabled = false)
	public void checkingAllTheFeildsForULIPProduct() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownULIPAllProduct();
			   	   
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	
	

	@Test(priority = 10, enabled = false)
	public void isPayorDetailsNoOptionSelectedByDefault() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		try {
			JourneyScreenTwo.clickSubmitButton();
			waitTillPageLoaded(driver);
			waitTillElementLocated(JourneyScreenThree.payorDetailsNo);
			JourneyScreenThree.isPayorDetailsNoOptionSelectedByDefault();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	// Ful2-140 Nominee Details section
	@Test(priority = 11, enabled = false)
	public void PayorDetailsSection() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		try {
			personalDetailsbankDetailsScreenThreeReachingFunction();
			JourneyScreenThree.nomineeNamePositiveValidation(4, 1, 6);
			JourneyScreenThree.checkTheDateOfBirthFormatAndFutureDateRestrictionsNomineeDetails();
			JourneyScreenTwo.setDateBirthNomineeDetails(1,1,9);
			JourneyScreenThree.checkGenderMaleFemaleOption();
			JourneyScreenThree.checkRelationshipWithNomineeDropDownvalues();
			JourneyScreenThree.otherIsSelectedThen2MoreTextFieldsWillOen();
			JourneyScreenThree.relationshipWithNomineeWhenOther(4, 1, 1);
			JourneyScreenThree.ReasonForNomination(4,4,1);
			

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	
	
	public void personalDetailsbankDetailsScreenThreeReachingFunction() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownCIP();
			Thread.sleep(1000);
			JourneyScreenTwo.fillingAllTheRequiredFeildsForCIP();
			JourneyScreenTwo.clickSubmitButton();
			JourneyScreenThree.generatingPDFToReachToScreenThree();
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}
	// Ful2-152 bank details section
	@Test(priority = 12, enabled = false)
	public void bankDetailsSection() throws Exception

	{
		try {
			personalDetailsbankDetailsScreenThreeReachingFunction();
			JourneyScreenThree.allTheBankdetailsFeildsIsPresent();
			PageFactory.initElements(driver, JourneyScreenThree.class);
			JourneyScreenThree.iFCPositiveAndNegativeValidation(4, 1, 2);
			JourneyScreenThree.mICRPositiveAndNegativeValidation(4, 1, 3);
			JourneyScreenThree.checkIFSCAndMICRServiceIsValidatedWithTosterMessge();
			JourneyScreenThree.bankNamePrepopulatedDataValidation();
			JourneyScreenThree.bankBranchPrepopulatedDataValidation();
			JourneyScreenThree.bankAccountPositiveNegativeValidation(4, 1, 5);
			JourneyScreenThree.accountHoldersNamePositiveNegativeValidation(4, 1, 6);
			JourneyScreenThree.typeOfAccountOptionSelectionValidation();
			JourneyScreenTwo.bankDetailsFeildsValidation();
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
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
			JourneyScreenThree.typeOfAccountOptionSelection();
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}
	
	

	public void personalDetailsSection() throws Exception

	{
		try {
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
	
	
	
	public void nomineeDetailsWithoutDependentSelection() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		try {
			
			JourneyScreenThree.fillingNomineeName(4, 1, 6);
			JourneyScreenTwo.setDateBirthNomineeDetails(1,1,9);
			JourneyScreenThree.selectNomineeGender();
			JourneyScreenThree.relationshipWithNomineeOptionSelection();			

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}
	
	
	
	
	@Test(priority = 12, enabled = false)
	public void personalDetailsSectionFeildsValidation() throws Exception

	{
		try {
			personalDetailsbankDetailsScreenThreeReachingFunction();
			JourneyScreenTwo.isAllTheRequiredFeildIsPresentAsPerPersonalDetailsSectionWithoutDependent();
			JourneyScreenTwo.setFathersName(9, 1, 0);
			JourneyScreenTwo.setMothersName(9, 1, 1);
			JourneyScreenTwo.maritalStatusDropDownListValidation();
			JourneyScreenTwo.educationDropDownListValidation();
			JourneyScreenTwo.industryDropDownListValidation();
			JourneyScreenTwo.industryDropDownListOptionSelectionValidation();
			JourneyScreenTwo.organizationTypeDropDownListValidation();
			JourneyScreenTwo.occupationDropDownListValidation();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}
	
	
	
	@Test(priority = 12, enabled = false)
	public void reachingScreenFourAndMultipleDataValidationForAnnualIncome() throws Exception

	{
		try {
			personalDetailsbankDetailsScreenThreeReachingFunction();
			personalDetailsSection();
			nomineeDetailsWithoutDependentSelection();
			bankDetailsSectionFillingData();
			JourneyScreenOne.annualIncomePersonalDetailsDependent();
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}
	
	
	public void reachingScreenFourFillingAnnualIncomeFunction() throws Exception

	{
		try {
			personalDetailsbankDetailsScreenThreeReachingFunction();
			personalDetailsSection();
			nomineeDetailsWithoutDependentSelection();
			bankDetailsSectionFillingData();
			JourneyScreenOne.fillingAnnualIncomeTOProceed(0,1,3);
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}
	
	@Test(priority = 12, enabled = false)
	public void reachingScreenFourFillingAnnualIncomeform60RelatedDetailsFeilds() throws Exception

	{
		try {
			reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenThree.form60RelatedDetailsFeildsIsPresent();
			JourneyScreenThree.form60RelatedDetailsIdentityProofNameDropDownValidation();
			JourneyScreenThree.identityProofNumberValidation(0,1,6);
			JourneyScreenThree.identityProofIssuingAuthority();
			JourneyScreenThree.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation();
			JourneyScreenThree.fillPanApplicationAcknowledgeNo();
			JourneyScreenThree.setDateBirthdateOfApplication(1,1,9);
			JourneyScreenThree.iAmExemptFromRequirementOfPANUnderFollowingProvisionsSelectFeildsValidation();
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}
	
	
	
	public void fillingPersonalDetailsFunction() throws Exception

	{
		try {
			reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenThree.form60RelatedDetailsIdentityProofNameOptionSelection();
			JourneyScreenThree.setIdentityProofNumberValidation(0,1,6);
			JourneyScreenThree.identityProofIssuingAuthorityOptionSelection();
			//JourneyScreenThree.fillPanApplicationAcknowledgeNowWithoutValidation();
			//JourneyScreenThree.setDateBirthdateOfApplicationWithoutValidation(1,1,9);
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	
	}

	@Test(priority = 12, enabled = false)
	public void payorDetailsFeildsIsPresentAndValidation() throws Exception

	{
		try {
			fillingPersonalDetailsFunction();
			JourneyScreenThree.payorDetailsFeildsIsPresent();
			JourneyScreenThree.payorDetailsYesOptionSelectedCheckFeilds();
			JourneyScreenThree.payorDetailsYesOptionSelectedFeildsValidation(3,1,0);
			JourneyScreenThree.setDateBirthPayorDetails(1,1,9);
			JourneyScreenThree.maleOptionSelectedByDefaultPayorDetails();
			JourneyScreenThree.adressPayorDetailsCheckValidation(3,1,3);
			JourneyScreenThree.setState(3, 1, 7);
			JourneyScreenThree.annualIncome(0, 1, 8);
			JourneyScreenThree.payorAadhaarWhenYesOptionSelected(1,1,0);
			JourneyScreenThree.dontHavePANPayorDetails();
			JourneyScreenThree.relationshipPayorWithProposerPayorDetailsDropDownValidation();
			JourneyScreenThree.isPayorDifferentFromProposerNo();
			
			
			
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	
	}
	
	@Test(priority = 12, enabled = false)
	public void EIAScreeenFourValidation() throws Exception

	{
		try {
			fillingPersonalDetailsFunction();
			JourneyScreenThree.EIAYesOptionSelectionFeildsPresent();
			JourneyScreenThree.providentExistingEInsuranceAccountNumberFeildsValidation();
			JourneyScreenThree.openNewEInsuranceAccountNumberFeildValidation();
			JourneyScreenThree.politicallypowerNoClick();
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	
	}

	@Test(priority = 12, enabled = true)
	public void lifeStyleScreeenFourValidation() throws Exception

	{
		try {
			fillingPersonalDetailsFunction();
			JourneyScreenThree.arrowDownFunctionToScrollDown();
			JourneyScreenThree.lifestyleFeildsValidation();
			JourneyScreenThree.lifestyleFeildsValidationForYes();
			JourneyScreenThree.FeildsValidationHazardousForYes();
			JourneyScreenThree.selectCriminalChargesNo();
			JourneyScreenThree.feetInchesKgsSelectionToMoveToScreen5();
			JourneyScreenThree.arrowUpFunctionToScrollUpTillTop();
			JourneyScreenThree.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectOption();
			JourneyScreenThree.fillPanApplicationAcknowledgeNowWithoutValidation();
			JourneyScreenThree.setDateBirthdateOfApplicationWithoutValidation();
			JourneyScreenThree.arrowDownFunctionToScrollDownTillBottom();
			
			
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	
	}
	
	
}
