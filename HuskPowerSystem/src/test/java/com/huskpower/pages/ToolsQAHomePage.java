package com.huskpower.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ToolsQAHomePage {

      WebDriver driver;

	public ToolsQAHomePage(WebDriver driver) {
		this.driver=driver;
	}
    
	@FindBy(xpath="//a[contains(text(),'Interactions')]")
	WebElement InteractionMenuToolsQA;
	
	public void interactionMenu(){
		InteractionMenuToolsQA.click();
	}
	
	public void explicitWait(){
		WebDriverWait wait=new WebDriverWait(driver,30 );
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Interactions')]")));
	} 
}
