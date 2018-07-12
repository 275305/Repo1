package uielements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.fulfilment.ReusableActions;

public class HomePage extends ReusableActions{
	
	// Locating User name Text box
    @FindBy(xpath="//a[@href='/logout']")
    static WebElement Logout;
    
    
 // Initializing the Objects
 	public HomePage(WebDriver driver)
 	{
 		PageFactory.initElements(driver, this);
 	}

 	
 	
 // Click Logout button
 	public static void clickLogout() throws Exception{
		click(Logout);
		
 	 }
 	 
 	 
 	public static void Logout() throws Exception{
 		PageFactory.initElements(driver, HomePage.class);
		waitTillPageLoaded(driver);
		waitTillElementLocated(Logout);
		clickLogout();
 	}
 		
 		
 		
}
