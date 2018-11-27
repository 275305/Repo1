package uielements;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import uielements.ReusableActions;

	public class HomePage extends ReusableActions{
		
		// Locating User name Text box
	    @FindBy(xpath="//a[@href='/logout']")
	    static WebElement Logout;
	    
	    
		// Locating New Application Button
	    @FindBy(xpath="//*[@id='root']/header/div[2]/div[1]/ul/li[1]/a[text()='New Application']")
	    public static WebElement NewAppbtn; 
	    
	    
		// Locating Dashboard Button
	    @FindBy(xpath="//a[@href='/dashboard']")
	    public static WebElement Dashboardbtn;
	    
	  
	    
	 // Initializing the Objects
	 	public HomePage(WebDriver driver)
	 	{
	 		PageFactory.initElements(driver, this);
	 	}

	 	
	 	
	 // Click Logout button
	 	public static void clickLogout() throws Exception{
			click(Logout);
			
	 	 }
	 	
	 	
	    // Click at New Application button 
	   	public static void clickNewApp() throws Exception {
	   		PageFactory.initElements(driver, HomePage.class);
	   		waitTillElementLocated(NewAppbtn);
	 			click(NewAppbtn);
	 			
	 		}
	 	 
	 // Click at Dashboard button 
	   	public static void clickDashboard() throws Exception {
	   		PageFactory.initElements(driver, HomePage.class);
	   		waitTillElementLocated(Dashboardbtn);
	 			click(Dashboardbtn);
	 			
	 		}
	   	
	    // Click at Logout button 
	 	public static void Logout() throws Exception{
	 		PageFactory.initElements(driver, HomePage.class);
			waitTillPageLoaded(driver);
			waitTillElementLocated(Logout);
			clickLogout();
	 	}
	 		
	 		
	 		
	}


