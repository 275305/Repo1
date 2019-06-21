package WebTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;
import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;
import util.AppConstant;

public class JourneyScreenTwoTest extends ReusableActions {
	
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify the URL of The Application")
	@Test(priority = 0, enabled = true)
	public void Indian() throws Exception {

		try {
			final String PATH = System.getProperty("user.dir");
			System.setProperty(AppConstant.INPUT_CHROME_DRIVER, PATH + AppConstant.INPUT_WEB_DRIVER);
			driver = new ChromeDriver();
			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();
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
	 /*Filling all the information for Screen one */
	@Test(priority = 1, enabled = true)
	public void ScreenOneTestIndian() throws Exception {
		try {
			// JourneyScreenOne.setAadhar(1,1,0);
			// JourneyScreenOne.clickDonthaveAadhar();
			// JourneyScreenOne.neverApplied();
			// JourneyScreenOne.jammuKashmir();
			// JourneyScreenOne.popupProceedButton();
			//JourneyScreenOne.dontHavePAN();
			JourneyScreenOne.setPanNumber(1,1,1);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}
   /*Filling all the information for Screen two */
	@Test(priority = 2, enabled = true)
	public void getInformationForScreenTwo() throws Exception {
		try {
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.arrowDownFunctionToScrollDown();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();
			JourneyScreenTwo.singlePayLifeCoverForm1();
									
		} catch (Exception e) {
			logger.error("Test case Failed in Filling field for screen two" + e.getMessage());
		}
	}
    
	/*Filling all the information for Screen three*/
	@Test(priority=3,enabled=true)
	public void getInformationForScreenThree() throws Exception{
		try {
		JourneyScreenThree.setFathersName(9, 1, 0);
		
		JourneyScreenThree.setMothersName(9, 1, 1);
		JourneyScreenThree.maritalStatusDropDownListValidation();
		JourneyScreenThree.educationDropDownListValidation();
		JourneyScreenThree.industryDropDownListValidation();
		JourneyScreenThree.industryDropDownListOptionSelectionValidation();
		JourneyScreenThree.organizationTypeDropDownListValidation();
		JourneyScreenThree.occupationDropDownListValidation();
		}
		catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
		
	}
	/* describing Insurers details on screen two and three */
	@Test(priority = 4, enabled = false)
	public void checkInsurersDetailsIsPresentAndFillingTheDetailsScreenTwo() throws Exception {
		try {
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.checkAllTheInsurersDetailsFeildsPresentOrNot();
			JourneyScreenTwo.checkAndFillIssurersNameValidation(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.checkDateOfBirthFormatFutureDateRestrictionSetDateBirthInsurersDetails();
			JourneyScreenTwo.selectAndCheckRelationshipWithProposerOption();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 5, enabled = false)
	public void LE2ServiceIntegrationForTradProducts() throws Exception {
		try {
			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenTwo.selectByDropdown();
			Thread.sleep(1000);
			JourneyScreenTwo.setHouseNo(3, 1, 3);
			JourneyScreenTwo.setRoadNo(3, 1, 4);
			JourneyScreenTwo.setVillageTown(3, 1, 5);
			JourneyScreenTwo.setCountry(3, 1, 6);
			JourneyScreenTwo.setState(3, 1, 7);
			JourneyScreenTwo.setCity(3, 1, 8);
			JourneyScreenTwo.setPinCode(3, 1, 9);
			JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
			// JourneyScreenOne.checkAndFillIssurersNameValidation(1, 1, 8);
			// JourneyScreenOne.insurersGender();
			// JourneyScreenThree.setDateBirthInsurersDetails(1, 1, 9);
			// JourneyScreenOne.selectAndCheckRelationshipWithProposerOption();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownCIP();
			Thread.sleep(1000);
			JourneyScreenTwo.fillingAllTheRequiredFeildsForCIP();
			String winHandleBeforeSubmit = driver.getWindowHandle();
			System.out.println(winHandleBeforeSubmit);
			JourneyScreenTwo.clickSubmitButton();
			Thread.sleep(5000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_W);
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 6, enabled = false)
	public void asNomineeIsMinorProvideGuardianNameDetails() throws Exception {
		JourneyScreenThree.currentDatePicker();
		JourneyScreenThree.asNomineeIsMinorProvideGuardianname();
	}

	@Test(priority = 7, enabled = false)
	public void nriFeildsValidation() throws Exception {
		JourneyScreenTwo.ScreenOneTestNRIFunctionToReachScreenTwo();
		JourneyScreenTwo.fillingFeildsForScreenTwo();
		JourneyScreenTwo.checkErrorMessageOfOutsideIndia();
		JourneyScreenTwo.setCountryAndSelecting2ndOption(3, 1, 6);
		JourneyScreenTwo.fillingAllTheFeildsAfterChangingCountry();
		JourneyScreenTwo.fillingFeildsForScreenTwoProposerCommunicationAddress();
		JourneyScreenThree.nriDetailsJourneyScreenThree();
		JourneyScreenThree.countryCurrentlyResidingSmartSearch(3, 1, 6);
		JourneyScreenThree.dateOfLatestEntryToIndia();
		JourneyScreenThree.birthCountryScreenThreeNri(3, 1, 6);
		JourneyScreenThree.residenceCountryAsPerTaxLaws(3, 1, 6);
		JourneyScreenThree.doYouHaveFTINYesNoFeildsValidation();

	}

	@Test(priority = 8, enabled = false)
	public void checkCommunicationAndPermanentAddress() throws Exception {
		// JourneyScreenOneTest.fillingScreenOneFeildsFunctionForNRIDependent();
		JourneyScreenTwo.ScreenOneTestNRIFunctionToReachScreenTwo();
		JourneyScreenTwo.fillingFeildsForScreenTwo();
		JourneyScreenTwo.checkErrorMessageOfOutsideIndia();
		JourneyScreenTwo.setCountryAndSelecting2ndOption(3, 1, 6);
		JourneyScreenTwo.fillingAllTheFeildsAfterChangingCountry();
		JourneyScreenTwo.fillingFeildsForScreenTwoProposerCommunicationAddressWithoutIllustration();
	}

	@Severity(SeverityLevel.CRITICAL)
	@Description("Navigating to the JourneyScreenOne")
	@Test(priority = 9, enabled = false)
	public void nriFeildsValidationForDependentOption() throws Exception {
		//JourneyScreenOneTest.fillingScreenOneFeildsFunctionForDependent();
		// ScreenOneTestNRIFunctionToReachScreenTwo();
		JourneyScreenTwo.fillingFeildsForScreenTwo();
		/* proposer communication code require */
		JourneyScreenTwo.checkAllTheInsurersDetailsFeildsPresentOrNot();
		JourneyScreenTwo.checkAndFillIssurersNameValidation(1, 1, 8);
		JourneyScreenTwo.insurersGenderFemale();
		JourneyScreenTwo.checkDateOfBirthFormatFutureDateRestrictionSetDateBirthInsurersDetails();
		JourneyScreenTwo.selectAndCheckRelationshipWithProposerOption();

		JourneyScreenTwo.traditional();
		JourneyScreenTwo.selectByDropdownSTPDependent();
		JourneyScreenTwo.fillingAllTheRequiredFeildsForSTPDependent();
		JourneyScreenTwo.clickProceedPageTwo();

		// premiumCommitmentMIAPYesOptionSelection.click();
	}

	@Test(priority = 10, enabled = false)
	public void leftScript() throws Exception {
		JourneyScreenThree.checkPDFIsOpenedOrNotCheckMsgNRI();
		JourneyScreenThree.nriDetailsJourneyScreenThree();
		JourneyScreenThree.countryCurrentlyResidingSmartSearch(3, 1, 6);
		JourneyScreenThree.dateOfLatestEntryToIndia();
		JourneyScreenThree.birthCountryScreenThreeNri(3, 1, 6);
		JourneyScreenThree.residenceCountryAsPerTaxLaws(3, 1, 6);
		JourneyScreenThree.doYouHaveFTINYesNoFeildsValidation();

		JourneyScreenThree.checkAllTheIsurersDetailsFeildsDropDownListIsPresentForScreenThree();
		JourneyScreenThree.nriDetailsWithLifeInsuredOtherDetailsJourneyScreenThree();

		JourneyScreenThree.countryCurrentlyResidingSmartSearchInsurer(3, 1, 6);
		JourneyScreenThree.dateOfLatestEntryToIndiaInsurer();
		JourneyScreenThree.birthCountryScreenThreeNriInsurer(3, 1, 6);
		JourneyScreenThree.residenceCountryAsPerTaxLawsInsurer(3, 1, 6);
		JourneyScreenThree.doYouHaveFTINYesNoFeildsValidationInsurer();
	}

}
