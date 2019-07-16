package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenSix;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;
import util.AppConstant;

public class MaxLifeShikshaPlusSuperTest extends ReusableActions {

	/* Initialize the webDriver and Login to the application */
	@Test(priority = 0, enabled = true)
	public void Indian() throws Exception {
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
			HomePage.clickNewApp();
			JourneyScreenOne.isIndianSelected();
			JourneyScreenOne.isSelfSelected();
			JourneyScreenOne.isProceedEnabled();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// For Premium Payment term 5 for AnnualModeOfPayment
	/* Systematic Transfer Plan */
	@Test(priority = 1, enabled = false)
	public void pdfConfigrationSPSPUlipGeneratingPdfoption5() throws Exception {

		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownSPSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSPSP();
			JourneyScreenTwo.fillingAllTheFeildForSPSP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// For Premium Payment term 5 for AnnualModeOfPayment
	/* dynamic Fund Allocation Yes */
	@Test(priority = 2, enabled = false)
	public void pdfConfigrationSPSPUlipGeneratingPdfDFA() throws Exception {

		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownSPSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSPSP();
			JourneyScreenTwo.fillingAllTheFeildForSPSPDynamicFund();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	// For Premium Payment term 5 for AnnualModeOfPayment
	/* choose Your Fund */
	@Test(priority = 3, enabled = false)
	public void pdfConfigrationSPSPUlipGeneratingPdfCYF() throws Exception {

		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownSPSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSPSP();
			JourneyScreenTwo.fillingAllTheFeildForSPSPChooseYourFundYes();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	// For Premium Payment term 5 for Semi-AnnualModeOfPayment
	/* choose Your Fund with semi Annual */
	@Test(priority = 4, enabled = false)
	public void pdfConfigrationSPSPUlipGeneratingPdfCYFSemiAnnual() throws Exception {

		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownSPSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSPSPSemiAnnual();
			JourneyScreenTwo.fillingAllTheFeildForSPSPChooseYourFundYes();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	// For Premium Payment term 5 for Quarterly ModeOfPayment
	/* choose Your Fund  with Quaterly */
	@Test(priority = 5, enabled = false)
	public void pdfConfigrationSPSPUlipGeneratingPdfCYFQuarterly() throws Exception {
		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownSPSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSPSPQuarterly();
			JourneyScreenTwo.fillingAllTheFeildForSPSPChooseYourFundYes();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	// For Premium Payment term 5 for Monthly ModeOfPayment
		/* choose Your Fund with monthly*/
		@Test(priority = 6, enabled = true)
		public void pdfConfigrationSPSPUlipGeneratingPdfCYFMonthly() throws Exception {
			try {
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.ulip();
				JourneyScreenTwo.selectByDropdownSPSP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSPSPMonthly();
				JourneyScreenTwo.fillingAllTheFeildForSPSPChooseYourFundYes();
				screenJourneyFromThreeTillEnd();
				screenJourneyFromFourTillEnd();
				posvBackFlowTillTPPPush();
			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;
			}
		}
	/* / Added Changes on 20-06-19 / */
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
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	/* / Added Changes on 20-06-19 / */
	public static void screenJourneyFromFourTillEnd() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
			JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();
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

	/* / Added Changes on 20-06-19 / */
	public static void posvBackFlowTillTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenThree.handle_windowSAP();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}
