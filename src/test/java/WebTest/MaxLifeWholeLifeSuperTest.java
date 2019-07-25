package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenFour;
import uielements.JourneyScreenSix;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.RegressionSuit;
import uielements.ReusableActions;
import util.AppConstant;

public class MaxLifeWholeLifeSuperTest extends ReusableActions {



	@Test(priority = 0, enabled = true)
	public void loginApplicationTest() throws Exception {
		try {
			PageFactory.initElements(driver, RegressionSuit.class);
			final String PATH = System.getProperty("user.dir");
			System.setProperty(AppConstant.INPUT_CHROME_DRIVER, PATH + AppConstant.INPUT_WEB_DRIVER);
			driver = new ChromeDriver();
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




	public static void loginNewBrowser() throws Exception {
		try {

			driver = new ChromeDriver();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");
			/*
			 * HomePage.clickDashboard(); HomePage.clickNewApp();
			 * JourneyScreenOne.isIndianSelected(); JourneyScreenOne.isSelfSelected();
			 * JourneyScreenOne.isProceedEnabled();
			 */

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}
	@Test(priority = 1, enabled = false)
	public void CheckproductConfigrationWLSGeneratingPdfErrorMessage() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownWLS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForWLS();
			JourneyScreenTwo.premiumCommitmentWLS();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// @Test(priority = 2, enabled = true)
	public static void CheckproductConfigrationWLSGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownWLS();
			JourneyScreenTwo.fillingNeedOfInsuranceLifeStafeForWLS();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	
	public static void screenJourneyFromThreeTillEnd() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenThreeTest.proposerPersonalDetailsSection(); //
			// JourneyScreenTwo.proposerPersonalDetailsIncome();
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();
			Thread.sleep(1000);

		} catch (Exception e) {
			// driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void screenJourneyFromFourTillEnd() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			// JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
			// JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			// JourneyScreenFour.identityProofIssuingAuthority();
			// JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();

			JourneyScreenFour.arrowDownFunctionToScrollDownTillBottomFastTrack();
			JourneyScreenFour.criticalIllnessNoOption();
			JourneyScreenFour.hazardousActivitiesNo();
			JourneyScreenFour.selectCriminalChargesNo();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			JourneyScreenSix.fetchingProposalNumberFromUI();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void posvBackFlowTillTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {


			// JourneyScreenThree.gmailFunctionalitySmartTermPlan();
			JourneyScreenThree.handle_windowWLS();
			// JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	
	@Test(priority = 2, enabled = true)
	public static void premiumPaymentTerm10WLSGeneratingPdfAndTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			CheckproductConfigrationWLSGeneratingPdf();
			JourneyScreenTwo.premiumPaymanetTerm10();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForWLS();
			JourneyScreenTwo.checkPOSVforWLSAnnualIncome(3, 4, 11);
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
		finally {
			driver.close();
		}
	}

	@Test(priority = 3, enabled = true)
	public static void premiumPaymentTerm15WLSGeneratingPdfAndTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			CheckproductConfigrationWLSGeneratingPdf();

			JourneyScreenTwo.premiumPaymanetTerm15();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForWLS();
			JourneyScreenTwo.checkPOSVforWLSAnnualIncome(3, 4, 11);
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}

		finally {
			driver.close();
		}

	}

	@Test(priority = 4, enabled = true)
	public static void premiumPaymentTerm20WLSGeneratingPdfAndTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			CheckproductConfigrationWLSGeneratingPdf();
			JourneyScreenTwo.premiumPaymanetTerm20();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForWLS();
			JourneyScreenTwo.checkPOSVforWLSAnnualIncome(3, 4, 11);
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
		finally {
			driver.close();
		}
	}

	@Test(priority = 5, enabled = true)
	public static void modeOfPaymentAnnualWLSTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			CheckproductConfigrationWLSGeneratingPdf();
			JourneyScreenTwo.premiumPaymanetTerm20();

			JourneyScreenTwo.policyTermDividentAdjustmentWLS();

			JourneyScreenTwo.modeOfPaymentWLS();

			JourneyScreenTwo.dividentOptionWLS();

			JourneyScreenTwo.checkPOSVforWLSAnnualIncome(3, 4, 11);
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

		finally {
			driver.close();
	}

	}


	@Test(priority = 6, enabled = true)
	public static void modeOfPaymentSemiAnnualWLSTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			CheckproductConfigrationWLSGeneratingPdf();
			JourneyScreenTwo.premiumPaymanetTerm20();

			JourneyScreenTwo.policyTermDividentAdjustmentWLS();

			JourneyScreenTwo.modeOfPaymentSTPSemiAnnual();

			JourneyScreenTwo.dividentOptionWLS();

			JourneyScreenTwo.checkPOSVforWLSAnnualIncome(3, 4, 11);
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	@Test(priority = 7, enabled = true)
	public static void modeOfPaymentQuarterlyWLSTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			CheckproductConfigrationWLSGeneratingPdf();
			JourneyScreenTwo.premiumPaymanetTerm20();

			JourneyScreenTwo.policyTermDividentAdjustmentWLS();

			JourneyScreenTwo.modeOfPaymentSTPQuaterly();

			JourneyScreenTwo.dividentOptionWLS();

			JourneyScreenTwo.checkPOSVforWLSAnnualIncome(3, 4, 11);
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;

		} finally {
			driver.close();

		}
	}

	@Test(priority = 8, enabled = true)
	public static void modeOfPaymentMonthlyWLSTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			CheckproductConfigrationWLSGeneratingPdf();
			JourneyScreenTwo.premiumPaymanetTerm20();

			JourneyScreenTwo.policyTermDividentAdjustmentWLS();

			JourneyScreenTwo.modeOfPaymentSTPMonthly();

			JourneyScreenTwo.dividentOptionWLS();

			JourneyScreenTwo.checkPOSVforWLSAnnualIncome(3, 4, 11);
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

		finally {
			driver.close();
		}

	}

}
