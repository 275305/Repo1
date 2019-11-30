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

public class MaxLifeLifePerfectPartnerSuperTest extends ReusableActions {

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

	/* Mode of Payment(Annual)+Dividend Option(cash) */
	@Test(priority = 1, enabled = true)
	public void LPPS_Tradition_GeneratingPdf_Annual_Cash() throws Exception {
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
			//we close before tpp push
			driver.close();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {

			// driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			// driver.close();
		}
	}

	/* Mode of Payment(Semi_Annual)+Dividend Option(cash) */
	@Test(priority = 2, enabled = false)
	public void LPPS_Tradition_GeneratingPdf_SemiAnnual_Cash() throws Exception {
		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsFor_SemiAnnualLPPS();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.saveProceedPDFGeneration();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* Mode of Payment(Quarterly)+Dividend Option(cash) */
	@Test(priority = 3, enabled = false)
	public void LPPS_Tradition_GeneratingPdf_Quarterly_Cash() throws Exception {
		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsFor_QuarterlyLPPS();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.saveProceedPDFGeneration();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* Mode of Payment(Monthly)+Dividend Option(cash) */
	@Test(priority = 4, enabled = false)
	public void LPPS_Tradition_GeneratingPdf_Monthly_Cash() throws Exception {
		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsFor_MonthalyLPPS();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.saveProceedPDFGeneration();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* Mode of Payment(Annual)+Dividend Option(PUA) */
	@Test(priority = 5, enabled = false)
	public void LPPS_Tradition_GeneratingPdf_Annual_PUA() throws Exception {
		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOption_PUA_LPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.saveProceedPDFGeneration();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* Mode of Payment(Annual)+Dividend Option(PremiumOffset) */
	@Test(priority = 6, enabled = false)
	public void LPPS_Tradition_GeneratingPdf_Annual_PremiumOffset() throws Exception {
		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOption_PremiumOffset_LPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.saveProceedPDFGeneration();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* Mode of Payment(Annual)+Dividend Option(cash)+RiderDetails(Accidental) */
	@Test(priority = 7, enabled = false)
	public void LPPSTraditionGeneratingPdfAnnualCashAccidental() throws Exception {

		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.riderDetailsAccidentalLPPS();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* Mode of Payment(Annual)+Dividend Option(cash)+TermPlusRider */
	@Test(priority = 8, enabled = false)
	public void LPPS_Tradition_GeneratingPdf_Annual_Cash_TermPlus() throws Exception {
		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.riderDetailsLPPSTermPlusRider();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* Mode of Payment(Annual)+Dividend Option(cash)+RiderDetails(WOP) */
	@Test(priority = 9, enabled = false)
	public void LPPSTraditionGeneratingPdfAnnual_Cash_WOP() throws Exception {
		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();
			JourneyScreenTwo.riderDetailsWOPLPPS();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/*
	 * Mode of Payment(Annual)+Dividend
	 * Option(cash)+RiderDetails(Accidental+Term plus rider+WOP) no able to
	 * upload the document at screen six
	 */
	@Test(priority = 10, enabled = false)
	public void LPPSTraditionGeneratingPdfAnnual_Cash_Accidental_TermPlus_WOP() throws Exception {
		try {
			JourneyScreenTwo.getInitDriver();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownLPPS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForLPPSAnnual();
			JourneyScreenTwo.fillingAllTheFeildForLPPS();
			JourneyScreenTwo.dividentOptionLPPS();
			JourneyScreenTwo.arrowDownFunctionToScrollDownPage();

			JourneyScreenTwo.riderDetailsAccidentalTermPlusWOP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case Failed" + e.getMessage());
			throw e;
		} finally {
			driver.close();
		}
	}

	/* / Added on 17-07-19 / */
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

	/* / Added on 17-07-19 / */
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
			//need to screen below
			JourneyScreenFour.arrowDownFunctionToScrollDown();
			JourneyScreenFour.holidayOfMoreThenCheckBoxScreeFour();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			JourneyScreenSix.fetchingProposalNumberFromUI();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	/* / Added Changes on 17-07-19 / */
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
