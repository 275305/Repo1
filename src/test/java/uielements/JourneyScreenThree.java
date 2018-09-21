package uielements;

import static org.testng.Assert.fail;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.test.fulfilment.ReusableActions;

import ch.qos.logback.classic.Logger;
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
	public
    static WebElement payorDetailsNo; 
 				
    @FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
    static WebElement dateOfBirth;
    
    @FindBy(xpath="//input[@name='NomineeName']")
    static WebElement nomineeName;
    
    @FindBy(xpath="//span[(text()=\"Male\")]")
    public static WebElement genderMale;
    
    @FindBy(xpath="//span[(text()=\"Female\")]")
    public static WebElement genderFemale;
    
    @FindBy(xpath=".//*[@id='root']/main/div/div[2]/form/div/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[3]/div[2]/div/div/div/div/div[@role=\"button\"]")
    public static WebElement relationshipWithNominee;
    
    @FindBy(xpath="//*[@id='menu-RelationshipWithNominee']/div[2]/ul/li")
    static List<WebElement> relationshipWithNomineeDropDownOption;
    
    @FindBy(xpath="//*[@id='menu-RelationshipWithNominee']/div[2]/ul/li[(text()=\"Others\")]")
    public static WebElement relationshipWithNomineDropdownOthersOption;
    
    @FindBy(xpath="//input[@name='RelationshipWithNomineeWhenOther']")
    public static WebElement RelationshipWithNomineeWhenOther;
    
    @FindBy(xpath="//input[@name='ReasonForNomination']")
    public static WebElement ReasonForNomination;
    
    @FindBy(xpath="//input[@name='BankAccountNo']")
    public static WebElement bankAccountNo;
    
    @FindBy(xpath="//input[@name='AccHolderName']")
    public static WebElement AccHolderName;
    
    @FindBy(xpath="//input[@name='IFSC']")
    public static WebElement IFSC;
    
    @FindBy(xpath="//input[@name='MICR']")
    public static WebElement MICR;

    @FindBy(xpath="//input[@name='BankName']")
    public static WebElement BankName;
    
    @FindBy(xpath="//input[@name='BankBranch']")
    public static WebElement BankBranch;

    
    
    
    public static void dateOfBirth() throws Exception {

		click(dateOfBirth);
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
    	String dateOfBirthFormat=dateOfBirth.getAttribute("placeholder");
    	if(dateOfBirthFormat.equalsIgnoreCase("DD/MM/YYYY"))
		{		
		logger.info("Test Case Pass: Date of Birth - Field format DD/MM/YYYY");
		}
		else
		{
			Assert.fail("Test Case Fail:Date of Birth - Field format DD/MM/YYYY is not as per functionality");
		}}

    	
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
   

   public static void nomineeNamePositiveValidation(int x, int y, int z) throws Exception {
	        nomineeName.clear();
			type(nomineeName, readingdata(x, y, z));
			String dataPassedFromExcel=	nomineeName.getAttribute("value");
		    int size = dataPassedFromExcel.length();
			if(size==75) 
			{
				logger.info("Test case pass:-As 'nominee name' feild acceping 75 char only");
			}else 
			{
				Assert.fail("Test case fail:-As 'nominee name' acceping more than 75 char");
			}

   }


   public static void checkGenderMaleFemaleOption() throws Exception {
	   if(genderMale.isDisplayed()&& genderFemale.isDisplayed()) {
		   
		   logger.info("Test case pass:-As Gender - Option Male/Female both are present");
	   }else {
		   Assert.fail("Test case fail:-As Gender - Option Male/Female is not present");
	   }
	   
	   
   }
   
   
   
   
   public static void checkRelationshipWithNomineeDropDownvalues() throws Exception {
	  // relationshipWithNominee();
	   String[] dropDownValueOfMaritalStatus= {"Parent","Spouse","Brother","Sister","Grand Parent","Others"};
	   System.out.print(relationshipWithNominee.getText());
	   relationshipWithNominee.click();
	   for(WebElement item:relationshipWithNomineeDropDownOption) {
		   System.out.println("Dropdown values are "+ item.getText()); 
		   boolean match = false;
		   for (int i=0; i<dropDownValueOfMaritalStatus.length; i++){
               if (item.getText().equals(dropDownValueOfMaritalStatus[i])){
                 match = true;
                 
               }
             }
           //Assert.assertTrue(match);
           Assert.assertTrue(match, item.getText());
           
         }
         
   }
	  
   public static void otherIsSelectedThen2MoreTextFieldsWillOen() throws Exception {
	   relationshipWithNomineDropdownOthersOption();
	   Thread.sleep(2000);
	   if(RelationshipWithNomineeWhenOther.isDisplayed()&& ReasonForNomination.isDisplayed()) {
		   logger.info("Test Case pass:-As 'Please specify relationship with Nominee' and 'Reason for Nomination' are present");
	   }
	   else {
	   Assert.fail("Test Case fail:-As 'Please specify relationship with Nominee' and 'Reason for Nomination' are not present");
   }}


   
   public static void iFCPositiveAndNegativeValidation(int x, int y, int z) throws Exception {
	    IFSC.clear();
	    type(IFSC, readingdata(x, y, z));
		String sIFCPassedFromExcel=	IFSC.getAttribute("value");
	    int size = sIFCPassedFromExcel.length();
		if((size==11) && (sIFCPassedFromExcel.equalsIgnoreCase("111111UUUUU"))) 
		{
			logger.info("Test case pass:- As IFSC : Field Length 11, accepts alphaNumeric");
		}else 
		{
			Assert.fail("Test case fail:-As IFSC : Field not as per the expectation (Length 11, accepts alphaNumeric)");
		}

}
   public static void mICRPositiveAndNegativeValidation(int x, int y, int z) throws Exception {
	    MICR.clear();
	    type(MICR, readingdata(x, y, z));
		String sMICRPassedFromExcel=MICR.getAttribute("value");
	    int size = sMICRPassedFromExcel.length();
		if((size==9) && (sMICRPassedFromExcel.equalsIgnoreCase("222222233"))) 
		{
			logger.info("Test case pass:- As MICR : Field Length 9, accepts Numeric");
		}else 
		{
			Assert.fail("Test case fail:-As MICR : either Field Length is not 9 or not accepting Numeric");
		}
   
   }
   
   public static void bankNamePositiveNegativeValidation(int x, int y, int z) throws Exception {
	    BankName.clear();
	    type(BankName, readingdata(x, y, z));
		String sBankNameFromExcel=BankName.getAttribute("value");
	    int size = sBankNameFromExcel.length();
		if((size==300) && (sBankNameFromExcel.contains("1")&& sBankNameFromExcel.contains("W")&&sBankNameFromExcel.contains("@"))) 
		{
			logger.info("Test case pass:-As Bank Name : Field Length 300, accepts Alpha,Numeric, special character");
		}else 
		{
			Assert.fail("Test case fail:-As Bank Name : Field Length either is not of 300 or not accepting Alpha,Numeric or special character");
		}
  }
   
   public static void bankBranchPositiveNegativeValidation(int x, int y, int z) throws Exception {
	   BankBranch.clear();
	    type(BankBranch, readingdata(x, y, z));
		String sBankBranchFromExcel=BankBranch.getAttribute("value");
	    int size = sBankBranchFromExcel.length();
		if((size==300) && (sBankBranchFromExcel.contains("1")&& sBankBranchFromExcel.contains("W")&&sBankBranchFromExcel.contains("@"))) 
		{
			logger.info("Test case pass:-As Bank Branch : Field Length 300, accepts Alpha,Numeric, special character");
		}else 
		{
			Assert.fail("Test case fail:-As Bank Branch : Field Length either is not of 300 or not accepting Alpha,Numeric or special character");
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
   
	public static void accountHoldersNamePositiveNegativeValidation(int x, int y, int z) throws Exception {
	AccHolderName.clear();
	type(AccHolderName, readingdata(x, y, z));
	String sAccHolderNameFromExcel=AccHolderName.getAttribute("value");
	int size = sAccHolderNameFromExcel.length();
	if((size==18) && (!sAccHolderNameFromExcel.contains("1")&&(sAccHolderNameFromExcel.contains(".")&&sAccHolderNameFromExcel.contains("A")))) 
			{		
		logger.info("Test case pass:-As Account Holders Name : Field Length 18, accepts Alpha & (.) special character");
			}
			else 
						{
							Assert.fail("Test case fail:-As either Account Holders Name : Field Length is not 18 or not accepts Alpha or accepting Numeric & not (.) special character");
						}
				
				
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
	   
	 
             
   
   



 














		
		
		
		

