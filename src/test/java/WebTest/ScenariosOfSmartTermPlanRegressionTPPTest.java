package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
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

public class ScenariosOfSmartTermPlanRegressionTPPTest extends ReusableActions {



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
	public static void singlePayLifeCoverForm1TPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			ScenariosOfSmartTermPlanRegressionTest.singlePayLifeCoverForm1PDFGenration();
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

	public static void singlePayIncomeInflationProtectorForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			fillingDataScreenTwoForSTP();

			JourneyScreenTwo.singlePayIncomeInflationProtectorForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
	public static void singlePayIncomeInflationProtectorForm1PDFGenrationTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			singlePayIncomeInflationProtectorForm1PDFGenration();
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

	public static void singlePayIncreasingCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			fillingDataScreenTwoForSTP();
			JourneyScreenTwo.singlePayIncreasingCoverProtectorForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 3, enabled = false)
	public static void singlePayIncreasingCoverForm1PDFGenrationTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			singlePayIncreasingCoverForm1PDFGenration();
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

	public static void singlePayIncomeProtectorrForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			fillingDataScreenTwoForSTP();
			JourneyScreenTwo.singlePayIncomeProtectorForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 4, enabled = false)
	public static void singlePayIncomeProtectForm1PDFGenrationTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			singlePayIncomeProtectorrForm1PDFGenration();
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


	public static void fillingDataScreenTwoForSTP() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			// alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void singlePayLifeCoverIncomeForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			fillingDataScreenTwoForSTP();
			JourneyScreenTwo.singlePayLifeCoverIncomeForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void singlePayLifeCoverIncreasingIncomeForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			fillingDataScreenTwoForSTP();
			JourneyScreenTwo.singlePayLifeCoverIncreasingIncomeForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void singlePayReducingCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			fillingDataScreenTwoForSTP();
			JourneyScreenTwo.singlePayReducingCoverIncomeForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 5, enabled = false)
	public static void singlePayLifeCoverIncomeForm1PDFGenrationTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			singlePayLifeCoverIncomeForm1PDFGenration();
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
	public static void singlePayLifeCoverIncreasingIncomeForm1PDFGenrationTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			singlePayLifeCoverIncreasingIncomeForm1PDFGenration();
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

			JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
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

			JourneyScreenThree.handle_window();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}
	
	@Test(priority = 7, enabled = false)
	public static void singlePayReducingCoverForm1PDFGenrationTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			singlePayReducingCoverForm1PDFGenration();
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

	@AfterTest
	public void AfterTest() {
		System.out.println("After Class will always execute later to After Method and Test method");
		driver.close();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class will always execute later to After Method and Test method");
		driver.quit();
	}

}
