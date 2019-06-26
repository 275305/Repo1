package WebTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;
import util.AppConstant;

public class RegressionSuitTest extends ReusableActions {


	@Test(priority = 1, enabled = true)
	public void loginApplicationTest() throws Exception {
		try {
			//PageFactory.initElements(driver, RegressionSuit.class);
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

	@Test(priority = 2, enabled = true)
	public void indianSelfByDefaultSelectedAndProceedEnabled() throws Exception {
		try {
			//HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.isIndianSelected();
			JourneyScreenOne.isSelfSelected();
			JourneyScreenOne.isProceedEnabled();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// TC -02 Test case for positive value for saving the first screen data
	@Test(priority = 3, enabled = true)
	public void ScreenOneTestIndianToScreenTwo() throws Exception {
		try {
			//HomePage.clickDashboard();
			//HomePage.clickNewApp();
			JourneyScreenOne.setAadhar(1, 1, 0);
			JourneyScreenOne.setPanNumber(1, 1, 1);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 4, enabled = true)
	public void checkInsurersDetailsIsPresentAndFillingTheDetailsScreenTwo() throws Exception {

			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTP();
			JourneyScreenTwo.arrowDownFunctionToScrollDown();
			JourneyScreenTwo.clickSave();
			JourneyScreenTwo.clickProceed();
			/*JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 1, 11);
			JourneyScreenTwo.selectAndCheckRelationshipWithProposerOption();*/
	}

    @Test(priority=5, enabled=true)
	public void fillingDetailsforScreenThree() throws Exception{
	   	JourneyScreenThreeTest.proposerPersonalDetailsSection();
		JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
		JourneyScreenThreeTest.proposerPersonalDetailsSection();
		JourneyScreenThreeTest.bankDetailsSectionFillingData();
		JourneyScreenThree.annualIncomePersonalDetailsDependent();
	}
	@Test(priority = 8, enabled = false)
	public void asNomineeIsMinorProvideGuardianNameDetails() throws Exception {
		JourneyScreenThree.currentDatePicker();
		JourneyScreenThree.asNomineeIsMinorProvideGuardianname();
	}

	public static void femaleGenderSelectionForValidity() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			//alwaysCloseAllChildTabs();
			//HomePage.clickDashboard();
			//HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2AndSelectingFemale();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTP();
			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 1, 11);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}


}
