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
import uielements.LoginPage;
import uielements.POSVFlowForSAPMIAP;
import uielements.ReusableActions;
public class POSVFlowForSAPMIAPTest extends ReusableActions {

	@BeforeTest
	@Parameters(value = { "browser", "version", "platform","testrun"})
	public void setUp(String browser, String version, String platform,String testrun) throws Exception {
		String testRun= testrun;
		/*String testRun1=testrun1;*/
			//if (testRun.equals("run"))
				if (testRun.equals("runbsw")) 
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
				//System.out.println("Test case failed: " + e.getMessage());
				throw e;
			}
			//break;
		}
			
		else 
			//if(testRun.equals("runfa")) 
				if(testRun.equals("run"))
			{
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
			PageFactory.initElements(driver, POSVFlowForSAPMIAPTest.class);
			prop = ReusableActions.readProperties();

			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");
			/*HomePage.clickNewApp();
			JourneyScreenOnePANOCR.prePopulationOCRAadhar();
			JourneyScreenOnePANOCR.setPanNumber(1, 1, 1);
			JourneyScreenOnePANOCR.setMobNumberOCR(1, 1, 2);
			JourneyScreenOnePANOCR.setEmailId(1, 1, 3);
			JourneyScreenOnePANOCR.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOnePANOCR.clickProceed();
			Thread.sleep(4000);
			JourneyScreenOnePANOCR.checkPrePopulatedDataAfterAadhaarOCR();*/

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Test(priority = 2, enabled = false)
	public void PANOCRPrepopulatedDataValidation() throws Exception {
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
			POSVFlowForSAPMIAP.setAadhar(1, 1, 0);
			Thread.sleep(5000);
			POSVFlowForSAPMIAP.prePopulationPanOCR();
			POSVFlowForSAPMIAP.setMobNumber(1, 1, 2);
			POSVFlowForSAPMIAP.setEmailId(1, 1, 3);
			POSVFlowForSAPMIAP.setPreIssuanceNumber(1, 1, 4);
			POSVFlowForSAPMIAP.clickProceed();
			Thread.sleep(4000);
			POSVFlowForSAPMIAP.checkPrePopulatedDataAfterPANOCR();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}
	
/*	@Test(priority = 8, enabled = false)
	public static void checkPOSVFlowForSAP() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOnePANOCR.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
			JourneyScreenTwo.checkPOSVforSAPPremiumCommitment(3,1,19);
			JourneyScreenThreeTest.proposerPersonalDetailsSection();
			JourneyScreenTwo.proposerPersonalDetailsIncome(9,1,10);
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenOne.fillingAnnualIncomeTOProceed(0,1,3);
			Thread.sleep(1000);
			JourneyScreenThree.form60RelatedDetailsIdentityProofNameOptionSelection();
			JourneyScreenThree.setIdentityProofNumberValidation(0,1,6);
			JourneyScreenThree.identityProofIssuingAuthority();
			JourneyScreenThree.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();
			
			JourneyScreenThree.arrowDownFunctionToScrollDownTillBottom();
			JourneyScreenThree.criticalIllnessNoOption();
			JourneyScreenThree.hazardousActivitiesNo();
			JourneyScreenThree.selectCriminalChargesNo();
			JourneyScreenThree.feetInchesKgsSelectionToMoveToScreen5POSV();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
		//	JourneyScreenOnePANOCR.productDetails();
			//JourneyScreenThree.identityProofIssuingAuthorityOptionSelection();
			//JourneyScreenThree.fillPanApplicationAcknowledgeNowWithoutValidation();
			//JourneyScreenThree.setDateBirthdateOfApplicationWithoutValidation(1,1,9);
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}*/
	
	@Test(priority = 8, enabled = false)
	public static void checkPOSVFlowForSAPWithMutipleFirstName() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {
			POSVFlowForSAPMIAP.posvForSAPMultipleFirstNameTest();
			
			   	   
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
	
	
	
	@Test(priority = 8, enabled = true)
	public static void checkPOSVFlowForMIAPWithMutipleFirstName() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		try {
			POSVFlowForSAPMIAP.posvForMIAPMultipleFirstNameTest();
			
			   	   
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}}
}
