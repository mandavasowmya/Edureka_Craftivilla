package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class PartywareSareesPage extends BasePage
{

	public PartywareSareesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-35646-MCRAF48591367190-1525699624-Craftsvilla_1.jpg']")
private WebElement redbodersaree;

@FindBy(xpath="//img[@src='https://img3.craftsvilla.com/image/upload/w_300,h_450,c_lfill,f_auto/C/V/CV-35622-MAVAN68166098990-1490954524-Craftsvilla_1.jpg']")
private WebElement pinksaree;



public void gotoredbodersaree()
{
	verifyElementPresent(redbodersaree);
	redbodersaree.click();
}

public void goToPinkSaree()
{
	verifyElementPresent(pinksaree);
	pinksaree.click();
}

}
