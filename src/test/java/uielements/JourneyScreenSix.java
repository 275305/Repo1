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

public class JourneyScreenSix extends ReusableActions {

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

	@FindBy(xpath = "//div[@id='FF_PrproposerUploadLightBox']")
	public static WebElement addButtonFactFinder;

	@FindBy(xpath = "//div[@id='Ver_Dec_PrproposerUploadLightBox']")
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

	@FindBy(xpath = "//button[@id='submitButtonPopup']")
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

	@FindBy(xpath = "//div[@id='BankS_PrproposerUploadLightBox']")
	public static WebElement addButton;

	@FindBy(xpath = "//div[@id='NACH_PrproposerUploadLightBox']")
	public static WebElement addButtonECSMandate;

	@FindBy(xpath = "//div[@id='CHQ_PrproposerUploadLightBox']")
	public static WebElement cancelledChequeAdd;

	@FindBy(xpath = "//div[@id='Photo_PrproposerUploadLightBox']")
	public static WebElement addButtonPhotograph;

	@FindBy(xpath = "//div[@id='ID_PrproposerUploadLightBox']")
	public static WebElement addButtonIdentityProf;

	@FindBy(xpath = "//div[@id='Comm_Add_PrproposerUploadLightBox']")
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
		String policyNumberFromUI = driver
				.findElement(
						By.xpath("//span[@id='proposalNumberId']"))
				.getText();
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
		 * HomePage.clickDashboard(); driver.findElement( By.
		 * xpath("//input[@placeholder='Enter email id/ Mobile no / Proposal number /Transaction ID']"
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
		Thread.sleep(1800);
		waitTillElementToBeClickable(policyTranactionSearchBox);
		// HomePage.clickDashboard();
		driver.findElement(
				By.xpath("//input[@id='policyTranactionSearchBox']"))
				.sendKeys(str2);
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
		Thread.sleep(500);
		addButton.click();

	}

	public static void communicationAddressProf() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(communicationAddressProf);
		communicationAddressProf.click();
		Thread.sleep(500);
		addButtonCommunication.click();

	}

	public static void factFinderUpload() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(factFinderUpload);
		Thread.sleep(3500);
		factFinderUpload.click();
		Thread.sleep(500);
		addButtonFactFinder.click();
		

	}

	public static void vernacularUpload() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(vernacularDeclarationUpload);
		Thread.sleep(3500);
		vernacularDeclarationUpload.click();
		Thread.sleep(500);
		addButtonVernacular.click();

	}

	public static void ecsMandateFormUpload() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(ecsMandateFormUpload);
		Thread.sleep(3500);
		ecsMandateFormUpload.click();
		Thread.sleep(500);
		addButtonECSMandate.click();
	}

	public static void cancelledChequeWithName() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(cancelledChequeWithName);
		Thread.sleep(3500);
		cancelledChequeWithName.click();
		Thread.sleep(500);
		cancelledChequeAdd.click();

	}

	public static void photographOfProposer() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(photographOfProposer);
		Thread.sleep(3500);
		photographOfProposer.click();
		Thread.sleep(500);
		addButtonPhotograph.click();

	}

	public static void identityProf() throws Exception {
		Thread.sleep(10000);
		waitTillElementToBeClickable(identityProf);
		Thread.sleep(3500);
		identityProf.click();
		Thread.sleep(500);
		addButtonIdentityProf.click();

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
		Screen s = new Screen();
		String filepath = "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";
		String inputFilePath = "C:\\Matrix\\mpro-automation\\src\\test\\resources\\SkuliImages\\";
		
		Pattern openButton = new Pattern(filepath + "Open.PNG");
		Pattern fileName = new Pattern(filepath + "ToBeEnterThePath.PNG");

		proposerDocument();

		s.wait(fileName, 80);
		s.type(fileName, inputFilePath + "AadharCard.jpg");

		s.click(openButton);

		Thread.sleep(500);
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

		desktopFileUpload();

		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void identityProofOrDOB() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		identityProf();

		Thread.sleep(800);

		desktopFileUpload();

		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void photographOfProposerUpload() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);


		photographOfProposer();

		desktopFileUpload();
		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void cancelledChequeWithNameRequired() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		cancelledChequeWithName();

		desktopFileUpload();
		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void ecsMandateForm() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		ecsMandateFormUpload();

		desktopFileUpload();
		Thread.sleep(500);
		submitButtonPopup.click();

	}

	public static void factFinder() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		factFinderUpload();

		// desktopFileUpload();
		Screen s = new Screen();
		s.type("C");
		s.type(Key.DOWN);
		s.type(Key.ENTER);

		s.type("\"BaadharCard.jpg\" \"AadharCard.jpg\" ");
		s.type(Key.ENTER);

		Thread.sleep(500);
		// addButtonFactFinder.click();


		submitButtonPopup.click();

	}

	public static void vernacularDeclaration() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		vernacularUpload();

		// desktopFileUpload();
		Screen s = new Screen();
		s.type("C");
		s.type(Key.DOWN);
		s.type(Key.ENTER);

		s.type("\"BaadharCard.jpg\" \"AadharCard.jpg\" ");
		s.type(Key.ENTER);

		Thread.sleep(500);
		// addButtonFactFinder.click();

		submitButtonPopup.click();

	}

	public static void arrowDownFunctionToScrollDown() throws Exception {
		Thread.sleep(400);
		for (int i = 1; i < 38; i++) {
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

	}

	
	public static void takingBackVALUE() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);

		

	}

	public static void switchingBackToMainWindowScreenSix() throws Exception {
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
		prePopulationDocumentVault();
		Thread.sleep(800);
		communicationAddressProof();
		Thread.sleep(800);
		identityProofOrDOB();
		Thread.sleep(800);
		photographOfProposerUpload();
		Thread.sleep(800);
		cancelledChequeWithNameRequired();
		Thread.sleep(800);
		
		ecsMandateForm();
		Thread.sleep(800);
		factFinder();
		Thread.sleep(800);

		vernacularDeclaration();
		Thread.sleep(800);
	}

	public static void closingTestTrial() throws Exception {
		PageFactory.initElements(driver, JourneyScreenSix.class);
		Thread.sleep(1000);

		/*
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//span[contains(text(),'Payment')]")).click();
		 * Thread.sleep(4000);// Wiating for posv manualyyyyy String policyNumberFromUI
		 * = driver.findElement(By.xpath("//span[@id='proposalNumberId']")).getText();
		 * System.out.println(policyNumberFromUI);
		 * 
		 * String[] policyNumberFromUISplitting = policyNumberFromUI.split(" ");
		 * System.out.println("str2" + Arrays.toString(policyNumberFromUISplitting));
		 * System.out.println("str2" + policyNumberFromUISplitting[2]); str2 =
		 * policyNumberFromUISplitting[2];
		 * 
		 * policyNumber = Integer.parseInt(str2);
		 * System.out.println("After converting it ti int" + policyNumber);
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
}
