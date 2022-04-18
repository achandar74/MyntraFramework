package com.testcases.myntra.usingtestng;

import org.testng.annotations.Test;

import com.frameworkutilities.WebDriverManager;
import com.testcase.myntra.usingtestng.LuggagesAndTrolleysSectionPage;
import com.testcase.myntra.usingtestng.MyntraHomepage;

public class VerifyToViewSelectedProduct extends WebDriverManager {
	@Test
	public void verifyViewSelectProduct() {
		MyntraHomepage luggageAndTrolleys = new MyntraHomepage(driver);
		luggageAndTrolleys.verifyMenSubMenu();
		luggageAndTrolleys.verifyMenSubMenu();
		luggageAndTrolleys.NavigateToLuggagesAndTrolleysSectionPage();

		LuggagesAndTrolleysSectionPage view = new LuggagesAndTrolleysSectionPage(driver);
		view.verifyTitleandObjectsInLuggagesAndTrolleysSectionPage();
		view.verifyProductFilter();
		view.VerifySelectedProduct();
		view.verifyProductDetails();
	}
}
