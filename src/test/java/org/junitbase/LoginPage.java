package org.junitbase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement loginclick;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginclick() {
		return loginclick;
	}

	public void firstPage(String username, String password) {
		WebElement username2 = getUsername();
		elementSendKeys(username2, username);
		WebElement password2 = getPassword();
		elementSendKeys(password2, password);

		WebElement loginclick2 = getLoginclick();
		elementClick(loginclick2);
	}
}
