package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class CasualKurtisPage extends BasePage 
{

	public CasualKurtisPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-35779-MANUS74511712620-1500651871-Craftsvilla_1.jpg'")
	private WebElement AnuswaraPink;
	
	public void gotoAnuswaraPink()
	{
		
		verifyElementPresent(AnuswaraPink);
		AnuswaraPink.click();
	}
}
