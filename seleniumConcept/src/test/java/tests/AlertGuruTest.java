package tests;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AlertGuruPage;
import pages.PropertyReader;
import util.ReusableActions;

public class AlertGuruTest extends ReusableActions {

	PropertyReader reader = new PropertyReader();
	private static final Logger lOGGER = Logger.getLogger(AlertGuruTest.class.getName());
	@Test
	public void getCustomerIDGuru99Page() throws Exception{
		AlertGuruPage alertPage=PageFactory.initElements(driver, AlertGuruPage.class);
		try {
			int sheet = 0, row = 0, column = 0;
			List<Integer> list = reader.getCutomerIdTextValueatGuru99Page();
			Iterator<Integer> itr = list.iterator();

			while (itr.hasNext()) {
				sheet = itr.next();
				row = itr.next();
				column = itr.next();
			}
		alertPage.textBoxAlertGuruPage(sheet,row,column);
		alertPage.submitBtnGuruPage();
		}
		catch (Exception e) {
			lOGGER.info("Test case failed"+e.getMessage());
			throw e;
		}
		
	}
}
