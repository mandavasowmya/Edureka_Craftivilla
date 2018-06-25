package com.craftsvilla.testscripts;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pom.CheckOutPage;
import com.craftsvilla.pom.HomePage;
import com.craftsvilla.pom.PartyWareSareeDesc;
import com.craftsvilla.pom.PartywareSareesPage;
import com.craftsvilla.pom.SignInPage;

public class PartyWareSareeScripts extends BaseTest

{
	

	public HomePage homepage=null;
	public SignInPage signinpage=null;
	public PartywareSareesPage partysaree =null;
	public PartyWareSareeDesc sareedesc =null;
	public CheckOutPage checkoutPage = null;
	
	@Test
	public void BuyPartySaree()
	{
		homepage=new HomePage(driver);
		signinpage=new SignInPage(driver);
		partysaree=new  PartywareSareesPage(driver);
		 sareedesc=new PartyWareSareeDesc(driver);
		 checkoutPage=new CheckOutPage(driver);
		 
		 try
		 {
			 homepage.goToCraftsVillaBrands();
			 partysaree.gotoredbodersaree();
			
			 checkoutPage.enterEmail("mst0955@gmail.com");
			 checkoutPage.enterFirstName("cha1234rltte");
			 
			 
		 }
		 catch(Exception e)
		 {
			 Reporter.log("Fail");
		 }
		
	}
	

}
