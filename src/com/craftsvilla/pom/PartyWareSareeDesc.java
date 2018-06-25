package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class PartyWareSareeDesc extends BasePage
{

	public PartyWareSareeDesc(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Add to Cart']")
	private WebElement addToCart;
	
	@FindBy(id = "buynow")
	private WebElement buyNow;
	
	public void buyProduct()
	{
		verifyElementPresent(buyNow);
		buyNow.click();
	}
	
}
