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

public class MaxLifePlatinumWealthPlanTest extends ReusableActions {


	// TC -01 Verify the by default status of Nationality, Policy for and Proceed
	// button on Journey Screen one

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

	public static void posvBackFlowTillTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			// JourneyScreenThree.gmailFunctionalitySmartTermPlan();
			JourneyScreenThree.handle_windowPWP();
			// JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 1, enabled = true)
	public void singlePayPremiumTypeTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			//loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownPWP();
			JourneyScreenTwo.needOfInsuLifeStage();
			JourneyScreenTwo.premiumTypeSingle();
			JourneyScreenTwo.PremiumPaymentTermAndAllFeilds();
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

	@Test(priority = 2, enabled = false)
	public void limitedPayPremiumTypeTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownPWP();
			JourneyScreenTwo.needOfInsuLifeStage();
			JourneyScreenTwo.premiumTypeLimited();
			JourneyScreenTwo.PremiumPaymentTermAndAllFeilds();
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
	public void regularPayPremiumTypeTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownPWP();
			JourneyScreenTwo.needOfInsuLifeStage();
			JourneyScreenTwo.premiumTypeLRegular();
			JourneyScreenTwo.PremiumPaymentTermAndAllFeilds();
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
	public void limitedPayAnnualModeOfPaymentTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownPWP();
			JourneyScreenTwo.needOfInsuLifeStagePremiumTypeANDTermPolicyTerm();
			JourneyScreenTwo.annualModeOfPaymentPWP();
			JourneyScreenTwo.fillingAllTheFeildForPWP();
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
	public void limitedPaySemiAnnualModeOfPaymentTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownPWP();
			JourneyScreenTwo.needOfInsuLifeStagePremiumTypeANDTermPolicyTerm();
			JourneyScreenTwo.modeOfPaymentSTPSemiAnnual();
			JourneyScreenTwo.fillingAllTheFeildForPWP();
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
	public void limitedPayQuatterlyModeOfPaymentTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownPWP();
			JourneyScreenTwo.needOfInsuLifeStagePremiumTypeANDTermPolicyTerm();
			JourneyScreenTwo.modeOfPaymentSTPQuaterly();
			JourneyScreenTwo.fillingAllTheFeildForPWP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

		finally {
			driver.close();
		}
	}

	@Test(priority = 7, enabled = false)
	public void limitedPayMonthlyModeOfPaymentTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownPWP();
			JourneyScreenTwo.needOfInsuLifeStagePremiumTypeANDTermPolicyTerm();
			JourneyScreenTwo.modeOfPaymentSTPMonthly();
			JourneyScreenTwo.fillingAllTheFeildForPWP();
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

