package uielements;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

public class JourneyScreenSix extends ReusableActions {

	@FindBy(xpath = "//div[@class='Screen6__listMedical__3xxkG']")
	static WebElement medicalSumAssuranceTextValueSixPage;

	@FindBy(xpath = "//div[@class='Screen6__listMedical__3xxkG']")
	static WebElement MSA_FSASixPage;

	/*
	 * @FindBy(xpath = "//div[contains(text(),'Not yet calculated')]") static
	 * WebElement medicalSumAssuranceSixPage;
	 */

	@FindBy(xpath = "//div[@size='11']")
	static WebElement proposerDocuemntsixPage;

	@FindBy(xpath = "//span[contains(text(),'Payment')]")
	static WebElement paymetPage;

	@FindBy(xpath = "//input[@id='policyTranactionSearchBox']")
	static WebElement policyTranactionSearchBox;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")
	static WebElement outsideClick;

	@FindBy(xpath = "//*[@id='termsNConditionClose']")
	public static WebElement termsNConditionClose;

	@FindBy(xpath = "//div[@id='finalSubmitButton']")
	public static WebElement finalSubmitButton;

	@FindBy(xpath = "//option[@value='Years']")
	public static WebElement yearsDropDown;

	@FindBy(xpath = "//option[@value='5']")
	public static WebElement termsConditionNumber;

	@FindBy(xpath = "//label[@for='Cheque']")
	public static WebElement ChequeOptionButton;

	@FindBy(xpath = "//input[@id='Cheque']")
	public static WebElement ChequeRadioButtonSixPage;

	@FindBy(id = "FF_PrproposerUploadLightBox")
	public static WebElement addButtonFactFinder;

	@FindBy(id = "Ver_Dec_PrproposerUploadLightBox")
	public static WebElement addButtonVernacular;

	@FindBy(xpath = "//a[@id='termsAndConditionId']")
	public static WebElement termsAndConditionId;

	@FindBy(xpath = "//select[@name='knowsProposerTerm']")
	public static WebElement knowsProposerTerm;

	@FindBy(xpath = "//select[@name='knowsProposerSince']")
	public static WebElement knowsProposerSince;

	@FindBy(xpath = "//input[@name='paymentChequeNumber']")
	public static WebElement paymentChequeNumber;

	@FindBy(xpath = "//span[contains(text(),'Payment')]")
	public static WebElement paymentScreen;

	@FindBy(id = "submitButtonPopup")
	public static WebElement submitButtonPopup;

	@FindBy(xpath = "//div[@id='paymentChequeDate_id']")
	public static WebElement paymentChequeDate;

	@FindBy(xpath = "//div[@id='paymentChequePayableAt_id']")
	public static WebElement paymentChequePayableAt;

	// input[@name='paymentChequeBankName']

	@FindBy(xpath = "//div[@id='menu-paymentChequePayableAt']/div/ul/li[1]")
	public static WebElement paymentChequePayableAtDropDown1stOption;

	@FindBy(xpath = "//input[@name='paymentChequeBankName']")
	public static WebElement paymentChequeBankName;

	@FindBy(xpath = "//div[@id='proposer|financial|BankS_Pr']")
	public static WebElement proposerDocument;

	@FindBy(xpath = "//div[@id='proposer|StandardDoc|Comm_Add_Pr']")
	public static WebElement communicationAddressProf;

	@FindBy(xpath = "//div[@id='proposer|StandardDoc|ID_Pr']")
	public static WebElement identityProf;

	@FindBy(xpath = "//div[@id='proposer|StandardDoc|Photo_Pr']")
	public static WebElement photographOfProposer;

	@FindBy(xpath = "//div[@id='proposer|StandardDoc|CHQ_Pr']")
	public static WebElement cancelledChequeWithName;

	@FindBy(xpath = "//div[@id='proposer|StandardDoc|NACH_Pr']")
	public static WebElement ecsMandateFormUpload;

	@FindBy(xpath = "//div[@id='proposer|StandardDoc|FF_Pr']")
	public static WebElement factFinderUpload;

	@FindBy(xpath = "//div[@id='proposer|StandardDoc|Ver_Dec_Pr']")
	public static WebElement vernacularDeclarationUpload;

	@FindBy(id = "BankS_PrproposerUploadLightBox")
	public static WebElement addButton;

	@FindBy(id = "NACH_PrproposerUploadLightBox")
	public static WebElement addButtonECSMandate;

	@FindBy(id = "CHQ_PrproposerUploadLightBox")
	public static WebElement cancelledChequeAdd;

	@FindBy(id = "Photo_PrproposerUploadLightBox")
	public static WebElement addButtonPhotograph;

	@FindBy(id = "ID_PrproposerUploadLightBox")
	public static WebElement addButtonIdentityProf;

	@FindBy(id = "Comm_Add_PrproposerUploadLightBox")
	public static WebElement addButtonCommunication;

	@FindBy(xpath = "//input[@name='paymentChequeMicr']")
	public static WebElement paymentChequeMicr;

	@FindBy(xpath = "//div[@id='preferredDate_id']")
	public static WebElement preferedDate;

	@FindBy(xpath = "//div[@id='visitType_id']")
	public static WebElement visitType;

	@FindBy(xpath = "//div[@id='menu-visitType']/div/ul/li[2]")
	public static WebElement visitTypeLab;

	public static int policyNumber;
	public static String str2;

	public static void getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenSix() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Payment')]")).click();
		Thread.sleep(4000);// Wiating for posv manualyyyyy
		String policyNumberFromUI = driver.findElement(By.xpath("//span[@id='proposalNumberId']")).getText();
		System.out.println(policyNumberFromUI);

		String[] policyNumberFromUISplitting = policyNumberFromUI.split(" ");
		System.out.println("str2" + Arrays.toString(policyNumberFromUISplitting));
		System.out.println("str2" + policyNumberFromUISplitting[2]);
		String str2 = policyNumberFromUISplitting[2];

		int policyNumber = Integer.parseInt(str2);
		System.out.println("After converting it ti int" + policyNumber);

		HomePage.clickDashboard();
		driver.findElement(
				By.xpath("//input[@placeholder='Enter email id/ Mobile no / Proposal number /Transaction ID']"))
				.sendKeys(policyNumberFromUISplitting[2]);

		driver.findElement(By.xpath("//label[@for='policyNumber']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean policyIsDisplayed = driver.findElement(By.xpath("//th[(text()=" + policyNumber + ")]")).isDisplayed();
		System.out.println(policyIsDisplayed);
		driver.findElement(By.xpath("//th[(text()=" + policyNumber + ")]")).click();
		// waitTillElementToBeClickable(paymetPage);
		Thread.sleep(1500);

	}

	public static void fetchingProposalNumberFromUI() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		System.out.println("Entered in desired location");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[(text()=' Payment')]")).click();
		// Thread.sleep(4000);// Wiating for posv manualyyyyy
		String policyNumberFromUI = driver.findElement(By.xpath("//span[@id='proposalNumberId']")).getText();
		System.out.println(policyNumberFromUI);

		String[] policyNumberFromUISplitting = policyNumberFromUI.split(" ");
		System.out.println("str2" + Arrays.toString(policyNumberFromUISplitting));
		System.out.println("str2" + policyNumberFromUISplitting[2]);
		str2 = policyNumberFromUISplitting[2];

		policyNumber = Integer.parseInt(str2);
		System.out.println("After converting it ti int" + policyNumber);

		/*
		 * HomePage.clickDashboard(); driver.findElement( By. xpath(
		 * "//input[@placeholder='Enter email id/ Mobile no / Proposal number /Transaction ID']"
		 * )) .sendKeys(policyNumberFromUISplitting[2]);
		 *
		 * driver.findElement(By.xpath("//label[@for='policyNumber']")).click();
		 * driver.findElement(By.xpath("//button[@type='submit']")).click(); boolean
		 * policyIsDisplayed = driver.findElement(By.xpath("//th[(text()=" +
		 * policyNumber + ")]")).isDisplayed(); System.out.println(policyIsDisplayed);
		 * driver.findElement(By.xpath("//th[(text()=" + policyNumber + ")]")).click();
		 * // waitTillElementToBeClickable(paymetPage); Thread.sleep(1500);
		 */

	}

	public static void fetchingPolicyNumberAndCompletingTheJourneyForTPP() throws Exception {
		Thread.sleep(2800);
		HomePage.clickDashboard();
		Thread.sleep(1000);
		/* 15-07-19 added 2 line for driver refresh */
		driver.navigate().refresh();
		Thread.sleep(3000);
		waitTillElementToBeClickable(policyTranactionSearchBox);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='policyTranactionSearchBox']")).sendKeys(str2);
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@for='policyNumber']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(500);
		boolean policyIsDisplayed = driver.findElement(By.xpath("//th[(text()=" + policyNumber + ")]")).isDisplayed();
		System.out.println(policyIsDisplayed);
		driver.findElement(By.xpath("//th[(text()=" + policyNumber + ")]")).click();
		// waitTillElementToBeClickable(paymetPage);
		Thread.sleep(1500);

	}

	public static void paymentChequeDate() throws Exception {

		click(paymentChequeDate);
		Thread.sleep(400);

		Calendar calendar = Calendar.getInstance();
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		String runtimeXpathForSelectingDate = "day-" + currentDay + "";
		driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"))
				.click();

		Thread.sleep(500);

	}

	public static void paymentChequePayableAt() throws Exception {

		click(paymentChequePayableAt);
		Thread.sleep(400);
		click(paymentChequePayableAtDropDown1stOption);

	}

	public static void paymentChequeBankName() throws Exception {

		click(paymentChequeBankName);
		Thread.sleep(400);
		click(paymentChequePayableAtDropDown1stOption);

	}

	public static void paymentChequeNumber(int x, int y, int z) throws Exception {
		Thread.sleep(500);
		paymentChequeNumber.clear();
		type(paymentChequeNumber, readingdata(x, y, z));

	}

	public static void paymentChequeBankName(int x, int y, int z) throws Exception {
		Thread.sleep(500);
		paymentChequeBankName.clear();
		type(paymentChequeBankName, readingdata(x, y, z));

	}

	public static void proposerDocument() throws Exception {
		Thread.sleep(500);
		proposerDocument.click();
		Thread.sleep(300);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		addButton.sendKeys(inputFilePath);
		Thread.sleep(10000);
	}

	public static void communicationAddressProf() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(communicationAddressProf);
		communicationAddressProf.click();
		Thread.sleep(500);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		addButtonCommunication.sendKeys(inputFilePath);
		Thread.sleep(10000);
	}

	public static void factFinderUpload() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(factFinderUpload);
		factFinderUpload.click();
		Thread.sleep(500);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		Thread.sleep(3500);
		addButtonFactFinder.sendKeys(inputFilePath);
		String inputFilePath2 = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\BaadharCard.jpg";
		Thread.sleep(5000);
		addButtonFactFinder.sendKeys(inputFilePath2);
	}

	public static void vernacularUpload() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(vernacularDeclarationUpload);
		Thread.sleep(3500);
		vernacularDeclarationUpload.click();
		Thread.sleep(500);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";

		addButtonVernacular.sendKeys(inputFilePath);

	}

	public static void ecsMandateFormUpload() throws Exception {

		waitTillElementToBeClickable(ecsMandateFormUpload);
		Thread.sleep(3500);
		ecsMandateFormUpload.click();
		Thread.sleep(500);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		Thread.sleep(3500);
		addButtonECSMandate.sendKeys(inputFilePath);
		Thread.sleep(10000);

	}

	public static void cancelledChequeWithName() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(cancelledChequeWithName);
		Thread.sleep(3500);
		cancelledChequeWithName.click();
		Thread.sleep(500);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		Thread.sleep(3500);
		cancelledChequeAdd.sendKeys(inputFilePath);
		Thread.sleep(10000);
	}

	public static void photographOfProposer() throws Exception {
		waitTillElementToBeClickable(photographOfProposer);
		Thread.sleep(3500);
		photographOfProposer.click();
		Thread.sleep(500);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		Thread.sleep(3500);
		addButtonPhotograph.sendKeys(inputFilePath);
		Thread.sleep(10000);

	}

	public static void identityProf() throws Exception {
		waitTillElementToBeClickable(identityProf);
		Thread.sleep(3500);
		identityProf.click();
		Thread.sleep(500);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		Thread.sleep(3500);
		addButtonIdentityProf.sendKeys(inputFilePath);
		Thread.sleep(10000);
	}

	public static void paymentChequeMicr(int x, int y, int z) throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(paymentChequeMicr);
		paymentChequeMicr.clear();
		type(paymentChequeMicr, readingdata(x, y, z));

	}

	public static void preferedDate() throws Exception {
		Thread.sleep(1500);
		preferedDate.click();

		Calendar calendar = Calendar.getInstance();
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		String runtimeXpathForSelectingDate = "day-" + currentDay + "";
		driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"))
				.click();

		Thread.sleep(500);

		driver.findElement(By.xpath("//li[contains(text(),'18:00')]")).click();
		Thread.sleep(500);
	}

	public static void visitType() throws Exception {
		Thread.sleep(500);
		visitType.click();
		Thread.sleep(500);
		visitTypeLab.click();
	}

	public static void medicalCentreSelection() throws Exception {
		Thread.sleep(500);
		driver.findElement(By.xpath("//tr[1]//td[1]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='popupProceed']")).click();
		Thread.sleep(800);
	}

	/*
	 * public static void prePopulationOCRAadhar() throws Exception {
	 * PageFactory.initElements(driver, JourneyScreenOnePANOCR.class); Screen s =
	 * new Screen(); String
	 * filepath="C:\\Matrix\\qa\\src\\test\\resources\\SkuliImages\\"; String
	 * inputFilePath ="C:\\Matrix\\qa\\src\\test\\resources\\SkuliImages\\"; Pattern
	 * openButton = new Pattern(filepath + "Open.PNG"); Pattern fileName = new
	 * Pattern(filepath + "ToBeEnterThePath.PNG"); aadhaarOCR(); Thread.sleep(500);
	 * frontUpload(); s.wait(fileName, 80); s.type(fileName, inputFilePath +
	 * "AadharCard.jpg"); s.click(openButton); Thread.sleep(8000); Actions action =
	 * new Actions(driver); action.sendKeys(Keys.ESCAPE).build().perform();
	 * Thread.sleep(2000); }
	 */

	public static void prePopulationDocumentVault() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		// Screen s = new Screen();
		// String filepath = System.getProperty("user.dir");
		// String filepath =
		// "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";
		// String inputFilePath =
		// "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";
		// String inputFilePath =
		// System.getProperty("user.dir")+"\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		// Pattern openButton = new Pattern(filepath + "SkuliImages\\Open.PNG");
		// Pattern fileName = new Pattern(filepath +
		// "SkuliImages\\ToBeEnterThePath.PNG");
		proposerDocument();

		// s.wait(fileName, 80);
		// s.type(fileName, inputFilePath + "AadharCard.jpg");
		//
		// s.click(openButton);

		Thread.sleep(3000);
		submitButtonPopup.click();

	}

	public static void desktopFileUpload() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Thread.sleep(800);
		Screen s = new Screen();
		s.type("A");
		s.type(Key.DOWN);
		s.type(Key.ENTER);

	}

	public static void communicationAddressProof() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		communicationAddressProf();

		Thread.sleep(800);

		// desktopFileUpload();

		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void identityProofOrDOB() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		identityProf();

		Thread.sleep(800);

		// desktopFileUpload();

		// .sleep(500);
		submitButtonPopup.click();

	}

	public static void photographOfProposerUpload() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		photographOfProposer();

		// desktopFileUpload();
		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void cancelledChequeWithNameRequired() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		cancelledChequeWithName();

		// desktopFileUpload();
		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void ecsMandateForm() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		ecsMandateFormUpload();

		// desktopFileUpload();
		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void factFinder() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		factFinderUpload();

		// desktopFileUpload();
		/*
		 * Screen s = new Screen(); s.type("C"); s.type(Key.DOWN); s.type(Key.ENTER);
		 * 
		 * s.type("\"BaadharCard.jpg\" \"AadharCard.jpg\" "); s.type(Key.ENTER);
		 * 
		 * Thread.sleep(500);
		 */ // addButtonFactFinder.click();

		submitButtonPopup.click();

	}

	public static void vernacularDeclaration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		vernacularUpload();

		// desktopFileUpload();
		/*
		 * Screen s = new Screen(); s.type("C"); s.type(Key.DOWN); s.type(Key.ENTER);
		 * 
		 * s.type("\"BaadharCard.jpg\" \"AadharCard.jpg\" "); s.type(Key.ENTER);
		 * 
		 * Thread.sleep(500); // addButtonFactFinder.click();
		 * 
		 * submitButtonPopup.click();
		 */

	}

	public static void arrowDownFunctionToScrollDown() throws Exception {
		Thread.sleep(400);
		for (int i = 1; i < 38; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(400);
	}

	public static void arrowDownFunctionToScrollDownMSA_FSA() throws Exception {
		Thread.sleep(400);
		for (int i = 1; i < 20; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(400);
	}

	public static void termsAndCondition() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		waitTillElementToBeClickable(outsideClick);
		Thread.sleep(1000);
		outsideClick.click();
		Thread.sleep(800);
		arrowDownFunctionToScrollDown();
		Thread.sleep(800);
		termsAndConditionId.click();
		Thread.sleep(700);

		knowsProposerTerm.click();
		Thread.sleep(700);
		termsConditionNumber.click();
		Thread.sleep(700);
		knowsProposerSince.click();
		yearsDropDown.click();
		Thread.sleep(800);

		Thread.sleep(800);
		termsNConditionClose.click();
		Thread.sleep(1000);
		finalSubmitButton.click();
		Thread.sleep(3000);

	}

	public static void termsAndConditionMSA_FSA() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		waitTillElementToBeClickable(outsideClick);
		Thread.sleep(1000);
		outsideClick.click();
		Thread.sleep(800);
		arrowDownFunctionToScrollDownMSA_FSA();
		Thread.sleep(800);
		/* to verify the value of MSA and FSA */

		JourneyScreenSix.toVerifyMSA_FSAValue();

		/* termsAndConditionId.click(); */

	}

	public static void takingBackVALUE() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

	}

	public static void switchingBackToMainWindowScreenSix() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		/* document varification */
		/*
		 * driver.findElement(By.xpath("//span[contains(text(),'Verification')]")).click
		 * (); Thread.sleep(1000); driver.navigate().refresh(); Thread.sleep(2000);
		 * JourneyScreenFour.toCheckCustomerStatusIsPending();
		 * driver.findElement(By.xpath("//span[contains(text(),' Payment')]")).click();
		 * Thread.sleep(2000);
		 */

		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(policyNumber);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		Thread.sleep(4000);

		/* verify the verification status */

		/*-----------------------------*/
		System.out.println(policyNumber);
		fetchingPolicyNumberAndCompletingTheJourneyForTPP();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		// paymentScreen.click();
		Thread.sleep(800);
		ChequeOptionButton.click();

		paymentChequeNumber(1, 1, 4);
		Thread.sleep(1000);
		paymentChequeDate();
		Thread.sleep(1000);
		paymentChequePayableAt();
		Thread.sleep(2000);
		paymentChequeBankName(1, 1, 4);
		Thread.sleep(2000);
		paymentChequeMicr(1, 1, 4);
		Thread.sleep(3000);
		prePopulationDocumentVault();
		Thread.sleep(2000);
		communicationAddressProof();
		Thread.sleep(2000);
		identityProofOrDOB();
		Thread.sleep(2000);
		photographOfProposerUpload();
		Thread.sleep(2000);
		cancelledChequeWithNameRequired();
		Thread.sleep(2000);

		ecsMandateForm();
		Thread.sleep(2000);
		factFinder();
		Thread.sleep(2000);
		// investorRiskProfile();
		// vernacularDeclaration();
		Thread.sleep(2000);

		Thread.sleep(2000);
	}

	public static void switchingBackToMainWindowScreenSixMSA_FSA() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(policyNumber);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		Thread.sleep(4000);

		/* verify the verification status */

		/*-----------------------------*/
		System.out.println(policyNumber);
		fetchingPolicyNumberAndCompletingTheJourneyForTPP();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(2000);

		// paymentScreen.click();
		Thread.sleep(800);
		ChequeOptionButton.click();
		Thread.sleep(3000);
		paymentChequeNumber(1, 1, 4);
		Thread.sleep(2000);
		paymentChequeDate();
		Thread.sleep(1000);
		paymentChequePayableAt();
		Thread.sleep(2000);
		paymentChequeBankName(1, 1, 4);
		Thread.sleep(2000);
		paymentChequeMicr(1, 1, 4);
		Thread.sleep(3000);
		prePopulationDocumentVault();
		Thread.sleep(2000);
		communicationAddressProof();
		Thread.sleep(2000);
		identityProofOrDOB();
		Thread.sleep(2000);
		photographOfProposerUpload();
		Thread.sleep(2000);
		cancelledChequeWithNameRequired();
		Thread.sleep(2000);
		ecsMandateForm();
		Thread.sleep(2000);
		factFinder();
		Thread.sleep(2000);
		// investorRiskProfile();
		// vernacularDeclaration();
		// Thread.sleep(2000);

		// Thread.sleep(2000);
	}

	public static void switchingBackToMainWindowScreenSixDocumentRule() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		System.out.println(policyNumber);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		Thread.sleep(4000);

		/* verify the verification status */
		/*-----------------------------*/
		System.out.println(policyNumber);
		fetchingPolicyNumberAndCompletingTheJourneyForTPP();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		// paymentScreen.click();
		Thread.sleep(800);
		ChequeOptionButton.click();

		paymentChequeNumber(1, 1, 4);
		Thread.sleep(1000);
		paymentChequeDate();
		Thread.sleep(1000);
		paymentChequePayableAt();
		Thread.sleep(2000);
		paymentChequeBankName(1, 1, 4);
		Thread.sleep(2000);
		paymentChequeMicr(1, 1, 4);
		Thread.sleep(3000);

		/* verify the document status */
		JourneyScreenSix.documentRule();

		Thread.sleep(2000);
	}

	public static void investorRiskProfile() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		investorRiskProfileUpload();
		submitButtonPopup.click();
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//div[@id='proposer|StandardDoc|IRP_Pr']")
	public static WebElement investorRiskProf;

	@FindBy(id = "IRP_PrproposerUploadLightBox")
	public static WebElement addButtonInvestorRiskProfile;

	public static void investorRiskProfileUpload() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(investorRiskProf);
		Thread.sleep(3500);
		investorRiskProf.click();
		Thread.sleep(500);
		String inputFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\AadharCard.jpg";
		addButtonInvestorRiskProfile.sendKeys(inputFilePath);
		Thread.sleep(5000);
		String inputFilePath2 = System.getProperty("user.dir") + "\\src\\test\\resources\\SkuliImages\\BaadharCard.jpg";
		addButtonInvestorRiskProfile.sendKeys(inputFilePath2);
		Thread.sleep(3000);

	}

	public static void closingTestTrial() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Thread.sleep(1000);

		/*
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//span[contains(text(),'Payment')]")). click();
		 * Thread.sleep(4000);// Wiating for posv manualyyyyy String policyNumberFromUI
		 * = driver.findElement(By.xpath("//span[@id='proposalNumberId']")). getText();
		 * System.out.println(policyNumberFromUI);
		 *
		 * String[] policyNumberFromUISplitting = policyNumberFromUI.split(" ");
		 * System.out.println("str2" + Arrays.toString(policyNumberFromUISplitting));
		 * System.out.println("str2" + policyNumberFromUISplitting[2]); str2 =
		 * policyNumberFromUISplitting[2];
		 *
		 * policyNumber = Integer.parseInt(str2); System.out.println(
		 * "After converting it ti int" + policyNumber);
		 */

		HomePage.clickDashboard();
		driver.findElement(
				By.xpath("//input[@placeholder='Enter email id/ Mobile no / Proposal number /Transaction ID']"))
				.sendKeys("568095673");

		int policyNumber = 568095673;

		driver.findElement(By.xpath("//label[@for='policyNumber']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean policyIsDisplayed = driver.findElement(By.xpath("//th[(text()=" + policyNumber + ")]")).isDisplayed();
		System.out.println(policyIsDisplayed);
		driver.findElement(By.xpath("//th[(text()=" + policyNumber + ")]")).click();
		waitTillElementToBeClickable(paymetPage);
		Thread.sleep(1500);
	}

	public static void desktopFileUploading() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Thread.sleep(2800);
		Screen s = new Screen();

		s.type("A");
		s.type(Key.DOWN);
		Thread.sleep(5000);
		s.type(Key.ENTER);
	}

	public static void communicationAddressProofFTSP() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Screen s = new Screen();

		// String filepath =//
		// "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";

		String FilePath = System.getProperty("user.dir");
		// String inputFilePath =//
		// "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";
		Pattern openButton = new Pattern(FilePath + "\\src\\test\\resources\\SkuliImages\\Open.PNG");
		Pattern fileName = new Pattern(FilePath + "\\src\\test\\resources\\SkuliImages\\ToBeEnterThePath.PNG");
		String filepath = "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";
		String inputFilePath = "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";
		// Pattern openButton = new Pattern(filepath + "Open.PNG");
		// Pattern fileName = new Pattern(filepath + "ToBeEnterThePath.PNG");

		communicationAddressProf();

		s.wait(fileName, 2000);
		s.type(fileName, inputFilePath);
		s.type(Key.ENTER);

		// s.click(openButton);

		desktopFileUploading();

		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void copyOfPAN() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		// copyOfPANCard();

		// desktopFileUpload();
		// Screen s = new Screen();
		String inputFilePath = System.getProperty("user.dir") + "SkuliImages\\Open.PNG";

		// String filepath =
		// "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";
		// Pattern filename = new Pattern(filepath + "Open.PNG");
		/*
		 * s.wait(filename, 230);
		 * 
		 * s.type("check"); // s.wait(230); s.type(Key.DOWN); s.wait();
		 * 
		 * s.type(Key.ENTER);
		 * 
		 * s.wait(filename, 230);
		 * 
		 * s.type("\"BaadharCard.jpg\" \"AadharCard.jpg\" "); s.type(Key.ENTER);
		 * 
		 * Thread.sleep(500);
		 */ // addButtonFactFinder.click();

		submitButtonPopup.click();

	}

	/* Switching back to main window screen six FTSP */
	public static void switchingBackToMainWindowScreenSixFTSP() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Thread.sleep(1000);

		System.out.println(policyNumber);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		System.out.println(policyNumber);
		fetchingPolicyNumberAndCompletingTheJourneyForTPP();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		// paymentScreen.click();
		Thread.sleep(800);
		ChequeOptionButton.click();

		paymentChequeNumber(1, 1, 4);

		paymentChequeDate();

		paymentChequePayableAt();

		paymentChequeBankName(1, 1, 4);
		paymentChequeMicr(1, 1, 4);

		Thread.sleep(800);
		// prePopulationDocumentVault();
		// Thread.sleep(800);

		communicationAddressProofFTSP();
		Thread.sleep(800);
		identityProofOrDOB();
		Thread.sleep(800);
		photographOfProposerUpload();
		Thread.sleep(800);
		copyOfPAN();
		Thread.sleep(800);
		cancelledChequeWithNameRequired();
		Thread.sleep(800);
		ecsMandateForm();
		Thread.sleep(800);
		// investorRiskProfile();
		Thread.sleep(800);
		factFinder();
		Thread.sleep(800);

		// vernacularDeclaration();
		// Thread.sleep(800);
	}

	// For WLS
	public static void switchingBackToMainWindowScreenSixWLS() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Thread.sleep(1000);

		System.out.println(policyNumber);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		System.out.println(policyNumber);
		fetchingPolicyNumberAndCompletingTheJourneyForTPP();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		// paymentScreen.click();
		Thread.sleep(800);
		ChequeOptionButton.click();

		paymentChequeNumber(1, 1, 4);

		paymentChequeDate();

		paymentChequePayableAt();

		paymentChequeBankName(1, 1, 4);
		paymentChequeMicr(1, 1, 4);

		Thread.sleep(800);
		// prePopulationDocumentVault();
		Thread.sleep(800);
		communicationAddressProofFTSP();
		Thread.sleep(800);
		identityProofOrDOB();
		Thread.sleep(800);
		photographOfProposerUpload();
		// Thread.sleep(800);
		// copyOfPAN();
		Thread.sleep(800);
		cancelledChequeWithNameRequired();
		Thread.sleep(800);
		ecsMandateForm();
		// Thread.sleep(800);
		// investorRiskProfile();
		Thread.sleep(800);
		factFinder();
		Thread.sleep(800);
		prePopulationDocumentVault();

		// vernacularDeclaration();
		Thread.sleep(800);
	}

	public static void testItAndRejectIt() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Thread.sleep(1000);

		// System.out.println(policyNumber);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		// System.out.println(policyNumber);
		closingTestTrial();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		// paymentScreen.click();
		/*
		 * Thread.sleep(800); ChequeOptionButton.click();
		 *
		 * paymentChequeNumber(1, 1, 4);
		 *
		 *
		 * paymentChequeDate();
		 *
		 * paymentChequePayableAt();
		 *
		 * paymentChequeBankName(1, 1, 4); paymentChequeMicr(1, 1, 4);
		 *
		 * Thread.sleep(800); prePopulationDocumentVault();
		 *
		 *
		 */
		Thread.sleep(800);
		communicationAddressProofFTSP();

		Thread.sleep(800);
		identityProofOrDOB();
		Thread.sleep(800);
		photographOfProposerUpload();
		Thread.sleep(800);

		copyOfPAN();
		Thread.sleep(800);
		cancelledChequeWithNameRequired();
		Thread.sleep(800);

		ecsMandateForm();
		Thread.sleep(800);
		factFinder();
		Thread.sleep(800);

		// vernacularDeclaration();
		Thread.sleep(800);
	}

	// For MIAP
	public static void switchingBackToMainWindowScreenSixMIAP() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Thread.sleep(1000);

		System.out.println(policyNumber);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		System.out.println(policyNumber);
		fetchingPolicyNumberAndCompletingTheJourneyForTPP();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(4000);

		// paymentScreen.click();
		Thread.sleep(800);
		ChequeOptionButton.click();

		paymentChequeNumber(1, 1, 4);

		paymentChequeDate();

		paymentChequePayableAt();

		paymentChequeBankName(1, 1, 4);
		paymentChequeMicr(1, 1, 4);

		Thread.sleep(800);

		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		// prePopulationDocumentVault();
		Thread.sleep(800);
		communicationAddressProofFTSP();
		Thread.sleep(800);
		identityProofOrDOB();
		Thread.sleep(800);
		photographOfProposerUpload();
		Thread.sleep(800);
		// copyOfPAN();
		// Thread.sleep(800);
		cancelledChequeWithNameRequired();
		Thread.sleep(800);
		ecsMandateForm();
		// Thread.sleep(800);
		// investorRiskProfile();
		Thread.sleep(800);
		factFinder();
		Thread.sleep(800);
		// ecsMandateForm2();
		prePopulationDocumentVault();
		// vernacularDeclaration();
		// Thread.sleep(80l0);
	}

	public static void documentRule() {
		try {
			String ExpectedValue = "Proposer Documents";
			String ActualValue = proposerDocuemntsixPage.getText();
			if (ExpectedValue.contentEquals(ActualValue))
				logger.info("Test Case:Proposer Document is ready to upload");
			else
				Assert.fail("Test Case:Document Rule is pending");
		} catch (Exception e) {
			Assert.fail("Document Rule is pending");
		}
	}

	public static void toVerifyMSA_FSAValue() {
		
		try {
			String actualMSA_FSAValue = medicalSumAssuranceTextValueSixPage.getText();
			String[] MSA_FSATextValue = actualMSA_FSAValue.split("\\:+");
			
			String splitedMSA_FSAActualValue = MSA_FSATextValue[1];
			logger.info("Splited Value of Medical Sum Assured & Financial Sum Assured"+splitedMSA_FSAActualValue);
			String expectedValue = "Not yet calculated";
			if (splitedMSA_FSAActualValue.contentEquals(expectedValue))
				Assert.fail("Test Case: MSA_FSA Not yet calculated");
			else
				logger.info("Test Case: MSA_FSA value populated sucessfully");

		} catch (Exception e) {
			logger.info("Test Case: MSA_FSA populated sucessfully");
		}
	}
}