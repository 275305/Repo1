package com.test.fulfilment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import uielements.HomePage;
import uielements.LoginPage;


public class LoginTest extends ReusableActionsUpdate{
  

	
	 @BeforeClass
	    public void launchBrowser() throws Exception{
		 try {
	    System.setProperty("webdriver.chrome.driver", ".\\lib\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		 }
		 catch (Exception e) {
	 			logger.error("Test case failed: " + e.getMessage());
	 			throw e;
	 		} 

	    }
	 
	 
	
	
	
	//TC -01 Test case for Login with inValid credentials
		@Test(priority = 0, enabled=true)
		public void testlogin() throws Exception{
			try{
				
				logger.info("Test Started");
				prop = ReusableActionsUpdate.readProperties();

			 	driver.get(prop.getProperty("SampleURL"));
			 	LoginPage.verifyloginpage();
			 			
			 	// Maximizing the browser window
			 	driver.manage().window().maximize();
			 	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			 	logger.info("Fulfilment URL opened successfully");
				LoginPage.Login_Neg();
			 	
			 	}
			catch (Exception e) {
				logger.error("Test case failed: " + e.getMessage());
				throw e;
		 		}
	        }
		
		//TC -02 Test case for Login with Valid credentials
		@Test(priority = 1, enabled=true)
	    public void testlogin1() throws Exception{
			try{
				
			 	// Taking username and password from properties file
				//prop = ReusableActions.readProperties();

			 	LoginPage.logintest(prop.getProperty("username"), prop.getProperty("password"));
			 	logger.info("User logged in successfully");
			 	
			 	}
			catch (Exception e) {
				logger.error("Test case failed: " + e.getMessage());
				throw e;
		 		}
	        }
		
	
	//Logout from Application and close the browser
	@AfterClass
	public void close() throws Exception {
		HomePage.Logout();  //Called Logout Method
		logger.info("User log out successfully");
		driver.quit();     // Closed the browser
		logger.info("Browser closed");
	}
	
}
	

