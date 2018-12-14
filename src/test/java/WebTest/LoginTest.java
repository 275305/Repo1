package WebTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import uielements.HomePage;
import uielements.LoginPage;
import uielements.ReusableActions;
public class LoginTest extends ReusableActions {
	

	@BeforeTest
	@Parameters(value = { "browser", "version", "platform","testrun"})
	public void setUp(String browser, String version, String platform,String testrun) throws Exception {
		String testRun= testrun;
		//sa-aut
		//bws-if
		/*String testRun1=testrun1;*/
		//if (testRun.equals("run"))
			if (testRun.equals("runbsw")) 
			{
			
			try {
				DesiredCapabilities capability = new DesiredCapabilities();
				capability.setCapability("platform", platform);
				capability.setCapability("browserName", browser);
				capability.setCapability("browserVersion", version);
				// capability.setCapability("browserstack.local", "true");
				capability.setCapability("browserstack.debug", "true");
				capability.setCapability("project", "MaxlifeInsurance");
				capability.setCapability("build", "BrowserStack_WebSeries1");
				driver = new RemoteWebDriver(
						new URL("https://kanchangupta2:xWbVkws9u8oEYR1Nsqx6@hub-cloud.browserstack.com/wd/hub"),
						capability);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				ReusableActions.logStep("=========Execution Started on Browsers=========");
				System.out.println("Execution Started on : " + browser + " " + version + " " + platform);
				ReusableActions.attachScreen(driver);
			} catch (Exception e) {
				//System.out.println("Test case failed: " + e.getMessage());
				throw e;
			}
			//break;
		}
			
		else 
			//	if(testRun.equals("runfa"))
			if(testRun.equals("run")) 
		{
			// @BeforeClass
			//public void launchBrowser() throws Exception{

			try {
				System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			} catch (Exception e) {
				//logger.error("Test case failed: " + e.getMessage());
				throw e;
			}

		}
	}

	// TC -01 Test case for Login with inValid credentials
	@Test(priority = 0, enabled = true)
	public void testlogin() throws Exception {
		try {

			logger.info("Test Started");
			prop = ReusableActions.readProperties();

			driver.get(prop.getProperty("SampleURL"));
			LoginPage.verifyloginpage();

			// Maximizing the browser window
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			logger.info("Fulfilment URL opened successfully");
			LoginPage.Login_Neg();

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// TC -02 Test case for Login with Valid credentials
	@Test(priority = 1, enabled = true)
	public void testlogin1() throws Exception {
		try {

			// Taking username and password from properties file
			// prop = ReusableActions.readProperties();

			LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			logger.info("User logged in successfully");

		} catch (Exception e) {
			logger.error("Test case failed: " + e.getMessage());
			throw e;
		}
	}

	// Logout from Application and close the browser
	@AfterClass
	public void close() throws Exception {
		HomePage.Logout(); // Called Logout Method
		logger.info("User log out successfully");
		driver.quit(); // Closed the browser
		logger.info("Browser closed");
	}

}
