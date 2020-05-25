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

	@FindBy(xpath = "//input[@id='analytic_home_srch_btnGCS']")
	WebElement searchButtonHomePage;

	/* hays uk methods from here */
	public void getsearchButton_EmpId() throws Exception {
		searchButtonHomePage.click();
		Thread.sleep(3000);

	}
}
