package com.testcases.myntra.usingtestng;

import org.testng.annotations.Test;

import com.frameworkutilities.WebDriverManager;
import com.testcase.myntra.usingtestng.MyntraHomepage;

public class VerifyNavigateToLuggagesAndTrolleysSectionPage extends WebDriverManager {
	@Test
	public void verifyLuggagesAndTrolleysSectionPage() {
		MyntraHomepage mensubmenu = new MyntraHomepage(driver);
		mensubmenu.verifyMenSubMenu();
		mensubmenu.NavigateToLuggagesAndTrolleysSectionPage();
	}
}
