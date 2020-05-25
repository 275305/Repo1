package com.property.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class PropertyReader {

	private Properties prop;
	private static String url = "";
   
	public PropertyReader() {
		String path = System.getProperty("user.dir");
		String filePath = path + "\\configs\\configration.properties";
		prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(new File(filePath));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		try {
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String userName() {
		String Uname=prop.getProperty("uName");
		return Uname ;
	}

	public String userPass() {
		String Upass=prop.getProperty("uPassword");
		return Upass;
	}

	public String getUrl() {
		String Url=prop.getProperty("URL");
		return Url;
	}

	public By getLocator(String ElementName) throws Exception {
		// Read value using the logical name as Key
		String locator = prop.getProperty(ElementName);
		// Split the value which contains locator type and locator value
		String locatorType = locator.split(":")[0];
		String locatorValue = locator.split(":")[1];
		// Return a instance of By class based on type of locator
		if (locatorType.toLowerCase().equals("id"))
			return By.id(locatorValue);
		else if (locatorType.toLowerCase().equals("xpath"))
			return By.xpath(locatorValue);
		else
			throw new Exception("Locator type '" + locatorType + "' not defined!!");
	}
}
