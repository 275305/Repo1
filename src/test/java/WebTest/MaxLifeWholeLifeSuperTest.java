package WebTest;

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
import uielements.JourneyScreenFour;
import uielements.JourneyScreenSix;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;

public class MaxLifeWholeLifeSuperTest extends ReusableActions {

	@BeforeTest
	@Parameters(value = { "browser", "version", "platform", "testrun" })
	public void setUp(String browser, String version, String platform, String testrun) throws Exception {
		String testRun = testrun;
		/* String testRun1=testrun1; */
		if (testRun.equals("run")) {
			// if (testRun.equals("runbsw")) {

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

		else if (testRun.equals("runfa")) {
			// if (testRun.equals("run")) {
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
	}

	@Test(priority = 0, enabled = true)
	public void India() throws Exception {
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
	public void CheckproductConfigrationWLSGeneratingPdfErrorMessage() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownWLS();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForWLS();
			JourneyScreenTwo.premiumCommitmentWLS();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = true)
	public static void CheckproductConfigrationWLSGeneratingPdf() throws Exception {
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
			JourneyScreenTwo.checkPOSVforWLSAnnualIncome(3, 4, 11);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 1, enabled = true)
	public static void checkproductConfigrationWLSGeneratingPdfTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			CheckproductConfigrationWLSGeneratingPdf();
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
