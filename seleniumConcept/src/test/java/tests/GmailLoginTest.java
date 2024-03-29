package tests;


import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



import pages.GmailLoginPage;
import pages.PropertyReader;
import util.ReusableActions;

public class GmailLoginTest extends ReusableActions {
	
	//implements LanchBrowserI 
	//PageFactory.initElements(driver, La);
	PropertyReader reader = new PropertyReader();
	Properties properties;
	private static final Logger lOGGER = Logger.getLogger(GmailLoginTest.class.getName());
	/*This userName and password is fetching from property reader class*/
	@Test(priority = 0,enabled=true)
	public void gmailLoginEmailTest() throws Exception {
		
		
		GmailLoginPage gmailPage = PageFactory.initElements(driver, GmailLoginPage.class);
		try {
			int sheet = 0, row = 0, column = 0;
			List<Integer> list = reader.getEmailTextValue();
			Iterator<Integer> itr = list.iterator();

			while (itr.hasNext()) {
				sheet = itr.next();
				row = itr.next();
				column = itr.next();
			}

			gmailPage.emailIdTextGmailLoginPage(sheet, row, column);

		} catch (Exception e) {
			lOGGER.info("Test case failed"+e.getMessage());
			throw e;
		}

	}
	/*This userName and password is fetching from property reader class*/
	@Test(priority = 1,enabled=true)
	public void gmailLoginPasswordTest() throws Exception {
		GmailLoginPage gmailPage = PageFactory.initElements(driver, GmailLoginPage.class);
		try {
			int sheet = 0, row = 0, column = 0;
			List<Integer> list = reader.getPasswordValue();
			Iterator<Integer> itr = list.iterator();

			while (itr.hasNext()) {
				sheet = itr.next();
				row = itr.next();
				column = itr.next();
			}

			gmailPage.emailPasswordGmailLoginPage(sheet, row, column);

		} catch (Exception e) {
			lOGGER.info("Test case failed"+e.getMessage());
			throw e;
		}

	}
	/*@Test(priority=3,enabled=true)
	public void getEmailTextValue() {
		
		//GmailLoginPage gmailPage = PageFactory.initElements(driver, GmailLoginPage.class);
		properties = new Properties();
		String emailTextValue = properties.getProperty("emailtextvalue");
		String strArr[] = emailTextValue.split(",");

		int sheet = Integer.parseInt(strArr[0]);
		int row = Integer.parseInt(strArr[1]);
		int column = Integer.parseInt(strArr[2]);
		GmailLoginPage.emailIdTextGmailLoginPage(sheet, row, column);
		if (sheet != '@' && row != '@' && column != '@')
			return Arrays.asList(sheet, row, column);
		else
			throw new RuntimeException("emailID is not specify in the configration file");
	}*/

}
