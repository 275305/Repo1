package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;
import uielements.HomePage;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.ReusableActions;
import util.AppConstant;


public class ScenariosOfSmartTermPlanRegressionTest extends ReusableActions {

	@Severity(SeverityLevel.NORMAL)
	@Description("Verify the URL of The Application")
	@Test(priority=0,enabled=true)
	public void launchBrowser() throws Exception {
		try {
			final String PATH = System.getProperty("user.dir");
			System.setProperty(AppConstant.INPUT_CHROME_DRIVER, PATH + AppConstant.INPUT_WEB_DRIVER);
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
	@Test(priority = 1, enabled = true)
	public static void singlePayLifeCoverForm1PDFGenration() throws Exception {
		// alwaysCloseAllChildTabs();
		HomePage.clickNewApp();
		JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
		JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
		JourneyScreenTwo.traditional();
		JourneyScreenTwo.selectByDropdownSmartTermPlan();
		JourneyScreenTwo.selectByDropdownNeedOfInsur();
		JourneyScreenTwo.selectByDropdownLifeStge();
		JourneyScreenTwo.singlePayLifeCoverForm1();
		//ReusableActions.attachScreen(driver);
	}
	@Test(priority=2,enabled=true)
	public void reachingAtScreenThree() throws Exception{
     JourneyScreenThreeTest.proposerPersonalDetailsSection();
     JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
     JourneyScreenThreeTest.bankDetailsSectionFillingData();
     JourneyScreenTwo.arrowDownFunctionToScrollDown();
     JourneyScreenTwo.clickProceed();
	}

	@Test(priority = 3, enabled = false)
	public static void singlePayLifeCoverForm1PDFGenration1() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);

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
	}

	@Test(priority = 4, enabled = false)
	public static void singlePayIncomeProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);

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

	}

	@Test(priority = 5, enabled = false)
	public static void singlePayIncomeInflationProtectorForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);

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

	}

	@Test(priority = 6, enabled = false)
	public static void singlePayIncreasingCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);

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

	}

	@Test(priority = 7, enabled = false)
	public static void limitedPayLifeCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);

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

	}

	@Test(priority = 8, enabled = false)
	public static void limitedPayIncomeInflationProtectorForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);

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

	}

	@Test(priority = 9, enabled = false)
	public static void limitedPayIncreasingCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);

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

	}

	@Test(priority = 10, enabled = false)
	public static void regularPayLifeCoverForm1PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
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

	}

	@Test(priority = 11, enabled = false)
	public static void singlePayIncomeInflationProtectorForm2PDFGenration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
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

	}

}
