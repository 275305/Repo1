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

public class MaxLifeSavingsAdvantagePlanTest extends ReusableActions {

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

	@Test(priority = 1, enabled = false)
	public void CheckproductConfigrationSAPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
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
		/*Sap Code Missing*/

	// Illustration for WOP rider of limited pay
		@Test(priority = 2, enabled = false)
		public static void WOPRiderLimitedPayPremiumType() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownSAP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSAPlimitedPremiumTypeforrider3();
				JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();
				screenJourneyFromThreeTillEnd();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

	// TC- for SinglePay premium
		@Test(priority = 8, enabled = true)
		public void CheckproductConfigrationSAPGeneratingPdfforSinglePremium() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownSAP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSAPsinglePremiumType();
				JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();
				screenJourneyFromThreeTillEnd();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

		// TC- for LimitedPay premium (ADDRider)
		@Test(priority = 3, enabled = false)
		public void CheckproductConfigrationSAPGeneratingPdfforLimitedPremium() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownSAP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSAPlimitedPremiumType();
				JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

		// Illustration for TermPlus rider of limited pay
		@Test(priority = 4, enabled = false)
		public static void TermPlusRiderLimitedPayPremiumType() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownSAP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSAPlimitedPremiumTypeforrider2();
				JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

		// Illustration for WOP rider of limited pay
		/*@Test(priority = 2, enabled = true)
		public static void WOPRiderLimitedPayPremiumType() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownSAP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSAPlimitedPremiumTypeforrider3();
				JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}*/

		// Illustration for all rider of limited pay --5
		@Test(priority = 5, enabled = false)
		public static void AllRiderLimitedPayPremiumType() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownSAP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSAPlimitedPremiumTypeforAllrider();
				JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();
				screenJourneyFromThreeTillEnd();


			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

		// TC-for Regular PremiumPay for Monthly mode of payment
		@Test(priority = 6, enabled = false)
		public static void AllRiderRegularPayPremiumType() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownSAP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSAPforRegularmode();
				JourneyScreenTwo.premiumCommitmentSAPCheckingMultipleDataForErrorMessage();
				screenJourneyFromThreeTillEnd();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

		/*/ Added Changes on 20-06-19 /*/
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
				JourneyScreenFour.selectCriminalChargesNo();
				JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
				JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
				JourneyScreenSix.fetchingProposalNumberFromUI();

				// JourneyScreenThree.gmailFunctionalitySmartTermPlan();
				JourneyScreenThree.handle_windowSAP();
				JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}

		@Test(priority = 7, enabled = false)
		public void generatingPdf() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				alwaysCloseAllChildTabs();
				// HomePage.clickDashboard();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownSAP();
				JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
				JourneyScreenTwo.premiumCommitmentSAP(3, 8, 11);
				screenJourneyFromThreeTillEnd();

			} catch (Exception e) {
				logger.error("Test case failed " + e.getMessage());
				throw e;

			}
		}




}
