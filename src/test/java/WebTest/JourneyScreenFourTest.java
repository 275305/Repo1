package WebTest;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.LoginPage;
import uielements.ReusableActions;

public class JourneyScreenFourTest extends ReusableActions {

	@Test(priority = 0, enabled = true)
	public void India() throws Exception {
		try {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\lib\\Drivers\\chromedriver.exe");
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
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.isIndianSelected();
			JourneyScreenOne.isSelfSelected();
			JourneyScreenOne.isProceedEnabled();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 20, enabled = false)
	public void lifeStyleScreeenFourValidation() throws Exception

	{
		try {
			JourneyScreenThreeTest.fillingPersonalDetailsFunction();
			JourneyScreenFour.arrowDownFunctionToScrollDown();
			// JourneyScreenThree.lifestyleFeildsValidation();
			// JourneyScreenThree.lifestyleFeildsValidationForYes();
			// JourneyScreenThree.FeildsValidationHazardousForYes();
			JourneyScreenFour.selectCriminalChargesNo();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5();
			JourneyScreenFour.arrowUpFunctionToScrollUpTillTop();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectOption();
			JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			JourneyScreenFour.setDateBirthdateOfApplicationWithoutValidation();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 1, enabled = true)
	public void reachingScreenFourFillingAnnualIncomeform60RelatedDetailsFeilds() throws Exception

	{
		try {
			JourneyScreenThreeTest.reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameDropDownValidation();
			JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation();
			JourneyScreenFour.fillPanApplicationAcknowledgeNo();
			JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
			JourneyScreenFour.iAmExemptFromRequirementOfPANUnderFollowingProvisionsSelectFeildsValidation();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

}
