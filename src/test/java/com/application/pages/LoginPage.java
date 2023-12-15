package com.application.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.application.base.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(20L));
	}
	
@FindBy(id="username")
WebElement userName;
@FindBy(id="password")
WebElement password;
@FindBy(id="Login")
WebElement loginBtn;
/*
 * Method enteruserName
 * @param String name
 */
public void enterUserName(String name) {
	wait.until(ExpectedConditions.visibilityOf(userName));
	userName.sendKeys(name);;
}

public void enterPassword(String pass) {
			password.sendKeys(pass);
} 

public void clickLogin() {
	loginBtn.click();
}

}
