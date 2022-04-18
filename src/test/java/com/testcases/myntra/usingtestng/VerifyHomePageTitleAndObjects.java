package com.testcases.myntra.usingtestng;

import java.io.IOException;

import org.testng.annotations.Test;

import com.frameworkutilities.WebDriverManager;
import com.testcase.myntra.usingtestng.MyntraHomepage;

public class VerifyHomePageTitleAndObjects extends WebDriverManager {
	@Test
	public void verifyhomePage() throws IOException {
		MyntraHomepage homepage = new MyntraHomepage(driver);
		homepage.verifyTitleandObjectsInHomepage();
	}
}
