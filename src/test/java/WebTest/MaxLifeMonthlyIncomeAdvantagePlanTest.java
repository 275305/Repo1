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
import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenSix;
import uielements.JourneyScreenThree;
import uielements.JourneyScreenTwo;
import uielements.LoginPage;
import uielements.RegressionSuit;
import uielements.ReusableActions;
import util.AppConstant;

public class MaxLifeMonthlyIncomeAdvantagePlanTest extends ReusableActions {

	// TC -01 Verify the by default status of Nationality, Policy for and Proceed
	// button on Journey Screen one

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

	public static void loginNewBrowser() throws Exception {
		try {

			driver = new ChromeDriver();
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

	@Test(description = "This is to validate for different Annual income", priority = 1, enabled = false)
	public void CheckproductConfigrationMIAPGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForMIAP();
			JourneyScreenTwo.premiumCommitmentDesiredAnnualIncomeAnnualIncome();
			/*
			 * screenJourneyFromThreeTillEnd(); screenJourneyFromFourTillEnd();
			 * posvBackFlowTillTPPPush();
			 */

			driver.close();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// premium payment:12 ,mode of payment:Annual
	@Test(description = "For Premium payment:12 ,Mode of payment:Annual", priority = 2, enabled = false)
	public static void CheckproductConfigrationMIAPOneCaseGeneratingPdf() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			// loginNewBrowser();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();

			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.fillingAllTheRequiredFeildsForMIAP();
			JourneyScreenTwo.checkPOSVforMIAPAnnualIncome(3, 4, 11);

			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			//driver.close();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			driver.close();
			throw e;

		} finally {
			driver.close();
		}
	}

	public static void screenJourneyFromThreeTillEnd() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenThreeTest.proposerPersonalDetailsSection(); //
			// JourneyScreenTwo.proposerPersonalDetailsIncome();
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();
			Thread.sleep(1000);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void screenJourneyFromFourTillEnd() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
			JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();
			JourneyScreenFour.arrowDownFunctionToScrollDownTillBottomFastTrack();
			JourneyScreenFour.criticalIllnessNoOption();
			JourneyScreenFour.hazardousActivitiesNo();
			JourneyScreenFour.selectCriminalChargesNo();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void posvBackFlowTillTPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			JourneyScreenSix.fetchingProposalNumberFromUI();

			// JourneyScreenThree.gmailFunctionalitySmartTermPlan();
			JourneyScreenThree.handle_windowMIAP();
			// JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	// this case is same as previous case till tpp push---------
	@Test(priority = 3, enabled = false)
	public static void CheckproductConfigrationSTPTppPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			// alwaysCloseAllChildTabs();
			CheckproductConfigrationMIAPOneCaseGeneratingPdf();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			// driver.close();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(description = "For All Mode of Payment", priority = 4, enabled = false)
	public static void allModeOfPaymentPDFIllustration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			// JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.allModeOfPayment();
			/*
			 * screenJourneyFromThreeTillEnd(); screenJourneyFromFourTillEnd();
			 * posvBackFlowTillTPPPush(); driver.close();
			 */

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(description = "For All PremiumPayment Term", priority = 5, enabled = false)
	public static void allPremiumPaymentTermPDFIllustration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			 loginNewBrowser();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.allPremiumPaymentTerm();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		} finally {
			driver.close();
		}
	}

	@Test(description = "For PremiumPaymentTerm :12 and PaymentMode:Quaterly till TPP Push", priority = 6, enabled = false)
	public static void premiumPaymentTerm12TPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			//loginNewBrowser();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.premiumPaymentTerm12();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

			// driver.close();
		} 
		catch (Exception e) {
			//driver.close();
			logger.error("Test case failed " + e.getMessage());
			// driver.close();
			throw e;

		} finally {
			//driver.close();
		}
	}

	@Test(description = "For PremiumPaymentTerm :15 and PaymentMode:Annual till TPP Push", priority = 7, enabled = true)
	public static void premiumPaymentTerm15TPPPush() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			//loginNewBrowser();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.premiumPaymentTerm15();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			//driver.close();
			logger.error("Test case failed " + e.getMessage());
			// driver.close();
			throw e;

		} /*finally {
			driver.close();
		}
*/
	}
	

	@Test(description = "For PremiumPaymentTerm :12 and PaymentMode:Quaterly and Rider: ADDR till TPP Push", priority = 8, enabled = false)
	public static void premiumPaymentTerm12TPPPushwithADDrider() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.premiumPaymentTerm12();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

			// driver.close();
		} 
		catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			// driver.close();
			throw e;

		} finally {
			driver.close();
		}
	}
	//
	@Test(description = "For PremiumPaymentTerm :15 and PaymentMode:Annual Rider:TermPlus till TPP Push", priority = 9, enabled = false)
	public static void premiumPaymentTerm15TPPPushwithTermPlusRider() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.premiumPaymentTerm15();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();

		} catch (Exception e) {
			driver.close();
			logger.error("Test case failed " + e.getMessage());
			// driver.close();
			throw e;

		} finally {
			driver.close();
		}
	}

		@Test(description = "For PremiumPaymentTerm :15 and PaymentMode:Annual Rider:All till TPP Push", priority = 10, enabled = false)
		public static void premiumPaymentTerm15TPPPushwithAllRider() throws Exception {
			PageFactory.initElements(driver, JourneyScreenTwo.class);
			try {
				loginNewBrowser();
				alwaysCloseAllChildTabs();
				HomePage.clickNewApp();
				JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
				JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
				JourneyScreenTwo.traditional();
				JourneyScreenTwo.selectByDropdownMIAP();
				JourneyScreenTwo.annualModeOfPayment();
				JourneyScreenTwo.AccidentalDeathAndDismembermentRider();
				JourneyScreenTwo.TermPlusRider();
				JourneyScreenTwo.WOPPlusRiderCheckBox();
				screenJourneyFromThreeTillEnd();
				screenJourneyFromFourTillEnd();
				posvBackFlowTillTPPPush();

			} catch (Exception e) {
				driver.close();
				logger.error("Test case failed " + e.getMessage());
				// driver.close();
				throw e;

			} finally {
				driver.close();
			}
	}
	

	@Test(description = "To Check for All Riders", priority = 11, enabled = false)
	public static void allRiderPDFIllustration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.allRiderForMIAP();
			// JourneyScreenTwo.allPremiumPaymentTerm();
			
			  screenJourneyFromThreeTillEnd(); 
			  screenJourneyFromFourTillEnd();
			  posvBackFlowTillTPPPush();
			 
			driver.close();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(description = "PDF generation for Annaul Mode of Payment", priority = 12, enabled = false)
	public static void annualModeOfPaymentPDFIllustration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.annualModeOfPayment();
			JourneyScreenTwo.allPremiumPaymentTerm();
			/*
			 * screenJourneyFromThreeTillEnd(); screenJourneyFromFourTillEnd();
			 * posvBackFlowTillTPPPush();
			 */
			driver.close();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(description = "PDF generation for SemiAnnaul Mode of Payment", priority = 13, enabled = false)
	public static void semiAnnualModeOfPaymentPDFIllustration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.semiAnnualModeOfPayment();
			JourneyScreenTwo.allPremiumPaymentTerm();
			/*screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			driver.close();*/
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(description = "PDF generation for Quaterly Mode of Payment", priority = 14, enabled = false)
	public static void quartelyModeOfPaymentPDFIllustration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.quaterlyModeOfPayment();
			JourneyScreenTwo.allPremiumPaymentTerm();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			driver.close();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(description = "PDF generation for Monthly Mode of Payment", priority = 15, enabled = false)
	public static void monthlyModeOfPaymentPDFIllustration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			// loginNewBrowser();
			alwaysCloseAllChildTabs();
			// HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.monthlyModeOfPayment();
			JourneyScreenTwo.allPremiumPaymentTerm();
			/*
			 * screenJourneyFromThreeTillEnd(); screenJourneyFromFourTillEnd();
			 * posvBackFlowTillTPPPush();
			 */
			driver.close();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	@Test(priority = 2, enabled = false)
	public static void test() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			// HomePage.clickDashboard();
			// HomePage.clickNewApp();

			JourneyScreenSix.testItAndRejectIt();

			JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
			JourneyScreenOne.clickProceed();
			JourneyScreenThreeTest.fillingAllTheRequiredFeildForScreen2();
			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownMIAP();
			JourneyScreenTwo.monthlyModeOfPayment();
			JourneyScreenTwo.allPremiumPaymentTerm();
			screenJourneyFromThreeTillEnd();
			screenJourneyFromFourTillEnd();
			posvBackFlowTillTPPPush();
			driver.close();
		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}
	


}


