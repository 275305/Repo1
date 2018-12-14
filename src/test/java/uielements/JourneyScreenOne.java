package uielements;

import java.io.File;
import java.io.FileInputStream;
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

import util.AppConstant;

public class JourneyScreenOne extends ReusableActions{
	
    // Locating Indian Nationality radio Button
    @FindBy(xpath="//input[@value='indian']")
    static WebElement Indianbtn; 
    
    @FindBy(xpath="//*[@id='menu-insurerOccupation']/div[2]/ul/li[2]")
    static WebElement occupation2ndOption ; 
    
    @FindBy(xpath="//input[@name='income']")
	 public static WebElement annualIncomePersonalDetailsDependent;
    
    @FindBy(xpath="//*[@id='alert-dialog-title']/h2[(text()=\"Update PAN Number\")]")
	 public static WebElement updatePANPOPUP;
    
    @FindBy(xpath="//p[(text()=\"Invalid Email Address\")]")
	 public static WebElement emailIdErrorMessage;
    
    @FindBy(xpath="//input[@name='income']")
	 public static WebElement annualIncomeInsurersDetailsDependent;
    
    @FindBy(xpath="//input[@name='insurerCompanyName']")
    static WebElement IssureresCompanyNameWhenSalariedFromOccupationSelected; 
    
    // Locating NRI Nationality radio Button
    @FindBy(xpath="//input[@value='nri']")
    static WebElement NRIbtn;
    
    // Locating PIO Nationality radio Button
    @FindBy(xpath="//input[@value='pio']")
    static WebElement PIObtn;

    // Locating Foreign National Nationality radio Button
    @FindBy(xpath="//input[@value='fnational']")
    static WebElement ForeignNationalbtn;
    
    // Locating Self Policy For radio Button
    @FindBy(xpath="//input[@value='self']")
    static WebElement Selfbtn;
    
    
    // Locating Dependent Policy For radio Button
    @FindBy(xpath="//input[@value='dependent']")
    static WebElement Dependentbtn;
    
    
    // Locating Company Policy For radio Button
    @FindBy(xpath="//input[@value='company']")
    static WebElement Companybtn;
    
    // Locating Aadhar number text field
    @FindBy(xpath="//input[@name='aadhaarNo']")
    static WebElement AadharTxtfld;
    
    // Locating Don't have Aadhar number link
    @FindBy(xpath="//span[contains(text(),\"Don't Have PAN?\")]")
    static WebElement DonthaveAadharLink;
    
    // Locating Get OTP button
    @FindBy(xpath="//a[text()='Get OTP']")
    static WebElement GetOTPbtn;
    
    // Locating Pan Number text field
    @FindBy(xpath="//input[@name='panNumber']")
    static WebElement PanNumbertxtfld;
    
    @FindBy(xpath="//input[@name='insurerAnnualIncome']")
    static WebElement insurerOtherDetailsAnnualIncome;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div/div/div/div/div[@role=\"button\"]")
    static WebElement insurersIndustryType ; 
	 
	@FindBy(xpath="//span[contains(text(),\"Are you currently posted in any sensitive/ border location ?\")]")
   static WebElement labledAreYouCurrentlyPostedInsurer ; 
	
	@FindBy(xpath="//label[text()='No']")
   static WebElement noOptionForCurrentlyPostedInsurer; 
	
	@FindBy(xpath="//label[text()='Yes']")
   static WebElement yesOptionForCurrentlyPostedInsurer ;
	
	@FindBy(xpath="//span[contains(text(),\"Are you a professional diver ?\")]")
   static WebElement labledAreYouProfessionalDiverInsurer ;
	
	@FindBy(xpath="//span[contains(text(),\"Are you based at offshore or your job involves travelling to offshore ?\")]")
   static WebElement labledAreYouBasedAtOffshoreOrTravOffshoreInsurer ;
	
	@FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[2]/div/div/div/div/div/div[@role=\"button\"]")
   static WebElement typeOfVesselWhereWorkingInsurers ;
	
	@FindBy(xpath=".//*[@id='menu-vesselTypeOfInsurer']/div[2]/ul/li[1]")
   static WebElement typeOfVesselWhereWorking1stOptionInsurers ;
	
	@FindBy(xpath="//span[contains(text(),\"Does your role involve going inside any kind of mine ?\")]")
   static WebElement doesOurRoleInvolveGoingInsideAnyKindOfMineInsurer ;
	
	@FindBy(xpath="//span[contains(text(),\"Have you ever had any illness related to your occupation ?\")]")
   static WebElement haveYouEverHadIllnessRelatedToYourOccupationInsurers ;
	
	@FindBy(xpath="//label[@for='iri1']")
   static WebElement yesDoesYourRoleGoingInsideMineInsurer ;
	
	@FindBy(xpath="//label[@for='Insurer2']")
	static WebElement indianInsurerNationality ;
	
	@FindBy(xpath="//label[@for='iri2']")
   static WebElement noDoesYourRoleGoingInsideMineInsurer ;
	
	@FindBy(xpath="//label[@for='iai1']")
   static WebElement yesHaveYouEverHadIllnessRelatedToYourOccuoationInsurer ;
	
	@FindBy(xpath="//label[@for='iai2']")
   static WebElement noHaveYouEverHadIllnessRelatedToYourOccuoationInsurer ;
	
	@FindBy(xpath="//span[contains(text(),\"Exact Nature of duties\")]")
   static WebElement exactNatureOfDutiesInsurer ;
	
	@FindBy(xpath="//label[contains(text(),\"Flying Role\")]")
   static WebElement flyingRoleInsurer ;
	
	@FindBy(xpath="//label[contains(text(),\"Non-Flying role\")]")
   static WebElement nonFlyingRoleInsurer ;
	
	
	@FindBy(xpath="//p[text()=\"Please Enter 12 digit Aadhaar Number\"]")
	static WebElement aadharErrorMsg ;
	
	@FindBy(xpath="//p[text()=\"Invalid PAN Number\"]")
	static WebElement PANErrorMsg ;
	
	@FindBy(xpath="//p[text()=\"Invalid Mobile Number\"]")
	static WebElement phoneNumberErrorMsg ;
    
    
    // Locating Don't Have PAN? link
    @FindBy(xpath="//a[contains(text(),'t Have PAN?')]")
    static WebElement DontHavePanlink;
    
    
    // Locating Mobile Number text field
    @FindBy(xpath="//input[@name='mobileNumber']")
    static WebElement MobNumtxtfld;
    
    
    // Locating Email Address text field
    @FindBy(xpath="//input[@name='email']")
    static WebElement Emailtxtfld;
    
    
    // Locating PreIssuanceVerificationNumber text field
    @FindBy(xpath="//input[@name='preIssuanceVerificationNumber']")
    static WebElement PreIssuancetxtfld;
    
    // Locating PassportNumber text field
    @FindBy(xpath="//input[@name='PassportNumber']")
    static WebElement PassportNumbertxtfld;
    
    // Locating passportVisaType text field
    @FindBy(xpath="//input[@name='passportVisaType']")
    static WebElement passportVisaTypetxtfld;
    
    
    // Locating Visa valid till text field
    @FindBy(xpath="//input[@placeholder='MM/DD/YYYY']")
    static WebElement Visavalidtilltxtfld;
    
    // Locating Passport issuing country text field
    @FindBy(xpath="//label[text()='Passport issuing country']")
    static WebElement Passportissuingcountrytxtfld;
    
    // Locating Save button
    @FindBy(xpath="//span[text()='Save']")
    static WebElement Savebtn;
  
    // Locating Proceed button
    @FindBy(xpath="//span[text()='Proceed']")
    static WebElement Proceedbtn; 
    
    
    // Locating header of Don't have Aadhaar Number? Popup
    @FindBy(xpath="//h2[contains(text(),'t have Aadhaar Number?')]")
    static WebElement DonthaveAadhaarlbl;
    
    // Locating Forgot my aadhaar number radio button on Don't have Aadhaar Number? Popup
    @FindBy(xpath="//label[text()='Forgot my aadhaar number']")
    static WebElement Frgtmyadhrnumbtn;
    
    
    
    // Locating Applied, and have enrollment number radio button on Don't have Aadhaar Number? Popup
    @FindBy(xpath="//label[text()='Applied, and have enrollment number']")
    static WebElement Appliedbtn;
    
    
    // Locating Never applied radio button on Don't have Aadhaar Number? Popup
    @FindBy(xpath="//label[text()='Never applied']")
    static WebElement Neverappliedbtn;
    
    // Locating Jammu & Kashmir radio button on Don't have Aadhaar Number? Popup
    @FindBy(xpath="//label[text()='Jammu & Kashmir']")
    static WebElement Jamkasbtn;
    
    // Locating Meghalya radio button on Don't have Aadhaar Number? Popup
    @FindBy(xpath="//label[text()=' Meghalya']")
    static WebElement Meghalyabtn;
    
    // Locating Assam radio button on Don't have Aadhaar Number? Popup
    @FindBy(xpath="//label[text()=' Assam']")
    static WebElement Assambtn;
    
    
    
    // Locating Enrollment Number text field on Don't have Aadhaar Number? Popup
    @FindBy(xpath="//input[@name='EnrollmentNumber']")
    static WebElement EnrollmentNumbertxt;
    
    // Locating Proceed button on Don't have Aadhaar Number? Popup
    @FindBy(xpath="//div[@title='Redirecting to Aadhaar website']")
    static WebElement Proceedbtn1;
    
    
    // Locating Invalid Aadhaar number/Service not responding message on Popup
    @FindBy(xpath="//p[text()='Invalid aadhaar number/Service not responding.']")
    static WebElement Invalidaadharmsg;
  
    // Locating OK button on Invalid aadhar number Popup
    @FindBy(xpath="//span[text()='OK']")
    static WebElement Okbtn;
  
    // Locating Proceed button on Invalid aadhar number Popup
    @FindBy(xpath="//span[text()='Proceed']")
    static WebElement Proceedbtn2;
    
    // Locating Please enter the OTP sent to your registered mobile number text on verify aadhar number Popup
    @FindBy(xpath="//p[text()='Please enter the OTP sent to your registered mobile number.']")
    static WebElement Otpverifylbl;
    
    // Locating OTP text field on verify otp popup
    @FindBy(xpath="//div[6]/input[@type='tel']")
    static WebElement OTPtxtfld1;
    
    
    // Locating OTP text field on verify otp popup
    @FindBy(xpath="//div[2]/input[@type='tel']")
    static WebElement OTPtxtfld2;
    
    
    // Locating OTP text field on verify otp popup
    @FindBy(xpath="//div[3]/input[@type='tel']")
    static WebElement OTPtxtfld3;
    
    // Locating OTP text field on verify otp popup
    @FindBy(xpath="//div[4]/input[@type='tel']")
    static WebElement OTPtxtfld4;
    
    // Locating OTP text field on verify otp popup
    @FindBy(xpath="//div[5]/input[@type='tel']")
    static WebElement OTPtxtfld5;
    
    // Locating OTP text field on verify otp popup
    @FindBy(xpath="//div[6]/input[@type='tel']")
    static WebElement OTPtxtfld6;
    
    
    // Locating Resend button on verify otp popup
    @FindBy(xpath="//span[text()='Resend code']")
    static WebElement Resendbtn;
    
    // Locating Invalid OTP label after entering invalid otp
    @FindBy(xpath="//p[text()='Invalid OTP']")
    static WebElement Invalidlbl;
    
  
    // Locating OK button on Invalid OTP Popup
    @FindBy(xpath="//span[text()='OK']")
    static WebElement InvalidOKbtn;
    
    // Locating Proceed button on Invalid OTP Popup
    @FindBy(xpath="//span[text()='Proceed']")
    static WebElement InvalidProceedbtn;
    
    @FindBy(xpath="//a[contains(text(),\"Don't Have Aadhaar Number?\")]")
    static WebElement dontHaveAadhaar;
    
    @FindBy(xpath="//label[contains(text(),\"Never applied\")]")
    static WebElement neverApplied;
    
    @FindBy(xpath="//label[contains(text(),\"Jammu & Kashmir\")]")
    static WebElement jammuKashmir;
    
    @FindBy(xpath="//*[@id='alert-dialog-aadhaar']/div[3]/div/div/div/button//span[contains(text(),\"Proceed\")]")
    static WebElement popupProceedButton;
    
    @FindBy(xpath="//p[text()='+91']")
    static WebElement preFixOfMobileNumber;
    
    @FindBy(xpath="//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[3]/div[2]/div/div[2]/label/span[1]/span[1]")
    static WebElement dontHavePANCheckbox;

    @FindBy(xpath="//label[text()='NRI']")
    static WebElement optionNRI;
    
    @FindBy(xpath="//input[@name='PassportNumber']")
    static WebElement passportNumberNRI;
    
    @FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
    static WebElement visaValidDateNRI;
    
    @FindBy(xpath="//input[@placeholder='Search a country']")
    static WebElement pasportIssuingCountryNRI;
    
    @FindBy(xpath="//span[text()='Policy For']")
    static WebElement policyForNRI;
    
    @FindBy(xpath="//label[text()='Self']")
    static WebElement selfNRI;
    
    @FindBy(xpath="//label[text()='Dependent']")
    static WebElement dependentNRI;
    
    @FindBy(xpath="//label[text()='Company']")
    static WebElement CompanyNRI;
    
    @FindBy(xpath="//input[@name='Aadhaar']")
    static WebElement AadhaarNRI;
    
    @FindBy(xpath="//input[@name='PanNumber']")
    static WebElement PanNumberNRI;
    
    @FindBy(xpath="//input[@name='Isd']")
    static WebElement isdCodeNRI;
    
    @FindBy(xpath="//input[@name='MobileNumber']")
    static WebElement mobileNumberNRI;
    
    @FindBy(xpath="//input[@name='Email']")
    static WebElement emailAddressNRI;
    
    @FindBy(xpath="//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]//input[@placeholder='DD/MM/YYYY']")
    static WebElement dateOfBirthIssurer;
    
    @FindBy(xpath="//input[@name='PreIssuanceVerificationNumber']")
    static WebElement preIssuranceVerificationNRI;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[3]/div[1]/div[2]/div/div/div/div/div[@role=\"button\"]")
    static WebElement typeOfVisa;
    
    @FindBy(xpath="//*[@id='menu-passportVisaType']/div[2]/ul/li[contains(text(),\"Dependent\")]")
    static WebElement dependentTypeOfVisa;
    
    @FindBy(xpath="//*[@id='menu-passportVisaType']/div[2]/ul/li[contains(text(),\"Working\")]")
    static WebElement workingTypeOfVisa;
    
    @FindBy(xpath="//*[@id='menu-passportVisaType']/div[2]/ul/li[contains(text(),\"Visiting\")]")
    static WebElement visitingTypeOfVisa;
    
    @FindBy(xpath="//*[@id='menu-passportVisaType']/div[2]/ul/li[contains(text(),\"Others\")]")
    static WebElement othersTypeOfVisa;
    
    @FindBy(xpath="//input[@name='passportNumber']")
    static WebElement passportTextfld;
    
    @FindBy(xpath="//input[@placeholder='Search a country']")
    static WebElement passportIssuingCountry;
    
    @FindBy(xpath="//*[@id='react-autowhatever-1--item-0']/div[1]")
    static WebElement passportIssuingCountryOptionSelection;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[6]/div[1]/div/div[1]/div/div[1]/div/input[@placeholder='Country']")
    static WebElement isdCode;
    
    @FindBy(xpath="//label[text()='Dependent']")
    static WebElement dependentOption;
    
    @FindBy(xpath="//p[contains(text(), \"Insurer's Details\")]")
    static WebElement insurersDetails;
    
    @FindBy(xpath="//input[@name='insurerName']")
    static WebElement insurersName;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerGenderMale')]")
    static WebElement insurersGenderMale;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerGenderFemale')]")
    static WebElement insurersGenderFemale;
    
    
    @FindBy(xpath="//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
    static WebElement relationshipWithProposer;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[8]/div[1]/div/div/div[1]/div/div/div/div/div[@role=\"button\"]")
    static WebElement feetPersonalDetailsDependent;
    
    @FindBy(xpath=".//*[@id='menu-insurerHeightFeet']/div[2]/ul/li[5]")
    static WebElement selectingFeetDropDownOptionSelection;
    
    @FindBy(xpath="//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[8]/div[1]/div/div/div[2]/div/div/div/div/div[@role=\"button\"]")
    static WebElement inchPersonalDetailsDependent;
    
    @FindBy(xpath=".//*[@id='menu-insurerHeightInches']/div[2]/ul/li[5]")
    static WebElement selectingInchesDropDownOptionSelection;
    
    @FindBy(xpath="//input[@name='insurerWeightInKgs']")
    static WebElement weightPersonalDetailsDependent;
    
    
    @FindBy(xpath="//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),'Spouse/Husband/Wife')] ")
    static WebElement relationshipWithProposerSpouseOption;
    
    @FindBy(xpath="//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Parent\")]")
    static WebElement relationshipWithProposerParentOption;
    
    @FindBy(xpath="//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Grandparent\")]")
    static WebElement relationshipWithProposerGrandParentOption;
    
    @FindBy(xpath="//*[@id='menu-relationshipWithProposer']/div[2]/ul/li[contains(text(),\"Other\")]")
    static WebElement relationshipWithProposerOtherOption;
    
    @FindBy(xpath="//span[contains(text(),\"Don't Have PAN?\")]")
    static WebElement dontHavePAN;
    
    @FindBy(xpath="//p[contains(text(), \"Insurer's Other Details\")]")
    static WebElement insurersOtherDetails;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[1]/div[2]/span[1]")
    static WebElement insurersOtherDetailsPressSupress;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div")
    static WebElement insurersOtherDetailsSection;
//-----------------------------------------------------------------------------------------------------------------------------------    
    @FindBy(xpath="//input[@name='insurerFatherName']")
    static WebElement fathersNameInsurersDetails;
    
    @FindBy(xpath="//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[@role=\"button\"]")
    static WebElement dOBProofInsurersDetails;
    
    @FindBy(xpath=".//*[@id='menu-insurerProofType']/div[2]/ul/li[1]")
    static WebElement dobProofInsurers1stOption;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div/div[@role=\"button\"]")
    static WebElement eductionInsurersDetails;
    
    @FindBy(xpath="//*[@id='menu-insurerEducation']/div[2]/ul/li[1]")
    static WebElement educationInsurers1stOption;
    
    @FindBy(xpath=".//*[@id='menu-insurerIndustryType']/div[2]/ul/li[1]")
    static WebElement InsurersIndustryType1stOption;
    
    @FindBy(xpath=".//*[@id='menu-insurerIndustryType']/div[2]/ul/li[7]")
    static WebElement InsurersIndustryType7thOption;
    
    @FindBy(xpath=".//*[@id='menu-insurerMaritalStatus']/div[2]/ul/li[1]")
    static WebElement insurerMaritalStatus1stOption;
    
    @FindBy(xpath=".//*[@id='menu-insurerOccupation']/div[2]/ul/li[1]")
    static WebElement insurerOccupation1stOption;
    
    @FindBy(xpath=".//*[@id='menu-insurerOccupation']/div[2]/ul/li[2]")
    static WebElement insurerOccupation2ndOption;
    
    @FindBy(xpath=".//*[@id='menu-insurerOrganizationType']/div[2]/ul/li[1]")
    static WebElement insurerOrganizationType1stOption;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
    static WebElement maritalStatusInsurersDetails;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div/div/div/div/div[@role=\"button\"]")
    static WebElement industryTypeInsurersDetails;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div/div/div/div/div[@role=\"button\"]")
    static WebElement organizationTypeInsurersDetails;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
    static WebElement occupationInsurersDetails;
    
    @FindBy(xpath="//span[(text()=\"Do you have any life or Critical Illness insurance policy issued,pending approval from any other insurance companies or has your application for Life/Health/Critical Illness insurance or its reinstatement ever been offered at modified terms,rejected or postponed?\")]")
    static WebElement CritiaclIllnessInsurersDetails;
    
    @FindBy(xpath="//span[(text()=\"Do you participate or do you intend to participate in any hazardous activities as part of your Occupation/ Sports/ Hobby?\")]")
    static WebElement hazardousInsurersDetails;
    
    @FindBy(xpath="//span[(text()=\"Have you ever been convicted or are you under investigation for any criminal charges ?\")]")
    static WebElement criminalChargesInsurersDetails;
    
    @FindBy(xpath="//span[(text()=\"Height\")]")
    static WebElement heightInsurersDetails;
    
    @FindBy(xpath="//span[(text()=\"Weight\")]")
    static WebElement weightInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerCriticalIllnessYes')]")
    static WebElement InsurerCriticalIllnessYesInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerCriticalIllnessNo')]")
    static WebElement InsurerCriticalIllnessNoInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerHazardousActivitiesYes')]")
    static WebElement InsurerHazardousActivitiesYesInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerHazardousActivitiesNo')]")
    static WebElement InsurerHazardousActivitiesNoInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerCriminalChargesYes')]")
    static WebElement InsurerCriminalChargesYesInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerCriminalChargesNo')]")
    static WebElement InsurerCriminalChargesNoInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'InsurerCriminalChargesNo')]")
    static WebElement nationalityInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'Insurer2') and text()='Indian']")
    static WebElement nationalityIndianInsurersDetails;
    
    @FindBy(xpath="//label[contains(@for, 'Insurer3') and text()='NRI']")
    static WebElement nationalityNRIInsurersDetails;
    
    @FindBy(xpath="//input[@name='insurerEducation']")
    static WebElement insurerEducationIInsurersDetails;
    
    @FindBy(xpath="//input[@name='insurerMaritalStatus']")
    static WebElement insurerMaritalStatusIInsurersDetails;
    
    @FindBy(xpath="//input[@name='insurerIndustryType']")
    static WebElement insurerIndustryTypeInsurersDetails;
    
    @FindBy(xpath="//input[@name='insurerOrganizationType']")
    static WebElement insurerOrganizationTypeInsurersDetails;
    
    @FindBy(xpath="//input[@name='insurerOccupation']")
    static WebElement insurerOccupationInsurersDetails;
  
    @FindBy(xpath="//input[@name='insurerProofType']")
    static WebElement dobProofInsurersDetails;
    
    
 // Initializing the Objects
 	public JourneyScreenOne(WebDriver driver)
 	{
 		PageFactory.initElements(driver, this);
 	}
 	
 	public static void dependentTypeOfVisa() throws Exception {
			click(dependentTypeOfVisa);
			}
 	
 	public static void insurerOrganizationType1stOption() throws Exception {
 		Thread.sleep(1000);
 		click(insurerOrganizationType1stOption);
		
		
		
		}
 	
 	public static void insurerOccupation1stOption() throws Exception {
 		Thread.sleep(1000);
 		click(insurerOccupation1stOption);
		
		
		
		}
 	
 	public static void industryTypeInsurersDetails() throws Exception {
		click(industryTypeInsurersDetails);
		
		}
 	
 	
 	public static void maritalStatusInsurersDetails() throws Exception {
		click(maritalStatusInsurersDetails);
		
}
 	public static void organizationTypeInsurersDetails() throws Exception {
		click(organizationTypeInsurersDetails);
		
		
}
 	public static void occupationInsurersDetails() throws Exception {
		click(occupationInsurersDetails);
		
		
}
	
 	
 	public static void dobProof1stOption() throws Exception {
        Thread.sleep(1000);
		click(dobProofInsurers1stOption);
		
	}
 	
 	public static void eductionInsurersDetails() throws Exception {
 		
			click(eductionInsurersDetails);
		}
 	
 	public static void educationInsurers1stOption() throws Exception {
        Thread.sleep(1000);
		click(educationInsurers1stOption);
		
	}
 	

 	public static void InsurersIndustryType1stOption() throws Exception {
        Thread.sleep(1000);
		click(InsurersIndustryType1stOption);
		
	}
 	
 	public static void InsurersIndustryTypeOthersOption() throws Exception {
        Thread.sleep(1000);
		click(InsurersIndustryType7thOption);
		
	}
 	
 	public static void insurerMaritalStatus1stOption() throws Exception {
        Thread.sleep(1000);
		click(insurerMaritalStatus1stOption);
		
	}
 	
 	public static void insurersOtherDetailsPressSupress() throws Exception {

		click(insurersOtherDetailsPressSupress);
	}
 	
 	public static void dOBProofInsurersDetails() throws Exception {
		click(dOBProofInsurersDetails);
		String xpathForedOBProofInsurersDetailsDropDown="//*[@id='menu-insurerProofType']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathForedOBProofInsurersDetailsDropDown,4,7);
  		dobProof1stOption();
 	}
 	
 	public static void dOBProofInsurersDetailsOption() throws Exception {

 		click(dOBProofInsurersDetails);
  		dobProof1stOption();
 	}
 	
 	
 	public static void maritalStatusDropDownInsurersDetails() throws Exception {
 		maritalStatusInsurersDetails();
 		String xpathForedOBProofInsurersDetailsDropDown="//*[@id='menu-insurerMaritalStatus']/div[2]/ul/li";
 		comparingExcelDataWithUI(xpathForedOBProofInsurersDetailsDropDown,5,0);
  		insurerMaritalStatus1stOption();
 	}
 	
 	public static void maritalStatusDropDownInsurersDetailsOptionSelection() throws Exception {
 		maritalStatusInsurersDetails();
  		insurerMaritalStatus1stOption();
 	}
		
		
		
 	public static void InsurersIndustryType() throws Exception {
 		Thread.sleep(500);
 		waitTillElementToBeClickable(insurersIndustryType);
 		insurersIndustryType.click();
 		String xpathForedOBProofInsurersDetailsDropDown="//*[@id='menu-insurerIndustryType']/div[2]/ul/li";
 		comparingExcelDataWithUI(xpathForedOBProofInsurersDetailsDropDown,5,1);
  		InsurersIndustryType1stOption();
 	}
 	
 	public static void insurersIndustryTypeOptionSelection() throws Exception {
 		Thread.sleep(500);
 		waitTillElementToBeClickable(insurersIndustryType);
 		insurersIndustryType.click();
 		InsurersIndustryTypeOthersOption();
 	}
 	
 	
 	public static void industryDropDownListOptionSelectionValidationInsurer() throws Exception {
 		Thread.sleep(500);
 		for (int i = 1; i <= 7; i++) {
		waitTillElementToBeClickable(insurersIndustryType);
		Thread.sleep(500);
		insurersIndustryType.click();
			waitTillElementToBeClickable(driver.findElement(By.xpath(".//*[@id='menu-insurerIndustryType']/div[2]/ul/li[" + i + "]")));
			driver.findElement(By.xpath(".//*[@id='menu-insurerIndustryType']/div[2]/ul/li[" + i + "]")).click();
			Thread.sleep(2000);
			switch (i) {
			case 1:
				if (labledAreYouCurrentlyPostedInsurer.isDisplayed()&&noOptionForCurrentlyPostedInsurer.isDisplayed()&&yesOptionForCurrentlyPostedInsurer.isDisplayed()) {

					System.out.println("All the feilds are present as per drop down option i.e DEFENCE(Screen Three Insureres details)");
				} else {
					Assert.fail("All the feilds are not present as per  drop down option i.e DEFENCE(Screen Three Insureres details)");
				}
				break;
			case 2:
				if (labledAreYouProfessionalDiverInsurer.isDisplayed()&&noOptionForCurrentlyPostedInsurer.isDisplayed()&&yesOptionForCurrentlyPostedInsurer.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per drop down option i.e DIVING(Screen Three Insureres details) ");
				} else {
					Assert.fail("All the feilds are not present as per drop down option i.e DIVING(Screen Three Insureres details)");
				}

				break;
			case 3:
				if (labledAreYouBasedAtOffshoreOrTravOffshoreInsurer.isDisplayed()&&noOptionForCurrentlyPostedInsurer.isDisplayed()&&yesOptionForCurrentlyPostedInsurer.isDisplayed()) {

					System.out.println("All the feilds are present as per drop down option i.e OIL & NATURAL GAS(Screen Three Insureres details)");
				} else {
					Assert.fail("All the feilds are not present as per drop down option i.e OIL & NATURAL GAS(Screen Three Insureres details)");
				}
				break;
			case 4:
				if (typeOfVesselWhereWorkingInsurers.isDisplayed()) {
					Thread.sleep(200);
					typeOfVesselWhereWorkingInsurers.click();
					Thread.sleep(200);
					String xTypeOfVesselWhereWorkingInsurer=".//*[@id='menu-vesselTypeOfInsurer']/div[2]/ul/li";
					comparingExcelDataWithUI(xTypeOfVesselWhereWorkingInsurer,9,5);
					typeOfVesselWhereWorking1stOptionInsurers.click();
					Thread.sleep(200);
				}
				break;
			case 5:
				if (doesOurRoleInvolveGoingInsideAnyKindOfMineInsurer.isDisplayed()&&haveYouEverHadIllnessRelatedToYourOccupationInsurers.isDisplayed()
						&&yesDoesYourRoleGoingInsideMineInsurer.isDisplayed()&&noDoesYourRoleGoingInsideMineInsurer.isDisplayed()&&yesHaveYouEverHadIllnessRelatedToYourOccuoationInsurer.isDisplayed()
						&&noHaveYouEverHadIllnessRelatedToYourOccuoationInsurer.isDisplayed()) {

					System.out.println("All the feilds are present as per drop down industry type mining");
				} else {
					Assert.fail("All the feilds are not present as per drop down industry type mining");
				}break;
			
			case 6:
				if(exactNatureOfDutiesInsurer.isDisplayed()&&flyingRoleInsurer.isDisplayed()&&nonFlyingRoleInsurer.isDisplayed()) {
					System.out.println("All the feilds are present as per drop down industry type Aviation/AirForce");
				}else {
					Assert.fail("All the feilds are not present as per drop down industry type Aviation/AirForce");
				}
				break;
				
			case 7:
				Thread.sleep(200);
			}
		}
	}
 	
 	
 	
 	
 	
 	
 	public static void organizationTypeInsurersDetailsDropDown() throws Exception {
 		organizationTypeInsurersDetails();
 		String xpathForedOBProofInsurersDetailsDropDown="//*[@id='menu-insurerOrganizationType']/div[2]/ul/li";
 		comparingExcelDataWithUI(xpathForedOBProofInsurersDetailsDropDown,5,2);
  		insurerOrganizationType1stOption();
 	}
 	
 	public static void organizationTypeInsurersDetailsDropDownOptionSelection() throws Exception {
 		organizationTypeInsurersDetails();
  		insurerOrganizationType1stOption();
 	}
 	
 	public static void educationInsurersDetails() throws Exception {
		eductionInsurersDetails();
		String xpathForeducationInsurersDetailsDropDown="//*[@id='menu-insurerEducation']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathForeducationInsurersDetailsDropDown,3,17);
  		educationInsurers1stOption();
 	}
 	
 	public static void educationInsurersDetailsOptionSelection() throws Exception {

 		eductionInsurersDetails();
  		educationInsurers1stOption();
 	}
 	
 	public static void checkInsureresNameOfCompanyDisplayingWhenSalariedSelected() throws Exception {
		Thread.sleep(200);
 		if(isElementDisplayed(IssureresCompanyNameWhenSalariedFromOccupationSelected)) {
			System.out.println("Test case pass:As name of company is displaying when salaried option is selected from occupation");
		}else {
			Assert.fail("Test case fail As name of company is not displaying when salaried option is selected from occupation");
		}
	   waitTillElementToBeClickable(occupationInsurersDetails);
	   Thread.sleep(200);
	   occupationInsurersDetails.click();
		Thread.sleep(200);
		waitTillElementToBeClickable(occupation2ndOption);
		Thread.sleep(200);
		occupation2ndOption.click();
		Thread.sleep(200);
	}


	public static void occupationInsurersDetailsDropDown() throws Exception {
 		Thread.sleep(500);
 		waitTillElementVisible(occupationInsurersDetails);
 		occupationInsurersDetails.click();
		String xOccupation="//*[@id='menu-insurerOccupation']/div[2]/ul/li";
        comparingExcelDataWithUI(xOccupation, 9, 7);
        Thread.sleep(500);
        waitTillElementToBeClickable(insurerOccupation1stOption);
		insurerOccupation1stOption();
		checkInsureresNameOfCompanyDisplayingWhenSalariedSelected();
 	}
	
	public static void occupationInsurersDetailsDropDownOptionSelection() throws Exception {
 		Thread.sleep(500);
 		waitTillElementVisible(occupationInsurersDetails);
 		occupationInsurersDetails.click();
        Thread.sleep(500);
        waitTillElementToBeClickable(insurerOccupation2ndOption);
        insurerOccupation2ndOption.click();
 	}
 	
 	
 	public static void relationshipWithProposer() throws Exception {

		click(relationshipWithProposer);
		Thread.sleep(200);
		
	}
 	
 	public static void relationshipWithProposerParentOption() throws Exception {

		click(relationshipWithProposerParentOption);
		Thread.sleep(200);
		
	}
 	
 	public static void insurersGenderMale() throws Exception {

 		click(insurersGenderMale);
	}
 	
 	public static void insurersGenderFemale() throws Exception {

 		click(insurersGenderFemale);
 		
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
	
 	
 	public static void optionNRI() throws Exception {

		click(optionNRI);
		
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
 		
 		public static void insureresOtherDetailsIsPresent() throws Exception {
 			if(insurersOtherDetails.isDisplayed()) {
 				System.out.println("Test case pass:-As isureres other details section is present");
 			}else {
 				Assert.fail("Test case fail:-As isureres other details section is not present");
 			}
 		}
 //Not working fuctionality press/supress	
 		public static void feildSupressFuctionalityInsurersDetails() throws Exception {
 			System.out.println("just after landed no press"  +driver.findElement(By.xpath("//input[@name='insurerAnnualIncome']")).isEnabled());
 			/*if(insurersOtherDetailsSection.isDisplayed()) {
 				Assert.fail("Test case Fail:-'SCREEN THREE'As feilds supress fuctionality for insurers details is not working");
 			}else {
 				System.out.println("Test case pass:-'SCREEN THREE'As feilds supress fuctionality for insurers details working");
 			}
 			Thread.sleep(1000);*/
 			Thread.sleep(10000);
 			insurersOtherDetailsPressSupress();
 			System.out.println("after press"  +driver.findElement(By.xpath("//input[@name='insurerAnnualIncome']")).isEnabled());
 			
 			
 		}
 	
 		
 		 // Select NRI as an nationality 
 		public static void selectNRI() throws Exception {
          System.out.println("1111111111111111111");
          boolean e=NRIbtn.isEnabled();
          System.out.println(e);
          waitTillElementVisible(NRIbtn);
          boolean d=NRIbtn.isDisplayed();
          System.out.println(d);
          click(optionNRI);
          //waitTillElementVisible(NRIbtn);
 			
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
		
		public static boolean checkAdhaarErrorMsgMultipleData() throws Exception {
			File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
			//int totalNumOfRows = sheet.getLastRowNum();
			//System.out.println("\n Total num of rows found " + totalNumOfRows);
			
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
			String aadharNumberFromUI=AadharTxtfld.getAttribute("value");
			Thread.sleep(200);
		//	driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
			Thread.sleep(200);
			System.out.println("i am talking abot this from excell"+"  " +aadharNumberFromExcell);
			System.out.print("i am talking about this from UI "+"       "+aadharNumberFromUI);
			if(aadharNumberFromUI.length()==12)
				
			{
				Thread.sleep(800);
				//System.out.println(isElementDisplayed(aadharErrorMsg));
			if(isElementDisplayed(aadharErrorMsg)) {
				
				Assert.fail("Test case fail:As error message for aadhaar number length 12 is displaying");
			}else {
				System.out.println("Test case pass:As error message for aadhaar number length 12 is not displaying");
			}
				
			}else  {
				
				System.out.println("i am in else");
				driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
				Thread.sleep(500);
				if(isElementDisplayed(aadharErrorMsg)) {
					System.out.println("Test case pass:As error message for aadhaar number length i.e != 12 is displaying");
					
				}else {
					
					Assert.fail("Test case fail:As error message for aadhaar number length i.e !=12 is not displaying");
					
				}
				
				
			}			
		}
		
		
		
        // Enter Aadhaar Number
		public static void setAadhar(int x, int y, int z) throws Exception {
			PageFactory.initElements(driver, JourneyScreenOne.class);
			AadharTxtfld.clear();
 			type(AadharTxtfld, readingdata(x, y, z));
 			String aAdharTxtfldPassedFromExcel=	AadharTxtfld.getAttribute("value");
 			int size = aAdharTxtfldPassedFromExcel.length();
 			if((size==12) && (!aAdharTxtfldPassedFromExcel.contains("A")&& !aAdharTxtfldPassedFromExcel.contains("*"))) 
 			{
 				logger.info("Test case pass:- As aadhar feild length is 12 and accepting only numbers");
 			}else 
 			{
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
			if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}")) 
			{ 
			System.out.println("Valid"); 
			} 
			else {
			System.out.println("Invalid"); 
			} 
			} 
		
		
        // Enter PAN Number
		public static void setPanNumber(int x, int y, int z) throws Exception {
 			//type(PanNumbertxtfld, strPanNumber);
 			PanNumbertxtfld.clear();
 			type(PanNumbertxtfld, readingdata(x, y, z));
 			String panNumberCPassedFromExcel=	PanNumbertxtfld.getAttribute("value");
 			int size = panNumberCPassedFromExcel.length();
 			if((size==10) && (panNumberCPassedFromExcel.contains("C")&& panNumberCPassedFromExcel.contains("4")&& !panNumberCPassedFromExcel.contains("#"))) 
 			{
 				logger.info("Test case pass:- As PAN feild length is 10 and accepting only alphabnumeric value and not accepting special character");
 			}else 
 			{
 				Assert.fail("Test case fail:-As either PAN feild length is not of 10 or not accepting only alphabnumeric value or accepting special character");
 			}
 			
		
		}
		
		public static boolean checkPANErrorMsgWithMultipleData() throws Exception {
			File file = new File(System.getProperty(AppConstant.USER_DIR) +AppConstant.MASTER_DATA_EXCELL);
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
		//	int totalNumOfRows = sheet.getLastRowNum();
		//	System.out.println("\n Total num of rows found " + totalNumOfRows);
			
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
			String aadharNumberFromUI=PanNumbertxtfld.getAttribute("value");
			System.out.println(aadharNumberFromUI);
			Thread.sleep(200);
			driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
			Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
			Matcher matcher = pattern.matcher(aadharNumberFromUI);
			if(matcher.matches())
			{
				
			if(isElementDisplayed(PANErrorMsg)) {
				Assert.fail("Test case fail as error message is displaying but PAN number is correct");
			}else {
				System.out.println("Test case pass:As error message for correct PAN number error message is not displaying");
			}
				
			}else  {
				if(isElementDisplayed(PANErrorMsg)) {
				System.out.println("Test case pass:As error message for correct PAN number error message is not displaying");
				}else {
					Assert.fail("Test case fail as error message is displaying but PAN number is correct");	
				}
			}			
		}
      
      
      
      
      public static void validatingErrorMsgForPhoneNumberScreenOne(XSSFSheet sheet, int rowNum) throws Exception {
			System.out.println("\n Going to pick run test cases for row number " + rowNum);
			XSSFCell phoneNumber = sheet.getRow(rowNum).getCell(2);
			String phoneNumberFromExcell = phoneNumber.getStringCellValue();
			System.out.println("From excell "+phoneNumberFromExcell);
			MobNumtxtfld.click();
			Thread.sleep(200);
			MobNumtxtfld.clear();
			Thread.sleep(200);
			MobNumtxtfld.sendKeys(phoneNumberFromExcell);
			
			String phoneNumberFromUI=MobNumtxtfld.getAttribute("value");
			System.out.println(phoneNumberFromUI);
			Thread.sleep(200);
			driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
			
			if(phoneNumberFromUI.length()==10)
			{
				
			if(isElementDisplayed(phoneNumberErrorMsg)) {
				Assert.fail("Test case fail as error message is displaying for correct phone number");
			}else {
				System.out.println("Test case pass:As error message for correct phone number is not displaying");
			}
				
			}else  {
				if(isElementDisplayed(phoneNumberErrorMsg)) {
					System.out.println("Test case pass:As error message for wrong phone number is displaying");
					
				}else {
						
					Assert.fail("Test case fail as error message is not displaying for wrong phone number");
				}
			}			
		}
		
      
      public static boolean checkPhoneNumberErrorMsgWithMultipleData() throws Exception {
			File file = new File(System.getProperty(AppConstant.USER_DIR) +AppConstant.MASTER_DATA_EXCELL);
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
			//int totalNumOfRows = sheet.getLastRowNum();
			//System.out.println("\n Total num of rows found " + totalNumOfRows);
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
		 			//type(MobNumtxtfld, strMobNumber);
		 			MobNumtxtfld.clear();
		 			type(MobNumtxtfld, readingdata(x, y, z));
		 			String mobile=MobNumtxtfld.getAttribute("value");
		 			System.out.println(mobile);
		 			
		 			
				}
		
        // Enter Mobile Number
		public static void setMobNumber(int x, int y, int z) throws Exception {
 			//type(MobNumtxtfld, strMobNumber);
 			MobNumtxtfld.clear();
 			type(MobNumtxtfld, readingdata(x, y, z));
 			String mobileNumberPassedFromExcel=	MobNumtxtfld.getAttribute("value");
 			int size = mobileNumberPassedFromExcel.length();
 			if((size==10) && (!mobileNumberPassedFromExcel.contains("A")&& mobileNumberPassedFromExcel.contains("9")&& !mobileNumberPassedFromExcel.contains("@"))) 
 			{
 				logger.info("Test case pass:- As Mobile number feild length is 10 and accepting only numeric value,not accepting special character and alphabets ");
 			}else 
 			{
 				Assert.fail("Test case fail:-As either Mobile number feild length is not 10 or not accepting only numeric value,accepting special character or alphabets");
 			}

 		}
		
public static void preFixOfMobileNumber(int x, int y, int z) throws Exception {
			
	if(preFixOfMobileNumber.isDisplayed()){
		
	}else 
	{
		
	}
 			
 		}
		
        // Enter Email id
		public static void setEmailId(int x, int y, int z) throws Exception {
 			//type(Emailtxtfld, strEmailId);
 			Emailtxtfld.clear();
 			type(Emailtxtfld, readingdata(x, y, z));
 			String emailPassedFromExcel=	Emailtxtfld.getAttribute("value");
 			/*int size = emailPassedFromExcel.length();
 	 		  if(emailPassedFromExcel.endsWith("@gmail.com")||emailPassedFromExcel.endsWith("@monocept.com") ) {
 	 			logger.info("Test case pass:-As entered email format is correct ");  
 	 		  }else
 	 		  {
 	 			  Assert.fail("Test case fail:-As entered email format is not correct");
 	 		  } */
 			
 			
 			if (isValid(emailPassedFromExcel)) {
 				 System.out.println("Test case pass:As email ID is valid");
					
				 }else {
					 Assert.fail("Test case fail As email ID is not valid");
				 }
				 

 		}
		
		public static boolean checkEmailErrorMsgWithMultipleData() throws Exception {
			File file = new File(System.getProperty(AppConstant.USER_DIR) +AppConstant.MASTER_DATA_EXCELL);
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = hssfWorkbook.getSheetAt(1);
			//int totalNumOfRows = sheet.getLastRowNum();
			//System.out.println("\n Total num of rows found " + totalNumOfRows);
			
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
			String eEmailIDFromUI=Emailtxtfld.getAttribute("value");
			driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
			System.out.println(eEmailIDFromUI);
			 if (isValid(eEmailIDFromUI)) {
				 if(isElementDisplayed(emailIdErrorMessage)) {
					 Assert.fail("Test case fail as error message is displaying with correct email ID");
				 }else {
					 System.out.println("Test case pass:As error message is not displaying with correct email ID");
				 }
				 
		            }
		        else {
		        	Thread.sleep(200);
		        	 if(isElementDisplayed(emailIdErrorMessage)) {
		        		 System.out.println("Test case pass as error message is displaying with incorrect email ID");
					 }else {
						 Assert.fail("Test case fail:As error message is not displaying with incorrect email ID");
					 } 
		    } 
     
      
      }
		
        // Enter PreIssuance Verification Number
		public static void setPreIssuanceNumber(int x, int y, int z) throws Exception {
			
 			//type(PreIssuancetxtfld, strPreIssuance);
 			PreIssuancetxtfld.clear();
 			type(PreIssuancetxtfld, readingdata(x, y, z));
 			String preIssuranceNumberPassedFromExcel=	PreIssuancetxtfld.getAttribute("value");
 		//	int size = preIssuranceNumberPassedFromExcel.length();
 	 		  if(preIssuranceNumberPassedFromExcel.length()==8) {
 	 			logger.info("Test case pass:-As entered preInsurance number is of expected length");  
 	 		  }else
 	 		  {
 	 			  Assert.fail("Test case fail:-As entered preInsurance number is not of expected length");
 	 		  } 	 		  

 		}
 			

		public static void fillingAnnualIncomeTOProceed(int x, int y, int z) throws Exception {
			waitTillElementVisible(annualIncomePersonalDetailsDependent);
			Thread.sleep(200);
			annualIncomePersonalDetailsDependent.clear();
 			type(annualIncomePersonalDetailsDependent, readingdataTestData(x, y, z));
 			Proceedbtn.click();
 			Thread.sleep(200);
			
 		}
		
 	
		public static boolean annualIncomePersonalDetailsDependent() throws Exception {
			Thread.sleep(200);
			File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.TEST_DATA_EXCELL);
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = hssfWorkbook.getSheetAt(0);
			int totalNumOfRows = sheet.getLastRowNum();
			System.out.println("\n Total num of rows found " + totalNumOfRows);
			
			for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
				validatingPANPopupForAnnualIncomePersonalDetailsDependent(sheet, rowNum);
			}
			hssfWorkbook.close();
			return false;
		}
		
		
		public static void validatingPANPopupForAnnualIncomePersonalDetailsDependent(XSSFSheet sheet, int rowNum) throws Exception {
			System.out.println("\n Going to pick run test cases for row number " + rowNum);
			XSSFCell cellRep = sheet.getRow(rowNum).getCell(2);
			String annualIncomePersonalDetailsData = cellRep.getStringCellValue();
			System.out.println("\n Duplicate value picked to run " + annualIncomePersonalDetailsData);
			annualIncomePersonalDetailsDependent.clear();
			annualIncomePersonalDetailsDependent.sendKeys(annualIncomePersonalDetailsData);
			JourneyScreenTwo.clickSubmitButton();
			Thread.sleep(500);
		/*	
			WebDriverWait wait = new WebDriverWait(driver, 70);
		    wait.until(ExpectedConditions.or(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='alert-dialog-title']/h2[(text()=\"Update PAN Number\")]")),
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[(text()=\"FORM 60 Related Details\")]")
		    )));*/
		    int convertingannualIncomeStringToInt = Integer.parseInt(annualIncomePersonalDetailsData);
				try {
					if(isElementDisplayed(updatePANPOPUP)) {
						if(convertingannualIncomeStringToInt>=250000) {
						System.out.println("Test case pass:As income is more than 250000 and PAN popup is coming");
						}else {
						Assert.fail("Test case fail:As income is more than 250000 and PAN popup is not coming");
						}
						escapeFunction();
				} else {
						if(convertingannualIncomeStringToInt<250000) {
					   System.out.println("Test case pass as income is less than 250000 and PAN popup is displaying");
						}else {
					Assert.fail("Test case fail:As income is less than 250000 and PAN popup is coming");
						}
						Thread.sleep(500);
						 driver.findElement(By.xpath("//span[contains(text(),\"Personal Details 2\")]")).click();
					
					}
				}catch(Exception e)     
			  {  
				System.out.println(e);
				      
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

			click(Proceedbtn);
			
		}
		
		public static void isIndianSelected() throws Exception {
 	   		PageFactory.initElements(driver, JourneyScreenOne.class);
			if(Indianbtn.isSelected())
			{		
			logger.info("Indian is selected");
			}
			else
			{
			logger.info("Indian is not selected");
			}
			
	}
			
		public static void isSelfSelected() throws Exception {
			//PageFactory.initElements(driver, JourneyScreenOne.class);
			if(Selfbtn.isSelected())
			{		
			logger.info("Self is selected");
			}
			else
			{
			logger.info("Self is not selected");
			}
			
	}	
		
		public static void isDontHaveAadharEnabled() throws Exception {
			if(DonthaveAadharLink.isDisplayed())
			{		
			logger.info("Don't have aadhar Link is enabled by default");
			}
			else
			{
			logger.info("Don't have aadhar Link is not enabled by default");
			}
			
	}	
  
		public static void isProceedEnabled() throws Exception {
			if(Proceedbtn.isEnabled())
			{		
			logger.info("Proceed button is enabled by default");
			}
			else
			{
			logger.info("Proceed button is not enabled by default");
			}
		}

			public static void isAllTheFeildsOfNRIDisplayed() throws Exception {
				optionNRI();
				if(passportNumberNRI.isDisplayed()&&visaValidDateNRI.isDisplayed()&&pasportIssuingCountryNRI.isDisplayed()
						&&policyForNRI.isDisplayed()&&selfNRI.isDisplayed()&&dependentNRI.isDisplayed()&&CompanyNRI.isDisplayed()
						&&AadhaarNRI.isDisplayed()&&PanNumberNRI.isDisplayed()&&isdCodeNRI.isDisplayed()&&mobileNumberNRI.isDisplayed()&&
						emailAddressNRI.isDisplayed()&&preIssuranceVerificationNRI.isDisplayed())
				{		
				logger.info("Test Case Pass as all the feilds of NRI is displayed");
				}
				else
				{
				Assert.fail("Test Case fail as all the feilds of NRI is not displayed");
				}
				
		
		
		}
		

		
			public static void isAllTheTypeOfVisaListIsPresent() throws Exception {
			typeOfVisa();
			String xtypeOfVisa=".//*[@id='menu-passportVisaType']/div[2]/ul/li";
			String sheetPath=AppConstant.TEST_DATA_EXCELL;
			comparingExcelDataWithUIBySheetPath(xtypeOfVisa, 1, 2, sheetPath);	
			
				dependentTypeOfVisa();
			
			}
			public static void setPassportNumber(int x, int y, int z) throws Exception {
	 			//type(MobNumtxtfld, strMobNumber);
				passportTextfld.clear();
	 			type(passportTextfld, readingdata(x, y, z));
	 			String passportNumberPassedFromExcel=	passportTextfld.getAttribute("value");
	 			int size = passportNumberPassedFromExcel.length();
	 			if((size==20) && (passportNumberPassedFromExcel.contains("@"))) 
	 			{
	 				logger.info("Test case pass:- As Passport number feild length is 20 and not accepting special character ");
	 			}else 
	 			{
	 				Assert.fail("Test case fail:-Test case pass:- As Passport number feild length is either not of 10 or accepting special character");
	 			}

	 		}

			public static void passportIssuingCountry(int x, int y, int z) throws Exception {
	 			//type(MobNumtxtfld, strMobNumber);
				passportIssuingCountry.clear();
	 			type(passportIssuingCountry, readingdata(x, y, z));
	 			passportIssuingCountryOptionSelection();
	 			String passportIssuingCountryFromUI=	passportIssuingCountry.getAttribute("value");
	 			if(passportIssuingCountryFromUI.contains("India")) 
	 			{
	 				logger.info("Test case pass:- As Smart search is working");
	 			}else 
	 			{
	 				Assert.fail("Test case fail:-As Smart search is not working");
	 			}

	 		}
			
			public static void isdCode(int x, int y, int z) throws Exception {
	 			//type(MobNumtxtfld, strMobNumber);
				Thread.sleep(200);
				isdCode.clear();
	 			type(isdCode, readingdata(x, y, z));
	 			Thread.sleep(200);
	 			driver.findElement(By.xpath(".//*[@id='react-autowhatever-1--item-0']/div[1]")).click();
	 			Thread.sleep(200);
				String isdCodeFromUI=	isdCode.getAttribute("value");
				if(isdCodeFromUI.equals("+91")) {
					logger.info("Test case pass:-As ISD code feild carry +91 when select India");
				}
				else {
					Assert.fail("Test Case fail:-As ISD code feild dont have +91 when India is selected");
				}
	 			
	 		}
			public static void checkIsurersDetailsIsPresent() throws Exception {
	 			//type(MobNumtxtfld, strMobNumber);
				if(insurersDetails.isDisplayed())
				{
					logger.info("Test case pass:-As Isurers Details section is present");
				}
				else {
					Assert.fail("Test case fail:-As Isurers Details section is not present");
				}
	 			
	 		}

			public static void checkAllTheIsurersDetailsFeildsIsPresentForScreenThree() throws Exception {
				System.out.println("i ma checking");
				if(dobProofInsurersDetails.isEnabled()&&fathersNameInsurersDetails.isDisplayed()&&CritiaclIllnessInsurersDetails.isDisplayed()&&hazardousInsurersDetails.isDisplayed()&&
						criminalChargesInsurersDetails.isDisplayed()&&heightInsurersDetails.isDisplayed()&&weightInsurersDetails.isDisplayed()&&
						InsurerCriticalIllnessYesInsurersDetails.isDisplayed()&&InsurerCriticalIllnessNoInsurersDetails.isDisplayed()&&
						InsurerHazardousActivitiesYesInsurersDetails.isDisplayed()&&InsurerHazardousActivitiesNoInsurersDetails.isDisplayed()&&
						InsurerCriminalChargesYesInsurersDetails.isDisplayed()&&InsurerCriminalChargesNoInsurersDetails.isDisplayed()&&nationalityInsurersDetails.isDisplayed()
						&&nationalityIndianInsurersDetails.isDisplayed()&&nationalityNRIInsurersDetails.isDisplayed()&&
						insurerEducationIInsurersDetails.isEnabled()&&insurerMaritalStatusIInsurersDetails.isEnabled()&&insurerIndustryTypeInsurersDetails.isEnabled()
						&&insurerOrganizationTypeInsurersDetails.isEnabled()&&insurerOccupationInsurersDetails.isEnabled()) {
					System.out.println("Test case pass:-As all the required feilds for insurers details for screen three is present");
				}	else {
					Assert.fail("Test case fail:-As all the required feilds for insurers details for screen three is not present");
				}
			}

			
			
			public static void fatherNameInsurersDetails(int x, int y, int z) throws Exception {
				fathersNameInsurersDetails.clear();
	 			type(fathersNameInsurersDetails, readingdata(x, y, z));
	 			String firstNamePassedFromExcel=	fathersNameInsurersDetails.getAttribute("value");
	 			int size = firstNamePassedFromExcel.length();
	 			if((size==25 && !firstNamePassedFromExcel.contains("@") && !firstNamePassedFromExcel.contains("1") )) 
	 			{
	 				logger.info("Test case pass:- As father Name InsurersDetails is 25 and accepting only alphabets");
	 			}else 
	 			{
	 				Assert.fail("Test case fail:- As either father Name InsurersDetails is not 25 or not accepting only alphabets");
	 			}}
	 			
	 			public static void setfatherNameInsurersDetails(int x, int y, int z) throws Exception {
					fathersNameInsurersDetails.clear();
		 			type(fathersNameInsurersDetails, readingdata(x, y, z));
		 			
	 			
			
			
			}
			public static void checkAllTheIsurersDetailsFeildsDropDownListIsPresentForScreenThree() throws Exception {
				fatherNameInsurersDetails(3,1,0);
				dOBProofInsurersDetails();
                educationInsurersDetails();
				maritalStatusDropDownInsurersDetails();
				InsurersIndustryType();
				industryDropDownListOptionSelectionValidationInsurer();
				organizationTypeInsurersDetailsDropDown();
				occupationInsurersDetailsDropDown();
			
			}
			
			
			public static void isurersDetailsFeildsDropDownForScreenThree() throws Exception {
				setfatherNameInsurersDetails(3,1,0);
				dOBProofInsurersDetailsOption();
				educationInsurersDetailsOptionSelection();
				maritalStatusDropDownInsurersDetailsOptionSelection();
				insurersIndustryTypeOptionSelection();
				organizationTypeInsurersDetailsDropDownOptionSelection();
				occupationInsurersDetailsDropDownOptionSelection();
				selectingNoOptionAndIndianForAllMedicalQusetion();
			    weightPersonalDetailsDependent(0,1,0);
				insurerOtherDetailsAnnualIncome(0,1,1);
			}
			
			
			public static void selectingNoOptionAndIndianForAllMedicalQusetion() throws Exception {
			    Thread.sleep(200);
				waitTillElementToBeClickable(indianInsurerNationality);
			    indianInsurerNationality.click();
				waitTillElementToBeClickable(InsurerCriminalChargesNoInsurersDetails);  
				InsurerCriminalChargesNoInsurersDetails.click();
				waitTillElementToBeClickable(InsurerHazardousActivitiesNoInsurersDetails);
				InsurerHazardousActivitiesNoInsurersDetails.click();
				waitTillElementToBeClickable(InsurerCriticalIllnessNoInsurersDetails);
				InsurerCriticalIllnessNoInsurersDetails.click();
				selectingFeetInchesWeight();
				
				
			}			
			
			public static void insurerOtherDetailsAnnualIncome(int x, int y, int z) throws Exception {
				Thread.sleep(200);
				insurerOtherDetailsAnnualIncome.clear();
	 			type(insurerOtherDetailsAnnualIncome, readingdataTestData(x, y, z));
				
	 			

	 		}
			
			public static void weightPersonalDetailsDependent(int x, int y, int z) throws Exception {
				Thread.sleep(200);
				weightPersonalDetailsDependent.clear();
	 			type(weightPersonalDetailsDependent, readingdataTestData(x, y, z));
				
	 		}
			
			public static void selectingFeetInchesWeight() throws Exception {
				Thread.sleep(200);
				waitTillElementToBeClickable(feetPersonalDetailsDependent);
				feetPersonalDetailsDependent.click();
				waitTillElementToBeClickable(selectingFeetDropDownOptionSelection);
				selectingFeetDropDownOptionSelection.click();
				Thread.sleep(500);
				waitTillElementToBeClickable(inchPersonalDetailsDependent);
				inchPersonalDetailsDependent.click();
				waitTillElementToBeClickable(selectingInchesDropDownOptionSelection);
				selectingInchesDropDownOptionSelection.click();
				Thread.sleep(500);
				
			}
			
			
			
			 
			
			public static void checkAllTheInsurersDetailsFeildsPresentOrNot() throws Exception {
               if(insurersName.isDisplayed()&&insurersGenderMale.isDisplayed()&&insurersGenderFemale.isDisplayed()&&dateOfBirthIssurer.isDisplayed()&&
            		   relationshipWithProposer.isDisplayed())
               {
            	   System.out.println("Test case pass:As all the feilds for Insurers details on screen two is present");
            	   if(insurersGenderFemale.isSelected()&&insurersGenderMale.isSelected()) 
            	   {
            		   Assert.fail("Test case fail:-'SCREEN TWO'As Insuresr MALE/FEMALE is selected by default");
            	   }else {
            		   System.out.println("Test case pass:-'SCREEN TWO' As Insuresr MALE/FEMALE is not selected by default");
            	   }
               
               
               }else {
            	Assert.fail("Test case pass:'SCREEN TWO 'As all the feilds for Insurers details is not present");   
               }
				

	 		}
			
			
			public static void checkAndFillIssurersNameValidation(int x, int y, int z) throws Exception {
	 			//type(MobNumtxtfld, strMobNumber);
				insurersName.clear();
	 			type(insurersName, readingdata(x, y, z));
	 			String insurersNamePassedFromExcel=	insurersName.getAttribute("value");
	 			int size = insurersNamePassedFromExcel.length();
	 			if((size==25) && (!insurersNamePassedFromExcel.contains("@")&& insurersNamePassedFromExcel.contains("."))) 
	 			{
	 				logger.info("Test case pass:- As issurers name feild length is 25 and not accepting special character and numbers ");
	 			}else 
	 			{
	 				Assert.fail("Test case fail:- As issurers name feild length is either not of 25 or accepting special character or numbers");
	 			}

	 		}
			
			
			public static void fllIssurersNameValidation(int x, int y, int z) throws Exception {
	 			//type(MobNumtxtfld, strMobNumber);
				insurersName.clear();
	 			type(insurersName, readingdata(x, y, z));
	 			

	 		}
			
			public static void selectAndCheckRelationshipWithProposerOption() throws Exception {
	 			//type(MobNumtxtfld, strMobNumber);
				relationshipWithProposer();
				if(relationshipWithProposerSpouseOption.isDisplayed()&&relationshipWithProposerParentOption.isDisplayed()
						&& relationshipWithProposerGrandParentOption.isDisplayed()&& relationshipWithProposerOtherOption.isDisplayed())
				{
					logger.info("Test case pass:-As all the option of relationship with proposer dropdown is present ");
				}
				else {
					Assert.fail("Test case fail:-As all the option of relationship with proposer dropdown is not present");
				}
	 			
				relationshipWithProposerParentOption();
	 		}	
			

			public static void selectkRelationshipWithProposerOption() throws Exception {
	 			//type(MobNumtxtfld, strMobNumber);
				relationshipWithProposer();
				relationshipWithProposerParentOption();
	 		}
			


}
