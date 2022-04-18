package com.testcases.myntra.usingtestng;

import org.testng.annotations.Test;

import com.frameworkutilities.WebDriverManager;
import com.testcase.myntra.usingtestng.LuggagesAndTrolleysSectionPage;
import com.testcase.myntra.usingtestng.MyntraHomepage;

public class VerifyAddQuantityInCart extends WebDriverManager {
	@Test
	public void verifyAddProductQuantityAndVerifyProductPrice() {
		MyntraHomepage luggageAndTrolleys = new MyntraHomepage(driver);
		luggageAndTrolleys.verifyMenSubMenu();
		luggageAndTrolleys.NavigateToLuggagesAndTrolleysSectionPage();

		LuggagesAndTrolleysSectionPage view = new LuggagesAndTrolleysSectionPage(driver);
		view.verifyProductFilter();
		view.VerifySelectedProduct();
		view.verifyProductDetails();
		view.verifyProductAddToBag();
		view.verifyAddProductQuantityAndVerifyProductPrice();
	}
}
