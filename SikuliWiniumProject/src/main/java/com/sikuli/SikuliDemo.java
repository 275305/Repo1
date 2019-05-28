package com.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo {

	/*
	 * this is sikuli program
	 */
	public static void main(String[] args) throws Exception {

		Screen screen = new Screen();

		/*
		 * first of all we create a pattern for each screenshot
		 */

		Pattern gmailLogo_Gmail = new Pattern("C:\\Users\\sateeshk\\Pictures\\Sikuli_gmail_logo.PNG");
		Pattern signIn_Gmail = new Pattern("C:\\Users\\sateeshk\\Pictures\\sign_in_Gmail.PNG");

		Pattern userName_Gmail = new Pattern("C:\\Users\\sateeshk\\Pictures\\Sikuli_userName_Gmail.PNG");
		Pattern nextButton_Gmail = new Pattern("C:\\Users\\sateeshk\\Pictures\\nextButton_gmail.PNG");

		Pattern userPassword_Gmail = new Pattern("C:\\Users\\sateeshk\\Pictures\\password_gmail.PNG");
		Pattern next_button_password_Gmail = new Pattern("C:\\Users\\sateeshk\\Pictures\\nextButton_password.PNG");

		Pattern logout_Gmail = new Pattern("C:\\Users\\sateeshk\\Pictures\\logout_gmail1.PNG");
		Pattern signout_Gmail = new Pattern("C:\\Users\\sateeshk\\Pictures\\signout_gmail.PNG");

		System.setProperty("webdriver.chrome.driver", "E:\\Pradeep_Pracite_Purpose2\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		/*
		 * click on g-mail logo
		 */
		// wait for 3 second
		screen.wait(gmailLogo_Gmail, 3000);
		screen.click(gmailLogo_Gmail);

		screen.wait(signIn_Gmail, 3000);
		screen.click(signIn_Gmail);

		// please submit the original g-mail and password and see the magic
		screen.wait(userName_Gmail, 3000);
		screen.type(userName_Gmail, "pradeepmatrix@gmail.com");

		screen.wait(nextButton_Gmail, 3000);
		screen.click(nextButton_Gmail);

		screen.wait(userPassword_Gmail, 3000);
		screen.type(userPassword_Gmail, "abcd@123");

		screen.wait(next_button_password_Gmail);
		screen.click(next_button_password_Gmail);

		screen.wait(logout_Gmail, 3000);
		screen.click(logout_Gmail);

		screen.wait(signout_Gmail, 3000);
		screen.click(signout_Gmail);

	}

}
