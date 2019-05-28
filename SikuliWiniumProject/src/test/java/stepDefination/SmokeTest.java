package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	/*WebDriver driver;
	
	@Given("^I launch chrome browser$")
	public void i_launch_chrome_browser() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
		
		driver=new ChromeDriver();
		String baseUrl="https://www.google.com";
		driver.get(baseUrl); 
		System.out.println("I launch chrome browser");
		
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^I open google home page$")
	public void i_open_google_home_page() throws Throwable {
		
	  System.out.println("I open google home page");       
	}
                 */
	/*private WebDriver driver;

	@Given("^Open Firefox and start application$")
	public void open_Firefox_and_start_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		 String baseUrl="https://s1.demo.opensourcecms.com/wordpress/wp-login.php";
		 
		 driver.get(baseUrl);
		 //driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	    
	}

	@When("^I enter valid \"(.*?)\" and valid \"(.*?)\"$")
	public void i_enter_valid_and_valid(String uname, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys(pass);
	    driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	}

	@Then("^User should be login sucessfully$")
	public void user_should_be_login_sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Login sucessfully");
	  
	}
	*/

}
