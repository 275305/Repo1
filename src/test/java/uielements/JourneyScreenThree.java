package uielements;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.test.fulfilment.ReusableActions;

public class JourneyScreenThree extends ReusableActions {
	
	 // Locating Personal Details Section Header
    @FindBy(xpath="//p[text()='Personal Details']")
    static WebElement PersonalDetails; 
    
	 // Locating Father Name text field
    @FindBy(xpath="//input[@name='FatherName']")
    static WebElement FatherName; 
    
	 // Locating Mother Name text field
    @FindBy(xpath="//input[@name='MotherName']")
    static WebElement MotherName;
    
	 // Locating Marital Status Dropdown
    @FindBy(xpath="html/body/div[1]/main//div[2]/form//div[2]/div[1]/div[1]/div[2]//div[2]/div[1]/div/div/div/div/div")
    static WebElement MaritalStatus;
    
	 // Locating Single Marital Status
    @FindBy(xpath="//li[@data-value='Single']")
    static WebElement Single;
  
	 // Locating Married Marital Status
    @FindBy(xpath="//li[@data-value='Married']")
    static WebElement Married; 
    
	 // Locating Divorced Marital Status
    @FindBy(xpath="//li[@data-value='Divorced']")
    static WebElement Divorced; 
  
	 // Locating Widow Marital Status
    @FindBy(xpath="//li[@data-value='Widow']")
    static WebElement Widow; 
    
	 // Locating Widower Marital Status
    @FindBy(xpath="//li[@data-value='Widower']")
    static WebElement Widower; 
    
    // Locating all list of  Marital Status
    @FindBy(xpath="html/body/div[2]/div[2]/ul/li")
    static List<WebElement> MaritalStatusList;
    
    
    // Locating Education Dropdown
    @FindBy(xpath="html/body/div[1]/main/div/div[2]/form//div[2]/div[1]/div[1]/div[2]//div[2]/div[2]/div/div/div/div/div")
    static WebElement Education;
    
    // Locating all list of  Education Type
    @FindBy(xpath="html/body/div[2]/div[2]/ul/li")
    static List<WebElement> EducationList;
    
    // Locating High school from Education Dropdown
    @FindBy(xpath="//li[@data-value='High School']")
    static WebElement HighSchool;
    
 // Locating Income text field at screen 3
    @FindBy(xpath="//input[@name='Income']")
    static WebElement Income;
    
    
 // Locating Industry Type Dropdown
    @FindBy(xpath="html/body/div[1]/main/div/div[2]/form//div[2]/div[1]/div[1]/div[2]//div[3]/div[2]/div/div/div/div/div")
    static WebElement IndustryType;
    
    // Locating all list of  Industry Type
    @FindBy(xpath="html/body/div[2]/div[2]/ul/li")
    static List<WebElement> IndustryTypeList;
    
    
    // Locating Defence from Industry Type Dropdown
    @FindBy(xpath="//li[@data-value='Defence']")
    static WebElement Defence;
    
    // Locating Organisation Type Dropdown
    @FindBy(xpath="html/body/div[1]/main//div[2]/form//div[2]/div[1]/div[1]/div[2]//div[4]/div[1]/div/div/div/div/div")
    static WebElement OrganisationType;
    
 // Locating all list of  Organisation Type
    @FindBy(xpath="html/body/div[2]/div[2]/ul/li")
    static List<WebElement> OrganisationTypeList;
  
    
    // Locating Govt from Organisation Type Dropdown
    @FindBy(xpath="//li[@data-value='Govt']")
    static WebElement Govt;
    
    
    
 // Locating Occupation Type Dropdown
    @FindBy(xpath="//main//div[2]/form//div[2]/div[1]/div[1]/div[2]//div[4]/div[2]/div/div/div/div/div")
    static WebElement OccupationType;
  
    
 // Locating all list of  Occupation Type
    @FindBy(xpath="html/body/div[2]/div[2]/ul/li")
    static List<WebElement> OccupationTypeList;
    
    
 // Locating Salaried from Occupation Type Dropdown
    @FindBy(xpath="//li[@data-value='Salaried']")
    static WebElement Salaried;
    
 // Locating Self Employed from Occupation Type Dropdown
    @FindBy(xpath="//li[@data-value='Self Employed']")
    static WebElement SelfEmployed;
    
   // Locating Name of company text box 
   @FindBy(xpath="//input[@name='NameOfCompany']")
   static WebElement NameOfCompany; 
  
    
    
    
    
    
    public static void VerifyMaritalList() throws Exception {

    	String[] Status = {"Single","Married","Divorced","Widow","Widower"};
    	logger.info(MaritalStatus.getText());
    	MaritalStatus.click();
    	     
    	for(WebElement item:MaritalStatusList){ 
    	      System.out.println("Dropdown values are "+ item.getText());  
    	      boolean match = false;
    	      for (int i=0; i<Status.length; i++){
    	          if (item.getText().equals(Status[i])){
    	            match = true;
    	            
    	          }
    	        }
    	      //Assert.assertTrue(match);
    	      Assert.assertTrue(match, item.getText());
    	      
    	    }
    	    
    	    
   		}

    
    public static void setMaritalStatus() throws Exception {

   		click(Single);
   		}
    

    
    public static void VerifyEducation() throws Exception {

    	waitTillElementToBeClickable(Education);
    	String[] Status = {"High School","Graduate","Post Graduate","Professional","Diploma", "Illiterate", "Primary School"};
    	logger.info(Education.getText());
    	Education.click();
    	     
    	for(WebElement item:EducationList){ 
    	      System.out.println("Dropdown values are "+ item.getText());  
    	      boolean match = false;
    	      for (int i=0; i<Status.length; i++){
    	          if (item.getText().equals(Status[i])){
    	            match = true;
    	            
    	          }
    	        }
    	      //Assert.assertTrue(match);
    	      Assert.assertTrue(match, item.getText());
    	      
    	     }
    	      
    	    }
    
    
    public static void setEducation() throws Exception {

   		click(HighSchool);
   		}
    
    
    
    public static void VerifyIndustry() throws Exception {

    	waitTillElementToBeClickable(IndustryType);
    	String[] Status = {"Defence","Diving","Oil & Natural Gas","Merchant Marine","Mining", "Aviation", "Others"};
    	logger.info(IndustryType.getText());
    	IndustryType.click();
    	     
    	for(WebElement item:IndustryTypeList){ 
    	      System.out.println("Dropdown values are "+ item.getText());  
    	      boolean match = false;
    	      for (int i=0; i<Status.length; i++){
    	          if (item.getText().equals(Status[i])){
    	            match = true;
    	            
    	          }
    	        }
    	      //Assert.assertTrue(match);
    	      Assert.assertTrue(match, item.getText());
    	      
    	     }
    	      
    	    }
    
    
    public static void setIndustryType() throws Exception {

   		click(Defence);
   		}
    
    
    
    
    
    public static void VerifyOrganisation() throws Exception {

    	waitTillElementToBeClickable(OrganisationType);
    	String[] Status = {"Govt","Pvt Ltd","Public Ltd","Partner/Prop","Trust", "Society", "NGO", "NPO", "PVO"};
    	logger.info(OrganisationType.getText());
    	OrganisationType.click();
    	     
    	for(WebElement item:OrganisationTypeList){ 
    	      System.out.println("Dropdown values are "+ item.getText());  
    	      boolean match = false;
    	      for (int i=0; i<Status.length; i++){
    	          if (item.getText().equals(Status[i])){
    	            match = true;
    	            
    	          }
    	        }
    	      //Assert.assertTrue(match);
    	      Assert.assertTrue(match, item.getText());
    	      
    	     }
    	      
    	    }
    
    
    public static void setOrganisationType() throws Exception {

   		click(Govt);
   		}
    
    
    public static void VerifyOccupation() throws Exception {

    	waitTillElementToBeClickable(OccupationType);
    	String[] Status = {"Salaried","Self Employed","Professional","Student","Self Employed From Home", "Agriculture", "Housewife", "Retired", "Others"};
    	logger.info(OccupationType.getText());
    	OccupationType.click();
    	     
    	for(WebElement item:OccupationTypeList){ 
    	      System.out.println("Dropdown values are "+ item.getText());  
    	      boolean match = false;
    	      for (int i=0; i<Status.length; i++){
    	          if (item.getText().equals(Status[i])){
    	            match = true;
    	            
    	          }
    	        }
    	      //Assert.assertTrue(match);
    	      Assert.assertTrue(match, item.getText());
    	      
    	     }
    	      
    	    }
    
    
    public static void setOccupationSalaried() throws Exception {

   		click(Salaried);
   		}

    public static void setOccupationSelfEmployed() throws Exception {

   		click(SelfEmployed);
   		}
    
    
    public static void VerifyNameofCompanyAvailability() throws Exception {

    	NameOfCompany.isDisplayed();
 		
 		
 		 		}

    
    
    public static void setNameofCompany() throws Exception {

    	NameOfCompany.clear();
 		type(NameOfCompany, "Max Life Insurance");
 		
 		
 		}
    
    
    
    //private static final String Webelement = null;

    
    // Initializing the Objects
    	public JourneyScreenThree(WebDriver driver)
    	{
    		PageFactory.initElements(driver, this);
    	}
    	
    // Locating Indian Nationality radio Button
       @FindBy(xpath="//label[text()='No']")
       static WebElement payorDetailsNo; 
    				
       @FindBy(xpath="//input[@placeholder='DD/MM/YYYY']")
       static WebElement dateOfBirth;
       
       public static void dateOfBirth() throws Exception {

   		click(dateOfBirth);
   		}
   	
       //Verify user has landed to journey screen 3 successfully 
       public static void verifyJourneyScreenThree() throws Exception {
			
    	    PageFactory.initElements(driver, JourneyScreenThree.class);
    	    waitTillElementLocated(PersonalDetails);
			String actualTitle = PersonalDetails.getText();
			logger.info(actualTitle);
			String expectedTitle = "Personal Details";
			assertEquals(actualTitle, expectedTitle);
			logger.info("User is landed to Journey Screen 3 Page successfully.");

		}
       
       
       
       
       public static void setFatherName(int x, int y, int z) throws Exception {
    	   FatherName.clear();
      		type(FatherName, readingdata(x, y, z));
      		
      		
      		}
       
       public static void setMotherName(int x, int y, int z) throws Exception {

    	    MotherName.clear();
     		type(MotherName, readingdata(x, y, z));
     		
     		
     		}
       
       
       public static void setIncome(int x, int y, int z) throws Exception {

   	        Income.clear();
    		type(Income, readingdata(x, y, z));
    		
    		
    		}
       
       
       
       
       
       public static void isPayorDetailsNoOptionSelectedByDefault() throws Exception {
       	PageFactory.initElements(driver, JourneyScreenThree.class);

   		if(payorDetailsNo.isSelected())
   		{		
   		logger.info("Test Case Pass:'No' option under 'Is Payor is different from proposer' is selected by default ");
   		}
   		else
   		{
   			Assert.fail("Test Case Fail:'No' option under 'Is Payor is different from proposer' is selected by default ");
   		}

       }
       

       
      public static void datePicker() throws Exception{
       driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).click();
       List<WebElement> columns=driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[2]/div/div"));
       {
       for (WebElement cell: columns){
       	 String X="3";
          if (cell.getText().equals(X)){
             cell.findElement(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div[2]/div[1]/div[text()="+X+"]")).click();
             break;
        }}}
       }
     
      /* public static void datePickerTest() throws Exception{
   	    driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).click();	
       	List<WebElement> columns=driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__month-container')]/div/div[1]/div"));
           int X=3;
       	String Y="div[contains(@class, 'react-datepicker__month-container')]/div[2]/div[1]/div[text()="+X+"]";
       	datePicker(columns,3,Y);
       	
       }}*/

    
}

