package com.testcases.myntra.usingtestng;


import org.testng.annotations.Test;

import com.frameworkutilities.WebDriverManager;
import com.testcase.myntra.usingtestng.MyntraHomepage;

public class VerifyMenSubMenu extends WebDriverManager {
	
	@Test
	public void verifyMenSubMenu() {
		MyntraHomepage mensubmenu = new MyntraHomepage(driver);
		mensubmenu.verifyMenSubMenu();
	}
}