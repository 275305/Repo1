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
import uielements.RegressionSuit;
import uielements.ReusableActions;
import util.AppConstant;

public class MaxLifeSuperTermPlanTest extends ReusableActions {

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

	public static void CheckproductConfigrationSTPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			// alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();

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
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void screenJourneyFromFourTillEnd() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
             /*added 5 method 26-07-19 */
			 JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
			 JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			 JourneyScreenFour.identityProofIssuingAuthority();
			 JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();
			 JourneyScreenFour.arrowDownFunctionToScrollDownTillBottomFastTrack();
			 
			//JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
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
			JourneyScreenThree.handle_windowSuperTermPlan();
			// JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 1, enabled = true)
	public static void levelSumAssuredTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			CheckproductConfigrationSTPGeneratingPdf();
			JourneyScreenTwo.needOfInsurLifeStagePremiumPaymentPolicyTerm();
			JourneyScreenTwo.levelSumAssuredOption();
			JourneyScreenTwo.nonSmokerDividentAdjustmentModeOfPaymentWOP();

			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);

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

	@Test(priority = 2, enabled = false)
	public static void increasingSumAssuredTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			CheckproductConfigrationSTPGeneratingPdf();
			JourneyScreenTwo.needOfInsurLifeStagePremiumPaymentPolicyTerm();
			JourneyScreenTwo.IncreasingLevelSumAssuredOption();
			JourneyScreenTwo.nonSmokerDividentAdjustmentModeOfPaymentWOP();
			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);

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

	@Test(priority = 3, enabled = false)
	public static void premiumPaymentTerm10TppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			CheckproductConfigrationSTPGeneratingPdf();

			JourneyScreenTwo.needOfInsuranceLifeStage();
			JourneyScreenTwo.premiumPaymentTerm10();
			JourneyScreenTwo.policyTermSumAssuredSmokerDividentAdjustmentModeOfPaymentWOP();


			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);

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

	@Test(priority = 4, enabled = false)
	public static void premiumPaymentTerm16TppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			CheckproductConfigrationSTPGeneratingPdf();

			JourneyScreenTwo.needOfInsuranceLifeStage();
			JourneyScreenTwo.premiumPaymentTerm16();
			JourneyScreenTwo.policyTermSumAssuredSmokerDividentAdjustmentModeOfPaymentWOP();

			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);

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

	@Test(priority = 5, enabled = false)
	public static void annualModeOfPaymentTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			CheckproductConfigrationSTPGeneratingPdf();

			JourneyScreenTwo.fillingAllTheRequiredFeilds();
			JourneyScreenTwo.annualMode();
			JourneyScreenTwo.wopPlusRider();

			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);

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

	@Test(priority = 6, enabled = false)
	public static void semiAnnualModeOfPaymentTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			CheckproductConfigrationSTPGeneratingPdf();

			JourneyScreenTwo.fillingAllTheRequiredFeilds();
			JourneyScreenTwo.modeOfPaymentSTPSemiAnnual();
			JourneyScreenTwo.wopPlusRider();

			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);

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

	@Test(priority = 7, enabled = false)
	public static void quarterlyModeOfPaymentTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			CheckproductConfigrationSTPGeneratingPdf();

			JourneyScreenTwo.fillingAllTheRequiredFeilds();
			JourneyScreenTwo.modeOfPaymentSTPQuaterly();
			JourneyScreenTwo.wopPlusRider();

			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);

			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			//driver.close();
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

		finally {
			//driver.close();
		}

	}

	@Test(priority = 8, enabled = false)
	public static void monthlyModeOfPaymentTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			CheckproductConfigrationSTPGeneratingPdf();

			JourneyScreenTwo.fillingAllTheRequiredFeilds();
			JourneyScreenTwo.modeOfPaymentSTPMonthly();
			JourneyScreenTwo.wopPlusRider();

			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);
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