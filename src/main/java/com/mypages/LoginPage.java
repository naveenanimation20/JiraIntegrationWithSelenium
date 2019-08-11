
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author NaveenKhunteta
 *
 */
public class LoginPage extends BasePage {

	// page locators:
	private By emailId = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	// public getters:
	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return getElement(emailId);
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getLoginPageTitle() {
		return getPageTitle();
	}

	public String getLoginPageHeader() {
		return getPageHeader(header);
	}

	/**
	 * 
	 * @param username
	 * @param pwd
	 * @return
	 */
	public HomePage doLogin(String username, String pwd) {
		getEmailId().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();

		return getInstance(HomePage.class);
	}

	/**
	 * 
	 * @return
	 */
	public void doLogin() {
		getEmailId().sendKeys("");
		getPassword().sendKeys("");
		getLoginButton().click();
	}

	// username: naven@gmail.com
	public void doLogin(String userCred) {

		if (userCred.contains("username")) {
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		} else if (userCred.contains("password")) {
			getEmailId().sendKeys(userCred.split(":")[1].trim());
		}
		getLoginButton().click();

	}

}
