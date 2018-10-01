package uielements;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.fulfilment.ReusableActionsUpdate;

public class JourneyScreenOne extends ReusableActionsUpdate{
	
	

    
    
    // Locating Indian Nationality radio Button
    @FindBy(xpath="//input[@value='indian']")
    static WebElement Indianbtn; 
    
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
    @FindBy(xpath="//input[@name='Aadhaar']")
	public static WebElement AadharTxtfld;
    
    // Locating Don't have Aadhar number link
    @FindBy(xpath="//a[contains(text(),'t Have Aadhaar Number?')]")
    static WebElement DonthaveAadharLink;
    
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
  
    // Locating Proceed button
    @FindBy(xpath="//button[@type='button']")
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
    @FindBy(xpath="//div[1]/input[@type='tel']")
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
    @FindBy(xpath="//div//button[2]//span[text()='Proceed']")
    static WebElement InvalidProceedbtn;
    
    
 // Locating Logo of Max life
    @FindBy(xpath="//a[@class='Logo__logohead__2fZWZ']")
    //@FindBy(xpath="//a[@class='Logo__logohead__NbryV']")
    static WebElement MaxLogo;
    
    @FindBy(xpath="//a[contains(text(),\"Don't Have Aadhaar Number?\")]")
    static WebElement dontHaveAadhaar;
    
    @FindBy(xpath="//label[contains(text(),\"Never applied\")]")
    static WebElement neverApplied;
    
    @FindBy(xpath="//label[contains(text(),\"Jammu & Kashmir\")]")
    static WebElement jammuKashmir;
    
    @FindBy(xpath="//*[@id='alert-dialog-aadhaar']/div[3]/div/div/div/button//span[contains(text(),\"Proceed\")]")
    static WebElement popupProceedButton;
    
    
 // Initializing the Objects
 	public JourneyScreenOne(WebDriver driver)
 	{
 		PageFactory.initElements(driver, this);
 	}
 	
 	
 	public static void dontHaveAadhaar() throws Exception {

		click(dontHaveAadhaar);
		
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
		
		
		
        // Enter Aadhaar Number
		public static void setAadhar(int x, int y, int z) throws Exception {
			AadharTxtfld.clear();
 			type(AadharTxtfld, readingdata(x, y, z));

 		}
		
		   // Clear Aadhaar Number
				public static void clearAadhar() throws Exception {
					AadharTxtfld.clear();
		 			
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
			
 			//type(PanNumbertxtfld, strPanNumber);
 			PanNumbertxtfld.clear();
 			type(PanNumbertxtfld, readingdata(x, y, z));

 		}
		
		
		public static void clickDontHavePan() throws Exception {

			click(DontHavePanlink);
			
		}
		
		
        // Enter Mobile Number
		public static void setMobNumber(int x, int y, int z) throws Exception {
			
 			//type(MobNumtxtfld, strMobNumber);
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
		
		
		
		public static void verifyOtpPage() throws Exception {
			
			
			String actualLabel = Otpverifylbl.getText();
			String expectedLabel = "Please enter the OTP sent to your registered mobile number.";
			assertEquals(actualLabel, expectedLabel);
			logger.info("User is landed to Verify OTP Screen successfully.");

		
		
		}
		
		 // Enter digit one for OTP
		public static void setOTPfld1(int x, int y, int z) throws Exception {
			
			OTPtxtfld1.clear();
 			type(OTPtxtfld1, readingdata(x, y, z));

 		}
		
		 // Enter digit two for OTP
		public static void setOTPfld2(int x, int y, int z) throws Exception {
			
			OTPtxtfld2.clear();
			type(OTPtxtfld2, readingdata(x, y, z));

		}
		
		 // Enter digit three for OTP
		public static void setOTPfld3(int x, int y, int z) throws Exception {
			
			OTPtxtfld3.clear();
			type(OTPtxtfld3, readingdata(x, y, z));

		}
		
		 // Enter digit four for OTP
		public static void setOTPfld4(int x, int y, int z) throws Exception {
			
			OTPtxtfld4.clear();
			type(OTPtxtfld4, readingdata(x, y, z));

		}
		
		 // Enter digit five for OTP
		public static void setOTPfld5(int x, int y, int z) throws Exception {
			
			OTPtxtfld5.clear();
			type(OTPtxtfld5, readingdata(x, y, z));

		}
		
		 // Enter digit Six for OTP
		public static void setOTPfld6(int x, int y, int z) throws Exception {
			
			OTPtxtfld6.clear();
			type(OTPtxtfld6, readingdata(x, y, z));

		}
		
		
		public static void verifyInvalidOtpPage() throws Exception {
			
			waitTillElementLocated(Invalidlbl);
			String actualLabel = Invalidlbl.getText();
			String expectedLabel = "Invalid OTP";
			assertEquals(actualLabel, expectedLabel);
			logger.info("Entered OTP is not Valid.");

		
		
		}
		
		 // Click on OK Button on Invalid OTP page
		public static void ClickInvalidOTPOK() throws Exception {
			
			InvalidOKbtn.click();
			

		}

		
		 // Click on Proceed Button on Invalid OTP page
		public static void ClickInvalidOTPProceed() throws Exception {
			
			InvalidProceedbtn.click();
			

		}
		
		
       public static void verifyInvalidAadharPage() throws Exception {
			
			waitTillElementLocated(Invalidaadharmsg);
			String actualLabel = Invalidaadharmsg.getText();
			String expectedLabel = "Invalid aadhaar number/Service not responding.";
			assertEquals(actualLabel, expectedLabel);
			logger.info("Entered Aadhar number is not Valid or Service not responding.");

		
		}
		
       // Click on Ok Button on Invalid Aadhar page
		public static void ClickInvalidAadharOk() throws Exception {
			
			Okbtn.click();
			
		}
		
		
		 // Click on Ok Button on Invalid Aadhar page
		public static void ClickMaxLogo() throws Exception {
			Actions actions = new Actions(driver);
			actions.moveToElement(MaxLogo).click().perform();
			
		}
		


		
		
		
		
		
		
}
