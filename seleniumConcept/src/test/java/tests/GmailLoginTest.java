package tests;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.seleniumConcept.LaunchBrowser;

import pages.GmailLoginPage;
import pages.PropertyReader;

public class GmailLoginTest extends LaunchBrowser {

	PropertyReader reader = new PropertyReader();

	@Test(priority = 0)
	public void gmailLoginEmailTest() {
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
			e.printStackTrace();
		}

	}

	@Test(priority = 1)
	public void gmailLoginPasswordTest() {
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
			e.printStackTrace();
		}

	}

}
