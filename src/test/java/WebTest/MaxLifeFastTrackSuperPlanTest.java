package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
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

public class MaxLifeFastTrackSuperPlanTest extends ReusableActions {
	
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

	@Test(priority = 1, enabled = true)
	public void CheckproductConfigrationFTSPUlipGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSP();
			JourneyScreenTwo.fillingAllTheFeildForFTSP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			//deleteemails();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}


	
	
	// For Premium Payment term 1
	@Test(priority = 2, enabled = false)
	public void pdfConfigrationFTSPUlipGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			// loginNewBrowser();
			//deleteemails();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSP();
			JourneyScreenTwo.fillingAllTheFeildForFTSP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			//deleteemails();
			driver.close();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			// driver.close();
			throw e;

		} finally {
			driver.close();
		}
		  }

	// For Premium Payment term 5 for AnnualModeOfPayment
	@Test(priority = 3, enabled = false)
	public void pdfConfigrationFTSPUlipGeneratingPdfoption5() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();	
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSPoption5();
			JourneyScreenTwo.fillingAllTheFeildForFTSP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			//deleteemails();
			//driver.close();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			// driver.close();
			throw e;

		} finally {
			driver.close();
		}
	}

	// For Premium Payment term 5 for SemiAnnualModeOfPayment
	@Test(priority = 4, enabled = false)
	public void pdfConfigrationFTSPUlipGeneratingPdfoption5SemiAnnual() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSPoption5forSemiAnnual();
			JourneyScreenTwo.fillingAllTheFeildForFTSP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			//driver.close();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			// driver.close();
			throw e;

		} finally {
			driver.close();
		}
	}

	// For Premium Payment term 20 for QuaterlyModeOfPayment
	@Test(priority = 5, enabled = false)
	public void pdfConfigrationFTSPUlipGeneratingPdfoption20Quaterly() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSPoption20forQuaterly();
			JourneyScreenTwo.fillingAllTheFeildForFTSP();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			//driver.close();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			// driver.close();
			throw e;

		} finally {
			driver.close();
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

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

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

	@Test(priority = 1, enabled = false)
	public static void test() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			// HomePage.clickDashboard();
			// HomePage.clickNewApp();

			JourneyScreenSix.testItAndRejectIt();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}
