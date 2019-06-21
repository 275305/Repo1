package WebTest;

import java.net.URL;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.model.SeverityLevel;

import uielements.HomePage;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;

public class ScenariosOfSmartTermPlanRegressionTest extends ReusableActions {

	@Severity(SeverityLevel.NORMAL)
	@Description("Verify the URL of The Application")
	@BeforeClass
	public void launchBrowser() throws Exception {
		try {
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "\\lib\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			logger.info("Test Started");
			prop = ReusableActions.readProperties();

			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");

			LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully at Login Page.");
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}

	}
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify the URL of The Application")
	@Test(priority = 0, enabled = true)
	public static void singlePayLifeCoverForm1PDFGenration() throws Exception {

		try {
			// alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();
			JourneyScreenTwo.singlePayLifeCoverForm1();

		} catch (Exception e) {
			logger.error("Test case fail " + e.getMessage());

		}
	}

	@Test(priority = 1, enabled = false)
	public static void singlePayLifeCoverForm1PDFGenration1() throws Exception {
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
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

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

	@Test(priority = 14, enabled = false)
	public static void singlePayIncomeInflationProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

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

	@Test(priority = 15, enabled = false)
	public static void limitedPayIncomeProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

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

	@Test(priority = 16, enabled = false)
	public static void limitedPayIncomeInflationProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

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

	@Test(priority = 17, enabled = false)
	public static void regularPayIncomeProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

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

	@Test(priority = 18, enabled = false)
	public static void regularPayIncomeInflationProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

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

	@Test(priority = 19, enabled = false)
	public static void payTill60IncomeProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

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

	@Test(priority = 20, enabled = false)
	public static void payTill60IncomeInflationProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenTwo.fillingFeildsScreenTwoFunction();
			JourneyScreenTwo.fillingInsurersDetailsScreenTwo();

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownSmartTermPlan();
			JourneyScreenTwo.selectByDropdownNeedOfInsur();
			JourneyScreenTwo.selectByDropdownLifeStge();

			JourneyScreenTwo.payTill60IncomeInflationProtectorForm2();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}
}
