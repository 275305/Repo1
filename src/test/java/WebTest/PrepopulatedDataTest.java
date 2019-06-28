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
import uielements.ReusableActions;
import util.AppConstant;

public class PrepopulatedDataTest extends ReusableActions {

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

	public static void fillingAllTheFeildsForSAPProduct() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
			JourneyScreenTwo.checkPOSVforSAPPremiumCommitment(3, 1, 19);
			/*
			 * JourneyScreenTwo.selectByDropdownCIP(); Thread.sleep(1000);
			 * JourneyScreenTwo.fillingAllTheRequiredFeildsForCIP();
			 * JourneyScreenTwo.clickSubmitButton();
			 *
			 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_CONTROL);
			 * robot.keyPress(KeyEvent.VK_W); Thread.sleep(1000); //
			 * JourneyScreenThree.generatingPDFToReachToScreenThree(); //
			 * CheckproductConfigrationSAPGeneratingPdf();
			 */
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void reachingScreenFourFillingAnnualIncomeFunction() throws Exception

	{
		try {

			Thread.sleep(1000);
			JourneyScreenThreeTest.proposerPersonalDetailsSection();
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

	@Test(priority = 1, enabled = false)
	public void prepopualatedForSAPProductForAllScreen() throws Exception

	{
		try {
			fillingAllTheFeildsForSAPProduct();
			reachingScreenFourFillingAnnualIncomeFunction();

			JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameDropDownValidation();
			JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation();

			// JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			// JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
			JourneyScreenFour.identityProofIssuingAuthorityOptionSelection();
			JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillProceed();

			JourneyScreenFour.selectingNoOptionForAllMedicalQusetionIndian();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			// JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();

			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();
			JourneyScreenSix.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenSix();
			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void CheckproductConfigrationSTPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSTP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSTP();
			JourneyScreenTwo.checkPOSVforSTPPremiumCommitment(3, 1, 11);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
	public void prepopualatedForSTPProductForAllScreen() throws Exception

	{
		try {

			CheckproductConfigrationSTPGeneratingPdf();
			reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameDropDownValidation();
			JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation();

			// JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			// JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
			JourneyScreenFour.identityProofIssuingAuthorityOptionSelection();
			JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillProceed();

			JourneyScreenFour.selectingNoOptionForAllMedicalQusetionIndian();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			// JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();

			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllDropDownValueSAPScreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();
			JourneyScreenSix.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenSix();
			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllDropDownValueSAPScreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public void CheckproductConfigrationMIAPGeneratingPdf() throws Exception {
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForMIAP();
			JourneyScreenTwo.premiumCommitmentDesiredAnnualIncomeAnnualIncome(3, 1, 11);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 3, enabled = false)
	public void prepopualatedForMIAPProductForAllScreen() throws Exception

	{
		try {

			CheckproductConfigrationMIAPGeneratingPdf();

			reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameDropDownValidation();
			JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation();

			// JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			// JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
			JourneyScreenFour.identityProofIssuingAuthorityOptionSelection();
			JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillProceed();

			JourneyScreenFour.selectingNoOptionForAllMedicalQusetionIndian();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			// JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();

			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllDropDownValueMIAPScreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();
			JourneyScreenSix.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenSix();
			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllDropDownValueMIAPScreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	public void CheckproductConfigrationWLSGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownWLS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForWLS();
			JourneyScreenTwo.premiumCommitmentWLS(3, 1, 11);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 4, enabled = false)
	public void prepopualatedForWLSroductForAllScreen() throws Exception

	{
		try {

			CheckproductConfigrationWLSGeneratingPdf();

			reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameDropDownValidation();
			JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation();

			// JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			// JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
			JourneyScreenFour.identityProofIssuingAuthorityOptionSelection();
			JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillProceed();

			JourneyScreenFour.selectingNoOptionForAllMedicalQusetionIndian();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			// JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();

			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllDropDownValueWLSScreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();
			JourneyScreenSix.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenSix();
			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllDropDownValueWLSScreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public void CheckproductConfigrationFTSPUlipGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			Thread.sleep(800);
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSP();
			JourneyScreenTwo.fillingAllTheFeildForFTSP();
			// JourneyScreenTwo.clickSubmitButton();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 1, enabled = false)
	public void prepopualatedForFTSProductForAllScreen() throws Exception

	{
		try {

			CheckproductConfigrationFTSPUlipGeneratingPdf();

			reachingScreenFourFillingAnnualIncomeFunction();
			JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();
			JourneyScreenFour.form60RelatedDetailsIdentityProofNameDropDownValidation();
			JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation();

			// JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			// JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
			JourneyScreenFour.identityProofIssuingAuthorityOptionSelection();
			JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation();
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillProceed();

			JourneyScreenFour.selectingNoOptionForAllMedicalQusetionIndian();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			// JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();

			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllDropDownValueFTSPcreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();
			JourneyScreenSix.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenSix();
			JourneyScreenFour.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenFour();
			JourneyScreenThree.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenThree();
			JourneyScreenTwo.getAllDropDownValueFTSPcreenTwo();
			JourneyScreenOne.getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}

	}

}