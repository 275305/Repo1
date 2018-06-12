package uielements;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.Fulfilment.ReusableActions;


public class LoginPage extends ReusableActions{
	
	// Login repository

	
    // Locating User name Text box
    @FindBy(xpath="//input[@label='User ID']")
    static WebElement Username;
    
    // Locating Password Text box
    @FindBy(xpath="//input[@label='Password']")
    static WebElement Password; 

    // Locating Login Button
    @FindBy(xpath="//button[text()='SIGN IN']")
    static WebElement Loginbtn; 
    
    // Locating Login Label
    @FindBy(xpath="//p[text()='Login']")
    static WebElement Loginlbl; 
    
    // Locating Password Link
    @FindBy(xpath="//a[text()='Forgot Password?']")
    static WebElement Forgotbtn;
    
    // Locating Remember me check box
    @FindBy(xpath="//span[@class='InputCheckBox__checkmark__Xfidv']")
    static WebElement Remembermechkbox;
    
    // Locating Remember me check box
    @FindBy(xpath="//div[text()='Incorrect user id or password']")
    static WebElement LoginErrorMsg;
    
    
    
    
  
    
	// Initializing the Objects
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	// Enter Username
		static void setUserName(String strUserName) throws Exception {
			waitTillElementLocated(Username);
			type(Username, strUserName);

		}
		
		
		// Enter password
		static void setPwdName(String strPassword) throws Exception {

			type(Password, strPassword);

		}
		
		
		// Click Login button
		public static void clickLogin() throws Exception {

			click(Loginbtn);
			
		}
		
		
		// Click Remember me check box
		public static void clickRememberme() throws Exception {

			click(Remembermechkbox);
			
		}
		
		
				
				
		
		
		//Login Functionality positive test
		public static void logintest(String strUserName, String strPassword) throws Exception {
			PageFactory.initElements(driver, LoginPage.class);
			waitTillPageLoaded(driver);
			setUserName(strUserName);
			logger.info("Usename entered successfully");
			setPwdName(strPassword);
			logger.info("Password entered successfully");
			//clickRememberme();
			//logger.info("Remember me checkbox checked successfully");
			clickLogin();
			logger.info("Sign in button clicked successfully");
		}
		
		
		public static void verifyloginpage() throws Exception {
			
			
			String actualTitle = driver.getTitle();
			String expectedTitle = "Fulfillment 2.0";
			assertEquals(actualTitle, expectedTitle);
			logger.info("User is landed to Login Page successfully.");

		}
	
  
  
    
}
