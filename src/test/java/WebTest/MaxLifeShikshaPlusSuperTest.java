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

	/* Initialize the webDriver and Login the application */
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
	/*Systematic Transfer Plan*/
	@Test(priority = 1, enabled = true)
	public void pdfConfigrationFTSPUlipGeneratingPdfoption5() throws Exception {

		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownSPSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSPSP();
			JourneyScreenTwo.fillingAllTheFeildForSPSP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			//posvBackFlowTillTPPPush();

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

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	/* / Added Changes on 20-06-19 / */
	public static void posvBackFlowTillTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenSix.fetchingProposalNumberFromUI();

			// JourneyScreenThree.gmailFunctionalitySmartTermPlan();
			JourneyScreenThree.handle_windowSAP();
			// JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}



}

