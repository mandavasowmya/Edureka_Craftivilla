package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class LehengaPage extends BasePage

{

	public LehengaPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText="Mermaid Cut")
	private WebElement MermaidCut;
	
	public void gotoMermaidCut()
	{
		verifyElementPresent(MermaidCut);
		MermaidCut.click();
	}
	

}
