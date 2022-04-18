package com.frameworkutilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebDriverManager {
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./lib/browser.properties");
		prop.load(fis);

		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\JANARDHAN\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\JANARDHAN\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}

		else if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\JANARDHAN\\Downloads\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JANARDHAN\\Downloads\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setCapability("disable-popup-blocking", true);
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
