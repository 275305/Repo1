package uielements;

import java.io.File;
import java.io.FileInputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import WebTest.JourneyScreenThreeTest;
import ru.yandex.qatools.allure.annotations.Description;
import ru.yandex.qatools.allure.annotations.Step;
import util.AppConstant;

public class JourneyScreenTwo extends ReusableActions {

	private static File file;
	private static FileInputStream fileInputStream;
	private static XSSFWorkbook hssfWorkbook;
	private static XSSFSheet sheet;

	public static int i = 1;
	public static int k;
	static String xpathForErrorMsg = "html/body/div[2]/div[2]/div/div/div/div/ol/li";
	// Locating Indian Nationality radio Button

	@FindBy(xpath = "//input[@name='income']")
	public static WebElement annualIncomePersonalDetailsDependent;

	// Locating Proceed button
	@FindBy(xpath = "//span[contains(text(), 'Proceed')]")
	static WebElement proceedBtn;

	@FindBy(xpath = "//li[contains(text(),'Minimum LI Age at Entry is 18 years')]")
	static WebElement errorMessageWhenAgeLessThan18;

	@FindBy(xpath = "//h4[(text()=\"Illustration could not be generated.\")]")
	static WebElement errorMessageWhenAgeMoreThan60;

	@FindBy(xpath = "//input[@name='insurerName']")
	static WebElement insurersNameLabel;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")
	static WebElement outsideClick;

	@FindBy(xpath = "//li[contains(text(),'Maximum LI Age at Entry for Pay Till 60 variant is')]")
	static WebElement maximumAgeLimit44ErrorMessage;

	@FindBy(xpath = "//label[contains(@for, 'InsurerGenderMale')]")
	static WebElement insurersGenderMale;

	@FindBy(xpath = "//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Parent\")]")
	static WebElement relationshipWithProposerParentOption;

	@FindBy(xpath = "//div[@id='relationshipWithProposer_id']")
	static WebElement relationshipWithProposer;

	@FindBy(xpath = "//label[contains(@for, 'InsurerGenderFemale')]")
	static WebElement insurersGenderFemale;

	@FindBy(xpath = "//label[@for='female']")
	static WebElement genderFemale;

	@FindBy(xpath = "//input[@name='premiumCommitment']")
	public static WebElement premiumCommitmentDependent;

	@FindBy(xpath = "//div[@id='occupation_id']")
	public static WebElement occupationCancerProductSelected;

	@FindBy(xpath = "//div[@id='preferredLanguageOfCommunication_id']")
	public static WebElement preferedLanguageOfCommunication;

	@FindBy(xpath = ".//*[@id='menu-preferredLanguageOfCommunication']/div[2]/ul/li[1]")
	public static WebElement preferredLanguageOfCommunicationOptionSelection;

	@FindBy(xpath = ".//*[@id='menu-occupation']/div[2]/ul/li[2]")
	public static WebElement occupation2ndOption;

	@FindBy(xpath = "//input[@value='indian']")
	static WebElement Indianbtn;

	@FindBy(xpath = "//label[@for='desiredAnnualIncomeYes']")
	static WebElement desiredAnnualIncomeYes;

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

	@FindBy(xpath = "//span[@id='errorMsgOutsideIndiaAdd']")
	static WebElement errorMsgOutsideIndiaAdd;

	@FindBy(xpath = "//div[@id='permanentReflexiveNoOption']")
	static WebElement permanentReflexiveNoOption;

	@FindBy(xpath = "//div[@id='communicationAddressid']//h2")
	static WebElement communicationAddressid;

	@FindBy(xpath = "//div[@id='permanent_address']/h2[contains(text(),'Proposer Permanent Address')]")
	static WebElement proposerPermanentAddress;

	@FindBy(xpath = "//div[@id='communicationAddressid']/h2[contains(text(),'Proposer Communication Address')]")
	static WebElement proposerCommunicationAddress;

	@FindBy(xpath = "//div[@id='permanentReflexiveYesOption']")
	static WebElement permanentReflexiveYesOption;

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

	@FindBy(xpath = "//span[contains(text(),'Product   Details')]")
	static WebElement productDetails;

	// Locating Proceed button
	@FindBy(xpath = "//button[@type='submit']")
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

	@FindBy(xpath = "//div[@id='communicationProofType_id']")
	static WebElement communicationProofTypeDropDown;

	@FindBy(xpath = "//div[@id='menu-communicationProofType']/div/ul/li[5]")
	static WebElement communicationProofType1stOption;

	@FindBy(xpath = "//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),'Spouse/Husband/Wife')] ")
	static WebElement relationshipWithProposerSpouseOption;

	@FindBy(xpath = "//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Grandparent\")]")
	static WebElement relationshipWithProposerGrandParentOption;

	@FindBy(xpath = "//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Other\")]")
	static WebElement relationshipWithProposerOtherOption;

	@FindBy(xpath = "//*[@name='lastName']")
	static WebElement lastName;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirth;

	@FindBy(xpath = "//*[@name='permanentHouseNo']")
	static WebElement houseNo;

	@FindBy(xpath = "//input[@name='communicationHouseNo']")
	static WebElement houseNoProposerCommunication;

	@FindBy(xpath = "//*[@name='permanentRoadNo']")
	static WebElement roadNo;

	@FindBy(xpath = "//input[@name='communicationRoadNo']")
	static WebElement communicationRoadNo;

	@FindBy(xpath = "//*[@name='permanentVillageTown']")
	static WebElement villageTown;

	@FindBy(xpath = "//input[@name='communicationVillageTown']")
	static WebElement communicationVillageTown;

	/*
	 * @FindBy(xpath = "//input[@placeholder='Search a country']") static
	 * WebElement country;
	 */

	@FindBy(xpath = "//input[@id='permanentCountry_idd']")
	static WebElement country;

	@FindBy(xpath = "//input[@name='communicationCountry']")
	static WebElement countryCommunication;

	@FindBy(xpath = "//span[contains(text(),'Either Permanent or Communication address should b')]")
	static WebElement errorMsgWhenSameCountryIsSelectedForPermanentAndCommunication;

	@FindBy(xpath = "//input[@placeholder='Search a state']")
	static WebElement searchState;

	/*
	 * @FindBy(xpath =
	 * "//div[@id='communicationStateid']//input[@id='State_idd']") static
	 * WebElement communicationStateCommunication;
	 */

	@FindBy(xpath = "//input[@id='communicationState_idd']")
	static WebElement communicationStateCommunication;

	@FindBy(xpath = "//input[@placeholder='Search a city']")
	static WebElement searchCity;

	/*
	 * @FindBy(xpath = "//div[@id='Cityid']//input[@id='City_idd']") static
	 * WebElement searchCityComunication;
	 */

	@FindBy(xpath = "//input[@id='communicationCity_idd']")
	static WebElement searchCityComunication;

	@FindBy(xpath = "//input[@name=\"permanentPinCode\"]")
	static WebElement pinCode;

	@FindBy(xpath = "//input[@name='communicationPinCode']")
	static WebElement communicationPinCode;

	@FindBy(xpath = "//input[@name=\"alternateMobileNo\"]")
	static WebElement alternateMobileNo;

	@FindBy(xpath = "//*[@id='permanent_address']/div[1]/div/div/div/div/div/div[@role='button']")
	static WebElement proofTypeDropDown;

	@FindBy(xpath = "//div[@id='communicationProofType_id']/div/div")
	static WebElement proofTypeDropDownPropserCommunication;

	@FindBy(xpath = "//*[@id='menu-permanentProofType']/div[2]/ul/li[6]")
	static WebElement proofTypeDropDownValue;

	@FindBy(xpath = "//li[@id='liId_Job-card issued by NREGA']")
	static WebElement proofTypeDropDownValueNrega;

	/*
	 * @FindBy(xpath = "//li[contains(text(),'liId_Letter issued')]") static
	 * WebElement proofTypeDropDownValue;
	 */

	@FindBy(xpath = "//li[@id='liId_Utility bill not more than 2 months (electricity, telephone, post-paid mobile, piped gas, water bill)']")
	static WebElement proofTypeDropDownValueProposerCommunication;

	@FindBy(xpath = "//label[contains(text(),\"Traditional\")]")
	static WebElement traditional;

	@FindBy(xpath = "//label[contains(text(),\"ULIP\")]")
	static WebElement ulipProductType;

	@FindBy(xpath = "//p[(text()=\"Total Percentage Should Be 100\")]")
	static WebElement totalPercentage;

	@FindBy(xpath = "//div[@id='productName_id']")
	static WebElement productNm;

	@FindBy(xpath = "//div[@id='productName_id']")
	static WebElement productNmDependent;

	@FindBy(xpath = ".//*[@id='menu-productName']/div[2]/ul/li[text()='Max Life Super Term Plan']")
	static WebElement maxLifeSuperTermPlan;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()='Max Life Monthly Income Advantage Plan']")
	static WebElement maxLifeMonthlyIncomeAdvantagePlan;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()= 'Max Life Whole Life Super']")
	static WebElement maxLifeWholeLifeSuper;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()= 'Max Life Smart Term Plan']")
	static WebElement maxLifeSmartTermPlan;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()= 'Max Life Savings Advantage Plan']")
	static WebElement maxLifeSavingsAdvantagePlan;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()='Max Life Fast Track Super Plan']")
	static WebElement maxLifeFastTrackSuperPlan;

	/* XPath for Shiksha Plus Super Plan */
	@FindBy(xpath = "//li[@id='liId_Max Life Shiksha Plus Super']")
	static WebElement maxLifeShikshaPlusSuperPlan;

	/* XPath for Life Perfect Partner Super Plan */
	@FindBy(xpath = "//li[@id='liId_Max Life Life Perfect Partner Super']")
	static WebElement maxLifeLifePerfectPartnerPlan;

	/* XPath for Platinum Wealth Plan */
	@FindBy(xpath = "//li[@id='liId_Max Life Platinum Wealth Plan']")
	static WebElement maxLifePlatinumWealthPlan;

	/* XPath for Premium Type dropdown */
	@FindBy(xpath = "//div[@id='premiumType_id']")
	static WebElement premiumTypeDropdown;

	/* XPath for Premium Type value */
	@FindBy(xpath = "//li[@id='liId_Single Pay']")
	static WebElement premiumTypeDropdownValue;

	/* XPath for Premium Payment Term dropdown */
	@FindBy(xpath = "//div[@id='premiumPaymentTerm_id']")
	static WebElement premiumPaymentTermDropDown;

	/* XPath for Premium Payment Term dropdown value */
	@FindBy(xpath = "//li[@id='liId_1']")
	static WebElement premiumPaymentTermDropDownValue;

	@FindBy(xpath = "//*[@id='menu-productName']/div[2]/ul/li[text()= 'Max Life Cancer Insurance Plan']")
	static WebElement maxLifeCancerInsurancePlan;

	@FindBy(xpath = "//label/img[@alt='Non smoker']")
	static WebElement nonSmoker;

	@FindBy(xpath = "//input[@name=\"sumAssured\"]")
	static WebElement sumAssured;

	@FindBy(xpath = "//input[@name='annualIncome']")
	static WebElement enterMonthlyIncome;

	@FindBy(xpath = "//div[@id='incomePeriod_id']")
	static WebElement incomePeriod;

	@FindBy(xpath = "//div[@id='menu-incomePeriod']/div/ul/li[1]")
	static WebElement incomePeriod1stOption;

	@FindBy(xpath = "//div[@id='menu-incomePeriod']/div/ul/li[3]")
	static WebElement incomePeriod3rdOption;

	@FindBy(xpath = "//div[@id='menu-incomePeriod']/div/ul/li[2]")
	static WebElement incomePeriod2ndOption;

	@FindBy(xpath = "//*[contains(text(),\"Smoking Habit\")]")
	static WebElement smokingHabit;

	@FindBy(xpath = "//label[text()='Policy Term']")
	static WebElement policyTerm;

	@FindBy(xpath = "//label[contains(text(),'Vesting Age')]")
	static WebElement vestigeAge;

	@FindBy(xpath = "//span[contains(text(),'Save More Tomorrow')]")
	static WebElement saveMoreTomorrowLabel;

	@FindBy(xpath = "//label[contains(text(),'Fund Option')]")
	static WebElement fundOptionLabel;

	@FindBy(xpath = "//div[@id='premiumPaymentTerm_id']")
	static WebElement premiumPayementTermSTP;

	@FindBy(xpath = "//div[@id='premiumPaymentTerm_id']")
	static WebElement premiumPayementTermSTPDependent;

	@FindBy(xpath = "//label[contains(text(),'Premium Type')]")
	static WebElement premiumTypeSAP;

	@FindBy(xpath = "//div[@id='premiumType_id']")
	static WebElement premiumTypeSAPDropDown;

	// XPATH for singlepayPremiumtype
	@FindBy(xpath = "//li[@id='liId_Single Pay']")
	static WebElement premiumType1stOptionSAP;

	// XPATH for limitedpayPremiumtype
	@FindBy(xpath = "//li[@id='liId_Limited Pay']")
	static WebElement premiumType2ndOptionSAP;

	// XPATH for Single premiumPaymenttype
	@FindBy(xpath = "//li[@id='liId_1']")
	static WebElement premiumpaymentterm1stoption;

	// XPATH for Limited premiumPaymenttype
	@FindBy(xpath = "//li[@id='liId_5']")
	static WebElement premiumpaymentterm1stoptionforlimited;

	// XPATH for policyTerm for SinglePay Premium
	@FindBy(xpath = "//li[@id='liId_10']")
	static WebElement policyterm1stOption;

	@FindBy(xpath = "//label[contains(text(),'Dividend Option')]")
	static WebElement dividentOption;

	@FindBy(xpath = "//label[text()='Premium Payment Term']")
	static WebElement premiumPaymentTerm;

	@FindBy(xpath = "//label[contains(text(),'Premium Type')]")
	static WebElement premiumType;

	@FindBy(xpath = "//span[text()='Choose Your Fund']")
	static WebElement chooseYourFund;

	@FindBy(xpath = "//span[text()='Dynamic Fund Allocation']")
	static WebElement dynamicFundAllocation;

	@FindBy(xpath = "//span[text()='Systematic Transfer Plan']")
	static WebElement systematicTransferPlan;

	@FindBy(xpath = "//div[@id='premiumPaymentTerm_id']")
	static WebElement premiumPaymentTermSAP;

	@FindBy(xpath = "//div[@id='premiumPaymentTerm_id']")
	static WebElement premiumPaymentTermFTSP;

	@FindBy(xpath = "//div[@id='premiumPaymentTerm_id']")
	static WebElement premiumPaymentTermSPSP;

	@FindBy(xpath = "//div[@id='premiumPaymentTerm_id']")
	static WebElement premiumPaymentTermLLPP;

	@FindBy(xpath = "//li[@id='liId_5']")
	static WebElement valueAtpremiumPaymentTermSPSP;

	@FindBy(xpath = "//li[@id='liId_7']")
	static WebElement valueAtpremiumPaymentTermLLPP;

	// Xpath for premium Payment Term dropdown
	/*
	 * @FindBy(xpath = "//label[contains(text(),'Premium Payment Term')]")
	 * static WebElement premiumPaymentTermSPSP;
	 */

	// XPATH for PremiumPaymentTermFTSP 20
	@FindBy(xpath = "//li[@id='liId_20']")
	static WebElement premiumPaymentTermFTSP20;

	// XPATH for PremiumPaymentTermFTSP 5
	@FindBy(xpath = "//li[@id='liId_5']")
	static WebElement premiumPaymentTermFTSP5;

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

	@FindBy(xpath = "//input[@value='WOP Plus Rider']")
	static WebElement WOPPlusRiderCheckBox;

	@FindBy(xpath = "//span[contains(text(), 'Term Plus Rider')]")
	static WebElement termPlusRider;

	@FindBy(xpath = "//span[contains(text(),'Accident Cover Option Rider')]")
	static WebElement accidentCoverOptionRider;

	@FindBy(xpath = "//span[contains(text(),'Accelerated Critical Illness Option Rider')]")
	static WebElement acceleratedCriticalIllnessOptionRider;

	@FindBy(xpath = "//label[contains(@for, 'isAcceleratedCriticalIllnessOptionRiderLevel')]")
	static WebElement isAcceleratedCriticalIllnessOptionRiderLevel;

	@FindBy(xpath = "//label[contains(@for, 'isAcceleratedCriticalIllnessOptionRiderIncreasing')]")
	static WebElement isAcceleratedCriticalIllnessOptionRiderIncreasing;

	@FindBy(xpath = "//input[@name='acorAddAmount']")
	static WebElement acorAddAmount;

	@FindBy(xpath = "//input[@name='aciorAddAmount']")
	static WebElement acceleratedCriticalAmount;

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

	@FindBy(xpath = "//div[@id='needOfInsurance_id']")
	static WebElement needOfInsurance;

	// @FindBy(xpath = "//div[@id='needOfInsurance_id']")
	// static WebElement needOfInsurDependent;

	@FindBy(xpath = "//*[@id='menu-needOfInsurance']/div[2]/ul/li[1]")
	static WebElement needOfInsurance1stOption;

	// @FindBy(xpath =
	// ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[@role='button']")
	// static WebElement lifeStage;

	@FindBy(xpath = "//div[@id='lifeStage_id']")
	static WebElement lifeStageDropDown;

	@FindBy(xpath = ".//*[@id='menu-lifeStage']/div[2]/ul/li[1]")
	static WebElement lifeStage1stOption;
	@FindBy(xpath = "//li[@id='liId_Young & Single']")
	static WebElement lifeStage1sttOption;

	@FindBy(xpath = "//*[@id='menu-dividendAdjustment']/div[2]/ul/li[1]")
	static WebElement dividentAdjustment1stOption;

	@FindBy(xpath = ".//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[1]")
	static WebElement PremiumPaymentTermOption;

	@FindBy(xpath = "//li[@id='liId_40']")
	static WebElement PremiumPaymentTermOption40;

	@FindBy(xpath = ".//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[2]")
	static WebElement PremiumPaymentTermOption10;

	@FindBy(xpath = ".//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[3]")
	static WebElement PremiumPaymentTermOption12;

	@FindBy(xpath = "//li[@id='liId_35']")
	static WebElement PremiumPaymentTermOption35;

	@FindBy(xpath = "//li[@id='liId_30']")
	static WebElement PremiumPaymentTermOption30;

	@FindBy(xpath = "//li[@id='liId_50']")
	static WebElement PremiumPaymentTermOption50;

	@FindBy(xpath = "//li[@id='liId_42']")
	static WebElement PremiumPaymentTermOption42;

	@FindBy(xpath = "//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[(text()=25)]")
	static WebElement PremiumPaymentTermOptionSAP;

	@FindBy(xpath = ".//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[1]")
	static WebElement PremiumPaymentTermOptionSTPDepent;

	@FindBy(xpath = ".//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[1]")
	static WebElement PremiumPaymentTermFTSP;

	@FindBy(xpath = ".//*[@id='menu-premiumType']/div[2]/ul/li[3]")
	static WebElement premiumType3rdOptionSAP;

	@FindBy(xpath = "//*[@id='menu-policyTerm']/div[2]/ul/li[(text()=25)]")
	static WebElement policyTermSTPOption;

	@FindBy(xpath = "//*[@id='menu-policyTerm']/div[2]/ul/li[1]")
	static WebElement policyTermFTSPOption;

	@FindBy(xpath = "//*[@id='menu-policyTerm']/div[2]/ul/li[1]")
	static WebElement policyTermLLPPOption;

	@FindBy(xpath = ".//*[@id='menu-policyTerm']/div[2]/ul/li[1]")
	static WebElement policyTerm1stOptionSAP;

	@FindBy(xpath = "//li[@id='liId_10']")
	static WebElement dropDown10;

	@FindBy(xpath = "//li[@id='liId_20']")
	static WebElement dropDown20;

	@FindBy(xpath = "//li[@id='liId_15']")
	static WebElement dropDown15;

	@FindBy(xpath = "//div[@id='menu-deathBenefit']/div/ul/li[1]")
	static WebElement deathBenifit1stOption;

	@FindBy(xpath = "//div[@id='menu-deathBenefit']/div/ul/li[2]")
	static WebElement deathBenifitIncomeProtectorDropDown;

	@FindBy(xpath = "//div[@id='menu-deathBenefit']/div/ul/li[3]")
	static WebElement deathBenifitIncomeInflationProtectorDropDown;

	@FindBy(xpath = "//div[@id='menu-deathBenefit']/div/ul/li[6]")
	static WebElement deathBenifitIncreasingCover;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement dropDownModeOfPayment;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement dropDwnModeOfPayment;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement dropDwnModeOfPaymentInsurersDetail;

	@FindBy(xpath = "//*[@id='menu-modeOfPayment']/div[2]/ul/li[1]")
	static WebElement modeOfPayment1stOption;

	@FindBy(xpath = "//li[@id='liId_Annual']")
	static WebElement modeOfPaymentAnnualLLPP;

	@FindBy(xpath = "//li[@id='liId_Semi-Annual']")
	static WebElement modeOfPaymentSemiAnnualLLPP;

	@FindBy(xpath = "//li[@id='liId_Quarterly']")
	static WebElement modeOfPaymentQuarterlyLLPP;

	@FindBy(xpath = "//li[@id='liId_Monthly']")
	static WebElement modeOfPaymentMonthlyLLPP;

	@FindBy(xpath = "//*[@id='menu-modeOfPayment']/div[2]/ul/li[2]")
	static WebElement modeOfPaymentSemiAnnual;

	@FindBy(xpath = "//*[@id='menu-modeOfPayment']/div[2]/ul/li[3]")
	static WebElement modeOfPaymentQuaterly;

	@FindBy(xpath = ".//*[@id='menu-dividendAdjustment']/div[2]/ul/li[1]")
	static WebElement dividentOption1stOption;

	@FindBy(xpath = ".//*[@id='menu-dividendOption']/div[2]/ul/li[1]")
	static WebElement divident1stOption;

	/* select Cash Value from Dropdown */
	@FindBy(xpath = "//li[@id='liId_Cash']")
	static WebElement dividentCashLPPS;

	/* select PUA Value from Dropdown */
	@FindBy(xpath = "//li[@id='liId_PUA']")
	static WebElement dividentPUALPPS;

	/* select Premium offset Value from Dropdown */
	@FindBy(xpath = "//li[@id='liId_Premium Offset']")
	static WebElement dividentPremiumOffsetLPPS;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement modeOfPaymentSTP;

	@FindBy(xpath = "//label[contains(@for, 'lifeStageEventBenefitNo')]")
	static WebElement lifeStageEventBenefitNo;

	@FindBy(xpath = "//label[contains(@for, 'premiumBackOptiontNo')]")
	static WebElement premiumBackOptiontNo;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement modeOfPaymentMIAP;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement modeOfPaymentSAPDropDown;

	// XPATH for Monthly Mode of payment
	@FindBy(xpath = "//li[@id='liId_Monthly']")
	static WebElement modeOfPaymentMonthly;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement modeOfPaymentSTPDependent;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement modeOfPaymentFTSP;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement modeOfPaymentLLPP;

	// XPATH for Quaterly Mode of payment
	@FindBy(xpath = "//li[@id='liId_Quarterly']")
	static WebElement modeOfPaymentquaterly;

	// XPATH for SemiAnnual Mode of payment
	@FindBy(xpath = "//li[@id='liId_Semi-Annual']")
	static WebElement modeOfPaymentSemiannual;

	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement modeOfPaymentWLS;

	// XPATH for SemiAnnual Mode of payment in SPSP
	@FindBy(xpath = "//div[@id='modeOfPayment_id']")
	static WebElement modeOfPaymentSPSP;

	// XPATH for Value SemiAnnual in SPSP
	@FindBy(xpath = "//li[@id='liId_Semi-Annual']")
	static WebElement valueSemiannualSPSP;

	// XPATH for Value Quarterly in SPSP
	@FindBy(xpath = "//li[@id='liId_Quarterly']")
	static WebElement valueQuartlySPSP;

	// XPATH for Value Quarterly in SPSP
	@FindBy(xpath = "//li[@id='liId_Monthly']")
	static WebElement valueMonthlySPSP;

	@FindBy(xpath = "//div[@id='dividendAdjustment_id']")
	static WebElement dividentAdjustment;

	@FindBy(xpath = "//div[@id='dividendAdjustment_id']")
	static WebElement dividentAdjustmentWLS;

	@FindBy(xpath = "//div[@id='policyTerm_id']")
	static WebElement policyTermSTP;

	@FindBy(xpath = "//div[@id='deathBenefit_id']")
	static WebElement deathBenefit;

	@FindBy(xpath = "//div[@id='policyTerm_id']")
	static WebElement policyTermSTPDependent;

	@FindBy(xpath = "//div[@id='sumAssuredOption_id']")
	static WebElement sumAssuredOptionDependent;

	@FindBy(xpath = "//div[@id='policyTerm_id']")
	static WebElement policyTermDropDownSAP;

	@FindBy(xpath = "//div[@id='policyTerm_id']")
	static WebElement policyTermDropDownFTSP;

	@FindBy(xpath = "//div[@id='policyTerm_id']")
	static WebElement policyTermDropDownLLPP;

	@FindBy(xpath = "//div[@id='sumAssuredOption_id']")
	static WebElement sumAssuredOptionSTP;

	@FindBy(xpath = "//div[@id='maturityAge_id']")
	static WebElement dropDownMaturityAge;

	@FindBy(xpath = "//div[@id='maturityAge_id']")
	static WebElement dropDwnMaturityAgeIsurersDetails;

	@FindBy(xpath = "//*[@id='menu-maturityAge']/div[2]/ul/li[(text()=65)]")
	static WebElement maturityAgeOption;

	@FindBy(xpath = "//*[@id='menu-sumAssuredOption']/div[2]/ul/li[1]")
	static WebElement sumAssuredOption1stSTP;

	@FindBy(xpath = "//input[@name='premiumCommitment']")
	static WebElement premiumCommitment;

	@FindBy(xpath = "//span[contains(text(),'Partner Care Rider')]")
	static WebElement partnerCareRider;

	@FindBy(xpath = "//span[contains(text(),'Choose Your Fund')]")
	static WebElement chooseYourFundLabel;

	@FindBy(xpath = "//label[contains(text(),'Child Date Of Birth')]")
	static WebElement childDateOfBirthLabel;

	@FindBy(xpath = "//span[contains(text(),'Dynamic Fund Allocation')]")
	static WebElement dynamicFundAlocationLabel;

	@FindBy(xpath = "//span[contains(text(),'Systematic Transfer Plan')]")
	static WebElement sysatematicTransferPlanLabel;

	@FindBy(xpath = "//input[@name='growthSuperFund']")
	static WebElement GrowthSuperFund;

	@FindBy(xpath = "//input[@name='secureFund']")
	static WebElement secureFund;

	@FindBy(xpath = "//li[@id='react-autowhatever-permanentCountry--item-0']")
	static WebElement countryIstOption;

	@FindBy(xpath = "//li[@id='react-autowhatever-communicationCountry--item-0']")
	static WebElement communicationCountry1stOption;

	@FindBy(xpath = "//li[@id='react-autowhatever-communicationCountry--item-1']")
	static WebElement communicationCountry2ndOption;

	@FindBy(xpath = "//li[@id='react-autowhatever-permanentCountry--item-1']")
	static WebElement country2ndOption;

	@FindBy(xpath = "//input[@name='conservativeFund']")
	static WebElement conservativeFund;

	@FindBy(xpath = "//input[@name='highGrowthFund']")
	static WebElement HighGrowthFund;

	@FindBy(xpath = "//input[@name='balancedFund']")
	static WebElement BalancedFund;

	@FindBy(xpath = "//input[@name='growthFund']")
	static WebElement growthFund;

	@FindBy(xpath = "//label[contains(text(),'Sum Assured Available')]")
	static WebElement dropDownSumAssuredAvailableLabel;

	@FindBy(xpath = "//div[@id='sumAssuredAvailable_id']")
	static WebElement drpDownSumAssuredAvailableInsurersDetails;

	@FindBy(xpath = ".//*[@id='menu-sumAssuredAvailable']/div[2]/ul/li[(text()=2500000)]")
	static WebElement sumAssuredAvailableOption;

	@FindBy(xpath = ".//*[@id='menu-sumAssuredAvailable']/div[2]/ul/li[(text()=2500000)]")
	static WebElement sumAssuredAvailableOptionInsureresDetails;

	@FindBy(xpath = "//span[contains(text(),'Desired Annual Income (₹)')]")
	static WebElement desiredAnnualIncome;

	@FindBy(xpath = "//label[contains(text(),'Dividend Option')]")
	static WebElement dividendOptionWLS;

	@FindBy(xpath = "//div[@id='dividendOption_id']")
	static WebElement dividendOptionWLSDropDown;

	/* XPath for Devident Fund */
	@FindBy(xpath = "//div[@id='dividendOption_id']")
	static WebElement dividendOptionLPPSDropDown;

	/* XPath for Rider Details Accidental */
	@FindBy(xpath = "//input[@name='isAccidentalDeathAndDismembermentRider']")
	static WebElement accidentalDeathCheckBoxLPPS;

	/* XPath for Term Plus Rider */
	@FindBy(xpath = "//input[@name='isTermPlusRider']")
	static WebElement termPlusRiderCheckBoxLPPS;

	/* XPath for Term */
	@FindBy(xpath = "//div[@id='riderTerm_id']")
	static WebElement riderTermdropDownLPPS;

	/* XPath for Term */
	@FindBy(xpath = "//li[@id='liId_7']")
	static WebElement riderTermdropDownValueLPPS;

	/* XPath for Rider Details Accidental */
	@FindBy(xpath = "//input[@name='accidentalDeathAddAmount']")
	static WebElement ammountLabelRiderDetailsLPPS;

	/* XPath for Term Rider Details */
	@FindBy(xpath = "//input[@name='termPlusAddAmount']")
	static WebElement ammountLabelTermRiderDetailsLPPS;

	/* XPath for Rider Details Term Plus Rider */
	@FindBy(xpath = "//input[@name='isTermPlusRider']")
	static WebElement TermPlusRiderCheckBoxLPPS;

	/* XPath for Rider Details WOP Plus Rider */
	@FindBy(xpath = "//input[@name='isWOPPlusRider']")
	static WebElement WOPPlusRiderCheckBoxLPPS;

	@FindBy(xpath = "//div[@id='sumAssuredOption_id']")
	static WebElement sumAssuredOption;

	@FindBy(xpath = "//div[@id='dividendAdjustment_id']")
	static WebElement dividentAdjustmentDependent;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div/div[4]/div/div/input[@name='sumAssured']")
	static WebElement sumAssuredText;

	@FindBy(xpath = "//*[@id='menu-sumAssuredOption']/div[2]/ul/li[1]")
	static WebElement sumAssuredOption1stOption;

	@FindBy(xpath = ".//*[@id='menu-dividendAdjustment']/div[2]/ul/li[1]")
	static WebElement dividentAdjustmentDependent1stOption;

	@FindBy(xpath = "//li[@id='react-autowhatever-permanentCountry--item-0']")
	static WebElement countryDropDown;

	@FindBy(xpath = "//li[@id='react-autowhatever-permanentState--item-0']")
	static WebElement state1stOption;

	@FindBy(xpath = "//div[@id='dateOfBirth_id']/div")
	static WebElement dateOfBirthPersonalDetails;

	@FindBy(xpath = "//div[@id='panApplicationDate_id']")
	static WebElement panApplicationDate;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirthNomineeDetails;

	@FindBy(xpath = "//li[@id='react-autowhatever-permanentCity--item-0']")
	static WebElement city1stOption;

	@FindBy(xpath = "//li[contains(text(),'Spouse')]")
	static WebElement proposerDropdown;

	/*
	 * @FindBy(xpath = "//div[@id='insurerDateOfBirth_id']") static WebElement
	 * dateOfBirthIssurer;
	 */

	@FindBy(xpath = "//input[@name='insurerDateOfBirth']")
	static WebElement dateOfBirthIssurer;

	// XPATH for AccidentalDeathAndDismembermentRider detail
	@FindBy(xpath = "//input[@name='isAccidentalDeathAndDismembermentRider']")
	static WebElement ADDRidercheckbox;

	// XPATH for AccidentalDeathAndDismembermentRider amount
	@FindBy(xpath = "//input[@name='accidentalDeathAddAmount']")
	static WebElement ADDRideramount;

	// XPATH for TermPlusRider Amt
	@FindBy(xpath = "//input[@name='termPlusAddAmount']")
	static WebElement termPlusAmount;

	// XPATH for Rider Term
	@FindBy(xpath = "//div[@id='riderTerm_id']")
	static WebElement riderterm;

	// for dropdown25
	@FindBy(xpath = "//li[@id='liId_25']")
	static WebElement dropDown25;

	@FindBy(xpath = "//div[@id='childDob_id']")
	static WebElement chieldDateBirthProductDetails;

	@FindBy(xpath = "//select[@class='react-datepicker__month-select']/option[1]")
	static WebElement selectMonthDateBirthProductDetails;

	@FindBy(xpath = "//div[@class='react-datepicker__month']/div[2]/div[contains(text(),'8')]")
	static WebElement selectDateDateBirthProductDetails;

	@FindBy(xpath = "//input[@name='premiumCommitment']")
	static WebElement premiumCommitmentSPSP;

	public static void chieldDateBirthProductDetails() {
		chieldDateBirthProductDetails.click();
		waitTillElementToBeClickable(chieldDateBirthProductDetails);
		selectMonthDateBirthProductDetails.click();
		waitTillElementToBeClickable(selectMonthDateBirthProductDetails);
		selectDateDateBirthProductDetails.click();
	}

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

	public static void selectByDropdownNrega() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		waitTillElementToBeClickable(proofTypeDropDown);
		proofTypeDropDown.click();
		Thread.sleep(1000);
		proofTypeDropDownValueNrega.click();
		Thread.sleep(1000);
		arrowDownFunctionToScrollDownMidPage();
	}

	public static void selectByDropdownProposerCommunication() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(proofTypeDropDownPropserCommunication);
		proofTypeDropDownPropserCommunication.click();
		WebElement element = driver.findElement(By.xpath(
				"//li[@id='liId_Utility bill not more than 2 months (electricity, telephone, post-paid mobile, piped gas, water bill)']"));
		new Actions(driver).moveToElement(element).click().perform();
		proofTypeDropDownValueProposerCommunication.click();
		waitTillElementToBeClickableRefreshed(proofTypeDropDownValueProposerCommunication);
		Thread.sleep(5000);
		outsideClick.click();
		// arrowDownFunctionToScrollDown();
	}

	public static void selectFemale() throws Exception {
		genderFemale.click();
	}

	public static void traditional() throws Exception {
		Thread.sleep(800);
		outsideClick.click();
		click(traditional);
	}

	public static void city1stOption() throws Exception {

		click(city1stOption);
	}

	public static void ulip() throws Exception {

		Thread.sleep(800);
		outsideClick.click();
		click(ulipProductType);
	}

	public static void countryIstOption() throws Exception {

		click(countryIstOption);

	}

	public static void communicationCountry1stOption() throws Exception {

		click(communicationCountry1stOption);

	}

	public static void chooseYourFundYes() throws Exception {

		click(chooseYourFundYes);
	}

	public static void chooseYourFundNo() throws Exception {

		click(chooseYourFundNo);
	}

	public static void dynamicFundAllocationNo() throws Exception {

		click(dynamicFundNo);
	}

	public static void dynamicFundAllocationYes() throws Exception {

		click(dynamicFundYes);
	}

	public static void systematicTransferPlanNo() throws Exception {

		click(systematicNo);
	}

	public static void systematicTransferPlanYes() throws Exception {

		click(systematicYes);
	}

	public static void WOPPlusRiderCheckBox() throws Exception {

		click(WOPPlusRiderCheckBox);
	}

	public static void nonSmoker() throws Exception {
		click(nonSmoker);
		Thread.sleep(500);
	}

	public static void allPremiumPayementTermSTP() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		waitTillElementToBeClickable(PremiumPaymentTermOption);

		List<String> expectedResult = fetchingdataFromExcelExpectedResultSheet(2, 5, 4);
		List<String> actualResultText = fetchingdataFromUI("//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li");
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);

		Thread.sleep(700);
		PremiumPaymentTermOption.click();

		for (int i = 1; i <= 4; i++) {
			Thread.sleep(1000);
			premiumPayementTermSTP.click();
			Thread.sleep(800);
			driver.findElement(By.xpath("//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[" + i + "]")).click();
			policyTermSTPDropDown();
			deathBenifitOption();
			nonSmoker();
			sumAssured(3, 4, 11);
			modeOfPaymentSTP();
			lifeStageEventBenefitNo();
			premiumBackOptiontNo();
			WOPPlusRiderCheckBox();
			ifElseConditionSmartTermPlan();

		}

	}

	public static void allPremiumPayementTermSTPRegularPay() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		waitTillElementToBeClickable(PremiumPaymentTermOption);

		List<String> expectedResult = fetchingdataFromExcelExpectedResultSheet(3, 42, 4);
		List<String> actualResultText = fetchingdataFromUI("//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li");
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);
		Thread.sleep(700);
		PremiumPaymentTermOption.click();

		for (int i = 1; i <= 42; i++) {
			Thread.sleep(1000);
			premiumPayementTermSTP.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='menu-premiumPaymentTerm']/div[2]/ul/li[" + i + "]")).click();
			Thread.sleep(800);
			policyTermSTPDropDown();
			deathBenifitOption();
			nonSmoker();
			sumAssured(3, 4, 11);
			modeOfPaymentSTP();
			lifeStageEventBenefitNo();
			premiumBackOptiontNo();
			WOPPlusRiderCheckBox();

			ifElseConditionSmartTermPlan();

		}

	}

	public static void premiumPayementTermSTP() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(PremiumPaymentTermOption);
		PremiumPaymentTermOption.click();
		Thread.sleep(500);
	}

	public static void premiumPayementTermSTP40() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(PremiumPaymentTermOption40);
		PremiumPaymentTermOption40.click();
		Thread.sleep(500);
	}

	public static void premiumPayementTermSTP10() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(PremiumPaymentTermOption10);
		PremiumPaymentTermOption10.click();
		Thread.sleep(500);
	}

	public static void premiumPayementTermSTP12() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(PremiumPaymentTermOption12);
		PremiumPaymentTermOption12.click();
		Thread.sleep(500);
	}

	public static void premiumPayementTermSTP35() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(PremiumPaymentTermOption35);
		PremiumPaymentTermOption35.click();
		Thread.sleep(500);
	}

	public static void premiumPayementTermSTP30() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(PremiumPaymentTermOption30);
		PremiumPaymentTermOption30.click();
		Thread.sleep(500);
	}

	public static void premiumPayementTermSTP50() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTP);
		premiumPayementTermSTP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(PremiumPaymentTermOption50);
		PremiumPaymentTermOption50.click();
		Thread.sleep(500);
	}

	public static void premiumPayementTermSTPDependent() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPayementTermSTPDependent);
		premiumPayementTermSTPDependent.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(PremiumPaymentTermOptionSTPDepent);
		PremiumPaymentTermOptionSTPDepent.click();
		Thread.sleep(2000);

	}

	public static void premiumPayementTermSAP() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPaymentTermSAP);
		premiumPaymentTermSAP.click();
		Thread.sleep(500);
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

	public static void premiumPayementTermSPSP() throws Exception {
		waitTillElementToBeClickable(premiumPaymentTermSPSP);
		premiumPaymentTermSPSP.click();
		waitTillElementToBeClickable(valueAtpremiumPaymentTermSPSP);
		valueAtpremiumPaymentTermSPSP.click();
		Thread.sleep(2000);
	}

	public static void premiumPayementTermLPPS() throws Exception {
		waitTillElementToBeClickable(premiumPaymentTermLLPP);
		premiumPaymentTermLLPP.click();
		waitTillElementToBeClickable(valueAtpremiumPaymentTermLLPP);
		valueAtpremiumPaymentTermLLPP.click();
		Thread.sleep(2000);
	}

	public static void premiumTypeSAP() throws Exception {
		System.out.println("111111111111");
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
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

	public static void deathBenifitOption() throws Exception {
		waitTillElementToBeClickable(deathBenefit);
		deathBenefit.click();
		waitTillElementToBeClickable(deathBenifit1stOption);
		deathBenifit1stOption.click();
		Thread.sleep(2000);
	}

	public static void deathBenifitIncomeProtector() throws Exception {
		waitTillElementToBeClickable(deathBenefit);
		deathBenefit.click();
		waitTillElementToBeClickable(deathBenifitIncomeProtectorDropDown);
		deathBenifitIncomeProtectorDropDown.click();
		Thread.sleep(2000);
	}

	public static void deathBenifitIncomeInflationProtector() throws Exception {
		waitTillElementToBeClickable(deathBenefit);
		deathBenefit.click();
		waitTillElementToBeClickable(deathBenifitIncomeInflationProtectorDropDown);
		deathBenifitIncomeInflationProtectorDropDown.click();
		Thread.sleep(2000);
	}

	public static void deathBenifitIncreasingCover() throws Exception {
		waitTillElementToBeClickable(deathBenefit);
		deathBenefit.click();
		waitTillElementToBeClickable(deathBenifitIncreasingCover);
		deathBenifitIncreasingCover.click();
		Thread.sleep(2000);
	}

	public static void deathBenifitAllOptionForPayLimitedRegularAndTill60PremiumType() throws Exception {
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		for (int i = 1; i <= 7; i++) {
			Thread.sleep(800);
			waitTillElementToBeClickable(deathBenefit);
			Thread.sleep(800);
			deathBenefit.click();
			waitTillElementToBeClickable(deathBenifit1stOption);
			Thread.sleep(800);
			driver.findElement(By.xpath("//div[@id='menu-deathBenefit']/div/ul/li[" + i + "]")).click();
			Thread.sleep(1000);

			switch (i) {
			case 1:

				sumAssured(3, 4, 11);
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 2:
				enterMonthlyIncome(3, 3, 11);
				incomePeriod();
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 3:
				enterMonthlyIncome(3, 3, 11);
				incomePeriod();
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 4:
				sumAssured(3, 4, 11);
				incomePeriod();
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 5:
				sumAssured(3, 1, 11);
				incomePeriod();
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 6:
				sumAssured(3, 1, 11);
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 7:
				sumAssured(3, 1, 11);
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;
			}
		}

	}

	public static void deathBenifitAllOptionForSinglePayPremiumType() throws Exception {
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		for (int i = 1; i <= 7; i++) {
			Thread.sleep(800);
			waitTillElementToBeClickable(deathBenefit);
			Thread.sleep(800);
			deathBenefit.click();
			waitTillElementToBeClickable(deathBenifit1stOption);
			Thread.sleep(800);
			driver.findElement(By.xpath("//div[@id='menu-deathBenefit']/div/ul/li[" + i + "]")).click();
			Thread.sleep(1000);

			switch (i) {
			case 1:

				sumAssured(3, 4, 11);
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				// WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 2:
				enterMonthlyIncome(3, 3, 11);
				incomePeriod();
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				// WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 3:
				enterMonthlyIncome(3, 3, 11);
				incomePeriod();
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				// WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 4:
				sumAssured(3, 4, 11);
				incomePeriod();
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				// WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 5:
				sumAssured(3, 1, 11);
				incomePeriod();
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				// WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 6:
				sumAssured(3, 1, 11);
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				// WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 7:
				sumAssured(3, 1, 11);
				nonSmoker();
				modeOfPaymentSTP();
				lifeStageEventBenefitNo();
				premiumBackOptiontNo();
				// WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;
			}
		}

	}

	public static void policyTermMIAP() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		policyTerm1stOptionSAP.click();
		Thread.sleep(2000);
	}

	public static void policyTermSTPDependent() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(policyTermSTPDependent);
		policyTermSTPDependent.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		policyTerm1stOptionSAP.click();
		Thread.sleep(2000);
	}

	public static void sumAssuredOptionSTPDependent() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(sumAssuredOption);
		sumAssuredOption.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(sumAssuredOption1stOption);
		sumAssuredOption1stOption.click();
		Thread.sleep(2000);
	}

	public static void dividentAdjustmentSTPDependent() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(dividentAdjustmentDependent);
		dividentAdjustmentDependent.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(dividentAdjustmentDependent1stOption);
		dividentAdjustmentDependent1stOption.click();
		Thread.sleep(2000);
	}

	public static void sumAssured(int x, int y, int z) throws Exception {
		sumAssured.clear();
		type(sumAssured, readingdata(x, y, z));
	}

	public static void enterMonthlyIncome(int x, int y, int z) throws Exception {
		enterMonthlyIncome.clear();
		type(enterMonthlyIncome, readingdata(x, y, z));
	}

	public static void sumAssuredSTPDependent() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(sumAssuredOption);
		sumAssuredOption.click();
		Thread.sleep(500);
	}

	public static void incomePeriod() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(incomePeriod);
		incomePeriod.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(incomePeriod1stOption);
		incomePeriod1stOption.click();

	}

	public static void incomePeriod20() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(incomePeriod);
		incomePeriod.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(incomePeriod3rdOption);
		incomePeriod3rdOption.click();

	}

	public static void incomePeriod15() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(incomePeriod);
		incomePeriod.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(incomePeriod2ndOption);
		incomePeriod2ndOption.click();

	}

	public static void policyTermSTPDropDown() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		Thread.sleep(1000);
		policyTerm1stOptionSAP.click();
		Thread.sleep(2000);
	}

	public static void dropDown10PolicyTerm() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		Thread.sleep(1000);
		dropDown10.click();
		Thread.sleep(2000);
	}

	public static void dropDown20PolicyTerm() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		Thread.sleep(1000);
		dropDown20.click();
		Thread.sleep(2000);
	}

	public static void dropDown15PolicyTerm() throws Exception {
		waitTillElementToBeClickable(policyTermSTP);
		policyTermSTP.click();
		waitTillElementToBeClickable(policyTerm1stOptionSAP);
		Thread.sleep(1000);
		dropDown15.click();
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
		outsideClick.click();
		Thread.sleep(300);
	}

	public static void policyTermSPSP() throws Exception {
		waitTillElementToBeClickable(policyTermDropDownFTSP);
		policyTermDropDownFTSP.click();
		waitTillElementToBeClickable(policyTermFTSPOption);
		policyTermFTSPOption.click();
		Thread.sleep(2000);
		outsideClick.click();
		Thread.sleep(300);
	}

	public static void policyTermLPPS() throws Exception {
		waitTillElementToBeClickable(policyTermDropDownLLPP);
		policyTermDropDownLLPP.click();
		waitTillElementToBeClickable(policyTermLLPPOption);
		policyTermLLPPOption.click();
		Thread.sleep(2000);
		outsideClick.click();
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
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeSuperTermPlan);
		maxLifeSuperTermPlan.click();

	}

	public static void selectByDropdownCancerInsurancePlan() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
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

	public static void selectByDropdownSTPDependent() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNmDependent);
		productNmDependent.click();
		waitTillElementToBeClickable(maxLifeSuperTermPlan);
		Thread.sleep(1000);
		maxLifeSuperTermPlan.click();
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

	@Step("Getting the plan")
	public static void selectByDropdownSmartTermPlan() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeSuperTermPlan);
		Thread.sleep(1000);
		JourneyScreenTwo.arrowDownFunctionToScrollDown();
		maxLifeSmartTermPlan.click();
		Thread.sleep(1000);

	}

	public static void selectByDropdownSAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(productNm);
		productNm.click();
		waitTillElementToBeClickable(maxLifeSavingsAdvantagePlan);
		Thread.sleep(1000);
		maxLifeSavingsAdvantagePlan.click();
		Thread.sleep(1500);

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

	/* Shiksha Plus Super Drop Down */
	public static void selectByDropdownSPSP() throws InterruptedException {
		productNm.click();
		Thread.sleep(1000);
		maxLifeShikshaPlusSuperPlan.click();
		Thread.sleep(2000);

	}

	/* Shiksha Plus Super Drop Down */
	public static void selectByDropdownLPPS() throws InterruptedException {
		productNm.click();
		Thread.sleep(1000);
		maxLifeLifePerfectPartnerPlan.click();
		Thread.sleep(2000);

	}

	/* Platinum wealth plan Drop Down */
	public static void selectByDropdownPWP() throws InterruptedException {
		productNm.click();
		Thread.sleep(1000);
		maxLifePlatinumWealthPlan.click();
		Thread.sleep(1000);
		premiumTypeDropdown.click();
		Thread.sleep(1000);
		premiumTypeDropdownValue.click();
		Thread.sleep(1000);
		premiumPaymentTermDropDown.click();
		Thread.sleep(1000);
		premiumPaymentTermDropDownValue.click();
		Thread.sleep(1000);

	}

	public static void arrowDownFunctionToScrollDown() throws Exception {

		/* for (int i = 1; i < 12; i++) { */
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		// }
		Thread.sleep(3000);
	}

	public static void arrowScrollDownFunctionToScrollDown() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,750)", "");

	}

	public static void selectByDropdownTradAllProduct() throws Exception {
		waitTillElementToBeClickable(productNm);
		productNm.click();
		Thread.sleep(1000);

		String str = null;
		List<String> actualResult = new ArrayList<String>();
		List<WebElement> actualListDOBProfInsureresDetails = driver
				.findElements(By.xpath("//*[@id='menu-productName']/div[2]/ul/li"));
		for (int i = 0; i < actualListDOBProfInsureresDetails.size(); i++) {
			str = actualListDOBProfInsureresDetails.get(i).getText();
			actualResult.add(str);
		}
		System.out.println(actualResult.size());
		System.out.println(actualResult);
		driver.findElement(By.xpath("//*[@id='menu-productName']/div[2]/ul/li[1]")).click();

		for (int i = 0; i < actualListDOBProfInsureresDetails.size(); i++) {
			waitTillElementToBeClickable(productNm);
			Thread.sleep(700);
			productNm.click();
			String strn = actualResult.get(i);
			System.out.println("here is the string which need to select" + strn);
			driver.findElement(By.xpath("//*[@id='menu-productName']/div[2]/ul/li[text()= '" + strn + "']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")).click();
			Thread.sleep(800);
			switch (strn) {
			case "Max Life Super Term Plan":
				System.out.println("Max Life Super Term Plan");
				arrowDownFunctionToScrollDown();
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
			case "Max Life Monthly Income Advantage Plan":
				System.out.println("Max Life Monthly Income Advantage Plan");
				arrowDownFunctionToScrollDown();
				if (policyTerm.isDisplayed() && dividentOption.isDisplayed() && desiredAnnualIncome.isDisplayed()
						&& premiumPaymentTerm.isDisplayed() && termPlusRider.isDisplayed()
						&& modeOfPayment.isDisplayed() && effectiveDateOfCoverage.isDisplayed()
						&& accidentalDeathAndDismembermentRider.isDisplayed() && modeOfPayment.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per the product MAX LIFE MONTHLY INCOME ADVANTAGE PLAN");
				} else {
					Assert.fail("All the feilds are not present as per the product MONTHLY INCOME ADVANTAGE PLAN");
				}

				break;
			case "Max Life Cancer Insurance Plan":
				System.out.println("Max Life Cancer Insurance Plan");
				arrowDownFunctionToScrollDown();
				if (isElementDisplayed(modeOfPayment) && isElementDisplayed(maturityAge)
						&& isElementDisplayed(dropDownSumAssuredAvailableLabel)) {

					System.out.println("All the feilds are present as per the product MAX LIFE CANCER INSURANCE PLAN");
				} else {
					Assert.fail("All the feilds are not present as per the product MAX LIFE CANCER INSURANCE PLAN");
				}
				break;

			case "Max Life Assured Wealth Plan":
				System.out.println("Max Life Assured Wealth Plan");
				arrowDownFunctionToScrollDown();
				if (isElementDisplayed(premiumPaymentTerm) && isElementDisplayed(policyTerm)
						&& isElementDisplayed(modeOfPayment) && isElementDisplayed(premiumCommitment)
						&& effectiveDateOfCoverage.isDisplayed() && accidentalDeathAndDismembermentRider.isDisplayed()
						&& WOPPlusRider.isDisplayed() && termPlusRider.isDisplayed()) {

					System.out.println("All the feilds are present as per the product Max Life Assured Wealth Plan");
				} else {
					Assert.fail("All the feilds are not present as per the product Max Life Assured Wealth Plan");
				}
				break;

			case "Max Life Future Genius Education Plan":
				System.out.println("Max Life Future Genius Education Plan");
				arrowDownFunctionToScrollDown();
				if (isElementDisplayed(premiumPaymentTerm) && isElementDisplayed(policyTerm)
						&& isElementDisplayed(modeOfPayment) && effectiveDateOfCoverage.isDisplayed()
						&& premiumCommitment.isDisplayed() && WOPPlusRider.isDisplayed() && termPlusRider.isDisplayed()
						&& accidentalDeathAndDismembermentRider.isDisplayed() && dividentOption.isDisplayed()
						&& dividendAdjustment.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per the product Max Life Future Genius Education Plan");
				} else {
					Assert.fail(
							"All the feilds are not present as per the product Max Life Future Genius Education Plan");
				}
				break;

			case "Max Life Life Perfect Partner Super":
				System.out.println("Life Life Perfect Partner Super");
				arrowDownFunctionToScrollDown();
				if (isElementDisplayed(premiumPaymentTerm) && isElementDisplayed(policyTerm)
						&& isElementDisplayed(modeOfPayment) && effectiveDateOfCoverage.isDisplayed()
						&& premiumCommitment.isDisplayed() && WOPPlusRider.isDisplayed() && termPlusRider.isDisplayed()
						&& accidentalDeathAndDismembermentRider.isDisplayed() && dividentOption.isDisplayed()) {

					System.out.println("All the feilds are present as per the product Life Life Perfect Partner Super");
				} else {
					Assert.fail("All the feilds are not present as per the product Life Life Perfect Partner Super");
				}
				break;

			case "Max Life Whole Life Super":
				System.out.println("Max Life Whole Life Super");
				arrowDownFunctionToScrollDown();
				if (policyTerm.isDisplayed() && premiumCommitment.isDisplayed() && termPlusRider.isDisplayed()
						&& premiumPaymentTerm.isDisplayed() && dividendAdjustment.isDisplayed()
						&& dividendOptionWLS.isDisplayed() && modeOfPayment.isDisplayed()
						&& effectiveDateOfCoverage.isDisplayed() && accidentalDeathAndDismembermentRider.isDisplayed()
						&& WOPPlusRider.isDisplayed()) {

					System.out.println("All the feilds are present as per the product MAX LIFE WHOLE LIFE SUPER");
				} else {
					Assert.fail("All the feilds are not present as per the product MAX LIFE WHOLE LIFE SUPER");
				}
				break;

			case "Max Life Guaranteed Income Plan":
				System.out.println("Max Life Guaranteed Income Plan");
				JourneyScreenTwo.arrowDownFunctionToScrollDown();
				if (premiumCommitment.isDisplayed() && premiumPaymentTerm.isDisplayed() && modeOfPayment.isDisplayed()
						&& effectiveDateOfCoverage.isDisplayed()) {

					System.out.println("All the feilds are present as per the product Max Life Guaranteed Income Plan");
				} else {
					Assert.fail("All the feilds are not present as per the product Max Life Guaranteed Income Plan");
				}
				break;

			case "Max Life Savings Advantage Plan":
				System.out.println("Max Life Savings Advantage Plan");
				arrowDownFunctionToScrollDown();
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
		waitTillElementToBeClickable(driver.findElement(By.xpath("//li[@id='liId_Max Life Fast Track Super Plan']")));
		driver.findElement(By.xpath("//li[@id='liId_Max Life Fast Track Super Plan']")).click();
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

	public static void selectByDropdownUlipAllProduct() throws Exception {
		waitTillElementToBeClickable(productNm);
		productNm.click();
		Thread.sleep(1000);

		String str = null;
		List<String> actualResult = new ArrayList<String>();
		List<WebElement> actualListDOBProfInsureresDetails = driver
				.findElements(By.xpath("//*[@id='menu-productName']/div[2]/ul/li"));
		for (int i = 0; i < actualListDOBProfInsureresDetails.size(); i++) {
			str = actualListDOBProfInsureresDetails.get(i).getText();
			actualResult.add(str);
		}
		System.out.println(actualResult.size());
		System.out.println(actualResult);
		driver.findElement(By.xpath("//*[@id='menu-productName']/div[2]/ul/li[1]")).click();
		System.out.println(actualListDOBProfInsureresDetails.size());
		for (int i = 0; i < actualListDOBProfInsureresDetails.size(); i++) {
			waitTillElementToBeClickable(productNm);
			Thread.sleep(700);
			productNm.click();
			String strn = actualResult.get(i);
			driver.findElement(By.xpath("//*[@id='menu-productName']/div[2]/ul/li[text()= '" + strn + "']")).click();
			Thread.sleep(1500);
			outsideClick.click();
			Thread.sleep(800);
			switch (strn) {
			case "Forever Young Pension Plan":
				System.out.println("Forever Young Pension Plan");
				arrowDownFunctionToScrollDown();
				if (isElementDisplayed(premiumPaymentTerm) && isElementDisplayed(premiumType)
						&& isElementDisplayed(policyTerm) && isElementDisplayed(vestigeAge)
						&& isElementDisplayed(saveMoreTomorrowLabel) && isElementDisplayed(fundOptionLabel)
						&& isElementDisplayed(modeOfPayment) && premiumCommitment.isDisplayed()
						&& partnerCareRider.isDisplayed()) {

					System.out.println("All the feilds are present as per the product Forever Young Pension Plan");
				} else {
					Assert.fail("All the feilds are not present as per the product Forever Young Pension Plan");
				}
				break;

			case "Max Life Platinum Wealth Plan":
				System.out.println("Max Life Platinum Wealth Plan");
				arrowDownFunctionToScrollDown();
				if (isElementDisplayed(premiumType) && isElementDisplayed(premiumPaymentTerm)
						&& isElementDisplayed(policyTerm) && isElementDisplayed(modeOfPayment)
						&& premiumCommitment.isDisplayed() && partnerCareRider.isDisplayed()
						&& sysatematicTransferPlanLabel.isDisplayed() && dynamicFundAlocationLabel.isDisplayed()
						&& chooseYourFundLabel.isDisplayed()) {

					System.out.println("All the feilds are present as per the product Max Life Platinum Wealth Plan");
				} else {
					Assert.fail("All the feilds are not present as per the product Max Life Platinum Wealth Plan");
				}
				break;

			case "Max Life Fast Track Super Plan":
				System.out.println("Max Life Whole Life Super");
				arrowDownFunctionToScrollDown();
				if (policyTerm.isDisplayed() && premiumCommitment.isDisplayed() && premiumPaymentTerm.isDisplayed()
						&& modeOfPayment.isDisplayed() && sysatematicTransferPlanLabel.isDisplayed()
						&& dynamicFundAlocationLabel.isDisplayed() && chooseYourFundLabel.isDisplayed()) {

					System.out.println("All the feilds are present as per the product Max Life Fast Track Super Plan");
				} else {
					Assert.fail("All the feilds are not present as per the product Max Life Fast Track Super Plan");
				}
				break;

			default:
				System.out.println("Max Life Shiksha Plus Super");
				arrowDownFunctionToScrollDown();
				if (premiumPaymentTerm.isDisplayed() && policyTerm.isDisplayed() && modeOfPayment.isDisplayed()
						&& premiumCommitment.isDisplayed() && sysatematicTransferPlanLabel.isDisplayed()
						&& dynamicFundAlocationLabel.isDisplayed() && chooseYourFundLabel.isDisplayed()
						&& childDateOfBirthLabel.isDisplayed()) {

					System.out.println("All the feilds are present as per the product Max Life Siksha Plus Super");
				} else {
					Assert.fail("All the feilds are not present as per the product Max Life Siksha Plus Super");
				}

			}
		}
	}

	public static void selectByDropdownNeedOfInsurance() throws Exception {
		waitTillElementToBeClickable(needOfInsurance);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		needOfInsurance.click();
		waitTillElementToBeClickable(needOfInsurance1stOption);
		needOfInsurance1stOption.click();

	}

	@Step("Getting the insurance option")
	public static void selectByDropdownNeedOfInsur() throws Exception {
		waitTillElementToBeClickable(needOfInsurance);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		needOfInsurance.click();
		waitTillElementToBeClickable(needOfInsurance1stOption);
		needOfInsurance1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownNeedOfInsurDependet() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(needOfInsurance);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		needOfInsurance.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(needOfInsurance1stOption);
		needOfInsurance1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownNeedOfInsurInsurersDetails() throws Exception {
		waitTillElementToBeClickable(needOfInsurance);
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		needOfInsurance.click();
		waitTillElementToBeClickable(needOfInsurance1stOption);
		needOfInsurance1stOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownLifeStage() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(lifeStageDropDown);

		lifeStageDropDown.click();
		waitTillElementToBeClickable(lifeStage1stOption);
		lifeStage1sttOption.click();

	}

	public static void selectByDropdownLifeStge() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// waitTillElementToBeClickable(lifeStageDropDown);
		lifeStageDropDown.click();
		// waitTillElementToBeClickable(lifeStage1stOption);
		lifeStage1sttOption.click();
		Thread.sleep(2000);

	}

	public static void selectByDropdownLifeStgeDependent() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(500);
		waitTillElementToBeClickable(lifeStageDropDown);
		lifeStageDropDown.click();
		Thread.sleep(500);
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

	public static void modeOfPaymentSTPSemiAnnual() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentSTP);
		modeOfPaymentSTP.click();
		waitTillElementToBeClickable(modeOfPaymentSemiAnnual);
		modeOfPaymentSemiAnnual.click();
		Thread.sleep(2000);

	}

	public static void modeOfPaymentSTPQuaterly() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentSTP);
		modeOfPaymentSTP.click();
		waitTillElementToBeClickable(modeOfPaymentQuaterly);
		modeOfPaymentQuaterly.click();
		Thread.sleep(2000);

	}

	public static void lifeStageEventBenefitNo() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(lifeStageEventBenefitNo);
		Thread.sleep(1000);
		lifeStageEventBenefitNo.click();

	}

	public static void premiumBackOptiontNo() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(premiumBackOptiontNo);
		Thread.sleep(1000);
		premiumBackOptiontNo.click();

	}

	public static void modeOfPaymentMIAP() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentMIAP);
		modeOfPaymentMIAP.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentSAP() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentSAPDropDown);
		modeOfPaymentSAPDropDown.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentWLS() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentWLS);
		modeOfPaymentWLS.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentSTPDependent() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentSTPDependent);
		modeOfPaymentSTPDependent.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentFTSP() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentFTSP);
		modeOfPaymentFTSP.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentSPSP() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentFTSP);
		modeOfPaymentFTSP.click();
		waitTillElementToBeClickable(modeOfPayment1stOption);
		modeOfPayment1stOption.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentLPPS() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentLLPP);
		modeOfPaymentLLPP.click();
		waitTillElementToBeClickable(modeOfPaymentAnnualLLPP);
		modeOfPaymentAnnualLLPP.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentSemiAnnualLPPS() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentLLPP);
		modeOfPaymentLLPP.click();
		waitTillElementToBeClickable(modeOfPaymentSemiAnnualLLPP);
		modeOfPaymentSemiAnnualLLPP.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentQuarterlyLPPS() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentLLPP);
		modeOfPaymentLLPP.click();
		waitTillElementToBeClickable(modeOfPaymentQuarterlyLLPP);
		modeOfPaymentQuarterlyLLPP.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentMonthlyLPPS() throws Exception {
		waitTillElementToBeClickable(modeOfPaymentLLPP);
		modeOfPaymentLLPP.click();
		waitTillElementToBeClickable(modeOfPaymentMonthlyLLPP);
		modeOfPaymentMonthlyLLPP.click();
		Thread.sleep(2000);
		ReusableActions.escapeFunction();
	}

	public static void modeOfPaymentSPSPSemiAnnual() throws Exception {
		Thread.sleep(400);
		waitTillElementToBeClickable(modeOfPaymentSPSP);
		modeOfPaymentSPSP.click();
		waitTillElementToBeClickable(valueSemiannualSPSP);
		valueSemiannualSPSP.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentSPSPQuarterly() throws Exception {
		Thread.sleep(400);
		waitTillElementToBeClickable(modeOfPaymentSPSP);
		modeOfPaymentSPSP.click();
		waitTillElementToBeClickable(valueQuartlySPSP);
		valueQuartlySPSP.click();
		Thread.sleep(2000);
	}

	public static void modeOfPaymentSPSPMonthly() throws Exception {
		Thread.sleep(400);
		waitTillElementToBeClickable(modeOfPaymentSPSP);
		modeOfPaymentSPSP.click();
		waitTillElementToBeClickable(valueMonthlySPSP);
		valueMonthlySPSP.click();
		Thread.sleep(700);
		escapeFunction();
		Thread.sleep(2000);
	}

	public static void dividendAdjustmentWLS() throws Exception {
		waitTillElementToBeClickable(dividentAdjustmentWLS);
		dividentAdjustmentWLS.click();
		waitTillElementToBeClickable(dividentOption1stOption);
		dividentOption1stOption.click();
		Thread.sleep(2000);
	}

	public static void dividentOptionMIAP() throws Exception {
		waitTillElementToBeClickable(dividendOptionWLSDropDown);
		dividendOptionWLSDropDown.click();
		waitTillElementToBeClickable(divident1stOption);
		divident1stOption.click();
		Thread.sleep(1000);

	}

	public static void dividentOptionSAPDependent() throws Exception {
		waitTillElementToBeClickable(dividentOption);
		dividentOption.click();
		waitTillElementToBeClickable(divident1stOption);
		divident1stOption.click();
		Thread.sleep(1000);

	}

	public static void dividentOptionWLS() throws Exception {
		waitTillElementToBeClickable(dividendOptionWLSDropDown);
		dividendOptionWLSDropDown.click();
		waitTillElementToBeClickable(divident1stOption);
		divident1stOption.click();
		Thread.sleep(1000);

	}

	public static void dividentOptionLPPS() throws Exception {
		waitTillElementToBeClickable(dividendOptionLPPSDropDown);
		dividendOptionLPPSDropDown.click();
		waitTillElementToBeClickable(dividentCashLPPS);
		dividentCashLPPS.click();
		Thread.sleep(1000);
	}

	public static void dividentOption_PUA_LPPS() throws Exception {
		waitTillElementToBeClickable(dividendOptionLPPSDropDown);
		dividendOptionLPPSDropDown.click();
		waitTillElementToBeClickable(dividentPUALPPS);
		dividentPUALPPS.click();
		Thread.sleep(1000);

	}

	public static void dividentOption_PremiumOffset_LPPS() throws Exception {
		waitTillElementToBeClickable(dividendOptionLPPSDropDown);
		dividendOptionLPPSDropDown.click();
		waitTillElementToBeClickable(dividentPremiumOffsetLPPS);
		dividentPremiumOffsetLPPS.click();
		Thread.sleep(1000);

	}

	public static void arrowDown() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();

	}

	public static void riderDetailsWOPLPPS() throws Exception {
		WOPPlusRiderCheckBoxLPPS.click();
		Thread.sleep(1000);
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();

		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

		}
	}

	public static void riderDetailsAccidentalLPPS() throws Exception {
		accidentalDeathCheckBoxLPPS.click();
		Thread.sleep(1000);
		ammountLabelRiderDetails();
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(7000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();

		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

		}
	}

	public static void riderDetailsAccidentalTermPlusWOP() throws Exception {
		/* Accidental */
		accidentalDeathCheckBoxLPPS.click();
		Thread.sleep(1000);
		ammountLabelRiderDetails();
		/* Term Plus Rider Amount */
		termPlusRiderCheckBoxLPPS.click();
		Thread.sleep(1000);
		ammountTermRiderDetails();
		riderTermdropDownLPPS.click();
		Thread.sleep(1000);
		riderTermdropDownValueLPPS.click();
		Thread.sleep(1000);
		/* WOP */
		WOPPlusRiderCheckBoxLPPS.click();
		Thread.sleep(1000);
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();

		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

		}
	}

	public static void riderDetailsLPPSTermPlusRider() throws Exception {
		termPlusRiderCheckBoxLPPS.click();
		Thread.sleep(1000);
		ammountTermRiderDetails();
		riderTermdropDownLPPS.click();
		Thread.sleep(1000);
		riderTermdropDownValueLPPS.click();
		Thread.sleep(1000);
		JourneyScreenOne.clickProceed();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();

		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

		}
	}

	public static void ammountLabelRiderDetails() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		String premiumCommitmentFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 1, 11);
		ammountLabelRiderDetailsLPPS.clear();
		ammountLabelRiderDetailsLPPS.sendKeys(premiumCommitmentFromExcell);
	}

	public static void ammountTermRiderDetails() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		String premiumCommitmentFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 1, 11);
		ammountLabelTermRiderDetailsLPPS.clear();
		ammountLabelTermRiderDetailsLPPS.sendKeys(premiumCommitmentFromExcell);
	}

	/*
	 * public static void ammountLabelRiderDetails() throws Exception {
	 *
	 * setAmmountRiderDetails(1, 1, 11); Thread.sleep(1000);
	 *
	 * }
	 */
	public static void setAmmountRiderDetails(int x, int y, int z) throws Exception {

		// type(PreIssuancetxtfld, strPreIssuance);
		ammountLabelRiderDetailsLPPS.clear();
		type(ammountLabelRiderDetailsLPPS, readingdata(x, y, z));

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
		waitTillElementToBeClickable(dropDownMaturityAge);
		dropDownMaturityAge.click();
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
		waitTillElementToBeClickable(drpDownSumAssuredAvailableInsurersDetails);
		drpDownSumAssuredAvailableInsurersDetails.click();
		waitTillElementToBeClickable(sumAssuredAvailableOption);
		sumAssuredAvailableOption.click();

	}

	public static void selectByDrpdownSumAssuredAvailable() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(drpDownSumAssuredAvailableInsurersDetails);
		drpDownSumAssuredAvailableInsurersDetails.click();
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

	// Enter First Name
	@Step("Getting First Name")
	public static void setFirstName(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		firtsName.clear();
		ReusableActions.waitTillElementLocated(firtsName);
		type(firtsName, readingdata(x, y, z));
		String firstNamePassedFromExcel = firtsName.getAttribute("value");
		int size = firstNamePassedFromExcel.length();
		if (size == 50 && !firstNamePassedFromExcel.contains("@") && !firstNamePassedFromExcel.contains("1")) {
			logger.info("Test case pass:- As first name feild length is 50 and accepting only alphabets");
		} else {
			Assert.fail(
					"Test case fail:- As either first name feild length is not of 50 or not accepting only alphabets");
		}

	}

	public static void setFirstNamePAN(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		firtsName.clear();
		type(firtsName, readingdata(x, y, z));

	}

	public static void proofType() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		Thread.sleep(800);
		communicationProofTypeDropDown.click();
		Thread.sleep(800);
		String xpathOfTexOnTheScreen = "//div[@id='menu-communicationProofType']/div/ul/li";
		List<String> expectedResult = fetchingdataFromExcelExpectedResult(8, 11);
		List<String> actualResultText = fetchingdataFromUI(xpathOfTexOnTheScreen);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);
		communicationProofType1stOption.click();
	}

	// -------------------------------------------------------------------------------------------------------
	@Step("Getting Date of Birth")
	public static void setDateBirthPersonalDetails() throws Exception {
		/*
		 * PageFactory.initElements(driver, JourneyScreenTwo.class);
		 * dateOfBirthPersonalDetails.clear(); type(dateOfBirthPersonalDetails,
		 * readingdata(x, y, z));
		 */

		Thread.sleep(800);
		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();

		JourneyScreenThree.dateOfBirthSelctionFunction();

	}

	public static void setDateBirthPANValidation() throws Exception {

		Thread.sleep(800);
		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();

		JourneyScreenThree.dateOfBirthSelctionFunctionPAN();

	}

	public static void setDateBirthPersonalDetailsScreenFour() throws Exception {
		Thread.sleep(800);
		waitTillElementToBeClickable(panApplicationDate);
		panApplicationDate.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();

		JourneyScreenThree.dateOfBirthSelctionFunction();
	}

	public static void femaleClick() throws Exception {

		genderFemale.click();
	}

	public static void getAllTextBoxVaueAndDropDownAndComparingWithExpectedScreenTwo() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Product   Details')]")).click();
		Thread.sleep(1000);
		String xpathOfTexOnTheScreen = "//input[contains(@type,'text')]";
		List<String> actualResultText = fetchingdataFromUI(xpathOfTexOnTheScreen);
		System.out.println("actual result" + actualResultText);
		List<String> expectedResult = fetchingdataFromExcelExpectedResult(0, 14);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);

		String permanentProofType = driver.findElement(By.id("permanentProofType")).getAttribute("value");
		String needOfInsurance = driver.findElement(By.id("needOfInsurance")).getAttribute("value");
		String lifeStage = driver.findElement(By.id("lifeStage")).getAttribute("value");
		String productName = driver.findElement(By.id("productName")).getAttribute("value");
		String premiumType = driver.findElement(By.id("premiumType")).getAttribute("value");
		String premiumPaymentTerm = driver.findElement(By.id("premiumPaymentTerm")).getAttribute("value");
		String policyTerm = driver.findElement(By.id("policyTerm")).getAttribute("value");
		String modeOfPayment = driver.findElement(By.id("modeOfPayment")).getAttribute("value");
		String dividendOption = driver.findElement(By.id("dividendOption")).getAttribute("value");

		List<String> actualResultDropDownList = new ArrayList<String>();
		actualResultDropDownList.add(permanentProofType);
		actualResultDropDownList.add(needOfInsurance);
		actualResultDropDownList.add(lifeStage);
		actualResultDropDownList.add(productName);
		actualResultDropDownList.add(premiumType);
		actualResultDropDownList.add(premiumPaymentTerm);
		actualResultDropDownList.add(policyTerm);
		actualResultDropDownList.add(modeOfPayment);
		actualResultDropDownList.add(dividendOption);
		System.out.println("expected result" + actualResultDropDownList);
		fetchingdataFromExcelExpectedResult(1, 10);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);

		String xpathOfRadioOnTheScreen = "//input[@checked=\"\"]";
		List<String> actualResultRadioButtonValue = fetchingdataFromUI(xpathOfRadioOnTheScreen);
		List<String> expectedResultRadioButtonValue = fetchingdataFromExcelExpectedResult(5, 6);
		System.out.println("Expected radio button" + actualResultRadioButtonValue);
		System.out.println("Actual radio button" + expectedResultRadioButtonValue);
		actualResultRadioButtonValue.removeAll(Arrays.asList("", null));
		System.out.println("actualResultRadioButtonValue" + actualResultRadioButtonValue);
		comparisonOfListForExpectedAndActualResult(expectedResultRadioButtonValue, actualResultRadioButtonValue);

	}

	public static void getAllDropDownValueSAPScreenTwo() throws Exception {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Product   Details')]")).click();
		Thread.sleep(1000);
		String xpathOfTexOnTheScreen = "//input[contains(@type,'text')]";
		List<String> actualResultText = fetchingdataFromUI(xpathOfTexOnTheScreen);
		System.out.println("actual result" + actualResultText);
		List<String> expectedResult = fetchingdataFromExcelExpectedResult(0, 14);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);
		String permanentProofType = driver.findElement(By.id("permanentProofType")).getAttribute("value");
		String needOfInsurance = driver.findElement(By.id("needOfInsurance")).getAttribute("value");
		String lifeStage = driver.findElement(By.id("lifeStage")).getAttribute("value");
		String productName = driver.findElement(By.id("productName")).getAttribute("value");
		String premiumPaymentTerm = driver.findElement(By.id("premiumPaymentTerm")).getAttribute("value");
		String policyTerm = driver.findElement(By.id("policyTerm")).getAttribute("value");
		String sumAssuredOption = driver.findElement(By.id("sumAssuredOption")).getAttribute("value");
		String dividendAdjustment = driver.findElement(By.id("dividendAdjustment")).getAttribute("value");
		String modeOfPayment = driver.findElement(By.id("modeOfPayment")).getAttribute("value");

		List<String> actualResultDropDownList = new ArrayList<String>();
		actualResultDropDownList.add(permanentProofType);
		actualResultDropDownList.add(needOfInsurance);
		actualResultDropDownList.add(lifeStage);
		actualResultDropDownList.add(productName);
		actualResultDropDownList.add(premiumPaymentTerm);
		actualResultDropDownList.add(policyTerm);
		actualResultDropDownList.add(modeOfPayment);
		actualResultDropDownList.add(sumAssuredOption);
		actualResultDropDownList.add(dividendAdjustment);
		System.out.println("expected result" + actualResultDropDownList);
		fetchingdataFromExcelExpectedResult(1, 10);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);

		String xpathOfRadioOnTheScreen = "//input[@checked=\"\"]";
		List<String> actualResultRadioButtonValue = fetchingdataFromUI(xpathOfRadioOnTheScreen);
		List<String> expectedResultRadioButtonValue = fetchingdataFromExcelExpectedResult(11, 8);
		System.out.println("Expected radio button" + actualResultRadioButtonValue);
		System.out.println("Actual radio button" + expectedResultRadioButtonValue);
		actualResultRadioButtonValue.removeAll(Arrays.asList("", null));
		System.out.println("actualResultRadioButtonValue" + actualResultRadioButtonValue);
		comparisonOfListForExpectedAndActualResult(expectedResultRadioButtonValue, actualResultRadioButtonValue);

	}

	public static void getAllDropDownValueMIAPScreenTwo() throws Exception {

		driver.findElement(By.xpath("//span[contains(text(),'Product   Details')]")).click();
		Thread.sleep(1000);
		String xpathOfTexOnTheScreen = "//input[contains(@type,'text')]";
		List<String> actualResultText = fetchingdataFromUI(xpathOfTexOnTheScreen);
		System.out.println("actual result" + actualResultText);
		List<String> expectedResult = fetchingdataFromExcelExpectedResult(0, 14);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);

		String permanentProofType = driver.findElement(By.id("permanentProofType")).getAttribute("value");
		String needOfInsurance = driver.findElement(By.id("needOfInsurance")).getAttribute("value");
		String lifeStage = driver.findElement(By.id("lifeStage")).getAttribute("value");
		String productName = driver.findElement(By.id("productName")).getAttribute("value");
		String premiumPaymentTerm = driver.findElement(By.id("premiumPaymentTerm")).getAttribute("value");
		String policyTerm = driver.findElement(By.id("policyTerm")).getAttribute("value");
		String modeOfPayment = driver.findElement(By.id("modeOfPayment")).getAttribute("value");
		String dividendOption = driver.findElement(By.id("dividendOption")).getAttribute("value");

		List<String> actualResultDropDownList = new ArrayList<String>();
		actualResultDropDownList.add(permanentProofType);
		actualResultDropDownList.add(needOfInsurance);
		actualResultDropDownList.add(lifeStage);
		actualResultDropDownList.add(productName);
		actualResultDropDownList.add(premiumPaymentTerm);
		actualResultDropDownList.add(policyTerm);
		actualResultDropDownList.add(modeOfPayment);
		actualResultDropDownList.add(dividendOption);

		System.out.println("actual result" + actualResultDropDownList);
		List<String> expectedResultDropDowFromExcel = fetchingdataFromExcelExpectedResult(12, 10);
		comparisonOfListForExpectedAndActualResult(expectedResultDropDowFromExcel, actualResultDropDownList);

		String xpathOfRadioOnTheScreen = "//input[@checked=\"\"]";
		List<String> actualResultRadioButtonValue = fetchingdataFromUI(xpathOfRadioOnTheScreen);
		List<String> expectedResultRadioButtonValue = fetchingdataFromExcelExpectedResult(13, 7);
		System.out.println("Expected radio button" + expectedResultRadioButtonValue);
		actualResultRadioButtonValue.removeAll(Arrays.asList("", null));
		System.out.println("actualResultRadioButtonValue" + actualResultRadioButtonValue);
		comparisonOfListForExpectedAndActualResult(expectedResultRadioButtonValue, actualResultRadioButtonValue);

	}

	public static void getAllDropDownValueWLSScreenTwo() throws Exception {

		driver.findElement(By.xpath("//span[contains(text(),'Product   Details')]")).click();
		Thread.sleep(1000);
		String xpathOfTexOnTheScreen = "//input[contains(@type,'text')]";
		List<String> actualResultText = fetchingdataFromUI(xpathOfTexOnTheScreen);
		System.out.println("actual result" + actualResultText);
		List<String> expectedResult = fetchingdataFromExcelExpectedResult(0, 14);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);

		String permanentProofType = driver.findElement(By.id("permanentProofType")).getAttribute("value");
		String needOfInsurance = driver.findElement(By.id("needOfInsurance")).getAttribute("value");
		String lifeStage = driver.findElement(By.id("lifeStage")).getAttribute("value");
		String productName = driver.findElement(By.id("productName")).getAttribute("value");
		String premiumPaymentTerm = driver.findElement(By.id("premiumPaymentTerm")).getAttribute("value");
		String policyTerm = driver.findElement(By.id("policyTerm")).getAttribute("value");
		String modeOfPayment = driver.findElement(By.id("modeOfPayment")).getAttribute("value");
		String dividendOption = driver.findElement(By.id("dividendOption")).getAttribute("value");
		String dividendAdjustment = driver.findElement(By.id("dividendAdjustment")).getAttribute("value");

		List<String> actualResultDropDownList = new ArrayList<String>();
		actualResultDropDownList.add(permanentProofType);
		actualResultDropDownList.add(needOfInsurance);
		actualResultDropDownList.add(lifeStage);
		actualResultDropDownList.add(productName);
		actualResultDropDownList.add(premiumPaymentTerm);
		actualResultDropDownList.add(policyTerm);
		actualResultDropDownList.add(modeOfPayment);
		actualResultDropDownList.add(dividendOption);
		actualResultDropDownList.add(dividendAdjustment);

		System.out.println("actual result" + actualResultDropDownList);
		List<String> expectedResultDropDowFromExcel = fetchingdataFromExcelExpectedResult(14, 11);
		comparisonOfListForExpectedAndActualResult(expectedResultDropDowFromExcel, actualResultDropDownList);

		String xpathOfRadioOnTheScreen = "//input[@checked=\"\"]";
		List<String> actualResultRadioButtonValue = fetchingdataFromUI(xpathOfRadioOnTheScreen);
		List<String> expectedResultRadioButtonValue = fetchingdataFromExcelExpectedResult(15, 8);
		actualResultRadioButtonValue.removeAll(Arrays.asList("", null));
		System.out.println("Expected radio button" + expectedResultRadioButtonValue);
		System.out.println("actualResultRadioButtonValue" + actualResultRadioButtonValue);
		comparisonOfListForExpectedAndActualResult(expectedResultRadioButtonValue, actualResultRadioButtonValue);

	}

	public static void getAllDropDownValueFTSPcreenTwo() throws Exception {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Product   Details')]")).click();
		Thread.sleep(1000);
		String xpathOfTexOnTheScreen = "//input[contains(@type,'text')]";
		List<String> actualResultText = fetchingdataFromUI(xpathOfTexOnTheScreen);
		System.out.println("actual result" + actualResultText);
		List<String> expectedResult = fetchingdataFromExcelExpectedResult(16, 19);
		System.out.println("================" + expectedResult);
		comparisonOfListForExpectedAndActualResult(expectedResult, actualResultText);

		String permanentProofType = driver.findElement(By.id("permanentProofType")).getAttribute("value");
		String needOfInsurance = driver.findElement(By.id("needOfInsurance")).getAttribute("value");
		String lifeStage = driver.findElement(By.id("lifeStage")).getAttribute("value");
		String productName = driver.findElement(By.id("productName")).getAttribute("value");
		String premiumPaymentTerm = driver.findElement(By.id("premiumPaymentTerm")).getAttribute("value");
		String policyTerm = driver.findElement(By.id("policyTerm")).getAttribute("value");
		String modeOfPayment = driver.findElement(By.id("modeOfPayment")).getAttribute("value");

		List<String> actualResultDropDownList = new ArrayList<String>();
		actualResultDropDownList.add(permanentProofType);
		actualResultDropDownList.add(needOfInsurance);
		actualResultDropDownList.add(lifeStage);
		actualResultDropDownList.add(productName);
		actualResultDropDownList.add(premiumPaymentTerm);
		actualResultDropDownList.add(policyTerm);
		actualResultDropDownList.add(modeOfPayment);

		System.out.println("actual result" + actualResultDropDownList);
		List<String> expectedResultDropDowFromExcel = fetchingdataFromExcelExpectedResult(17, 8);
		System.out.println("+++++++++++++++++++++" + expectedResultDropDowFromExcel);
		comparisonOfListForExpectedAndActualResult(expectedResultDropDowFromExcel, actualResultDropDownList);

		String xpathOfRadioOnTheScreen = "//input[@checked=\"\"]";
		List<String> actualResultRadioButtonValue = fetchingdataFromUI(xpathOfRadioOnTheScreen);
		List<String> expectedResultRadioButtonValue = fetchingdataFromExcelExpectedResult(18, 5);
		actualResultRadioButtonValue.removeAll(Arrays.asList("", null, "yes", "no"));
		System.out.println("Expected radio button" + expectedResultRadioButtonValue);
		System.out.println("actualResultRadioButtonValue" + actualResultRadioButtonValue);
		comparisonOfListForExpectedAndActualResult(expectedResultRadioButtonValue, actualResultRadioButtonValue);

	}

	public static void setDateBirthNomineeDetails() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		outsideClick.click();
		Thread.sleep(200);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		System.out.println("I am down");
		waitTillElementToBeClickable(dateOfBirthNomineeDetails);
		dateOfBirthNomineeDetails.click();
		JourneyScreenThree.dateOfBirthSelctionFunction();

	}

	// Enter Last Name
	@Step("Getting Last Name")
	public static void setLastName(int x, int y, int z) throws Exception {
		lastName.clear();
		type(lastName, readingdata(x, y, z));
		String lastNamePassedFromExcel = lastName.getAttribute("value");
		int size = lastNamePassedFromExcel.length();
		if (size == 25 && !lastNamePassedFromExcel.contains("@") && !lastNamePassedFromExcel.contains("1")) {
			logger.info("Test case pass:- As last name feild length is 25 and accepting only alphabets");
		} else {
			Assert.fail(
					"Test case fail:- As either last name feild length is not of 25 or not accepting only alphabets");
		}

	}

	public static void setLastNamePAN(int x, int y, int z) throws Exception {
		lastName.clear();
		type(lastName, readingdata(x, y, z));

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
	@Step("Getting house Number")
	public static void setHouseNo(int x, int y, int z) throws Exception {
		houseNo.clear();
		type(houseNo, readingdata(x, y, z));
		String houseNoDataFromExcel = houseNo.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		if (size == 60 && houseNoDataFromExcel.contains("1") && !houseNoDataFromExcel.contains("!")) {
			logger.info(
					"Test case pass:- As house number feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either house number feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	public static void houseNoProposerCommunication(int x, int y, int z) throws Exception {
		houseNoProposerCommunication.clear();
		// arrowDownFunctionToScrollDown();
		// Thread.sleep(3000);
		type(houseNoProposerCommunication, readingdata(x, y, z));
		String houseNoDataFromExcel = houseNoProposerCommunication.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		System.out.println(size);
		if (size == 60 && houseNoDataFromExcel.contains("1") && houseNoDataFromExcel.contains("!")) {
			logger.info(
					"Test case pass:- As house number feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either house number feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	// Enter Road number
	@Step("Getting Road Number")
	public static void setRoadNo(int x, int y, int z) throws Exception {
		roadNo.clear();
		type(roadNo, readingdata(x, y, z));
		String houseNoDataFromExcel = roadNo.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		if (size == 60 && houseNoDataFromExcel.contains("1") && !houseNoDataFromExcel.contains("!")) {
			logger.info(
					"Test case pass:- As Road number feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either Road number feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	public static void communicationRoadNo(int x, int y, int z) throws Exception {
		communicationRoadNo.clear();
		type(communicationRoadNo, readingdata(x, y, z));
		String houseNoDataFromExcel = communicationRoadNo.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		if (size == 60 && houseNoDataFromExcel.contains("1") && !houseNoDataFromExcel.contains("!")) {
			logger.info(
					"Test case pass:- As Road number feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either Road number feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	// Enter Village Town
	@Step("Getting Vilage Town")
	public static void setVillageTown(int x, int y, int z) throws Exception {

		villageTown.clear();
		type(villageTown, readingdata(x, y, z));
		String houseNoDataFromExcel = villageTown.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		if (size == 60 && houseNoDataFromExcel.contains("1") && !houseNoDataFromExcel.contains("!")) {
			logger.info(
					"Test case pass:- As village town feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either village town feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	public static void communicationVillageTown(int x, int y, int z) throws Exception {

		communicationVillageTown.clear();
		type(communicationVillageTown, readingdata(x, y, z));
		String houseNoDataFromExcel = communicationVillageTown.getAttribute("value");
		int size = houseNoDataFromExcel.length();
		if (size == 60 && houseNoDataFromExcel.contains("1") && !houseNoDataFromExcel.contains("!")) {
			logger.info(
					"Test case pass:- As village town feild length is 60 and accepting alphanumeric and special character ");
		} else {
			Assert.fail(
					"Test case fail:- As either village town feild length is not of 60 or not accepting alphanumeric or special character ");
		}

	}

	// Enter Country
	public static void countryCommunication(int x, int y, int z) throws Exception {
		Thread.sleep(400);
		System.out.println("111111111111111111111111");
		System.out.println(countryCommunication.isDisplayed());
		countryCommunication.clear();
		type(countryCommunication, readingdata(x, y, z));
		String countryDataFromExcel = countryCommunication.getAttribute("value");// I
		String dropDownValue = communicationCountry1stOption.getText();
		System.out.println(dropDownValue);
		if (dropDownValue.startsWith(countryDataFromExcel)) {
			System.out.println("Test Case pass:-As smart search for country is working properly");
		} else {
			Assert.fail("Test case fail:-As smart search for country is not woring properly");
		}
		communicationCountry1stOption();
		Thread.sleep(500);
		if (errorMsgWhenSameCountryIsSelectedForPermanentAndCommunication.isDisplayed()) {
			System.out.println(
					"Test case pass:As error message is displaying when same country is selected for permanent and communication");
		} else {
			Assert.fail(
					"Test case fail:As error message is not displaying when same country is selected for permanent and communication");
		}

	}

	public static void countryCommunicationIndonasia(int x, int y, int z) throws Exception {
		countryCommunication.clear();
		type(countryCommunication, readingdata(x, y, z));
		String countryDataFromExcel = countryCommunication.getAttribute("value");// I
		String dropDownValue = communicationCountry2ndOption.getText();
		System.out.println(dropDownValue);
		if (dropDownValue.startsWith(countryDataFromExcel)) {
			System.out.println("Test Case pass:-As smart search for country is working properly");
		} else {
			Assert.fail("Test case fail:-As smart search for country is not woring properly");
		}
		communicationCountry2ndOption.click();
		Thread.sleep(500);
		if (isElementDisplayed(errorMsgWhenSameCountryIsSelectedForPermanentAndCommunication)) {
			Assert.fail(
					"Test case fail:As error message is not displaying when same country is selected for permanent and communication");

		} else {
			System.out.println(
					"Test case pass:As error message is displaying when same country is selected for permanent and communication");
		}

	}

	@Step("Getting country Name")
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

	public static void setCountryAndSelecting2ndOption(int x, int y, int z) throws Exception {
		country.clear();
		type(country, readingdata(x, y, z));
		country2ndOption.click();
		if (isElementDisplayed(errorMsgOutsideIndiaAdd)) {
			Assert.fail("Test case fail:As the error message is still displayed on the page after selecting no option");
		} else {
			System.out.println("Test case pass:As the pass message is not visible after selecting no option");
		}
		permanentReflexiveNoOption.click();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		if (communicationAddressid.isDisplayed()) {
			System.out.println("Test case pass:As Proposer communication Address is present");

		} else {
			Assert.fail("Test case fail:As Proposer communication address is not present");

		}

	}

	public static void fillingAllTheFeildsAfterChangingCountry() throws Exception {
		JourneyScreenFour.arrowUpFunctionToScrollUpTillTop();
		JourneyScreenTwo.setCountry(3, 1, 6);
		JourneyScreenTwo.setState(3, 1, 7);
		JourneyScreenTwo.setCity(3, 1, 8);
		JourneyScreenTwo.setPinCode(3, 1, 9);
		JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
		permanentReflexiveNoOption.click();
		// JourneyScreenFour.arrowDownFunctionToScrollDown();
		if (communicationAddressid.isDisplayed()) {
			System.out.println("Test case pass:As Proposer communication Address is present");

		} else {
			Assert.fail("Test case fail:As Proposer communication address is not present");

		}
	}

	// Enter State
	@Step("Getting the state")
	public static void setState(int x, int y, int z) throws Exception {
		Thread.sleep(500);
		searchState.click();
		searchState.clear();
		searchState.sendKeys(readingdata(x, y, z));
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		// searchState.sendKeys(readingdata(x, y, z));
		// type(searchState, readingdata(x, y, z));
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		// searchState.click();

		searchState.sendKeys(Keys.BACK_SPACE);
		String countryDataFromExcel = searchState.getAttribute("value");
		String dropDownValue = state1stOption.getText();
		System.out.println(dropDownValue);
		if (dropDownValue.startsWith(countryDataFromExcel)) {
			System.out.println("Test Case pass:-As smart search for state is working properly");
		} else {
			Assert.fail("Test case fail:-As smart search for state is not woring properly");
		}
		Thread.sleep(1000);
		state1stOption();
	}

	public static void communicationStateCommunication(int x, int y, int z) throws Exception {
		Thread.sleep(500);
		// communicationStateCommunication.click();
		communicationStateCommunication.clear();
		type(communicationStateCommunication, readingdata(x, y, z));

		// communicationStateCommunication.sendKeys(readingdata(x, y, z));
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		// searchState.sendKeys(readingdata(x, y, z));
		// type(searchState, readingdata(x, y, z));
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		// searchState.click();

		/*
		 * communicationStateCommunication.sendKeys(Keys.BACK_SPACE); String
		 * countryDataFromExcel =
		 * communicationStateCommunication.getAttribute("value");// T String
		 * dropDownValue = state1stOption.getText();
		 * System.out.println(dropDownValue); if
		 * (dropDownValue.startsWith(countryDataFromExcel)) { System.out.
		 * println(
		 * "Test Case pass:-As smart search for state is working properly"); }
		 * else { Assert. fail(
		 * "Test case fail:-As smart search for state is not woring properly");
		 * } Thread.sleep(1000); state1stOption();
		 */
	}

	// Enter City
	@Step("Getting the city")
	public static void setCity(int x, int y, int z) throws Exception {
		searchCity.clear();
		type(searchCity, readingdata(x, y, z));
		String countryDataFromExcel = searchCity.getAttribute("value");// A
		String dropDownValue = city1stOption.getText();
		if (dropDownValue.startsWith(countryDataFromExcel)) {
			System.out.println("Test Case pass:-As smart search for city is working properly");
		} else {
			Assert.fail("Test case fail:-As smart search for city is not woring properly");
		}
		city1stOption();
	}

	public static void searchCityComunication(int x, int y, int z) throws Exception {
		searchCityComunication.clear();
		type(searchCityComunication, readingdata(x, y, z));
		/*
		 * String countryDataFromExcel =
		 * searchCityComunication.getAttribute("value");// A String
		 * dropDownValue = city1stOption.getText(); if
		 * (dropDownValue.startsWith(countryDataFromExcel)) { System.out.
		 * println(
		 * "Test Case pass:-As smart search for city is working properly"); }
		 * else { Assert.fail(
		 * "Test case fail:-As smart search for city is not woring properly" );
		 * } city1stOption();
		 */
	}

	// Enter PinCode
	@Step("Getting the pincode")
	public static void setPinCode(int x, int y, int z) throws Exception {
		pinCode.clear();
		type(pinCode, readingdata(x, y, z));
		String pinCodeDataFromExcel = pinCode.getAttribute("value");
		int size = pinCodeDataFromExcel.length();
		if (size == 6 && !pinCodeDataFromExcel.contains("@") && !pinCodeDataFromExcel.contains("A")) {
			logger.info("Test case pass:- As Pin code feild length is 6 and accepting numeric only");
		} else {
			Assert.fail("Test case fail:- As either Pin code feild length is not of 6 or not accepting numeric only");
		}

	}

	public static void setPinCodecommunication(int x, int y, int z) throws Exception {
		communicationPinCode.clear();
		type(communicationPinCode, readingdata(x, y, z));
		String pinCodeDataFromExcel = communicationPinCode.getAttribute("value");
		int size = pinCodeDataFromExcel.length();
		if (size == 6 && !pinCodeDataFromExcel.contains("@") && !pinCodeDataFromExcel.contains("A")) {
			logger.info("Test case pass:- As Pin code feild length is 6 and accepting numeric only");
		} else {
			logger.info("Test case fail:- As either Pin code feild length is not of 6 or not accepting numeric only");
		}
	}

	// Enter PinCode
	@Step("Getting the alternate mobile number")
	public static void setAlternateMobileNo(int x, int y, int z) throws Exception {
		alternateMobileNo.clear();
		type(alternateMobileNo, readingdata(x, y, z));
		String alternateMobileDataFromExcel = alternateMobileNo.getAttribute("value");
		int size = alternateMobileDataFromExcel.length();
		if (size == 10 && !alternateMobileDataFromExcel.contains("@") && !alternateMobileDataFromExcel.contains("A")) {
			logger.info("Test case pass:- As alternate mobile number feild length is 10 and accepting numeric only");
		} else {
			Assert.fail(
					"Test case fail:- As alternate mobile number feild length either is not of 10 or not accepting numeric only");
		}

	}

	public static void checkErrorMessageOfOutsideIndia() throws Exception {
		if (isElementDisplayed(errorMsgOutsideIndiaAdd)) {
			System.out.println("Test case pass:As error message is displaying");

			Thread.sleep(800);
			permanentReflexiveNoOption.click();
			if (isElementDisplayed(errorMsgOutsideIndiaAdd)) {
				Assert.fail(
						"Test case fail:As the error message is still displayed on the page after selecting no option");
			} else {
				System.out.println("Test case pass:As the error message is not visible after selecting no option");
				arrowDownFunctionToScrollDown();

				if (proposerCommunicationAddress.isDisplayed()) {
					System.out.println(
							"Test case pass:As proposer permanent address is displaying as per the requirement");
				} else {
					Assert.fail(
							"Test case pass:As proposer permanent address is not displaying as per the requirement");
				}

			}

		} else {
			Assert.fail("Test case fail:As the error message is not displayed when India option is selected");
		}
		permanentReflexiveYesOption.click();
	}

	public static void waitForNumberOfWindowsToEqual(final int numberOfWindows) {
		new WebDriverWait(driver, 20) {
		}.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return (driver.getWindowHandles().size() == numberOfWindows);
			}
		});
	}

	// Select PIO as an nationality
	public static void clickSubmitButton() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		click(proceedBtn);
		Thread.sleep(4000);
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
	 * "//*[@id='alert-dialog-description']/div/div/div/div/div/ul/li")); int i
	 * = listOfErrors.size(); System.out.println(i); for (int j = 1; j <= i;
	 * j++) { String errorMsg = driver .findElement(By.xpath(
	 * "//*[@id='alert-dialog-description']/div/div/div/div/div/ul/li[" + j +
	 * "]")) .getText(); System.out.println(errorMsg); return errorMsg; } return
	 * null;
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
		Thread.sleep(5000);
		/*
		 * waitTillElementToBeClickable(productDetails);
		 * System.out.println(driver.findElement(By.xpath(
		 * "//span[contains(text(),'Product   Details')]")).isEnabled());
		 * driver.findElement(By.xpath(
		 * "//span[contains(text(),'Product   Details')]")).click();
		 * Thread.sleep(1000);
		 */
	}

	public static void ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead() throws Exception {
		System.out.println("Test case pass:As PDF illustration is working");
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {
			String child_window = I1.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				// driver.close();

			}

		}
		driver.switchTo().window(parent);
		Thread.sleep(12000);
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
		Thread.sleep(12000);
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
		Thread.sleep(12000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustration();
		}

		else
			try {
				WebElement ele = driver
						.findElement(By.xpath("//h4[(text()=\"Illustration could not be generated.\")]"));
				if (isElementDisplayed(ele)) {
					// if(driver.findElement(By.xpath("//p[(text()=\"Illustration
					// could not be
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
	 * public static void excelReader() { String data; try { InputStream is =
	 * new FileInputStream(
	 * "C:\\Users\\sp104\\Desktop\\browserstack_max\\browserstack_max\\src\\test\\resources\\MasterData.xlsx"
	 * ); Workbook wb = (Workbook) WorkbookFactory.create(is); Sheet sheet =
	 * wb.getSheet(0); Iterator rowIter = ((XSSFSheet) sheet).rowIterator(); Row
	 * r = (Row)rowIter.next(); short lastCellNum = r.getLastCellNum(); int[]
	 * dataCount = new int[lastCellNum]; int col = 0; rowIter = ((XSSFSheet)
	 * sheet).rowIterator(); while(rowIter.hasNext()) { Iterator cellIter =
	 * ((Row)rowIter.next()).cellIterator(); while(cellIter.hasNext()) { Cell
	 * cell = (Cell)cellIter.next(); col = cell.getColumnIndex(); dataCount[col]
	 * += 1; DataFormatter df = new DataFormatter(); data =
	 * df.formatCellValue(cell); System.out.println("Data: " + data); } }
	 * is.close(); for(int x = 0; x < dataCount.length; x++) {
	 * System.out.println("col " + x + ": " + dataCount[x]); } } catch(Exception
	 * e) { e.printStackTrace(); return; } }
	 *
	 */

	public static ExpectedCondition<Boolean> waitForAjaCalls() {
		return new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return Boolean.valueOf(((JavascriptExecutor) driver)
						.executeScript(
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
		file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		fileInputStream = new FileInputStream(file);
		hssfWorkbook = new XSSFWorkbook(fileInputStream);
		sheet = hssfWorkbook.getSheetAt(sheetNo);
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
					// if(driver.findElement(By.xpath("//p[(text()=\"Illustration
					// could not be
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

	@Description("Verify the Insuresr MALE/FEMALE is selected by default")
	public static void checkAllTheInsurersDetailsFeildsPresentOrNot() throws Exception {
		Thread.sleep(500);
		if (insurersNameLabel.isDisplayed() && insurersGenderMale.isDisplayed() && insurersGenderFemale.isDisplayed()
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

	@Description("Verify the issurers name feild length ")
	public static void checkAndFillIssurersNameValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		insurersNameLabel.clear();
		type(insurersNameLabel, readingdata(x, y, z));
		String insurersNamePassedFromExcel = insurersNameLabel.getAttribute("value");
		int size = insurersNamePassedFromExcel.length();
		if (size == 75 && !insurersNamePassedFromExcel.contains("@") && insurersNamePassedFromExcel.contains(".")) {
			logger.info(
					"Test case pass:- As issurers name feild length is 25 and not accepting special character and numbers ");
		} else {
			Assert.fail(
					"Test case fail:- As issurers name feild length is either not of 25 or accepting special character or numbers");
		}

	}

	public static void fillingIssurersName(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		insurersNameLabel.clear();
		type(insurersNameLabel, readingdata(x, y, z));
	}

	public static void validatingErrorMsgForMIAP(XSSFSheet sheet, int rowNum) throws Exception {

		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell cellAnnualIncome = sheet.getRow(rowNum).getCell(14);
		String annualIncomelFromExcell = cellAnnualIncome.getStringCellValue();

		/*
		 * XSSFCell cellpremiumCommitment = sheet.getRow(rowNum).getCell(12);
		 * String premiumCommitmentFromExcell =
		 * cellpremiumCommitment.getStringCellValue();
		 *
		 * XSSFCell celldesiredAnnualIncome = sheet.getRow(rowNum).getCell(13);
		 * String desiredAnnualIncomeFromExcell =
		 * celldesiredAnnualIncome.getStringCellValue();
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
		Thread.sleep(4000);
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

	public static void fillingAllTheFeildForFTSP() throws Exception {

		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(8);

		// String premiumCommitmentFromExcell =
		// getColumnDataAsPerTheForLoopRow(sheet, 1, 6);
		String premiumCommitmentFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 1, 7);
		String growthSuperFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 0);

		String secureFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 1);

		String conservativeFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 2);

		String highGrowthFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 3);

		String balancedFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 4);

		String growthFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 5);

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

		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(4000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

		}
	}

	/* Method for Dynamic fund */
	public static void fillingAllTheFeildForSPSPDynamicFund() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(8);
		String premiumCommitmentSPSPFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 1, 7);
		premiumCommitmentSPSP.clear();
		premiumCommitmentSPSP.sendKeys(premiumCommitmentSPSPFromExcell);
		waitTillElementToBeClickable(premiumCommitmentSPSP);
		dynamicFundAllocationYes();
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(4000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for SPSP");

		}
	}

	/* systematic Transfer Plan Yes */
	public static void fillingAllTheFeildForSPSP() throws Exception {
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(8);
		String premiumCommitmentSPSPFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 1, 7);
		premiumCommitmentSPSP.clear();
		premiumCommitmentSPSP.sendKeys(premiumCommitmentSPSPFromExcell);
		waitTillElementToBeClickable(premiumCommitmentSPSP);
		systematicTransferPlanYes();
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(4000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for SPSP");

		}
	}

	/* choose Your Fund Yes */
	public static void fillingAllTheFeildForSPSPChooseYourFundYes() throws Exception {

		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(8);

		// String premiumCommitmentFromExcell =
		// getColumnDataAsPerTheForLoopRow(sheet, 1, 6);
		String premiumCommitmentFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 1, 7);
		String growthSuperFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 0);

		String secureFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 1);

		String conservativeFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 2);

		String highGrowthFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 3);

		String balancedFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 4);

		String growthFundFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 3, 5);

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

		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

		}
	}

	public static void fillingAllTheFeildForLPPS() throws Exception {

		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(8);
		String premiumCommitmentFromExcell = getColumnDataAsPerTheForLoopRow(sheet, 1, 7);
		premiumCommitment.clear();
		premiumCommitment.sendKeys(premiumCommitmentFromExcell);

	}

	public static void premiumCommitmentDesiredAnnualIncomeAnnualIncome(int x, int y, int z) throws Exception {

		annualIncome.clear();
		type(annualIncome, readingdata(x, y, z));

	}

	public static void premiumCommitmentWLS(int x, int y, int z) throws Exception {

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
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

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
		PageFactory.initElements(driver, JourneyScreenTwo.class);
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

		/* for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) { */
		/*
		 * for (int rowNum = 1; rowNum < 2; rowNum++) {
		 * validatingErrorMsgForSAP(sheet, rowNum); }
		 */
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
		Thread.sleep(4000);
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

		Savebtn.click();
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(4000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for SAP");

		}

	}

	public static void checkPOSVforSTPPremiumCommitment(int x, int y, int z) throws Exception {
		sumAssured.clear();
		type(sumAssured, readingdata(x, y, z));

		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(4000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

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

	public static void checkPOSVforWLSAnnualIncome(int x, int y, int z) throws Exception {
		Thread.sleep(300);
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

	public static void premiumCommitmentDependent(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		premiumCommitmentDependent.clear();
		type(premiumCommitmentDependent, readingdata(x, y, z));
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
		selectByDropdownLifeStgeDependent();
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
		WOPPlusRiderCheckBox();

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
		desiredAnnualIncomeYes.click();
		Thread.sleep(500);
	}

	public static void fillingAllTheRequiredFeildsForSTPDependent() throws Exception {
		selectByDropdownNeedOfInsurDependet();
		selectByDropdownLifeStgeDependent();

		premiumPayementTermSTPDependent();
		policyTermSTPDependent();

		sumAssuredOptionSTPDependent();
		sumAssured(3, 1, 11);
		nonSmoker.click();
		dividentAdjustmentSTPDependent();
		modeOfPaymentSTPDependent();
		// WOPPlusRiderCheckBox();
		Thread.sleep(500);
		// waitTillElementToBeClickable(POSVFlowForSAPMIAP.premiumCommitmentMIAPYesOptionSelection);
	}

	public static void fillingAllTheRequiredFeildsForWLS() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermSTP();
		policyTermWLS();
		dividendAdjustmentWLS();
		modeOfPaymentWLS();
		dividentOptionWLS();

	}

	public static void ifElseConditionSmartTermPlan() throws Exception {
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
			waitTillElementToBeClickableLongWait(productDetails);
			Thread.sleep(4000);

			productDetails.click();
			Thread.sleep(1000);

		} else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

		}

	}

	public static void arrowUpFunctionToScrollUpTillTop() throws Exception {
		Thread.sleep(400);
		for (int i = 1; i < 35; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_UP).build().perform();
		}
		Thread.sleep(400);
	}

	public static void checkErrorMessageForAgeMoreThan44SmartTermPlan() throws Exception {
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		if (isElementDisplayed(errorMessageWhenAgeLessThan18)) {
			System.out.println("Test case pass as error message is displaying when age is less than 18");

			escapeFunction();
			Thread.sleep(500);
			outsideClick.click();
			arrowUpFunctionToScrollUpTillTop();
			Thread.sleep(500);
			setDateBirthPayorDetailOf18Age();

			policyTermSTPDropDown();
			JourneyScreenTwo.clickSubmitButton();
			Thread.sleep(14000);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(tabs.size());
			if (tabs.size() == 2) {
				ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
				Thread.sleep(1000);
				productDetails.click();
				Thread.sleep(1000);

			}

			else {
				Assert.fail("Either PDF is not generating or Loading time is too much for STP");

			}

		} else {
			Assert.fail("Test case fail as error message is not displaying when age is less than 18");

		}

	}

	public static void checkErrorMessageForAgeLessThan18SmartTermPlan() throws Exception {
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(14000);
		if (isElementDisplayed(errorMessageWhenAgeLessThan18)) {
			System.out.println("Test case pass as error message is displaying when age is less than 18");

			escapeFunction();
			Thread.sleep(500);
			outsideClick.click();
			arrowUpFunctionToScrollUpTillTop();
			Thread.sleep(500);
			setDateBirthPayorDetailOf18Age();

			policyTermSTPDropDown();
			JourneyScreenTwo.clickSubmitButton();
			Thread.sleep(14000);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(tabs.size());
			if (tabs.size() == 2) {
				ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
				Thread.sleep(1000);
				productDetails.click();
				Thread.sleep(1000);

			}

			else {
				Assert.fail("Either PDF is not generating or Loading time is too much for STP");

			}

		} else {
			Assert.fail("Test case fail as error message is not displaying when age is less than 18");

		}

	}

	public static void checkErrorMessageForAgeMoreThan60YearsSmartTermPlan() throws Exception {
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(4000);
		System.out.print(errorMessageWhenAgeMoreThan60.isDisplayed());

		if (isElementDisplayed(errorMessageWhenAgeMoreThan60)) {
			System.out.println("Test case pass as error message is displaying when age is more than 60");

			escapeFunction();
			Thread.sleep(500);
			outsideClick.click();
			arrowUpFunctionToScrollUpTillTop();
			Thread.sleep(500);
			setDateBirthPayorDetailOf60Age();
			Thread.sleep(500);
			policyTermSTPDropDown();
			JourneyScreenTwo.clickSubmitButton();
			Thread.sleep(4000);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(tabs.size());
			if (tabs.size() == 2) {
				ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
				Thread.sleep(1000);
				productDetails.click();
				Thread.sleep(1000);

			}

			else {
				Assert.fail("Either PDF is not generating or Loading time is too much for STP");

			}

		} else {
			Assert.fail("Test case fail as error message is not displaying when age is more than 60");

		}

	}

	public static void checkErrorMessageForAgeMoreThan44YearsSmartTermPlan() throws Exception {
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(4000);
		if (isElementDisplayed(maximumAgeLimit44ErrorMessage)) {
			System.out.println("Test case pass as error message is displaying when age is more than 44");

			escapeFunction();
			Thread.sleep(500);
			outsideClick.click();
			arrowUpFunctionToScrollUpTillTop();
			Thread.sleep(500);
			setDateBirthPayorDetailOf44Age();
			Thread.sleep(500);
			premiumPayementTermSTP();
			Thread.sleep(500);
			policyTermSTPDropDown();
			JourneyScreenTwo.clickSubmitButton();
			Thread.sleep(14000);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			System.out.println(tabs.size());
			if (tabs.size() == 2) {
				ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();
				Thread.sleep(1000);
				productDetails.click();
				Thread.sleep(1000);

			}

			else {
				Assert.fail("Either PDF is not generating or Loading time is too much for STP");

			}

		} else {
			Assert.fail("Test case fail as error message is not displaying when age is less than 18");

		}

	}

	public static void smartTermPlanPremiumType() throws Exception {

		for (int i = 1; i < 5; i++) {
			Thread.sleep(700);
			waitTillElementToBeClickable(premiumTypeSAPDropDown);
			premiumTypeSAPDropDown.click();
			waitTillElementToBeClickable(premiumType3rdOptionSAP);
			driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[" + i + "]")).click();
			Thread.sleep(1000);

			premiumPayementTermSTP();
			policyTermSTPDropDown();
			deathBenifitOption();
			sumAssured(3, 4, 11);
			nonSmoker();
			modeOfPaymentSTP();
			lifeStageEventBenefitNo();
			premiumBackOptiontNo();

			switch (i) {
			case 1:
				// WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 2:
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 3:
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 4:
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;
			}
		}

	}

	public static void smartTermPlanPremiumTypePDF() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);

		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();
		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void singlePayLifeCoverForm1() throws Exception {

		Thread.sleep(1000);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();

		sumAssured.sendKeys("5000000");
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(1000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void singlePayIncomeInflationProtectorForm1() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		dropDown15PolicyTerm();
		deathBenifitIncomeInflationProtector();
		enterMonthlyIncome(3, 3, 11);
		incomePeriod15();
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void singlePayIncreasingCoverProtectorForm1() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		dropDown15PolicyTerm();
		deathBenifitIncreasingCover();

		sumAssured(3, 1, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void limitedPayLifeCoverForm1() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		dropDown15PolicyTerm();
		deathBenifitOption();

		sumAssured(3, 1, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void limitedPayIncomeInflationProtectorForm1() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		dropDown15PolicyTerm();
		deathBenifitIncomeInflationProtector();

		enterMonthlyIncome(3, 3, 11);
		incomePeriod15();
		nonSmoker();
		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void limitedPayIncreasingCoverForm1() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		dropDown10PolicyTerm();
		deathBenifitIncreasingCover();

		sumAssured(3, 1, 11);
		nonSmoker();
		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void regularPayLifeCoverForm1() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		dropDown10PolicyTerm();
		deathBenifitOption();
		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void regularPayIncomeInflationForm1() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP30();
		policyTermSTPDropDown();
		deathBenifitIncomeInflationProtector();

		enterMonthlyIncome(3, 3, 11);
		incomePeriod15();
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		nonSmoker();
		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void regularPayIncreasingCoverForm1() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP50();
		policyTermSTPDropDown();
		deathBenifitIncreasingCover();

		sumAssured(3, 1, 11);
		nonSmoker();
		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void payTill60LifeCoverForm1() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();

		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void payTill60IncomeInflationProtectorForm1() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitIncomeInflationProtector();
		enterMonthlyIncome(3, 3, 11);
		incomePeriod15();

		nonSmoker();
		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void payTill60IncreasingCoverForm1() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitIncreasingCover();

		sumAssured(3, 1, 11);
		nonSmoker();
		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void singlePayIncomeProtectorForm2() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		dropDown10PolicyTerm();
		deathBenifitIncomeProtector();
		enterMonthlyIncome(3, 3, 11);
		incomePeriod();
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void singlePayIncomeInflationProtectorForm2() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();

		dropDown20PolicyTerm();

		deathBenifitIncomeInflationProtector();
		enterMonthlyIncome(3, 3, 11);
		incomePeriod20();
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void limitedPayIncomeProtectorForm2() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP10();

		dropDown20PolicyTerm();

		deathBenifitIncomeProtector();
		enterMonthlyIncome(3, 3, 11);
		incomePeriod();
		nonSmoker();

		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void limitedPayIncomeInflationProtectorForm2() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP12();

		dropDown20PolicyTerm();

		deathBenifitIncomeInflationProtector();
		enterMonthlyIncome(3, 3, 11);
		incomePeriod20();
		nonSmoker();

		modeOfPaymentSTPQuaterly();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void regularPayIncomeProtectorForm2() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP12();

		policyTermSTPDropDown();

		deathBenifitIncomeProtector();
		enterMonthlyIncome(3, 3, 11);
		incomePeriod20();
		nonSmoker();

		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void regularPayIncomeInflationProtectorForm2() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP35();

		policyTermSTPDropDown();

		deathBenifitIncomeInflationProtector();
		enterMonthlyIncome(3, 3, 11);
		incomePeriod20();
		nonSmoker();

		modeOfPaymentSTPQuaterly();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void payTill60IncomeProtectorForm2() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);

		premiumPayementTermSTP();

		policyTermSTPDropDown();

		deathBenifitIncomeProtector();

		enterMonthlyIncome(3, 3, 11);
		incomePeriod();
		nonSmoker();

		modeOfPaymentSTPSemiAnnual();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void payTill60IncomeInflationProtectorForm2() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);

		premiumPayementTermSTP();

		policyTermSTPDropDown();

		deathBenifitIncomeInflationProtector();

		enterMonthlyIncome(3, 3, 11);
		incomePeriod20();
		nonSmoker();

		modeOfPaymentSTPQuaterly();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		proceedBtn.click();
		Thread.sleep(40000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();

	}

	public static void smartTermPlanPremiumTypeIllustration() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);

		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();
		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		// WOPPlusRiderCheckBox();

	}

	public static void smartTermPlanLimitedTypeIllustration() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);

		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();
		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		// WOPPlusRiderCheckBox();

	}

	public static void smartTermPlanRegularPayIllustration() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);

		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();
		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		// WOPPlusRiderCheckBox();

	}

	public static void smartTermPlanPremiumTypeIllustrationPayTiil60() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);

		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();
		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();

		// WOPPlusRiderCheckBox();

	}

	public static void regularPayAllRider() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);

		selctingAllRiderFunction();
	}

	public static void payTill60AllRider() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);

		selctingAllRiderFunction();
	}

	public static void payTill60AllRiderDeathBenifit() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[4]")).click();
		Thread.sleep(1000);

		deathBenifitAllOptionForPayLimitedRegularAndTill60PremiumType();
	}

	public static void singlePayAllRiderDeathBenifit() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[1]")).click();
		Thread.sleep(1000);

		deathBenifitAllOptionForSinglePayPremiumType();
	}

	public static void limitedPayAllRiderDeathBenifit() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);

		deathBenifitAllOptionForPayLimitedRegularAndTill60PremiumType();
	}

	public static void regularPayAllRiderDeathBenifit() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);

		deathBenifitAllOptionForPayLimitedRegularAndTill60PremiumType();
	}

	public static void selctingAllRiderFunction() throws Exception {
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();
		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		for (int i = 1; i <= 4; i++) {
			switch (i) {
			case 1:
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 2:
				WOPPlusRiderCheckBox();
				Thread.sleep(800);
				accidentCoverOptionRider.click();
				Thread.sleep(800);
				acorAddAmount(3, 7, 11);
				ifElseConditionSmartTermPlan();
				break;

			case 3:
				accidentCoverOptionRider.click();
				Thread.sleep(800);
				acceleratedCriticalIllnessOptionRider.click();
				Thread.sleep(800);
				isAcceleratedCriticalIllnessOptionRiderLevel.click();
				Thread.sleep(800);
				// outsideClick.click();
				JourneyScreenFour.arrowDownFunctionToScrollDown();
				waitTillElementToBeClickable(acceleratedCriticalAmount);
				Thread.sleep(800);
				acceleratedCriticalAmount(3, 3, 11);
				ifElseConditionSmartTermPlan();
				break;

			case 4:
				isAcceleratedCriticalIllnessOptionRiderIncreasing.click();
				ifElseConditionSmartTermPlan();
				break;
			}
		}

	}

	public static void selctingAllRiderFunctionLimitedPay() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);
		premiumPayementTermSTP();
		policyTermSTPDropDown();
		deathBenifitOption();
		sumAssured(3, 4, 11);
		nonSmoker();
		modeOfPaymentSTP();
		lifeStageEventBenefitNo();
		premiumBackOptiontNo();
		for (int i = 1; i <= 2; i++) {
			switch (i) {
			case 1:
				WOPPlusRiderCheckBox();
				ifElseConditionSmartTermPlan();
				break;

			case 2:
				WOPPlusRiderCheckBox();
				Thread.sleep(800);
				accidentCoverOptionRider.click();
				Thread.sleep(800);
				acorAddAmount(3, 7, 11);
				ifElseConditionSmartTermPlan();
				break;

			}
		}

	}

	public static void selctingAllPremiumPaymentTerm() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);

		allPremiumPayementTermSTP();

	}

	public static void selctingAllPremiumPaymentTermRegularPay() throws Exception {
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[3]")).click();
		Thread.sleep(1000);

		allPremiumPayementTermSTPRegularPay();

	}

	public static void deathBenefitIllustration() throws Exception {

		premiumPayementTermSTP();
		policyTermSTPDropDown();

		deathBenifitAllOptionForPayLimitedRegularAndTill60PremiumType();

	}

	public static void limitedPayAllRider() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);

		selctingAllRiderFunction();

	}

	public static void limitedPayAllPremiumPaymentTerm() throws Exception {

		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType3rdOptionSAP);
		driver.findElement(By.xpath("//*[@id='menu-premiumType']/div[2]/ul/li[2]")).click();
		Thread.sleep(1000);

		selctingAllRiderFunction();

	}

	public static void acorAddAmount(int x, int y, int z) throws Exception {
		acorAddAmount.clear();
		type(acorAddAmount, readingdata(x, y, z));

	}

	public static void acceleratedCriticalAmount(int x, int y, int z) throws Exception {
		acceleratedCriticalAmount.clear();
		type(acceleratedCriticalAmount, readingdata(x, y, z));

	}

	public static void fillingAllTheRequiredFeildsForSmartTermPlan() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		smartTermPlanPremiumType();
	}

	public static void fillingRequiredFeildsForSmartTermPlan() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		smartTermPlanPremiumTypeIllustration();
		checkErrorMessageForAgeLessThan18SmartTermPlan();
	}

	public static void fillingRequiredFeildsForSmartTermPlanMaxAge() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		smartTermPlanPremiumTypeIllustration();
		checkErrorMessageForAgeMoreThan60YearsSmartTermPlan();
	}

	public static void fillingRequiredFeildsForSmartTermPlanMimitedPayMaxAge() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		smartTermPlanLimitedTypeIllustration();
		checkErrorMessageForAgeMoreThan60YearsSmartTermPlan();
	}

	public static void fillingRequiredFeildsForSmartTermPlanRegularPayMaxAge() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		smartTermPlanRegularPayIllustration();
		checkErrorMessageForAgeMoreThan60YearsSmartTermPlan();
	}

	public static void fillingRequiredFeildsPayTill60ForSmartTermPlanMaxAge() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		smartTermPlanPremiumTypeIllustrationPayTiil60();
		checkErrorMessageForAgeMoreThan44YearsSmartTermPlan();
	}

	public static void fillingAllTheRequiredFeildsForSmartTermPlanLimitedPayAllRider() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		selctingAllRiderFunctionLimitedPay();
	}

	public static void fillingAllTheRequiredFeildsForAllPremiumPaymentTerm() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		selctingAllPremiumPaymentTerm();
	}

	public static void fillingAllTheRequiredFeildsForRegularPayAllPremiumPaymentTerm() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		selctingAllPremiumPaymentTermRegularPay();
	}

	public static void setDateBirthPayorDetailsLessThan1DayOf18() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);

		Thread.sleep(800);
		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		Thread.sleep(800);
		LocalDate datw = LocalDate.now().minusYears(18);
		System.out.println(datw);
		LocalDate dayLessThan18 = datw.plusDays(1);
		int month = dayLessThan18.getMonthValue() - 1;
		int day = dayLessThan18.getDayOfMonth();
		int year = dayLessThan18.getYear();

		Thread.sleep(800);

		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='" + month + "']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='" + year + "']"))
				.click();
		Thread.sleep(200);
		driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-"
						+ day + "\"]"))
				.click();
		Thread.sleep(200);

	}

	public static void setDateBirthPayorDetailsMoreThan1YearOf60Years() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);

		Thread.sleep(800);
		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		Thread.sleep(800);

		LocalDate datw = LocalDate.now().minusYears(60);
		System.out.println(datw);
		LocalDate moreThan44 = datw.minusYears(1);

		int month = moreThan44.getMonthValue() - 1;
		int day = moreThan44.getDayOfMonth();
		int year = moreThan44.getYear();

		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='" + month + "']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='" + year + "']"))
				.click();
		Thread.sleep(200);
		driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-"
						+ day + "\"]"))
				.click();
		Thread.sleep(200);

	}

	public static void setDateBirthPayorDetailsMoreThan1YearOf44Years() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);

		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		Thread.sleep(800);

		LocalDate datw = LocalDate.now().minusYears(44);
		System.out.println(datw);
		LocalDate moreThan44 = datw.minusYears(1);

		int month = moreThan44.getMonthValue() - 1;
		int day = moreThan44.getDayOfMonth();
		int year = moreThan44.getYear();

		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='" + month + "']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='" + year + "']"))
				.click();
		Thread.sleep(200);
		driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-"
						+ day + "\"]"))
				.click();
		Thread.sleep(200);

	}

	public static void setDateBirthPayorDetailOf18Age() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);

		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		Thread.sleep(800);
		LocalDate datw = LocalDate.now().minusYears(18);
		int month = datw.getMonthValue() - 1;
		int day = datw.getDayOfMonth();
		int year = datw.getYear();

		Thread.sleep(800);

		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='" + month + "']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='" + year + "']"))
				.click();
		Thread.sleep(200);
		driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-"
						+ day + "\"]"))
				.click();
		Thread.sleep(200);

	}

	public static void setDateBirthPayorDetailOf60Age() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);

		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		Thread.sleep(800);
		LocalDate datw = LocalDate.now().minusYears(60);
		int month = datw.getMonthValue() - 1;
		int day = datw.getDayOfMonth();
		int year = datw.getYear();

		Thread.sleep(800);

		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='" + month + "']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='" + year + "']"))
				.click();
		Thread.sleep(200);
		driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-"
						+ day + "\"]"))
				.click();
		Thread.sleep(200);

	}

	public static void setDateBirthPayorDetailOf44Age() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);

		waitTillElementToBeClickable(dateOfBirthPersonalDetails);
		dateOfBirthPersonalDetails.click();
		Thread.sleep(800);
		LocalDate datw = LocalDate.now().minusYears(44);
		int month = datw.getMonthValue() - 1;
		int day = datw.getDayOfMonth();
		int year = datw.getYear();

		Thread.sleep(800);

		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//option[@value='" + month + "']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='" + year + "']"))
				.click();
		Thread.sleep(200);
		driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-"
						+ day + "\"]"))
				.click();
		Thread.sleep(200);

	}

	public static void fillingAllTheRequiredFeildsForSmartTermPlanRegularPayAllRider() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		regularPayAllRider();
	}

	public static void fillingAllTheRequiredFeildsForSmartTermPlanRegularPayTill60() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		payTill60AllRider();
	}

	public static void fillingAllTheFeildForDeathBenifitRegularPayTill60() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		payTill60AllRiderDeathBenifit();
	}

	public static void fillingAllTheFeildForDeathBenifitSinglePay() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		singlePayAllRiderDeathBenifit();
	}

	public static void fillingAllTheFeildForDeathBenifitLimitedPay() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		limitedPayAllRiderDeathBenifit();
	}

	public static void fillingAllTheFeildForDeathBenifitRegularPay() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		regularPayAllRiderDeathBenifit();
	}

	public static void fillingAllTheRequiredFeildsForSAP() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")).click();
		// arrowDownFunctionToScrollDown();

		premiumTypeSAP();
		premiumPayementTermSAP();
		policyTermSAP();

		modeOfPaymentSAP();
		dividentOptionWLS();
		WOPPlusRiderCheckBox();

	}

	public static void fillingAllTheRequiredFeildsForSPSP() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		// arrowScrollDownFunctionToScrollDown();
		premiumPayementTermSPSP();
		policyTermSPSP();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentSPSP();
		chieldDateBirthProductDetails();
	}

	public static void fillingAllTheRequiredFeildsForLPPSAnnual() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermLPPS();
		policyTermLPPS();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentLPPS();

	}

	public static void fillingAllTheRequiredFeildsFor_SemiAnnualLPPS() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermLPPS();
		policyTermLPPS();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentSemiAnnualLPPS();

	}

	public static void fillingAllTheRequiredFeildsFor_QuarterlyLPPS() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermLPPS();
		policyTermLPPS();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentQuarterlyLPPS();

	}

	public static void fillingAllTheRequiredFeildsFor_MonthalyLPPS() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumPayementTermLPPS();
		policyTermLPPS();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentMonthlyLPPS();
	}

	public static void fillingAllTheRequiredFeildsForSPSPSemiAnnual() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		// arrowScrollDownFunctionToScrollDown();
		premiumPayementTermSPSP();
		policyTermSPSP();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentSPSPSemiAnnual();
		chieldDateBirthProductDetails();
	}

	public static void fillingAllTheRequiredFeildsForSPSPQuarterly() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		// arrowScrollDownFunctionToScrollDown();
		premiumPayementTermSPSP();
		policyTermSPSP();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentSPSPQuarterly();
		chieldDateBirthProductDetails();
	}

	public static void fillingAllTheRequiredFeildsForSPSPMonthly() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		// arrowScrollDownFunctionToScrollDown();
		premiumPayementTermSPSP();
		policyTermSPSP();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentSPSPMonthly();
		chieldDateBirthProductDetails();
	}

	public static void fillingAllTheRequiredFeildsForFTSP() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")).click();
		// arrowDownFunctionToScrollDown();
		premiumPayementTermFTSP();
		policyTermFTSP();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentFTSP();
		dynamicFundAllocationNo();
		systematicTransferPlanNo();

		/*
		 * premiumCommitment(3, 1, 15); chooseYourFundYes(); growthSuperFund(3,
		 * 1, 16); secureFund(3, 2, 16); conservativeFund(3, 3, 16);
		 * highGrowthFund(3, 4, 16); BalancedFund(3, 5, 16); growthFund(3, 6,
		 * 16);
		 */}

	public static void fllIssurersNameValidation(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		insurersNameLabel.clear();
		type(insurersNameLabel, readingdata(x, y, z));

	}

	public static void insurersGenderFemale() throws Exception {

		click(insurersGenderFemale);

	}

	public static void femaleSelection() throws Exception {
		Thread.sleep(200);
		click(genderFemale);
		Thread.sleep(200);

	}

	public static void fillDateBirthInsurersDetails() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		Thread.sleep(800);
		waitTillElementToBeClickable(dateOfBirthIssurer);
		dateOfBirthIssurer.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();

		JourneyScreenThree.dateOfBirthSelctionFunction();

	}

	public static void clickProceedPageTwo() throws Exception {

		Savebtn.click();
		Thread.sleep(1000);
		click(Proceedbtn);
		Thread.sleep(1000);
	}

	public static void relationshipWithProposer() throws Exception {

		click(relationshipWithProposer);
		Thread.sleep(1000);

	}

	public static void relationShipProposer() throws Exception {
		click(proposerDropdown);
		Thread.sleep(1000);
	}

	public static void relationshipWithProposerParentOption() throws Exception {

		click(relationshipWithProposerParentOption);
		Thread.sleep(2000);

	}

	public static void selectkRelationshipWithProposerOption() throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		relationshipWithProposer();
		relationshipWithProposerParentOption();
	}

	public static void dateOfBirthIssurer() throws Exception {

		click(dateOfBirthIssurer);

	}

	@Description("Verify the Future Date is disabled for insurers details")
	public static void checkDateOfBirthFormatFutureDateRestrictionSetDateBirthInsurersDetails() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		String dateFormat = dateOfBirthIssurer.getAttribute("placeholder");
		if (dateFormat.equalsIgnoreCase("DD/MM/YYYY")) {
			System.out.println("Test case pass:As DD/MM/YYYY is the format and displaying in date text box");
		} else {
			Assert.fail("Test case fail:Format is not DD/MM/YYYY");
		}
		dateOfBirthIssurer();
		LocalDate datw = LocalDate.now().plusDays(1L);
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "\"day-" + day + "\"";
		System.out.println(day);
		System.out.println(runtimeXpathForSelectingDate);
		WebElement checkFutureDateIsEnabled = driver.findElement(By
				.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))][@aria-label="
						+ runtimeXpathForSelectingDate + "]"));

		String classes = checkFutureDateIsEnabled.getAttribute("class");
		boolean isDisabled = classes.contains("day--disabled");
		if (isDisabled) {
			logger.info("Test Case pass:'SCREEN TWO'As Future Date is disabled for insurers details");
		} else {
			Assert.fail("Test Case Fail:'SCREEN TWO'Future Date is enabled for insurers details ");
		}

		JourneyScreenThree.dateOfBirthSelctionFunction();

		// dateOfBirthIssurer.clear();
		// type(dateOfBirthIssurer, readingdata(x, y, z));

	}

	public static void setDateBirthInsurersDetails(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		waitTillElementToBeClickable(dateOfBirthIssurer);
		dateOfBirthIssurer.click();
		JourneyScreenThree.dateOfBirthSelctionFunction();

	}

	public static void selectAndCheckRelationshipWithProposerOption() throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		relationshipWithProposer();
		relationShipProposer();

		/*
		 * String xpathOFList = "//ul[@role='listbox']/li"; String sheetpath =
		 * "\\src\\test\\resources\\MasterData.xlsx";
		 * comparingExcelDataWithUIBySheetPath(xpathOFList, 5, 6, sheetpath);
		 * relationshipWithProposerParentOption();
		 */
	}

	public static void selectRelationshipWithProposerOption() throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		relationshipWithProposer();
		Thread.sleep(300);
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

	/* Filling the information from Screen two */
	public static void fillingFeildsScreenTwoFunction() throws Exception {
		try {
			// HomePage.clickDashboard();
			// HomePage.clickNewApp();
			// JourneyScreenOneTest.fillingScreenOneFeildsFunctionForDependent();
			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenTwo.selectByDropdown();
			JourneyScreenTwo.setHouseNo(3, 1, 3);
			JourneyScreenTwo.setRoadNo(3, 1, 4);
			JourneyScreenTwo.setVillageTown(3, 1, 5);
			JourneyScreenTwo.setCountry(3, 1, 6);
			JourneyScreenTwo.setState(3, 1, 7);
			JourneyScreenTwo.setCity(3, 1, 8);
			JourneyScreenTwo.setPinCode(3, 1, 9);
			JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	/* Filling the information from Screen two */
	public static void fillingAllTheRequiredFeildForScreen2WithoutFirstName() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {

			// JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenTwo.selectByDropdown();
			Thread.sleep(1000);
			JourneyScreenTwo.setHouseNo(3, 1, 3);
			JourneyScreenTwo.setRoadNo(3, 1, 4);
			JourneyScreenTwo.setVillageTown(3, 1, 5);
			JourneyScreenTwo.setCountry(3, 1, 6);
			JourneyScreenTwo.setState(3, 1, 7);
			JourneyScreenTwo.setCity(3, 1, 8);

			JourneyScreenTwo.setPinCode(3, 1, 9);
			JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	/* Filling Information for Proposer communication without illustration */
	public static void fillingFeildsForScreenTwoProposerCommunicationAddressWithoutIllustration() throws Exception {
		try {
			JourneyScreenTwo.selectByDropdownProposerCommunication();
			JourneyScreenTwo.houseNoProposerCommunication(3, 1, 3);
			JourneyScreenTwo.communicationRoadNo(3, 1, 4);
			JourneyScreenTwo.communicationVillageTown(3, 1, 5);
			JourneyScreenTwo.countryCommunication(3, 1, 6);
			JourneyScreenTwo.countryCommunicationIndonasia(3, 1, 6);
			JourneyScreenTwo.communicationStateCommunication(3, 2, 7);
			JourneyScreenTwo.searchCityComunication(3, 2, 8);
			JourneyScreenTwo.setPinCodecommunication(3, 1, 9);

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	/* Filling Information for Proposer communication */
	public static void fillingFeildsForScreenTwoProposerCommunicationAddress() throws Exception {
		try {
			JourneyScreenTwo.selectByDropdownProposerCommunication();

			JourneyScreenTwo.houseNoProposerCommunication(3, 1, 3);
			JourneyScreenTwo.communicationRoadNo(3, 1, 4);
			JourneyScreenTwo.communicationVillageTown(3, 1, 5);
			JourneyScreenTwo.countryCommunication(3, 1, 6);
			JourneyScreenTwo.countryCommunicationIndonasia(3, 1, 6);

			JourneyScreenTwo.communicationStateCommunication(3, 2, 7);
			JourneyScreenTwo.searchCityComunication(3, 2, 8);
			JourneyScreenTwo.setPinCodecommunication(3, 1, 9);

			JourneyScreenTwo.traditional();
			JourneyScreenTwo.selectByDropdownCIP();
			Thread.sleep(1000);
			JourneyScreenTwo.fillingAllTheRequiredFeildsForCIP();
			JourneyScreenTwo.clickSubmitButton();
			JourneyScreenThree.checkPDFIsOpenedOrNotCheckMsgNRI();

			// JourneyScreenTwo.setPinCode(3, 1, 9);
			// JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	/* Filling information for self female */
	public static void fillingFeildsScreenTwoFunctionSelfFemale() throws Exception {
		try {
			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenTwo.femaleClick();
			JourneyScreenTwo.selectByDropdown();
			JourneyScreenTwo.setHouseNo(3, 1, 3);
			JourneyScreenTwo.setRoadNo(3, 1, 4);
			JourneyScreenTwo.setVillageTown(3, 1, 5);
			JourneyScreenTwo.setCountry(3, 1, 6);
			JourneyScreenTwo.setState(3, 1, 7);
			JourneyScreenTwo.setCity(3, 1, 8);
			JourneyScreenTwo.setPinCode(3, 1, 9);
			JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	/* filling Insurers Details at Screen two */
	public static void fillingInsurersDetailsScreenTwo() throws Exception {
		try {
			JourneyScreenTwo.fillingIssurersName(1, 1, 8);
			JourneyScreenTwo.insurersGenderFemale();
			JourneyScreenTwo.setDateBirthInsurersDetails(1, 1, 9);
			JourneyScreenTwo.selectRelationshipWithProposerOption();
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	/* Filling The Required Information for Screen two For PAN Validation */
	public static void fillingAllTheRequiredFeildForScreen2ForPANValidation() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			JourneyScreenTwo.setFirstNamePAN(2, 9, 3);
			JourneyScreenTwo.setLastNamePAN(2, 10, 3);
			JourneyScreenTwo.setDateBirthPANValidation();
			// JourneyScreenTwo.femaleSelection();
			JourneyScreenTwo.selectByDropdown();
			Thread.sleep(1000);
			JourneyScreenTwo.setHouseNo(3, 1, 3);
			JourneyScreenTwo.setRoadNo(3, 1, 4);
			JourneyScreenTwo.setVillageTown(3, 1, 5);
			JourneyScreenTwo.setCountry(3, 1, 6);
			JourneyScreenTwo.setState(3, 1, 7);
			JourneyScreenTwo.setCity(3, 1, 8);
			JourneyScreenTwo.setPinCode(3, 1, 9);
			JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	/* Screen One Test NRIFunction To Reach Screen Two */
	public static void ScreenOneTestNRIFunctionToReachScreenTwo() throws Exception {
		try {
			HomePage.clickDashboard();
			HomePage.clickNewApp();
			JourneyScreenOne.residentialsStatusNRI();
			JourneyScreenOne.nationalityNRI();
			JourneyScreenOne.setPassportNumber(1, 1, 5);
			JourneyScreenOne.isAllTheTypeOfVisaListIsPresent();
			JourneyScreenOne.visaValidTillSingleData();
			JourneyScreenOne.passportIssuingCountry(1, 1, 6);
			JourneyScreenOne.passportExpiryDateForSingleData();
			JourneyScreenOne.setAadhar(1, 1, 0);
			JourneyScreenOne.setMobNumber(1, 1, 2);
			JourneyScreenOne.setEmailId(1, 1, 3);
			JourneyScreenOne.setPreIssuanceNumber(1, 1, 4);
			JourneyScreenOne.clickProceed();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	@Step("Getting the information from ScreenTwo")
	public static void fillingFeildsForScreenTwo() throws Exception {
		try {
			JourneyScreenTwo.setFirstName(3, 1, 0);
			JourneyScreenTwo.setLastName(3, 1, 1);
			JourneyScreenTwo.setDateBirthPersonalDetails();
			JourneyScreenTwo.selectByDropdown();
			JourneyScreenTwo.setHouseNo(3, 1, 3);
			JourneyScreenTwo.setRoadNo(3, 1, 4);
			JourneyScreenTwo.setVillageTown(3, 1, 5);
			JourneyScreenTwo.setCountry(3, 1, 6);
			JourneyScreenTwo.setState(3, 1, 7);
			JourneyScreenTwo.setCity(3, 1, 8);
			JourneyScreenTwo.setPinCode(3, 1, 9);
			JourneyScreenTwo.setAlternateMobileNo(3, 1, 10);
		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// Function for FTS PremiumPaymentTerm 5
	public static void premiumPayementTermFTSPoption5() throws Exception {
		waitTillElementToBeClickable(premiumPaymentTermFTSP);
		premiumPaymentTermFTSP.click();
		premiumPaymentTermFTSP5.click();
		// waitTillElementToBeClickable(PremiumPaymentTermFTSP);
		// PremiumPaymentTermFTSP.click();
		Thread.sleep(2000);

	}

	// Function for FTSP premiumPaymentTerm option 5
	public static void fillingAllTheRequiredFeildsForFTSPoption5() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")).click();
		// arrowDownFunctionToScrollDown();

		premiumPayementTermFTSPoption5();
		policyTermFTSP();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentFTSP();
		dynamicFundAllocationNo();
		systematicTransferPlanNo();

		/*
		 * premiumCommitment(3, 1, 15); chooseYourFundYes(); growthSuperFund(3,
		 * 1, 16); secureFund(3, 2, 16); conservativeFund(3, 3, 16);
		 * highGrowthFund(3, 4, 16); BalancedFund(3, 5, 16); growthFund(3, 6,
		 * 16);
		 */}

	public static void modeOfPaymentFTSPSemiannual() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(400);
		waitTillElementToBeClickable(modeOfPaymentFTSP);
		modeOfPaymentFTSP.click();
		waitTillElementToBeClickable(modeOfPaymentSemiannual);
		modeOfPaymentSemiannual.click();
		Thread.sleep(2000);
	}

	// Function for FTSP premiumPaymentTerm option 5 for SemiAnnualModeOfPayment
	public static void fillingAllTheRequiredFeildsForFTSPoption5forSemiAnnual() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")).click();
		// arrowDownFunctionToScrollDown();

		premiumPayementTermFTSPoption5();
		policyTermFTSP();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentFTSPSemiannual();
		dynamicFundAllocationNo();
		systematicTransferPlanNo();

		/*
		 * premiumCommitment(3, 1, 15); chooseYourFundYes(); growthSuperFund(3,
		 * 1, 16); secureFund(3, 2, 16); conservativeFund(3, 3, 16);
		 * highGrowthFund(3, 4, 16); BalancedFund(3, 5, 16); growthFund(3, 6,
		 * 16);
		 */}

	// Function for FTS PremiumPaymentTerm 20
	public static void premiumPayementTermFTSPoption20() throws Exception {
		waitTillElementToBeClickable(premiumPaymentTermFTSP);
		premiumPaymentTermFTSP.click();
		premiumPaymentTermFTSP20.click();
		// waitTillElementToBeClickable(PremiumPaymentTermFTSP);
		// PremiumPaymentTermFTSP.click();
		Thread.sleep(2000);

	}

	public static void modeOfPaymentQuaterly() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(400);
		waitTillElementToBeClickable(modeOfPaymentFTSP);
		modeOfPaymentFTSP.click();
		waitTillElementToBeClickable(modeOfPaymentquaterly);
		modeOfPaymentquaterly.click();
		Thread.sleep(2000);
	}

	// Function for FTSP premiumPaymentTerm option 20 for QuaterlyModeOfPayment
	public static void fillingAllTheRequiredFeildsForFTSPoption20forQuaterly() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")).click();
		// arrowDownFunctionToScrollDown();

		premiumPayementTermFTSPoption20();
		policyTermFTSP();
		JourneyScreenFour.arrowDownFunctionToScrollDown();
		modeOfPaymentQuaterly();
		dynamicFundAllocationNo();
		systematicTransferPlanNo();

		/*
		 * premiumCommitment(3, 1, 15); chooseYourFundYes(); growthSuperFund(3,
		 * 1, 16); secureFund(3, 2, 16); conservativeFund(3, 3, 16);
		 * highGrowthFund(3, 4, 16); BalancedFund(3, 5, 16); growthFund(3, 6,
		 * 16);
		 */}

	// function for SinglePayPremium type
	public static void fillingAllTheRequiredFeildsForSAPsinglePremiumType() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumTypeSAPoption1();
		SinglePaypremiumPayementTermSAP();
		policyTermSAPoption1();
		modeOfPaymentSAP();
		dividentOptionWLS();

	}

	// function for LimitedPayPremium type for ADDRider
	public static void fillingAllTheRequiredFeildsForSAPlimitedPremiumType() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumTypeSAPoption2();
		LimitedPaypremiumPayementTermSAP();
		policyTermSAPoption1();
		modeOfPaymentSAP();
		dividentOptionWLS();
		AccidentalDeathAndDismembermentRider();

	}

	// function for LimitedPayPremium type for termplus Rider
	public static void fillingAllTheRequiredFeildsForSAPlimitedPremiumTypeforrider2() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumTypeSAPoption2();
		LimitedPaypremiumPayementTermSAP();
		policyTermSAPoption1();
		SemiAnnualmodeOfPaymentSAP();
		dividentOptionWLS();
		TermPlusRider();
	}

	// function for LimitedPayPremium type for WOP Rider
	public static void fillingAllTheRequiredFeildsForSAPlimitedPremiumTypeforrider3() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumTypeSAPoption2();
		LimitedPaypremiumPayementTermSAP();
		policyTermSAPoption1();
		SemiAnnualmodeOfPaymentSAP();
		dividentOptionWLS();
		WOPPlusRiderCheckBox();
	}

	// function for LimitedPayPremium type for AllRider
	public static void fillingAllTheRequiredFeildsForSAPlimitedPremiumTypeforAllrider() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();
		premiumTypeSAPoption2();
		LimitedPaypremiumPayementTermSAP();
		policyTermSAPoption1();
		QuaterlymodeOfPaymentSAP();
		dividentOptionWLS();
		AccidentalDeathAndDismembermentRider();
		TermPlusRider();
		WOPPlusRiderCheckBox();

	}

	// funtion for singlePay PremiumType
	public static void premiumTypeSAPoption1() throws Exception {
		System.out.println("111111111111");
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType1stOptionSAP);
		premiumType1stOptionSAP.click();
		Thread.sleep(2000);
	}

	// funtion for limitedPay PremiumType
	public static void premiumTypeSAPoption2() throws Exception {
		System.out.println("111111111111");
		Thread.sleep(700);
		waitTillElementToBeClickable(premiumTypeSAPDropDown);
		premiumTypeSAPDropDown.click();
		waitTillElementToBeClickable(premiumType1stOptionSAP);
		premiumType2ndOptionSAP.click();
		Thread.sleep(2000);
	}

	// funtion for singlePay PremiumPaymentTerm
	public static void SinglePaypremiumPayementTermSAP() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPaymentTermSAP);
		premiumPaymentTermSAP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumpaymentterm1stoption);
		premiumpaymentterm1stoption.click();
		Thread.sleep(2000);

	}

	// funtion for Limitedpay PremiumPaymentTerm
	public static void LimitedPaypremiumPayementTermSAP() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumPaymentTermSAP);
		premiumPaymentTermSAP.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(premiumpaymentterm1stoptionforlimited);
		premiumpaymentterm1stoptionforlimited.click();
		Thread.sleep(2000);

	}

	// function for Policy term for SinglePay premium
	public static void policyTermSAPoption1() throws Exception {
		waitTillElementToBeClickable(policyTermDropDownSAP);
		policyTermDropDownSAP.click();
		waitTillElementToBeClickable(policyterm1stOption);
		policyterm1stOption.click();
		Thread.sleep(2000);
	}

	// function to check the checkbox for AccidentalDeathAndDismembermentRider--
	public static void AccidentalDeathAndDismembermentRider() throws Exception {
		click(ADDRidercheckbox);
		ADDRideramount.sendKeys("400000");

	}

	// function to check the checkbox for TermPlusRider--
	public static void TermPlusRider() throws Exception {
		click(termPlusRider);
		termPlusAmount.sendKeys("100000");
		click(riderterm);
		Thread.sleep(3000);
		click(premiumpaymentterm1stoptionforlimited);

	}

	// function to check the checkbox for TermPlusRider--
	public static void TermPlusRiderdropdown25() throws Exception {
		click(termPlusRider);
		termPlusAmount.sendKeys("100000");
		click(riderterm);
		Thread.sleep(3000);
		click(dropDown25);

	}

	// Quaterly Mode of Payment
	public static void QuaterlymodeOfPaymentSAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentSAPDropDown);
		modeOfPaymentSAPDropDown.click();
		waitTillElementToBeClickable(modeOfPaymentquaterly);
		modeOfPaymentquaterly.click();
		Thread.sleep(2000);
	}

	// Semi-Annual Mode of Payment
	public static void SemiAnnualmodeOfPaymentSAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentSAPDropDown);
		modeOfPaymentSAPDropDown.click();
		waitTillElementToBeClickable(modeOfPaymentSemiannual);
		modeOfPaymentSemiannual.click();
		Thread.sleep(2000);
	}

	/* Adding changes 20-06-19 */
	public static void premiumCommitmentSAP(int x, int y, int z) throws Exception {
		// type(MobNumtxtfld, strMobNumber);
		premiumCommitment.clear();
		type(premiumCommitment, readingdata(x, y, z));
		proceedBtn.click();
		Thread.sleep(4000);
		// WOPPlusRiderCheckBox();
		ifConditionForTabSizeTwoPDFIllustrationProceedingScreenAhead();
	}

	// function for RegularPremiumpay (monthly payment mode) for all Riders
	public static void fillingAllTheRequiredFeildsForSAPforRegularmode() throws Exception {
		selectByDropdownNeedOfInsur();
		selectByDropdownLifeStge();

		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[2]/form[1]/div[1]/div[1]/div[3]")).click();
		// arrowDownFunctionToScrollDown();

		premiumTypeSAP();
		premiumPayementTermSAP();
		policyTermSAP();
		MonthlymodeOfPaymentSAP();
		dividentOptionWLS();
		AccidentalDeathAndDismembermentRider();
		TermPlusRiderdropdown25();
		WOPPlusRiderCheckBox();

	}

	// Monthly Mode of Payment
	public static void MonthlymodeOfPaymentSAP() throws Exception {
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(modeOfPaymentSAPDropDown);
		modeOfPaymentSAPDropDown.click();
		waitTillElementToBeClickable(modeOfPaymentMonthly);
		modeOfPaymentMonthly.click();
		Thread.sleep(5000);
	}

	public static void screenJourneyFromThreeTillEnd() throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		try {
			JourneyScreenThreeTest.proposerPersonalDetailsSection();
			// JourneyScreenTwo.proposerPersonalDetailsIncome();
			JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
			JourneyScreenThreeTest.bankDetailsSectionFillingData();
			JourneyScreenThree.fillingAnnualIncomeTOProceed();
			Thread.sleep(1000);

			JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
			JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
			JourneyScreenFour.identityProofIssuingAuthority();
			JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();

			JourneyScreenFour.arrowDownFunctionToScrollDownTillBottomFastTrack();
			JourneyScreenFour.criticalIllnessNoOption();
			JourneyScreenFour.hazardousActivitiesNo();
			JourneyScreenTwo.arrowDownFunctionToScrollDown();
			JourneyScreenFour.selectCriminalChargesNo();
			JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
			JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
			JourneyScreenSix.fetchingProposalNumberFromUI();

			// JourneyScreenThree.gmailFunctionalitySmartTermPlan();
			JourneyScreenThree.handle_windowFTSP();
			// JourneyScreenThreeTest.usingPolicyNumberToFillScreenSixTPPPush();

		} catch (Exception e) {
			logger.error("Test case failed " + e.getMessage());
			throw e;

		}
	}

	public static void arrowDownFunctionToScrollDownPage() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,750)");

	}

	public static void arrowDownFunctionToScrollDownMidPage() {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,350)");

	}

	public static void saveProceedPDFGeneration() throws Exception {

		JourneyScreenOne.clickProceed();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());

		if (tabs.size() == 2) {
			ifConditionForTabSizeTwoPDFIllustrationSelectingLifestyleScreen();

		}

		else {
			Assert.fail("Either PDF is not generating or Loading time is too much for STP");

		}
	}
	public static void getInitDriver() throws Exception{

		driver = new ChromeDriver();
		prop = ReusableActions.readProperties();
		driver.get(prop.getProperty("SampleURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		logger.info("Fulfilment URL opened successfully");
		LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
		logger.info("User logged in successfully");
		HomePage.clickNewApp();
		JourneyScreenOne.isIndianSelected();
		JourneyScreenOne.isSelfSelected();
		JourneyScreenOne.isProceedEnabled();
	}


}
