package WebTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;

public class JourneyScreenTwoTest extends ReusableActions {

	@BeforeTest
	@Parameters(value = { "browser", "version", "platform", "testrun" })
	public void setUp(String browser, String version, String platform, String testrun) throws Exception {
		String testRun = testrun;
		/* String testRun1=testrun1; */
		// if (testRun.equals("run"))
		if (testRun.equals("runbsw")) {

			try {
				DesiredCapabilities capability = new DesiredCapabilities();
				capability.setCapability("platform", platform);
				capability.setCapability("browserName", browser);
				capability.setCapability("browserVersion", version);
				// capability.setCapability("browserstack.local", "true");
				capability.setCapability("browserstack.debug", "true");
				capability.setCapability("project", "MaxlifeInsurance");
				capability.setCapability("build", "BrowserStack_WebSeries1");
				driver = new RemoteWebDriver(
						new URL("https://kanchangupta2:xWbVkws9u8oEYR1Nsqx6@hub-cloud.browserstack.com/wd/hub"),
						capability);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				ReusableActions.logStep("=========Execution Started on Browsers=========");
				System.out.println("Execution Started on : " + browser + " " + version + " " + platform);
				ReusableActions.attachScreen(driver);
			} catch (Exception e) {
				// System.out.println("Test case failed: " + e.getMessage());
				throw e;
			}
			// break;
		} else if (testRun.equals("run"))
		// else if(testRun.equals("runfa"))
		{
			// @BeforeClass
			// public void launchBrowser() throws Exception{

			try {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Matrix\\AutomationQA\\automationqa\\src\\test\\resources\\driver\\chromedriver.exe");
				// System.setProperty("webdriver.chrome.driver",
				// "D:\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				// logger.error("Test case failed: " + e.getMessage());
				throw e;
			}

		}
	}

	// TC -01 Verify the by default status of Nationality, Policy for and Proceed
	// button on Journey Screen one
	@Test(priority = 0, enabled = true)
	public void Indian() throws Exception {

		try {
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

	// TC -02 Test case for positive value for saving the first screen data
	@Test(priority = 1, enabled = true)
	public void ScreenOneTestIndian() throws Exception {
		try {

			// JourneyScreenOne.setAadhar(1,1,0);
			JourneyScreenOne.clickDonthaveAadhar();
			JourneyScreenOne.neverApplied();
			JourneyScreenOne.jammuKashmir();
			JourneyScreenOne.popupProceedButton();
			JourneyScreenOne.dontHavePAN();
			// JourneyScreenOne.setPanNumber(1,1,1);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 2, enabled = false)
	public void screenTwoProceedButtonEnablility() throws Exception {
		try {
			JourneyScreenTwo.isProceedEnabled();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}



	public static void fillingFeildsScreenTwoFunction() throws Exception {
		try {
			JourneyScreenOneTest.fillingScreenOneFeildsFunctionForDependent();
			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenTwo.selectByDropdown();
			JourneyScreenTwo.setHouseNo(3, 1, 3);
			JourneyScreenTwo.setRoadNo(3, 1, 4);
			JourneyScreenTwo.setVillageTown(3, 1, 5);
			JourneyScreenTwo.setCountry(3, 1, 6);
			JourneyScreenTwo.setState(3, 1, 7);
			JourneyScreenTwo.setCity(3, 1, 8);
			JourneyScreenTwo.setPinCode(3, 1, 9);
			JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	public static void fillingInsurersDetailsScreenTwo() throws Exception {
		try {
			JourneyScreenTwo.fillingIssurersName(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.setDateBirthInsurersDetails(1, 1, 9);
			JourneyScreenTwo.selectRelationshipWithProposerOption();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// Test case---> describing Insurers details on screen two and three,Select
	// dependent on first screen.
	@Test(priority = 4, enabled = true)
	public void checkInsurersDetailsIsPresentAndFillingTheDetailsScreenTwo() throws Exception {
		try {
			fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.checkAllTheInsurersDetailsFeildsPresentOrNot();
			JourneyScreenTwo.checkAndFillIssurersNameValidation(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.checkDateOfBirthFormatFutureDateRestrictionSetDateBirthInsurersDetails(1, 1, 9);
			// Test case--> describing the dropDown list of relationship with proposer First
			// screen--Select dependent and check on Insurers Details section
			JourneyScreenTwo.selectAndCheckRelationshipWithProposerOption();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	public static void fillingAllTheRequiredFeildForScreen2WithoutFirstName() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			// JourneyScreenTwo.setFirstName(3, 1, 0);
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

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 3, enabled = false)
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

	@Test(priority = 4, enabled = false)
	public void asNomineeIsMinorProvideGuardianNameDetails() throws Exception {
		JourneyScreenThree.currentDatePicker();
		JourneyScreenThree.asNomineeIsMinorProvideGuardianname();

	}
}
