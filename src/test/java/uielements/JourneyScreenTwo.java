package uielements;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import util.AppConstant;

public class JourneyScreenTwo extends ReusableActions {

	// private static final String Webelement = null;

	public static int i = 1;
	public static int k;
	static String xpathForErrorMsg = "html/body/div[2]/div[2]/div/div/div/div/ol/li";
	// Locating Indian Nationality radio Button

	@FindBy(xpath = "//input[@name='income']")
	public static WebElement annualIncomePersonalDetailsDependent;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[4]/div[1]/div/div/div/div/div[@role='button']")
	public static WebElement occupationCancerProductSelected;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[4]/div[4]/div/div/div/div/div[@role='button']")
	public static WebElement preferedLanguageOfCommunication;

	@FindBy(xpath = ".//*[@id='menu-preferredLanguageOfCommunication']/div[2]/ul/li[1]")
	public static WebElement preferredLanguageOfCommunicationOptionSelection;

	@FindBy(xpath = ".//*[@id='menu-occupation']/div[2]/ul/li[2]")
	public static WebElement occupation2ndOption;

	@FindBy(xpath = "//input[@value='indian']")
	static WebElement Indianbtn;

	@FindBy(xpath = "//label[@for='premiumCommitment']")
	static WebElement premiumCommitmentMIAPYesOptionSelection;

	@FindBy(xpath = "//input[@name='bankAccountIFSC']")
	public static WebElement IFSC;

	@FindBy(xpath = "//input[@name='bankAccountMICR']")
	public static WebElement MICR;

	@FindBy(xpath = "//input[@name='bankBranch']")
	public static WebElement BankBranch;

	@FindBy(xpath = "//input[@name='bankAccountNo']")
	public static WebElement bankAccountNo;

	@FindBy(xpath = "//input[@name='bankAccountHolderName']")
	public static WebElement AccHolderName;

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
	@FindBy(xpath = "//input[@name='Aadhaar']")
	static WebElement AadharTxtfld;

	// Locating Don't have Aadhar number link
	@FindBy(xpath = "//a[contains(text(),'t Have Aadhaar Number?')]")
	static WebElement DonthaveAadharLink;

	// Locating Get OTP button
	@FindBy(xpath = "//a[text()='Get OTP']")
	static WebElement GetOTPbtn;

	// Locating Pan Number text field
	@FindBy(xpath = "//input[@name='PanNumber']")
	static WebElement PanNumbertxtfld;

	// Locating Don't Have PAN? link
	@FindBy(xpath = "//a[contains(text(),'t Have PAN?')]")
	static WebElement DontHavePanlink;

	// Locating Mobile Number text field
	@FindBy(xpath = "//input[@name='MobileNumber']")
	static WebElement MobNumtxtfld;

	// Locating Email Address text field
	@FindBy(xpath = "//input[@name='email']")
	static WebElement Emailtxtfld;

	// Locating PreIssuanceVerificationNumber text field
	@FindBy(xpath = "//input[@name='PreIssuanceVerificationNumber']")
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
	@FindBy(xpath = "//button[@type='submit']")
	static WebElement Proceedbtn;

	// Locating header of Don't have Aadhaar Number? Popup
	@FindBy(xpath = "//h2[contains(text(),'t have Aadhaar Number?')]")
	static WebElement DonthaveAadhaarlbl;

	// Locating Forgot my aadhaar number radio button on Don't have Aadhaar Number?
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

	// Locating Please enter the OTP sent to your registered mobile number text on
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

	@FindBy(xpath = "//input[@name='bankName']")
	public static WebElement BankName;

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

	@FindBy(xpath = "//label[(@for='chooseFundYes')]")
	static WebElement chooseYourFundYes;

	@FindBy(xpath = "//label[(@for='chooseFundNo')]")
	static WebElement chooseYourFundNo;

	@FindBy(xpath = "//label[(@for='dynamicFundNo')]")
	static WebElement dynamicFundNo;

	@FindBy(xpath = "//label[(@for='dynamicFundYes')]")
	static WebElement dynamicFundYes;

	@FindBy(xpath = "//label[(@for='systematicNo')]")
	static WebElement systematicNo;

	@FindBy(xpath = "//label[(@for='systematicYes')]")
	static WebElement systematicYes;

	// Locating OK button on Invalid OTP Popup
	@FindBy(xpath = "//span[text()='OK']")
	static WebElement InvalidOKbtn;

	// Locating Proceed button on Invalid OTP Popup
	@FindBy(xpath = "//span[text()='Proceed']")
	static WebElement InvalidProceedbtn;

	// Initializing the Objects
	public JourneyScreenTwo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@name='firstName']")
	static WebElement firtsName;

	@FindBy(xpath = "//*[@name='lastName']")
	static WebElement lastName;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirth;

	@FindBy(xpath = "//*[@name='permanentHouseNo']")
	static WebElement houseNo;

	@FindBy(xpath = "//*[@name='permanentRoadNo']")
	static WebElement roadNo;

	@FindBy(xpath = "//*[@name='permanentVillageTown']")
	static WebElement villageTown;

	@FindBy(xpath = "//input[@placeholder='Search a country']")
	static WebElement country;

	@FindBy(xpath = "//input[@placeholder='Search a state']")
	static WebElement searchState;

	@FindBy(xpath = "//input[@placeholder='Search a city']")
	static WebElement searchCity;

	@FindBy(xpath = "//input[@name=\"permanentPinCode\"]")
	static WebElement pinCode;

	@FindBy(xpath = "//input[@name=\"alternateMobileNo\"]")
	static WebElement alternateMobileNo;

	@FindBy(xpath = "//*[@id='permanent_address']/div[1]/div/div/div/div/div/div[@role='button']")
	static WebElement proofTypeDropDown;

	@FindBy(xpath = "//*[@id='menu-permanentProofType']/div[2]/ul/li[6]")
	static WebElement proofTypeDropDownValue;

	@FindBy(xpath = "//label[contains(text(),\"Traditional\")]")
	static WebElement traditional;

	@FindBy(xpath = "//label[contains(text(),\"ULIP\")]")
	static WebElement ulipProductType;

	@FindBy(xpath = "//p[(text()=\"Total Percentage Should Be 100\")]")
	static WebElement totalPercentage;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[@role='button']")
	static WebElement productName;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[@role='button']")
	static WebElement productNm;

	@FindBy(xpath = ".//*[@id='menu-productName']/div[2]/ul/li[text()='Max Life Super Term Plan']")
	static WebElement maxLifeSuperTermPlan;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()='Max Life Monthly Income Advantage Plan']")
	static WebElement maxLifeMonthlyIncomeAdvantagePlan;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()= 'Max Life Whole Life Super']")
	static WebElement maxLifeWholeLifeSuper;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()= 'Max Life Savings Advantage Plan']")
	static WebElement maxLifeSavingsAdvantagePlan;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()='Max Life Fast Track Super Plan']")
	static WebElement maxLifeFastTrackSuperPlan;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()= 'Max Life Cancer Insurance Plan']")
	static WebElement maxLifeCancerInsurancePlan;

	@FindBy(xpath = "//label/img[@alt='Non smoker']")
	static WebElement nonSmoker;

	@FindBy(xpath = "//input[@name=\"sumAssured\"]")
	static WebElement sumAssured;

	@FindBy(xpath = "//*[contains(text(),\"Smoking Habit\")]")
	static WebElement smokingHabit;

	@FindBy(xpath = "//label[text()='Policy Term']")
	static WebElement policyTerm;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[@role='button']")
	static WebElement premiumPayementTermSTP;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[@role='button']")
	static WebElement premiumTypeSAP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[7]/div/div/div/div/div[@role='button']")
	static WebElement dividentOptionMIAP;

	@FindBy(xpath = "//label[text()='Premium Payment Term']")
	static WebElement premiumPaymentTerm;

	@FindBy(xpath = "//span[text()='Choose Your Fund']")
	static WebElement chooseYourFund;

	@FindBy(xpath = "//span[text()='Dynamic Fund Allocation']")
	static WebElement dynamicFundAllocation;

	@FindBy(xpath = "//span[text()='Systematic Transfer Plan']")
	static WebElement systematicTransferPlan;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div[@role='button']")
	static WebElement premiumPaymentTermSAP;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[@role='button']")
	static WebElement premiumPaymentTermFTSP;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[7]/div/div/div/div/div[@role='button']")
	static WebElement dividentOption;

	@FindBy(xpath = "//label[text()='Dividend Adjustment']")
	static WebElement dividendAdjustment;

	@FindBy(xpath = "//*[contains(text(),\"Mode of Payment\")]")
	static WebElement modeOfPayment;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	static WebElement effectiveDateOfCoverage;

	@FindBy(xpath = "//label[text()='Effective Date Of Coverage']")
	static WebElement effectiveDateOfCoverageSTP;

	@FindBy(xpath = "//span[contains(text(), 'WOP Plus Rider')]")
	static WebElement WOPPlusRider;

	@FindBy(xpath = "//span[contains(text(), 'Term Plus Rider')]")
	static WebElement termPlusRider;

	@FindBy(xpath = "//span[contains(text(), 'Accidental Death And Dismemberment Rider')]")
	static WebElement accidentalDeathAndDismembermentRider;

	@FindBy(xpath = "//label[text()='Maturity Age']")
	static WebElement maturityAge;

	@FindBy(xpath = "//label[text()='Sum Assured Available']")
	static WebElement sumAssuredAvailable;

	@FindBy(xpath = "//input[@name='annualIncome']")
	static WebElement annualIncome;

	@FindBy(xpath = "//input[@name='income']")
	static WebElement proposerPersonalDetailsAnnualIncome;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[1]/div[1]/div/div/div/div/div[@role='button']")
	static WebElement needOfInsurance;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div/div/div/div/div[@role='button']")
	static WebElement needOfInsur;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[1]/div[1]/div/div/div/div/div[@role='button']")
	static WebElement needOfInsurInsurersDetails;

	@FindBy(xpath = "//*[@id='menu-needOfInsurance']/div[2]/ul/li[1]")
	static WebElement needOfInsurance1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[@role='button']")
	static WebElement lifeStage;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[@role='button']")
	static WebElement lifeStge;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[@role='button']")
	static WebElement lifeStgeInsuresrDetails;

	@FindBy(xpath = ".//*[@id='menu-lifeStage']/div[2]/ul/li[1]")
	static WebElement lifeStage1stOption;

	@FindBy(xpath = "//*[@id='menu-dividendAdjustment']/div[2]/ul/li[1]")
	static WebElement dividentAdjustment1stOption;

	@FindBy(xpath = ".//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[1]")
	static WebElement PremiumPaymentTermOption;

	@FindBy(xpath = "//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[(text()=25)]")
	static WebElement PremiumPaymentTermOptionSAP;

	@FindBy(xpath = ".//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[1]")
	static WebElement PremiumPaymentTermFTSP;

	@FindBy(xpath = ".//*[@id='menu-premiumType']/div[2]/ul/li[3]")
	static WebElement premiumType3rdOptionSAP;

	@FindBy(xpath = "//*[@id='menu-policyTerm']/div[2]/ul/li[(text()=25)]")
	static WebElement policyTermSTPOption;

	@FindBy(xpath = "//*[@id='menu-policyTerm']/div[2]/ul/li[1]")
	static WebElement policyTermFTSPOption;

	@FindBy(xpath = ".//*[@id='menu-policyTerm']/div[2]/ul/li[1]")
	static WebElement policyTerm1stOptionSAP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[@role='button']")
	static WebElement dropDownModeOfPayment;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[@role='button']")
	static WebElement dropDwnModeOfPayment;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[@role='button']")
	static WebElement dropDwnModeOfPaymentInsurersDetail;

	@FindBy(xpath = "//*[@id='menu-modeOfPayment']/div[2]/ul/li[1]")
	static WebElement modeOfPayment1stOption;

	@FindBy(xpath = ".//*[@id='menu-dividendAdjustment']/div[2]/ul/li[1]")
	static WebElement dividentOption1stOption;

	@FindBy(xpath = ".//*[@id='menu-dividendOption']/div[2]/ul/li[1]")
	static WebElement divident1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[7]/div/div/div/div/div[@role='button']")
	static WebElement modeOfPaymentSTP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement modeOfPaymentMIAP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[4]/div/div/div/div/div[@role='button']")
	static WebElement modeOfPaymentSAP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement modeOfPaymentFTSP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[4]/div/div/div/div/div[@role='button']")
	static WebElement modeOfPaymentWLS;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[6]/div/div/div/div/div[@role='button']")
	static WebElement dividentAdjustment;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement dividentAdjustmentWLS;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div[@role='button']")
	static WebElement policyTermSTP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement policyTermDropDownSAP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div[@role='button']")
	static WebElement policyTermDropDownFTSP;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement sumAssuredOptionSTP;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div[@role='button']")
	static WebElement dropDownMaturityAge;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div[@role='button']")
	static WebElement dropDwnMaturityAge;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div[@role='button']")
	static WebElement dropDwnMaturityAgeIsurersDetails;

	@FindBy(xpath = "//*[@id='menu-maturityAge']/div[2]/ul/li[(text()=65)]")
	static WebElement maturityAgeOption;

	@FindBy(xpath = "//*[@id='menu-sumAssuredOption']/div[2]/ul/li[1]")
	static WebElement sumAssuredOption1stSTP;

	@FindBy(xpath = "//input[@name='premiumCommitment']")
	static WebElement premiumCommitment;

	@FindBy(xpath = "//input[@name='growthSuperFund']")
	static WebElement GrowthSuperFund;

	@FindBy(xpath = "//input[@name='secureFund']")
	static WebElement secureFund;

	@FindBy(xpath = ".//*[@id='react-autowhatever-1--item-0']/div/div/span[1]")
	static WebElement countryIstOption;

	@FindBy(xpath = "//input[@name='conservativeFund']")
	static WebElement conservativeFund;

	@FindBy(xpath = "//input[@name='highGrowthFund']")
	static WebElement HighGrowthFund;

	@FindBy(xpath = "//input[@name='balancedFund']")
	static WebElement BalancedFund;

	@FindBy(xpath = "//input[@name='growthFund']")
	static WebElement growthFund;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement dropDownSumAssuredAvailable;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement drpDownSumAssuredAvailable;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement drpDownSumAssuredAvailableInsurersDetails;

	@FindBy(xpath = ".//*[@id='menu-sumAssuredAvailable']/div[2]/ul/li[(text()=2500000)]")
	static WebElement sumAssuredAvailableOption;

	@FindBy(xpath = ".//*[@id='menu-sumAssuredAvailable']/div[2]/ul/li[(text()=2500000)]")
	static WebElement sumAssuredAvailableOptionInsureresDetails;

	@FindBy(xpath = "//input[@name='desiredAnnualIncome']")
	static WebElement desiredAnnualIncome;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[7]/div/div/div/div/div[@role='button']")
	static WebElement dividendOptionWLS;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
	static WebElement sumAssuredOption;

	@FindBy(xpath = "//*[@id='react-autowhatever-1--item-0']/div/div/span[contains(@style,'font-weight: 500;')]")
	static WebElement countryDropDown;

	@FindBy(xpath = "//*[@id='react-autowhatever-1']/ul/li[1]")
	static WebElement state1stOption;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirthPersonalDetails;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirthNomineeDetails;

	@FindBy(xpath = "//*[@id='react-autowhatever-1--item-0']/div/div/span[1]")
	static WebElement city1stOption;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirthIssurer;

	public static void selectByDropdown() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(proofTypeDropDown);
		proofTypeDropDown.click();
		WebElement element = driver.findElement(By.xpath("//*[@id='menu-permanentProofType']/div[2]/ul/li[6]"));
		new Actions(driver).moveToElement(element).click().perform();
		proofTypeDropDownValue.click();
		Thread.sleep(3000);
	}

	public static void traditional() throws Exception {

		click(traditional);
	}

	public static void city1stOption() throws Exception {

		click(city1stOption);
	}

	public static void ulip() throws Exception {

		click(ulipProductType);
	}

	public static void countryIstOption() throws Exception {

		click(countryIstOption);

	}

	public static void chooseYourFundYes() throws Exception {

		click(chooseYourFundYes);
	}

	public static void dynamicFundAllocationNo() throws Exception {

		click(dynamicFundNo);
	}

	public static void systematicTransferPlanNo() throws Exception {

		click(systematicNo);
	}

	public static void WOPPlusRider() throws Exception {

		click(WOPPlusRider);
	}

	public static void nonSmoker() throws Exception {
		click(nonSmoker);
		Thread.sleep(500);
	}

	public static void premiumPayementTermSTP() throws Exception {
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		waitTillElementToBeClickable(PremiumPaymentTermOption);
		PremiumPaymentTermOption.click();
		Thread.sleep(2000);

	}

	public static void premiumPayementTermSAP() throws Exception {
		waitTillElementToBeClickable(premiumPaymentTermSAP);
		premiumPaymentTermSAP.click();
		waitTillElementToBeClickable(PremiumPaymentTermOptionSAP);
		PremiumPaymentTermOptionSAP.click();
		Thread.sleep(2000);

	}

	public static void premiumPayementTermFTSP() throws Exception {
		waitTillElementToBeClickable(premiumPaymentTermFTSP);
		premiumPaymentTermFTSP.click();
		waitTillElementToBeClickable(PremiumPaymentTermFTSP);
		PremiumPaymentTermFTSP.click();
		Thread.sleep(2000);

	}

	public static void premiumTypeSAP() throws Exception {
		waitTillElementToBeClickable(premiumTypeSAP);
		premiumTypeSAP.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		premiumType3rdOptionSAP.click();
		Thread.sleep(2000);
	}

	public static void policyTermSTP() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTermSTPOption);
		policyTermSTPOption.click();
		Thread.sleep(2000);
	}

	public static void policyTermWLS() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		policyTerm1stOptionSAP.click();
		Thread.sleep(2000);
	}

	public static void policyTermMIAP() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		policyTerm1stOptionSAP.click();
		Thread.sleep(2000);
	}

	public static void policyTermSTPDropDown() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		policyTerm1stOptionSAP.click();
		Thread.sleep(2000);
	}

	public static void policyTermSAP() throws Exception {
		waitTillElementToBeClickable(policyTermDropDownSAP);
		policyTermDropDownSAP.click();
		waitTillElementToBeClickable(policyTermSTPOption);
		policyTermSTPOption.click();
		Thread.sleep(2000);
	}

	public static void policyTermFTSP() throws Exception {
		waitTillElementToBeClickable(policyTermDropDownFTSP);
		policyTermDropDownFTSP.click();
		waitTillElementToBeClickable(policyTermFTSPOption);
		policyTermFTSPOption.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
		Thread.sleep(300);
	}

	public static void sumAssuredOptionSTP() throws Exception {
		waitTillElementToBeClickable(sumAssuredOptionSTP);
		sumAssuredOptionSTP.click();
		waitTillElementToBeClickable(sumAssuredOption1stSTP);
		sumAssuredOption1stSTP.click();
		Thread.sleep(2000);
	}

	public static void state1stOption() throws Exception {

		click(state1stOption);
	}

	public static void selectByDropdownProductName() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productName);
		productName.click();
		waitTillElementToBeClickable(maxLifeSuperTermPlan);
		maxLifeSuperTermPlan.click();

	}

	public static void selectByDropdownCancerInsurancePlan() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productName);
		productName.click();
		waitTillElementToBeClickable(maxLifeCancerInsurancePlan);
		maxLifeCancerInsurancePlan.click();

	}

	public static void selectByDropdownCIP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeCancerInsurancePlan);
		Thread.sleep(1000);
		maxLifeCancerInsurancePlan.click();

	}

	public static void selectByDropdownSTP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeSuperTermPlan);
		Thread.sleep(1000);
		maxLifeSuperTermPlan.click();
		Thread.sleep(1000);
	}

	public static void selectByDropdownMIAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeMonthlyIncomeAdvantagePlan);
		Thread.sleep(1000);
		maxLifeMonthlyIncomeAdvantagePlan.click();
		Thread.sleep(1000);

	}

	public static void selectByDropdownWLS() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeWholeLifeSuper);
		Thread.sleep(1000);
		maxLifeWholeLifeSuper.click();
		Thread.sleep(1000);

	}

	public static void selectByDropdownSAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeSavingsAdvantagePlan);
		Thread.sleep(1000);
		maxLifeSavingsAdvantagePlan.click();
		Thread.sleep(1000);

	}

	public static void selectByDropdownFTSP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeFastTrackSuperPlan);
		Thread.sleep(1000);
		maxLifeFastTrackSuperPlan.click();
		Thread.sleep(1000);

	}

	public static void selectByDropdownTradAllProduct() throws Exception {
		for (int i = 1; i <= 5; i++) {
			waitTillElementToBeClickable(productNm);
			productNm.click();
			waitTillElementToBeClickable(
					driver.findElement(By.xpath("//*[@id='menu-productName']/div[2]/ul/li[" + i + "]")));
			driver.findElement(By.xpath("//*[@id='menu-productName']/div[2]/ul/li[" + i + "]")).click();
			Thread.sleep(1000);
			switch (i) {
			case 1:
				if (sumAssured.isDisplayed() && sumAssuredOption.isDisplayed() && smokingHabit.isDisplayed()
						&& policyTerm.isDisplayed() && premiumPaymentTerm.isDisplayed()
						&& dividendAdjustment.isDisplayed() && modeOfPayment.isDisplayed()
						&& effectiveDateOfCoverageSTP.isDisplayed() && WOPPlusRider.isDisplayed()
						&& accidentalDeathAndDismembermentRider.isDisplayed()) {

					System.out.println("All the feilds are present as per the product MAX LIFE SUPER TERM PLAN");
				} else {
					Assert.fail("All the feilds are not present as per the product MAX LIFE SUPER TERM PLAN");
				}
				break;
			case 2:
				if (policyTerm.isDisplayed() && dividentOptionMIAP.isDisplayed() && desiredAnnualIncome.isDisplayed()
						&& premiumCommitment.isDisplayed() && premiumPaymentTerm.isDisplayed()
						&& annualIncome.isDisplayed() && termPlusRider.isDisplayed() && modeOfPayment.isDisplayed()
						&& effectiveDateOfCoverage.isDisplayed()
						&& accidentalDeathAndDismembermentRider.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per the product MAX LIFE MONTHLY INCOME ADVANTAGE PLAN");
				} else {
					Assert.fail("All the feilds are not present as per the product MONTHLY INCOME ADVANTAGE PLAN");
				}

				break;
			case 3:
				if (modeOfPayment.isDisplayed() && maturityAge.isDisplayed()
						&& dropDownSumAssuredAvailable.isDisplayed()) {

					System.out.println("All the feilds are present as per the product MAX LIFE CANCER INSURANCE PLAN");
				} else {
					Assert.fail("All the feilds are not present as per the product MAX LIFE CANCER INSURANCE PLAN");
				}
				break;
			case 4:
				if (policyTerm.isDisplayed() && premiumCommitment.isDisplayed() && termPlusRider.isDisplayed()
						&& premiumPaymentTerm.isDisplayed() && dividendAdjustment.isDisplayed()
						&& dividendOptionWLS.isDisplayed() && modeOfPayment.isDisplayed()
						&& effectiveDateOfCoverage.isDisplayed()
						&& accidentalDeathAndDismembermentRider.isDisplayed()) {

					System.out.println("All the feilds are present as per the product MAX LIFE WHOLE LIFE SUPER");
				} else {
					Assert.fail("All the feilds are not present as per the product MAX LIFE WHOLE LIFE SUPER");
				}
				break;
			case 5:
				if (policyTerm.isDisplayed() && premiumPaymentTerm.isDisplayed() && termPlusRider.isDisplayed()
						&& premiumCommitment.isDisplayed() && modeOfPayment.isDisplayed()
						&& premiumTypeSAP.isDisplayed() && effectiveDateOfCoverage.isDisplayed()
						&& WOPPlusRider.isDisplayed() && dividentOption.isDisplayed()
						&& accidentalDeathAndDismembermentRider.isDisplayed()) {

					System.out.println("All the feilds are present as per the product MAX LIFE SAVING ADVANTAGE PLAN");
				} else {
					Assert.fail("All the feilds are not present as per the product MAX LIFE SAVING ADVANTAGE PLAN");
				}
			}
		}
	}

	public static void selectByDropdownULIPAllProduct() throws Exception {
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(driver.findElement(By.xpath("//*[@id='menu-productName']/div[2]/ul/li[1]")));
		driver.findElement(By.xpath("//*[@id='menu-productName']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);
		chooseYourFundYes();
		if (premiumPaymentTerm.isDisplayed() && policyTerm.isDisplayed() && premiumCommitment.isDisplayed()
				&& modeOfPayment.isDisplayed() && chooseYourFund.isDisplayed() && dynamicFundAllocation.isDisplayed()
				&& systematicTransferPlan.isDisplayed() && chooseYourFundYes.isDisplayed()
				&& chooseYourFundNo.isDisplayed() && dynamicFundNo.isDisplayed() && dynamicFundYes.isDisplayed()
				&& systematicNo.isDisplayed() && systematicYes.isDisplayed() && GrowthSuperFund.isDisplayed()
				&& secureFund.isDisplayed() && conservativeFund.isDisplayed() && HighGrowthFund.isDisplayed()
				&& BalancedFund.isDisplayed() && growthFund.isDisplayed()) {
			System.out.println(
					"Test Case pass:As all the required feilds are present for MAX LIFE FAST TRACK SUPER PLAN(ULIP)");
		} else {
			Assert.fail(
					"Test Case fail:As all the required feilds are not present for MAX LIFE FAST TRACK SUPER PLAN(ULIP)");
		}

	}

	public static void selectByDropdownNeedOfInsurance() throws Exception {
		waitTillElementToBeClickable(needOfInsurance);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		needOfInsurance.click();
		waitTillElementToBeClickable(needOfInsurance1stOption);
		needOfInsurance1stOption.click();

	}

	public static void selectByDropdownNeedOfInsur() throws Exception {
		waitTillElementToBeClickable(needOfInsur);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		needOfInsur.click();
		waitTillElementToBeClickable(needOfInsurance1stOption);
		needOfInsurance1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownNeedOfInsurInsurersDetails() throws Exception {
		waitTillElementToBeClickable(needOfInsurInsurersDetails);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		needOfInsurInsurersDetails.click();
		waitTillElementToBeClickable(needOfInsurance1stOption);
		needOfInsurance1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownLifeStage() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(lifeStage);

		lifeStage.click();
		waitTillElementToBeClickable(lifeStage1stOption);
		lifeStage1stOption.click();

	}

	public static void selectByDropdownLifeStge() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(lifeStge);
		lifeStge.click();
		waitTillElementToBeClickable(lifeStage1stOption);
		lifeStage1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownLifeStgeInsurersDetails() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(lifeStgeInsuresrDetails);
		lifeStgeInsuresrDetails.click();
		waitTillElementToBeClickable(lifeStage1stOption);
		lifeStage1stOption.click();
		Thread.sleep(2000);

	}

	public static void dividentAdjustmentSTP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dividentAdjustment);
		dividentAdjustment.click();
		waitTillElementToBeClickable(dividentAdjustment1stOption);
		dividentAdjustment1stOption.click();
		Thread.sleep(2000);

	}

	public static void modeOfPaymentSTP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentSTP);
		modeOfPaymentSTP.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);

	}

	public static void modeOfPaymentMIAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentMIAP);
		modeOfPaymentMIAP.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentWLS() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentWLS);
		modeOfPaymentWLS.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentSAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentSAP);
		modeOfPaymentSAP.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentFTSP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(400);
		waitTillElementToBeClickable(modeOfPaymentFTSP);
		modeOfPaymentFTSP.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void dividendAdjustmentWLS() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dividentAdjustmentWLS);
		dividentAdjustmentWLS.click();
		waitTillElementToBeClickable(dividentOption1stOption);
		dividentOption1stOption.click();
		Thread.sleep(2000);
	}

	public static void dividentOptionMIAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dividentOptionMIAP);
		dividentOptionMIAP.click();
		waitTillElementToBeClickable(divident1stOption);
		divident1stOption.click();
		Thread.sleep(2000);

	}

	public static void dividentOptionWLS() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dividendOptionWLS);
		dividendOptionWLS.click();
		waitTillElementToBeClickable(divident1stOption);
		divident1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownModeOfPayment() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dropDownModeOfPayment);
		dropDownModeOfPayment.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();

	}

	public static void selectByDropdwnModeOfPayment() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dropDwnModeOfPayment);
		dropDwnModeOfPayment.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdwnModeOfPaymentInsurersDetails() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dropDwnModeOfPaymentInsurersDetail);
		dropDwnModeOfPaymentInsurersDetail.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownMaturityAge() throws Exception {

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dropDownMaturityAge);
		dropDownMaturityAge.click();
		waitTillElementToBeClickable(maturityAgeOption);
		maturityAgeOption.click();

	}

	public static void selectByDrpdownMaturityAge() throws Exception {

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dropDwnMaturityAge);
		dropDwnMaturityAge.click();
		waitTillElementToBeClickable(maturityAgeOption);
		maturityAgeOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDrpdownMaturityAgeInsurersDetails() throws Exception {

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dropDwnMaturityAgeIsurersDetails);
		dropDwnMaturityAgeIsurersDetails.click();
		waitTillElementToBeClickable(maturityAgeOption);
		maturityAgeOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownSumAssuredAvailable() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dropDownSumAssuredAvailable);
		dropDownSumAssuredAvailable.click();
		waitTillElementToBeClickable(sumAssuredAvailableOption);
		sumAssuredAvailableOption.click();

	}

	public static void selectByDrpdownSumAssuredAvailable() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(drpDownSumAssuredAvailable);
		drpDownSumAssuredAvailable.click();
		waitTillElementToBeClickable(sumAssuredAvailableOption);
		sumAssuredAvailableOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDrpdownSumAssuredAvailableInsurersDetails() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(drpDownSumAssuredAvailableInsurersDetails);
		drpDownSumAssuredAvailableInsurersDetails.click();
		waitTillElementToBeClickable(sumAssuredAvailableOptionInsureresDetails);
		sumAssuredAvailableOptionInsureresDetails.click();
		Thread.sleep(2000);

	}

	// Locating Proceed button
	@FindBy(xpath = "//span[contains(text(), 'Proceed')]")
	static WebElement proceedBtn;

	// Enter First Name
	public static void setFirstName(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		firtsName.clear();
		type(firtsName, readingdata(x, y, z));
		String firstNamePassedFromExcel = firtsName.getAttribute("value");
		int size = firstNamePassedFromExcel.length();
		if ((size == 50 && !firstNamePassedFromExcel.contains("@") && !firstNamePassedFromExcel.contains("1"))) {
			logger.info("Test case pass:- As first name feild length is 50 and accepting only alphabets");
		} else {
			Assert.fail(
					"Test case fail:- As either first name feild length is not of 50 or not accepting only alphabets");
		}

	}

	// -------------------------------------------------------------------------------------------------------
	public static void setDateBirthPersonalDetails() throws Exception {
		/*
		 * PageFactory.initElements(driver, JourneyScreenTwo.class);
		 * dateOfBirthPersonalDetails.clear(); type(dateOfBirthPersonalDetails,
		 * readingdata(x, y, z));
		 */
		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		JourneyScreenThree.dateOfBirthSelctionFunction();

	}

	public static void setDateBirthNomineeDetails() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
		Thread.sleep(200);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println("I am down");
		waitTillElementToBeClickable(dateOfBirthNomineeDetails);
		dateOfBirthNomineeDetails.click();
		JourneyScreenThree.dateOfBirthSelctionFunction();

	}

	// Enter Last Name
	public static void setLastName(int x, int y, int z) throws Exception {
		lastName.clear();
		type(lastName, readingdata(x, y, z));
		String lastNamePassedFromExcel = lastName.getAttribute("value");
		int size = lastNamePassedFromExcel.length();
		if ((size == 25 && !lastNamePassedFromExcel.contains("@") && !lastNamePassedFromExcel.contains("1"))) {
			logger.info("Test case pass:- As last name feild length is 25 and accepting only alphabets");
		} else {
			Assert.fail(
					"Test case fail:- As either last name feild length is not of 25 or not accepting only alphabets");
		}

	}

	// Enter Date of birth
	public static void setDateOfBirth(int x, int y, int z) throws Exception {
		dateOfBirth.clear();
		dateOfBirth.click();
		if (dateOfBirth.isSelected()) {
			type(dateOfBirth, readingdata(x, y, z));
		} else {
			Assert.fail("Test case fail: Date of birth feild not allowing user to enter the date manually");
		}
	}

	// Enter Date of birth
	public static void selectByValue(int x, int y, int z) throws Exception {
		dateOfBirth.clear();
		if (dateOfBirth.isSelected()) {
			type(dateOfBirth, readingdata(x, y, z));

		} else {
			Assert.fail("Test case fail: Date of birth feild not allowing user to enter the date manually");
		}
	}

	// Enter House number
	public static void setHouseNo(int x, int y, int z) throws Exception {
		houseNo.clear();
		type(houseNo, readingdata(x, y, z));
		String houseNoDataFromExcel = houseNo.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		if ((size == 60 && houseNoDataFromExcel.contains("1") && !houseNoDataFromExcel.contains("!"))) {
			logger.info(
					"Test case pass:- As house number feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either house number feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	// Enter Road number
	public static void setRoadNo(int x, int y, int z) throws Exception {
		roadNo.clear();
		type(roadNo, readingdata(x, y, z));
		String houseNoDataFromExcel = roadNo.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		if ((size == 60 && houseNoDataFromExcel.contains("1") && !houseNoDataFromExcel.contains("!"))) {
			logger.info(
					"Test case pass:- As Road number feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either Road number feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	// Enter Village Town
	public static void setVillageTown(int x, int y, int z) throws Exception {

		villageTown.clear();
		type(villageTown, readingdata(x, y, z));
		String houseNoDataFromExcel = villageTown.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		if ((size == 60 && houseNoDataFromExcel.contains("1") && !houseNoDataFromExcel.contains("!"))) {
			logger.info(
					"Test case pass:- As village town feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either village town feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	// Enter Country
	public static void setCountry(int x, int y, int z) throws Exception {
		country.clear();
		type(country, readingdata(x, y, z));
		String countryDataFromExcel = country.getAttribute("value");// I
		String dropDownValue = countryDropDown.getText();
		System.out.println(dropDownValue);
		if (dropDownValue.startsWith(countryDataFromExcel)) {
			System.out.println("Test Case pass:-As smart search for country is working properly");
		} else {
			Assert.fail("Test case fail:-As smart search for country is not woring properly");
		}
		countryIstOption();
	}

	// Enter State
	public static void setState(int x, int y, int z) throws Exception {
		searchState.click();
		searchState.clear();
		searchState.sendKeys(readingdata(x, y, z));
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		// searchState.sendKeys(readingdata(x, y, z));
		// type(searchState, readingdata(x, y, z));
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		// searchState.click();
		searchState.sendKeys(Keys.BACK_SPACE);

		String countryDataFromExcel = searchState.getAttribute("value");// A
		String dropDownValue = countryDropDown.getText();
		System.out.println(dropDownValue);
		if (dropDownValue.startsWith(countryDataFromExcel)) {
			System.out.println("Test Case pass:-As smart search for state is working properly");
		} else {
			Assert.fail("Test case fail:-As smart search for state is not woring properly");
		}
		Thread.sleep(600);
		state1stOption();
	}

	// Enter City
	public static void setCity(int x, int y, int z) throws Exception {
		searchCity.clear();
		type(searchCity, readingdata(x, y, z));
		String countryDataFromExcel = searchCity.getAttribute("value");// A
		String dropDownValue = countryDropDown.getText();
		if (dropDownValue.startsWith(countryDataFromExcel)) {
			System.out.println("Test Case pass:-As smart search for city is working properly");
		} else {
			Assert.fail("Test case fail:-As smart search for city is not woring properly");
		}
		city1stOption();
	}

	// Enter PinCode
	public static void setPinCode(int x, int y, int z) throws Exception {
		pinCode.clear();
		type(pinCode, readingdata(x, y, z));
		String pinCodeDataFromExcel = pinCode.getAttribute("value");
		int size = pinCodeDataFromExcel.length();
		if ((size == 6 && !pinCodeDataFromExcel.contains("@") && !pinCodeDataFromExcel.contains("A"))) {
			logger.info("Test case pass:- As Pin code feild length is 6 and accepting numeric only");
		} else {
			Assert.fail("Test case fail:- As either Pin code feild length is not of 6 or not accepting numeric only");
		}

	}

	// Enter PinCode
	public static void setAlternateMobileNo(int x, int y, int z) throws Exception {
		alternateMobileNo.clear();
		type(alternateMobileNo, readingdata(x, y, z));
		String alternateMobileDataFromExcel = alternateMobileNo.getAttribute("value");
		int size = alternateMobileDataFromExcel.length();
		if ((size == 10 && !alternateMobileDataFromExcel.contains("@")
				&& !alternateMobileDataFromExcel.contains("A"))) {
			logger.info("Test case pass:- As alternate mobile number feild length is 10 and accepting numeric only");
		} else {
			Assert.fail(
					"Test case fail:- As alternate mobile number feild length either is not of 10 or not accepting numeric only");
		}

	}

	public static void waitForNumberOfWindowsToEqual(final int numberOfWindows) {
		new WebDriverWait(driver, 20) {
		}.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return (driver.getWindowHandles().size() == numberOfWindows);
			}
		});
	}

	// Select PIO as an nationality
	public static void clickSubmitButton() throws Exception {
		click(proceedBtn);
		Thread.sleep(14000);
	}

	// Select Indian as an nationality
	public static void selectIndian() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		waitTillElementLocated(Indianbtn);

		click(Indianbtn);

	}

	// Select NRI as an nationality
	public static void selectNRI() throws Exception {

		click(NRIbtn);

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

	// Enter Aadhaar Number
	public static void setAadhar(int x, int y, int z) throws Exception {
		AadharTxtfld.clear();
		type(AadharTxtfld, readingdata(x, y, z));

	}

	// Click on Don't have aadhar link
	public static void clickDonthaveAadhar() throws Exception {

		click(DonthaveAadharLink);

	}

	// Click on Get OTP option
	public static void clickGetOTP() throws Exception {

		click(GetOTPbtn);

	}

	// Enter PAN Number
	public static void setPanNumber(int x, int y, int z) throws Exception {

		// type(PanNumbertxtfld, strPanNumber);
		PanNumbertxtfld.clear();
		type(PanNumbertxtfld, readingdata(x, y, z));

	}

	public static void clickDontHavePan() throws Exception {

		click(DontHavePanlink);

	}

	// Enter Mobile Number
	public static void setMobNumber(int x, int y, int z) throws Exception {

		// type(MobNumtxtfld, strMobNumber);
		MobNumtxtfld.clear();
		type(MobNumtxtfld, readingdata(x, y, z));

	}

	// Enter Email id
	public static void setEmailId(int x, int y, int z) throws Exception {

		// type(Emailtxtfld, strEmailId);
		Emailtxtfld.clear();
		type(Emailtxtfld, readingdata(x, y, z));

	}

	// Enter PreIssuance Verification Number
	public static void setPreIssuanceNumber(int x, int y, int z) throws Exception {

		// type(PreIssuancetxtfld, strPreIssuance);
		PreIssuancetxtfld.clear();
		type(PreIssuancetxtfld, readingdata(x, y, z));

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

		click(Proceedbtn);

	}

	public static void isIndianSelected() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
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
		PageFactory.initElements(driver, JourneyScreenTwo.class);

		if (Proceedbtn.isEnabled()) {
			Assert.fail("Test Case Fail:Proceed button is enabled by default");
		} else {
			logger.info("Proceed button is not enabled by default");
		}

	}

	public static void isAllTheRequiredFeildIsPresentAsPerPayorDetailssectionOfSuperTermPlan() throws Exception {
		if (sumAssured.isDisplayed() && smokingHabit.isDisplayed() && policyTerm.isDisplayed()
				&& premiumPaymentTerm.isDisplayed() && dividendAdjustment.isDisplayed() && modeOfPayment.isDisplayed()
				&& effectiveDateOfCoverage.isDisplayed() && WOPPlusRider.isDisplayed()
				&& accidentalDeathAndDismembermentRider.isDisplayed()) {
			logger.info(
					"All the Required feilds are present as per the -->Payor Details section story-Max Life Super Term Plan");
		} else {
			Assert.fail(
					"All the Required feilds are not present as per the -->Payor Details section-Max Life Super Term Plan.story hence story fails");

		}

	}

	public static void occupationOptionSelectionWithCancerProduct() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(occupationCancerProductSelected);
		occupationCancerProductSelected.click();
		Thread.sleep(200);
		waitTillElementToBeClickable(occupation2ndOption);
		occupation2ndOption.click();
		Thread.sleep(700);
	}

	public static void preferredLanguageOfCommunicationOptionSelectionWithSAPProduct() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(preferedLanguageOfCommunication);
		preferedLanguageOfCommunication.click();
		Thread.sleep(200);
		waitTillElementToBeClickable(preferredLanguageOfCommunicationOptionSelection);
		preferredLanguageOfCommunicationOptionSelection.click();
		Thread.sleep(700);
	}

	public static void isAllTheRequiredFeildIsPresentAsPerPayorDetailssectionofCancerInsurancePlan() throws Exception {
		if (modeOfPayment.isDisplayed() && maturityAge.isDisplayed() && sumAssuredAvailable.isDisplayed()) {
			logger.info(
					"All the Required feilds are present as per the -->Payor Details section story-Max Life Cancer Insurance Plan");
		} else {
			Assert.fail(
					"All the Required feilds are not present as per the -->Payor Details section story-Max Life Cancer Insurance Plan hence story fails");

		}

	}

	// -----------------------------------------------------------------------------------------------------------------

	/*
	 * public static String Actualtext() throws Exception { List<WebElement>
	 * listOfErrors = driver .findElements(By.xpath(
	 * "//*[@id='alert-dialog-description']/div/div/div/div/div/ul/li")); int i =
	 * listOfErrors.size(); System.out.println(i); for (int j = 1; j <= i; j++) {
	 * String errorMsg = driver .findElement(By.xpath(
	 * "//*[@id='alert-dialog-description']/div/div/div/div/div/ul/li[" + j + "]"))
	 * .getText(); System.out.println(errorMsg); return errorMsg; } return null;
	 * 
	 * }
	 */

	public static void ifConditionForTabSizeTwoPDFIllustration() throws Exception {
		System.out.println("Test case pass:As PDF illustration is working");
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[contains(text(),\"Product Details\")]")).click();
	}

	public static void ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen() throws Exception {
		System.out.println("Test case pass:As PDF illustration is working");
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(7000);
	}

	/**
	 * 
	 * @param sheet
	 * @param rowNum
	 * @throws Exception
	 */
	public static void validatingErrorMsgForSTP(XSSFSheet sheet, int rowNum) throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell cellRep = sheet.getRow(rowNum).getCell(11);
		String duplicate = cellRep.getStringCellValue();
		System.out.println("\n Duplicate value picked to run " + duplicate);
		sumAssured.clear();
		sumAssured.sendKeys(duplicate);
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(8000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustration();
		}

		else
			try {
				WebElement ele = driver
						.findElement(By.xpath("//h4[(text()=\"Illustration could not be generated.\")]"));
				if (isElementDisplayed(ele)) {
					// if(driver.findElement(By.xpath("//p[(text()=\"Illustration could not be
					// generated. Reason :\")]")).isDisplayed()){
					String xpathForErrorMsg = "html/body/div[2]/div[2]/div/div/div/div/ol/li";
					comparingExcelDataWithUI(xpathForErrorMsg, 6, 0);
					escapeFunction();
				} else {
					Assert.fail("Loading time is too much or illustration not generating properly");
					escapeFunction();
				}
			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("Loading time is too much or illustration not generating properly");
				escapeFunction();

			}
	}

	/*
	 * public static void excelReader() { String data; try { InputStream is = new
	 * FileInputStream(
	 * "C:\\Users\\sp104\\Desktop\\browserstack_max\\browserstack_max\\src\\test\\resources\\MasterData.xlsx"
	 * ); Workbook wb = (Workbook) WorkbookFactory.create(is); Sheet sheet =
	 * wb.getSheet(0); Iterator rowIter = ((XSSFSheet) sheet).rowIterator(); Row r =
	 * (Row)rowIter.next(); short lastCellNum = r.getLastCellNum(); int[] dataCount
	 * = new int[lastCellNum]; int col = 0; rowIter = ((XSSFSheet)
	 * sheet).rowIterator(); while(rowIter.hasNext()) { Iterator cellIter =
	 * ((Row)rowIter.next()).cellIterator(); while(cellIter.hasNext()) { Cell cell =
	 * (Cell)cellIter.next(); col = cell.getColumnIndex(); dataCount[col] += 1;
	 * DataFormatter df = new DataFormatter(); data = df.formatCellValue(cell);
	 * System.out.println("Data: " + data); } } is.close(); for(int x = 0; x <
	 * dataCount.length; x++) { System.out.println("col " + x + ": " +
	 * dataCount[x]); } } catch(Exception e) { e.printStackTrace(); return; } }
	 * 
	 */

	public static ExpectedCondition<Boolean> waitForAjaCalls() {
		return new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return Boolean.valueOf(((JavascriptExecutor) driver).executeScript(
						"return (window.angular !== undefined) && (angular.element(document).injector() !== undefined) && (angular.element(document).injector().get('$http').pendingRequests.length === 0)")
						.toString());
			}
		};
	}

	public static <T> void removeNulls(List<T> list) {
		Iterator<T> itr = list.iterator();
		while (itr.hasNext()) {
			T curr = itr.next();

			if (curr == null)
				itr.remove(); // remove nulls
		}
	}

	public static void comparingExcelDataWithUIWhenIndexOfUIErrorMsgStartsWith1(String xpath, int sheetNo, int columnNo)
			throws Exception {
		String str = null;
		XSSFCell cellRep = null;
		List<String> actualResult = new ArrayList<String>();
		List<WebElement> actualListDOBProfInsureresDetails = driver.findElements(By.xpath(xpath));
		for (int i = 1; i < actualListDOBProfInsureresDetails.size(); i++) {
			str = actualListDOBProfInsureresDetails.get(i).getText();
			actualResult.add(str);
		}
		removeNulls(actualResult);
		System.out.println("Size of list of UI error msg   " + actualResult.size());
		System.out.println("List of UI error msg   " + actualResult);
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(sheetNo);
		int lastRow = sheet.getLastRowNum();
		while (lastRow >= 0 && sheet.getRow(lastRow).getCell(columnNo) == null) {
			lastRow--;
		}
		int columnSize = lastRow + 1;
		List<String> expectedResult = new ArrayList<String>();
		for (int i = 1; i < columnSize; i++) {
			cellRep = sheet.getRow(i).getCell(columnNo);
			final FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(hssfWorkbook);
			objFormulaEvaluator.evaluate(cellRep);
			final DataFormatter dataFormatter = new DataFormatter();
			final String cellValue = dataFormatter.formatCellValue(cellRep, objFormulaEvaluator);
			expectedResult.add(cellValue);
		}
		// removeNulls(expectedResult);
		expectedResult.removeAll(Arrays.asList("", null));
		System.out.println("Size of list of Excell error msg   " + expectedResult.size());
		System.out.println("List of excell error msg   " + expectedResult);
		int x = expectedResult.size();
		for (String compare : actualResult) {
			expectedResult.contains(compare);
			x--;
			System.out.println(x);
		}
		System.out.println(x);

		if (x == 0)

		{
			System.out.println("Test case pass:Drop down list is same as per the requirement");
		} else {
			System.out.println("Test case fail :Drop down list is not same as per the requirement");
		}
	}

	public static void validatingErrorMsgForWLS(XSSFSheet sheet, int rowNum) throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell cellRep = sheet.getRow(rowNum).getCell(15);
		String duplicate = cellRep.getStringCellValue();
		System.out.println("\n Duplicate value picked to run " + duplicate);
		premiumCommitment.clear();
		premiumCommitment.sendKeys(duplicate);
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		if (tabs.size() == 2) {
			System.out.println("M in if");
			ifConditionForTabSizeTwoPDFIllustration();
		}

		else
			try {
				WebElement ele = driver
						.findElement(By.xpath("//h4[(text()=\"Illustration could not be generated.\")]"));
				if (isElementDisplayed(ele)) {
					// if(driver.findElement(By.xpath("//p[(text()=\"Illustration could not be
					// generated. Reason :\")]")).isDisplayed()){
					System.out.println("M in else if");
					int column = rowNum + 1;
					System.out.println("Column picking as per the row of data" + column);
					comparingExcelDataWithUI(xpathForErrorMsg, 6, column);
					escapeFunction();
				} else {

					Assert.fail("Loading time is too much or illustration not generating properly");
					escapeFunction();
				}
			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("Loading time is too much or illustration not generating properly");
				escapeFunction();

			}

	}

	public static boolean sumAssured() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(3);
		int totalNumOfRows = sheet.getLastRowNum();
		System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
			validatingErrorMsgForSTP(sheet, rowNum);
		}
		hssfWorkbook.close();
		return false;
	}

	@FindBy(xpath = "//label[contains(@for, 'InsurerGenderMale')]")
	static WebElement insurersGenderMale;

	public static void checkAllTheInsurersDetailsFeildsPresentOrNot() throws Exception {
		if (insurersName.isDisplayed() && insurersGenderMale.isDisplayed() && insurersGenderFemale.isDisplayed()
				&& dateOfBirthIssurer.isDisplayed() && relationshipWithProposer.isDisplayed()) {
			System.out.println("Test case pass:As all the feilds for Insurers details on screen two is present");
			if (insurersGenderFemale.isSelected() && insurersGenderMale.isSelected()) {
				Assert.fail("Test case fail:-'SCREEN TWO'As Insuresr MALE/FEMALE is selected by default");
			} else {
				System.out.println("Test case pass:-'SCREEN TWO' As Insuresr MALE/FEMALE is not selected by default");
			}

		} else {
			Assert.fail("Test case pass:'SCREEN TWO 'As all the feilds for Insurers details is not present");
		}

	}

	public static void checkAndFillIssurersNameValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		insurersName.clear();
		type(insurersName, readingdata(x, y, z));
		String insurersNamePassedFromExcel = insurersName.getAttribute("value");
		int size = insurersNamePassedFromExcel.length();
		if ((size == 25) && (!insurersNamePassedFromExcel.contains("@") && insurersNamePassedFromExcel.contains("."))) {
			logger.info(
					"Test case pass:- As issurers name feild length is 25 and not accepting special character and numbers ");
		} else {
			Assert.fail(
					"Test case fail:- As issurers name feild length is either not of 25 or accepting special character or numbers");
		}

	}

	public static void validatingErrorMsgForMIAP(XSSFSheet sheet, int rowNum) throws Exception {

		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell cellAnnualIncome = sheet.getRow(rowNum).getCell(14);
		String annualIncomelFromExcell = cellAnnualIncome.getStringCellValue();

		/*
		 * XSSFCell cellpremiumCommitment = sheet.getRow(rowNum).getCell(12); String
		 * premiumCommitmentFromExcell = cellpremiumCommitment.getStringCellValue();
		 * 
		 * XSSFCell celldesiredAnnualIncome = sheet.getRow(rowNum).getCell(13); String
		 * desiredAnnualIncomeFromExcell = celldesiredAnnualIncome.getStringCellValue();
		 * 
		 * premiumCommitment.clear();
		 * premiumCommitment.sendKeys(premiumCommitmentFromExcell);
		 * 
		 * desiredAnnualIncome.clear();
		 * desiredAnnualIncome.sendKeys(desiredAnnualIncomeFromExcell);
		 */

		annualIncome.clear();
		annualIncome.sendKeys(annualIncomelFromExcell);

		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustration();

		} else
			try {
				WebElement ele = driver
						.findElement(By.xpath(" //h4[(text()=\"Illustration could not be generated.\")]"));
				if (isElementDisplayed(ele)) {
					comparingExcelDataWithUI(xpathForErrorMsg, 6, 1);
					Actions action = new Actions(driver);
					action.sendKeys(Keys.ESCAPE).build().perform();
					Thread.sleep(1000);
				} else {
					Assert.fail("Either PDF is not generting or Loading time is too much");
					Actions action = new Actions(driver);
					action.sendKeys(Keys.ESCAPE).build().perform();
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("Either PDF is not generting or Loading time is too much");
				escapeFunction();

			}
	}

	public static void validatingErrorMsgForFTSP(XSSFSheet sheet, int rowNum) throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		String premiumCommitmentFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 6);

		String growthSuperFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 0);
		int convertingInNumGrowthSuperFundFromExcell = Integer.parseInt(growthSuperFundFromExcell);

		String secureFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 1);
		int convertingInNumSecureFundFromExcell = Integer.parseInt(secureFundFromExcell);

		String conservativeFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 2);
		int convertingInNumConservativeFundFromExcell = Integer.parseInt(conservativeFundFromExcell);

		String highGrowthFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 3);
		int convertingInNumHighGrowthFundFromExcell = Integer.parseInt(highGrowthFundFromExcell);

		String balancedFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 4);
		int convertingInNumBalancedFundFromExcell = Integer.parseInt(balancedFundFromExcell);

		String growthFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 5);
		int convertingInNumGrowthFundFromExcell = Integer.parseInt(growthFundFromExcell);

		premiumCommitment.clear();
		premiumCommitment.sendKeys(premiumCommitmentFromExcell);
		chooseYourFundYes();
		GrowthSuperFund.clear();
		GrowthSuperFund.sendKeys(growthSuperFundFromExcell);
		secureFund.clear();
		secureFund.sendKeys(secureFundFromExcell);
		conservativeFund.clear();
		conservativeFund.sendKeys(conservativeFundFromExcell);
		HighGrowthFund.clear();
		HighGrowthFund.sendKeys(highGrowthFundFromExcell);
		BalancedFund.clear();
		BalancedFund.sendKeys(balancedFundFromExcell);
		growthFund.clear();
		growthFund.sendKeys(growthFundFromExcell);
		int totalPercentageCount = convertingInNumGrowthSuperFundFromExcell + convertingInNumSecureFundFromExcell
				+ convertingInNumConservativeFundFromExcell + convertingInNumHighGrowthFundFromExcell
				+ convertingInNumBalancedFundFromExcell + convertingInNumGrowthFundFromExcell;

		if (isElementDisplayed(totalPercentage)) {
			if (totalPercentageCount == 100) {
				// String totalPercentageErrorMsg=totalPercentage.getText();
				Assert.fail("Test case fail as Getting error message for sum 100");
			} else {
				System.out.println("Test case pass:Error message is displaying properly as total fund is" + ""
						+ totalPercentageCount + "" + "which is less or more than 100");
			}
		} else {
			JourneyScreenTwo.clickSubmitButton();
			Thread.sleep(14000);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			if (tabs.size() == 2) {
				ifConditionForTabSizeTwoPDFIllustration();

			} else
				try {
					WebElement ele = driver
							.findElement(By.xpath(" //h4[(text()=\"Illustration could not be generated.\")]"));
					if (isElementDisplayed(ele)) {
						comparingExcelDataWithUI(xpathForErrorMsg, 6, 1);
						Actions action = new Actions(driver);
						action.sendKeys(Keys.ESCAPE).build().perform();
						Thread.sleep(1000);
					}

					else {
						Assert.fail("Either PDF is not generting or Loading time is too much");
						Actions action = new Actions(driver);
						action.sendKeys(Keys.ESCAPE).build().perform();
						Thread.sleep(1000);
					}
				} catch (Exception e) {
					System.out.println(e);
					Assert.fail("Either PDF is not generting or Loading time is too much");
					escapeFunction();

				}
		}
	}

	public static boolean premiumCommitmentDesiredAnnualIncomeAnnualIncome() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(3);
		int totalNumOfRows = sheet.getLastRowNum();
		System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
			validatingErrorMsgForMIAP(sheet, rowNum);
		}
		hssfWorkbook.close();
		return false;
	}

	public static boolean premiumCommitmentWLS() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(3);
		int totalNumOfRows = sheet.getLastRowNum();
		System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
			validatingErrorMsgForWLS(sheet, rowNum);
		}
		hssfWorkbook.close();
		return false;
	}

	public static boolean premiumCommitmentPremiumFundYes() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(8);
		int totalNumOfRows = sheet.getLastRowNum();
		System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < 6; rowNum++) {
			validatingErrorMsgForFTSP(sheet, rowNum);
		}
		hssfWorkbook.close();
		return false;
	}

	public static boolean bankDetailsFeildsValidation() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(4);
		int totalNumOfRows = sheet.getLastRowNum();
		System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
			validatingAllTheBankDetailsFeilds(sheet, rowNum);
		}
		hssfWorkbook.close();
		return false;
	}

	public static void validatingBankNamePrepopulation(String gettingDataFromExcellForBankName) throws Exception {
		String sBankNameFromExcel = BankName.getAttribute("value");
		if (sBankNameFromExcel.contentEquals(gettingDataFromExcellForBankName)) {
			logger.info("Test case pass:-As Bank Name is getting prepopulated");
		} else {
			Assert.fail("Test case fail:-As Bank Name is not getting prepopultaed");
		}
	}

	public static void validatingBranchNamePrepopulation(String gettingDataFromExcellForBankBranch) throws Exception {
		String sBankNameFromExcel = BankBranch.getAttribute("value");
		if (sBankNameFromExcel.contentEquals(gettingDataFromExcellForBankBranch)) {
			logger.info("Test case pass:-As Bank Name is getting prepopulated");
		} else {
			Assert.fail("Test case fail:-As Bank Name is not getting prepopultaed");
		}
	}

	public static void validatingAllTheBankDetailsFeilds(XSSFSheet sheet, int rowNum) throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		Thread.sleep(500);
		String bankIFSCFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 2);
		String bankMICRFromExcell = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 3);
		IFSC.clear();
		IFSC.sendKeys(bankIFSCFromExcell);
		Thread.sleep(500);
		MICR.clear();
		MICR.sendKeys(bankMICRFromExcell);
		Thread.sleep(500);
		JourneyScreenThree.checkIFSCAndMICRServiceIsValidatedWithTosterMessge();

		String gettingDataFromExcellForBankName = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 11);
		validatingBankNamePrepopulation(gettingDataFromExcellForBankName);

		String gettingDataFromExcellForBankBranch = getColumnDataAsPerTheForLoopRow(sheet, rowNum, 10);
		validatingBranchNamePrepopulation(gettingDataFromExcellForBankBranch);

	}

	public static boolean premiumCommitmentSAPCheckingMultipleDataForErrorMessage() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(3);
		int totalNumOfRows = sheet.getLastRowNum();
		System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
			validatingErrorMsgForSAP(sheet, rowNum);
		}
		hssfWorkbook.close();
		return false;
	}

	public static boolean isElementDisplayed(WebElement ele) {
		boolean elementDisplayed = false;

		try {
			ele.isDisplayed();
			elementDisplayed = true;
		} catch (Exception e) {
			elementDisplayed = false;
		}

		return elementDisplayed;

	}

	public static void validatingErrorMsgForSAP(XSSFSheet sheet, int rowNum) throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell cellRep = sheet.getRow(rowNum).getCell(15);
		String duplicate = cellRep.getStringCellValue();
		System.out.println("\n Duplicate value picked to run " + duplicate);
		premiumCommitment.clear();
		premiumCommitment.sendKeys(duplicate);
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			System.out.println("M in if");
			ifConditionForTabSizeTwoPDFIllustration();
		}

		else
			try {

				WebElement ele = driver
						.findElement(By.xpath(" //h4[(text()=\"Illustration could not be generated.\")]"));
				if (isElementDisplayed(ele)) {
					waitTillElementVisible(
							driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div/ol/li")));
					int column = rowNum - 1;
					comparingExcelDataWithUI(xpathForErrorMsg, 7, column);
					escapeFunction();
				} else {
					Assert.fail("Either loading time is too much or PDF is not genertaing properly");
					escapeFunction();
				}

			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("Either loading time is too much or PDF is not genertaing properly");
				escapeFunction();

			}

	}

	public static void checkPOSVforSAPPremiumCommitment(int x, int y, int z) throws Exception {

		premiumCommitment.clear();
		type(premiumCommitment, readingdata(x, y, z));

		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for SAP");

		}

	}

	public static void checkPOSVforMIAPPremiumCommitment(int x, int y, int z) throws Exception {
		premiumCommitment.clear();
		type(premiumCommitment, readingdata(x, y, z));

	}

	public static void checkPOSVforMIAPDesiredAnnualIncome(int x, int y, int z) throws Exception {
		desiredAnnualIncome.clear();
		type(desiredAnnualIncome, readingdata(x, y, z));
	}

	public static void checkPOSVforMIAPAnnualIncome(int x, int y, int z) throws Exception {
		Thread.sleep(300);
		annualIncome.clear();
		type(annualIncome, readingdata(x, y, z));
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for SAP");

		}

	}

	public static void checkPOSVforSAPLoop() throws Exception {
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for SAP");

		}

	}

	// ------------------------------------------------------------------------------------------------------------

	public static void premiumCommitment(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		premiumCommitment.clear();
		type(premiumCommitment, readingdata(x, y, z));
	}

	public static void growthSuperFund(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		GrowthSuperFund.clear();
		type(GrowthSuperFund, readingdata(x, y, z));
	}

	public static void secureFund(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		secureFund.clear();
		type(secureFund, readingdata(x, y, z));
	}

	public static void conservativeFund(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		conservativeFund.clear();
		type(conservativeFund, readingdata(x, y, z));
	}

	public static void highGrowthFund(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		HighGrowthFund.clear();
		type(HighGrowthFund, readingdata(x, y, z));
	}

	public static void BalancedFund(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		BalancedFund.clear();
		type(BalancedFund, readingdata(x, y, z));
	}

	public static void growthFund(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		growthFund.clear();
		type(growthFund, readingdata(x, y, z));
	}

	public static void desiredAnnualIncome(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		desiredAnnualIncome.clear();
		type(desiredAnnualIncome, readingdata(x, y, z));

	}

	public static void annualIncome(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		annualIncome.clear();
		type(annualIncome, readingdata(x, y, z));

	}

	public static void proposerPersonalDetailsIncome(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		proposerPersonalDetailsAnnualIncome.clear();
		type(proposerPersonalDetailsAnnualIncome, readingdata(x, y, z));

	}

	public static void fillingAllTheRequiredFeildsToReachThirdScreen() throws Exception {
		selectByDropdownNeedOfInsurance();
		Thread.sleep(2000);
		selectByDropdownLifeStage();
		Thread.sleep(2000);
		selectByDropdownModeOfPayment();
		Thread.sleep(2000);
		selectByDropdownMaturityAge();
		Thread.sleep(2000);
		selectByDropdownSumAssuredAvailable();
		Thread.sleep(3000);
	}

	public static void fillingAllTheRequiredFeildsForCIP() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		selectByDropdwnModeOfPayment();
		selectByDrpdownMaturityAge();
		selectByDrpdownSumAssuredAvailable();
		Thread.sleep(3000);
	}

	public static void fillingAllTheRequiredFeildsForCIPIsurersDetails() throws Exception {
		selectByDropdownNeedOfInsurInsurersDetails();
		selectByDropdownLifeStgeInsurersDetails();
		selectByDropdwnModeOfPaymentInsurersDetails();
		selectByDrpdownMaturityAgeInsurersDetails();
		selectByDrpdownSumAssuredAvailableInsurersDetails();
		Thread.sleep(3000);
	}

	public static void fillingAllTheRequiredFeildsForSTP() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		sumAssuredOptionSTP();
		nonSmoker();
		dividentAdjustmentSTP();
		modeOfPaymentSTP();
		WOPPlusRider();
		sumAssured();
	}

	public static void fillingAllTheRequiredFeildsForMIAP() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermSTP();
		policyTermMIAP();
		modeOfPaymentMIAP();
		dividentOptionMIAP();
		Thread.sleep(500);
		// waitTillElementToBeClickable(POSVFlowForSAPMIAP.premiumCommitmentMIAPYesOptionSelection);
		premiumCommitmentMIAPYesOptionSelection.click();
		Thread.sleep(500);
	}

	public static void fillingAllTheRequiredFeildsForWLS() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermSTP();
		policyTermWLS();
		dividendAdjustmentWLS();
		modeOfPaymentWLS();
		dividentOptionWLS();
		premiumCommitmentWLS();
	}

	public static void fillingAllTheRequiredFeildsForSAP() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumTypeSAP();
		premiumPayementTermSAP();
		policyTermSAP();
		modeOfPaymentSAP();
		dividentOptionWLS();
		WOPPlusRider();

	}

	public static void fillingAllTheRequiredFeildsForFTSP() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermFTSP();
		policyTermFTSP();
		JourneyScreenThree.arrowDownFunctionToScrollDown();
		modeOfPaymentFTSP();
		dynamicFundAllocationNo();
		systematicTransferPlanNo();
		premiumCommitmentPremiumFundYes();

		/*
		 * premiumCommitment(3, 1, 15); chooseYourFundYes(); growthSuperFund(3, 1, 16);
		 * secureFund(3, 2, 16); conservativeFund(3, 3, 16); highGrowthFund(3, 4, 16);
		 * BalancedFund(3, 5, 16); growthFund(3, 6, 16);
		 */}

	@FindBy(xpath = "//input[@name='insurerName']")
	static WebElement insurersName;

	@FindBy(xpath = "//label[contains(@for, 'InsurerGenderFemale')]")
	static WebElement insurersGenderFemale;

	public static void fllIssurersNameValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		insurersName.clear();
		type(insurersName, readingdata(x, y, z));

	}

	public static void insurersGenderFemale() throws Exception {

		click(insurersGenderFemale);

	}

	public static void fillDateBirthInsurersDetails(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		dateOfBirthIssurer.clear();
		type(dateOfBirthIssurer, readingdata(x, y, z));

	}

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
	static WebElement relationshipWithProposer;

	public static void relationshipWithProposer() throws Exception {

		click(relationshipWithProposer);
		Thread.sleep(200);

	}

	@FindBy(xpath = "//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Parent\")]")
	static WebElement relationshipWithProposerParentOption;

	public static void relationshipWithProposerParentOption() throws Exception {

		click(relationshipWithProposerParentOption);
		Thread.sleep(200);

	}

	public static void selectkRelationshipWithProposerOption() throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		relationshipWithProposer();
		relationshipWithProposerParentOption();
	}

	public static void dateOfBirthIssurer() throws Exception {

		click(dateOfBirthIssurer);

	}

	public static void setDateBirthInsurersDetails(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		String dateFormat = dateOfBirthIssurer.getAttribute("placeholder");
		if (dateFormat.equalsIgnoreCase("DD/MM/YYYY")) {
			System.out.println("Test case pass:As DD/MM/YYYY is the format and displaying in date text box");
		} else {
			Assert.fail("Test case fail:Format is not DD/MM/YYYY");
		}
		dateOfBirthIssurer();
		LocalDate datw = LocalDate.now().plusDays(1L);
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "day-" + day + "";
		WebElement checkFutureDateIsEnabled = driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"));
		String classes = checkFutureDateIsEnabled.getAttribute("class");
		boolean isDisabled = classes.contains("day--disabled");
		if (isDisabled) {
			logger.info("Test Case pass:'SCREEN TWO'As Future Date is disabled for insurers details");
		} else {
			Assert.fail("Test Case Fail:'SCREEN TWO'Future Date is enabled for insurers details ");
		}

		dateOfBirthIssurer.clear();
		type(dateOfBirthIssurer, readingdata(x, y, z));

	}

	@FindBy(xpath = "//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),'Spouse/Husband/Wife')] ")
	static WebElement relationshipWithProposerSpouseOption;

	@FindBy(xpath = "//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Grandparent\")]")
	static WebElement relationshipWithProposerGrandParentOption;

	@FindBy(xpath = "//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Other\")]")
	static WebElement relationshipWithProposerOtherOption;

	public static void selectAndCheckRelationshipWithProposerOption() throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		relationshipWithProposer();
		if (relationshipWithProposerSpouseOption.isDisplayed() && relationshipWithProposerParentOption.isDisplayed()
				&& relationshipWithProposerGrandParentOption.isDisplayed()
				&& relationshipWithProposerOtherOption.isDisplayed()) {
			logger.info("Test case pass:-As all the option of relationship with proposer dropdown is present ");
		} else {
			Assert.fail("Test case fail:-As all the option of relationship with proposer dropdown is not present");
		}

		relationshipWithProposerParentOption();
	}

	public static void ifConditionForTabSizeTwoPDFIllustratioForScreenThree() throws InterruptedException {
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(7000);
	}

	@FindBy(xpath = "//p[contains(text(), \"Insurer's Details\")]")
	static WebElement insurersDetails;

	public static void checkIsurersDetailsIsPresent() throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		if (insurersDetails.isDisplayed()) {
			logger.info("Test case pass:-As Isurers Details section is present");
		} else {
			Assert.fail("Test case fail:-As Isurers Details section is not present");
		}

	}

	public static void generatingPDFToReachToScreenThree() throws Exception {
		Thread.sleep(20000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		if (tabs.size() == 2) {
			System.out.println("Test case pass:As PDF illustration is working");
			ifConditionForTabSizeTwoPDFIllustratioForScreenThree();

		} else {
			try {
				WebElement ele = driver
						.findElement(By.xpath("//h4[(text()=\"Illustration could not be generated.\")]"));
				if (isElementDisplayed(ele)) {
					List<WebElement> listOfErrors = driver
							.findElements(By.xpath("html/body/div[2]/div[2]/div/div/div/div/ol/li"));
					int i = listOfErrors.size();
					for (int j = 1; j <= i; j++) {
						String errorMsg = driver
								.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div/ol/li[" + j + "]"))
								.getText();
						System.out.println(errorMsg);
					}
					escapeFunction();
				}
			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("Either PDF is not generating or loading time is too much");
				escapeFunction();

			}
		}

	}

}
