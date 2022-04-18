package com.testcases.myntra.usingtestng;

import java.io.IOException;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.frameworkutilities.DataProviderUsingExcel;

public class FaceBookDemo {

	@Test(dataProvider = "userdetails")
	public void loginfacebook(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JANARDHAN\\Downloads\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setCapability("disable-popup-blocking", true);
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
	}

	@DataProvider(name = "userdetails")
	public String[][] getdata() throws IOException {
		String[][] exceldata = DataProviderUsingExcel.excelDataProvider();
		return exceldata;
	}
}
