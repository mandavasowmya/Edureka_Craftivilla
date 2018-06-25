package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class CraftsvillaBrandsPage extends BasePage
{

	public CraftsvillaBrandsPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Craftsvilla Partywear Sarees")
	private WebElement PartywearSarees;
	
	@FindBy(linkText="Craftsvilla Embroidered Sarees")
	private WebElement  EmbroideredSarees;
	
	
	public void gotoPartywearSarees()
	{
		verifyElementPresent(PartywearSarees);
		PartywearSarees.click();
	}
	
	public void goToCraftsvillaEmbroideredSarees()
	{
		verifyElementPresent(EmbroideredSarees);
		EmbroideredSarees.click();
	}

}
