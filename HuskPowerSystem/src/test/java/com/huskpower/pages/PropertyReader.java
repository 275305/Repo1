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

	/* spark url value from config.properties file */
	public List<Integer> getSparkUrlValue() {
		String sparkurl = properties.getProperty("sparkurl");
		String strArr[] = sparkurl.split(",");

		int sheet = Integer.parseInt(strArr[0]);
		int row = Integer.parseInt(strArr[1]);
		int column = Integer.parseInt(strArr[2]);

		if (sheet != '@' && row != '@' && column != '@')
			return Arrays.asList(sheet, row, column);
		else
			throw new RuntimeException("emailID is not specify in the configration file");
	}

	/* spark EmailId value from config.properties file */
	public List<Integer> getSparkEmailIdValue() {
		String sparkemailid = properties.getProperty("sparkemailid");
		String strArr[] = sparkemailid.split(",");

		int sheet = Integer.parseInt(strArr[0]);
		int row = Integer.parseInt(strArr[1]);
		int column = Integer.parseInt(strArr[2]);

		if (sheet != '@' && row != '@' && column != '@')
			return Arrays.asList(sheet, row, column);
		else
			throw new RuntimeException("emailID is not specify in the configration file");
	}

	/* spark Password value from config.properties file */
	public List<Integer> getSparkPasswordValue() {
		String sparkpassword = properties.getProperty("sparkpassword");
		String strArr[] = sparkpassword.split(",");

		int sheet = Integer.parseInt(strArr[0]);
		int row = Integer.parseInt(strArr[1]);
		int column = Integer.parseInt(strArr[2]);

		if (sheet != '@' && row != '@' && column != '@')
			return Arrays.asList(sheet, row, column);
		else
			throw new RuntimeException("emailID is not specify in the configration file");
	}

}