package uielements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.test.fulfilment.ReusableActions;

public class JourneyScreenTwo extends ReusableActions{
	

    private static final String Webelement = null;

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
    static WebElement AadharTxtfld;
    
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
    @FindBy(xpath="//button[@type='submit']")
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
    
 // Initializing the Objects
 	public JourneyScreenTwo(WebDriver driver)
 	{
 		PageFactory.initElements(driver, this);
 	}
 	
 	
 	@FindBy(xpath="//*[@name='FirstName']")
    static WebElement firtsName;
 	
 	
 	@FindBy(xpath="//*[@name='LastName']")
    static WebElement lastName;
 	
 	@FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
    static WebElement dateOfBirth;
 	
 	@FindBy(xpath="//*[@name='HouseNo']")
    static WebElement houseNo;
 	
 	@FindBy(xpath="//*[@name='RoadNo']")
    static WebElement roadNo;
 	
 	@FindBy(xpath="//*[@name='VillageTown']")
    static WebElement villageTown;
 	
 	@FindBy(xpath="//input[@placeholder='Search a country']")
    static WebElement country;
 	
 	@FindBy(xpath="//input[@placeholder='Search a state']")
    static WebElement searchState;

 	@FindBy(xpath="//input[@placeholder='Search a city']")
    static WebElement searchCity;
 	
 	@FindBy(xpath="//input[@name=\"PinCode\"]")
    static WebElement pinCode;

 	@FindBy(xpath="//input[@name=\"AlternateMobileNo\"]")
    static WebElement alternateMobileNo;
 	
 	@FindBy(xpath="//*[@id='permanent_address']/div[1]//div[@role='button']")
    static WebElement proofTypeDropDown;
 	
 	public static void selectByDropdown() throws Exception {
 		Select selectbyIndex=new Select(proofTypeDropDown);
		selectbyIndex.selectByIndex(0);
        
 	}
		
 	

 // Locating Proceed button
    @FindBy(xpath="//button[@type='submit']")
    static WebElement proceedBtn; 
 	
 // Enter First Name
 		public static void setFirstName(int x, int y, int z) throws Exception {
 			PageFactory.initElements(driver, JourneyScreenTwo.class);
 			firtsName.clear();
  			type(firtsName, readingdata(x, y, z));

  		}
 		
  	
 // Enter Last Name
 		public static void setLastName(int x, int y, int z) throws Exception {
 			lastName.clear();
  			type(lastName, readingdata(x, y, z));

  		}
 	
 	
 //	Enter Date of birth
  		public static void setDateOfBirth(int x, int y, int z) throws Exception {
  			dateOfBirth.clear();
  			dateOfBirth.click();
  			if(dateOfBirth.isSelected()) {
   			type(dateOfBirth, readingdata(x, y, z));
  			}else {
  				Assert.fail("Test case fail: Date of birth feild not allowing user to enter the date manually");
  			}
   		}	
 	
//  		Enter Date of birth
  		public static void selectByValue(int x, int y, int z) throws Exception {
  			dateOfBirth.clear();
  			if(dateOfBirth.isSelected()) {
   			type(dateOfBirth, readingdata(x, y, z));
   			
   			
  			}else {
  				Assert.fail("Test case fail: Date of birth feild not allowing user to enter the date manually");
  			}
   		}	
  		
  		
  		
  		
 	
// Enter House number
  		public static void setHouseNo(int x, int y, int z) throws Exception {
  			houseNo.clear();
   			type(houseNo, readingdata(x, y, z));

   		}
 	
  	// Enter Road number
  		public static void setRoadNo(int x, int y, int z) throws Exception {
  			roadNo.clear();
   			type(roadNo, readingdata(x, y, z));

   		}
  		
  	// Enter Village Town
  		public static void setVillageTown(int x, int y, int z) throws Exception {
  			villageTown.clear();
   			type(villageTown, readingdata(x, y, z));

   		} 	
 	
  	// Enter Country
  		public static void setCountry(int x, int y, int z) throws Exception {
  			country.clear();
   			type(country, readingdata(x, y, z));

   		} 
  
  	// Enter State
  		public static void setState(int x, int y, int z) throws Exception {
  			searchState.clear();
   			type(searchState, readingdata(x, y, z));

   		} 
  				
  	// Enter City
  		public static void setCity(int x, int y, int z) throws Exception {
  			searchCity.clear();
   			type(searchCity, readingdata(x, y, z));

   		} 
  				
  	// Enter PinCode
  		public static void setPinCode(int x, int y, int z) throws Exception {
  			pinCode.clear();
   			type(pinCode, readingdata(x, y, z));

   		}
 	
  	// Enter PinCode
  		public static void setAlternateMobileNo(int x, int y, int z) throws Exception {
  			alternateMobileNo.clear();
   			type(alternateMobileNo, readingdata(x, y, z));

   		}
 	
  		 // Select PIO as an nationality 
		public static void clickSubmitButton() throws Exception {

			click(proceedBtn);
			
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
 	   		PageFactory.initElements(driver, JourneyScreenTwo.class);
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
 	   		PageFactory.initElements(driver, JourneyScreenTwo.class);

			if(Proceedbtn.isEnabled())
			{		
			Assert.fail("Test Case Fail:Proceed button is enabled by default");
			}
			else
			{
			logger.info("Proceed button is not enabled by default");
			}
			
	}



}
