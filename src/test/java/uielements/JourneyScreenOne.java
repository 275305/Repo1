package uielements;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ru.yandex.qatools.allure.annotations.Step;
import util.AppConstant;

public class JourneyScreenOne extends ReusableActions {

	// Locating Indian Nationality radio Button
	@FindBy(xpath = "//input[@value='indian']")
	static WebElement Indianbtn;

	@FindBy(xpath = "//p[(text()=\"Invalid Email Address\")]")
	public static WebElement emailIdErrorMessageIndian;

	@FindBy(xpath = "//p[(text()=\"Invalid Email Id\")]")
	public static WebElement emailIdErrorMessageNRI;

	@FindBy(xpath = "//input[@name='income']")
	public static WebElement annualIncomeInsurersDetailsDependent;

	// Locating NRI Nationality radio Button
	@FindBy(xpath = "//input[@value='nri']")
	static WebElement NRIbtn;

	// Locating PIO Nationality radio Button
	@FindBy(xpath = "//input[@value='pio']")
	static WebElement PIObtn;

	// Locating Foreign National Nationality radio Button
	@FindBy(xpath = "//input[@value='fnational']")
	static WebElement ForeignNationalbtn;

	// Locating Self Policy For radio Button
	@FindBy(xpath = "//input[@value='self']")
	static WebElement Selfbtn;

	// Locating Dependent Policy For radio Button
	@FindBy(xpath = "//input[@value='dependent']")
	static WebElement Dependentbtn;

	// Locating Company Policy For radio Button
	@FindBy(xpath = "//input[@value='company']")
	static WebElement Companybtn;

	// Locating Aadhar number text field
	@FindBy(xpath = "//input[@name='aadhaarNo']")
	static WebElement AadharTxtfld;

	// Locating Don't have Aadhar number link
	@FindBy(xpath = "//span[contains(text(),\"Don't Have PAN?\")]")
	static WebElement DonthaveAadharLink;

	// Locating Get OTP button
	@FindBy(xpath = "//a[text()='Get OTP']")
	static WebElement GetOTPbtn;

	// Locating Pan Number text field
	@FindBy(xpath = "//input[@name='panNumber']")
	static WebElement PanNumbertxtfld;

	@FindBy(xpath = "//label[@for='Insurer2']")
	static WebElement indianInsurerNationality;

	@FindBy(xpath = "//p[text()=\"Please Enter 12 Digit Aadhaar Number\"]")
	static WebElement aadharErrorMsg;

	@FindBy(xpath = "//p[text()=\"Please Enter 12 digit Aadhaar Number\"]")
	static WebElement aadharErrorMsgIndian;

	@FindBy(xpath = "//p[text()=\"Invalid PAN Number\"]")
	static WebElement PANErrorMsg;

	@FindBy(xpath = "//p[text()=\"Invalid Mobile Number\"]")
	static WebElement phoneNumberErrorMsg;

	// Locating Don't Have PAN? link
	@FindBy(xpath = "//a[contains(text(),'t Have PAN?')]")
	static WebElement DontHavePanlink;

	// Locating Mobile Number text field
	@FindBy(xpath = "//input[@name='mobileNumber']")
	static WebElement MobNumtxtfld;

	// Locating Mobile Number text field
	@FindBy(xpath = "//p[text()='Mobile Number Should Be Between 8 to 15 Digits']")
	static WebElement mobileInternationalError;

	@FindBy(xpath = "//p[text()='Invalid Mobile Number']")
	static WebElement invalidMobileNumber;

	// Locating Email Address text field
	@FindBy(xpath = "//input[@name='email']")
	static WebElement Emailtxtfld;

	// Locating PreIssuanceVerificationNumber text field
	@FindBy(xpath = "//input[@name='preIssuanceVerificationNumber']")
	static WebElement PreIssuancetxtfld;

	// Locating PassportNumber text field
	@FindBy(xpath = "//input[@name='PassportNumber']")
	static WebElement PassportNumbertxtfld;

	// Locating passportVisaType text field
	@FindBy(xpath = "//input[@name='passportVisaType']")
	static WebElement passportVisaTypetxtfld;

	// Locating Visa valid till text field
	@FindBy(xpath = "//input[@placeholder='MM/DD/YYYY']")
	static WebElement Visavalidtilltxtfld;

	// Locating Passport issuing country text field
	@FindBy(xpath = "//label[text()='Passport issuing country']")
	static WebElement Passportissuingcountrytxtfld;

	// Locating Save button
	@FindBy(xpath = "//span[text()='Save']")
	static WebElement Savebtn;

	// Locating Proceed button
	@FindBy(xpath = "//span[text()='Proceed']")
	static WebElement Proceedbtn;

	// Locating header of Don't have Aadhaar Number? Popup
	@FindBy(xpath = "//h2[contains(text(),'t have Aadhaar Number?')]")
	static WebElement DonthaveAadhaarlbl;

	// Locating Forgot my aadhaar number radio button on Don't have Aadhaar
	// Number?
	// Popup
	@FindBy(xpath = "//label[text()='Forgot my aadhaar number']")
	static WebElement Frgtmyadhrnumbtn;

	// Locating Applied, and have enrollment number radio button on Don't have
	// Aadhaar Number? Popup
	@FindBy(xpath = "//label[text()='Applied, and have enrollment number']")
	static WebElement Appliedbtn;

	// Locating Never applied radio button on Don't have Aadhaar Number? Popup
	@FindBy(xpath = "//label[text()='Never applied']")
	static WebElement Neverappliedbtn;

	// Locating Jammu & Kashmir radio button on Don't have Aadhaar Number? Popup
	@FindBy(xpath = "//label[text()='Jammu & Kashmir']")
	static WebElement Jamkasbtn;

	// Locating Meghalya radio button on Don't have Aadhaar Number? Popup
	@FindBy(xpath = "//label[text()=' Meghalya']")
	static WebElement Meghalyabtn;

	// Locating Assam radio button on Don't have Aadhaar Number? Popup
	@FindBy(xpath = "//label[text()=' Assam']")
	static WebElement Assambtn;

	// Locating Enrollment Number text field on Don't have Aadhaar Number? Popup
	@FindBy(xpath = "//input[@name='EnrollmentNumber']")
	static WebElement EnrollmentNumbertxt;

	// Locating Proceed button on Don't have Aadhaar Number? Popup
	@FindBy(xpath = "//div[@title='Redirecting to Aadhaar website']")
	static WebElement Proceedbtn1;

	// Locating Invalid Aadhaar number/Service not responding message on Popup
	@FindBy(xpath = "//p[text()='Invalid aadhaar number/Service not responding.']")
	static WebElement Invalidaadharmsg;

	// Locating OK button on Invalid aadhar number Popup
	@FindBy(xpath = "//span[text()='OK']")
	static WebElement Okbtn;

	// Locating Proceed button on Invalid aadhar number Popup
	@FindBy(xpath = "//span[text()='Proceed']")
	static WebElement Proceedbtn2;

	// Locating Please enter the OTP sent to your registered mobile number text
	// on
	// verify aadhar number Popup
	@FindBy(xpath = "//p[text()='Please enter the OTP sent to your registered mobile number.']")
	static WebElement Otpverifylbl;

	// Locating OTP text field on verify otp popup
	@FindBy(xpath = "//div[6]/input[@type='tel']")
	static WebElement OTPtxtfld1;

	// Locating OTP text field on verify otp popup
	@FindBy(xpath = "//div[2]/input[@type='tel']")
	static WebElement OTPtxtfld2;

	// Locating OTP text field on verify otp popup
	@FindBy(xpath = "//div[3]/input[@type='tel']")
	static WebElement OTPtxtfld3;

	// Locating OTP text field on verify otp popup
	@FindBy(xpath = "//div[4]/input[@type='tel']")
	static WebElement OTPtxtfld4;

	// Locating OTP text field on verify otp popup
	@FindBy(xpath = "//div[5]/input[@type='tel']")
	static WebElement OTPtxtfld5;

	// Locating OTP text field on verify otp popup
	@FindBy(xpath = "//div[6]/input[@type='tel']")
	static WebElement OTPtxtfld6;

	// Locating Resend button on verify otp popup
	@FindBy(xpath = "//span[text()='Resend code']")
	static WebElement Resendbtn;

	// Locating Invalid OTP label after entering invalid otp
	@FindBy(xpath = "//p[text()='Invalid OTP']")
	static WebElement Invalidlbl;

	// Locating OK button on Invalid OTP Popup
	@FindBy(xpath = "//span[text()='OK']")
	static WebElement InvalidOKbtn;

	// Locating Proceed button on Invalid OTP Popup
	@FindBy(xpath = "//span[text()='Proceed']")
	static WebElement InvalidProceedbtn;

	@FindBy(xpath = "//a[contains(text(),\"Don't Have Aadhaar Number?\")]")
	static WebElement dontHaveAadhaar;

	@FindBy(xpath = "//label[contains(text(),\"Never applied\")]")
	static WebElement neverApplied;

	@FindBy(xpath = "//label[contains(text(),\"Jammu & Kashmir\")]")
	static WebElement jammuKashmir;

	@FindBy(xpath = "//*[@id='alert-dialog-aadhaar']/div[3]/div/div/div/button//span[contains(text(),\"Proceed\")]")
	static WebElement popupProceedButton;

	@FindBy(xpath = "//p[text()='+91']")
	static WebElement preFixOfMobileNumber;

	@FindBy(xpath = "//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[3]/div[2]/div/div[2]/label/span[1]/span[1]")
	static WebElement dontHavePANCheckbox;

	@FindBy(xpath = "//div[@id='nri']")
	static WebElement residentialsStatusNRI;

	@FindBy(xpath = "//label[@for='nri']")
	static WebElement nriNationality;

	@FindBy(xpath = "//input[@name='passportNumber']")
	static WebElement passportNumberNRI;

	@FindBy(xpath = "//div[@id='nationalityNRI']")
	static WebElement nationalityNRI;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	static WebElement visaValidDateNRI;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[3]/div[2]/div[1]/div/label[contains(text(),\"Visa valid till\")]")
	static WebElement visaValidTillLabelHeading;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[3]/div[3]/div/div/label[contains(text(),\"Passport Exipry Date\")]")
	static WebElement passportExipryDate;

	@FindBy(xpath = "//input[@placeholder='Search a country']")
	static WebElement pasportIssuingCountryNRI;

	@FindBy(xpath = "//span[text()='Policy For']")
	static WebElement policyForNRI;

	@FindBy(xpath = "//label[text()='Self']")
	static WebElement selfNRI;

	@FindBy(xpath = "//label[text()='Dependent']")
	static WebElement dependentNRI;

	@FindBy(xpath = "//label[text()='Company']")
	static WebElement CompanyNRI;

	@FindBy(xpath = "//input[@name='aadhaarNo']")
	static WebElement AadhaarNRI;

	@FindBy(xpath = "//input[@name='panNumber']")
	static WebElement PanNumberNRI;

	@FindBy(xpath = "//input[@name='Isd']")
	static WebElement isdCodeNRI;

	@FindBy(xpath = "//input[@name='mobileNumber']")
	static WebElement mobileNumberNRI;

	@FindBy(xpath = "//input[@name='email']")
	static WebElement emailAddressNRI;

	@FindBy(xpath = "//input[@name='preIssuanceVerificationNumber']")
	static WebElement preIssuranceVerificationNRI;

	@FindBy(xpath = "//div[@id='passportVisaType_id']")
	static WebElement typeOfVisa;

	@FindBy(xpath = "//*[@id='menu-passportVisaType']/div[2]/ul/li[contains(text(),\"Dependent\")]")
	static WebElement dependentTypeOfVisa;

	@FindBy(xpath = "//*[@id='menu-passportVisaType']/div[2]/ul/li[contains(text(),\"Working\")]")
	static WebElement workingTypeOfVisa;

	@FindBy(xpath = "//*[@id='menu-passportVisaType']/div[2]/ul/li[contains(text(),\"Visiting\")]")
	static WebElement visitingTypeOfVisa;

	@FindBy(xpath = "//*[@id='menu-passportVisaType']/div[2]/ul/li[contains(text(),\"Others\")]")
	static WebElement othersTypeOfVisa;

	@FindBy(xpath = "//input[@name='passportNumber']")
	static WebElement passportTextfld;

	@FindBy(xpath = "//div[@id='visaExpiryDate_id']")
	static WebElement visaValidTill;

	@FindBy(xpath = "//div[@id='passportExpiryDate_id']")
	static WebElement passportExpiryDate;

	@FindBy(xpath = "//input[@placeholder='Search a country']")
	static WebElement passportIssuingCountry;

	@FindBy(xpath = "//div[@id='react-autowhatever-passportIssuingCountry']/ul/li[1]")
	static WebElement passportIssuingCountry1stOption;

	@FindBy(xpath = "//label[@for='dependent']")
	static WebElement dependentOptionButton;

	@FindBy(xpath = "//li[@id='react-autowhatever-passportIssuingCountry--item-0']")
	static WebElement passportIssuingCountryOptionSelection;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[6]/div[1]/div/div[1]/div/div[1]/div/input[@placeholder='Country']")
	static WebElement isdCode;

	@FindBy(xpath = "//label[@for='dependent']")
	static WebElement dependentOption;

	@FindBy(xpath = "//input[@name='isPANExist']")
	static WebElement dontHavePAN;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[1]/div[2]/span[1]")
	static WebElement insurersOtherDetailsPressSupress;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div")
	static WebElement insurersOtherDetailsSection;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div/div/div/div/div[@role=\"button\"]")
	static WebElement industryTypeInsurersDetails;

	// Initializing the Objects
	public JourneyScreenOne(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public static void dependentTypeOfVisa() throws Exception {
		click(dependentTypeOfVisa);
	}

	public static void industryTypeInsurersDetails() throws Exception {
		click(industryTypeInsurersDetails);

	}

	public static void insurersOtherDetailsPressSupress() throws Exception {

		click(insurersOtherDetailsPressSupress);
	}

	public static void dontHavePAN() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		Thread.sleep(300);
		click(dontHavePAN);

	}

	public static void dependentOption() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		System.out.println(dependentOption.isDisplayed());
		waitTillElementLocated(dependentOption);
		click(dependentOption);

	}

	public static void dontHaveAadhaar() throws Exception {

		click(dontHaveAadhaar);

	}

	@Step("Getting residental NRI status")
	public static void residentialsStatusNRI() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		click(residentialsStatusNRI);

	}

	public static void nriNationality() throws Exception {
		click(nriNationality);

	}

	@Step("Getting nationality_NRI status")
	public static void nationalityNRI() throws Exception {

		click(nationalityNRI);

	}

	public static void neverApplied() throws Exception {

		click(neverApplied);

	}

	public static void jammuKashmir() throws Exception {

		click(jammuKashmir);

	}

	public static void popupProceedButton() throws Exception {

		click(popupProceedButton);

	}

	public static void passportIssuingCountryOptionSelection() throws Exception {
		Thread.sleep(200);
		click(passportIssuingCountryOptionSelection);

	}

	// Select Indian as an nationality
	public static void selectIndian() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		waitTillElementLocated(Indianbtn);

		click(Indianbtn);

	}

	// Not working fuctionality press/supress
	public static void feildSupressFuctionalityInsurersDetails() throws Exception {
		System.out.println("just after landed no press"
				+ driver.findElement(By.xpath("//input[@name='insurerAnnualIncome']")).isEnabled());
		/*
		 * if(insurersOtherDetailsSection.isDisplayed()) { Assert. fail(
		 * "Test case Fail:-'SCREEN THREE'As feilds supress fuctionality for insurers details is not working"
		 * ); }else { System.out. println(
		 * "Test case pass:-'SCREEN THREE'As feilds supress fuctionality for insurers details working"
		 * ); } Thread.sleep(1000);
		 */
		Thread.sleep(10000);
		insurersOtherDetailsPressSupress();
		System.out.println(
				"after press" + driver.findElement(By.xpath("//input[@name='insurerAnnualIncome']")).isEnabled());

	}

	// Select NRI as an nationality
	public static void selectNRI() throws Exception {
		System.out.println("1111111111111111111");
		boolean e = NRIbtn.isEnabled();
		System.out.println(e);
		waitTillElementVisible(NRIbtn);
		boolean d = NRIbtn.isDisplayed();
		System.out.println(d);
		click(residentialsStatusNRI);
		// waitTillElementVisible(NRIbtn);

	}

	// Select PIO as an nationality
	public static void selectPIO() throws Exception {

		click(PIObtn);

	}

	// Select Foreign National as an nationality
	public static void selectForeignNational() throws Exception {

		click(ForeignNationalbtn);

	}

	// Select Self for Policy for
	public static void selectSelf() throws Exception {

		click(Selfbtn);

	}

	// Select Dependent for Policy for
	public static void selectDependent() throws Exception {

		click(Dependentbtn);

	}

	// Select Dependent for Policy for
	public static void selectCompany() throws Exception {

		click(Companybtn);

	}

	public static boolean checkAdhaarErrorMsgMultipleDataIndian() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		// int totalNumOfRows = sheet.getLastRowNum();
		// System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < 8; rowNum++) {
			validatingErrorMsgForAdhaarNumberIndian(sheet, rowNum);
			Thread.sleep(1000);
		}
		hssfWorkbook.close();
		return false;
	}

	public static void getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenOne() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Custome')]")).click();
		Thread.sleep(1000);
		String xpathOfTexOnTheScreen = "//input[contains(@type,'text')]";
		List<String> actualResultText = fetchingdataFromUI(xpathOfTexOnTheScreen);
		actualResultText.removeAll(Arrays.asList("", null));
		System.out.println("actual result after removing true fales" + actualResultText);
		List<String> expectedResult = fetchingdataFromExcelExpectedResult(9, 6);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);

		String xpathOfRadioOnTheScreen = "//input[@checked=\"\"]";
		List<String> actualResultRadioButtonValue = fetchingdataFromUI(xpathOfRadioOnTheScreen);
		List<String> expectedResultRadioButtonValue = fetchingdataFromExcelExpectedResult(10, 6);
		System.out.println("Expected radio button" + actualResultRadioButtonValue);
		System.out.println("Actual radio button" + expectedResultRadioButtonValue);
		actualResultRadioButtonValue.removeAll(Arrays.asList("", null));
		System.out.println("actualResultRadioButtonValue" + actualResultRadioButtonValue);
		comparisonOfListForExpectedAndActualResult(expectedResultRadioButtonValue, actualResultRadioButtonValue);

	}

	public static void validatingErrorMsgForAdhaarNumberIndian(XSSFSheet sheet, int rowNum) throws Exception {

		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell aadharNumber = sheet.getRow(rowNum).getCell(10);
		String aadharNumberFromExcell = aadharNumber.getStringCellValue();
		Thread.sleep(500);
		AadharTxtfld.click();
		AadharTxtfld.clear();
		System.out.println("i am clearing");
		AadharTxtfld.sendKeys(aadharNumberFromExcell);
		Thread.sleep(500);
		String aadharNumberFromUI = AadharTxtfld.getAttribute("value");
		Thread.sleep(200);
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
		Thread.sleep(200);
		if (aadharNumberFromUI.length() == 12)

		{
			Thread.sleep(800);
			// System.out.println(isElementDisplayed(aadharErrorMsg));
			if (isElementDisplayed(aadharErrorMsgIndian)) {

				Assert.fail("Test case fail:As error message for aadhaar number length 12 is displaying");
			} else {
				System.out.println("Test case pass:As error message for aadhaar number length 12 is not displaying");
			}

		} else {

			System.out.println("i am in else");
			driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
			Thread.sleep(500);
			if (isElementDisplayed(aadharErrorMsgIndian)) {
				System.out.println("Test case pass:As error message for aadhaar number length i.e != 12 is displaying");

			} else {

				Assert.fail("Test case fail:As error message for aadhaar number length i.e !=12 is not displaying");

			}

		}
	}

	public static boolean checkAdhaarErrorMsgMultipleDataNRI() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		// int totalNumOfRows = sheet.getLastRowNum();
		// System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < 8; rowNum++) {
			validatingErrorMsgForAdhaarNumberNRI(sheet, rowNum);
			Thread.sleep(1000);
		}
		hssfWorkbook.close();
		return false;
	}

	public static void validatingErrorMsgForAdhaarNumberNRI(XSSFSheet sheet, int rowNum) throws Exception {

		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell aadharNumber = sheet.getRow(rowNum).getCell(10);
		String aadharNumberFromExcell = aadharNumber.getStringCellValue();
		Thread.sleep(500);
		AadharTxtfld.click();
		AadharTxtfld.clear();
		System.out.println("i am clearing");
		AadharTxtfld.sendKeys(aadharNumberFromExcell);
		Thread.sleep(500);
		String aadharNumberFromUI = AadharTxtfld.getAttribute("value");
		Thread.sleep(200);
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
		Thread.sleep(200);
		if (aadharNumberFromUI.length() == 12)

		{
			Thread.sleep(800);
			// System.out.println(isElementDisplayed(aadharErrorMsg));
			if (isElementDisplayed(aadharErrorMsg)) {

				Assert.fail("Test case fail:As error message for aadhaar number length 12 is displaying");
			} else {
				System.out.println("Test case pass:As error message for aadhaar number length 12 is not displaying");
			}

		} else {

			System.out.println("i am in else");
			driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
			Thread.sleep(500);
			if (isElementDisplayed(aadharErrorMsg)) {
				System.out.println("Test case pass:As error message for aadhaar number length i.e != 12 is displaying");

			} else {

				Assert.fail("Test case fail:As error message for aadhaar number length i.e !=12 is not displaying");

			}

		}
	}

	// Enter Aadhaar Number
	@Step("Getting Aadhar Number")
	public static void setAadhar(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		AadharTxtfld.clear();
		type(AadharTxtfld, readingdata(x, y, z));

		String aAdharTxtfldPassedFromExcel = AadharTxtfld.getAttribute("value");
		int size = aAdharTxtfldPassedFromExcel.length();
		if (size == 12 && !aAdharTxtfldPassedFromExcel.contains("A") && !aAdharTxtfldPassedFromExcel.contains("*")) {
			logger.info("Test case pass:- As aadhar feild length is 12 and accepting only numbers");
		} else {
			Assert.fail("Test case fail:-As either aadhar feild length is not 12 or not accepting only numbers");
		}
	}

	// Click on Don't have aadhar link
	public static void clickDonthaveAadhar() throws Exception {
		click(DonthaveAadharLink);
	}

	public static void typeOfVisa() throws Exception {

		click(typeOfVisa);

	}

	// Click on Get OTP option
	public static void clickGetOTP() throws Exception {

		click(GetOTPbtn);

	}

	public static void getvalues(String s1) {
		if (s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

	// Enter PAN Number
	@Step("Getting the pan number")
	public static void setPanNumber(int x, int y, int z) throws Exception {
		// type(PanNumbertxtfld, strPanNumber);
		PageFactory.initElements(driver, JourneyScreenOne.class);
		PanNumbertxtfld.clear();
		type(PanNumbertxtfld, readingdata(x, y, z));
		String panNumberCPassedFromExcel = PanNumbertxtfld.getAttribute("value");
		int size = panNumberCPassedFromExcel.length();
		if (size == 10 && panNumberCPassedFromExcel.contains("C") && panNumberCPassedFromExcel.contains("4")
				&& !panNumberCPassedFromExcel.contains("#")) {
			logger.info(
					"Test case pass:- As PAN feild length is 10 and accepting only alphabnumeric value and not accepting special character");
		} else {
			Assert.fail(
					"Test case fail:-As either PAN feild length is not of 10 or not accepting only alphabnumeric value or accepting special character");
		}

	}

	public static boolean checkPANErrorMsgWithMultipleData() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		// int totalNumOfRows = sheet.getLastRowNum();
		// System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < 8; rowNum++) {
			validatingErrorMsgForPANNRI(sheet, rowNum);
			Thread.sleep(1000);
		}
		hssfWorkbook.close();
		return false;
	}

	public static void validatingErrorMsgForPANNRI(XSSFSheet sheet, int rowNum) throws Exception {

		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell PANNumber = sheet.getRow(rowNum).getCell(1);
		String PANNumberFromExcell = PANNumber.getStringCellValue();
		Thread.sleep(300);
		PanNumbertxtfld.click();
		Thread.sleep(300);
		PanNumbertxtfld.clear();
		Thread.sleep(300);
		PanNumbertxtfld.sendKeys(PANNumberFromExcell);
		Thread.sleep(300);
		String aadharNumberFromUI = PanNumbertxtfld.getAttribute("value");
		System.out.println(aadharNumberFromUI);
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
		Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		Matcher matcher = pattern.matcher(aadharNumberFromUI);
		if (matcher.matches()) {

			if (isElementDisplayed(PANErrorMsg)) {
				Assert.fail("Test case fail as error message is displaying but PAN number is correct");
			} else {
				System.out.println(
						"Test case pass:As error message for correct PAN number error message is not displaying");
			}

		} else {
			if (isElementDisplayed(PANErrorMsg)) {
				System.out.println(
						"Test case pass:As error message for correct PAN number error message is not displaying");
			} else {
				Assert.fail("Test case fail as error message is displaying but PAN number is correct");
			}
		}
	}

	public static void validatingErrorMsgForPhoneNumberScreenOne(XSSFSheet sheet, int rowNum) throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell phoneNumber = sheet.getRow(rowNum).getCell(2);
		String phoneNumberFromExcell = phoneNumber.getStringCellValue();
		System.out.println("From excell " + phoneNumberFromExcell);
		MobNumtxtfld.click();
		Thread.sleep(200);
		MobNumtxtfld.clear();
		Thread.sleep(200);
		MobNumtxtfld.sendKeys(phoneNumberFromExcell);

		String phoneNumberFromUI = MobNumtxtfld.getAttribute("value");
		System.out.println(phoneNumberFromUI);
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();

		if (phoneNumberFromUI.length() == 10) {

			if (isElementDisplayed(phoneNumberErrorMsg)) {
				Assert.fail("Test case fail as error message is displaying for correct phone number");
			} else {
				System.out.println("Test case pass:As error message for correct phone number is not displaying");
			}

		} else {
			if (isElementDisplayed(phoneNumberErrorMsg)) {
				System.out.println("Test case pass:As error message for wrong phone number is displaying");

			} else {

				Assert.fail("Test case fail as error message is not displaying for wrong phone number");
			}
		}
	}

	public static boolean checkPhoneNumberErrorMsgWithMultipleData() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		// int totalNumOfRows = sheet.getLastRowNum();
		// System.out.println("\n Total num of rows found " + totalNumOfRows);
		for (int rowNum = 1; rowNum < 8; rowNum++) {
			validatingErrorMsgForPhoneNumberScreenOne(sheet, rowNum);
			Thread.sleep(1000);
		}
		hssfWorkbook.close();
		return false;
	}

	public static void clickDontHavePan() throws Exception {

		click(DontHavePanlink);

	}

	// Enter Mobile Number
	public static void checkSetMobNumber(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));
		String mobile = MobNumtxtfld.getAttribute("value");
		System.out.println(mobile);

	}

	// Enter Mobile Number
	@Step("Getting mobile Number")
	public static void setMobNumber(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));
		String mobileNumberPassedFromExcel = MobNumtxtfld.getAttribute("value");
		int size = mobileNumberPassedFromExcel.length();
		if (size == 10 && !mobileNumberPassedFromExcel.contains("A") && mobileNumberPassedFromExcel.contains("9")
				&& !mobileNumberPassedFromExcel.contains("@")) {
			logger.info(
					"Test case pass:- As Mobile number feild length is 10 and accepting only numeric value,not accepting special character and alphabets ");
		} else {
			Assert.fail(
					"Test case fail:-As either Mobile number feild length is not 10 or not accepting only numeric value,accepting special character or alphabets");
		}

	}

	public static void internationalMobileNumberMinErrorValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));
		String mobileNumberPassedFromExcel = MobNumtxtfld.getAttribute("value");
		int size = mobileNumberPassedFromExcel.length();
		if (size == 7) {
			if (isElementDisplayed(mobileInternationalError)) {

				System.out.println("Test case pass:As error message is displayig for 7 digit");
			} else {
				Assert.fail("Test case fail:As error message is not displaying for 7 digit");
			}

		}

	}

	public static void nationalMobileNumberMinErrorValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));
		String mobileNumberPassedFromExcel = MobNumtxtfld.getAttribute("value");
		int size = mobileNumberPassedFromExcel.length();
		if (size == 9) {
			if (isElementDisplayed(invalidMobileNumber)) {

				System.out.println("Test case pass:As error message is displayig for 9 digit");
			} else {
				Assert.fail("Test case fail:As error message is not displaying for 9 digit");
			}

		}

	}

	public static void internationalMobileNumberMaxErrorValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));
		String mobileNumberPassedFromExcel = MobNumtxtfld.getAttribute("value");
		int size = mobileNumberPassedFromExcel.length();
		if (size == 14) {
			if (isElementDisplayed(mobileInternationalError)) {

				System.out.println("Test case pass:As error message is displayig for 14 digit");
			} else {
				Assert.fail("Test case fail:As error message is not displaying for 14 digit");
			}

		}

	}

	public static void internationalMobileNumberMaxValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));
		String mobileNumberPassedFromExcel = MobNumtxtfld.getAttribute("value");
		int size = mobileNumberPassedFromExcel.length();
		if (size == 15) {
			if (isElementDisplayed(mobileInternationalError)) {

				Assert.fail("Test case fail:As error message is not displaying for 15 digit");

			} else {

				System.out.println("Test case pass:As error message is displayig for 15 digit");
			}

		}

	}

	public static void internationalMobileNumberMinValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));
		String mobileNumberPassedFromExcel = MobNumtxtfld.getAttribute("value");
		int size = mobileNumberPassedFromExcel.length();
		if (size == 8) {
			if (isElementDisplayed(mobileInternationalError)) {

				Assert.fail("Test case fail:As error message is not displaying for 8 digit");

			} else {

				System.out.println("Test case pass:As error message is displayig for 8 digit");
			}

		}

	}

	public static void nationalMobileNumberMinValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));
		String mobileNumberPassedFromExcel = MobNumtxtfld.getAttribute("value");
		int size = mobileNumberPassedFromExcel.length();
		if (size == 10) {
			if (isElementDisplayed(mobileInternationalError)) {

				Assert.fail("Test case fail:As error message is not displaying for 10 digit");

			} else {

				System.out.println("Test case pass:As error message is displayig for 10 digit");
			}

		}

	}

	public static void preFixOfMobileNumber(int x, int y, int z) throws Exception {

		if (preFixOfMobileNumber.isDisplayed()) {
			System.out.println("mobile number verified");
		}

	}

	// Enter Email id
	@Step("Getting email_ID")
	public static void setEmailId(int x, int y, int z) throws Exception {
		// type(Emailtxtfld, strEmailId);
		Emailtxtfld.clear();
		type(Emailtxtfld, readingdata(x, y, z));
		String emailPassedFromExcel = Emailtxtfld.getAttribute("value");
		/*
		 * int size = emailPassedFromExcel.length();
		 * if(emailPassedFromExcel.endsWith("@gmail.com")||emailPassedFromExcel.
		 * endsWith ("@monocept.com") ) { logger.info(
		 * "Test case pass:-As entered email format is correct "); }else {
		 * Assert.fail("Test case fail:-As entered email format is not correct"
		 * ); }
		 */

		if (isValid(emailPassedFromExcel)) {
			System.out.println("Test case pass:As email ID is valid");

		} else {
			Assert.fail("Test case fail As email ID is not valid");
		}

	}

	public static void FormatVisaValidTill() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		String dateOfBirthFormat = visaValidTill.getAttribute("placeholder");
		System.out.println("is hidden label is " + dateOfBirthFormat);
		System.out.println(dateOfBirthFormat.equalsIgnoreCase("DD/MM/YYYY"));
		if (dateOfBirthFormat.equalsIgnoreCase("DD/MM/YYYY")) {
			logger.info("Test Case Pass: Date of Birth - Field format DD/MM/YYYY");
		} else {
			Assert.fail("Test Case Fail:Date of Birth - Field format DD/MM/YYYY is not as per functionality");
		}
	}

	public static void FormatPassportExpiryDate() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		String passportExpiryDateFormat = passportExpiryDate.getAttribute("placeholder");
		if (passportExpiryDateFormat.equalsIgnoreCase("DD/MM/YYYY")) {
			logger.info("Test Case Pass: Passport expiry date - Field format DD/MM/YYYY");
		} else {
			Assert.fail("Test Case Fail:Passport expiry date - Field format DD/MM/YYYY is not as per functionality");
		}
	}

	public static void futureDateEnabilityVisaValidTill() throws Exception {
		visaValidTill.click();
		LocalDate datw = LocalDate.now().plusDays(1L);
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "day-" + day + "";
		System.out.println(day);
		System.out.println(runtimeXpathForSelectingDate);
		boolean checkFutureDateIsEnabled = driver.findElement(By
				.xpath("///div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))][@aria-label="
						+ runtimeXpathForSelectingDate + "]"))
				.isEnabled();

		if (checkFutureDateIsEnabled) {
			logger.info("Test Case Pass:Cuurent Date is enabled as per the requirement of visa valid till ");
		} else {
			Assert.fail("Test Case fail:Pass:Cuurent Date is disabled as per the requirement of visa valid till");
		}
	}

	public static void futureDateEnabilityPassportExpiryDate() throws Exception {
		passportExpiryDate.click();
		LocalDate datw = LocalDate.now().plusDays(1L);
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "day-" + day + "";
		System.out.println(day);
		System.out.println(runtimeXpathForSelectingDate);
		boolean checkFutureDateIsEnabled = driver.findElement(By
				.xpath("///div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))][@aria-label="
						+ runtimeXpathForSelectingDate + "]"))
				.isEnabled();

		if (checkFutureDateIsEnabled) {
			logger.info("Test Case Pass:Cuurent Date is enabled as per the requirement of passport expiry date");
		} else {
			Assert.fail("Test Case fail:Pass:Cuurent Date is disabled as per the requirement of passport expiry date");
		}
	}

	public static void checkVisaValidAndExpiryDateFutureDateEnability() throws Exception {
		LocalDate datw = LocalDate.now().plusDays(1L);
		System.out.println(datw);
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "day-" + day + "";
		WebElement checkFutureDateIsEnabled = driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"));
		String classes = checkFutureDateIsEnabled.getAttribute("class");
		boolean isDisabled = classes.contains("day--disabled");
		System.out.println("class" + classes);
		System.out.println("is disable" + isDisabled);
		if (isDisabled) {
			Assert.fail("Test Case Fail:'SCREEN ONE'Future Date is disabled for insurers details ");
		} else {
			logger.info("Test Case pass:'SCREEN ONE'As Future Date is enabled for insurers details");

		}

		driver.switchTo().defaultContent();
		driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"))
				.click();
	}

	public static void visaValidAndExpiryDateDateSelection() throws Exception {
		LocalDate datw = LocalDate.now().plusDays(1L);
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "day-" + day + "";
		driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"))
				.click();
	}

	public static void visaValidTillMultipleData() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		Thread.sleep(200);
		FormatVisaValidTill();
		Thread.sleep(500);
		visaValidTill.click();
		// futureDateEnabilityVisaValidTill();
		checkVisaValidAndExpiryDateFutureDateEnability();

	}

	@Step("Getting VISA validity")
	public static void visaValidTillSingleData() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		Thread.sleep(700);
		visaValidTill.click();
		/*
		 * Calendar calendar = Calendar.getInstance(); int currentDay =
		 * calendar.get(Calendar.DAY_OF_MONTH); String
		 * runtimeXpathForSelectingDate = "day-" + currentDay + "";
		 * driver.switchTo().defaultContent(); driver.findElement(By.xpath(
		 * "//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""
		 * + runtimeXpathForSelectingDate + "\"]")) .click();
		 */
		visaValidAndExpiryDateDateSelection();
	}

	public static void passportExpiryDateMultiple() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		Thread.sleep(200);
		FormatPassportExpiryDate();
		Thread.sleep(500);
		passportExpiryDate.click();
		// futureDateEnabilityPassportExpiryDate();
		checkVisaValidAndExpiryDateFutureDateEnability();

	}

	@Step("Getting possport expiry date")
	public static void passportExpiryDateForSingleData() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		Thread.sleep(200);
		passportExpiryDate.click();
		/*
		 * Calendar calendar = Calendar.getInstance(); int currentDay =
		 * calendar.get(Calendar.DAY_OF_MONTH); String
		 * runtimeXpathForSelectingDate = "day-" + currentDay + "";
		 * driver.switchTo().defaultContent(); driver.findElement(By.xpath(
		 * "//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""
		 * + runtimeXpathForSelectingDate + "\"]")) .click();
		 */
		visaValidAndExpiryDateDateSelection();

	}

	public static boolean checkEmailErrorMsgWithMultipleDataIndian() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		// int totalNumOfRows = sheet.getLastRowNum();
		// System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < 8; rowNum++) {
			validatingErrorMsgEmailIndian(sheet, rowNum);
			Thread.sleep(1000);
		}
		hssfWorkbook.close();
		return false;
	}

	public static void validatingErrorMsgEmailIndian(XSSFSheet sheet, int rowNum) throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell cEmail = sheet.getRow(rowNum).getCell(3);
		String sEmailFromExcell = cEmail.getStringCellValue();
		Thread.sleep(300);
		Emailtxtfld.click();
		Thread.sleep(300);
		Emailtxtfld.clear();
		Thread.sleep(300);
		Emailtxtfld.sendKeys(sEmailFromExcell);
		String eEmailIDFromUI = Emailtxtfld.getAttribute("value");
		driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
		System.out.println(eEmailIDFromUI);
		if (isValid(eEmailIDFromUI)) {
			if (isElementDisplayed(emailIdErrorMessageIndian)) {
				Assert.fail("Test case fail as error message is displaying with correct email ID");
			} else {
				System.out.println("Test case pass:As error message is not displaying with correct email ID");
			}

		} else {
			Thread.sleep(200);
			if (isElementDisplayed(emailIdErrorMessageIndian)) {
				System.out.println("Test case pass as error message is displaying with incorrect email ID");
			} else {
				Assert.fail("Test case fail:As error message is not displaying with incorrect email ID");
			}
		}

	}

	public static boolean checkEmailErrorMsgWithMultipleDataNRI() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		// int totalNumOfRows = sheet.getLastRowNum();
		// System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < 8; rowNum++) {
			validatingErrorMsgEmailIDNRI(sheet, rowNum);
			Thread.sleep(1000);
		}
		hssfWorkbook.close();
		return false;
	}

	public static void validatingErrorMsgEmailIDNRI(XSSFSheet sheet, int rowNum) throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell cEmail = sheet.getRow(rowNum).getCell(3);
		String sEmailFromExcell = cEmail.getStringCellValue();
		Thread.sleep(300);
		Emailtxtfld.click();
		Thread.sleep(300);
		Emailtxtfld.clear();
		Thread.sleep(300);
		Emailtxtfld.sendKeys(sEmailFromExcell);
		String eEmailIDFromUI = Emailtxtfld.getAttribute("value");
		driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
		System.out.println(eEmailIDFromUI);
		if (isValid(eEmailIDFromUI)) {
			if (isElementDisplayed(emailIdErrorMessageNRI)) {
				Assert.fail("Test case fail as error message is displaying with correct email ID");
			} else {
				System.out.println("Test case pass:As error message is not displaying with correct email ID");
			}

		} else {
			Thread.sleep(200);
			if (isElementDisplayed(emailIdErrorMessageNRI)) {
				System.out.println("Test case pass as error message is displaying with incorrect email ID");
			} else {
				Assert.fail("Test case fail:As error message is not displaying with incorrect email ID");
			}
		}

	}

	// Enter PreIssuance Verification Number
	@Step("Getting pre-Inssurance Number")
	public static void setPreIssuanceNumber(int x, int y, int z) throws Exception {

		// type(PreIssuancetxtfld, strPreIssuance);
		PreIssuancetxtfld.clear();
		type(PreIssuancetxtfld, readingdata(x, y, z));
		String preIssuranceNumberPassedFromExcel = PreIssuancetxtfld.getAttribute("value");
		// int size = preIssuranceNumberPassedFromExcel.length();
		if (preIssuranceNumberPassedFromExcel.length() == 8) {
			logger.info("Test case pass:-As entered preInsurance number is of expected length");
		} else {
			Assert.fail("Test case fail:-As entered preInsurance number is not of expected length");
		}

	}


	// Enter Passport Number Number
	public static void setPassportNumber(String strPassportNumber) throws Exception {

		type(PassportNumbertxtfld, strPassportNumber);

	}

	// Enter Passport Visa Type
	public static void setVisaType(String strVisaType) throws Exception {

		type(passportVisaTypetxtfld, strVisaType);

	}

	// Enter Visa Valid till date
	public static void setVisavalidtill(String strVisavalidtill) throws Exception {

		type(Visavalidtilltxtfld, strVisavalidtill);

	}

	// Enter Passport issuing Country
	public static void setPassportissuingcountry(String strPassportissuingcountry) throws Exception {

		type(Passportissuingcountrytxtfld, strPassportissuingcountry);

	}

	public static void clickSave() throws Exception {

		click(Savebtn);

	}

	public static void clickProceed() throws Exception {
		Savebtn.click();
		click(Proceedbtn);
		ReusableActions.waitTillElementLocated(Proceedbtn);

	}

	public static void isIndianSelected() throws Exception {
		PageFactory.initElements(driver, JourneyScreenOne.class);
		if (Indianbtn.isSelected()) {
			logger.info("Indian is selected");
		} else {
			logger.info("Indian is not selected");
		}

	}

	public static void isSelfSelected() throws Exception {
		// PageFactory.initElements(driver, JourneyScreenOne.class);
		if (Selfbtn.isSelected()) {
			logger.info("Self is selected");
		} else {
			logger.info("Self is not selected");
		}
	}

	public static void isDontHaveAadharEnabled() throws Exception {
		if (DonthaveAadharLink.isDisplayed()) {
			logger.info("Don't have aadhar Link is enabled by default");
		} else {
			logger.info("Don't have aadhar Link is not enabled by default");
		}

	}

	public static void isProceedEnabled() throws Exception {
		if (Proceedbtn.isEnabled()) {
			logger.info("Proceed button is enabled by default");
		} else {
			logger.info("Proceed button is not enabled by default");
		}
	}

	public static void isAllTheFeildsOfNRIDisplayed() throws Exception {
		residentialsStatusNRI();
		if (passportNumberNRI.isDisplayed() && visaValidTillLabelHeading.isDisplayed()
				&& passportExipryDate.isDisplayed() && pasportIssuingCountryNRI.isDisplayed()
				&& policyForNRI.isDisplayed() && selfNRI.isDisplayed() && dependentNRI.isDisplayed()
				&& AadhaarNRI.isDisplayed() && PanNumberNRI.isDisplayed() && mobileNumberNRI.isDisplayed()
				&& emailAddressNRI.isDisplayed() && preIssuranceVerificationNRI.isDisplayed()) {
			logger.info("Test Case Pass as all the feilds of NRI is displayed");
		} else {
			Assert.fail("Test Case fail as all the feilds of NRI is not displayed");
		}

	}

	@Step("Select the VISA")
	public static void isAllTheTypeOfVisaListIsPresent() throws Exception {
		typeOfVisa();
		String xtypeOfVisa = ".//*[@id='menu-passportVisaType']/div[2]/ul/li";
		String sheetPath = AppConstant.TEST_DATA_EXCELL;
		comparingExcelDataWithUIBySheetPath(xtypeOfVisa, 1, 2, sheetPath);

		dependentTypeOfVisa();

	}

	@Step("Getting possport Number")
	public static void setPassportNumber(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		passportTextfld.clear();
		type(passportTextfld, readingdata(x, y, z));
		String passportNumberPassedFromExcel = passportTextfld.getAttribute("value");
		int size = passportNumberPassedFromExcel.length();
		if (size == 9) {
			logger.info("Test case pass:- As Passport number feild length is 9");
		} else {
			Assert.fail("Test case fail:-Test case pass:- As Passport number feild length is not of 9");
		}

	}

	@Step("Getting possport issuing country Name")
	public static void passportIssuingCountry(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		System.out.println("smart search");
		Thread.sleep(400);
		passportIssuingCountry.clear();
		type(passportIssuingCountry, readingdata(x, y, z));
		passportIssuingCountryOptionSelection();
		String passportIssuingCountryFromUI = passportIssuingCountry.getAttribute("value");
		if (passportIssuingCountryFromUI.contains("India")) {
			logger.info("Test case pass:- As Smart search is working");
		} else {
			Assert.fail("Test case fail:-As Smart search is not working");
		}

	}

	public static void nriDependentOptionSElection() throws Exception {
		dependentOptionButton.click();

	}

	public static void isdCode(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		Thread.sleep(200);
		isdCode.clear();
		type(isdCode, readingdata(x, y, z));
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@id='react-autowhatever-1--item-0']/div[1]")).click();
		Thread.sleep(200);
		String isdCodeFromUI = isdCode.getAttribute("value");
		if (isdCodeFromUI.equals("+91")) {
			logger.info("Test case pass:-As ISD code feild carry +91 when select India");
		} else {
			Assert.fail("Test Case fail:-As ISD code feild dont have +91 when India is selected");
		}

	}

}
