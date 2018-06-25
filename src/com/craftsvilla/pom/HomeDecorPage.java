package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomeDecorPage extends BasePage
{
public HomeDecorPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

@FindBy(linkText="Jaipuri Quilts")
private WebElement JaipuriQuilts;

public void gotoJaipuriQuilts()
{
	verifyElementPresent(JaipuriQuilts);
	JaipuriQuilts.click();
}
}
