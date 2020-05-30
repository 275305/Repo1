package a.test;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import a.pages.LoginPage;

public class LoginTest {

	WebDriver driver;
	PropertyReader reader;

	Logger logger = (Logger) LogManager.getLogger(LoginTest.class);

	@BeforeClass
	public void getInitialValue() throws Exception {

		reader = new PropertyReader();
		String path = System.getProperty("user.dir");
		String driverPath = path + "\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		logger.info("...Chrome Web Driver Initialised sucessfully..");
		driver = new ChromeDriver();
		driver.get(reader.getUrl());
		logger.info("...Launched the url sucesssfully..");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Test(priority = 0, enabled = true)
	public void getempId() throws Exception {
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		LoginPage.getsearchButton_EmpId();
		logger.info("...Clicked at search button sucessfully..");

	}

	@Test(priority = 1, enabled = true)
	public void getSignInButton() {
		LoginPage.getSignInBtnHomepage();
		logger.info("...Clicked at sign in Button successfully...");
	}

	@Test(priority = 2, enabled = true)
	public void getSpecUser_SpecPassword_ExistingUser() {
		LoginPage.getUserName();
		logger.info("...UserId Entered sucessfully....");
		LoginPage.getPassword();
		logger.info("...Password Entered Sucessfully...");
		LoginPage.getsignInBtnSpecUser();
		logger.info("...SignIn btn for Spec User sucessfully...");
	}

}
