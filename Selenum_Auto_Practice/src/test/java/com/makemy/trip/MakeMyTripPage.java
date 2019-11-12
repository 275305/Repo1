package com.makemy.trip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.properties.PropertyReader;

public class MakeMyTripPage {

	WebDriver driver;

	PropertyReader propertyReader = new PropertyReader();
	String roundtrip = propertyReader.roundTrip();
	public MakeMyTripPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	String str1 = "//ul[@class='fswTabs latoBlack greyText']/li[2]";
	@FindBy(xpath = "str1")
	WebElement roundTrip;

	public void roundTripText() {
		roundTrip.click();
	}
}
