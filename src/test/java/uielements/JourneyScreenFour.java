package uielements;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import util.AppConstant;

public class JourneyScreenFour extends ReusableActions {
	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/div/div/div/div[@role=\"button\"]")
	static WebElement identityProofName;

	@FindBy(xpath = "//input[@name='identityProofNumber']")
	static WebElement identityProofNumber;

	@FindBy(xpath = "//label[contains(text(), 'I don’t have PAN Number as I have applied for PAN/PAN acknowledgement have to be provided')]")
	static WebElement idontHavePANNumberAsIhaveAppliedForPANAcknowledgement;

	@FindBy(xpath = "//label[contains(text(), 'I am Exempt from the requirement of PAN under the following provisions of the IT Act 1961')]")
	static WebElement iAmExemptFromRequirementOfPANUnderFollowingProvisions;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfApplication;

	@FindBy(xpath = "//span[(text()=\"Address Proof same as ID Proof\")]")
	static WebElement addressProofSameAsIDProof;

	@FindBy(xpath = ".//*[@id='menu-identityProof']/div[2]/ul/li[1]")
	static WebElement identityProofOption;

	@FindBy(xpath = "//input[@name='panAcknowledgementNo']")
	static WebElement panAcknowledgementNo;

	@FindBy(xpath = "//span[contains(text(),\"Neither my income of any other person in respect of which I am assessable under the act was in excess of the maximum amount not chargeable to income tax in any previous year.\")]")
	static WebElement CheckBox1stOfIamExemptFromTheRequirement;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div[@role=\"button\"]")
	static WebElement identityProofIssuingAuthority;

	@FindBy(xpath = ".//*[@id='menu-identityProofIssuingAuthority']/div[2]/ul/li[1]")
	static WebElement uniqueIdentificationAuthorityOfIndia;

	@FindBy(xpath = "//label[contains(@for, 'CriminalChargesNo')]")
	public static WebElement criminalChargesNo;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[4]/div[2]/div/div/div/div/div[4]/div[1]/div/div[1]/div/div/div/div/div[@role=\"button\"]")
	public static WebElement feetDropDown;

	@FindBy(xpath = "//*[@id='menu-feet']/div[2]/ul/li[1]")
	public static WebElement feetDropDown1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[4]/div[2]/div/div/div/div/div[5]/div[1]/div/div[2]/div/div/div/div/div[@role=\"button\"]")
	public static WebElement inchesDropDownSAPPOSV;

	@FindBy(xpath = ".//*[@id='menu-inches']/div[2]/ul/li[1]")
	public static WebElement inchesDropDown1stOption;

	@FindBy(xpath = "//input[@name='weight']")
	public static WebElement kgsTextBox;

	@FindBy(xpath = "//span [(text()=\"Issued or Pending\")]")
	public static WebElement labelIssuedOrPendingForCheckBox;

	@FindBy(xpath = "//span [(text()=\"Offered at modified terms, rejected or postponed\")]")
	public static WebElement labelOfferedAtModifiedTermsRejectedOrPostponedForCheckBox;

	@FindBy(xpath = "//span [(text()=\"To what extent you are involved in\")]")
	public static WebElement labelToWhatExtentYouAreInvolvedInForHazardousYes;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[4]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
	public static WebElement selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes;

	@FindBy(xpath = ".//*[@id='menu-involvementExtend']/div[2]/ul/li[1]")
	public static WebElement selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[4]/div[2]/div/div/div/div/div[2]/div[4]/div[1]/div/div[1]/div/div/div/div/div[@role=\"button\"]")
	public static WebElement feetDropDownSAPPOSV;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[4]/div[2]/div/div/div/div/div[2]/div[4]/div[1]/div/div[2]/div/div/div/div/div[@role=\"button\"]")
	public static WebElement inchesDropDown;

	@FindBy(xpath = "//span [(text()=\"Do you have any life or Critical Illness insurance policy issued, pending approval from any other insurance companies or has your application for Life/Health/Critical Illness insurance or its reinstatement ever been offered at modified terms, rejected or postponed?\")]")
	public static WebElement labelCriticallIllness;

	@FindBy(xpath = "//label[contains(@for, 'CriticalIllnessYes')]")
	public static WebElement criticalIllnessYesOption;

	@FindBy(xpath = "//span [(text()=\"Do you participate or do you intend to participate in any hazardous activities as part of your Occupation/Sports/Hobby?\")]")
	public static WebElement labelHazardousActivitiesAsOccupation;

	@FindBy(xpath = "//label[contains(@for, 'CriticalIllnessNo')]")
	public static WebElement criticalIllnessNoOption;

	@FindBy(xpath = "//label[contains(@for, 'HazardousActivitiesYes')]")
	public static WebElement hazardousActivitiesYes;

	@FindBy(xpath = "//label[contains(@for, 'HazardousActivitiesNo')]")
	public static WebElement hazardousActivitiesNo;

	@FindBy(xpath = "//span [(text()=\"Have you ever been convicted or are you under investigation for any criminal charges?\")] ")
	public static WebElement labelHaveYouEverConvictedForCriminalCharges;

	@FindBy(xpath = "//label[contains(@for, 'CriminalChargesYes')]")
	public static WebElement criminalChargesYes;

	@FindBy(xpath = "//span [(text()=\"Height\")]")
	public static WebElement labelHeight;

	@FindBy(xpath = "//span [(text()=\"Weight\")]")
	public static WebElement labelWeight;

	@FindBy(xpath = "//span[contains(text(),\"Section 139A : I am carrying on a Business/Profession that does not have total sales/turnover/gross sales exceeding or likely to exceed or likely to exceed Rs. 5 lacs in any previous year.\")]")
	static WebElement CheckBox2ndOfIamExemptFromTheRequirement;

	@FindBy(xpath = "//span[(text()=\"Section 139A : I am not required to furnish return of income as return of income as required under the section 139 (4A) as I am not in receipt of any taxable income which is derived from property held under trust or other legal obligation wholly for charitable or religious purposes.\")]")
	static WebElement CheckBox3rdOfIamExemptFromTheRequirement;

	@FindBy(xpath = "//span[(text()=\"Section 114C : I am having only agricultural income and I am not in receipt of any other income chargeable to Income Tax.\")]")
	static WebElement CheckBox4thOfIamExemptFromTheRequirement;

	@FindBy(xpath = "//span[(text()=\"Section 114C : I am a non-resident Indian with no taxable Income in India.\")]")
	static WebElement CheckBox5thOfIamExemptFromTheRequirement;

	@FindBy(xpath = "//span[(text()=\"Section 10(26) : Being a resident of northeast region and belong to tribes or tribal communities which fall under the category of article 342 & 366 therefore the provision of income tax is not applicable to me.\")]")
	static WebElement CheckBox6thOfIamExemptFromTheRequirement;

	@FindBy(xpath = "//span [(text()=\"Section 139A : Neither my income of any other person in respect of which I am assessable under the act was in excess of the maximum amount not chargeable to income tax in any previous year.\")]")
	public static WebElement isChargeableIncome;

	@FindBy(xpath = "//label[(text()=\"I am Exempt from the requirement of PAN under the following provisions of the IT Act 1961\")]")
	public static WebElement iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961;

	public static void form60RelatedDetailsFeildsIsPresent() throws Exception {
		if (identityProofName.isDisplayed() && identityProofNumber.isDisplayed()
				&& idontHavePANNumberAsIhaveAppliedForPANAcknowledgement.isDisplayed()
				&& iAmExemptFromRequirementOfPANUnderFollowingProvisions.isDisplayed()
				&& dateOfApplication.isDisplayed() && addressProofSameAsIDProof.isDisplayed()) {
			System.out.println("Test case pass:As All the feilds for SCREEN FOUR--form60RelatedDetailsFeildsIsPresent");
		} else {
			Assert.fail("Test case fail:As all the feilds for SCREEN FOUR--form60RelatedDetailsFeilds Is Not present");
		}
	}

	public static void form60RelatedDetailsIdentityProofNameDropDownValidation() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(identityProofName);
		identityProofName.click();
		waitTillElementToBeClickable(identityProofOption);
		Thread.sleep(200);
		String xIdentityProofOption = ".//*[@id='menu-identityProof']/div[2]/ul/li";
		String sheetPath = AppConstant.TEST_DATA_EXCELL;
		comparingExcelDataWithUIBySheetPath(xIdentityProofOption, 0, 4, sheetPath);
		identityProofOption.click();

	}

	public static void form60RelatedDetailsIdentityProofNameOptionSelection() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(identityProofName);
		identityProofName.click();
		waitTillElementToBeClickable(identityProofOption);
		Thread.sleep(200);
		identityProofOption.click();

	}

	public static void idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(idontHavePANNumberAsIhaveAppliedForPANAcknowledgement);
		idontHavePANNumberAsIhaveAppliedForPANAcknowledgement.click();
		Thread.sleep(200);
		if (panAcknowledgementNo.isDisplayed() && dateOfApplication.isDisplayed()) {
			System.out.println(
					"Test case pass as the required feilds for IdontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelect is displayed");
		} else {
			Assert.fail(
					"Test case fail as the required feilds for IdontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelect is not displayed");
		}
	}

	public static void identityProofIssuingAuthority() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(identityProofIssuingAuthority);
		identityProofIssuingAuthority.click();
		waitTillElementToBeClickable(uniqueIdentificationAuthorityOfIndia);
		Thread.sleep(200);
		uniqueIdentificationAuthorityOfIndia.click();

	}

	public static void selectCriminalChargesNo() throws Exception {
		Thread.sleep(200);
		criminalChargesNo.click();
		Thread.sleep(200);
	}

	public static void setKgsForLifestyle(int x, int y, int z) throws Exception {
		kgsTextBox.clear();
		type(kgsTextBox, readingdataTestData(x, y, z));

	}

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[3]")
	public static WebElement outsideClickScreenFour;

	@FindBy(xpath = "//span[text()='Proceed']")
	public static WebElement Proceedbtn;

	public static void feetInchesKgsSelectionToMoveToScreen5() throws Exception {
		Thread.sleep(300);
		waitTillElementVisible(feetDropDown);
		feetDropDown.click();
		waitTillElementToBeClickable(feetDropDown1stOption);
		Thread.sleep(300);
		feetDropDown1stOption.click();
		Thread.sleep(300);
		waitTillElementToBeClickable(inchesDropDownSAPPOSV);
		inchesDropDownSAPPOSV.click();
		Thread.sleep(300);
		waitTillElementToBeClickable(inchesDropDown1stOption);
		inchesDropDown1stOption.click();
		Thread.sleep(300);
		setKgsForLifestyle(1, 1, 1);
		Thread.sleep(300);
		outsideClickScreenFour.click();
		Thread.sleep(300);
		Proceedbtn.click();

	}


	public static void arrowDownFunctionToScrollDown() throws Exception {
		Thread.sleep(400);
		for (int i = 1; i < 8; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(400);
	}

	public static void arrowUpFunctionToScrollUpTillTop() throws Exception {
		Thread.sleep(400);
		for (int i = 1; i < 11; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_UP).build().perform();
		}
		Thread.sleep(400);
	}
	public static void iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961() throws Exception {
		Thread.sleep(200);
		iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961.click();
		arrowDownFunctionToScrollDown();
		waitTillElementToBeClickable(isChargeableIncome);
		Thread.sleep(200);
		isChargeableIncome.click();
		Thread.sleep(200);
	}

	public static void lifestyleFeildsValidationForYes() throws Exception {
		Thread.sleep(200);
		criticalIllnessYesOption.click();
		if (labelIssuedOrPendingForCheckBox.isDisplayed()
				&& labelOfferedAtModifiedTermsRejectedOrPostponedForCheckBox.isDisplayed()) {

			System.out.println(
					"Test case pass:As All the feilds for lifstyle section screen four critical illness yes option is present");
		} else {
			Assert.fail(
					"Test case fail:As all the feilds for lifestyle section screen four critical illness yes option are not present");
		}
		Thread.sleep(200);
		criticalIllnessNoOption.click();
	}

	public static void FeildsValidationHazardousForYes() throws Exception {
		Thread.sleep(200);
		hazardousActivitiesYes.click();
		if (labelToWhatExtentYouAreInvolvedInForHazardousYes.isDisplayed()) {

			System.out.println(
					"Test case pass:As All the feilds for lifstyle section screen four hazardous yes option is present");
		} else {
			Assert.fail(
					"Test case fail:As all the feilds for lifestyle section screen four hazardous yes option are not present");
		}
		Thread.sleep(200);
		selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes.click();
		waitTillElementToBeClickable(selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes1stOption);
		Thread.sleep(200);
		String xpathOFList = ".//*[@id='menu-involvementExtend']/div[2]/ul/li";
		String sheetPath = AppConstant.TEST_DATA_EXCELL;
		comparingExcelDataWithUIBySheetPath(xpathOFList, 1, 0, sheetPath);
		selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes1stOption.click();
		Thread.sleep(200);
		hazardousActivitiesNo.click();

	}

	public static void hazardousActivitiesNo() throws Exception {
		Thread.sleep(200);
		hazardousActivitiesNo.click();
		Thread.sleep(200);
	}

	public static void criticalIllnessNoOption() throws Exception {
		Thread.sleep(200);
		criticalIllnessNoOption.click();
		Thread.sleep(200);

	}

	public static void feetInchesKgsSelectionToMoveToScreen5POSV() throws Exception {
		Thread.sleep(300);
		waitTillElementVisible(feetDropDownSAPPOSV);
		feetDropDownSAPPOSV.click();
		waitTillElementToBeClickable(feetDropDown1stOption);
		Thread.sleep(300);
		feetDropDown1stOption.click();
		Thread.sleep(600);
		waitTillElementToBeClickable(inchesDropDown);
		inchesDropDown.click();
		Thread.sleep(600);
		waitTillElementToBeClickable(inchesDropDown1stOption);
		inchesDropDown1stOption.click();
		Thread.sleep(300);
		setKgsForLifestyle(1, 1, 1);
		Thread.sleep(300);
		outsideClickScreenFour.click();
		Thread.sleep(300);
		Proceedbtn.click();

	}

	public static void arrowDownFunctionToScrollDownTillBottom() throws Exception {
		Thread.sleep(400);
		for (int i = 1; i < 25; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
		}
		Thread.sleep(400);
		Proceedbtn.click();
	}

	public static void lifestyleFeildsValidation() throws Exception {
		Thread.sleep(400);
		if (labelCriticallIllness.isDisplayed() && criticalIllnessYesOption.isDisplayed()
				&& criticalIllnessNoOption.isDisplayed() && labelHazardousActivitiesAsOccupation.isDisplayed()
				&& hazardousActivitiesYes.isDisplayed() && hazardousActivitiesNo.isDisplayed()
				&& labelHaveYouEverConvictedForCriminalCharges.isDisplayed() && criminalChargesYes.isDisplayed()
				&& criminalChargesNo.isDisplayed() && labelHeight.isDisplayed() && labelWeight.isDisplayed()
				&& kgsTextBox.isDisplayed()) {

			System.out.println("Test case pass:As All the feilds for lifstyle section screen four is present");
		} else {
			Assert.fail("Test case fail:As all the feilds for lifestyle section screen four are not present");
		}

	}

	public static void identityProofIssuingAuthorityWithoutValidation() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(identityProofIssuingAuthority);
		identityProofIssuingAuthority.click();
		waitTillElementToBeClickable(uniqueIdentificationAuthorityOfIndia);
		Thread.sleep(200);
		String xIdentityProofOption = ".//*[@id='menu-identityProofIssuingAuthority']/div[2]/ul/li";
		String sheetPath = AppConstant.TEST_DATA_EXCELL;
		comparingExcelDataWithUIBySheetPath(xIdentityProofOption, 0, 5, sheetPath);
		uniqueIdentificationAuthorityOfIndia.click();

	}

	public static void identityProofIssuingAuthorityOptionSelection() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(identityProofIssuingAuthority);
		identityProofIssuingAuthority.click();
		waitTillElementToBeClickable(uniqueIdentificationAuthorityOfIndia);
		uniqueIdentificationAuthorityOfIndia.click();
		Thread.sleep(200);
		System.out.println("outside click started");
		driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
		System.out.println("outside click ended");
		Thread.sleep(200);
	}

	public static void idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectOption() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(idontHavePANNumberAsIhaveAppliedForPANAcknowledgement);
		idontHavePANNumberAsIhaveAppliedForPANAcknowledgement.click();
		Thread.sleep(200);
	}

	public static void setDateBirthdateOfApplication(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		String dateFormat = dateOfApplication.getAttribute("placeholder");
		if (dateFormat.equalsIgnoreCase("DD/MM/YYYY")) {
			System.out.println("Test case pass:As DD/MM/YYYY is the format and displaying in date text box");
		} else {
			Assert.fail("Test case fail:Format is not DD/MM/YYYY");
		}
		dateOfApplication.click();
		LocalDate datw = LocalDate.now().plusDays(1L);
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "day-" + day + "";
		WebElement checkFutureDateIsEnabled = driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"));
		String classes = checkFutureDateIsEnabled.getAttribute("class");
		boolean isDisabled = classes.contains("day--disabled");
		if (isDisabled) {
			logger.info("Test Case pass:'SCREEN FOUR'As Future Date is disabled for date of application");
		} else {
			Assert.fail("Test Case Fail:'SCREEN TWO'Future Date is enabled for date of application");
		}

		dateOfApplication.clear();
		type(dateOfApplication, readingdata(x, y, z));

	}

	public static void setDateBirthdateOfApplicationWithoutValidation() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		waitTillElementToBeClickable(dateOfApplication);
		dateOfApplication.click();
		JourneyScreenThree.dateOfBirthSelctionFunction();
	}

	public static void fillPanApplicationAcknowledgeNo() throws Exception {
		Thread.sleep(200);
		panAcknowledgementNo.clear();
		type(panAcknowledgementNo, readingdataTestData(0, 1, 7));
		String panAcknowledgementNoFromExcel = panAcknowledgementNo.getAttribute("value");
		int size = panAcknowledgementNoFromExcel.length();
		if (size == 15) {
			logger.info("Test case pass:-As PAN Acknowledgement No is of 15 length");
		} else {
			Assert.fail("Test case fail:-As PAN Acknowledgement No is of 15 length");
		}
	}

	public static void fillPanApplicationAcknowledgeNowWithoutValidation() throws Exception {
		Thread.sleep(200);
		panAcknowledgementNo.clear();
		type(panAcknowledgementNo, readingdataTestData(0, 1, 7));
		Thread.sleep(200);
	}

	public static void iAmExemptFromRequirementOfPANUnderFollowingProvisionsSelectFeildsValidation() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(iAmExemptFromRequirementOfPANUnderFollowingProvisions);
		iAmExemptFromRequirementOfPANUnderFollowingProvisions.click();
		Thread.sleep(200);
		if (CheckBox1stOfIamExemptFromTheRequirement.isDisplayed()
				&& CheckBox2ndOfIamExemptFromTheRequirement.isDisplayed()
				&& CheckBox3rdOfIamExemptFromTheRequirement.isDisplayed()
				&& CheckBox4thOfIamExemptFromTheRequirement.isDisplayed()
				&& CheckBox5thOfIamExemptFromTheRequirement.isDisplayed()
				&& CheckBox6thOfIamExemptFromTheRequirement.isDisplayed()) {
			System.out.println(
					"Test case pass:-As all the checkbox is present as per i Am Exempt From Requirement Of PAN Under Following Provisions option");
		} else {

			Assert.fail(
					"Test case fail As all the checkbox is not present as per i Am Exempt From Requirement Of PAN Under Following Provisions option");
		}
		Thread.sleep(200);
		waitTillElementToBeClickable(idontHavePANNumberAsIhaveAppliedForPANAcknowledgement);
		idontHavePANNumberAsIhaveAppliedForPANAcknowledgement.click();
	}

	public static void identityProofNumberValidation(int x, int y, int z) throws Exception {
		Thread.sleep(200);
		identityProofNumber.clear();
		type(identityProofNumber, readingdataTestData(x, y, z));
		String identityProofNumberFromExcel = identityProofNumber.getAttribute("value");
		int size = identityProofNumberFromExcel.length();
		if (size == 25) {
			logger.info("Test case pass:-As identity Proof Number is of 12 length");
		} else {
			Assert.fail("Test case fail:-As identity Proof Number is not of 12 length");
		}

	}

	public static void setIdentityProofNumberValidation(int x, int y, int z) throws Exception {
		Thread.sleep(200);
		identityProofNumber.clear();
		type(identityProofNumber, readingdataTestData(x, y, z));

	}

}