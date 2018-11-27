package WebTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import uielements.HomePage;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenOnePANOCR;
import uielements.ReusableActions;
import uielements.loginpage;

public class JourneyScreenOnePANOCRTest extends ReusableActions {

	@BeforeTest
	@Parameters(value = { "browser", "version", "platform","testrun"})
	public void setUp(String browser, String version, String platform,String testrun) throws Exception {
		String testRun= testrun;
		/*String testRun1=testrun1;*/
			if (testRun.equals("run")) {
			
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
				//System.out.println("Test case failed: " + e.getMessage());
				throw e;
			}
			//break;
		}
			
		else if(testRun.equals("runfa")) {
			// @BeforeClass
			//public void launchBrowser() throws Exception{

			try {
				//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", "C:\\Matrix\\AutomationQA\\automationqa\\src\\test\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				//logger.error("Test case failed: " + e.getMessage());
				throw e;
			}

		}
	}

	// TC -02 Test case for positive value for saving the first screen data
	@Test(priority = 1, enabled = true)
	public void aadhaarOCRPrepopulatedDataValidation() throws Exception {
		try {
			PageFactory.initElements(driver, JourneyScreenOnePANOCRTest.class);
			prop = ReusableActions.readProperties();

			driver.get(prop.getProperty("SampleURL"));
			loginpage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			loginpage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");
			HomePage.clickNewApp();
			JourneyScreenOnePANOCR.prePopulationOCRAadhar();
			JourneyScreenOnePANOCR.setPanNumber(1, 1, 1);
			JourneyScreenOnePANOCR.setMobNumberOCR(1, 1, 2);
			JourneyScreenOnePANOCR.setEmailId(1, 1, 3);
			JourneyScreenOnePANOCR.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOnePANOCR.clickProceed();
			Thread.sleep(4000);
			JourneyScreenOnePANOCR.checkPrePopulatedDataAfterAadhaarOCR();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 2, enabled = true)
	public void PANOCRPrepopulatedDataValidation() throws Exception {
		try {
			prop = ReusableActions.readProperties();

			driver.get(prop.getProperty("SampleURL"));
			loginpage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			loginpage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOnePANOCR.setAadhar(1, 1, 0);
			Thread.sleep(5000);
			JourneyScreenOnePANOCR.prePopulationPanOCR();
			JourneyScreenOnePANOCR.setMobNumber(1, 1, 2);
			JourneyScreenOnePANOCR.setEmailId(1, 1, 3);
			JourneyScreenOnePANOCR.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOnePANOCR.clickProceed();
			Thread.sleep(4000);
			JourneyScreenOnePANOCR.checkPrePopulatedDataAfterPANOCR();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

}
