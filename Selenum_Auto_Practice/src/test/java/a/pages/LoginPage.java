package a.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	/* hays uk Xpath from here */

	@FindBy(xpath = "//div[@id='analytic_srchGCS']")
	WebElement home_search;

	// xpath for search button
	@FindBy(xpath = "//input[@id='analytic_home_srch_btnGCS']")
	static WebElement searchButtonHomePage;

	// xpath for sign in button
	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	static WebElement signin_Btn_homePage;

	// xpath for username
	@FindBy(xpath = "//input[@id='loginuser']")
	static WebElement specUserName;

	// xpath for password
	@FindBy(xpath = "//input[@id='loginpass']")
	static WebElement specPassword;

	//xpath for sign button spec user
	@FindBy(xpath="//input[@id='loginApp']")
	static WebElement signButtonSpecUser;
	
	/* methods foe searchButton home page */
	public static void getsearchButton_EmpId() throws Exception {
		searchButtonHomePage.click();
		Thread.sleep(3000);

	}

	/* methods foe sign in Button home page */
	public static void getSignInBtnHomepage() {
		signin_Btn_homePage.click();
	}

	/* Method for Spec User Name */
	public static void getUserName() {
		specUserName.sendKeys("r.ajumatusena@gmail.com");
	}

	/* Method for Spec Password */
	public static void getPassword() {
		specPassword.sendKeys("Hays@1234");
	}
	
	/*Method for SignBtn Spec User*/
	public static void getsignInBtnSpecUser(){
		signButtonSpecUser.click();
	}
}
