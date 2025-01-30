package com.bdd;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util extends PageObject {


    public void jsClickElement(WebElement element) {
        JavascriptExecutor ex = (JavascriptExecutor) getDriver();
        ex.executeScript("arguments[0].click();", new Object[]{element});
    }

    protected void clickElement(WebElement element) {element.click();}

    protected WebElement webDriverWait(WebElement element, int timeOnSeconds) {
        return (WebElement) (new WebDriverWait(getDriver(), Duration.ofSeconds((long) timeOnSeconds))).until(ExpectedConditions.visibilityOf(element));
    }

    protected void waitForElementAndClick(WebElement element, int timeOnSeconds) {
        this.webDriverWait(element, timeOnSeconds).click();
    }

    protected String getTextFromElement(WebElement element) {return element.getText();}

    public void scrollToElement(WebElement element) {
        Actions action = new Actions(getDriver());
        action.moveToElement(element);
        action.perform();
    }

    public WebElement waitUntilElementIsVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        return (WebElement) wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilElementIsClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
