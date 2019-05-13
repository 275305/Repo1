package WebTest;

import java.net.URL;
import java.time.LocalDate;
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

public class MaxLifeSmartTermPlanTest extends ReusableActions {

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

			LocalDate datw = LocalDate.now().minusYears(44);
			System.out.println(datw);
			LocalDate moreThan44 = datw.minusDays(1);
			System.out.println(moreThan44);


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

	// illustration verification for all premium type with WOP rider
	@Test(priority = 1, enabled = false)
	public static void CheckproductConfigrationSmartTermPlanGeneratingPdfForAllPremiumType() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSmartTermPlan();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void genertaingPDFForTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.smartTermPlanPremiumTypePDF();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Illustration for all rider of limited pay
	@Test(priority = 2, enabled = false)
	public static void allRiderLimitedPayPremiumType() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSmartTermPlanLimitedPayAllRider();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Illustration for all rider of regular pay
	@Test(priority = 3, enabled = false)
	public static void allRiderRegularPay() throws Exception
	{
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSmartTermPlanRegularPayAllRider();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Illustration for all rider of pay till 60
	@Test(priority = 4, enabled = false)
	public static void allRiderPayTill60() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForSmartTermPlanRegularPayTill60();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// checking illustration generation for all death beneifit options for pay till
	// 60 premium type
	@Test(priority = 5, enabled = false)
	public static void deathBenefitAllOptionForPayTill60() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheFeildForDeathBenifitRegularPayTill60();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// checking illustration generation for all death beneifit options for pay
	// premium type
	@Test(priority = 6, enabled = false)
	public static void deathBenefitAllOptionForSinglePay() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheFeildForDeathBenifitSinglePay();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// checking illustration generation for all death beneifit options for limited
	// pay
	// premium type
	@Test(priority = 7, enabled = false)
	public static void deathBenefitAllOptionForLimitedPay() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheFeildForDeathBenifitLimitedPay();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// checking illustration generation for all death beneifit options for regular
	// pay
	// premium type
	@Test(priority = 8, enabled = false)
	public static void deathBenefitAllOptionForRegularPay() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheFeildForDeathBenifitRegularPay();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Illustration for all premium type of limited pay
	@Test(priority = 9, enabled = false)
	public static void allPremiumPaymentTermLimitedPayPremiumType() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForAllPremiumPaymentTerm();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Illustration for all premium type of regular pay
	@Test(priority = 10, enabled = false)
	public static void allPremiumPaymentTermRegularPayPremiumType() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForRegularPayAllPremiumPaymentTerm();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Min age limit for single pay premium type
	@Test(priority = 11, enabled = false)
	public static void allPremiumTypeMinAgeLimit() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenTwo.setDateBirthPayorDetailsLessThan1DayOf18();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2MinMaxAge();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingRequiredFeildsForSmartTermPlan();
			// JourneyScreenTwo.checkErrorMessageForAgeLessThan18SmartTermPlan();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Max age limit for single pay premium type
	@Test(priority = 12, enabled = false)
	public static void singlePremiumTypeMaxAgeLimit() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenTwo.setDateBirthPayorDetailsMoreThan1YearOf60Years();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2MinMaxAge();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingRequiredFeildsForSmartTermPlanMaxAge();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Max age limit for limited pay premium type
	@Test(priority = 13, enabled = false)
	public static void limitedPayMaxAgeLimit() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenTwo.setDateBirthPayorDetailsMoreThan1YearOf60Years();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2MinMaxAge();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingRequiredFeildsForSmartTermPlanMimitedPayMaxAge();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Max age limit for regular pay premium type
	@Test(priority = 14, enabled = false)
	public static void regularPayMaxAgeLimit() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenTwo.setDateBirthPayorDetailsMoreThan1YearOf60Years();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2MinMaxAge();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingRequiredFeildsForSmartTermPlanRegularPayMaxAge();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// Max age limit for pay till 60 premium type
	@Test(priority = 15, enabled = false)
	public static void payTill60PremiumTypeMaxAgeLimit() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenTwo.setDateBirthPayorDetailsMoreThan1YearOf44Years();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2MinMaxAge();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.fillingRequiredFeildsPayTill60ForSmartTermPlanMaxAge();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 1, enabled = true)
	public static void checkproductConfigrationSmartTermPlanGeneratingPdfTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();

			genertaingPDFForTppPush();
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
			// JourneyScreenThree.proceedButtonLifestyle();
			JourneyScreenSix.fetchingProposalNumberFromUI();

			JourneyScreenThree.gmailFunctionalitySmartTermPlan();
			JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();
			JourneyScreenThreeTest.DeletingALLInboxMailForTppPushClose();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}
