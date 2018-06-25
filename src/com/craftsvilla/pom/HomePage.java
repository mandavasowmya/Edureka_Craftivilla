package com.craftsvilla.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.craftsvilla.generic.BasePage;

public class HomePage extends BasePage
{
		//declaration
		@FindBy(xpath = "//a[text()='ACCESSORIES ']")
		private WebElement accessories;

		
		@FindBy(xpath = "//span[text()='Sign In']")
		private WebElement signIn;
		
		@FindBy(linkText = "CRAFTSVILLA BRANDS")
		private WebElement craftsvillaBrands;
		
		@FindBy(xpath="//a[text()='KURTIS & MORE '] ")
		private WebElement kurtisandmore;
		
		@FindBy(xpath="//a[@href='/womens-clothing/lehangas/?MID=megamenu_lehengas_seeall']")
		private WebElement lehenga;
		
		@FindBy(xpath="//a[@href='/mens-fashion/?MID=megamenu_menswear_seeall']")
		private WebElement mensfashion;
		
		@FindBy(xpath="//a[@href='/home-decor/?MID=megamenu_homedecor_seeall']")
		private WebElement homedecors;
		
		@FindBy(xpath="//a[@href='/cvfeeds/foods']")
		private WebElement food;
		
		@FindBy(xpath="//i[@class='icon first_arrow hidden-xs']")
		private WebElement account;
		
		@FindBy(xpath="//i[@class='icon logout']")
		private WebElement logout;
		
	//initialization
	
		public HomePage(WebDriver driver)
		{
			super(driver);
			PageFactory.initElements(driver, this);
		}
	
	
	
	
	//utilization
	public void goToAccessories()
	{
		verifyElementPresent(accessories);
		mouseHover(accessories);
		
	}
	
	public void clickSignIn()
	{
		verifyElementPresent(signIn);
		signIn.click();
	}
	
	public void goToCraftsVillaBrands()
	{
		verifyElementPresent(craftsvillaBrands);
		mouseHover(craftsvillaBrands);
	}
	public void goTokurtisandmore()
	{
		verifyElementPresent(kurtisandmore);
		mouseHover(kurtisandmore);
	}
	
	public void goToLehenga()
	{
		verifyElementPresent(lehenga);
		mouseHover(lehenga);
		
	}
	
	public void goToMens()
	{
		verifyElementPresent(mensfashion);
		mouseHover(mensfashion);
		
	}
	
	public void goToHomeDecors()
	{
		verifyElementPresent(homedecors);
		mouseHover(homedecors);
		
	}
	
	public void goToFood()
	{
		verifyElementPresent(food);
		mouseHover(food);
	}
	
	
	public void goToAccount()
	{
		verifyElementPresent(account);
		mouseHover(account);
		
	}
	
	public void logout()
	{
		verifyElementPresent(logout);
		logout.click();
	}
	
	
}
