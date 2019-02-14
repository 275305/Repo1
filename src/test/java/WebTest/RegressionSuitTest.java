package WebTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.POSVFlowForSAPMIAP;
import uielements.ReusableActions;

public class RegressionSuitTest extends ReusableActions {

	@BeforeTest

	@Parameters(value = { "browser", "version", "platform", "testrun" })
	public void setUp(String browser, String version, String platform, String testrun) throws Exception {
		String testRun = testrun;
		/* String testRun1=testrun1; */
		//if (testRun.equals("run"))
		 if (testRun.equals("runbsw"))
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
				// System.out.println("Test case failed: " + e.getMessage());
				throw e;
			}
			// break;
		}

		else
			//if (testRun.equals("runfa"))
			 if (testRun.equals("run"))
			// @BeforeClass
			// public void launchBrowser() throws Exception{

			try {

				// System.setProperty("webdriver.chrome.driver",
				// "D:\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver",
						"C:\\Matrix\\AutomationQA\\automationqa\\src\\test\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				// logger.error("Test case failed: " + e.getMessage());
				throw e;
			}

	}

	@Test(priority = 0, enabled = false)
	public void testLoginFunctionalityWithMultipeData() throws Exception {
		try {
			logger.info("Test Started");
			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();
			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");
			LoginPage.Login_Neg();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// TC -01 Verify the by default status of Nationality, Policy for and Proceed
	// button on Journey Screen one
	@Test(priority = 1, enabled = true)
	public void loginApplicationTest() throws Exception {
		try {
			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();
			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");
			LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}


	@Test(priority = 2, enabled = true)
	public void indianSelfByDefaultSelectedAndProceedEnabled() throws Exception {
		try {
			HomePage.clickDashboard();
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
	@Test(priority = 3, enabled = true)
	public void ScreenOneTestIndianToScreenTwo() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.setAadhar(1, 1, 0);
			JourneyScreenOne.setPanNumber(1, 1, 1);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 4, enabled = true)
	public void ScreenOneTestIndianMultipleData() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.checkAdhaarErrorMsgMultipleDataIndian();
			JourneyScreenOne.checkPANErrorMsgWithMultipleData();
			JourneyScreenOne.checkPhoneNumberErrorMsgWithMultipleData();
			JourneyScreenOne.checkEmailErrorMsgWithMultipleDataIndian();
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// TC -02 Test case for positive value for saving the first screen data
	@Test(priority = 5, enabled = true)
	public void ScreenOneTestNRIWithMultipleDataValidation() throws Exception {
		try {

			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.residentialsStatusNRI();
			JourneyScreenOne.nationalityNRI();
			JourneyScreenOne.setPassportNumber(1, 1, 5);
			JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
			JourneyScreenOne.visaValidTillMultipleData();
			JourneyScreenOne.passportIssuingCountry(1, 1, 6);
			JourneyScreenOne.passportExpiryDateMultiple();
			JourneyScreenOne.checkAdhaarErrorMsgMultipleDataNRI();
			JourneyScreenOne.checkPANErrorMsgWithMultipleData();
			// JourneyScreenOne.isdCode(1, 1, 7);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.checkEmailErrorMsgWithMultipleDataNRI();
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	public void ScreenOneTestNRIFunctionToReachScreenTwo() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.residentialsStatusNRI();
			JourneyScreenOne.setPassportNumber(1, 1, 5);
			JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
			JourneyScreenOne.visaValidTillSingleData();
			JourneyScreenOne.passportIssuingCountry(1, 1, 6);
			JourneyScreenOne.passportExpiryDateForSingleData();
			JourneyScreenOne.setAadhar(1, 0, 1);
			JourneyScreenOne.setPanNumber(1, 1, 1);
			JourneyScreenOne.isdCode(1, 1, 7);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// Test case---> describing all the fields are present on the screen first when
	// NRI is selected.

	@Test(priority = 6, enabled = true)
	public void checkNRIFeildsDisabled() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.isAllTheFeildsOfNRIDisplayed();

			// Test case---> drop down list for visa when NRI is selected on first screen.

			JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 7, enabled = true)
	public void checkInsurersDetailsIsPresentAndFillingTheDetailsScreenTwo() throws Exception {
		try {
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.checkAllTheInsurersDetailsFeildsPresentOrNot();
			JourneyScreenTwo.checkAndFillIssurersNameValidation(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.checkDateOfBirthFormatFutureDateRestrictionSetDateBirthInsurersDetails(1, 1, 9);
			// Test case--> describing the dropDown list of relationship with proposer First
			// screen--Select dependent and check on Insurers Details section
			JourneyScreenTwo.selectAndCheckRelationshipWithProposerOption();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 8, enabled = true)
	public void asNomineeIsMinorProvideGuardianNameDetails() throws Exception {
		JourneyScreenThree.currentDatePicker();
		JourneyScreenThree.asNomineeIsMinorProvideGuardianname();

	}

	@Test(priority = 10, enabled = true)
	public void CheckproductConfigrationCancerAndPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
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

	/*
	 * Test case:-To check PDF is generating or not for SUPER TERM PLAN
	 */
	@Test(priority = 11, enabled = true)
	public void CheckproductConfigrationSTPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTP();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	/*
	 * Test case:-To check PDF is generating or not for MAX LIFE MONTHLY INCOME
	 * ADVANTAGE PLAN
	 */
	@Test(priority = 12, enabled = true)
	public void CheckproductConfigrationMIAPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForMIAP();
			JourneyScreenTwo.premiumCommitmentDesiredAnnualIncomeAnnualIncome();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 13, enabled = true)
	public void CheckproductConfigrationWLSGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownWLS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForWLS();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 14, enabled = true)
	public void CheckproductConfigrationSAPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
			JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 15, enabled = true)
	public void CheckproductConfigrationFTSPUlipGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSP();
			// JourneyScreenTwo.clickSubmitButton();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	/*
	 * Test case:-To check whether all the fields for all the traditional product is
	 * present or not MAX LIFE SUPER TERM PLAN MAX LIFE MONTHLY INCOME ADVANTAGE
	 * PLAN MAX LIFE CANCER INSURANCE PLAN MAX LIFE WHOLE LIFE INSURANCE MAX LIFE
	 * SAVINGS ADVANTAGES PLAN
	 */

	@Test(priority = 16, enabled = false)
	public void checkingAllTheFeildsForTraditionalProduct() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownTradAllProduct();
			/*
			 * JourneyScreenTwo.setFirstName(3, 1, 0); JourneyScreenTwo.setLastName(3, 1,
			 * 1); JourneyScreenTwo.setDateBirthPersonalDetails(1, 1, 9);
			 * JourneyScreenTwo.selectByDropdown(); Thread.sleep(1000);
			 * JourneyScreenTwo.setHouseNo(3, 1, 3); JourneyScreenTwo.setRoadNo(3, 1, 4);
			 * JourneyScreenTwo.setVillageTown(3, 1, 5); JourneyScreenTwo.setCountry(3, 1,
			 * 6); JourneyScreenTwo.setState(3, 1, 7); JourneyScreenTwo.setCity(3, 1, 8);
			 * JourneyScreenTwo.setPinCode(3, 1, 9);
			 * JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
			 * //JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
			 * //JourneyScreenOne.insurersGender();
			 * //JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
			 * //JourneyScreenOne.selectAndCheckRelationshipWithProposerOption();
			 * JourneyScreenTwo.traditional();
			 */
			// fillingAllTheRequiredFeildForScreen3();

			// JourneyScreenTwo.selectByDropdownCIP();
			// Thread.sleep(1000);
			// JourneyScreenTwo.fillingAllTheRequiredFeildsForScreenThree();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 17, enabled = false)
	public void checkingAllTheFeildsForULIPProduct() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownUlipAllProduct();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}


	@Test(priority = 18, enabled = false)
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
	@Test(priority = 19, enabled = false)
	public void PayorDetailsSection() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		try {
			JourneyScreenThreeTest.personalDetailsbankDetailsScreenThreeReachingFunction();
			JourneyScreenThree.nomineeNamePositiveValidation(4, 1, 6);
			JourneyScreenThree.checkTheDateOfBirthFormatAndFutureDateRestrictionsNomineeDetails();
			JourneyScreenTwo.setDateBirthNomineeDetails();
			JourneyScreenThree.checkGenderMaleFemaleOption();
			JourneyScreenThree.checkRelationshipWithNomineeDropDownvalues();
			JourneyScreenThree.otherIsSelectedThen2MoreTextFieldsWillOen();
			JourneyScreenThree.relationshipWithNomineeWhenOther(4, 1, 1);
			JourneyScreenThree.ReasonForNomination(4, 4, 1);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 20, enabled = false)
	public void bankDetailsSection() throws Exception

	{
		try {
			JourneyScreenThreeTest.personalDetailsbankDetailsScreenThreeReachingFunction();
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

	@Test(priority = 21, enabled = false)
	public void personalDetailsSectionFeildsValidation() throws Exception

	{
		try {
			JourneyScreenThreeTest.personalDetailsbankDetailsScreenThreeReachingFunction();
			JourneyScreenThree.isAllTheRequiredFeildIsPresentAsPerPersonalDetailsSectionWithoutDependent();
			JourneyScreenThree.setFathersName(9, 1, 0);
			JourneyScreenThree.setMothersName(9, 1, 1);
			JourneyScreenThree.maritalStatusDropDownListValidation();
			JourneyScreenThree.educationDropDownListValidation();
			JourneyScreenThree.industryDropDownListValidation();
			JourneyScreenThree.industryDropDownListOptionSelectionValidation();
			JourneyScreenThree.organizationTypeDropDownListValidation();
			JourneyScreenThree.occupationDropDownListValidation();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 22, enabled = false)
	public void reachingScreenFourAndMultipleDataValidationForAnnualIncome() throws Exception

	{
		try {
			JourneyScreenThreeTest.personalDetailsbankDetailsScreenThreeReachingFunction();
			JourneyScreenThreeTest.proposerPersonalDetailsSection();
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.annualIncomePersonalDetailsDependent();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 23, enabled = false)
	public void EIAScreeenFourValidation() throws Exception

	{
		try {
			JourneyScreenThreeTest.fillingPersonalDetailsFunction();
			JourneyScreenThree.EIAYesOptionSelectionFeildsPresent();
			JourneyScreenThree.providentExistingEInsuranceAccountNumberFeildsValidation();
			JourneyScreenThree.openNewEInsuranceAccountNumberFeildValidation();
			JourneyScreenThree.politicallypowerNoClick();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 24, enabled = false)
	public void payorDetailsFeildsIsPresentAndValidation() throws Exception

	{
		try {
			JourneyScreenThreeTest.fillingPersonalDetailsFunction();
			JourneyScreenThree.payorDetailsFeildsIsPresent();
			JourneyScreenThree.payorDetailsYesOptionSelectedCheckFeilds();
			JourneyScreenThree.payorDetailsYesOptionSelectedFeildsValidation(3, 1, 0);
			JourneyScreenThree.setDateBirthPayorDetails(1, 1, 9);
			JourneyScreenThree.maleOptionSelectedByDefaultPayorDetails();
			JourneyScreenThree.adressPayorDetailsCheckValidation(3, 1, 3);
			JourneyScreenThree.setState(3, 1, 7);
			JourneyScreenThree.annualIncome(0, 1, 8);
			JourneyScreenThree.payorAadhaarWhenYesOptionSelected(1, 1, 0);
			JourneyScreenThree.dontHavePANPayorDetails();
			JourneyScreenThree.relationshipPayorWithProposerPayorDetailsDropDownValidation();
			JourneyScreenThree.isPayorDifferentFromProposerNo();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 25, enabled = false)
	public void checkInsurersDetailsIsPresentAndFeildsValidationScreenThree() throws Exception {
		try {
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			// JourneyScreenTwo.checkAllTheInsurersDetailsFeildsPresentOrNot();
			JourneyScreenTwo.checkAndFillIssurersNameValidation(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.setDateBirthInsurersDetails(1, 1, 9);
			// Test case--> describing the dropDown list of relationship with proposer First
			// screen--Select dependent and check on Insurers Details section
			JourneyScreenTwo.selectAndCheckRelationshipWithProposerOption();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownCancerInsurancePlan();
			Thread.sleep(1000);
			JourneyScreenTwo.fillingAllTheRequiredFeildsForCIPIsurersDetails();
			JourneyScreenTwo.clickSubmitButton();
			JourneyScreenTwo.generatingPDFToReachToScreenThree();
			JourneyScreenThree.insureresOtherDetailsIsPresent();
			// JourneyScreenOne.feildSupressFuctionalityInsurersDetails();
			JourneyScreenThree.checkAllTheIsurersDetailsFeildsIsPresentForScreenThree();
			JourneyScreenThree.checkAllTheIsurersDetailsFeildsDropDownListIsPresentForScreenThree();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 26, enabled = false)
	public void insurerDetailsFillingAllTheFeildsToReachScreenFourSelectingDependent() throws Exception {
		try {
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			// JourneyScreenOne.feildSupressFuctionalityInsurersDetails();
			JourneyScreenTwo.fllIssurersNameValidation(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.fillDateBirthInsurersDetails(1, 1, 9);
			JourneyScreenTwo.selectkRelationshipWithProposerOption();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownCancerInsurancePlan();
			Thread.sleep(1000);
			JourneyScreenTwo.fillingAllTheRequiredFeildsForCIPIsurersDetails();
			JourneyScreenTwo.clickSubmitButton();
			JourneyScreenTwo.generatingPDFToReachToScreenThree();
			JourneyScreenThree.isurersDetailsFeildsDropDownForScreenThree();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThreeTest.personalDetailsSection();
			JourneyScreenThree.annualIncomePersonalDetailsDependent();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 27, enabled = false)
	public void lifeStyleScreeenFourValidation() throws Exception

	{
		try {
			JourneyScreenThreeTest.fillingPersonalDetailsFunction();
			JourneyScreenFour.arrowDownFunctionToScrollDown();
			// JourneyScreenThree.lifestyleFeildsValidation();
			// JourneyScreenThree.lifestyleFeildsValidationForYes();
			// JourneyScreenThree.FeildsValidationHazardousForYes();
			JourneyScreenFour.selectCriminalChargesNo();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5();
			JourneyScreenFour.arrowUpFunctionToScrollUpTillTop();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectOption();
			JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			JourneyScreenFour.setDateBirthdateOfApplicationWithoutValidation();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 28, enabled = false)
	public void reachingScreenFourFillingAnnualIncomeform60RelatedDetailsFeilds() throws Exception

	{
		try {
			JourneyScreenThreeTest.reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameDropDownValidation();
			JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation();
			JourneyScreenFour.fillPanApplicationAcknowledgeNo();
			JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
			JourneyScreenFour.iAmExemptFromRequirementOfPANUnderFollowingProvisionsSelectFeildsValidation();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}
	
	@Test(priority = 29, enabled = false)
	public static void checkPOSVFlowForSAPWithMutipleFirstNameForSelf() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {
			POSVFlowForSAPMIAP.posvForSAPMultipleFirstNameTestForSelf();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 30, enabled = false)
	public static void checkPOSVFlowForMIAPWithMutipleFirstNameForSelf() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {
			POSVFlowForSAPMIAP.posvForMIAPMultipleFirstNameTestForSelf();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 31, enabled = false)
	public static void checkPOSVFlowForSAPWithMutipleFirstNameForDependent() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {
			POSVFlowForSAPMIAP.posvForSAPMultipleFirstNameForDependent();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}
