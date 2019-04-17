package WebTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.LoginPage;
import uielements.ReusableActions;

public class JourneyScreenOneTest extends ReusableActions {

	@BeforeTest

	@Parameters(value = { "browser", "version", "platform", "testrun" })
	public void setUp(String browser, String version, String platform, String testrun) throws Exception {
		String testRun = testrun;
		/* String testRun1=testrun1; */
		if (testRun.equals("run"))
		// if (testRun.equals("runbsw"))
		{

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
		}

		else
		if (testRun.equals("runfa"))
			// if (testRun.equals("run"))
			// @BeforeClass
			// public void launchBrowser() throws Exception{

			try {

				// System.setProperty("webdriver.chrome.driver",
				// "D:\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver",
						"C:\\Matrix\\AutomationQA\\automationqa\\src\\test\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				// logger.error("Test case failed: " + e.getMessage());
				throw e;
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
	@Test(priority = 1, enabled = false)
	public static void ScreenOneTestIndianToScreenTwo() throws Exception {
		try {
			System.out.println(
					"-------------------ScreenOneTestIndianToScreenTwo Started----------------------------------------");
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.dontHavePAN();
			// JourneyScreenOne.setAadhar(1, 1, 0);
			// JourneyScreenOne.setPanNumber(1, 1, 1);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();
			System.out.println(
					"-------------------ScreenOneTestIndianToScreenTwo Finished----------------------------------------");

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 2, enabled = false)
	public void ScreenOneTestIndianMultipleData() throws Exception {
		try {
			System.out.println(
					"-------------------ScreenOneTestIndianMultipleData Started----------------------------------------");
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.checkAdhaarErrorMsgMultipleDataIndian();
			JourneyScreenOne.checkPANErrorMsgWithMultipleData();
			JourneyScreenOne.checkPhoneNumberErrorMsgWithMultipleData();
			JourneyScreenOne.checkEmailErrorMsgWithMultipleDataIndian();
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();
			System.out.println(
					"-------------------ScreenOneTestIndianMultipleData Finished----------------------------------------");

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// TC -02 Test case for positive value for saving the first screen data
	@Test(priority = 3, enabled = false)
	public void ScreenOneTestNRIWithMultipleDataValidation() throws Exception {
		try {

			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.residentialsStatusNRI();
			JourneyScreenOne.nationalityNRI();
			JourneyScreenOne.setPassportNumber(1, 1, 5);
			JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
			JourneyScreenOne.visaValidTillMultipleData();
			JourneyScreenOne.passportIssuingCountry(1, 1, 6);
			JourneyScreenOne.passportExpiryDateMultiple();
			JourneyScreenOne.checkAdhaarErrorMsgMultipleDataNRI();
			JourneyScreenOne.checkPANErrorMsgWithMultipleData();
			// JourneyScreenOne.isdCode(1, 1, 7);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.checkEmailErrorMsgWithMultipleDataNRI();
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	public static void ScreenOneTestNRIFunctionToReachScreenTwo() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.residentialsStatusNRI();
			JourneyScreenOne.nriNationality();
			JourneyScreenOne.setPassportNumber(1, 1, 5);
			JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
			JourneyScreenOne.visaValidTillSingleData();
			JourneyScreenOne.passportIssuingCountry(1, 1, 6);
			JourneyScreenOne.passportExpiryDateForSingleData();
			JourneyScreenOne.setAadhar(1, 1, 0);
			JourneyScreenOne.setPanNumber(1, 1, 1);
			// JourneyScreenOne.isdCode(1, 1, 7);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// Test case---> describing all the fields are present on the screen first when
	// NRI is selected.

	@Test(priority = 4, enabled = false)
	public void checkNRIFeildsDisabled() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.isAllTheFeildsOfNRIDisplayed();

			// Test case---> drop down list for visa when NRI is selected on first screen.

			JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	public static void fillingScreenOneFeildsFunctionForDependent() throws Exception {
		try {
			// HomePage.clickDashboard();
			// HomePage.clickNewApp();
			JourneyScreenOne.dependentOption();
			// JourneyScreenOne.clickDonthaveAadhar();
			// JourneyScreenOne.neverApplied();
			// JourneyScreenOne.jammuKashmir();
			// JourneyScreenOne.popupProceedButton();
			JourneyScreenOne.dontHavePAN();
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	public static void fillingScreenOneFeildsFunctionForNRIDependent() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.residentialsStatusNRI();
			JourneyScreenOne.nationalityNRI();
			JourneyScreenOne.setPassportNumber(1, 1, 5);
			JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
			JourneyScreenOne.visaValidTillSingleData();
			JourneyScreenOne.passportIssuingCountry(1, 1, 6);
			JourneyScreenOne.passportExpiryDateForSingleData();
			JourneyScreenOne.nriDependentOptionSElection();
			// JourneyScreenOne.setAadhar(1, 1, 0);
			// JourneyScreenOne.setPanNumber(1, 1, 1);
			// JourneyScreenOne.isdCode(1, 1, 7);
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
	public static void internationalMobileNumberValidation() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.residentialsStatusNRI();
			JourneyScreenOne.internationalMobileNumberMinErrorValidation(9, 1, 11);
			JourneyScreenOne.internationalMobileNumberMinValidation(9, 2, 11);
			JourneyScreenOne.internationalMobileNumberMaxErrorValidation(9, 3, 11);
			JourneyScreenOne.internationalMobileNumberMaxValidation(9, 4, 11);

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 2, enabled = true)
	public static void indianMobileNumberValidation() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.nationalMobileNumberMinErrorValidation(9, 5, 11);
			JourneyScreenOne.nationalMobileNumberMinValidation(9, 6, 11);
			JourneyScreenOne.internationalMobileNumberMaxErrorValidation(9, 3, 11);
			JourneyScreenOne.internationalMobileNumberMaxValidation(9, 4, 11);

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

}
