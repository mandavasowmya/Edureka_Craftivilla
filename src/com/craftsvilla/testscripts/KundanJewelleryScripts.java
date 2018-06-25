package com.craftsvilla.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.craftsvilla.generic.BaseTest;
import com.craftsvilla.pom.AccessoriesPage;
import com.craftsvilla.pom.CheckOutPage;
import com.craftsvilla.pom.HomePage;
import com.craftsvilla.pom.KundanJewelleryPage;
import com.craftsvilla.pom.ProductPageDescriptionPage;

public class KundanJewelleryScripts extends BaseTest
{
	public HomePage homePage = null;
	public AccessoriesPage accessoriesPage = null;
	public KundanJewelleryPage kundanPage = null;
	public ProductPageDescriptionPage productPage = null;
	public CheckOutPage checkoutPage = null;
	
	@Test
	public void TC_01_BuyKundanPendant()
	{
		homePage = new HomePage(driver);
		accessoriesPage = new AccessoriesPage(driver);
		kundanPage = new KundanJewelleryPage(driver);
		productPage = new ProductPageDescriptionPage(driver);
		checkoutPage = new CheckOutPage(driver);
		
		try
		{
			homePage.goToAccessories();
			accessoriesPage.goToKundanJewellery();
			kundanPage.choosePendant();
			productPage.buyProduct();
			checkoutPage.enterEmail("abc@gmail.com");
			checkoutPage.enterFirstName("abc");
			checkoutPage.verifyProduct();
		}
		catch(Exception e)
		{
			Reporter.log("Fail");
		}
		
	}

}
