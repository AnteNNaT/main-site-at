package ru.geekbrains.main.site.at.blocks;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.main.site.at.pages.Page;

public class Header {
    @FindBy(css="h2[class=\"gb-header__title\"]")
    WebElement textNamePage;

    @FindBy(css="header[id='top-menu']")
    WebElement header;

    @FindBy(css="[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")
    WebElement buttonSearch;

    @FindBy(css="[href='/login']")
    WebElement loginLink;

    @FindBy(css="[href='/register']")
    WebElement registerLink;

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public Page checkNamePage(String expectedNamePage) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.textToBePresentInElement(textNamePage,expectedNamePage));
        //Assertions.assertEquals(expectedNamePage, textNamePage.getText());
        return new Page(driver);
    }
    public Page checkHeaderIsDisplayed(){
        Assertions.assertTrue(header.isDisplayed());
        return new Page(driver);
    }
}



