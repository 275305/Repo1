package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.model.SeverityLevel;
import uielements.HomePage;
import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.LoginPage;
import uielements.ReusableActions;
import util.AppConstant;

public class JourneyScreenFourTest extends ReusableActions {

	@Step("URL and Login userName and password")
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify the First Page")
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
			HomePage.clickNewApp();
			JourneyScreenOne.isIndianSelected();
			JourneyScreenOne.isSelfSelected();
			JourneyScreenOne.isProceedEnabled();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Description("Verify the First Page")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 1, enabled = true)
	public void ScreenOneTestIndian() throws Exception {
		try {
			// JourneyScreenOne.setAadhar(1,1,0);
			// JourneyScreenOne.clickDonthaveAadhar();
			// JourneyScreenOne.neverApplied();
			// JourneyScreenOne.jammuKashmir();
			// JourneyScreenOne.popupProceedButton();
			// JourneyScreenOne.dontHavePAN();
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

	@Description("Verify the Second and Thired Page")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 2, enabled = true)
	public void reachingScreenFourFillingAnnualIncomeform60RelatedDetailsFeilds() throws Exception
	{
		JourneyScreenThreeTest.reachingScreenFourFillingAnnualIncomeFunction();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		// JourneyScreenThree.lifestyleFeildsValidation();
		// JourneyScreenThree.lifestyleFeildsValidationForYes();
		// JourneyScreenThree.FeildsValidationHazardousForYes();
		JourneyScreenThree.scrollDownPage();
		JourneyScreenFour.selectingNoOptionForAllMedicalQusetion();
		JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5();
		JourneyScreenFour.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();


		/*
		 * JourneyScreenFour.arrowUpFunctionToScrollUpTillTop();
		 * JourneyScreenFour.
		 * idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectOption();
		 * JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation()
		 * ; JourneyScreenFour.setDateBirthdateOfApplicationWithoutValidation();
		 * JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
		 */
		// JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();

		/*
		 * JourneyScreenFour.
		 * form60RelatedDetailsIdentityProofNameDropDownValidation();
		 * JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
		 * JourneyScreenFour.identityProofIssuingAuthority(); JourneyScreenFour.
		 * idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation
		 * (); JourneyScreenFour.fillPanApplicationAcknowledgeNo();
		 * JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
		 * JourneyScreenFour.
		 * iAmExemptFromRequirementOfPANUnderFollowingProvisionsSelectFeildsValidation
		 * ();
		 */

	}

	@Test(priority = 3, enabled = false)
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



}
