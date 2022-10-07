package pageObject;

import core.core;
import elementPage.homePageUI;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class homePageObject extends core {

	@Managed(driver = "edge")
	private WebDriver driver;

	homePageUI homePageUI;

	public homePageObject(WebDriver driver) {
		this.driver = driver;
	}

	@Step
    public boolean homePageIsDisplayed() {
		waitForElementVisible(driver, homePageUI.WELLCOME_SLIDER);
		return isElementDisplayed(driver, homePageUI.WELLCOME_SLIDER);
    }
}
