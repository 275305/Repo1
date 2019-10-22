package tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import pages.PropertyReader;
import util.ReusableActions;

public class HuskHomeTest extends ReusableActions {

	PropertyReader reader = new PropertyReader();
	private static final Logger lOGGER = Logger.getLogger(HuskHomeTest.class);

	@Test(priority = 0, enabled = true)
	public void homePageHusk() { 
		 String PATH=System.getProperty("user.dir");
		PropertyConfigurator.configure(PATH+"\\src\\test\\java\\tests\\log4j.properties");
		lOGGER.info("loggin page started");
		System.out.println("login page started");
	}

}
