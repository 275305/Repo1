package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenSix;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;
import util.AppConstant;

public class MaxLifeSuperTermPlanTest extends ReusableActions {

	@Test(priority = 0, enabled = true)
	public void India() throws Exception {
		try {
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

	@Test(priority = 1, enabled = false)
	public static void CheckproductConfigrationSTPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			// alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			// HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTP();
			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 4, 11);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 1, enabled = true)
	public static void CheckproductConfigrationSTPTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			CheckproductConfigrationSTPGeneratingPdf();
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

			JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
			JourneyScreenFour.criticalIllnessNoOption();
			JourneyScreenFour.hazardousActivitiesNo();
			JourneyScreenFour.selectCriminalChargesNo();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			JourneyScreenSix.fetchingProposalNumberFromUI();
			JourneyScreenThree.gmailFunctionality();
			JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();
			JourneyScreenThreeTest.DeletingALLInboxMailForTppPushClose();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}