package uielements;

import java.io.File;
import java.io.FileInputStream;

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
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

import WebTest.JourneyScreenOneTest;
import WebTest.JourneyScreenThreeTest;
import WebTest.JourneyScreenTwoTest;
import util.AppConstant;

public class POSVFlowForSAPMIAP extends ReusableActions{
    
    
    // Locating Indian Nationality radio Button
    @FindBy(xpath="//input[@value='indian']")
    static WebElement Indianbtn;
    
    // Locating NRI Nationality radio Button
    @FindBy(xpath="//input[@value='nri']")
    static WebElement NRIbtn;
    
    @FindBy(xpath = "//*[@name='firstName']")
	static WebElement firtsName;
    
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
    
	@FindBy(xpath = "//label[@for='desiredAnnualIncomeYes']")
	static WebElement desiredAnnualIncomeYes;
    
    
    // Locating Company Policy For radio Button
    @FindBy(xpath="//input[@value='company']")
    static WebElement Companybtn;
    
    // Locating Aadhar number text field
    @FindBy(xpath="//input[@name='Aadhaar']")
    static WebElement AadharTxtfld;
    
    // Locating Don't have Aadhar number link
    @FindBy(xpath="//a[contains(text(),'t Have Aadhaar Number?')]")
    static WebElement DonthaveAadharLink;
    
    @FindBy(xpath="//input[@name='annualIncome']")
    static WebElement annualIncomeMIAP;
    
    // Locating Get OTP button
    @FindBy(xpath="//a[text()='Get OTP']")
    static WebElement GetOTPbtn;
    
    // Locating Pan Number text field
    @FindBy(xpath="//input[@name='PanNumber']")
    static WebElement PanNumbertxtfld;
    
    
    // Locating Don't Have PAN? link
    @FindBy(xpath="//a[contains(text(),'t Have PAN?')]")
    static WebElement DontHavePanlink;
    
    
    // Locating Mobile Number text field
    @FindBy(xpath="//input[@name='MobileNumber']")
    static WebElement MobNumtxtfld;
    
    
    // Locating Email Address text field
    @FindBy(xpath="//input[@name='email']")
    static WebElement Emailtxtfld;
    
    
    // Locating PreIssuanceVerificationNumber text field
    @FindBy(xpath="//input[@name='PreIssuanceVerificationNumber']")
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
    
    @FindBy(xpath="//span[contains(text(),\"Product Details\")]")
    static WebElement productDetails;
 
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
   
    @FindBy(xpath="//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[3]/div[2]/div/div[1]/div/input[@value = 'CBNPD0385D']")
    static WebElement ocrPrePopulatedPAN;
    
    @FindBy(xpath="//input[@name='FirstName']")
    static WebElement prePopulatedFirstName;
    
    @FindBy(xpath="//input[@name='LastName']")
    static WebElement prePopulatedLastName;
    
    @FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
    static WebElement prePopulatedDateOfBirth;
    
    @FindBy(xpath="//span[(text()='Front Upload')]")
    static WebElement frontUpload;
    
    @FindBy(xpath="//a[@href='/dashboard']")
    public static WebElement Dashboardbtn;
    
    @FindBy(xpath="//label/span/img[contains(@src,'data:image/png;')]")
    public static WebElement aadhaarOcr;
    
	@FindBy(xpath = "//input[@name='companyName']")
	public static WebElement companyNameProposerPersonalDetails;
   
    
    
    
 // Initializing the Objects
     public POSVFlowForSAPMIAP(WebDriver driver)
     {
         PageFactory.initElements(driver, this);
     }
     
     public static void dontHaveAadhaar() throws Exception {

            click(dontHaveAadhaar);
        }
     
     public static void productDetails() throws Exception {

         productDetails.click();
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
     
     
 // Select Indian as an nationality
         public static void selectIndian() throws Exception {
                PageFactory.initElements(driver, JourneyScreenOne.class);
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
        
        public static void aadhaarOCR() throws Exception {
        	PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
            click(aadhaarOcr);
            
        }
        
        public static void frontUpload() throws Exception {

            click(frontUpload);
            
        }
        
        
        // Enter Aadhaar Number
        public static void setAadhar(int x, int y, int z) throws Exception {
            PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
            AadharTxtfld.clear();
             type(AadharTxtfld, readingdata(x, y, z));

         }
        
        public static void prePopulationOCRAadhar() throws Exception {
        	PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
            Screen s = new Screen();
            String filepath="C:\\Matrix\\qa\\target\\SkuliImages\\";
            String inputFilePath ="C:\\Matrix\\qa\\target\\SkuliImages\\";
            Pattern openButton = new Pattern(filepath + "Open.PNG");
            Pattern fileNameText = new Pattern(filepath + "FileNameText.PNG");
            aadhaarOCR();
            Thread.sleep(500);
            frontUpload();
            s.wait(fileNameText, 80);
            s.type(fileNameText, inputFilePath + "AadharCard.jpg");
            s.click(openButton);
            Thread.sleep(8000);
            Actions action = new Actions(driver);
            action.sendKeys(Keys.ESCAPE).build().perform();
            Thread.sleep(2000);
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
        	PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
        	PanNumbertxtfld.clear();
             type(PanNumbertxtfld, readingdata(x, y, z));
        }
        
        public static void prePopulationPanOCR() throws Exception {
 			WebElement uploadElement=driver.findElement(By.id("image-scan-pan"));
 			uploadElement.sendKeys("C:\\Users\\sp104\\Downloads\\testing_docs\\602869836_Pan Card.jpeg");
		}
        
        

        public static void clickDontHavePan() throws Exception {

            click(DontHavePanlink);
            
        }
        
        
        // Enter Mobile Number
        public static void setMobNumber(int x, int y, int z) throws Exception {
            waitTillElementLocated(ocrPrePopulatedPAN);
             MobNumtxtfld.clear();
             type(MobNumtxtfld, readingdata(x, y, z));

         }
        
        public static void setMobNumberOCR(int x, int y, int z) throws Exception {
             MobNumtxtfld.clear();
             type(MobNumtxtfld, readingdata(x, y, z));

         }

        // Enter Email id
        public static void setEmailId(int x, int y, int z) throws Exception {
            
             //type(Emailtxtfld, strEmailId);
             Emailtxtfld.clear();
             type(Emailtxtfld, readingdata(x, y, z));

         }
        
        
        // Enter PreIssuance Verification Number
        public static void setPreIssuanceNumber(int x, int y, int z) throws Exception {
            
             //type(PreIssuancetxtfld, strPreIssuance);
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
        

        public static void check() throws Exception {
            PageFactory.initElements(driver, JourneyScreenOne.class);
            

}


        public static void checkPrePopulatedDataAfterPANOCR() throws Exception {
        String sPrePopulatedFirstName=prePopulatedFirstName.getAttribute("value");
         String sPrePopulatedLastName=prePopulatedLastName.getAttribute("value");
         String sPrePopulatedDateOfBirth=prePopulatedDateOfBirth.getAttribute("value");
         System.out.println(sPrePopulatedFirstName);
         System.out.println(sPrePopulatedLastName);
         System.out.println(sPrePopulatedDateOfBirth);
        if (sPrePopulatedFirstName.equalsIgnoreCase("Kushagra") && sPrePopulatedLastName.equalsIgnoreCase("Deep")
                && sPrePopulatedDateOfBirth.equalsIgnoreCase("17/08/1996")) {
            System.out.println("Test Case Pass:-As Data prepopulated from PAN OCR is correct");

        } else {

            Assert.fail("Test Case Fail:-As Data prepopulated from PAN OCR is not correct ");
        }}

     public static void checkPrePopulatedDataAfterAadhaarOCR() throws Exception {
        String   sPrePopulatedFirstName=prePopulatedFirstName.getAttribute("value");
        String    sPrePopulatedLastName=prePopulatedLastName.getAttribute("value");
        String sPrePopulatedDateOfBirth=prePopulatedDateOfBirth.getAttribute("value");
        System.out.println(sPrePopulatedFirstName+sPrePopulatedLastName+sPrePopulatedDateOfBirth);
       if (sPrePopulatedFirstName.equalsIgnoreCase("Sunny") && sPrePopulatedLastName.equalsIgnoreCase("Mittal")
               && sPrePopulatedDateOfBirth.equalsIgnoreCase("19/03/1984")) {
           System.out.println("Test Case Pass:-As Data prepopulated from Aadhaar OCR is correct");

       } else {

           Assert.fail("Test Case Fail:-As Data prepopulated from Aadhaar OCR is not correct ");
       }

   }


	public static boolean posvForSAPMultipleFirstNameTestForSelf() throws Exception {
    	 PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
    	File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
 		FileInputStream fileInputStream = new FileInputStream(file);
 		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
 		XSSFSheet sheet = hssfWorkbook.getSheetAt(5);
 		int totalNumOfRows = sheet.getLastRowNum();
 		System.out.println("\n Total num of rows found " + totalNumOfRows);
 		
 		for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
 			posvForSAPMultipleFirstName(sheet, rowNum);
 		}
 		hssfWorkbook.close();
 		return false;
 	}
   
     
     public static void posvForSAPMultipleFirstName(XSSFSheet sheet, int rowNum) throws Exception {
    	HomePage.clickDashboard();
 		HomePage.clickNewApp();
 		JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
 		Thread.sleep(500);
 		XSSFCell cellRep = sheet.getRow(rowNum).getCell(4);
		String firstNameFromExcel = cellRep.getStringCellValue();
		firtsName.clear();
 		firtsName.sendKeys(firstNameFromExcel);
		JourneyScreenTwo.fillingAllTheRequiredFeildForScreen2WithoutFirstName();
 		JourneyScreenTwo.traditional();
		JourneyScreenTwo.selectByDropdownSAP();
		JourneyScreenTwo.fillingAllTheRequiredFeildsForSAP();
		JourneyScreenTwo.checkPOSVforSAPPremiumCommitment(3,1,19);
 		
 		JourneyScreenThreeTest.proposerPersonalDetailsSection();
		JourneyScreenTwo.proposerPersonalDetailsIncome(9,1,10);
		JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
		JourneyScreenThreeTest.bankDetailsSectionFillingData();
		JourneyScreenThree.fillingAnnualIncomeTOProceed();
		Thread.sleep(1000);
		JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
		JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
		JourneyScreenFour.identityProofIssuingAuthority();
		JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();
		
		JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
		JourneyScreenFour.criticalIllnessNoOption();
		JourneyScreenFour.hazardousActivitiesNo();
		JourneyScreenFour.selectCriminalChargesNo();
		JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
		JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();
 		
 	}
   
     

	public static boolean posvForMIAPMultipleFirstNameTestForSelf() throws Exception {
		PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
		File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = hssfWorkbook.getSheetAt(5);
		int totalNumOfRows = sheet.getLastRowNum();
		System.out.println("\n Total num of rows found " + totalNumOfRows);

		for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
			posvForMIAPMultipleFirstName(sheet, rowNum);
		}
		hssfWorkbook.close();
		return false;
	}

	public static boolean posvForSAPMultipleFirstNameForDependent() throws Exception {
    	 PageFactory.initElements(driver, POSVFlowForSAPMIAP.class);
    	File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.MASTER_DATA_EXCELL);
 		FileInputStream fileInputStream = new FileInputStream(file);
 		XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fileInputStream);
 		XSSFSheet sheet = hssfWorkbook.getSheetAt(5);
 		int totalNumOfRows = sheet.getLastRowNum();
 		System.out.println("\n Total num of rows found " + totalNumOfRows);
 		
 		for (int rowNum = 1; rowNum < totalNumOfRows; rowNum++) {
			posvForSAPMultipleFirstNameForDependent(sheet, rowNum);
 		}
 		hssfWorkbook.close();
 		return false;
 	}
 
	public static void posvForSAPMultipleFirstNameForDependent(XSSFSheet sheet, int rowNum) throws Exception {
		HomePage.clickDashboard();
		HomePage.clickNewApp();
		JourneyScreenOneTest.fillingScreenOneFeildsFunctionForDependent();
		Thread.sleep(500);
		XSSFCell cellRep = sheet.getRow(rowNum).getCell(5);
		String firstNameFromExcel = cellRep.getStringCellValue();
		firtsName.clear();
		firtsName.sendKeys(firstNameFromExcel);
		JourneyScreenTwo.fillingAllTheRequiredFeildForScreen2WithoutFirstName();
		JourneyScreenTwo.fillingInsurersDetailsScreenTwo();
		JourneyScreenTwo.traditional();
		JourneyScreenTwo.selectByDropdownSTPDependent();


		JourneyScreenTwo.fillingAllTheRequiredFeildsForSTPDependent();
		Thread.sleep(300);

		// premiumCommitmentMIAPYesOptionSelection.click();
		JourneyScreenTwo.checkPOSVforSAPLoop();

		JourneyScreenThreeTest.proposerPersonalDetailsSection();
		JourneyScreenTwo.proposerPersonalDetailsIncome(9, 1, 10);
		JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
		JourneyScreenThreeTest.bankDetailsSectionFillingData();
		JourneyScreenThree.fillingAnnualIncomeTOProceed();
		Thread.sleep(1000);
		JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
		JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
		JourneyScreenFour.identityProofIssuingAuthority();
		JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();

		JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
		JourneyScreenFour.criticalIllnessNoOption();
		JourneyScreenFour.hazardousActivitiesNo();
		JourneyScreenFour.selectCriminalChargesNo();
		JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
		JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();

	}
     
	public static void posvForMIAPMultipleFirstName(XSSFSheet sheet, int rowNum) throws Exception {
		HomePage.clickDashboard();
		HomePage.clickNewApp();
		JourneyScreenThreeTest.ScreenOneTestIndianFuntn();
		Thread.sleep(500);
		XSSFCell cellRep = sheet.getRow(rowNum).getCell(5);
		String firstNameFromExcel = cellRep.getStringCellValue();
		firtsName.clear();
		firtsName.sendKeys(firstNameFromExcel);
		JourneyScreenTwo.fillingAllTheRequiredFeildForScreen2WithoutFirstName();
		JourneyScreenTwo.traditional();

		JourneyScreenTwo.selectByDropdownMIAP();
		JourneyScreenTwo.fillingAllTheRequiredFeildsForMIAP();
		Thread.sleep(300);
		desiredAnnualIncomeYes.click();

		JourneyScreenTwo.checkPOSVforMIAPAnnualIncome(3, 1, 12);

		JourneyScreenThreeTest.proposerPersonalDetailsSection();
		JourneyScreenTwo.proposerPersonalDetailsIncome(9, 1, 10);
		JourneyScreenThreeTest.nomineeDetailsWithoutDependentSelection();
		JourneyScreenThreeTest.bankDetailsSectionFillingData();
		JourneyScreenThree.fillingAnnualIncomeTOProceed();
		Thread.sleep(1000);
		JourneyScreenFour.form60RelatedDetailsIdentityProofNameOptionSelection();
		JourneyScreenFour.setIdentityProofNumberValidation(0, 1, 6);
		JourneyScreenFour.identityProofIssuingAuthority();
		JourneyScreenFour.iAmExemptFromTheRequirementOfPANUnderTheFollowingProvisionsOfTheITAct1961();

		JourneyScreenFour.arrowDownFunctionToScrollDownTillBottom();
		JourneyScreenFour.criticalIllnessNoOption();
		JourneyScreenFour.hazardousActivitiesNo();
		JourneyScreenFour.selectCriminalChargesNo();
		JourneyScreenFour.feetInchesKgsSelectionToMoveToScreen5POSV();
		JourneyScreenThree.agreePopupToProceedToSendPreIssuranceVerificationLinkToCustomer();

	}

}
