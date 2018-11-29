package uielements;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import WebTest.JourneyScreenThreeTest;
import uielements.ReusableActions;

import ch.qos.logback.classic.Logger;
import jxl.Sheet;
import jxl.Workbook;
import net.bytebuddy.asm.Advice.Return;

public class JourneyScreenThree extends ReusableActions{
    
    
    private static final String Webelement = null;

	    
 // Initializing the Objects
 	public JourneyScreenThree(WebDriver driver)
 	{
 		PageFactory.initElements(driver, this);
 	}
 	
 // Locating Indian Nationality radio Button
    @FindBy(xpath="//label[text()='No']")
	public static WebElement payorDetailsNo;
    
    @FindBy(xpath="//span[text()='Proceed']")
	public static WebElement Proceedbtn;
    
    @FindBy(xpath="//span [(text()=\"Issued or Pending\")]")
   	public static WebElement labelIssuedOrPendingForCheckBox;
    
    @FindBy(xpath="//span [(text()=\"Offered at modified terms, rejected or postponed\")]")
   	public static WebElement labelOfferedAtModifiedTermsRejectedOrPostponedForCheckBox;
    
    @FindBy(xpath="//label[contains(@for, 'QA2Exit')]")
   	public static WebElement provideExistingEInsuranceAccountNumber;
    
    @FindBy(xpath="//label[contains(@for, 'QA2New')]")
   	public static WebElement openNewEInsuranceAccountNumber;
    
    @FindBy(xpath="//input[@name='eiAccountNo']")
   	public static WebElement enterEIANo;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[3]")
   	public static WebElement outsideClickScreenFour;
    
    
    @FindBy(xpath="//span [(text()=\"Preferred Insurance repository that you would like to have EIA with\")]")
   	public static WebElement labelPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith;
    //-----------------------------
    @FindBy(xpath="//span [(text()=\"Do you have any life or Critical Illness insurance policy issued, pending approval from any other insurance companies or has your application for Life/Health/Critical Illness insurance or its reinstatement ever been offered at modified terms, rejected or postponed?\")]")
   	public static WebElement labelCriticallIllness;
    
    @FindBy(xpath="//label[contains(@for, 'CriticalIllnessYes')]")
   	public static WebElement criticalIllnessYesOption;
    
    @FindBy(xpath="//label[contains(@for, 'CriticalIllnessNo')]")
   	public static WebElement criticalIllnessNoOption;
    
    @FindBy(xpath="//span [(text()=\"Do you participate or do you intend to participate in any hazardous activities as part of your Occupation/Sports/Hobby?\")]")
   	public static WebElement labelHazardousActivitiesAsOccupation;
    
    @FindBy(xpath="//label[contains(@for, 'HazardousActivitiesYes')]")
   	public static WebElement hazardousActivitiesYes;
    
    @FindBy(xpath="//span [(text()=\"To what extent you are involved in\")]")
   	public static WebElement labelToWhatExtentYouAreInvolvedInForHazardousYes;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[4]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
   	public static WebElement selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes;
    
    @FindBy(xpath=".//*[@id='menu-involvementExtend']/div[2]/ul/li[1]")
   	public static WebElement selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes1stOption;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[4]/div[2]/div/div/div/div/div[4]/div[1]/div/div[1]/div/div/div/div/div[@role=\"button\"]")
   	public static WebElement feetDropDown;
    
    @FindBy(xpath="//*[@id='menu-feet']/div[2]/ul/li[1]")
   	public static WebElement feetDropDown1stOption;
    
    @FindBy(xpath=".//*[@id='menu-inches']/div[2]/ul/li[1]")
   	public static WebElement inchesDropDown1stOption;
    
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[4]/div[2]/div/div/div/div/div[4]/div[1]/div/div[2]/div/div/div/div/div[@role=\"button\"]")
   	public static WebElement inchesDropDown;
    
    
    @FindBy(xpath="//label[contains(@for, 'HazardousActivitiesNo')]")
   	public static WebElement hazardousActivitiesNo;
    
    @FindBy(xpath="//span [(text()=\"Have you ever been convicted or are you under investigation for any criminal charges?\")] ")
   	public static WebElement labelHaveYouEverConvictedForCriminalCharges;
    
    @FindBy(xpath="//label[contains(@for, 'CriminalChargesYes')]")
   	public static WebElement criminalChargesYes;
    
    @FindBy(xpath="//label[contains(@for, 'CriminalChargesNo')]")
   	public static WebElement criminalChargesNo;
    
    @FindBy(xpath="//span [(text()=\"Height\")]")
   	public static WebElement labelHeight;
    
    @FindBy(xpath="//span [(text()=\"Weight\")]")
   	public static WebElement labelWeight;
    
    @FindBy(xpath="//input[@name='feet']")
   	public static WebElement labelFeet;
    
    @FindBy(xpath="//input[@name='inches']")
   	public static WebElement labelInches;
    
    @FindBy(xpath="//input[@name='weight']")
   	public static WebElement kgsTextBox;
    
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
   	public static WebElement selectPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith;
    
    @FindBy(xpath=".//*[@id='menu-preferredInsurance']/div[2]/ul/li[1]")
   	public static WebElement select1stOptionPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith;
    
    @FindBy(xpath=".//*[@id='menu-payorRelationship']/div[2]/ul/li[1]")
   	public static WebElement payorRelationship1stOption;
    
    @FindBy(xpath="//span[(text()=\"Don't Have PAN?\")]")
   	public static WebElement dontHavePANPayorDetails; 
  
    @FindBy(xpath=".//*[@id='react-autowhatever-1']/ul/li[1]")
   	public static WebElement state1stOption; 
    
    
    @FindBy(xpath="//*[@id='react-autowhatever-1--item-0']/div/div/span[contains(@style,'font-weight: 500;')]")
	public static WebElement stateDropDown; 
 				
    @FindBy(xpath="//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]//input[@placeholder='DD/MM/YYYY']")
    static WebElement dateOfBirth;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div/div/div/div/input[@placeholder='DD/MM/YYYY']")
    static WebElement visaValidTill;
    
    @FindBy(xpath="//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]//input[@placeholder='DD/MM/YYYY']")
    static WebElement dateOfBirthIssurer;
    
    @FindBy(xpath="//*[@id='client-snackbar']/div/span[(text()='Your bankAccountIFSC and bankAccountMICR has been validated.')]")
    static WebElement tosterMsgValidtaion;
    
    @FindBy(xpath="//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/input[@placeholder='DD/MM/YYYY']")
    static WebElement dateOfBirthNomineeDetails;
    
    @FindBy(xpath="//input[@name='nomineeName']")
    static WebElement nomineeName;
    
    @FindBy(xpath="//span[(text()=\"Male\")]")
    public static WebElement genderMale;
    
    @FindBy(xpath="//span[(text()=\"Female\")]")
    public static WebElement genderFemale;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[7]/div/div/div/div/div/div[@role=\"button\"]")
    public static WebElement relationshipPayorWithProposer;
    
    @FindBy(xpath="//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[@role=\"button\"]")
    public static WebElement relationshipWithNominee;
    
    @FindBy(xpath="//*[@id='menu-relationshipWithNominee']/div[2]/ul/li")
    static List<WebElement> relationshipWithNomineeDropDownOption;
    
    @FindBy(xpath="//*[@id='menu-relationshipWithNominee']/div[2]/ul/li[1]")
    static WebElement relationshipWithNomineeDropDown1stOption;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[3]/div[4]/div/div/div/div/div/div[@role=\"button\"]")
    static List<WebElement> typeOfAccount;
    
    @FindBy(xpath="//*[@id='menu-relationshipWithNominee']/div[2]/ul/li[@data-value=\"Other\"]")
    public static WebElement relationshipWithNomineDropdownOthersOption;
    
    @FindBy(xpath="//input[@name='RelationshipWithNomineeWhenOther']")
    public static WebElement RelationshipWithNomineeWhenOther;
    
    @FindBy(xpath="//input[@name='nominationReason']")
    public static WebElement ReasonForNomination;
    
    @FindBy(xpath="//input[@name='relationshipWithNomineeWhenOther']")
    public static WebElement relationshipWithNomineeWhenOther;
    
    @FindBy(xpath="//p[(text()='Your IFSC and MICR are not valid. Please Enter valid IFSC and MICR.')]")
    public static WebElement errorMsgForIFSCandMICR;
    
    @FindBy(xpath="//*[@id='politicallypower4']")
    public static WebElement noOptionEIA;
    
    @FindBy(xpath=".//*[@id='p2']")
    public static WebElement noOptionIsPayorDiff;
    
    @FindBy(xpath="//input[@name='bankAccountNo']")
    public static WebElement bankAccountNo;
    
    @FindBy(xpath="//input[@name='bankAccountHolderName']")
    public static WebElement AccHolderName;
    
    @FindBy(xpath="//span[(text()=\"Renewal Payment by\")]")
    public static WebElement renewalPaymentBy;

    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[3]/div[4]/div/div/div/div/div/div[@role=\"button\"]")
    public static WebElement typeOfAcc;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[4]/div/div/div/div/div/div[@role=\"button\"]")
    public static WebElement typeOfAccInsurer;
    
    @FindBy(xpath=".//*[@id='menu-typeofAccount']/div[2]/ul/li[1]")
    public static WebElement typeOfAccOption;
  
    @FindBy(xpath="//input[@name='bankAccountIFSC']")
    public static WebElement IFSC;
    
    @FindBy(xpath="//input[@name='bankAccountMICR']")
    public static WebElement MICR;

    @FindBy(xpath="//input[@name='bankName']")
    public static WebElement BankName;
    
    @FindBy(xpath="//input[@name='bankBranch']")
    public static WebElement BankBranch;
    
    @FindBy(xpath="//input[@name='GuardianName']")
    static WebElement GuardianName;
    
    @FindBy(xpath="//label[contains(@for, 'nomineeGenderMale')]")
    static WebElement nomineeGender;
    
    @FindBy(xpath="//label[contains(@for, 'p2')]")
    static WebElement isPayorDifferentFromProposerNo;
    
    @FindBy(xpath="//label[contains(@for, 'p1')]")
    static WebElement isPayorDifferentFromProposerYes;
    
    @FindBy(xpath="//label[contains(@for, 'politicallypower4')]")
    static WebElement politicallypowerNo;
    
    @FindBy(xpath="//label[contains(@for, 'politicallypower3')]")
    static WebElement politicallypowerYes;

    @FindBy(xpath="//label[contains(@for, 'ECS')]")
    static WebElement optionBtnEcs;
    
    @FindBy(xpath="//label[contains(@for, 'Cheque')]")
    static WebElement optionBtnCheque;
    
    @FindBy(xpath="//span[(text()=\"Same as bank details\")]")
    static WebElement labelSameAsBankDetails;
    
    @FindBy(xpath="//p[contains(text(),'All payouts will be credited to this account through electronic payment.')]")
    static WebElement labelAllPayoutsCreditedToAccThroughElectronic;
    
    @FindBy(xpath="//*[@class='jss3006 jss3045 jss3059 jss3063'][1]")
    static WebElement outsideClickToCallService;

    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/div/div/div/div[@role=\"button\"]")
    static WebElement identityProofName;
    
    @FindBy(xpath=".//*[@id='menu-identityProof']/div[2]/ul/li[1]")
    static WebElement identityProofOption;
    
    @FindBy(xpath="//input[@name='identityProofNumber']")
    static WebElement identityProofNumber;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div[@role=\"button\"]")
    static WebElement identityProofIssuingAuthority;
    
    @FindBy(xpath=".//*[@id='menu-identityProofIssuingAuthority']/div[2]/ul/li[1]")
    static WebElement uniqueIdentificationAuthorityOfIndia;
    
    @FindBy(xpath="//label[contains(text(), 'I don’t have PAN Number as I have applied for PAN/PAN acknowledgement have to be provided')]")
    static WebElement idontHavePANNumberAsIhaveAppliedForPANAcknowledgement;
    
    @FindBy(xpath="//label[contains(text(), 'I am Exempt from the requirement of PAN under the following provisions of the IT Act 1961')]")
    static WebElement iAmExemptFromRequirementOfPANUnderFollowingProvisions;
    
    @FindBy(xpath="//input[@name='panAcknowledgementNo']")
    static WebElement panAcknowledgementNo;
    
    @FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
    static WebElement dateOfApplication;
    
    @FindBy(xpath="//span[(text()=\"Address Proof same as ID Proof\")]")
    static WebElement addressProofSameAsIDProof;
    
    @FindBy(xpath="//span[contains(text(),\"Neither my income of any other person in respect of which I am assessable under the act was in excess of the maximum amount not chargeable to income tax in any previous year.\")]")
    static WebElement CheckBox1stOfIamExemptFromTheRequirement;
    
    @FindBy(xpath="//span[contains(text(),\"Section 139A : I am carrying on a Business/Profession that does not have total sales/turnover/gross sales exceeding or likely to exceed or likely to exceed Rs. 5 lacs in any previous year.\")]")
    static WebElement CheckBox2ndOfIamExemptFromTheRequirement;
    
    @FindBy(xpath="//span[(text()=\"Section 139A : I am not required to furnish return of income as return of income as required under the section 139 (4A) as I am not in receipt of any taxable income which is derived from property held under trust or other legal obligation wholly for charitable or religious purposes.\")]")
    static WebElement CheckBox3rdOfIamExemptFromTheRequirement;
    
    @FindBy(xpath="//span[(text()=\"Section 114C : I am having only agricultural income and I am not in receipt of any other income chargeable to Income Tax.\")]")
    static WebElement CheckBox4thOfIamExemptFromTheRequirement;
    
    @FindBy(xpath="//span[(text()=\"Section 114C : I am a non-resident Indian with no taxable Income in India.\")]")
    static WebElement CheckBox5thOfIamExemptFromTheRequirement;
    
    @FindBy(xpath="//span[(text()=\"Section 10(26) : Being a resident of northeast region and belong to tribes or tribal communities which fall under the category of article 342 & 366 therefore the provision of income tax is not applicable to me.\")]")
    static WebElement CheckBox6thOfIamExemptFromTheRequirement;
    //-----------------------------------------------
    @FindBy(xpath="//span[text()='Nationality']")
    static WebElement labelNatinalityOptionPayorSelectedYes;
    
    @FindBy(xpath="//label[text()='Indian']")
    static WebElement indianOptionPayorSelectedYes;
    
    @FindBy(xpath="//label[text()='NRI']")
    static WebElement nriOptionPayorSelectedYes;
    
    @FindBy(xpath="//span[text()=\"Scan Payor's PAN to get the information\"]")
    static WebElement scanPayorsPANToGetTheInformationPayorSelectedYes;
    
    @FindBy(xpath="//span[text()=\"Scan Payor's Aadhar to get the information\"]")
    static WebElement scanPayorsAdhaarToGetTheInformationPayorSelectedYes;
    
    @FindBy(xpath="//input[@name='payorName']")
    static WebElement payorNameSelectedYes;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div/div/input[@placeholder='DD/MM/YYYY']")
    static WebElement dateOfBirthPayorDetailsYesOptionSelected;
    
    @FindBy(xpath="//div[text()=\"Gender\"]")
    static WebElement genderPayorNameSelectedYes;
    
    @FindBy(xpath="//label[contains(@for, 'payorGenderMale')]")
    static WebElement genderMalePayorNameSelectedYes;
    
    @FindBy(xpath="//label[contains(@for, 'payorGenderFemale')]")
    static WebElement genderFemalePayorNameSelectedYes;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div/div/textarea[@name='payorAddress']")
    static WebElement addressPayorNameSelectedYes;
    
    @FindBy(xpath="//input[@placeholder='Search a state']")
    static WebElement statePayorNameSelectedYes;
    
    @FindBy(xpath="//input[@name='payorAnnualIncome']")
    static WebElement annualIncomePayorSelectedYes;

    @FindBy(xpath="//input[@name='payorAadhaar']")
    static WebElement payorAadhaarSelectedYes;
    
    @FindBy(xpath="//input[@name='payorPanNumber']")
    static WebElement payorPanNumberSelectedYes;
    
    @FindBy(xpath="//span[(text()= \"Don't Have PAN?\")]")
    static WebElement payorDontHavePanSelectedYes;
    
    @FindBy(xpath=".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[7]/div/div/div/div/div/div[@role=\"button\"]")
    static WebElement relationshipPayorWithProposerpayorSelectedYes;
    
    @FindBy(xpath=".//*[@id='menu-payorRelationship']/div[2]/ul/li[1]")
    static WebElement relationshipPayorWithProposerpayorSelectedYesOption;
    
    public static void nomineeGender() throws Exception {

		click(nomineeGender);
		}
    
    public static void outsideClickToCallService() throws Exception {

		click(outsideClickToCallService);
		
		
		}
    
    public static void politicallypowerNoClick() throws Exception {
        Thread.sleep(200);
		click(politicallypowerNo);
		
		
		}
    
    public static void dontHavePANPayorDetails() throws Exception {

		click(dontHavePANPayorDetails);
		
		
		}
   
    public static void typeOfAcc() throws Exception {

		click(typeOfAcc);
		}
    
    public static void typeOfAccOption() throws Exception {

		click(typeOfAccOption);
			
    }
    
    public static void isPayorDifferentFromProposerNo() throws Exception {
    	Thread.sleep(200);
    	arrowUpFunctionToScrollUp();
		System.out.println("arrow button MOVED");
		Thread.sleep(500);	
        waitTillElementToBeClickable(isPayorDifferentFromProposerNo);
		click(isPayorDifferentFromProposerNo);
		Thread.sleep(200);
			
    }
    
    
    
    
    public static void dateOfBirth() throws Exception {

		click(dateOfBirth);
		}
    
    public static void dateOfBirthIssurer() throws Exception {

		click(dateOfBirthIssurer);
		}
    
    public static void dateOfBirthNomineeDetails() throws Exception {

		click(dateOfBirthNomineeDetails);
		}
    
    public static void relationshipWithNominee() throws Exception {

		click(relationshipWithNominee);
		}
	
    public static void relationshipWithNomineDropdownOthersOption() throws Exception {

		click(relationshipWithNomineDropdownOthersOption);
		}
    public static void isPayorDetailsNoOptionSelectedByDefault() throws Exception {
    	PageFactory.initElements(driver, JourneyScreenThree.class);
		if(payorDetailsNo.isEnabled())
		{		
		logger.info("Test Case Pass:'No' option under 'Is Payor is different from proposer' is selected by default ");
		}
		else
		{
			Assert.fail("Test Case Fail:'No' option under 'Is Payor is different from proposer' is selected by default ");
		}

    }
    
    public static void checkTheDateOfBirthFormatAndFutureDateRestrictions() throws Exception {
    	PageFactory.initElements(driver, JourneyScreenThree.class);
    	String dateOfBirthFormat=visaValidTill.getAttribute("placeholder");
    	if(dateOfBirthFormat.equalsIgnoreCase("DD/MM/YYYY"))
		{		
		logger.info("Test Case Pass: Date of Birth - Field format DD/MM/YYYY");
		}
		else
		{
			Assert.fail("Test Case Fail:Date of Birth - Field format DD/MM/YYYY is not as per functionality");
		}}

    public static void checkTheDateOfBirthFormatAndFutureDateRestrictionsNomineeDetails() throws Exception {
    	PageFactory.initElements(driver, JourneyScreenThree.class);
    	String dateOfBirthFormat=dateOfBirthNomineeDetails.getAttribute("placeholder");
    	if(dateOfBirthFormat.equalsIgnoreCase("DD/MM/YYYY"))
		{		
		logger.info("Test Case Pass: Date of Birth - Field format DD/MM/YYYY");
		}
		else
		{
			Assert.fail("Test Case Fail:Date of Birth - Field format DD/MM/YYYY is not as per functionality");
		}
    	futureDateEnabilityNomineeDetails();
    }
    	
    
    
    
    	public static void futureDateEnabilityVisaValidTill() throws Exception {
    		visaValidTill.click();
        Calendar calendar = Calendar.getInstance();
        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int futuredate=currentDay+1;
        String runtimeXpathForSelectingDate= "day-"+futuredate+"";
        boolean	checkFutureDateIsEnabled= driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]")).isEnabled();
        System.out.println(runtimeXpathForSelectingDate);
        System.out.println(checkFutureDateIsEnabled);
        if(checkFutureDateIsEnabled) {
    		logger.info("Test Case Pass:Future Date is enabled as per the requirement of visa valid till ");
    	}else 
    	{
    		Assert.fail("Test Case fail:Future Date is disabled as per the requirement of visa valid till");
    	}
    	}
        
    	
    	public static void futureDateEnability() throws Exception {
        	dateOfBirth();
            Calendar calendar = Calendar.getInstance();
            int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
            int futuredate=currentDay+1;
            String runtimeXpathForSelectingDate= "day-"+futuredate+"";
            boolean	checkFutureDateIsEnabled= driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]")).isSelected();
            if(checkFutureDateIsEnabled) {
        		logger.info("Test Case Fail:Future Date is enabled ");
        	}else 
        	{
        		logger.info("Test Case Pass:Future Date is disabled");
        	}
        	}
            
        
        public static void futureDateEnabilityNomineeDetails() throws Exception {
        	dateOfBirthNomineeDetails();
            Calendar calendar = Calendar.getInstance();
            int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
            int futuredate=currentDay+1;
            String runtimeXpathForSelectingDate= "day-"+futuredate+"";
            boolean	checkFutureDateIsEnabled= driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]")).isSelected();
            if(checkFutureDateIsEnabled) {
        		logger.info("Test Case Fail:Future Date is enabled ");
        	}else 
        	{
        		logger.info("Test Case Pass:Future Date is disabled");
        	}
        	   
    	    
    	
    }
    
        
        public static void typeOfAccountOptionSelectionValidation() throws Exception {
        	typeOfAcc();
        	Thread.sleep(700);
        	String xpathOfTypeOfAccountBankDetails=".//*[@id='menu-typeofAccount']/div[2]/ul/li";
        	JourneyScreenTwo.comparingExcelDataWithUI(xpathOfTypeOfAccountBankDetails,4,12);
        	Thread.sleep(200);
        	typeOfAccOption();
        	   
        }
        
        public static void typeOfAccountOptionSelection() throws Exception {
        	typeOfAcc();
        	Thread.sleep(700);
        	typeOfAccOption();
        	   
        }
        
        public static void typeOfAccountOptionSelectionInsurer() throws Exception {
            Thread.sleep(200);
        	typeOfAccInsurer.click();
        	Thread.sleep(700);
        	typeOfAccOption();
        	   
        }
        
        
        
   public static void currentDatePicker() throws Exception{
    checkTheDateOfBirthFormatAndFutureDateRestrictions();
    futureDateEnability();
    Calendar calendar = Calendar.getInstance();
    int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
   // System.out.println(currentDay);
    String runtimeXpathForSelectingDate= "day-"+currentDay+"";
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]")).click();
   
   }
   
   public static void visaValidTill() throws Exception{
	  Thread.sleep(200);
	   checkTheDateOfBirthFormatAndFutureDateRestrictions();
	    futureDateEnabilityVisaValidTill();
	    Calendar calendar = Calendar.getInstance();
	    int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
	   // System.out.println(currentDay);
	    String runtimeXpathForSelectingDate= "day-"+currentDay+"";
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]")).click();
	   
	   }
   
   
   
   public static void waitForNumberOfWindowsToEqual(final int numberOfWindows) {
	    new WebDriverWait(driver, 20) {
	    }.until(new ExpectedCondition<Boolean>() {
	        public Boolean apply(WebDriver driver) {                        
	            return (driver.getWindowHandles().size() == numberOfWindows);
	        }
	    });
	}
   
   public static void ifConditionForTabSizeTwoPDFIllustratioForScreenThree() throws InterruptedException{
	   String parent=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> I1= s1.iterator();
		while(I1.hasNext())
		{
		   String child_window=I1.next();
		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);
		System.out.println(driver.switchTo().window(child_window).getTitle());
		driver.close();
		}
		}
		driver.switchTo().window(parent);
		Thread.sleep(7000);
   }
   
   public static void checkPDFIsOpenedOrNotCheckMsg() throws Exception{
	     Thread.sleep(14000);
	     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    	 if(tabs.size()==2) { 
         System.out.println("Test case pass:As PDF illustration is working");
        JourneyScreenTwo.ifConditionForTabSizeTwoPDFIllustration();
         
   }else {
	  try {
		  WebElement ele=driver.findElement(By.xpath("//h4[(text()=\"Illustration could not be generated.\")]"));
	     if(isElementDisplayed(ele)) {
		   List<WebElement>listOfErrors=driver.findElements(By.xpath("html/body/div[2]/div[2]/div/div/div/div/ol/li"));   
		   int i=listOfErrors.size();
		    for(int j=1;j<=i;j++) {
			String errorMsg= driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div/ol/li["+j+"]")).getText();
			System.out.println(errorMsg);
		}
		    escapeFunction();
	   }
	  }catch(Exception e)     
	  {  System.out.println(e);
	     Assert.fail("Either PDF is not generating or loading time is too much");
		 escapeFunction();    
		      
		  }
		}
    	 
   }
   
   public static void generatingPDFToReachToScreenThree() throws Exception{
	     Thread.sleep(20000);
	     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
  	 if(tabs.size()==2) { 
       System.out.println("Test case pass:As PDF illustration is working");
      ifConditionForTabSizeTwoPDFIllustratioForScreenThree();
       
 }else {
	  try {
		  WebElement ele=driver.findElement(By.xpath("//h4[(text()=\"Illustration could not be generated.\")]"));
	     if(isElementDisplayed(ele)) {
		   List<WebElement>listOfErrors=driver.findElements(By.xpath("html/body/div[2]/div[2]/div/div/div/div/ol/li"));   
		   int i=listOfErrors.size();
		    for(int j=1;j<=i;j++) {
			String errorMsg= driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div/ol/li["+j+"]")).getText();
			System.out.println(errorMsg);
		}
		    escapeFunction();
	   }
	  }catch(Exception e)     
	  {  System.out.println(e);
	     Assert.fail("Either PDF is not generating or loading time is too much");
		 escapeFunction();    
		      
		  }
		}
  	 
 }
  
   
   
   
   public static void futureDateEnabilityInsurers() throws Exception {
	   dateOfBirthIssurer();
       Calendar calendar = Calendar.getInstance();
       int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
       int futuredate=currentDay+1;
       String runtimeXpathForSelectingDate= "day-"+futuredate+"";
       boolean	checkFutureDateIsEnabled= driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]")).isSelected();
       if(checkFutureDateIsEnabled) {
   		logger.info("Test Case Fail:Future Date is enabled ");
   	}else 
   	{
   		logger.info("Test Case Pass:Future Date is disabled");
   	}
   	    
   	    
   	
   }
   
   
   public static void checkIFSCAndMICRServiceIsValidatedWithTosterMessge() throws Exception {
	   bankAccountNo.click();
   // waitTillElementVisible(tosterMsgValidtaion);
    WebDriverWait wait = new WebDriverWait(driver, 50);
    wait.until(ExpectedConditions.or(
        ExpectedConditions.visibilityOfElementLocated(By.id("client-snackbar")),
        ExpectedConditions.visibilityOfElementLocated(By.id("alert-dialog-description"))
    ));
    
    
    
    
     if(isElementDisplayed(tosterMsgValidtaion)) {
    	 System.out.println("Test case pass as toster msg for MICR and IFSC validation is appearing");
     }else {
         escapeFunction();
         System.out.println(errorMsgForIFSCandMICR.getText());
    	 Assert.fail("Test case fail as toster msg for MICR and IFSC is not displaying");
   }}
   
   public static void currentDatePickerInsurers() throws Exception{
	    checkTheDateOfBirthFormatAndFutureDateRestrictions();
	    futureDateEnabilityInsurers();
	    Calendar calendar = Calendar.getInstance();
	    int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
	   // System.out.println(currentDay);
	    String runtimeXpathForSelectingDate= "day-"+currentDay+"";
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]")).click();
   }
   public static void setDateBirthInsurersDetails(int x, int y, int z) throws Exception{
 		PageFactory.initElements(driver, JourneyScreenThree.class);
	    String dateFormat= dateOfBirthIssurer.getAttribute("placeholder");
	    if(dateFormat.equalsIgnoreCase("DD/MM/YYYY"))
	    {
	    	System.out.println("Test case pass:As DD/MM/YYYY is the format and displaying in date text box");
	    }else {
	    	Assert.fail("Test case fail:Format is not DD/MM/YYYY");
	    }
     	   dateOfBirthIssurer();
	      LocalDate datw= LocalDate.now().plusDays(1L);
	      int day= datw.getDayOfMonth();
	     String runtimeXpathForSelectingDate= "day-"+day+"";
	      WebElement checkFutureDateIsEnabled= driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]"));
	       String classes =checkFutureDateIsEnabled.getAttribute("class");
	       boolean isDisabled = classes.contains("day--disabled");
	       if(isDisabled) {
	   		logger.info("Test Case pass:'SCREEN TWO'As Future Date is disabled for insurers details");
	   	}else 
	   	{
	   		Assert.fail("Test Case Fail:'SCREEN TWO'Future Date is enabled for insurers details ");
	   	}
	    
	    dateOfBirthIssurer.clear();
  		type(dateOfBirthIssurer, readingdata(x, y, z));
	    
	    
	   }
   
   public static void fillDateBirthInsurersDetails(int x, int y, int z) throws Exception{
		PageFactory.initElements(driver, JourneyScreenThree.class);
	    dateOfBirthIssurer.clear();
 		type(dateOfBirthIssurer, readingdata(x, y, z));
	    
	    
	   }
   

   public static void nomineeNamePositiveValidation(int x, int y, int z) throws Exception {
	        nomineeName.clear();
			type(nomineeName, readingdata(x, y, z));
			String dataPassedFromExcel=	nomineeName.getAttribute("value");
		    int size = dataPassedFromExcel.length();
			if(size==25 && dataPassedFromExcel.contains(".") && !dataPassedFromExcel.contains("@")) 
			{
				logger.info("Test case pass:-As 'nominee name' feild acceping 25 char only");
			}else 
			{
				Assert.fail("Test case fail:-As 'nominee name' acceping more than 25 char");
			}

   }
   
   
   public static void fillingNomineeName(int x, int y, int z) throws Exception {
       nomineeName.clear();
		type(nomineeName, readingdata(x, y, z));

}


   public static void checkGenderMaleFemaleOption() throws Exception {
	   if(genderMale.isDisplayed()&& genderFemale.isDisplayed()) {
		   
		   logger.info("Test case pass:-As Gender - Option Male/Female both are present");
	   }else {
		   Assert.fail("Test case fail:-As Gender - Option Male/Female is not present");
	   }
	   nomineeGender();  
   }
   
   public static void selectNomineeGender() throws Exception {
	   nomineeGender();  
   }
   
   
   
   
   public static void checkRelationshipWithNomineeDropDownvalues() throws Exception {
	  // relationshipWithNominee();
	   waitTillElementToBeClickable(relationshipWithNominee);
	   relationshipWithNominee.click();
	   Thread.sleep(200);
	   String xrelationshipWithNomineeDropDownOption="//*[@id='menu-relationshipWithNominee']/div[2]/ul/li";
	   comparingExcelDataWithUI(xrelationshipWithNomineeDropDownOption,9,8);
	   waitTillElementToBeClickable(relationshipWithNomineeDropDown1stOption);
	   relationshipWithNomineeDropDown1stOption.click();
	   Thread.sleep(200);
	   
   }
   
   
   public static void relationshipWithNomineeOptionSelection() throws Exception {
		  // relationshipWithNominee();
		   waitTillElementToBeClickable(relationshipWithNominee);
		   relationshipWithNominee.click();
		   Thread.sleep(200);
		   waitTillElementToBeClickable(relationshipWithNomineeDropDown1stOption);
		   relationshipWithNomineeDropDown1stOption.click();
		   Thread.sleep(200);
		   
	   }
	  
   public static void otherIsSelectedThen2MoreTextFieldsWillOen() throws Exception {
	   relationshipWithNomineDropdownOthersOption();
	   Thread.sleep(2000);
	   if(RelationshipWithNomineeWhenOther.isDisplayed()&& ReasonForNomination.isDisplayed()) {
		   logger.info("Test Case pass:-As 'Please specify relationship with Nominee' and 'Reason for Nomination' are present");
	   }
	   else {
	   Assert.fail("Test Case fail:-As 'Please specify relationship with Nominee' and 'Reason for Nomination' are not present");
	   }
	   
   }

   public static void relationshipWithNomineeWhenOther(int x, int y, int z) throws Exception {
	   relationshipWithNomineeWhenOther.clear();
	    type(relationshipWithNomineeWhenOther, readingdata(x, y, z));}
   
   
   public static void ReasonForNomination(int x, int y, int z) throws Exception {
	   ReasonForNomination.clear();
	    type(ReasonForNomination, readingdata(x, y, z));}
   
   
  
  
   
   
   
   
   
   public static void iFCPositiveAndNegativeValidation(int x, int y, int z) throws Exception {
	    IFSC.clear();
	    type(IFSC, readingdata(x, y, z));
		String sIFCPassedFromExcel=	IFSC.getAttribute("value");
	    int size = sIFCPassedFromExcel.length();
		if((size==11) && (sIFCPassedFromExcel.equalsIgnoreCase("ANDB0001899"))&& !sIFCPassedFromExcel.contains("@")) 
		{
			logger.info("Test case pass:- As IFSC : Field Length 11, accepts alphaNumeric");
		}else 
		{
			Assert.fail("Test case fail:-As IFSC : Field not as per the expectation (Length 11, accepts alphaNumeric)");
		}

}
   
   public static void setIFCPositive(int x, int y, int z) throws Exception {
	    IFSC.clear();
	    type(IFSC, readingdata(x, y, z));
		
}
   
   public static void mICRPositiveAndNegativeValidation(int x, int y, int z) throws Exception {
	    MICR.clear();
	    type(MICR, readingdata(x, y, z));
		String sMICRPassedFromExcel=MICR.getAttribute("value");
	    int size = sMICRPassedFromExcel.length();
		if((size==9) && (sMICRPassedFromExcel.equalsIgnoreCase("781011005")) && !sMICRPassedFromExcel.contains("@")) 
		{
			logger.info("Test case pass:- As MICR : Field Length 9, accepts Numeric");
		}else 
		{
			Assert.fail("Test case fail:-As MICR : either Field Length is not 9 or not accepting Numeric");
		}
   
		
		
   }
   
   public static void setMICR(int x, int y, int z) throws Exception {
	    MICR.clear();
	    type(MICR, readingdata(x, y, z));
  }
   
   public static void bankNamePrepopulatedDataValidation() throws Exception {
	    String gettingDataFromExcellForBankName=  readingdata(4, 1, 11);
		String sBankNameFromExcel=BankName.getAttribute("value");
		if(sBankNameFromExcel.contentEquals(gettingDataFromExcellForBankName)) {
			logger.info("Test case pass:-As Bank Name is getting prepopulated");
		}else {
			Assert.fail("Test case fail:-As Bank Name is not getting prepopultaed");
		}
  }
   
   public static void bankBranchPrepopulatedDataValidation() throws Exception {
	   String gettingDataFromExcellForBankBranch=  readingdata(4, 1, 10);
		String sBankBranchFromExcel=BankBranch.getAttribute("value");
		
		if(sBankBranchFromExcel.contentEquals(gettingDataFromExcellForBankBranch)) 
		{
			logger.info("Test case pass:-As Bank Branch is getting prepopulated");
		}else 
		{
			Assert.fail("Test case fail:-As Bank Branch is not getting prepopultaed");
		}}

		public static void bankAccountPositiveNegativeValidation(int x, int y, int z) throws Exception {
			bankAccountNo.clear();
			type(bankAccountNo, readingdata(x, y, z));
			String sBankAccountNoFromExcel=bankAccountNo.getAttribute("value");
			    int size = sBankAccountNoFromExcel.length();
				if((size==18) && (!sBankAccountNoFromExcel.contains("E"))) 
				{
					logger.info("Test case pass:-As Bank Account No : Field Length is 18 and accepts only numbers");
				}else 
				{
					Assert.fail("Test case fail:-As either Bank Account No : Field Length is not 18 or accepting alphabets");
				}
		}
		
		public static void setBankAccountNumber(int x, int y, int z) throws Exception {
			bankAccountNo.clear();
			type(bankAccountNo, readingdata(x, y, z));
		}
   
	public static void accountHoldersNamePositiveNegativeValidation(int x, int y, int z) throws Exception {
	AccHolderName.clear();
	type(AccHolderName, readingdata(x, y, z));
	String sAccHolderNameFromExcel=AccHolderName.getAttribute("value");
	int size = sAccHolderNameFromExcel.length();
	if((size==30) && (!sAccHolderNameFromExcel.contains("@")&&(sAccHolderNameFromExcel.contains(".")))) 
			{		
		logger.info("Test case pass:-As Account Holders Name : Field Length 30, accepts Alpha & (.) special character");
			}
			else 
				{
							Assert.fail("Test case fail:-As either Account Holders Name : Field Length is not 30 or not accepts Alpha or accepting Numeric & not (.) special character");
						}
				
				
   }
	
	
	public static void setAccountHoldersName(int x, int y, int z) throws Exception {
		AccHolderName.clear();
		type(AccHolderName, readingdata(x, y, z));
					
	   }
	
	
 public static void asNomineeIsMinorProvideGuardianname() throws Exception {
		 
		 if(GuardianName.isEnabled()) {
			 System.out.println("Test case pass as Guardian name feild is present when nominee age is less than 18");
		 }
		 else {
			 Assert.fail("Test case is fail as Guardian name feild is not present when nominee age is less than 18");
		 }
	 }
	 
 @FindBy(xpath="//div[text()='Incorrect userId or Password !!']")
 static WebElement LoginErrorMsg;
 
 
 public static String Actualtext() throws Exception {
		waitTillElementLocated(LoginErrorMsg);
		return LoginErrorMsg.getText();
	}
 
 
 public static void verifyErrormessage() throws Exception {
		String actualError = Actualtext();
		String expectedError = "Incorrect userId or Password !!";
		assertEquals(actualError, expectedError);
		logger.info("Proper error message is displayed.");
	}
 
   
 public static void allTheBankdetailsFeildsIsPresent() throws Exception {
	 PageFactory.initElements(driver, JourneyScreenThree.class);
	 if(IFSC.isDisplayed()&&MICR.isDisplayed()&&BankName.isDisplayed()&&BankBranch.isDisplayed()&&bankAccountNo.isDisplayed()
			 &&AccHolderName.isDisplayed()&&typeOfAcc.isDisplayed()&&renewalPaymentBy.isDisplayed()&&optionBtnEcs.isDisplayed()
			 &&optionBtnCheque.isDisplayed()&&labelSameAsBankDetails.isDisplayed()&&labelAllPayoutsCreditedToAccThroughElectronic.isDisplayed()) {
		 System.out.println("Test case pass as all the feilds is present for BANK DETAILS SECTION when dependent is not selected");
	 }else {
		 Assert.fail("Test case fail:As all the feilds are not present for BANK DETAILS SECTION as per the requirment");
	 }
	 
	}
 
 public static void form60RelatedDetailsFeildsIsPresent() throws Exception {
	 if(identityProofName.isDisplayed()&&identityProofNumber.isDisplayed()
			 &&idontHavePANNumberAsIhaveAppliedForPANAcknowledgement.isDisplayed()&&iAmExemptFromRequirementOfPANUnderFollowingProvisions.isDisplayed()&&
			 dateOfApplication.isDisplayed()&&addressProofSameAsIDProof.isDisplayed()) {
		 System.out.println("Test case pass:As All the feilds for SCREEN FOUR--form60RelatedDetailsFeildsIsPresent");
	 }
	 else {
		 Assert.fail("Test case fail:As all the feilds for SCREEN FOUR--form60RelatedDetailsFeilds Is Not present");
	 }
	 
	}
 
 public static void form60RelatedDetailsIdentityProofNameDropDownValidation() throws Exception {
	Thread.sleep(200);
	 waitTillElementToBeClickable(identityProofName);
	 identityProofName.click();
	 waitTillElementToBeClickable(identityProofOption);
	 Thread.sleep(200);
	String xIdentityProofOption=".//*[@id='menu-identityProof']/div[2]/ul/li";
	String sheetPath="\\src\\test\\resources\\TestData.xlsx";
	comparingExcelDataWithUIBySheetPath(xIdentityProofOption,0,4,sheetPath);
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
 
 public static void arrowDownFunctionToScrollDown() throws Exception {
	 Thread.sleep(400);
	 for(int i=1;i<8;i++) {
	  Actions action = new Actions(driver);
	   action.sendKeys(Keys.ARROW_DOWN).build().perform();
	 }
	   Thread.sleep(400); 
		}
 
 public static void arrowDownFunctionToScrollDownTillBottom() throws Exception {
	 Thread.sleep(400);
	 for(int i=1;i<25;i++) {
	  Actions action = new Actions(driver);
	   action.sendKeys(Keys.ARROW_DOWN).build().perform();
	 }
	   Thread.sleep(400); 
	   Proceedbtn.click();		
 }
 
 public static void arrowUpFunctionToScrollUp() throws Exception {
	 Thread.sleep(400);
	 for(int i=1;i<7;i++) {
	  Actions action = new Actions(driver);
	   action.sendKeys(Keys.ARROW_UP).build().perform();
	 }
	   Thread.sleep(400); 
		}
 
 public static void arrowUpFunctionToScrollUpTillTop() throws Exception {
	 Thread.sleep(400);
	 for(int i=1;i<11;i++) {
	  Actions action = new Actions(driver);
	   action.sendKeys(Keys.ARROW_UP).build().perform();
	 }
	   Thread.sleep(400); 
		}
 
 
 public static void lifestyleFeildsValidation() throws Exception {
	  Thread.sleep(400);
	 if(labelCriticallIllness.isDisplayed()&&criticalIllnessYesOption.isDisplayed()&&criticalIllnessNoOption.isDisplayed()
				&&labelHazardousActivitiesAsOccupation.isDisplayed()&&hazardousActivitiesYes.isDisplayed()&&hazardousActivitiesNo.isDisplayed()
				&&labelHaveYouEverConvictedForCriminalCharges.isDisplayed()&&criminalChargesYes.isDisplayed()&&criminalChargesNo.isDisplayed()
				&&labelHeight.isDisplayed()&&labelWeight.isDisplayed()&&kgsTextBox.isDisplayed())
	 {
			
			System.out.println("Test case pass:As All the feilds for lifstyle section screen four is present");
		}else {
			Assert.fail("Test case fail:As all the feilds for lifestyle section screen four are not present");
		}
		 
		}
 
 
 public static void lifestyleFeildsValidationForYes() throws Exception {
	Thread.sleep(200);
	 criticalIllnessYesOption.click();	
	 if(labelIssuedOrPendingForCheckBox.isDisplayed()&&labelOfferedAtModifiedTermsRejectedOrPostponedForCheckBox.isDisplayed()) {
			
			System.out.println("Test case pass:As All the feilds for lifstyle section screen four critical illness yes option is present");
		}else {
			Assert.fail("Test case fail:As all the feilds for lifestyle section screen four critical illness yes option are not present");
		}
	 Thread.sleep(200);
	 criticalIllnessNoOption.click();
		}
 
 
 public static void FeildsValidationHazardousForYes() throws Exception {
		Thread.sleep(200);
		hazardousActivitiesYes.click();	
		 if(labelToWhatExtentYouAreInvolvedInForHazardousYes.isDisplayed()) {
				
				System.out.println("Test case pass:As All the feilds for lifstyle section screen four hazardous yes option is present");
			}else {
				Assert.fail("Test case fail:As all the feilds for lifestyle section screen four hazardous yes option are not present");
			}
		 Thread.sleep(200);
		 selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes.click();
		 waitTillElementToBeClickable(selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes1stOption);
		 Thread.sleep(200);
		 String xpathOFList=".//*[@id='menu-involvementExtend']/div[2]/ul/li";
		 String sheetPath="\\src\\test\\resources\\TestData.xlsx";
		 comparingExcelDataWithUIBySheetPath(xpathOFList, 1, 0, sheetPath);
		 selectDropDownForToWhatExtentYouAreInvolvedInForHazardousYes1stOption.click();
		 Thread.sleep(200);
		 hazardousActivitiesNo.click();
		 
		 
		
			}
 
 public static void selectCriminalChargesNo() throws Exception {
		Thread.sleep(200);
		criminalChargesNo.click();	
		Thread.sleep(200);
		 
		 
		 
			}
 
 public static void feetInchesKgsSelectionToMoveToScreen5() throws Exception {
	Thread.sleep(300);
	waitTillElementVisible(feetDropDown);
	 feetDropDown.click();
	 waitTillElementToBeClickable(feetDropDown1stOption);
	 Thread.sleep(300);
	 feetDropDown1stOption.click();
	 Thread.sleep(300);
	 waitTillElementToBeClickable(inchesDropDown);
	 inchesDropDown.click();
	 Thread.sleep(300);
	 waitTillElementToBeClickable(inchesDropDown1stOption);
	 inchesDropDown1stOption.click();
	 Thread.sleep(300);
	 setKgsForLifestyle(1,1,1);
	 Thread.sleep(300);
	 outsideClickScreenFour.click();
	 Thread.sleep(300);
	// Proceedbtn.click();
	 
			}

 public static void setKgsForLifestyle(int x, int y, int z) throws Exception {
	 kgsTextBox.clear();
	 type(kgsTextBox, readingdataTestData(x, y, z));
					
	   }
 
 public static void identityProofIssuingAuthority() throws Exception {
	 Thread.sleep(200);
	 waitTillElementToBeClickable(identityProofIssuingAuthority);
	 identityProofIssuingAuthority.click();
	 waitTillElementToBeClickable(uniqueIdentificationAuthorityOfIndia);
	 Thread.sleep(200);
	String xIdentityProofOption=".//*[@id='menu-identityProofIssuingAuthority']/div[2]/ul/li";
	String sheetPath="\\src\\test\\resources\\TestData.xlsx";
	comparingExcelDataWithUIBySheetPath(xIdentityProofOption,0,5,sheetPath);
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
 
 
 public static void idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectFeildsValidation() throws Exception {
	 Thread.sleep(200);
	 waitTillElementToBeClickable(idontHavePANNumberAsIhaveAppliedForPANAcknowledgement);
	 idontHavePANNumberAsIhaveAppliedForPANAcknowledgement.click();
	 Thread.sleep(200);
	if( panAcknowledgementNo.isDisplayed()&&dateOfApplication.isDisplayed()) {
		System.out.println("Test case pass as the required feilds for IdontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelect is displayed");
	}else {
	 Assert.fail("Test case fail as the required feilds for IdontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelect is not displayed");
	}}
 
 public static void idontHavePANNumberAsIhaveAppliedForPANAcknowledgementSelectOption() throws Exception {
	 Thread.sleep(200);
	 waitTillElementToBeClickable(idontHavePANNumberAsIhaveAppliedForPANAcknowledgement);
	 idontHavePANNumberAsIhaveAppliedForPANAcknowledgement.click();
	 Thread.sleep(200);
}
 
 
 public static void maleOptionSelectedByDefaultPayorDetails() throws Exception {
	 WebElement input = driver.findElement(By.id("payorGenderMale"));
	 Boolean checked = isAttribtuePresent(input, "checked");
	 if(checked) {
		 System.out.println("Test case pass as Male is selected by default");
	 }else {
		 Assert.fail("Test case fail as Male is not selected by default");
	 }
	 genderFemalePayorNameSelectedYes.click();
 
 }
 
 public static void adressPayorDetailsCheckValidation(int x, int y, int z) throws Exception {
	Thread.sleep(200);
	System.out.println("11111111111");
	addressPayorNameSelectedYes.click();
	System.out.println("222222222222");
	 addressPayorNameSelectedYes.clear();
	 System.out.println("333333333");
		type(addressPayorNameSelectedYes, readingdata(x, y, z));
		String addressPayorNameSelectedYesFromExcel = addressPayorNameSelectedYes.getAttribute("value");
		int size = addressPayorNameSelectedYesFromExcel.length();
		if (size == 60) {
			logger.info("Test case pass:- As address Payor feild length is 60 ");
		} else {
			Assert.fail("Test case fail:- As address Payor feild length is 60");
		}

	}
 
 
 public static void setDateBirthdateOfApplication(int x, int y, int z) throws Exception{
		PageFactory.initElements(driver, JourneyScreenThree.class);
	    String dateFormat= dateOfApplication.getAttribute("placeholder");
	    if(dateFormat.equalsIgnoreCase("DD/MM/YYYY"))
	    {
	    	System.out.println("Test case pass:As DD/MM/YYYY is the format and displaying in date text box");
	    }else {
	    	Assert.fail("Test case fail:Format is not DD/MM/YYYY");
	    }
	      dateOfApplication.click();
	      LocalDate datw= LocalDate.now().plusDays(1L);
	      int day= datw.getDayOfMonth();
	     String runtimeXpathForSelectingDate= "day-"+day+"";
	      WebElement checkFutureDateIsEnabled= driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]"));
	       String classes =checkFutureDateIsEnabled.getAttribute("class");
	       boolean isDisabled = classes.contains("day--disabled");
	       if(isDisabled) {
	   		logger.info("Test Case pass:'SCREEN FOUR'As Future Date is disabled for date of application");
	   	}else 
	   	{
	   		Assert.fail("Test Case Fail:'SCREEN TWO'Future Date is enabled for date of application");
	   	}
	    
	       dateOfApplication.clear();
		type(dateOfApplication, readingdata(x, y, z));
	    
	    
	   }
 
 public static void setState(int x, int y, int z) throws Exception {
	//--------------------	
	 statePayorNameSelectedYes.click();
	 statePayorNameSelectedYes.clear();
	 statePayorNameSelectedYes.sendKeys(readingdata(x, y, z));
		//driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		//searchState.sendKeys(readingdata(x, y, z));
		//type(searchState, readingdata(x, y, z));
		//driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		//searchState.click();
	 statePayorNameSelectedYes.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(200);
		String countryDataFromExcel = statePayorNameSelectedYes.getAttribute("value");// A
		String dropDownValue = stateDropDown.getText();
		System.out.println(dropDownValue);
		if (dropDownValue.startsWith(countryDataFromExcel)) {
			System.out.println("Test Case pass:-As smart search for state is working properly");
		} else {
			Assert.fail("Test case fail:-As smart search for state is not woring properly");
		}
       
		
		state1stOption.click();
		
		
		
		
	}
 
 
 public static void annualIncome(int x, int y, int z) throws Exception {
	 annualIncomePayorSelectedYes.clear();
	 type(annualIncomePayorSelectedYes, readingdataTestData(x, y, z));
	 String statePayorNameSelectedYesDataFromExcel = annualIncomePayorSelectedYes.getAttribute("value");
		if(statePayorNameSelectedYesDataFromExcel.length()==9&& !statePayorNameSelectedYesDataFromExcel.contains("a")
				&& !statePayorNameSelectedYesDataFromExcel.contains("@")) {
	System.out.println("Test case pass:As annual income lenghth is 9 and not accepting alphabets");		
		}else {
		Assert.fail("Test case fail:As either annual income lenghth is not of 9 or accepting alphabet");	
		}
	}

 
 public static void payorAadhaarWhenYesOptionSelected(int x, int y, int z) throws Exception {
	 payorAadhaarSelectedYes.clear();
	 type(payorAadhaarSelectedYes, readingdata(x, y, z));
	 String statePayorNameSelectedYesDataFromExcel = payorAadhaarSelectedYes.getAttribute("value");
		if(statePayorNameSelectedYesDataFromExcel.length()==12 && !statePayorNameSelectedYesDataFromExcel.contains("*")
				&& !statePayorNameSelectedYesDataFromExcel.contains("A")) {
	System.out.println("Test case pass:As aadhar number lenghth is 12 and not accepting alphabets and special character");		
		}else {
		Assert.fail("Test case fail:As either aadhar number lenghth is not of 12 or accepting alphabets or special character");	
		}
			
 }
 
 
 public static void relationshipPayorWithProposerPayorDetailsDropDownValidation() throws Exception {
	Thread.sleep(200);
	waitTillElementToBeClickable(relationshipPayorWithProposer);
	 relationshipPayorWithProposer.click();
	String sheetpath="\\src\\test\\resources\\TestData.xlsx";
	String xRelationshipWithProposer=".//*[@id='menu-payorRelationship']/div[2]/ul/li";
	comparingExcelDataWithUIBySheetPath(xRelationshipWithProposer, 0, 9, sheetpath);
   Thread.sleep(200);
	waitTillElementVisible(payorRelationship1stOption);
	payorRelationship1stOption.click();
	Thread.sleep(200);
	driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[3]")).click();
	
 }
 
 
 public static void EIAYesOptionSelectionFeildsPresent() throws Exception {
	Thread.sleep(200);
	politicallypowerYes.click();
	if(provideExistingEInsuranceAccountNumber.isDisplayed()&&openNewEInsuranceAccountNumber.isDisplayed()) {
		System.out.println("Test case pass:As provideExistingEInsuranceAccountNumber and openNewEInsuranceAccountNumber option button is present ");
	}else {
		Assert.fail("Test case fail::As provideExistingEInsuranceAccountNumber or openNewEInsuranceAccountNumber option button is not present ");
	}
	
	
 }
 
 public static void providentExistingEInsuranceAccountNumberFeildsValidation() throws Exception {
		Thread.sleep(200);
		provideExistingEInsuranceAccountNumber.click();
		if(enterEIANo.isDisplayed()) {
			System.out.println("Test case pass:As enter EIA Number option is present ");
		}else {
			Assert.fail("Test case fail::As enter EIA Number option is present");
		}
		
		
		 enterEIANo.clear();
		 type(enterEIANo, readingdataTestData(0, 1, 7));
			String enterEIANoFromExcel=enterEIANo.getAttribute("value");
		    int size = enterEIANoFromExcel.length();
			if(size==13) 
			{
				logger.info("Test case pass:-As enter EIA No feilds is of 13 length");
			}else 
			{
				Assert.fail("Test case fail:-As enter EIA No feilds is not of 13 length");
			}
		
	 }
 
 public static void openNewEInsuranceAccountNumberFeildValidation() throws Exception {
		Thread.sleep(200);
		openNewEInsuranceAccountNumber.click();
		if(labelPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith.isDisplayed()) {
			System.out.println("Test case pass:As label Preferred Insurance Repository That You Would Like To Have EIA With is present ");
		}else {
			Assert.fail("Test case fail::As label Preferred Insurance Repository That You Would Like To Have EIA With is not present ");
		}
		
		
		selectPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith.click();
		waitTillElementToBeClickable(select1stOptionPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith);
		Thread.sleep(200);
		String filePath="\\src\\test\\resources\\TestData.xlsx";
		String xpathSelectPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith=".//*[@id='menu-preferredInsurance']/div[2]/ul/li";
		comparingExcelDataWithUIBySheetPath(xpathSelectPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith, 0, 10, filePath);
		Thread.sleep(200);
		select1stOptionPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith.click();
	 }
 
 
 
 public static void setDateBirthPayorDetails(int x, int y, int z) throws Exception{
		PageFactory.initElements(driver, JourneyScreenThree.class);
	    String dateFormat= dateOfBirthPayorDetailsYesOptionSelected.getAttribute("placeholder");
	    if(dateFormat.equalsIgnoreCase("DD/MM/YYYY"))
	    {
	    	System.out.println("Test case pass:As DD/MM/YYYY is the format and displaying in date text box");
	    }else {
	    	Assert.fail("Test case fail:Format is not DD/MM/YYYY");
	    }
	    dateOfBirthPayorDetailsYesOptionSelected.click();
	      LocalDate datw= LocalDate.now().plusDays(1L);
	      int day= datw.getDayOfMonth();
	     String runtimeXpathForSelectingDate= "day-"+day+"";
	      WebElement checkFutureDateIsEnabled= driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""+runtimeXpathForSelectingDate+"\"]"));
	       String classes =checkFutureDateIsEnabled.getAttribute("class");
	       boolean isDisabled = classes.contains("day--disabled");
	       if(isDisabled) {
	   		logger.info("Test Case pass:'SCREEN FOUR'As Future Date is disabled for date of application");
	   	}else 
	   	{
	   		Assert.fail("Test Case Fail:'SCREEN TWO'Future Date is enabled for date of application");
	   	}
	    
	    //dateOfBirthPayorDetailsYesOptionSelected.clear();
		//type(dateOfBirthPayorDetailsYesOptionSelected, readingdata(x, y, z));
	       waitTillElementToBeClickable(dateOfBirthPayorDetailsYesOptionSelected);
	       dateOfBirthPayorDetailsYesOptionSelected.click();
	       
	       dateOfBirthSelctionFunction();
	       
	    
	   }
 
 public static void dateOfBirthSelctionFunction() throws Exception{
 	    Thread.sleep(200);
 		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']")).click();
 		Thread.sleep(200);
 		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='1991']")).click();
 		Thread.sleep(200);
 		driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-22\"]")).click();
 		Thread.sleep(200);
	    
	   }

 
 
 public static void setDateBirthdateOfApplicationWithoutValidation() throws Exception{
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		waitTillElementToBeClickable(dateOfApplication);
		dateOfApplication.click();
		JourneyScreenThree.dateOfBirthSelctionFunction();
	   }
 
 
 public static void payorDetailsFeildsIsPresent() throws Exception{
	Thread.sleep(200);
	 if(isPayorDifferentFromProposerNo.isDisplayed()&&isPayorDifferentFromProposerYes.isDisplayed()&&politicallypowerNo.isDisplayed()&&
			   politicallypowerYes.isDisplayed()&& noOptionEIA.isSelected()&& noOptionIsPayorDiff.isSelected())
	   {
		   System.out.println("Test case pass:As all the feilds is present and NO option is selected by default");
	   }	    
	   else {
		   Assert.fail("Test case fail:As either all the feilds is not present or NO option is not selected by default");
	   }
	   }

 public static void payorDetailsYesOptionSelectedCheckFeilds() throws Exception{
	Thread.sleep(200);
	waitTillElementToBeClickable(isPayorDifferentFromProposerYes);
	 isPayorDifferentFromProposerYes.click();
	 if(labelNatinalityOptionPayorSelectedYes.isDisplayed()&&indianOptionPayorSelectedYes.isDisplayed()&&
		nriOptionPayorSelectedYes.isDisplayed()&&scanPayorsPANToGetTheInformationPayorSelectedYes.isDisplayed()&&
		scanPayorsAdhaarToGetTheInformationPayorSelectedYes.isDisplayed()&&payorNameSelectedYes.isDisplayed()&&
		dateOfBirthPayorDetailsYesOptionSelected.isDisplayed()&&genderPayorNameSelectedYes.isDisplayed()&&
		genderMalePayorNameSelectedYes.isDisplayed()&&genderFemalePayorNameSelectedYes.isDisplayed()&&addressPayorNameSelectedYes.isDisplayed()
		&&statePayorNameSelectedYes.isDisplayed()&&annualIncomePayorSelectedYes.isDisplayed()&&payorAadhaarSelectedYes.isDisplayed()
		&&payorPanNumberSelectedYes.isDisplayed()&&payorDontHavePanSelectedYes.isDisplayed()&&relationshipPayorWithProposerpayorSelectedYes.isDisplayed()) {
	System.out.println("Test case pass as all the feilds is present as per NO option selected of payor details");
	
}else {
			Assert.fail("Test case fail as all the feilds are not present as per NO option selected of payor details");
			
		}
 
 }
 
 
 
 
               public static void payorDetailsYesOptionSelectedFeildsValidation(int x,int y,int z) throws Exception{       
            			Thread.sleep(200);
            			payorNameSelectedYes.clear();
            			type(payorNameSelectedYes, readingdata(x, y, z));
            			String payorNameSelectedYesFromExcel=payorNameSelectedYes.getAttribute("value");
            		    int size = payorNameSelectedYesFromExcel.length();
            			if(size==75) 
            			{
            				logger.info("Test case pass:-As payor name is of 75 length");
            			}else 
            			{
            				Assert.fail("Test case fail:-As payor name is  of 75 length");
            			}
            			
            		}
 

 
 public static void fillPanApplicationAcknowledgeNo() throws Exception {
	 Thread.sleep(200);
	 panAcknowledgementNo.clear();
	 type(panAcknowledgementNo, readingdataTestData(0, 1, 7));
		String panAcknowledgementNoFromExcel=panAcknowledgementNo.getAttribute("value");
	    int size = panAcknowledgementNoFromExcel.length();
		if(size==15) 
		{
			logger.info("Test case pass:-As PAN Acknowledgement No is of 15 length");
		}else 
		{
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
		String identityProofNumberFromExcel=identityProofNumber.getAttribute("value");
	    int size = identityProofNumberFromExcel.length();
		if(size==25) 
		{
			logger.info("Test case pass:-As identity Proof Number is of 12 length");
		}else 
		{
			Assert.fail("Test case fail:-As identity Proof Number is not of 12 length");
		}
		
	}

 public static void setIdentityProofNumberValidation(int x, int y, int z) throws Exception {
		Thread.sleep(200);
		identityProofNumber.clear();
		type(identityProofNumber, readingdataTestData(x, y, z));
		
	}
		
		
		      
  
//********************************** Calculate age from date of birth in Java***********************************************************************************************************************
       public static void main(String[] args) throws Exception {
           System.out.print("Please enter date of birth in YYYY-MM-DD: ");
          /* Scanner scanner = new Scanner(System.in);
           String input = scanner.nextLine();
           scanner.close();*/
           String input=driver.findElement(By.xpath("")).getText();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           Calendar dob = Calendar.getInstance();
           dob.setTime(sdf.parse(input));
           System.out.println("Age is:" + getAge(dob));

       }

       // Returns age given the date of birth
       public static int getAge(Calendar dob) throws Exception {
           Calendar today = Calendar.getInstance();
           int curYear = today.get(Calendar.YEAR);
           int dobYear = dob.get(Calendar.YEAR);
           int age = curYear - dobYear;

           // if dob is month or day is behind today's month or day

           // reduce age by 1

           int curMonth = today.get(Calendar.MONTH);

           int dobMonth = dob.get(Calendar.MONTH);

           if (dobMonth > curMonth) { // this year can't be counted!

               age--;

           } else if (dobMonth == curMonth) { // same month? check for day

               int curDay = today.get(Calendar.DAY_OF_MONTH);

               int dobDay = dob.get(Calendar.DAY_OF_MONTH);

               if (dobDay > curDay) { // this year can't be counted!

                   age--;

               }
           }
           return age;

       }

}
