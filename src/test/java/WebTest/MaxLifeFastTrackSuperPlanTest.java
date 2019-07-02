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
import uielements.ReusableActions;
import util.AppConstant;

public class MaxLifeFastTrackSuperPlanTest extends ReusableActions {


	@Test(priority = 0, enabled = true)
	public void loginApplicationTest() throws Exception {
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
		} catch (Exception e) {

			logger.error("Test case failed: " + e.getMessage());

			throw e;
		}
	}

	//For Premium Term 1
		@Test(priority = 1, enabled = true)
		public void pdfConfigrationFTSPUlipGeneratingPdf() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				// loginApplicationTest();
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.ulip();
				JourneyScreenTwo.selectByDropdownFTSP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSP();
				JourneyScreenTwo.fillingAllTheFeildForFTSP();
				// JourneyScreenTwo.clickSubmitButton();
				screenJourneyFromThreeTillEnd();
				// HomePage.clickDashboard();

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

				JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
				JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
				JourneyScreenFour.identityProofIssuingAuthority();
				JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();

				JourneyScreenFour.arrowDownFunctionToScrollDownTillBottomFastTrack();
				JourneyScreenFour.criticalIllnessNoOption();
				JourneyScreenFour.hazardousActivitiesNo();
				JourneyScreenTwo.arrowDownFunctionToScrollDown();
				JourneyScreenFour.selectCriminalChargesNo();
				JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
				JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
				JourneyScreenSix.fetchingProposalNumberFromUI();

				// JourneyScreenThree.gmailFunctionalitySmartTermPlan();
				JourneyScreenThree.handle_windowFTSP();
				// JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

		// For Premium Payment term 5 for AnnualModeOfPayment
		@Test(priority = 1, enabled = false)
		public void pdfConfigrationFTSPUlipGeneratingPdfoption5() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				// loginApplicationTest();
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.ulip();
				JourneyScreenTwo.selectByDropdownFTSP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSPoption5();
				JourneyScreenTwo.fillingAllTheFeildForFTSP();
				// JourneyScreenTwo.clickSubmitButton();
				screenJourneyFromThreeTillEnd();
				// HomePage.clickDashboard();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

		// For Premium Payment term 5 for SemiAnnualModeOfPayment

		@Test(priority = 1, enabled = false)
		public void pdfConfigrationFTSPUlipGeneratingPdfoption5SemiAnnual() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				// loginApplicationTest();
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.ulip();
				JourneyScreenTwo.selectByDropdownFTSP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSPoption5forSemiAnnual();
				JourneyScreenTwo.fillingAllTheFeildForFTSP();
				// JourneyScreenTwo.clickSubmitButton();
				screenJourneyFromThreeTillEnd();
				// HomePage.clickDashboard();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}
		// For Premium Payment term 20 for QuaterlyModeOfPayment
		@Test(priority = 1, enabled = false)
		public void pdfConfigrationFTSPUlipGeneratingPdfoption20Quaterly() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				// loginApplicationTest();
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.ulip();
				JourneyScreenTwo.selectByDropdownFTSP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSPoption20forQuaterly();
				JourneyScreenTwo.fillingAllTheFeildForFTSP();
				// JourneyScreenTwo.clickSubmitButton();
				screenJourneyFromThreeTillEnd();
				// HomePage.clickDashboard();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}


}
