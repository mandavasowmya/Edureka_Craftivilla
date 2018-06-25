package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class KurtisPage extends BasePage
{

	public KurtisPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Casual Kurtis")
	private WebElement CasualKurtis;
	
	public void gotoCasualKurtis()
	{
		verifyElementPresent(CasualKurtis);
		CasualKurtis.click();
	}
	

}
