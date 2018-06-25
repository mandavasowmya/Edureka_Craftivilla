package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class MensPage extends BasePage 
{

	public MensPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Men's Footwear")
	private WebElement MensFootwear;
	
	public void gotoMensFootwear()
	{
		verifyElementPresent(MensFootwear);
		MensFootwear.click();
	}
	

}
