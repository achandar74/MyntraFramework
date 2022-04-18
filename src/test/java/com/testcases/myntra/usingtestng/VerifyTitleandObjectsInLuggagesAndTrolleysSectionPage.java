package com.testcases.myntra.usingtestng;


import org.testng.annotations.Test;

import com.frameworkutilities.WebDriverManager;
import com.testcase.myntra.usingtestng.LuggagesAndTrolleysSectionPage;
import com.testcase.myntra.usingtestng.MyntraHomepage;

public class VerifyTitleandObjectsInLuggagesAndTrolleysSectionPage extends WebDriverManager {
	@Test
	public void verifyLuggageAndTrolleysPage() {
		MyntraHomepage mensubmenu = new MyntraHomepage(driver);
		mensubmenu.verifyMenSubMenu();
		mensubmenu.NavigateToLuggagesAndTrolleysSectionPage();
		
		LuggagesAndTrolleysSectionPage verifyTitleAndObject=new LuggagesAndTrolleysSectionPage(driver);
		verifyTitleAndObject.verifyTitleandObjectsInLuggagesAndTrolleysSectionPage();
	}

	
	
}