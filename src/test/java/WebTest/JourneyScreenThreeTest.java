package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;
import uielements.HomePage;
import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenSix;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.POSVFlowForSAPMIAP;
import uielements.ReusableActions;
import util.AppConstant;

public class JourneyScreenThreeTest extends ReusableActions {

	@Test(priority = 0, enabled = true)
	public static void India() throws Exception {
		try {
			final String PATH = System.getProperty("user.dir");
			System.setProperty(AppConstant.INPUT_CHROME_DRIVER, PATH + AppConstant.INPUT_WEB_DRIVER);
			driver = new ChromeDriver();
			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");
			// HomePage.clickDashboard();
			// HomePage.clickNewApp();
			// JourneyScreenOne.isIndianSelected();
			// JourneyScreenOne.isSelfSelected();
			// JourneyScreenOne.isProceedEnabled();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// TC -01 Verify the by default status of Nationality, Policy for and
	// Proceed
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
			// JourneyScreenOne.setPanNumber(1, 1, 1);
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

	@Step("Getting information for screen one")
	public static void ScreenOneTestIndianFuntn() throws Exception {
		try {

			// JourneyScreenOne.setAadhar(1,1,0);
			// JourneyScreenOne.clickDonthaveAadhar();
			// JourneyScreenOne.neverApplied();
			// JourneyScreenOne.jammuKashmir();
			// JourneyScreenOne.popupProceedButton();
			//JourneyScreenOne.setPanNumber(1, 1, 1);
			 JourneyScreenOne.dontHavePAN();
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.clickProceed();
			// JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 3, enabled = false)
	public void screenTwoProceedButtonEnablility() throws Exception {
		try {
			JourneyScreenTwo.isProceedEnabled();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Description("Getting the JourneyScreenTwo")
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
			// JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
			// JourneyScreenOne.insurersGender();
			// JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
			// JourneyScreenOne.selectAndCheckRelationshipWithProposerOption();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void fillingAllTheRequiredFeildForScreen2MinMaxAge() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);

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
			// JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
			// JourneyScreenOne.insurersGender();
			// JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
			// JourneyScreenOne.selectAndCheckRelationshipWithProposerOption();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void fillingAllTheRequiredFeildForScreen2AndSelectingFemale() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
			JourneyScreenTwo.selectFemale();
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
			// JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
			// JourneyScreenOne.insurersGender();
			// JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
			// JourneyScreenOne.selectAndCheckRelationshipWithProposerOption();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	/*
	 * Test case:-To check PDF is generating or not for CANCER INSURANCE PLAN
	 */
	@Test(priority = 2, enabled = false)
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

	/*
	 * Test case:-To check PDF is generating or not for SUPER TERM PLAN
	 */
	@Test(priority = 3, enabled = false)
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
			JourneyScreenTwo.sumAssured();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	/*
	 * Test case:-To check PDF is generating or not for MAX LIFE MONTHLY INCOME
	 * ADVANTAGE PLAN
	 */
	@Test(priority = 2, enabled = false)
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
			JourneyScreenTwo.premiumCommitmentDesiredAnnualIncomeAnnualIncome();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 5, enabled = false)
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

		}
	}

	@Test(priority = 6, enabled = false)
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
			JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
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
			// JourneyScreenTwo.clickSubmitButton();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	/*
	 * Test case:-To check whether all the fields for all the traditional
	 * product is present or not MAX LIFE SUPER TERM PLAN MAX LIFE MONTHLY
	 * INCOME ADVANTAGE PLAN MAX LIFE CANCER INSURANCE PLAN MAX LIFE WHOLE LIFE
	 * INSURANCE MAX LIFE SAVINGS ADVANTAGES PLAN
	 */

	@Test(priority = 3, enabled = false)
	public void checkingAllTheFeildsForTraditionalProduct() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			JourneyScreenTwo.traditional();
			// JourneyScreenTwo.selectByDropdownTradAllProduct();
			/*
			 * JourneyScreenTwo.setFirstName(3, 1, 0);
			 * JourneyScreenTwo.setLastName(3, 1, 1);
			 * JourneyScreenTwo.setDateBirthPersonalDetails(1, 1, 9);
			 * JourneyScreenTwo.selectByDropdown(); Thread.sleep(1000);
			 * JourneyScreenTwo.setHouseNo(3, 1, 3);
			 * JourneyScreenTwo.setRoadNo(3, 1, 4);
			 * JourneyScreenTwo.setVillageTown(3, 1, 5);
			 * JourneyScreenTwo.setCountry(3, 1, 6);
			 * JourneyScreenTwo.setState(3, 1, 7); JourneyScreenTwo.setCity(3,
			 * 1, 8); JourneyScreenTwo.setPinCode(3, 1, 9);
			 * JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
			 * //JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
			 * //JourneyScreenOne.insurersGender();
			 * //JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
			 * //JourneyScreenOne.selectAndCheckRelationshipWithProposerOption()
			 * ; JourneyScreenTwo.traditional();
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

	@Test(priority = 3, enabled = false)
	public void checkingAllTheFeildsForULIPProduct() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			ScreenOneTestIndianFuntn();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownUlipAllProduct();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
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
	@Test(priority = 3, enabled = false)
	public void PayorDetailsSection() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		try {
			personalDetailsbankDetailsScreenThreeReachingFunction();
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

	public static void personalDetailsbankDetailsScreenThreeReachingFunction() throws Exception {
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
			JourneyScreenTwo.checkPOSVforSAPPremiumCommitment(3, 1, 19);
			/*
			 * JourneyScreenTwo.selectByDropdownCIP(); Thread.sleep(1000);
			 * JourneyScreenTwo.fillingAllTheRequiredFeildsForCIP();
			 * JourneyScreenTwo.clickSubmitButton();
			 *
			 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
			 * robot.keyPress(KeyEvent.VK_W); Thread.sleep(1000); //
			 * JourneyScreenThree.generatingPDFToReachToScreenThree(); //
			 * CheckproductConfigrationSAPGeneratingPdf();
			 */
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Ful2-152 bank details section
	@Test(priority = 4, enabled = false)
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

	public static void bankDetailsSectionFillingData() throws Exception

	{
		try {

			PageFactory.initElements(driver, JourneyScreenThree.class);
			JourneyScreenThree.setBankAccountNumber(4, 1, 5);
			JourneyScreenThree.setAccountHoldersName(4, 1, 6);
			JourneyScreenThree.setIFCPositive(4, 1, 2);
			JourneyScreenThree.setMICR(4, 1, 3);
			JourneyScreenThree.typeOfAccountOptionSelection();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	public static void proposerPersonalDetailsSection() throws Exception

	{
		JourneyScreenThree.fathersName(9, 1, 0);
		JourneyScreenThree.mothersName(9, 1, 1);
		JourneyScreenThree.maritalStatusOptionSelection();
		JourneyScreenThree.educationDropDownOptionList();
		JourneyScreenThree.annualIncome(0, 1, 8);
		JourneyScreenThree.industryDropDownOptionSelection();
		JourneyScreenThree.organizationTypeOptionSelection();
		JourneyScreenThree.occupationOptionSelectionSelf();
		JourneyScreenThree.setCompanyNameProposerPersonalDetails(9, 1, 0);
		// JourneyScreenTwo.occupationOptionSelectionWithCancerProduct();
		JourneyScreenTwo.preferredLanguageOfCommunicationOptionSelectionWithSAPProduct();

	}

	public static void nomineeDetailsWithoutDependentSelection() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		try {

			JourneyScreenThree.fillingNomineeName(4, 1, 6);
			JourneyScreenTwo.setDateBirthNomineeDetails();
			JourneyScreenThree.selectNomineeGender();
			JourneyScreenThree.relationshipWithNomineeOptionSelection();
			JourneyScreenThree.childNameWithNominee(4,1,15);
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 5, enabled = false)
	public void personalDetailsSectionFeildsValidation() throws Exception

	{
		try {
			personalDetailsbankDetailsScreenThreeReachingFunction();
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

	@Test(priority = 6, enabled = false)
	public void reachingScreenFourAndMultipleDataValidationForAnnualIncome() throws Exception

	{
		try {
			personalDetailsbankDetailsScreenThreeReachingFunction();
			proposerPersonalDetailsSection();
			nomineeDetailsWithoutDependentSelection();
			bankDetailsSectionFillingData();
			JourneyScreenThree.annualIncomePersonalDetailsDependent();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	public static void reachingScreenFourFillingAnnualIncomeFunction() throws Exception

	{
		try {
			/* filling details of screen one and two */
			personalDetailsbankDetailsScreenThreeReachingFunction();
			/* filling proposer Personal Details Section at screen three */
			proposerPersonalDetailsSection();
			/*
			 * filling Nominee Details Without Dependent Selection at screen
			 * three
			 */
			nomineeDetailsWithoutDependentSelection();
			/* filling bank Details Section at screen three */
			bankDetailsSectionFillingData();
			/* filling Annual Income TO Proceed */
			JourneyScreenThree.fillingAnnualIncomeTOProceed();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 19, enabled = false)
	public void EIAScreeenFourValidation() throws Exception {
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

	public static void fillingPersonalDetailsFunction() throws Exception

	{
		try {
			JourneyScreenThreeTest.reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
			JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthorityOptionSelection();
			JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 7, enabled = false)
	public void payorDetailsFeildsIsPresentAndValidation() throws Exception

	{
		try {
			fillingPersonalDetailsFunction();
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

	/*
	 * Check all the feilds are present on the screen four as per dependent
	 * selection
	 */

	@Test(priority = 1, enabled = false)
	public void checkInsurersDetailsIsPresentAndFeildsValidationScreenThree() throws Exception {
		try {
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			// JourneyScreenTwo.checkAllTheInsurersDetailsFeildsPresentOrNot();
			JourneyScreenTwo.checkAndFillIssurersNameValidation(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.setDateBirthInsurersDetails(1, 1, 9);
			// Test case--> describing the dropDown list of relationship with
			// proposer First
			// screen--Select dependent and check on Insurers Details section
			JourneyScreenTwo.selectAndCheckRelationshipWithProposerOption();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownCancerInsurancePlan();
			Thread.sleep(1000);
			JourneyScreenTwo.fillingAllTheRequiredFeildsForCIPIsurersDetails();
			JourneyScreenTwo.clickSubmitButton();
			JourneyScreenTwo.generatingPDFToReachToScreenThree();
			JourneyScreenThree.insureresOtherDetailsIsPresent();
			JourneyScreenThree.checkAllTheIsurersDetailsFeildsIsPresentForScreenThree();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	/*
	 * All the drop down value and reflexive question as per the dependent for
	 * screen four
	 */
	@Test(priority = 1, enabled = false)
	public void checkInsurersDetailsDropDownReflexiveScreenThree() throws Exception {
		try {
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			// JourneyScreenTwo.checkAllTheInsurersDetailsFeildsPresentOrNot();
			JourneyScreenTwo.checkAndFillIssurersNameValidation(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.setDateBirthInsurersDetails(1, 1, 9);
			// Test case--> describing the dropDown list of relationship with
			// proposer First
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
			// JourneyScreenThree.checkAllTheIsurersDetailsFeildsIsPresentForScreenThree();
			JourneyScreenThree.checkAllTheIsurersDetailsFeildsDropDownListIsPresentForScreenThree();
			JourneyScreenThree.checkReflexiveQuestionsOfAllQuestionScreenThree();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	public static void personalDetailsSection() throws Exception

	{
		try {
			Thread.sleep(500);
			JourneyScreenThree.fathersName(9, 1, 0);
			JourneyScreenThree.mothersName(9, 1, 1);
			JourneyScreenThree.maritalStatusOptionSelection();
			JourneyScreenThree.educationDropDownOptionList();
			JourneyScreenThree.industryDropDownOptionSelection();

			JourneyScreenThree.organizationTypeOptionSelection();
			JourneyScreenThree.occupationOptionSelection();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	public static void personalDetailsSectionCancerSpecified() throws Exception

	{
		try {
			Thread.sleep(500);
			JourneyScreenThree.fathersName(9, 1, 0);
			JourneyScreenThree.mothersName(9, 1, 1);
			JourneyScreenThree.maritalStatusOptionSelection();
			JourneyScreenThree.educationDropDownOptionList();
			JourneyScreenThree.occupationOptionSelection();
			JourneyScreenThree.annualIncomePersonal(0, 1, 3);
			JourneyScreenThree.setCompanyNameProposerPersonalDetails(9, 1, 0);
			JourneyScreenThree.preferredLanguageOfCommunicationDropDown();

			// JourneyScreenThree.industryDropDownOptionSelection();

			// JourneyScreenThree.organizationTypeOptionSelection();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 3, enabled = false)
	public void insurerDetailsFillingAllTheFeildsToReachScreenFourSelectingDependent() throws Exception {
		try {
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			// JourneyScreenOne.feildSupressFuctionalityInsurersDetails();
			JourneyScreenTwo.fllIssurersNameValidation(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.fillDateBirthInsurersDetails();
			JourneyScreenTwo.selectkRelationshipWithProposerOption();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownCancerInsurancePlan();
			Thread.sleep(1000);
			JourneyScreenTwo.fillingAllTheRequiredFeildsForCIPIsurersDetails();
			JourneyScreenTwo.clickSubmitButton();
			JourneyScreenTwo.generatingPDFToReachToScreenThree();
			personalDetailsSectionCancerSpecified();
			bankDetailsSectionFillingData();
			JourneyScreenThree.isurersDetailsFeildsDropDownForScreenThree();

			// JourneyScreenThree.annualIncomePersonalDetailsDependent();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 2, enabled = false)
	public void checkingFemaleOptionForScreenThree() throws Exception {
		try {

			JourneyScreenOneTest.ScreenOneTestIndianToScreenTwo();
			JourneyScreenTwo.fillingFeildsScreenTwoFunctionSelfFemale();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTP();
			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);
			bankDetailsSectionFillingData();
			proposerPersonalDetailsSection();
			nomineeDetailsWithoutDependentSelection();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillProceed();
			JourneyScreenFour.checkPregnancyDetailsSectionWhenFemaleIsSelected();
			JourneyScreenFour.checkPregnancyDetailsSectionWhenYesOptrionIsSelected();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 1, enabled = false)
	public void checkingFemaleOptionForScreenThreeDependet() throws Exception {
		try {

			JourneyScreenOneTest.fillingScreenOneFeildsFunctionForDependent();
			JourneyScreenTwo.fillingFeildsScreenTwoFunctionSelfFemale();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTPDependent();
			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);
			bankDetailsSectionFillingData();
			proposerPersonalDetailsSection();
			JourneyScreenThree.isurersDetailsFeildsDropDownForScreenThree();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();

			// JourneyScreenFour.arrowDownFunctionToScrollDownTillProceed();

			JourneyScreenFour.checkPregnancyDetailsSectionWhenFemaleIsSelected();
			JourneyScreenFour.checkPregnancyDetailsSectionWhenYesOptrionIsSelected();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 1, enabled = false)
	public void checkingMaleOptionForScreenThreeDependet() throws Exception {
		try {

			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTPDependent();
			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);
			bankDetailsSectionFillingData();
			proposerPersonalDetailsSection();
			JourneyScreenThree.isurersDetailsFeildsDropDownForScreenThree();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();
			JourneyScreenFour.checkPregnancyDetailsSectionWhenMaleIsSelected();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 1, enabled = false)
	public static void form60Scenarios() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {
			// HomePage.clickDashboard();
			// HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			Thread.sleep(500);
			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.fillingAllTheRequiredFeildForScreen2WithoutFirstName();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
			JourneyScreenTwo.checkPOSVforSAPPremiumCommitment(3, 1, 19);

			JourneyScreenThreeTest.proposerPersonalDetailsSection();
			// JourneyScreenTwo.proposerPersonalDetailsIncome();
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.fillingAnnualIncomeTOProceedForm60();
			Thread.sleep(1000);
			JourneyScreenThree.checkUpdatePANNumberPopup();
			/*
			 * JourneyScreenFour.
			 * form60RelatedDetailsIdentityProofNameOptionSelection();
			 * JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			 * JourneyScreenFour.identityProofIssuingAuthority();
			 * JourneyScreenFour.
			 * iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961
			 * ();
			 *
			 * JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
			 * JourneyScreenFour.criticalIllnessNoOption();
			 * JourneyScreenFour.hazardousActivitiesNo();
			 * JourneyScreenFour.selectCriminalChargesNo();
			 * JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
			 * JourneyScreenThree.
			 * agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer()
			 * ;
			 */

		}

		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 1, enabled = false)
	public static void endToEndTPPPush() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {

			// HomePage.clickDashboard();
			// HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			Thread.sleep(500);
			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.fillingAllTheRequiredFeildForScreen2WithoutFirstName();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
			JourneyScreenTwo.checkPOSVforSAPPremiumCommitment(3, 1, 19);

			JourneyScreenThreeTest.proposerPersonalDetailsSection(); //
			// JourneyScreenTwo.proposerPersonalDetailsIncome();
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();
			Thread.sleep(1000);

			JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
			JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();

			JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
			JourneyScreenFour.criticalIllnessNoOption();
			JourneyScreenFour.hazardousActivitiesNo();
			JourneyScreenFour.selectCriminalChargesNo();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			JourneyScreenSix.fetchingProposalNumberFromUI();
			JourneyScreenThree.gmailFunctionality();
			usingPolicyNumberToFillScreenSixTPPPush();
			DeletingALLInboxMailForTppPushClose();

			/*
			 * JourneyScreenThree.gmailFunctionality();
			 * //JourneyScreenSix.shortcutToProposal();
			 * JourneyScreenSix.switchingBackToMainWindowScreenSix();
			 * JourneyScreenSix.preferedDate(); JourneyScreenSix.visitType();
			 * JourneyScreenSix.termsAndCondition();
			 */
		}

		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 1, enabled = true)
	public static void panDOBValidations() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {

			// HomePage.clickDashboard();
			// HomePage.clickNewApp();
			JourneyScreenOne.setPanNumber(2, 9, 4);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.clickProceed();
			Thread.sleep(500);
			JourneyScreenTwo.fillingAllTheRequiredFeildForScreen2ForPANValidation();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
			JourneyScreenTwo.checkPOSVforSAPPremiumCommitment(3, 1, 19);

			JourneyScreenThreeTest.proposerPersonalDetailsSection(); //
			// JourneyScreenTwo.proposerPersonalDetailsIncome();
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();
			Thread.sleep(1000);

			// JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
			// JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			// JourneyScreenFour.identityProofIssuingAuthority();
			// JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();

			JourneyScreenFour.arrowDownFunction();
			JourneyScreenFour.criticalIllnessNoOption();
			JourneyScreenFour.hazardousActivitiesNo();
			JourneyScreenFour.selectCriminalChargesNo();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
			JourneyScreenThree.fetchingTextFromToasterToValidatePANDOB();

			// JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();

		}

		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void usingPolicyNumberToFillScreenSixTPPPush() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {

			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			JourneyScreenSix.switchingBackToMainWindowScreenSix();
			JourneyScreenSix.preferedDate();
			JourneyScreenSix.visitType();
			JourneyScreenSix.medicalCentreSelection();
			JourneyScreenSix.termsAndCondition();
		}

		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void DeletingALLInboxMailForTppPushClose() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {

			JourneyScreenThree.deletingAllInboxMail();
		}

		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}
	public static void checkAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			// exception handling
			System.out.println("Alert not present");
		}
	}






	public static void usingPolicyNumberToFillScreenSixTPPPushFTSP() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {

			checkAlert();
			// driver.close();
			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			JourneyScreenSix.switchingBackToMainWindowScreenSixFTSP();
			// JourneyScreenSix.preferedDate();
			// JourneyScreenSix.visitType();
			// JourneyScreenSix.medicalCentreSelection();
			JourneyScreenSix.termsAndCondition();
			Thread.sleep(1000);
			driver.close();
			// JourneyScreenThree.capture_window_ids();

		} // driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void usingPolicyNumberToFillScreenSixTPPPushSuperTermPlan() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {

			checkAlert();
			// driver.close();
			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			JourneyScreenSix.switchingBackToMainWindowScreenSix();
			// JourneyScreenSix.preferedDate();
			// JourneyScreenSix.visitType();
			// JourneyScreenSix.medicalCentreSelection();
			JourneyScreenSix.termsAndCondition();
			Thread.sleep(1000);
			driver.close();
			// JourneyScreenThree.capture_window_ids();

		} // driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}

		}
	public static void usingPolicyNumberToFillScreenSixTPPPushWLS() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {

			checkAlert();
			// driver.close();
			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			JourneyScreenSix.switchingBackToMainWindowScreenSixWLS();
			// JourneyScreenSix.preferedDate();
			// JourneyScreenSix.visitType();
			// JourneyScreenSix.medicalCentreSelection();
			JourneyScreenSix.termsAndCondition();
			Thread.sleep(1000);
			driver.close();
			// JourneyScreenThree.capture_window_ids();

		} // driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();

		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}
