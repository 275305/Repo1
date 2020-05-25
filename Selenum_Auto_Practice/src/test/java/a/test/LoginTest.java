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
	
	           
	
	@BeforeClass
	public void getInitialValue() throws Exception {

		reader = new PropertyReader();
		String path = System.getProperty("user.dir");
		String driverPath = path + "\\lib\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);

		driver = new ChromeDriver();
		driver.get(reader.getUrl());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@Test(priority = 0, enabled = true)
	public void getempId() throws Exception {
		// driver.findElement(By.xpath("//input[@id='analytic_home_srch_btnGCS']")).click();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.getsearchButton_EmpId();

	}

}
