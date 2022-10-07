package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class core {

	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 30;

	private WebElement getWebElement(WebDriver driver, String xpathLocator) {
		return driver.findElement(getByXpath(xpathLocator));
	}
	
	private WebElement getWebElement(WebDriver driver, String xpathLocator, String...params) {
		return driver.findElement(getByXpath(getDynamicLocator(xpathLocator, params)));
	}

	private By getByXpath(String xpathLocator) {
		return By.xpath(xpathLocator);
	}

	public String getDynamicLocator(String xpathLocator, String... params) {
		return String.format(xpathLocator, (Object[]) params);
	}

	public void clickToElement(WebDriver driver, String xpathLocator) {
		getWebElement(driver, xpathLocator).click();
	}

	public void clickToElement(WebDriver driver, String xpathLocator, String... params) {
		getWebElement(driver, getDynamicLocator(xpathLocator, params)).click();
	}

	public void sendkeyToElement(WebDriver driver, String xpathLocator, String textValue) {
		WebElement element = getWebElement(driver, xpathLocator);
		element.clear();
		element.sendKeys(textValue);
	}

	public void sendkeyToElement(WebDriver driver, String xpathLocator, String textValue, String... params) {
		WebElement element = getWebElement(driver, getDynamicLocator(xpathLocator, params));
		element.clear();
		element.sendKeys(textValue);
	}

	public String getElementText(WebDriver driver, String xpathLocator) {
		return getWebElement(driver, xpathLocator).getText();
	}

	public String getElementText(WebDriver driver, String xpathLocator, String... params) {
		return getWebElement(driver, getDynamicLocator(xpathLocator, params)).getText();
	}

	public void sleepInSecond(long second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isElementDisplayed(WebDriver driver, String xpathLocator) {
		try {
			return getWebElement(driver, xpathLocator).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isElementDisplayed(WebDriver driver, String xpathLocator, String... params) {
		return getWebElement(driver, getDynamicLocator(xpathLocator, params)).isDisplayed();
	}
	
	public void waitForElementVisible(WebDriver driver, String xpathLocator) {
		WebDriverWait explicitWait = new WebDriverWait(driver, LONG_TIMEOUT);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(xpathLocator)));
	}

	public void waitForElementVisible(WebDriver driver, String xpathLocator, String... params) {
		WebDriverWait explicitWait = new WebDriverWait(driver, LONG_TIMEOUT);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByXpath(getDynamicLocator(xpathLocator, params))));
	}
	
	public void waitForElementClickable(WebDriver driver, String xpathLocator) {
		WebDriverWait explicitWait = new WebDriverWait(driver, LONG_TIMEOUT);
		explicitWait.until(ExpectedConditions.elementToBeClickable(getByXpath(xpathLocator)));
	}

	public void waitForElementClickable(WebDriver driver, String xpathLocator, String... params) {
		WebDriverWait explicitWait = new WebDriverWait(driver, LONG_TIMEOUT);
		explicitWait.until(ExpectedConditions.elementToBeClickable(getByXpath(getDynamicLocator(xpathLocator, params))));
	}
}
