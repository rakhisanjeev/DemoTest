package com.application.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	private WebDriver driver;
	
	public WebDriver getDriver() {
		driver=new ChromeDriver();
		return driver;
	}

}
