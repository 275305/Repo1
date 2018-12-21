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
import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.LoginPage;
import uielements.ReusableActions;

public class JourneyScreenFourTest extends ReusableActions {

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
		}

		else
		// if (testRun.equals("runfa"))
		if (testRun.equals("run")) {
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
		//	JourneyScreenThree.lifestyleFeildsValidation();
		//	JourneyScreenThree.lifestyleFeildsValidationForYes();
		//	JourneyScreenThree.FeildsValidationHazardousForYes();
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