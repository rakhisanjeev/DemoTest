package com.application.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.application.base.BaseTest;
import com.application.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	LoginPage loginPage;
	WebDriver driver;
	
	
	@BeforeMethod
	public void startUp() {
		
		driver = getDriver();
		loginPage = new LoginPage(driver);
		driver.get("https://login.salesforce.com/");
		Reporter.log("Loading the login page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(5000));
		
	}
	
	@Test
	public void TC1loginToApp() {
		
		loginPage.enterUserName("abc.com");
		Reporter.log("entering user name");
		
		loginPage.enterPassword("abc");
		Reporter.log("entering password");
		
		loginPage.clickLogin();	
		Reporter.log("clicking login button");
		
	}

	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
}
