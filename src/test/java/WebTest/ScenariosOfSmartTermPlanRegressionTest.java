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
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;

public class ScenariosOfSmartTermPlanRegressionTest extends ReusableActions {

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


	@Test(priority = 1, enabled = false)
	public static void singlePayLifeCoverForm1PDFGenration() throws Exception {
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

			JourneyScreenTwo.singlePayLifeCoverForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}


	@Test(priority = 2, enabled = false)
	public static void singlePayIncomeProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			JourneyScreenTwoTest.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.singlePayIncomeProtectorForm2();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 3, enabled = false)
	public static void singlePayIncomeInflationProtectorForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.singlePayIncomeInflationProtectorForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 4, enabled = false)
	public static void singlePayIncreasingCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.singlePayIncreasingCoverProtectorForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 5, enabled = false)
	public static void limitedPayLifeCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.limitedPayLifeCoverForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 6, enabled = false)
	public static void limitedPayIncomeInflationProtectorForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.limitedPayIncomeInflationProtectorForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 7, enabled = false)
	public static void limitedPayIncreasingCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.limitedPayIncreasingCoverForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 8, enabled = false)
	public static void regularPayLifeCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.regularPayLifeCoverForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 9, enabled = false)
	public static void regularPayIncomeInflationrForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.regularPayIncomeInflationForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 10, enabled = false)
	public static void regularPayIncreasingCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.regularPayIncreasingCoverForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 11, enabled = false)
	public static void payTill60LifeCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.payTill60LifeCoverForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 12, enabled = false)
	public static void payTill60IncomeInflationProtectorForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.payTill60IncomeInflationProtectorForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 13, enabled = false)
	public static void payTill60IncreasingCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.payTill60IncreasingCoverForm1();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
	public static void singlePayIncomeInflationProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			JourneyScreenTwoTest.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.singlePayIncomeInflationProtectorForm2();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
	public static void limitedPayIncomeProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			JourneyScreenTwoTest.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.limitedPayIncomeProtectorForm2();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
	public static void limitedPayIncomeInflationProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			JourneyScreenTwoTest.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.limitedPayIncomeInflationProtectorForm2();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
	public static void regularPayIncomeProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			JourneyScreenTwoTest.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.regularPayIncomeProtectorForm2();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
	public static void regularPayIncomeInflationProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			JourneyScreenTwoTest.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.regularPayIncomeInflationProtectorForm2();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = true)
	public static void payTill60IncomeProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwoTest.fillingFeildsScreenTwoFunction();
			JourneyScreenTwoTest.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.payTill60IncomeProtectorForm2();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}

