package com.huskpower.pages;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropertyReader {
	Properties properties;
	String PATH = System.getProperty("user.dir");
	// PATH + "\\config\\configration.properties"

	private final String propertyFilePath = PATH + "\\config\\configuration.properties";;

	public PropertyReader() {
		BufferedReader reader;

		try {

			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public String getChromeDriver() {
		String driver = properties.getProperty("driver");
		if (driver != null)
			return driver;
		else
			throw new RuntimeException("driver not specified in the Configuration.properties file.");
	}

	public int getImplicitWait() {
		String wait = properties.getProperty("wait");
		int wait1 = Integer.parseInt(wait);
		if (wait1 != 0)
			return wait1;
		else
			throw new RuntimeException("wait not specified in the Configuration.properties file.");
	}
	/* ========================== G-mail =========================== */

	public String getGmailUrl() {
		String gmailUrl = properties.getProperty("gmailUrl");
		if (gmailUrl != null)
			return gmailUrl;
		else
			throw new RuntimeException("gmail url is not specify in the configration file");
	}

	public String getEmailText() {
		String emailtext = properties.getProperty("emailtext");
		if (emailtext != null)
			return emailtext;
		else
			throw new RuntimeException("gmailText is not specify in the configration file");
	}

	public String getEmailPassword() {
		String emailpassword = properties.getProperty("emailpassword");
		if (emailpassword != null)
			return emailpassword;
		else
			throw new RuntimeException("gmailPassword is not specify in the configration file");
	}

	/* Email value config.properties file at GmailPage */
	public List<Integer> getEmailTextValue() {
		String emailTextValue = properties.getProperty("emailtextvalue");
		String strArr[] = emailTextValue.split(",");

		int sheet = Integer.parseInt(strArr[0]);
		int row = Integer.parseInt(strArr[1]);
		int column = Integer.parseInt(strArr[2]);

		if (sheet != '@' && row != '@' && column != '@')
			return Arrays.asList(sheet, row, column);
		else
			throw new RuntimeException("emailID is not specify in the configration file");
	}
	
	

	/* Password value from config.properties file at GmailPage */
	public List<Integer> getPasswordValue() {
		String emailPasswordValue = properties.getProperty("emailPasswordValue");
		String strArr[] = emailPasswordValue.split(",");
		int sheet = Integer.parseInt(strArr[0]);
		int row = Integer.parseInt(strArr[1]);
		int column = Integer.parseInt(strArr[2]);

		if (sheet != '@' && row != '@' && column != '@')
			return Arrays.asList(sheet, row, column);
		else
			throw new RuntimeException("gmailPassword is not specify in the configration file");
	}
	
	/* CustomerId  value from config.properties file at Guru99Page */
	public List<Integer> getCutomerIdTextValueatGuru99Page() {
		String custIdTextValue = properties.getProperty("cutomerIdsheetvalue");
		String strArr[] = custIdTextValue.split(",");

		int sheet = Integer.parseInt(strArr[0]);
		int row = Integer.parseInt(strArr[1]);
		int column = Integer.parseInt(strArr[2]);

		if (sheet != '@' && row != '@' && column != '@')
			return Arrays.asList(sheet, row, column);
		else
			throw new RuntimeException("emailID is not specify in the configration file");
	}

}
