package uielements;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import util.AppConstant;

public class JourneyScreenThree extends ReusableActions {

	// private static final String Webelement = null;

	// Initializing the Objects
	public JourneyScreenThree(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Locating Indian Nationality radio Button
	@FindBy(xpath = "//label[text()='No']")
	public static WebElement payorDetailsNo;

	@FindBy(xpath = "//h2[(text()='Proceed to send Pre Issuance Verification Link to customer?')]")
	public static WebElement proceedToSendPreInsuranceVerificationLinkToCustomerLabel;

	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	public static WebElement identityProofExpiryDate;

	@FindBy(xpath = "//label[contains(@for, 'QA2Exit')]")
	public static WebElement provideExistingEInsuranceAccountNumber;

	@FindBy(xpath = "//label[contains(@for, 'QA2New')]")
	public static WebElement openNewEInsuranceAccountNumber;

	@FindBy(xpath = "//input[@name='eiAccountNo']")
	public static WebElement enterEIANo;



	@FindBy(xpath = "//span [(text()=\"Preferred Insurance repository that you would like to have EIA with\")]")
	public static WebElement labelPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith;
	// -----------------------------



	@FindBy(xpath = "//input[@name='feet']")
	public static WebElement labelFeet;

	@FindBy(xpath = "//input[@name='inches']")
	public static WebElement labelInches;

	@FindBy(xpath = "//button[2]/span[(text()='Proceed')]")
	public static WebElement agreePopup;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
	public static WebElement selectPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith;

	@FindBy(xpath = ".//*[@id='menu-preferredInsurance']/div[2]/ul/li[1]")
	public static WebElement select1stOptionPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith;

	@FindBy(xpath = ".//*[@id='menu-payorRelationship']/div[2]/ul/li[1]")
	public static WebElement payorRelationship1stOption;

	@FindBy(xpath = "//span[(text()=\"Don't Have PAN?\")]")
	public static WebElement dontHavePANPayorDetails;

	@FindBy(xpath = ".//*[@id='react-autowhatever-1']/ul/li[1]")
	public static WebElement state1stOption;

	@FindBy(xpath = "//*[@id='react-autowhatever-1--item-0']/div/div/span[contains(@style,'font-weight: 500;')]")
	public static WebElement stateDropDown;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirth;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div/div/div/div/input[@placeholder='DD/MM/YYYY']")
	static WebElement visaValidTill;

	@FindBy(xpath = "//*[@id='client-snackbar']/div/span[(text()='Your bankAccountIFSC and bankAccountMICR has been validated.')]")
	static WebElement tosterMsgValidtaion;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/div/input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirthNomineeDetails;

	@FindBy(xpath = "//input[@name='nomineeName']")
	static WebElement nomineeName;

	@FindBy(xpath = "//span[(text()=\"Male\")]")
	public static WebElement genderMale;

	@FindBy(xpath = "//span[(text()=\"Female\")]")
	public static WebElement genderFemale;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[7]/div/div/div/div/div/div[@role=\"button\"]")
	public static WebElement relationshipPayorWithProposer;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
	public static WebElement relationshipWithNominee;

	@FindBy(xpath = "//*[@id='menu-relationshipWithNominee']/div[2]/ul/li")
	static List<WebElement> relationshipWithNomineeDropDownOption;

	@FindBy(xpath = "//*[@id='menu-relationshipWithNominee']/div[2]/ul/li[1]")
	static WebElement relationshipWithNomineeDropDown1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[3]/div[4]/div/div/div/div/div/div[@role=\"button\"]")
	static List<WebElement> typeOfAccount;

	@FindBy(xpath = "//*[@id='menu-relationshipWithNominee']/div[2]/ul/li[@data-value=\"Other\"]")
	public static WebElement relationshipWithNomineDropdownOthersOption;

	@FindBy(xpath = "//input[@name='RelationshipWithNomineeWhenOther']")
	public static WebElement RelationshipWithNomineeWhenOther;

	@FindBy(xpath = "//input[@name='nominationReason']")
	public static WebElement ReasonForNomination;

	@FindBy(xpath = "//input[@name='relationshipWithNomineeWhenOther']")
	public static WebElement relationshipWithNomineeWhenOther;

	@FindBy(xpath = "//p[(text()='Your IFSC and MICR are not valid. Please Enter valid IFSC and MICR.')]")
	public static WebElement errorMsgForIFSCandMICR;

	@FindBy(xpath = "//*[@id='politicallypower4']")
	public static WebElement noOptionEIA;

	@FindBy(xpath = ".//*[@id='p2']")
	public static WebElement noOptionIsPayorDiff;

	@FindBy(xpath = "//input[@name='bankAccountNo']")
	public static WebElement bankAccountNo;

	@FindBy(xpath = "//input[@name='bankAccountHolderName']")
	public static WebElement AccHolderName;

	@FindBy(xpath = "//span[(text()=\"Renewal Payment by\")]")
	public static WebElement renewalPaymentBy;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[2]/div[4]/div/div/div/div/div/div[@role=\"button\"]")
	public static WebElement typeOfAcc;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[4]/div/div/div/div/div/div[@role=\"button\"]")
	public static WebElement typeOfAccInsurer;

	@FindBy(xpath = ".//*[@id='menu-typeofAccount']/div[2]/ul/li[1]")
	public static WebElement typeOfAccOption;

	@FindBy(xpath = "//input[@name='bankAccountIFSC']")
	public static WebElement IFSC;

	@FindBy(xpath = "//input[@name='bankAccountMICR']")
	public static WebElement MICR;

	@FindBy(xpath = "//input[@name='bankName']")
	public static WebElement BankName;

	@FindBy(xpath = "//input[@name='bankBranch']")
	public static WebElement BankBranch;

	@FindBy(xpath = "//input[@name='GuardianName']")
	static WebElement GuardianName;

	@FindBy(xpath = "//label[contains(@for, 'nomineeGenderMale')]")
	static WebElement nomineeGender;

	@FindBy(xpath = "//label[contains(@for, 'p2')]")
	static WebElement isPayorDifferentFromProposerNo;

	@FindBy(xpath = "//label[contains(@for, 'p1')]")
	static WebElement isPayorDifferentFromProposerYes;

	@FindBy(xpath = "//label[contains(@for, 'politicallypower4')]")
	static WebElement politicallypowerNo;

	@FindBy(xpath = "//label[contains(@for, 'politicallypower3')]")
	static WebElement politicallypowerYes;

	@FindBy(xpath = "//label[contains(@for, 'ECS')]")
	static WebElement optionBtnEcs;

	@FindBy(xpath = "//label[contains(@for, 'Cheque')]")
	static WebElement optionBtnCheque;

	@FindBy(xpath = "//span[(text()=\"Same as bank details\")]")
	static WebElement labelSameAsBankDetails;

	@FindBy(xpath = "//p[contains(text(),'All payouts will be credited to this account through electronic payment.')]")
	static WebElement labelAllPayoutsCreditedToAccThroughElectronic;

	@FindBy(xpath = "//*[@class='jss3006 jss3045 jss3059 jss3063'][1]")
	static WebElement outsideClickToCallService;

	// -----------------------------------------------
	@FindBy(xpath = "//span[text()='Nationality']")
	static WebElement labelNatinalityOptionPayorSelectedYes;

	@FindBy(xpath = "//label[text()='Indian']")
	static WebElement indianOptionPayorSelectedYes;

	@FindBy(xpath = "//label[text()='NRI']")
	static WebElement nriOptionPayorSelectedYes;

	@FindBy(xpath = "//span[text()=\"Scan Payor's PAN to get the information\"]")
	static WebElement scanPayorsPANToGetTheInformationPayorSelectedYes;

	@FindBy(xpath = "//span[text()=\"Scan Payor's Aadhar to get the information\"]")
	static WebElement scanPayorsAdhaarToGetTheInformationPayorSelectedYes;

	@FindBy(xpath = "//input[@name='payorName']")
	static WebElement payorNameSelectedYes;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div/div/input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirthPayorDetailsYesOptionSelected;

	@FindBy(xpath = "//div[text()=\"Gender\"]")
	static WebElement genderPayorNameSelectedYes;

	@FindBy(xpath = "//label[contains(@for, 'payorGenderMale')]")
	static WebElement genderMalePayorNameSelectedYes;

	@FindBy(xpath = "//label[contains(@for, 'payorGenderFemale')]")
	static WebElement genderFemalePayorNameSelectedYes;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div[2]/div/div/textarea[@name='payorAddress']")
	static WebElement addressPayorNameSelectedYes;

	@FindBy(xpath = "//input[@placeholder='Search a state']")
	static WebElement statePayorNameSelectedYes;

	@FindBy(xpath = "//input[@name='payorAnnualIncome']")
	static WebElement annualIncomePayorSelectedYes;

	@FindBy(xpath = "//input[@name='income']")
	public static WebElement annualIncomePersonalDetailsDependent;

	@FindBy(xpath = "//input[@name='payorAadhaar']")
	static WebElement payorAadhaarSelectedYes;

	@FindBy(xpath = "//input[@name='payorPanNumber']")
	static WebElement payorPanNumberSelectedYes;

	@FindBy(xpath = "//span[(text()= \"Don't Have PAN?\")]")
	static WebElement payorDontHavePanSelectedYes;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[7]/div/div/div/div/div/div[@role=\"button\"]")
	static WebElement relationshipPayorWithProposerpayorSelectedYes;

	@FindBy(xpath = ".//*[@id='menu-payorRelationship']/div[2]/ul/li[1]")
	static WebElement relationshipPayorWithProposerpayorSelectedYesOption;

	// from screen
	// one__________________________________________________________________
	@FindBy(xpath = "//input[@name='insurerProofType']")
	static WebElement dobProofInsurersDetails;

	@FindBy(xpath = "//input[@name='insurerFatherName']")
	static WebElement fathersNameInsurersDetails;

	@FindBy(xpath = "//span[(text()=\"Do you have any life or Critical Illness insurance policy issued,pending approval from any other insurance companies or has your application for Life/Health/Critical Illness insurance or its reinstatement ever been offered at modified terms,rejected or postponed?\")]")
	static WebElement CritiaclIllnessInsurersDetails;

	@FindBy(xpath = "//span[(text()=\"Do you participate or do you intend to participate in any hazardous activities as part of your Occupation/ Sports/ Hobby?\")]")
	static WebElement hazardousInsurersDetails;

	@FindBy(xpath = "//span[(text()=\"Have you ever been convicted or are you under investigation for any criminal charges ?\")]")
	static WebElement criminalChargesInsurersDetails;

	@FindBy(xpath = "//span[(text()=\"Height\")]")
	static WebElement heightInsurersDetails;

	@FindBy(xpath = "//span[(text()=\"Weight\")]")
	static WebElement weightInsurersDetails;


	@FindBy(xpath = "//label[contains(@for, 'Insurer2') and text()='Indian']")
	static WebElement nationalityIndianInsurersDetails;

	@FindBy(xpath = "//label[contains(@for, 'Insurer3') and text()='NRI']")
	static WebElement nationalityNRIInsurersDetails;

	@FindBy(xpath = "//input[@name='insurerEducation']")
	static WebElement insurerEducationIInsurersDetails;

	@FindBy(xpath = "//input[@name='insurerMaritalStatus']")
	static WebElement insurerMaritalStatusIInsurersDetails;

	@FindBy(xpath = "//input[@name='insurerOrganizationType']")
	static WebElement insurerOrganizationTypeInsurersDetails;

	@FindBy(xpath = "//input[@name='insurerOccupation']")
	static WebElement insurerOccupationInsurersDetails;

	@FindBy(xpath = "//input[@name='insurerIndustryType']")
	static WebElement insurerIndustryTypeInsurersDetails;

	@FindBy(xpath = "//label[contains(@for, 'InsurerCriminalChargesNo')]")
	static WebElement nationalityInsurersDetails;





	@FindBy(xpath = "//input[@name='insurerAnnualIncome']")
	static WebElement insurerOtherDetailsAnnualIncome;

	@FindBy(xpath = ".//*[@id='menu-insurerOccupation']/div[2]/ul/li[2]")
	static WebElement insurerOccupation2ndOption;

	@FindBy(xpath = "//input[@name='insurerWeightInKgs']")
	static WebElement weightPersonalDetailsDependent;

	@FindBy(xpath = ".//*[@id='menu-insurerIndustryType']/div[2]/ul/li[7]")
	static WebElement InsurersIndustryType7thOption;

	@FindBy(xpath = "//input[@name='insurerCompanyName']")
	static WebElement IssureresCompanyNameWhenSalariedFromOccupationSelected;

	@FindBy(xpath = "//*[@id='menu-insurerOccupation']/div[2]/ul/li[2]")
	static WebElement occupation2ndOptionInsurers;

	@FindBy(xpath = ".//*[@id='menu-occupation']/div[2]/ul/li[1]")
	static WebElement occupation2ndOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[2]/div/div/div/div/div[@role=\"button\"]")
	static WebElement organizationTypeInsurersDetails;

	@FindBy(xpath = ".//*[@id='menu-insurerOrganizationType']/div[2]/ul/li[1]")
	static WebElement insurerOrganizationType1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
	static WebElement occupationInsurersDetails;

	@FindBy(xpath = ".//*[@id='menu-insurerOccupation']/div[2]/ul/li[1]")
	static WebElement insurerOccupation1stOption;

	@FindBy(xpath = "//span[contains(text(),\"Are you currently posted in any sensitive/ border location ?\")]")
	static WebElement labledAreYouCurrentlyPostedInsurer;

	@FindBy(xpath = "//label[text()='No']")
	static WebElement noOptionForCurrentlyPostedInsurer;

	@FindBy(xpath = "//label[text()='Yes']")
	static WebElement yesOptionForCurrentlyPostedInsurer;

	@FindBy(xpath = "//span[contains(text(),\"Are you a professional diver ?\")]")
	static WebElement labledAreYouProfessionalDiverInsurer;

	@FindBy(xpath = "//span[contains(text(),\"Are you based at offshore or your job involves travelling to offshore ?\")]")
	static WebElement labledAreYouBasedAtOffshoreOrTravOffshoreInsurer;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[2]/div/div/div/div/div/div[@role=\"button\"]")
	static WebElement typeOfVesselWhereWorkingInsurers;

	@FindBy(xpath = ".//*[@id='menu-vesselTypeOfInsurer']/div[2]/ul/li[1]")
	static WebElement typeOfVesselWhereWorking1stOptionInsurers;

	@FindBy(xpath = "//span[contains(text(),\"Does your role involve going inside any kind of mine ?\")]")
	static WebElement doesOurRoleInvolveGoingInsideAnyKindOfMineInsurer;

	@FindBy(xpath = "//label[@for='iri1']")
	static WebElement yesDoesYourRoleGoingInsideMineInsurer;

	@FindBy(xpath = "//span[contains(text(),\"Have you ever had any illness related to your occupation ?\")]")
	static WebElement haveYouEverHadIllnessRelatedToYourOccupationInsurers;

	@FindBy(xpath = "//label[@for='iri2']")
	static WebElement noDoesYourRoleGoingInsideMineInsurer;

	@FindBy(xpath = "//label[@for='iai1']")
	static WebElement yesHaveYouEverHadIllnessRelatedToYourOccuoationInsurer;

	@FindBy(xpath = "//label[@for='iai2']")
	static WebElement noHaveYouEverHadIllnessRelatedToYourOccuoationInsurer;

	@FindBy(xpath = "//span[contains(text(),\"Exact Nature of duties\")]")
	static WebElement exactNatureOfDutiesInsurer;

	@FindBy(xpath = "//label[contains(text(),\"Flying Role\")]")
	static WebElement flyingRoleInsurer;

	@FindBy(xpath = "//label[contains(text(),\"Non-Flying role\")]")
	static WebElement nonFlyingRoleInsurer;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div/div/div/div/div[@role=\"button\"]")
	static WebElement insurersIndustryType;

	@FindBy(xpath = ".//*[@id='menu-insurerIndustryType']/div[2]/ul/li[1]")
	static WebElement InsurersIndustryType1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role=\"button\"]")
	static WebElement maritalStatusInsurersDetails;

	@FindBy(xpath = ".//*[@id='menu-insurerMaritalStatus']/div[2]/ul/li[1]")
	static WebElement insurerMaritalStatus1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div/div[@role=\"button\"]")
	static WebElement eductionInsurersDetails;
	@FindBy(xpath = "//*[@id='menu-insurerEducation']/div[2]/ul/li[1]")
	static WebElement educationInsurers1stOption;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[3]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[@role=\"button\"]")
	static WebElement dOBProofInsurersDetails;

	@FindBy(xpath = "//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[2]//input[@placeholder='DD/MM/YYYY']")
	static WebElement dateOfBirthIssurer;

	@FindBy(xpath = "//p[contains(text(), \"Insurer's Other Details\")]")
	static WebElement insurersOtherDetails;

	@FindBy(xpath = "//input[@name='fatherName']")
	public static WebElement fathersName;

	@FindBy(xpath = "//span[text()='Proceed']")
	public static WebElement Proceedbtn;

	@FindBy(xpath = "//input[@name='motherName']")
	public static WebElement mothersName;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[1]/div/div/div/div/div[@role='button']")
	public static WebElement maritalStatus;

	@FindBy(xpath = "//*[@id='menu-maritalStatus']/div[2]/ul/li[1]")
	public static WebElement maritalStatus1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[2]/div[2]/div/div/div/div/div[@role='button']")
	public static WebElement education;

	@FindBy(xpath = "//*[@id='menu-education']/div[2]/ul/li[1]")
	public static WebElement education1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[4]/div[1]/div/div/div/div/div[@role='button']")
	public static WebElement organizationType;

	@FindBy(xpath = ".//*[@id='menu-organisationType']/div[2]/ul/li[1]")
	public static WebElement organizationType1stOption;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[4]/div[2]/div/div/div/div/div[@role='button']")
	public static WebElement occupation;

	@FindBy(xpath = "//input[@name='companyName']")
	public static WebElement companyNameProposerPersonalDetails;

	@FindBy(xpath = "//*[@id='alert-dialog-title']/h2[(text()=\"Update PAN Number\")]")
	public static WebElement updatePANPOPUP;

	@FindBy(xpath = "//span[contains(text(),\"Is the Proposer currently posted in any sensitive/ border location ?\")]")
	public static WebElement labledAreYouCurrentlyPosted;

	@FindBy(xpath = "//label[text()='No']")
	public static WebElement noOptionForCurrentlyPosted;

	@FindBy(xpath = "//label[text()='Yes']")
	public static WebElement yesOptionForCurrentlyPosted;

	@FindBy(xpath = "//span[contains(text(),\"Is Proposer a Professional Diver ?\")]")
	public static WebElement labledAreYouProfessionalDiver;

	@FindBy(xpath = "//span[contains(text(),\"Is the Proposer based at offshore location or does his job involves travelling to any offshores locations ?\")]")
	public static WebElement labledAreYouBasedAtOffshoreOrTravOffshore;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[4]/div/div/div/div/div/div[@role='button']")
	public static WebElement typeOfVesselWhereWorking;

	@FindBy(xpath = ".//*[@id='menu-vesselType']/div[2]/ul/li[1]")
	public static WebElement typeOfVesselWhereWorking1stOption;

	@FindBy(xpath = "//span[contains(text(),\"Does the Proposer's work involve going inside any kind of mine ?\")]")
	public static WebElement doesOurRoleInvolveGoingInsideAnyKindOfMine;

	@FindBy(xpath = "//span[contains(text(),\"Did the Proposer ever have any illness related to his occupation ?\")]")
	public static WebElement haveYouEverHadIllnessRelatedToYourOccupation;

	@FindBy(xpath = "//label[@for='ri1']")
	public static WebElement yesDoesYourRoleGoingInsideMine;

	@FindBy(xpath = "//label[@for='ri2']")
	public static WebElement noDoesYourRoleGoingInsideMine;

	@FindBy(xpath = "//label[@for='ai1']")
	public static WebElement yesHaveYouEverHadIllnessRelatedToYourOccuoation;

	@FindBy(xpath = "//label[@for='ai2']")
	public static WebElement noHaveYouEverHadIllnessRelatedToYourOccuoation;

	@FindBy(xpath = "//span[contains(text(),\"Exact Nature of duties\")]")
	public static WebElement exactNatureOfDuties;

	@FindBy(xpath = "//label[contains(text(),\"Flying Role\")]")
	public static WebElement flyingRole;

	@FindBy(xpath = "//label[contains(text(),\"Non-Flying role\")]")
	public static WebElement nonFlyingRole;

	@FindBy(xpath = "//input[@name='income']")
	public static WebElement anualIncome;

	@FindBy(xpath = "//input[@name='companyName']")
	public static WebElement companyNameWhenSalariedFromOccupationSelected;

	@FindBy(xpath = ".//*[@id='root']/main/div[2]/form/div/div/div[2]/div[1]/div[1]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[@role='button']")
	public static WebElement industryType;

	@FindBy(xpath = ".//*[@id='menu-industryType']/div[2]/ul/li[@data-value='Others']")
	public static WebElement industryTypeOthersOption;

	@FindBy(xpath = "//div[text()='Incorrect userId or Password !!']")
	static WebElement LoginErrorMsg;

	@FindBy(xpath = ".//*[@id='menu-insurerProofType']/div[2]/ul/li[1]")
	static WebElement dobProofInsurers1stOption;

	@FindBy(xpath = "//label[contains(@for, 'InsurerCriticalIllnessYes')]")
	static WebElement InsurerCriticalIllnessYesInsurersDetails;

	@FindBy(xpath = "//label[contains(@for, 'InsurerCriticalIllnessNo')]")
	static WebElement InsurerCriticalIllnessNoInsurersDetails;

	@FindBy(xpath = "//label[contains(@for, 'InsurerHazardousActivitiesYes')]")
	static WebElement InsurerHazardousActivitiesYesInsurersDetails;

	@FindBy(xpath = "//label[contains(@for, 'InsurerHazardousActivitiesNo')]")
	static WebElement InsurerHazardousActivitiesNoInsurersDetails;

	@FindBy(xpath = "//label[contains(@for, 'InsurerCriminalChargesNo')]")
	static WebElement InsurerCriminalChargesNoInsurersDetails;

	@FindBy(xpath = "//label[contains(@for, 'InsurerCriminalChargesYes')]")
	static WebElement InsurerCriminalChargesYesInsurersDetails;

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
		if (payorDetailsNo.isEnabled()) {
			logger.info(
					"Test Case Pass:'No' option under 'Is Payor is different from proposer' is selected by default ");
		} else {
			Assert.fail(
					"Test Case Fail:'No' option under 'Is Payor is different from proposer' is selected by default ");
		}

	}

	

	public static void checkTheDateOfBirthFormatAndFutureDateRestrictionsNomineeDetails() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		String dateOfBirthFormat = dateOfBirthNomineeDetails.getAttribute("placeholder");
		if (dateOfBirthFormat.equalsIgnoreCase("DD/MM/YYYY")) {
			logger.info("Test Case Pass: Date of Birth - Field format DD/MM/YYYY");
		} else {
			Assert.fail("Test Case Fail:Date of Birth - Field format DD/MM/YYYY is not as per functionality");
		}
		futureDateEnabilityNomineeDetails();
	}

	
	public static void futureDateEnability() throws Exception {
		dateOfBirth();

		LocalDate datw = LocalDate.now().plusDays(1L);
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "day-" + day + "";
		System.out.println(day);
		System.out.println(runtimeXpathForSelectingDate);

		boolean checkFutureDateIsEnabled = driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"))
				.isEnabled();
		if (checkFutureDateIsEnabled) {
			Assert.fail("Test Case Fail:Future Date is enabled ");
		} else {
			logger.info("Test Case Pass:Future Date is disabled");
		}

	}

	public static void futureDateEnabilityNomineeDetails() throws Exception {
		dateOfBirthNomineeDetails();
		Calendar calendar = Calendar.getInstance();
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		int futuredate = currentDay + 1;
		String runtimeXpathForSelectingDate = "day-" + futuredate + "";
		boolean checkFutureDateIsEnabled = driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"))
				.isSelected();
		if (checkFutureDateIsEnabled) {
			logger.info("Test Case Fail:Future Date is enabled ");
		} else {
			logger.info("Test Case Pass:Future Date is disabled");
		}

	}

	public static void typeOfAccountOptionSelectionValidation() throws Exception {
		typeOfAcc();
		Thread.sleep(700);
		String xpathOfTypeOfAccountBankDetails = ".//*[@id='menu-typeofAccount']/div[2]/ul/li";
		JourneyScreenTwo.comparingExcelDataWithUI(xpathOfTypeOfAccountBankDetails, 4, 12);
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

	public static void currentDatePicker() throws Exception {
		checkDateFormat();
		futureDateEnability();

		LocalDate datw = LocalDate.now();
		int day = datw.getDayOfMonth();
		String runtimeXpathForSelectingDate = "day-" + day + "";

		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label="
						+ runtimeXpathForSelectingDate + "]"))
				.click();

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

	public static void insureresOtherDetailsIsPresent() throws Exception {
		if (insurersOtherDetails.isDisplayed()) {
			System.out.println("Test case pass:-As isureres other details section is present");
		} else {
			Assert.fail("Test case fail:-As isureres other details section is not present");
		}
	}

	public static void fathersName(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		fathersName.clear();
		type(fathersName, readingdata(x, y, z));
	}

	public static void mothersName(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		mothersName.clear();
		type(mothersName, readingdata(x, y, z));
	}

	public static void maritalStatusOptionSelection() throws Exception {
		maritalStatus.click();
		Thread.sleep(200);
		maritalStatus1stOption.click();
		Thread.sleep(200);
	}

	public static void educationDropDownOptionList() throws Exception {
		waitTillElementToBeClickable(education);
		education.click();
		Thread.sleep(200);
		education1stOption.click();
		Thread.sleep(200);
	}

	public static void organizationTypeOptionSelection() throws Exception {
		waitTillElementToBeClickable(organizationType);
		organizationType.click();
		waitTillElementToBeClickable(organizationType1stOption);
		Thread.sleep(200);
		organizationType1stOption.click();
		Thread.sleep(200);
	}

	public static void occupationOptionSelectionInsurers() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(occupation);
		occupation.click();
		Thread.sleep(200);
		waitTillElementToBeClickable(occupation2ndOption);
		occupation2ndOption.click();
		Thread.sleep(700);
	}

	public static void occupationOptionSelection() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(occupation);
		occupation.click();
		Thread.sleep(200);
		waitTillElementToBeClickable(occupation2ndOption);
		occupation2ndOption.click();
		Thread.sleep(700);
	}

	public static void setCompanyNameProposerPersonalDetails(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		companyNameProposerPersonalDetails.clear();
		type(companyNameProposerPersonalDetails, readingdata(x, y, z));
	}

	public static void setFathersName(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		fathersName.clear();
		type(fathersName, readingdata(x, y, z));
		String fathersNamePassedFromExcel = fathersName.getAttribute("value");
		int size = fathersNamePassedFromExcel.length();
		if ((size == 50 && !fathersNamePassedFromExcel.contains("@") && fathersNamePassedFromExcel.contains("."))) {
			logger.info("Test case pass:- As fathers name feild length is 50 and accepting only alphabets");
		} else {
			Assert.fail(
					"Test case fail:- As either fathrs name feild length is not of 50 or not accepting only alphabets");
		}

	}

	public static void setMothersName(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenTwo.class);
		mothersName.clear();
		type(mothersName, readingdata(x, y, z));
		String fathersNamePassedFromExcel = mothersName.getAttribute("value");
		int size = fathersNamePassedFromExcel.length();
		if ((size == 50 && !fathersNamePassedFromExcel.contains("@") && fathersNamePassedFromExcel.contains("."))) {
			logger.info("Test case pass:- As mothers name feild length is 50 and accepting only alphabets");
		} else {
			Assert.fail(
					"Test case fail:- As either mothers name feild length is not of 50 or not accepting only alphabets");
		}

	}

	public static void maritalStatusDropDownListValidation() throws Exception {
		maritalStatus.click();
		Thread.sleep(200);
		String xpathDropDownListOfMaritalStatusPersonalDetails = "//*[@id='menu-maritalStatus']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathDropDownListOfMaritalStatusPersonalDetails, 9, 2);
		maritalStatus1stOption.click();
		Thread.sleep(200);
	}

	public static void educationDropDownListValidation() throws Exception {
		waitTillElementToBeClickable(education);
		education.click();
		Thread.sleep(200);
		String xpathDropDownListOfMaritalStatusPersonalDetails = "//*[@id='menu-education']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathDropDownListOfMaritalStatusPersonalDetails, 9, 3);
		education1stOption.click();
		Thread.sleep(200);
	}

	public static void industryDropDownListValidation() throws Exception {
		waitTillElementToBeClickable(industryType);
		Thread.sleep(200);
		industryType.click();
		Thread.sleep(200);
		waitTillElementToBeClickable(industryTypeOthersOption);
		String xpathDropDownListOfMaritalStatusPersonalDetails = "//*[@id='menu-industryType']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathDropDownListOfMaritalStatusPersonalDetails, 9, 4);
		Thread.sleep(200);
		industryTypeOthersOption.click();
		Thread.sleep(800);
	}

	public static void industryDropDownListOptionSelectionValidation() throws Exception {
		for (int i = 1; i <= 7; i++) {
			waitTillElementToBeClickable(industryType);
			industryType.click();
			waitTillElementToBeClickable(
					driver.findElement(By.xpath("//*[@id='menu-industryType']/div[2]/ul/li[" + i + "]")));
			driver.findElement(By.xpath("//*[@id='menu-industryType']/div[2]/ul/li[" + i + "]")).click();
			Thread.sleep(2000);
			switch (i) {
			case 1:
				if (labledAreYouCurrentlyPosted.isDisplayed() && noOptionForCurrentlyPosted.isDisplayed()
						&& yesOptionForCurrentlyPosted.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per drop down option i.e DEFENCE(Screen Three personal details)");
				} else {
					Assert.fail(
							"All the feilds are not present as per  drop down option i.e DEFENCE(Screen Three personal details)");
				}
				break;
			case 2:
				if (labledAreYouProfessionalDiver.isDisplayed() && noOptionForCurrentlyPosted.isDisplayed()
						&& yesOptionForCurrentlyPosted.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per drop down option i.e DIVING(Screen Three personal details) ");
				} else {
					Assert.fail(
							"All the feilds are not present as per drop down option i.e DIVING(Screen Three personal details)");
				}

				break;
			case 3:
				if (labledAreYouBasedAtOffshoreOrTravOffshore.isDisplayed() && noOptionForCurrentlyPosted.isDisplayed()
						&& yesOptionForCurrentlyPosted.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per drop down option i.e OIL & NATURAL GAS(Screen Three personal details)");
				} else {
					Assert.fail(
							"All the feilds are not present as per drop down option i.e OIL & NATURAL GAS(Screen Three personal details)");
				}
				break;
			case 4:
				if (typeOfVesselWhereWorking.isDisplayed()) {
					Thread.sleep(200);
					typeOfVesselWhereWorking.click();
					Thread.sleep(200);
					String xTypeOfVesselWhereWorking = ".//*[@id='menu-vesselType']/div[2]/ul/li";
					comparingExcelDataWithUI(xTypeOfVesselWhereWorking, 9, 5);
					typeOfVesselWhereWorking1stOption.click();
					Thread.sleep(200);
				}
				break;
			case 5:
				if (doesOurRoleInvolveGoingInsideAnyKindOfMine.isDisplayed()
						&& haveYouEverHadIllnessRelatedToYourOccupation.isDisplayed()
						&& yesDoesYourRoleGoingInsideMine.isDisplayed() && noDoesYourRoleGoingInsideMine.isDisplayed()
						&& yesHaveYouEverHadIllnessRelatedToYourOccuoation.isDisplayed()
						&& noHaveYouEverHadIllnessRelatedToYourOccuoation.isDisplayed()) {

					System.out.println("All the feilds are present as per drop down industry type mining");
				} else {
					Assert.fail("All the feilds are not present as per drop down industry type mining");
				}
				break;

			case 6:
				if (exactNatureOfDuties.isDisplayed() && flyingRole.isDisplayed() && nonFlyingRole.isDisplayed()) {
					System.out.println("All the feilds are present as per drop down industry type Aviation/AirForce");
				} else {
					Assert.fail("All the feilds are not present as per drop down industry type Aviation/AirForce");
				}
				break;

			case 7:
				Thread.sleep(200);
			}
		}
	}

	public static void isAllTheRequiredFeildIsPresentAsPerPersonalDetailsSectionWithoutDependent() throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		Thread.sleep(500);
		if (fathersName.isDisplayed() && mothersName.isDisplayed() && maritalStatus.isDisplayed()
				&& education.isDisplayed() && anualIncome.isDisplayed() && industryType.isDisplayed()
				&& organizationType.isDisplayed() && occupation.isDisplayed()) {
			System.out.println(
					"Test case pass as all the feilds are present as per personal details section of screen three witout dependent");

		} else {
			Assert.fail(
					"Test case fail as all the feilds are not present as per personal details section of screen three witout dependent");
		}

	}

	public static void organizationTypeDropDownListValidation() throws Exception {
		waitTillElementToBeClickable(organizationType);
		Thread.sleep(200);
		organizationType.click();
		waitTillElementToBeClickable(organizationType1stOption);
		Thread.sleep(200);
		String xpathDropDownListOfMaritalStatusPersonalDetails = "//*[@id='menu-organisationType']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathDropDownListOfMaritalStatusPersonalDetails, 9, 6);
		organizationType1stOption.click();
		Thread.sleep(200);
	}

	@FindBy(xpath = ".//*[@id='menu-occupation']/div[2]/ul/li[1]")
	public static WebElement occupation1stOption;

	public static void occupationDropDownListValidation() throws Exception {
		waitTillElementToBeClickable(occupation);
		Thread.sleep(200);
		occupation.click();
		Thread.sleep(200);
		String xpathDropDownListOfMaritalStatusPersonalDetails = "//*[@id='menu-occupation']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathDropDownListOfMaritalStatusPersonalDetails, 9, 7);
		waitTillElementToBeClickable(occupation1stOption);
		Thread.sleep(200);
		occupation1stOption.click();
		Thread.sleep(200);
		checkNameOfCompanyDisplayingWhenSalariedSelected();
	}

	public static void checkNameOfCompanyDisplayingWhenSalariedSelected() throws Exception {
		if (isElementDisplayed(companyNameWhenSalariedFromOccupationSelected)) {
			System.out.println(
					"Test case pass:As name of company is displaying when salaried option is selected from occupation");
		} else {
			Assert.fail(
					"Test case fail As name of company is not displaying when salaried option is selected from occupation");
		}
		waitTillElementToBeClickable(occupation);
		Thread.sleep(200);
		occupation.click();
		Thread.sleep(200);
		waitTillElementToBeClickable(occupation2ndOption);
		Thread.sleep(200);
		occupation2ndOption.click();
		Thread.sleep(200);
	}

	public static void validatingPANPopupForAnnualIncomePersonalDetailsDependent(XSSFSheet sheet, int rowNum)
			throws Exception {
		System.out.println("\n Going to pick run test cases for row number " + rowNum);
		XSSFCell cellRep = sheet.getRow(rowNum).getCell(2);
		String annualIncomePersonalDetailsData = cellRep.getStringCellValue();
		System.out.println("\n Duplicate value picked to run " + annualIncomePersonalDetailsData);
		annualIncomePersonalDetailsDependent.clear();
		annualIncomePersonalDetailsDependent.sendKeys(annualIncomePersonalDetailsData);
		JourneyScreenTwo.clickSubmitButton();
		Thread.sleep(500);
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 70);
		 * wait.until(ExpectedConditions.or(
		 * ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//*[@id='alert-dialog-title']/h2[(text()=\"Update PAN Number\")]")),
		 * ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//p[(text()=\"FORM 60 Related Details\")]") )));
		 */
		int convertingannualIncomeStringToInt = Integer.parseInt(annualIncomePersonalDetailsData);
		try {
			if (isElementDisplayed(updatePANPOPUP)) {
				if (convertingannualIncomeStringToInt >= 250000) {
					System.out.println("Test case pass:As income is more than 250000 and PAN popup is coming");
				} else {
					Assert.fail("Test case fail:As income is more than 250000 and PAN popup is not coming");
				}
				escapeFunction();
			} else {
				if (convertingannualIncomeStringToInt < 250000) {
					System.out.println("Test case pass as income is less than 250000 and PAN popup is displaying");
				} else {
					Assert.fail("Test case fail:As income is less than 250000 and PAN popup is coming");
				}
				Thread.sleep(500);
				driver.findElement(By.xpath("//span[contains(text(),\"Personal Details 2\")]")).click();

			}
		} catch (Exception e) {
			System.out.println(e);

		}
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

	public static void industryDropDownOptionSelection() throws Exception {

		Thread.sleep(200);
		waitTillElementToBeClickable(industryType);
		industryType.click();
		Thread.sleep(200);
		waitTillElementToBeClickable(industryTypeOthersOption);
		industryTypeOthersOption.click();
		Thread.sleep(800);
	}

	public static void checkPDFIsOpenedOrNotCheckMsg() throws Exception {
		Thread.sleep(14000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		if (tabs.size() == 2) {
			System.out.println("Test case pass:As PDF illustration is working");
			JourneyScreenTwo.ifConditionForTabSizeTwoPDFIllustration();

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

	public static void futureDateEnabilityInsurers() throws Exception {
		dateOfBirthIssurer();
		Calendar calendar = Calendar.getInstance();
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		int futuredate = currentDay + 1;
		String runtimeXpathForSelectingDate = "day-" + futuredate + "";
		boolean checkFutureDateIsEnabled = driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"))
				.isSelected();
		if (checkFutureDateIsEnabled) {
			logger.info("Test Case Fail:Future Date is enabled ");
		} else {
			logger.info("Test Case Pass:Future Date is disabled");
		}

	}

	public static void checkIFSCAndMICRServiceIsValidatedWithTosterMessge() throws Exception {
		bankAccountNo.click();
		// waitTillElementVisible(tosterMsgValidtaion);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.or(ExpectedConditions.visibilityOfElementLocated(By.id("client-snackbar")),
				ExpectedConditions.visibilityOfElementLocated(By.id("alert-dialog-description"))));

		if (isElementDisplayed(tosterMsgValidtaion)) {
			System.out.println("Test case pass as toster msg for MICR and IFSC validation is appearing");
		} else {
			escapeFunction();
			System.out.println(errorMsgForIFSCandMICR.getText());
			Assert.fail("Test case fail as toster msg for MICR and IFSC is not displaying");
		}
	}

	public static void checkDateFormat() throws Exception {
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

	public static void currentDatePickerInsurers() throws Exception {
		checkDateFormat();
		futureDateEnabilityInsurers();
		Calendar calendar = Calendar.getInstance();
		int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
		// System.out.println(currentDay);
		String runtimeXpathForSelectingDate = "day-" + currentDay + "";
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'disabled'))] [@aria-label=\""
						+ runtimeXpathForSelectingDate + "\"]"))
				.click();
	}

	public static void nomineeNamePositiveValidation(int x, int y, int z) throws Exception {
		nomineeName.clear();
		type(nomineeName, readingdata(x, y, z));
		String dataPassedFromExcel = nomineeName.getAttribute("value");
		int size = dataPassedFromExcel.length();
		if (size == 25 && dataPassedFromExcel.contains(".") && !dataPassedFromExcel.contains("@")) {
			logger.info("Test case pass:-As 'nominee name' feild acceping 25 char only");
		} else {
			Assert.fail("Test case fail:-As 'nominee name' acceping more than 25 char");
		}

	}

	public static void fillingNomineeName(int x, int y, int z) throws Exception {
		nomineeName.clear();
		type(nomineeName, readingdata(x, y, z));

	}

	public static void checkGenderMaleFemaleOption() throws Exception {
		if (genderMale.isDisplayed() && genderFemale.isDisplayed()) {

			logger.info("Test case pass:-As Gender - Option Male/Female both are present");
		} else {
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
		String xrelationshipWithNomineeDropDownOption = "//*[@id='menu-relationshipWithNominee']/div[2]/ul/li";
		comparingExcelDataWithUI(xrelationshipWithNomineeDropDownOption, 9, 8);
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
		if (RelationshipWithNomineeWhenOther.isDisplayed() && ReasonForNomination.isDisplayed()) {
			logger.info(
					"Test Case pass:-As 'Please specify relationship with Nominee' and 'Reason for Nomination' are present");
		} else {
			Assert.fail(
					"Test Case fail:-As 'Please specify relationship with Nominee' and 'Reason for Nomination' are not present");
		}

	}

	public static void relationshipWithNomineeWhenOther(int x, int y, int z) throws Exception {
		relationshipWithNomineeWhenOther.clear();
		type(relationshipWithNomineeWhenOther, readingdata(x, y, z));
	}

	public static void ReasonForNomination(int x, int y, int z) throws Exception {
		ReasonForNomination.clear();
		type(ReasonForNomination, readingdata(x, y, z));
	}

	public static void iFCPositiveAndNegativeValidation(int x, int y, int z) throws Exception {
		IFSC.clear();
		type(IFSC, readingdata(x, y, z));
		String sIFCPassedFromExcel = IFSC.getAttribute("value");
		int size = sIFCPassedFromExcel.length();
		if ((size == 11) && (sIFCPassedFromExcel.equalsIgnoreCase("ANDB0001899"))
				&& !sIFCPassedFromExcel.contains("@")) {
			logger.info("Test case pass:- As IFSC : Field Length 11, accepts alphaNumeric");
		} else {
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
		String sMICRPassedFromExcel = MICR.getAttribute("value");
		int size = sMICRPassedFromExcel.length();
		if ((size == 9) && (sMICRPassedFromExcel.equalsIgnoreCase("781011005"))
				&& !sMICRPassedFromExcel.contains("@")) {
			logger.info("Test case pass:- As MICR : Field Length 9, accepts Numeric");
		} else {
			Assert.fail("Test case fail:-As MICR : either Field Length is not 9 or not accepting Numeric");
		}

	}

	public static void setMICR(int x, int y, int z) throws Exception {
		MICR.clear();
		type(MICR, readingdata(x, y, z));
	}

	public static void bankNamePrepopulatedDataValidation() throws Exception {
		String gettingDataFromExcellForBankName = readingdata(4, 1, 11);
		String sBankNameFromExcel = BankName.getAttribute("value");
		if (sBankNameFromExcel.contentEquals(gettingDataFromExcellForBankName)) {
			logger.info("Test case pass:-As Bank Name is getting prepopulated");
		} else {
			Assert.fail("Test case fail:-As Bank Name is not getting prepopultaed");
		}
	}

	public static void bankBranchPrepopulatedDataValidation() throws Exception {
		String gettingDataFromExcellForBankBranch = readingdata(4, 1, 10);
		String sBankBranchFromExcel = BankBranch.getAttribute("value");

		if (sBankBranchFromExcel.contentEquals(gettingDataFromExcellForBankBranch)) {
			logger.info("Test case pass:-As Bank Branch is getting prepopulated");
		} else {
			Assert.fail("Test case fail:-As Bank Branch is not getting prepopultaed");
		}
	}

	public static void bankAccountPositiveNegativeValidation(int x, int y, int z) throws Exception {
		bankAccountNo.clear();
		type(bankAccountNo, readingdata(x, y, z));
		String sBankAccountNoFromExcel = bankAccountNo.getAttribute("value");
		int size = sBankAccountNoFromExcel.length();
		if ((size == 18) && (!sBankAccountNoFromExcel.contains("E"))) {
			logger.info("Test case pass:-As Bank Account No : Field Length is 18 and accepts only numbers");
		} else {
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
		String sAccHolderNameFromExcel = AccHolderName.getAttribute("value");
		int size = sAccHolderNameFromExcel.length();
		if ((size == 30) && (!sAccHolderNameFromExcel.contains("@") && (sAccHolderNameFromExcel.contains(".")))) {
			logger.info(
					"Test case pass:-As Account Holders Name : Field Length 30, accepts Alpha & (.) special character");
		} else {
			Assert.fail(
					"Test case fail:-As either Account Holders Name : Field Length is not 30 or not accepts Alpha or accepting Numeric & not (.) special character");
		}

	}

	public static void setAccountHoldersName(int x, int y, int z) throws Exception {
		AccHolderName.clear();
		type(AccHolderName, readingdata(x, y, z));

	}

	public static void asNomineeIsMinorProvideGuardianname() throws Exception {

		if (GuardianName.isEnabled()) {
			System.out.println("Test case pass as Guardian name feild is present when nominee age is less than 18");
		} else {
			Assert.fail("Test case is fail as Guardian name feild is not present when nominee age is less than 18");
		}
	}

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
		if (IFSC.isDisplayed() && MICR.isDisplayed() && BankName.isDisplayed() && BankBranch.isDisplayed()
				&& bankAccountNo.isDisplayed() && AccHolderName.isDisplayed() && typeOfAcc.isDisplayed()
				&& renewalPaymentBy.isDisplayed() && optionBtnEcs.isDisplayed() && optionBtnCheque.isDisplayed()
				&& labelSameAsBankDetails.isDisplayed()
				&& labelAllPayoutsCreditedToAccThroughElectronic.isDisplayed()) {
			System.out.println(
					"Test case pass as all the feilds is present for BANK DETAILS SECTION when dependent is not selected");
		} else {
			Assert.fail(
					"Test case fail:As all the feilds are not present for BANK DETAILS SECTION as per the requirment");
		}

	}



	public static void arrowUpFunctionToScrollUp() throws Exception {
		Thread.sleep(400);
		for (int i = 1; i < 7; i++) {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.ARROW_UP).build().perform();
		}
		Thread.sleep(400);
	}



	public static void fillingAnnualIncomeTOProceed(int x, int y, int z) throws Exception {
		waitTillElementVisible(annualIncomePersonalDetailsDependent);
		Thread.sleep(200);
		annualIncomePersonalDetailsDependent.clear();
		type(annualIncomePersonalDetailsDependent, readingdataTestData(x, y, z));
		Proceedbtn.click();
		Thread.sleep(200);

	}

	public static void agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer() throws Exception {
		// driver.switchTo().defaultContent();
		// driver.switchTo().alert();
		Thread.sleep(500);
		waitTillElementToBeClickable(proceedToSendPreInsuranceVerificationLinkToCustomerLabel);
		proceedToSendPreInsuranceVerificationLinkToCustomerLabel.isDisplayed();
		waitTillElementToBeClickable(agreePopup);
		System.out.println(agreePopup.isDisplayed());
		Thread.sleep(500);
		agreePopup.click();
		Thread.sleep(500);

	}

	public static void maleOptionSelectedByDefaultPayorDetails() throws Exception {
		WebElement input = driver.findElement(By.id("payorGenderMale"));
		Boolean checked = isAttribtuePresent(input, "checked");
		if (checked) {
			System.out.println("Test case pass as Male is selected by default");
		} else {
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

	public static void setState(int x, int y, int z) throws Exception {
		// --------------------
		statePayorNameSelectedYes.click();
		statePayorNameSelectedYes.clear();
		statePayorNameSelectedYes.sendKeys(readingdata(x, y, z));
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		// searchState.sendKeys(readingdata(x, y, z));
		// type(searchState, readingdata(x, y, z));
		// driver.findElement(By.xpath(".//*[@id='root']/main/div[2]/form/div/div/div[1]")).click();
		// searchState.click();
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
		if (statePayorNameSelectedYesDataFromExcel.length() == 9
				&& !statePayorNameSelectedYesDataFromExcel.contains("a")
				&& !statePayorNameSelectedYesDataFromExcel.contains("@")) {
			System.out.println("Test case pass:As annual income lenghth is 9 and not accepting alphabets");
		} else {
			Assert.fail("Test case fail:As either annual income lenghth is not of 9 or accepting alphabet");
		}
	}

	public static void payorAadhaarWhenYesOptionSelected(int x, int y, int z) throws Exception {
		payorAadhaarSelectedYes.clear();
		type(payorAadhaarSelectedYes, readingdata(x, y, z));
		String statePayorNameSelectedYesDataFromExcel = payorAadhaarSelectedYes.getAttribute("value");
		if (statePayorNameSelectedYesDataFromExcel.length() == 12
				&& !statePayorNameSelectedYesDataFromExcel.contains("*")
				&& !statePayorNameSelectedYesDataFromExcel.contains("A")) {
			System.out.println(
					"Test case pass:As aadhar number lenghth is 12 and not accepting alphabets and special character");
		} else {
			Assert.fail(
					"Test case fail:As either aadhar number lenghth is not of 12 or accepting alphabets or special character");
		}

	}

	public static void relationshipPayorWithProposerPayorDetailsDropDownValidation() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(relationshipPayorWithProposer);
		relationshipPayorWithProposer.click();
		String sheetpath = AppConstant.TEST_DATA_EXCELL;
		String xRelationshipWithProposer = ".//*[@id='menu-payorRelationship']/div[2]/ul/li";
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
		if (provideExistingEInsuranceAccountNumber.isDisplayed() && openNewEInsuranceAccountNumber.isDisplayed()) {
			System.out.println(
					"Test case pass:As provideExistingEInsuranceAccountNumber and openNewEInsuranceAccountNumber option button is present ");
		} else {
			Assert.fail(
					"Test case fail::As provideExistingEInsuranceAccountNumber or openNewEInsuranceAccountNumber option button is not present ");
		}

	}

	public static void providentExistingEInsuranceAccountNumberFeildsValidation() throws Exception {
		Thread.sleep(200);
		provideExistingEInsuranceAccountNumber.click();
		if (enterEIANo.isDisplayed()) {
			System.out.println("Test case pass:As enter EIA Number option is present ");
		} else {
			Assert.fail("Test case fail::As enter EIA Number option is present");
		}

		enterEIANo.clear();
		type(enterEIANo, readingdataTestData(0, 1, 7));
		String enterEIANoFromExcel = enterEIANo.getAttribute("value");
		int size = enterEIANoFromExcel.length();
		if (size == 13) {
			logger.info("Test case pass:-As enter EIA No feilds is of 13 length");
		} else {
			Assert.fail("Test case fail:-As enter EIA No feilds is not of 13 length");
		}

	}

	public static void openNewEInsuranceAccountNumberFeildValidation() throws Exception {
		Thread.sleep(200);
		openNewEInsuranceAccountNumber.click();
		if (labelPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith.isDisplayed()) {
			System.out.println(
					"Test case pass:As label Preferred Insurance Repository That You Would Like To Have EIA With is present ");
		} else {
			Assert.fail(
					"Test case fail::As label Preferred Insurance Repository That You Would Like To Have EIA With is not present ");
		}

		selectPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith.click();
		waitTillElementToBeClickable(select1stOptionPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith);
		Thread.sleep(200);
		String filePath = AppConstant.TEST_DATA_EXCELL;
		String xpathSelectPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith = ".//*[@id='menu-preferredInsurance']/div[2]/ul/li";
		comparingExcelDataWithUIBySheetPath(xpathSelectPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith, 0, 10,
				filePath);
		Thread.sleep(200);
		select1stOptionPreferredInsuranceRepositoryThatYouWouldLikeToHaveEIAWith.click();
	}

	public static void setDateBirthPayorDetails(int x, int y, int z) throws Exception {
		PageFactory.initElements(driver, JourneyScreenThree.class);
		String dateFormat = dateOfBirthPayorDetailsYesOptionSelected.getAttribute("placeholder");
		if (dateFormat.equalsIgnoreCase("DD/MM/YYYY")) {
			System.out.println("Test case pass:As DD/MM/YYYY is the format and displaying in date text box");
		} else {
			Assert.fail("Test case fail:Format is not DD/MM/YYYY");
		}
		dateOfBirthPayorDetailsYesOptionSelected.click();
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

		// dateOfBirthPayorDetailsYesOptionSelected.clear();
		// type(dateOfBirthPayorDetailsYesOptionSelected, readingdata(x, y, z));
		waitTillElementToBeClickable(dateOfBirthPayorDetailsYesOptionSelected);
		dateOfBirthPayorDetailsYesOptionSelected.click();

		dateOfBirthSelctionFunction();

	}

	public static void dateOfBirthSelctionFunction() throws Exception {
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='1991']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-22\"]"))
				.click();
		Thread.sleep(200);

	}

	public static void identityProofExpiryDateOfBirth() throws Exception {
		Thread.sleep(500);
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(".//*[@class='react-datepicker__year-select']/option[@value='2021']")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath(
				"//div[contains(@class, 'react-datepicker__month-container')]/div[contains(@class, 'react-datepicker__month')]/div/div[not(contains(@class,'outside-month'))] [@aria-label=\"day-22\"]"))
				.click();
		Thread.sleep(200);

	}

	public static void payorDetailsFeildsIsPresent() throws Exception {
		Thread.sleep(200);
		if (isPayorDifferentFromProposerNo.isDisplayed() && isPayorDifferentFromProposerYes.isDisplayed()
				&& politicallypowerNo.isDisplayed() && politicallypowerYes.isDisplayed() && noOptionEIA.isSelected()
				&& noOptionIsPayorDiff.isSelected()) {
			System.out.println("Test case pass:As all the feilds is present and NO option is selected by default");
		} else {
			Assert.fail(
					"Test case fail:As either all the feilds is not present or NO option is not selected by default");
		}
	}

	public static void payorDetailsYesOptionSelectedCheckFeilds() throws Exception {
		Thread.sleep(200);
		waitTillElementToBeClickable(isPayorDifferentFromProposerYes);
		isPayorDifferentFromProposerYes.click();
		if (labelNatinalityOptionPayorSelectedYes.isDisplayed() && indianOptionPayorSelectedYes.isDisplayed()
				&& nriOptionPayorSelectedYes.isDisplayed()
				&& scanPayorsPANToGetTheInformationPayorSelectedYes.isDisplayed()
				&& scanPayorsAdhaarToGetTheInformationPayorSelectedYes.isDisplayed()
				&& payorNameSelectedYes.isDisplayed() && dateOfBirthPayorDetailsYesOptionSelected.isDisplayed()
				&& genderPayorNameSelectedYes.isDisplayed() && genderMalePayorNameSelectedYes.isDisplayed()
				&& genderFemalePayorNameSelectedYes.isDisplayed() && addressPayorNameSelectedYes.isDisplayed()
				&& statePayorNameSelectedYes.isDisplayed() && annualIncomePayorSelectedYes.isDisplayed()
				&& payorAadhaarSelectedYes.isDisplayed() && payorPanNumberSelectedYes.isDisplayed()
				&& payorDontHavePanSelectedYes.isDisplayed()
				&& relationshipPayorWithProposerpayorSelectedYes.isDisplayed()) {
			System.out
					.println("Test case pass as all the feilds is present as per NO option selected of payor details");

		} else {
			Assert.fail("Test case fail as all the feilds are not present as per NO option selected of payor details");

		}

	}

	public static void payorDetailsYesOptionSelectedFeildsValidation(int x, int y, int z) throws Exception {
		Thread.sleep(200);
		payorNameSelectedYes.clear();
		type(payorNameSelectedYes, readingdata(x, y, z));
		String payorNameSelectedYesFromExcel = payorNameSelectedYes.getAttribute("value");
		int size = payorNameSelectedYesFromExcel.length();
		if (size == 75) {
			logger.info("Test case pass:-As payor name is of 75 length");
		} else {
			Assert.fail("Test case fail:-As payor name is  of 75 length");
		}

	}

	public static void identityProofExpiryDate() throws Exception {
		Thread.sleep(200);
		identityProofExpiryDate.click();
		identityProofExpiryDateOfBirth();
	}



	// from screen one------------------------------------







	public static void fatherNameInsurersDetails(int x, int y, int z) throws Exception {
		fathersNameInsurersDetails.clear();
		type(fathersNameInsurersDetails, readingdata(x, y, z));
		String firstNamePassedFromExcel = fathersNameInsurersDetails.getAttribute("value");
		int size = firstNamePassedFromExcel.length();
		if ((size == 25 && !firstNamePassedFromExcel.contains("@") && !firstNamePassedFromExcel.contains("1"))) {
			logger.info("Test case pass:- As father Name InsurersDetails is 25 and accepting only alphabets");
		} else {
			Assert.fail(
					"Test case fail:- As either father Name InsurersDetails is not 25 or not accepting only alphabets");
		}
	}

	public static void setfatherNameInsurersDetails(int x, int y, int z) throws Exception {
		fathersNameInsurersDetails.clear();
		type(fathersNameInsurersDetails, readingdata(x, y, z));
	}

	public static void dobProof1stOption() throws Exception {
		Thread.sleep(1000);
		click(dobProofInsurers1stOption);

	}

	public static void dOBProofInsurersDetails() throws Exception {
		click(dOBProofInsurersDetails);
		String xpathForedOBProofInsurersDetailsDropDown = "//*[@id='menu-insurerProofType']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathForedOBProofInsurersDetailsDropDown, 4, 7);
		dobProof1stOption();
	}

	public static void eductionInsurersDetails() throws Exception {

		click(eductionInsurersDetails);
	}

	public static void educationInsurers1stOption() throws Exception {
		Thread.sleep(1000);
		click(educationInsurers1stOption);

	}

	public static void educationInsurersDetails() throws Exception {
		eductionInsurersDetails();
		String xpathForeducationInsurersDetailsDropDown = "//*[@id='menu-insurerEducation']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathForeducationInsurersDetailsDropDown, 3, 17);
		educationInsurers1stOption();
	}

	public static void maritalStatusInsurersDetails() throws Exception {
		click(maritalStatusInsurersDetails);

	}

	public static void insurerMaritalStatus1stOption() throws Exception {
		Thread.sleep(1000);
		click(insurerMaritalStatus1stOption);

	}

	public static void maritalStatusDropDownInsurersDetails() throws Exception {
		maritalStatusInsurersDetails();
		String xpathForedOBProofInsurersDetailsDropDown = "//*[@id='menu-insurerMaritalStatus']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathForedOBProofInsurersDetailsDropDown, 5, 0);
		insurerMaritalStatus1stOption();
	}

	public static void InsurersIndustryType1stOption() throws Exception {
		Thread.sleep(1000);
		click(InsurersIndustryType1stOption);

	}

	public static void InsurersIndustryType() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(insurersIndustryType);
		insurersIndustryType.click();
		String xpathForedOBProofInsurersDetailsDropDown = "//*[@id='menu-insurerIndustryType']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathForedOBProofInsurersDetailsDropDown, 5, 1);
		InsurersIndustryType1stOption();
	}

	public static void industryDropDownListOptionSelectionValidationInsurer() throws Exception {
		Thread.sleep(500);
		for (int i = 1; i <= 7; i++) {
			waitTillElementToBeClickable(insurersIndustryType);
			Thread.sleep(500);
			insurersIndustryType.click();
			waitTillElementToBeClickable(
					driver.findElement(By.xpath(".//*[@id='menu-insurerIndustryType']/div[2]/ul/li[" + i + "]")));
			driver.findElement(By.xpath(".//*[@id='menu-insurerIndustryType']/div[2]/ul/li[" + i + "]")).click();
			Thread.sleep(2000);
			switch (i) {
			case 1:
				if (labledAreYouCurrentlyPostedInsurer.isDisplayed() && noOptionForCurrentlyPostedInsurer.isDisplayed()
						&& yesOptionForCurrentlyPostedInsurer.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per drop down option i.e DEFENCE(Screen Three Insureres details)");
				} else {
					Assert.fail(
							"All the feilds are not present as per  drop down option i.e DEFENCE(Screen Three Insureres details)");
				}
				break;
			case 2:
				if (labledAreYouProfessionalDiverInsurer.isDisplayed()
						&& noOptionForCurrentlyPostedInsurer.isDisplayed()
						&& yesOptionForCurrentlyPostedInsurer.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per drop down option i.e DIVING(Screen Three Insureres details) ");
				} else {
					Assert.fail(
							"All the feilds are not present as per drop down option i.e DIVING(Screen Three Insureres details)");
				}

				break;
			case 3:
				if (labledAreYouBasedAtOffshoreOrTravOffshoreInsurer.isDisplayed()
						&& noOptionForCurrentlyPostedInsurer.isDisplayed()
						&& yesOptionForCurrentlyPostedInsurer.isDisplayed()) {

					System.out.println(
							"All the feilds are present as per drop down option i.e OIL & NATURAL GAS(Screen Three Insureres details)");
				} else {
					Assert.fail(
							"All the feilds are not present as per drop down option i.e OIL & NATURAL GAS(Screen Three Insureres details)");
				}
				break;
			case 4:
				if (typeOfVesselWhereWorkingInsurers.isDisplayed()) {
					Thread.sleep(200);
					typeOfVesselWhereWorkingInsurers.click();
					Thread.sleep(200);
					String xTypeOfVesselWhereWorkingInsurer = ".//*[@id='menu-vesselTypeOfInsurer']/div[2]/ul/li";
					comparingExcelDataWithUI(xTypeOfVesselWhereWorkingInsurer, 9, 5);
					typeOfVesselWhereWorking1stOptionInsurers.click();
					Thread.sleep(200);
				}
				break;
			case 5:
				if (doesOurRoleInvolveGoingInsideAnyKindOfMineInsurer.isDisplayed()
						&& haveYouEverHadIllnessRelatedToYourOccupationInsurers.isDisplayed()
						&& yesDoesYourRoleGoingInsideMineInsurer.isDisplayed()
						&& noDoesYourRoleGoingInsideMineInsurer.isDisplayed()
						&& yesHaveYouEverHadIllnessRelatedToYourOccuoationInsurer.isDisplayed()
						&& noHaveYouEverHadIllnessRelatedToYourOccuoationInsurer.isDisplayed()) {

					System.out.println("All the feilds are present as per drop down industry type mining");
				} else {
					Assert.fail("All the feilds are not present as per drop down industry type mining");
				}
				break;

			case 6:
				if (exactNatureOfDutiesInsurer.isDisplayed() && flyingRoleInsurer.isDisplayed()
						&& nonFlyingRoleInsurer.isDisplayed()) {
					System.out.println("All the feilds are present as per drop down industry type Aviation/AirForce");
				} else {
					Assert.fail("All the feilds are not present as per drop down industry type Aviation/AirForce");
				}
				break;

			case 7:
				Thread.sleep(200);
			}
		}
	}

	public static void organizationTypeInsurersDetails() throws Exception {
		click(organizationTypeInsurersDetails);
	}

	public static void insurerOrganizationType1stOption() throws Exception {
		Thread.sleep(1000);
		click(insurerOrganizationType1stOption);
	}

	public static void organizationTypeInsurersDetailsDropDown() throws Exception {
		organizationTypeInsurersDetails();
		String xpathForedOBProofInsurersDetailsDropDown = "//*[@id='menu-insurerOrganizationType']/div[2]/ul/li";
		comparingExcelDataWithUI(xpathForedOBProofInsurersDetailsDropDown, 5, 2);
		insurerOrganizationType1stOption();
	}

	public static void insurerOccupation1stOption() throws Exception {
		Thread.sleep(1000);
		click(insurerOccupation1stOption);
	}

	public static void occupationInsurersDetails() throws Exception {
		click(occupationInsurersDetails);
	}

	public static void dOBProofInsurersDetailsOption() throws Exception {

		click(dOBProofInsurersDetails);
		dobProof1stOption();
	}

	public static void maritalStatusDropDownInsurersDetailsOptionSelection() throws Exception {
		maritalStatusInsurersDetails();
		insurerMaritalStatus1stOption();
	}

	public static void InsurersIndustryTypeOthersOption() throws Exception {
		Thread.sleep(1000);
		click(InsurersIndustryType7thOption);

	}

	public static void organizationTypeInsurersDetailsDropDownOptionSelection() throws Exception {
		organizationTypeInsurersDetails();
		insurerOrganizationType1stOption();
	}

	public static void educationInsurersDetailsOptionSelection() throws Exception {

		eductionInsurersDetails();
		educationInsurers1stOption();
	}

	public static void weightPersonalDetailsDependent(int x, int y, int z) throws Exception {
		Thread.sleep(200);
		weightPersonalDetailsDependent.clear();
		type(weightPersonalDetailsDependent, readingdataTestData(x, y, z));

	}

	public static void insurerOtherDetailsAnnualIncome(int x, int y, int z) throws Exception {
		Thread.sleep(200);
		insurerOtherDetailsAnnualIncome.clear();
		type(insurerOtherDetailsAnnualIncome, readingdataTestData(x, y, z));
	}

	public static void checkAllTheIsurersDetailsFeildsIsPresentForScreenThree() throws Exception {
		System.out.println("i ma checking");
		if (dobProofInsurersDetails.isEnabled() && fathersNameInsurersDetails.isDisplayed()
				&& CritiaclIllnessInsurersDetails.isDisplayed() && hazardousInsurersDetails.isDisplayed()
				&& criminalChargesInsurersDetails.isDisplayed() && heightInsurersDetails.isDisplayed()
				&& weightInsurersDetails.isDisplayed() && InsurerCriticalIllnessYesInsurersDetails.isDisplayed()
				&& InsurerCriticalIllnessNoInsurersDetails.isDisplayed()
				&& InsurerHazardousActivitiesYesInsurersDetails.isDisplayed()
				&& InsurerHazardousActivitiesNoInsurersDetails.isDisplayed()
				&& InsurerCriminalChargesYesInsurersDetails.isDisplayed()
				&& InsurerCriminalChargesNoInsurersDetails.isDisplayed() && nationalityInsurersDetails.isDisplayed()
				&& nationalityIndianInsurersDetails.isDisplayed() && nationalityNRIInsurersDetails.isDisplayed()
				&& insurerEducationIInsurersDetails.isEnabled() && insurerMaritalStatusIInsurersDetails.isEnabled()
				&& insurerIndustryTypeInsurersDetails.isEnabled() && insurerOrganizationTypeInsurersDetails.isEnabled()
				&& insurerOccupationInsurersDetails.isEnabled()) {
			System.out.println(
					"Test case pass:-As all the required feilds for insurers details for screen three is present");
		} else {
			Assert.fail(
					"Test case fail:-As all the required feilds for insurers details for screen three is not present");
		}
	}
	public static void isurersDetailsFeildsDropDownForScreenThree() throws Exception {
		setfatherNameInsurersDetails(3, 1, 0);
		dOBProofInsurersDetailsOption();
		educationInsurersDetailsOptionSelection();
		maritalStatusDropDownInsurersDetailsOptionSelection();
		insurersIndustryTypeOptionSelection();
		organizationTypeInsurersDetailsDropDownOptionSelection();
		occupationInsurersDetailsDropDownOptionSelection();
		JourneyScreenFour.selectingNoOptionForAllMedicalQusetion();
		weightPersonalDetailsDependent(0, 1, 0);
		insurerOtherDetailsAnnualIncome(0, 1, 1);
	}

	public static void occupationInsurersDetailsDropDownOptionSelection() throws Exception {
		Thread.sleep(500);
		waitTillElementVisible(occupationInsurersDetails);
		occupationInsurersDetails.click();
		Thread.sleep(500);
		waitTillElementToBeClickable(insurerOccupation2ndOption);
		insurerOccupation2ndOption.click();
	}

	public static void insurersIndustryTypeOptionSelection() throws Exception {
		Thread.sleep(500);
		waitTillElementToBeClickable(insurersIndustryType);
		insurersIndustryType.click();
		InsurersIndustryTypeOthersOption();
	}

	public static void checkInsureresNameOfCompanyDisplayingWhenSalariedSelected() throws Exception {
		Thread.sleep(200);
		if (isElementDisplayed(IssureresCompanyNameWhenSalariedFromOccupationSelected)) {
			System.out.println(
					"Test case pass:As name of company is displaying when salaried option is selected from occupation");
		} else {
			Assert.fail(
					"Test case fail As name of company is not displaying when salaried option is selected from occupation");
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
		String xOccupation = "//*[@id='menu-insurerOccupation']/div[2]/ul/li";
		comparingExcelDataWithUI(xOccupation, 9, 7);
		Thread.sleep(500);
		waitTillElementToBeClickable(insurerOccupation1stOption);
		insurerOccupation1stOption();
		checkInsureresNameOfCompanyDisplayingWhenSalariedSelected();
	}

	public static void checkAllTheIsurersDetailsFeildsDropDownListIsPresentForScreenThree() throws Exception {
		fatherNameInsurersDetails(3, 1, 0);
		dOBProofInsurersDetails();
		educationInsurersDetails();
		maritalStatusDropDownInsurersDetails();
		InsurersIndustryType();
		industryDropDownListOptionSelectionValidationInsurer();
		organizationTypeInsurersDetailsDropDown();
		occupationInsurersDetailsDropDown();

	}

	// ********************************** Calculate age from date of birth in
	// Java***********************************************************************************************************************
	public static void main(String[] args) throws Exception {
		System.out.print("Please enter date of birth in YYYY-MM-DD: ");
		/*
		 * Scanner scanner = new Scanner(System.in); String input = scanner.nextLine();
		 * scanner.close();
		 */
		String input = driver.findElement(By.xpath("")).getText();
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
