package WebTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.model.SeverityLevel;
import uielements.HomePage;
import uielements.JourneyScreenFour;
import uielements.JourneyScreenOne;
import uielements.JourneyScreenThree;
import uielements.LoginPage;
import uielements.ReusableActions;
import util.AppConstant;

public class JourneyScreenFourTest extends ReusableActions {

	@Step("URL and Login userName and password")
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify the First Page")
	@Test(priority = 0, enabled = true)
	public void India() throws Exception {
		try {
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
			HomePage.clickNewApp();
			JourneyScreenOne.isIndianSelected();
			JourneyScreenOne.isSelfSelected();
			JourneyScreenOne.isProceedEnabled();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Description("Verify the First Page")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 1, enabled = true)
	public void ScreenOneTestIndian() throws Exception {
		try {
			// JourneyScreenOne.setAadhar(1,1,0);
			// JourneyScreenOne.clickDonthaveAadhar();
			// JourneyScreenOne.neverApplied();
			// JourneyScreenOne.jammuKashmir();
			// JourneyScreenOne.popupProceedButton();
			// JourneyScreenOne.dontHavePAN();
			JourneyScreenOne.setPanNumber(1, 1, 1);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Description("Verify the Second and Thired Page")
	@Severity(SeverityLevel.CRITICAL)
	@Test(priority = 2, enabled = true)
	public void reachingScreenFourFillingAnnualIncomeform60RelatedDetailsFeilds() throws Exception
	{
		JourneyScreenThreeTest.reachingScreenFourFillingAnnualIncomeFunction();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		// JourneyScreenThree.lifestyleFeildsValidation();
		// JourneyScreenThree.lifestyleFeildsValidationForYes();
		// JourneyScreenThree.FeildsValidationHazardousForYes();
		JourneyScreenThree.scrollDownPage();
		JourneyScreenFour.selectingNoOptionForAllMedicalQusetion();
		JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5();
		JourneyScreenFour.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();


		/*
		 * JourneyScreenFour.arrowUpFunctionToScrollUpTillTop();
		 * JourneyScreenFour.
		 * idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectOption();
		 * JourneyScreenFour.fillPanApplicationAcknowledgeNowWithoutValidation()
		 * ; JourneyScreenFour.setDateBirthdateOfApplicationWithoutValidation();
		 * JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
		 */
		// JourneyScreenFour.form60RelatedDetailsFeildsIsPresent();

		/*
		 * JourneyScreenFour.
		 * form60RelatedDetailsIdentityProofNameDropDownValidation();
		 * JourneyScreenFour.identityProofNumberValidation(0, 1, 6);
		 * JourneyScreenFour.identityProofIssuingAuthority(); JourneyScreenFour.
		 * idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation
		 * (); JourneyScreenFour.fillPanApplicationAcknowledgeNo();
		 * JourneyScreenFour.setDateBirthdateOfApplication(1, 1, 9);
		 * JourneyScreenFour.
		 * iAmExemptFromRequirementOfPANUnderFollowingProvisionsSelectFeildsValidation
		 * ();
		 */

	}

	@Test(priority = 3, enabled = false)
	public void lifeStyleScreeenFourValidation() throws Exception

	{
		try {
			JourneyScreenThreeTest.fillingPersonalDetailsFunction();
			JourneyScreenFour.arrowDownFunctionToScrollDown();
			// JourneyScreenThree.lifestyleFeildsValidation();
			// JourneyScreenThree.lifestyleFeildsValidationForYes();
			// JourneyScreenThree.FeildsValidationHazardousForYes();
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
	/*public static void gmailFunctionalitySmartTermPlan() throws Exception {

		((JavascriptExecutor) driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.get("https://mail.google.com");
		setUsername(1, 10, 3);
		nextButton.click();
		Thread.sleep(800);
		setPassword(1, 11, 3);
		Thread.sleep(800);
		passwordNextButton.click();
		Thread.sleep(800);

		waitTillElementToBeClickableLongWait(preInsuranceVerificationLinkMail);
		Thread.sleep(700);
		preInsuranceVerificationLinkMail.click();
		System.out.println("clicked");

		// Actions actionObject = new Actions(driver);
		// actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();

		waitTillElementToBeClickableLongWait(preverificationLink);
		Thread.sleep(700);

		String link = preverificationLink.getText();

		WebDriver driver = new ChromeDriver();
		driver.get(link);
		driver.manage().window().maximize();

		Thread.sleep(700);

		String str = driver.getCurrentUrl();
		System.out.println(str);

		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-two\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-six\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-eight\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//label[@for=\"radio-two\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-four\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-six\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//label[@for=\"radio-two\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-four\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-six\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//label[@for=\"radio-two\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-four\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-six\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-2\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for=\"radio-10\"]")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(500);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='codeBox1']")).sendKeys("1");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='codeBox2']")).sendKeys("2");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='codeBox3']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='codeBox4']")).sendKeys("4");
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='cstm-check-label']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='submitbutton']")).click();
		Thread.sleep(1800);

		 * robot.keyPress(KeyEvent.VK_ALT); robot.keyPress(KeyEvent.VK_TAB);
		 * robot.keyRelease(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_ALT);
		 *
		 * Thread.sleep(500);
		 *
		 * robot.keyPress(KeyEvent.VK_CONTROL); robot.keyPress(KeyEvent.VK_TAB);
		 * robot.keyRelease(KeyEvent.VK_TAB); robot.keyRelease(KeyEvent.VK_CONTROL);


		driver.close();
	}
*/

}
