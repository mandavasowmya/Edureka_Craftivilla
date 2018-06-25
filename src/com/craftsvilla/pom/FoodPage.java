package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class FoodPage extends BasePage
		
{

	public FoodPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="South Indian Sweets")
	private WebElement SouthIndianSweets;
	
	public void gotoSouthIndianSweets()
	{
		verifyElementPresent(SouthIndianSweets);
		SouthIndianSweets.click();
	}
}
