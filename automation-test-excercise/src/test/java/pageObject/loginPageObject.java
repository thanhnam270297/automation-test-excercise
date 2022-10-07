package pageObject;

import elementPage.loginPageUI;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import core.core;

public class loginPageObject extends core {
	@Managed(driver = "edge")
	private WebDriver driver;

	loginPageUI loginPageUI;

	public loginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step
	public void openURL(String url) {
		driver.get("url");
	}

	@Step
	public boolean loginPageIsDisplayed() {
		waitForElementVisible(driver, loginPageUI.LOGIN_PAGE_BANNER);
		return isElementDisplayed(driver, loginPageUI.LOGIN_PAGE_BANNER);
	}

	@Step
	public void inputUserId(String userId) {
		waitForElementVisible(driver, loginPageUI.USERID_TEXTBOX);
		sendkeyToElement(driver, loginPageUI.USERID_TEXTBOX, userId);
	}

	@Step
	public void inputUserPw(String password) {
		waitForElementVisible(driver, loginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, loginPageUI.PASSWORD_TEXTBOX, password);
	}

	@Step
	public void clickToLoginButton() {
		waitForElementClickable(driver, loginPageUI.LOGIN_BUTTON);
		clickToElement(driver, loginPageUI.LOGIN_BUTTON);
	}
}
