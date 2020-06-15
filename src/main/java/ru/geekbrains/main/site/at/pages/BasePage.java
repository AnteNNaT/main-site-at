package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
    private WebElement buttonPopUpClosed;

    protected WebDriver driver;
    protected WebDriverWait wait10second;
    protected WebDriverWait wait30second;

    public BasePage(WebDriver driver) {
        this.driver=driver;

        this.wait10second = new WebDriverWait(driver, 10);
        this.wait30second = new WebDriverWait(driver, 30);
     //   PageFactory.initElements(driver, this);
    }

    public BasePage closedPopUp() {
        wait10second.until(ExpectedConditions.visibilityOf(buttonPopUpClosed));
        if (buttonPopUpClosed.isDisplayed()) {
            this.buttonPopUpClosed.click();
        }
        return this;
    }

}
