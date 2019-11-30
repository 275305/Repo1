package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.LoginPage;
import uielements.POSVFlowForSAPMIAP;
import uielements.ReusableActions;
import util.AppConstant;

public class POSVFlowForSAPMIAPTest extends ReusableActions {

	@Test(priority = 1, enabled = true)
	public void aadhaarOCRPrepopulatedDataValidation() throws Exception {
		try {
			final String PATH = System.getProperty("user.dir");
			System.setProperty(AppConstant.INPUT_CHROME_DRIVER, PATH + AppConstant.INPUT_WEB_DRIVER);
			driver = new ChromeDriver();
			PageFactory.initElements(driver, POSVFlowForSAPMIAPTest.class);
			prop = ReusableActions.readProperties();

			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");
			/*
			 * HomePage.clickNewApp();
			 * JourneyScreenOnePANOCR.prePopulationOCRAadhar();
			 * JourneyScreenOnePANOCR.setPanNumber(1, 1, 1);
			 * JourneyScreenOnePANOCR.setMobNumberOCR(1, 1, 2);
			 * JourneyScreenOnePANOCR.setEmailId(1, 1, 3);
			 * JourneyScreenOnePANOCR.setPreIssuanceNumber(1, 1, 4);
			 * JourneyScreenOnePANOCR.clickProceed(); Thread.sleep(4000);
			 * JourneyScreenOnePANOCR.checkPrePopulatedDataAfterAadhaarOCR();
			 */

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 2, enabled = false)
	public void PANOCRPrepopulatedDataValidation() throws Exception {
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
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			POSVFlowForSAPMIAP.setAadhar(1, 1, 0);
			Thread.sleep(5000);
			POSVFlowForSAPMIAP.prePopulationPanOCR();
			POSVFlowForSAPMIAP.setMobNumber(1, 1, 2);
			POSVFlowForSAPMIAP.setEmailId(1, 1, 3);
			POSVFlowForSAPMIAP.setPreIssuanceNumber(1, 1, 4);
			POSVFlowForSAPMIAP.clickProceed();
			Thread.sleep(4000);
			POSVFlowForSAPMIAP.checkPrePopulatedDataAfterPANOCR();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	/*
	 * @Test(priority = 8, enabled = false) public static void
	 * checkPOSVFlowForSAP() throws Exception { PageFactory.initElements(driver,
	 * JourneyScreenOnePANOCR.class); try { alwaysCloseAllChildTabs();
	 * HomePage.clickDashboard(); HomePage.clickNewApp();
	 * JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
	 * JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
	 * JourneyScreenTwo.traditional(); JourneyScreenTwo.selectByDropdownSAP();
	 * JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
	 * JourneyScreenTwo.checkPOSVforSAPPremiumCommitment(3,1,19);
	 * JourneyScreenThreeTest.proposerPersonalDetailsSection();
	 * JourneyScreenTwo.proposerPersonalDetailsIncome(9,1,10);
	 * JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
	 * JourneyScreenThreeTest.bankDetailsSectionFillingData();
	 * JourneyScreenOne.fillingAnnualIncomeTOProceed(0,1,3); Thread.sleep(1000);
	 * JourneyScreenThree.form60RelatedDetailsIdentityProofNameOptionSelection()
	 * ; JourneyScreenThree.setIdentityProofNumberValidation(0,1,6);
	 * JourneyScreenThree.identityProofIssuingAuthority(); JourneyScreenThree.
	 * iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961
	 * ();
	 *
	 * JourneyScreenThree.arrowDownFunctionToScrollDownTillBottom();
	 * JourneyScreenThree.criticalIllnessNoOption();
	 * JourneyScreenThree.hazardousActivitiesNo();
	 * JourneyScreenThree.selectCriminalChargesNo();
	 * JourneyScreenThree.feetInchesKgsSelectionToMoveToScreen5POSV();
	 * JourneyScreenThree.
	 * agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer(); //
	 * JourneyScreenOnePANOCR.productDetails();
	 * //JourneyScreenThree.identityProofIssuingAuthorityOptionSelection();
	 * //JourneyScreenThree.fillPanApplicationAcknowledgeNowWithoutValidation();
	 * //JourneyScreenThree.setDateBirthdateOfApplicationWithoutValidation(1,1,9
	 * ); } catch (Exception e) { logger.error("Test case failed " +
	 * e.getMessage()); throw e;
	 *
	 * }}
	 */

	@Test(priority = 8, enabled = true)
	public static void checkPOSVFlowForSAPWithMutipleFirstNameForSelf() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {
			POSVFlowForSAPMIAP.posvForSAPMultipleFirstNameTestForSelf();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 8, enabled = false)
	public static void checkPOSVFlowForMIAPWithMutipleFirstNameForSelf() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {
			POSVFlowForSAPMIAP.posvForMIAPMultipleFirstNameTestForSelf();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 8, enabled = true)
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
