package com.test.Fulfilment;

import java.util.concurrent.TimeUnit;
import utilities.Constant;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import uielements.LoginPage;

public class Firstclass extends ReusableActions {
	 @BeforeMethod
	    public static void launchBrowser(){
	    System.setProperty("webdriver.chrome.driver", ".\\lib\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    }
	
	  @Test
	    public void testlogin() throws Exception {
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get(Constant.URL);
	        LoginPage.verifyloginpage();
	        LoginPage.logintest(Constant.Username, Constant.Password);
	  }
	  
	  
	  
	
}

