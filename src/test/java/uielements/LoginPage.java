package uielements;


	import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jxl.Sheet;
import jxl.Workbook;
import util.AppConstant;


	public class LoginPage extends ReusableActions{
		
		// Login repository

		
	    // Locating User name Text box
	    @FindBy(id="userId")
	    static WebElement Username;
	    
	    // Locating Password Text box
	    @FindBy(id="password")
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
	    
	    // Locating Login error message text
	    @FindBy(xpath="//div[text()='Incorrect userId or Password !!']")
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
			
			
			// Return text for error message button
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
					
			
			
			//Login Functionality positive test
			public static void logintest(String strUserName, String strPassword) throws Exception {
				PageFactory.initElements(driver, LoginPage.class);
				Username.clear();
				//waitTillPageLoaded(driver);
				setUserName(strUserName);
				logger.info("Usename entered successfully");
	            Password.clear();
				setPwdName(strPassword);
				logger.info("Password entered successfully");
				//clickRememberme();
				//logger.info("Remember me checkbox checked successfully");
				clickLogin();
				logger.info("Sign in button clicked successfully");
				

			}
			
			
			
			// Login test case testing with multiple test data for negative scenario
			// Getting test data from Excel sheet
			public static void Login_Neg() throws Exception {

				PageFactory.initElements(driver, LoginPage.class);
				waitTillPageLoaded(driver);
				File file = new File(System.getProperty(AppConstant.USER_DIR) + AppConstant.LOGIN_DATA_EXCELL);
				FileInputStream fileInputStream = new FileInputStream(file);
				Workbook w = Workbook.getWorkbook(fileInputStream);
				Sheet s = w.getSheet("Login");
				for (int i = 1; i < s.getRows(); i++) {

					try {
						System.out.println(s.getRows());
						Username.clear();
						Username.sendKeys(s.getCell(0, i).getContents());
						logger.info("Test data getting from Excel sheet which is appended in resources folder");
						Password.clear();
						Password.sendKeys(s.getCell(1, i).getContents());
						logger.info("Test data getting from Excel sheet which is appended in resources folder for password");
						clickLogin();
						verifyErrormessage();
						System.out.println("pass");

					} catch (Exception e) {

						logger.error(e.getMessage());
						throw e;
					}

				}

			}
			
			
			public static void verifyloginpage() throws Exception {
				
		PageFactory.initElements(driver, LoginPage.class);
				String actualTitle = driver.getTitle();
				//String expectedTitle = "Fulfillment 2.0";
				String expectedTitle = "mPRO";
				assertEquals(actualTitle, expectedTitle);
				logger.info("User is landed to Login Page successfully.");

			}
		
	  
	  
	    
	}

