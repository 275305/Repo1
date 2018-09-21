package uielements;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.test.fulfilment.ReusableActions;

import net.bytebuddy.asm.Advice.Return;

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
 	
 	@FindBy(xpath="//*[@id='permanent_address']/div[1]/div/div/div/div/div/div[@role='button']")
    static WebElement proofTypeDropDown;
 	
 	@FindBy(xpath="//*[@id='menu-ProofType']/div[2]/ul/li[1]")
    static WebElement proofTypeDropDownValue;
 	
 	 @FindBy(xpath="//label[contains(text(),\"Traditional\")]")
     static WebElement traditional;
     
     @FindBy(xpath="//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[@role='button']")
     static WebElement productName;
     
     @FindBy(xpath="//*[@id='menu-ProductName']/div[2]/ul/li[text()='Max Life Super Term Plan']")
     static WebElement maxLifeSuperTermPlan;
     
     @FindBy(xpath="//*[@id='menu-ProductName']/div[2]/ul/li[text()='Max Life Cancer Insurance Plan']")
     static WebElement maxLifeCancerInsurancePlan;
    //****************************************************************** 
     @FindBy(xpath="//input[@name=\"SumAssured\"]")
     static WebElement sumAssured;
     
     @FindBy(xpath="//*[contains(text(),\"Smoking Habit\")]")
     static WebElement smokingHabit;
     
     @FindBy(xpath="//label[text()='Policy Term']")
     static WebElement policyTerm;
     
     @FindBy(xpath="//label[text()='Premium Payment Term']")
     static WebElement premiumPaymentTerm;
     
     @FindBy(xpath="//label[text()='Dividend Adjustment']")
     static WebElement dividendAdjustment;
     
     @FindBy(xpath="//*[contains(text(),\"Mode of Payment\")]")
     static WebElement modeOfPayment;
     
     @FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
     static WebElement effectiveDateOfCoverage;
     
     @FindBy(xpath="//span[contains(text(), 'WOP Plus Rider')]")
     static WebElement WOPPlusRider;
     
     @FindBy(xpath="//span[contains(text(), 'Accidental Death And Dismemberment Rider')]")
     static WebElement accidentalDeathAndDismembermentRider;
     
     @FindBy(xpath="//label[text()='Maturity Age']")
     static WebElement maturityAge;
     
     @FindBy(xpath="//label[text()='Sum Assured Available']")
     static WebElement sumAssuredAvailable;
     
     @FindBy(xpath="//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div/div/div/div/div[@role='button']")
     static WebElement needOfInsurance;
     
     @FindBy(xpath="//*[@id='menu-NeedOfInsurance']/div[2]/ul/li[1]")
     static WebElement needOfInsurance1stOption;
     
     @FindBy(xpath=".//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div/div[@role='button']")
     static WebElement lifeStage;
     
     @FindBy(xpath="//*[@id='menu-LifeStage']/div[2]/ul/li[1]")
     static WebElement lifeStage1stOption;
     
     @FindBy(xpath="//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[@role='button']")
     static WebElement dropDownModeOfPayment;
     
     @FindBy(xpath="//*[@id='menu-ModeOfPayment']/div[2]/ul/li[1]")
     static WebElement modeOfPayment1stOption;
     
     @FindBy(xpath="//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div[@role='button']")
     static WebElement dropDownMaturityAge;
     
     @FindBy(xpath="//*[@id='menu-MaturityAge']/div[2]/ul/li[1]")
     static WebElement maturityAge1stOption;
     
     @FindBy(xpath="//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[4]/div/div[3]/div/div/div/div/div[@role='button']")
     static WebElement dropDownSumAssuredAvailable;
     
     @FindBy(xpath="//*[@id='menu-SumAssuredAvailable']/div[2]/ul/li[1]")
     static WebElement sumAssuredAvailable1stOption;
     
     @FindBy(xpath="//*[@id='react-autowhatever-1--item-0']/div/div/span[contains(@style,'font-weight: 500;')]")
     static WebElement countryDropDown;
     
     
     
     
 	

  	public static void selectByDropdown() throws Exception {
  		PageFactory.initElements(driver, JourneyScreenTwo.class);
         //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         waitTillElementToBeClickable(proofTypeDropDown);
         proofTypeDropDown.click();
         
         
         
         WebElement element=driver.findElement(By.xpath("//*[@id='menu-ProofType']/div[2]/ul/li[1]"));
         new Actions(driver).moveToElement(element).click().perform();
         proofTypeDropDownValue.click();
  	}
 	
 	public static void traditional() throws Exception {

		click(traditional);
		}
 	
 	
 	
 	public static void selectByDropdownProductName() throws Exception {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitTillElementToBeClickable(productName);
        productName.click();
        waitTillElementToBeClickable(maxLifeSuperTermPlan);
        maxLifeSuperTermPlan.click();
    
 	}
 	
 	
 	public static void selectByDropdownCancerInsurancePlan() throws Exception {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		waitTillElementToBeClickable(productName);
 		productName.click();
 		waitTillElementToBeClickable(maxLifeCancerInsurancePlan);
        maxLifeCancerInsurancePlan.click();
    
 	}
 	
 	public static void selectByDropdownNeedOfInsurance() throws Exception {
 		waitTillElementToBeClickable(needOfInsurance);
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        needOfInsurance.click();
        waitTillElementToBeClickable(needOfInsurance1stOption);
        needOfInsurance1stOption.click();
    
 	}
 	
 	public static void selectByDropdownLifeStage() throws Exception {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		waitTillElementToBeClickable(lifeStage);
 		
 		lifeStage.click();
 		waitTillElementToBeClickable(lifeStage1stOption);
        lifeStage1stOption.click();
    
 	}
 	
 	public static void selectByDropdownModeOfPayment() throws Exception {
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		waitTillElementToBeClickable(dropDownModeOfPayment);
 		dropDownModeOfPayment.click();
 		waitTillElementToBeClickable(modeOfPayment1stOption);
 		modeOfPayment1stOption.click();
    
 	}

public static void selectByDropdownMaturityAge() throws Exception {
        
 		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		waitTillElementToBeClickable(dropDownMaturityAge);
 		dropDownMaturityAge.click();
 		waitTillElementToBeClickable(maturityAge1stOption);
 		maturityAge1stOption.click();
    
 	}
 	
public static void selectByDropdownSumAssuredAvailable() throws Exception {
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		waitTillElementToBeClickable(dropDownSumAssuredAvailable);
		dropDownSumAssuredAvailable.click();
		waitTillElementToBeClickable(sumAssuredAvailable1stOption);
		sumAssuredAvailable1stOption.click();

	}
 	

 // Locating Proceed button
    @FindBy(xpath="//span[contains(text(), 'Proceed')]")
    static WebElement proceedBtn; 
 	
 // Enter First Name
 		public static void setFirstName(int x, int y, int z) throws Exception {
 			PageFactory.initElements(driver, JourneyScreenTwo.class);
 			firtsName.clear();
  			type(firtsName, readingdata(x, y, z));
  			String firstNamePassedFromExcel=	firtsName.getAttribute("value");
 			int size = firstNamePassedFromExcel.length();
 			if((size==50 && !firstNamePassedFromExcel.contains("@") && !firstNamePassedFromExcel.contains("1") )) 
 			{
 				logger.info("Test case pass:- As first name feild length is 50 and accepting only alphabets");
 			}else 
 			{
 				Assert.fail("Test case fail:- As either first name feild length is not of 50 or not accepting only alphabets");
 			}
 			

  		}
 		
  	
 // Enter Last Name
 		public static void setLastName(int x, int y, int z) throws Exception {
 			lastName.clear();
  			type(lastName, readingdata(x, y, z));
  			String lastNamePassedFromExcel=	lastName.getAttribute("value");
 			int size = lastNamePassedFromExcel.length();
 			if((size==25 && !lastNamePassedFromExcel.contains("@") && !lastNamePassedFromExcel.contains("1") )) 
 			{
 				logger.info("Test case pass:- As last name feild length is 50 and accepting only alphabets");
 			}else 
 			{
 				Assert.fail("Test case fail:- As either last name feild length is not of 50 or not accepting only alphabets");
 			}

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
   			String houseNoDataFromExcel=	houseNo.getAttribute("value");
 			int size = houseNoDataFromExcel.length();
 			if((size==60 && houseNoDataFromExcel.contains("1") && houseNoDataFromExcel.contains("!") )) 
 			{
 				logger.info("Test case pass:- As house number feild length is 60 and accepting alphanumeric and special character ");
 			}else 
 			{
 				Assert.fail("Test case fail:- As either house number feild length is not of 60 or not accepting alphanumeric or special character ");
 			}


   		}
 	
  	// Enter Road number
  		public static void setRoadNo(int x, int y, int z) throws Exception {
  			roadNo.clear();
   			type(roadNo, readingdata(x, y, z));
   			String houseNoDataFromExcel=	roadNo.getAttribute("value");
 			int size = houseNoDataFromExcel.length();
 			if((size==60 && houseNoDataFromExcel.contains("1") && houseNoDataFromExcel.contains("!") )) 
 			{
 				logger.info("Test case pass:- As Road number feild length is 60 and accepting alphanumeric and special character ");
 			}else 
 			{
 				Assert.fail("Test case fail:- As either Road number feild length is not of 60 or not accepting alphanumeric or special character ");
 			}

   		}
  		
  	// Enter Village Town
  		public static void setVillageTown(int x, int y, int z) throws Exception {
  			
  			villageTown.clear();
   			type(villageTown, readingdata(x, y, z));
   			String houseNoDataFromExcel=	villageTown.getAttribute("value");
 			int size = houseNoDataFromExcel.length();
 			if((size==60 && houseNoDataFromExcel.contains("1") && houseNoDataFromExcel.contains("!") )) 
 			{
 				logger.info("Test case pass:- As village town feild length is 60 and accepting alphanumeric and special character ");
 			}else 
 			{
 				Assert.fail("Test case fail:- As either village town feild length is not of 60 or not accepting alphanumeric or special character ");
 			}

   		} 	
 	
  	// Enter Country
  		public static void setCountry(int x, int y, int z) throws Exception {
  			country.clear();
   			type(country, readingdata(x, y, z));
   			String countryDataFromExcel=	country.getAttribute("value");//I
   			String dropDownValue=countryDropDown.getText();
   			if(dropDownValue.startsWith(countryDataFromExcel)) {
         	System.out.println("Test Case pass:-As smart search for country is working properly");
   		} else {
   		Assert.fail("Test case fail:-As smart search for country is not woring properly");	
   		}
   		}
   		
   		
  
  	// Enter State
  		public static void setState(int x, int y, int z) throws Exception {
  			searchState.clear();
   			type(searchState, readingdata(x, y, z));
   			String countryDataFromExcel=	searchState.getAttribute("value");//A
   			String dropDownValue=countryDropDown.getText();
   			if(dropDownValue.startsWith(countryDataFromExcel)) {
         	System.out.println("Test Case pass:-As smart search for state is working properly");
   		} else {
   		Assert.fail("Test case fail:-As smart search for state is not woring properly");	
   		}
   		
   		} 
  				
  	// Enter City
  		public static void setCity(int x, int y, int z) throws Exception {
  			searchCity.clear();
   			type(searchCity, readingdata(x, y, z));
   			String countryDataFromExcel=	searchCity.getAttribute("value");//A
   			String dropDownValue=countryDropDown.getText();
   			if(dropDownValue.startsWith(countryDataFromExcel)) {
         	System.out.println("Test Case pass:-As smart search for city is working properly");
   		} else {
   		Assert.fail("Test case fail:-As smart search for city is not woring properly");	
   		}
   		} 
  				
  	// Enter PinCode
  		public static void setPinCode(int x, int y, int z) throws Exception {
  			pinCode.clear();
   			type(pinCode, readingdata(x, y, z));
   			String pinCodeDataFromExcel=	pinCode.getAttribute("value");
 			int size = pinCodeDataFromExcel.length();
 			if((size==6 && !pinCodeDataFromExcel.contains("@") && !pinCodeDataFromExcel.contains("A") )) 
 			{
 				logger.info("Test case pass:- As Pin code feild length is 6 and accepting numeric only");
 			}else 
 			{
 				Assert.fail("Test case fail:- As either Pin code feild length is not of 6 or not accepting numeric only");
 			}

   		}
 	
  	// Enter PinCode
  		public static void setAlternateMobileNo(int x, int y, int z) throws Exception {
  			alternateMobileNo.clear();
   			type(alternateMobileNo, readingdata(x, y, z));
   			String alternateMobileDataFromExcel=	alternateMobileNo.getAttribute("value");
 			int size = alternateMobileDataFromExcel.length();
 			if((size==10 && !alternateMobileDataFromExcel.contains("@") && !alternateMobileDataFromExcel.contains("A") )) 
 			{
 				logger.info("Test case pass:- As alternate mobile number feild length is 10 and accepting numeric only");
 			}else 
 			{
 				Assert.fail("Test case fail:- As alternate mobile number feild length either is not of 10 or not accepting numeric only");
 			}

   			
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
		public static void isAllTheRequiredFeildIsPresentAsPerPayorDetailssectionOfSuperTermPlan() throws Exception {
			if(sumAssured.isDisplayed()&& smokingHabit.isDisplayed()&& policyTerm.isDisplayed() && premiumPaymentTerm.isDisplayed()
				&& dividendAdjustment.isDisplayed() && modeOfPayment.isDisplayed() && effectiveDateOfCoverage.isDisplayed()&& WOPPlusRider.isDisplayed()
				&& accidentalDeathAndDismembermentRider.isDisplayed())
			{		
			logger.info("All the Required feilds are present as per the -->Payor Details section story-Max Life Super Term Plan");
			}
			else
			{
				Assert.fail("All the Required feilds are not present as per the -->Payor Details section-Max Life Super Term Plan.story hence story fails");
			
			}
			
	}	

		public static void isAllTheRequiredFeildIsPresentAsPerPayorDetailssectionofCancerInsurancePlan() throws Exception {
			if(modeOfPayment.isDisplayed()&& maturityAge.isDisplayed()&& sumAssuredAvailable.isDisplayed())
			{		
			logger.info("All the Required feilds are present as per the -->Payor Details section story-Max Life Cancer Insurance Plan");
			}
			else
			{
				Assert.fail("All the Required feilds are not present as per the -->Payor Details section story-Max Life Cancer Insurance Plan hence story fails");
			
			}
			
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
}
