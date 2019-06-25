package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.RegressionSuit;
import uielements.ReusableActions;
import util.AppConstant;

public class MaxLifeFastTrackSuperPlanTest extends ReusableActions {


	@Test(priority = 0, enabled = true)
	public void loginApplicationTest() throws Exception {
		try {
			PageFactory.initElements(driver, RegressionSuit.class);
			final String PATH = System.getProperty("user.dir");
			System.setProperty(AppConstant.INPUT_CHROME_DRIVER, PATH + AppConstant.INPUT_WEB_DRIVER);
			driver = new ChromeDriver();
			prop = ReusableActions.readProperties();
			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();
			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");
			LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");
		} catch (Exception e) {

			logger.error("Test case failed: " + e.getMessage());

			throw e;
		}
	}

	@Test(priority = 1, enabled = true)
	public void CheckproductConfigrationFTSPUlipGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.ulip();
			JourneyScreenTwo.selectByDropdownFTSP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForFTSP();
			JourneyScreenTwo.premiumCommitmentPremiumFundYes();
			// JourneyScreenTwo.clickSubmitButton();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

}
