package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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

public class ToCheckDocumentRuleIsPendingTest extends ReusableActions {

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

	/* Test case for To verify POSV back flow link Status */
	@Test(priority = 1, enabled = true)
	public void verificationLinksentToCustomerStatusPending() throws Exception {
		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.saveProceedPDFGeneration();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEndPageVarification();
			posvBackFlowTillTPPPushStatus();

		} catch (Exception e) {
			//driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;
		} finally {
			//driver.close();
		}
	}

	/* Test case for To verify DocumentRule Pending */
	@Test(priority = 2, enabled = false)
	public void verifyDocumentRulePending() throws Exception {
		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.saveProceedPDFGeneration();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPushDocumentRule();

		} catch (Exception e) {

			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* Test case for To verify MSA and FSA */
	@Test(priority = 3, enabled = false)
	public void MSA_FSAVarificationSixScreen() throws Exception {
		try {
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.saveProceedPDFGeneration();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPushMSA_FSA();

		} catch (Exception e) {
			//driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			//driver.close();
		}
	}

	public static void posvBackFlowTillTPPPushMSA_FSA() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenThree.handle_windowSAPMSA_FSA();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void screenJourneyFromThreeTillEnd() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			JourneyScreenThreeTest.proposerPersonalDetailsSection();
			// JourneyScreenTwo.proposerPersonalDetailsIncome();
			JourneyScreenThreeTest.nomineeDetailsWithoutChilsSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();
			Thread.sleep(1000);
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

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

	public static void screenJourneyFromFourTillEndPage() throws Exception {
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

	public static void screenJourneyFromFourTillEndPageVarification() throws Exception {
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
			// JourneyScreenSix.fetchingProposalNumberFromUI();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	public static void screenJourneyFromFourTillEndPayment() throws Exception {
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

	public static void posvBackFlowTillTPPPushStatus() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenThree.handle_windowLPPSVarification();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	public static void posvBackFlowTillTPPPushDocument() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenThree.handle_windowLPPSDocument();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void posvBackFlowTillTPPPushDocumentRule() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenThree.handle_windowSAPDocumentRule();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}
