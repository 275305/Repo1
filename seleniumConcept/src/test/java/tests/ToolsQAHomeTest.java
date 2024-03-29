package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.selenium.seleniumConcept.LaunchBrowser;

import pages.ToolsQAHomePage;

public class ToolsQAHomeTest extends LaunchBrowser {
	
	
	@Test(priority = 0)
	public void intractionMenu(){
		ToolsQAHomePage page=PageFactory.initElements(driver,ToolsQAHomePage.class );
		page.interactionMenu();
		page.explicitWait();
	}
	
	@Test(priority = 1)
	public void closeBrowser() {
        driver.close();
	}

}
