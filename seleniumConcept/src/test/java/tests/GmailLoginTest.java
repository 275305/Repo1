package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.seleniumConcept.LaunchBrowser;

import pages.GmailLoginPage;
import pages.PropertyReader;

public class GmailLoginTest extends LaunchBrowser {
	
	PropertyReader reader = new PropertyReader();

	@Test(priority = 0)
	public void gmailLoginTest()  {
		GmailLoginPage gmailPage = PageFactory.initElements(driver, GmailLoginPage.class);
		try {
			gmailPage.emailText(reader.getEmailText());
			gmailPage.emailPassword(reader.getEmailPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
              
	}

}
