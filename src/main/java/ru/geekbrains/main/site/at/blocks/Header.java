package ru.geekbrains.main.site.at.blocks;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.pages.AuthorizationPage;
import ru.geekbrains.main.site.at.pages.BasePage;
import ru.geekbrains.main.site.at.pages.content.Page;
import ru.geekbrains.main.site.at.pages.content.SearchResultPage;

public class Header  extends BasePage {
    @FindBy(css="h2[class=\"gb-header__title\"]")
    private WebElement textNamePage;

    @FindBy(css="header[id='top-menu']")
    private WebElement header;

    @FindBy(css="[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")
    private WebElement buttonSearch;

    @FindBy(css="[href='/login']")
    private WebElement loginLink;

    @FindBy(css="[href='/register']")
    private WebElement registerLink;

    public Header(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Проверка названия страницы '{expectedNamePage}'")
    public Page checkNamePage(String expectedNamePage) {
        wait10second.until(ExpectedConditions.textToBePresentInElement(textNamePage,expectedNamePage));
        //Assertions.assertEquals(expectedNamePage, textNamePage.getText());
        return new Page(driver);
    }

    @Step("Проверка видимости хедера")
    public Page checkHeaderIsDisplayed(){
        Assertions.assertTrue(header.isDisplayed());
        return new Page(driver);
    }

    @Step("Нажатие кнопки 'Поиск'")
    public SearchResultPage ButtonSearchClick() {
        buttonSearch.click();
        return new SearchResultPage(driver);
    }

    @Step("Нажатие кнопки 'Вход'")
    public AuthorizationPage LoginLinkClick(){
        loginLink.click();
        return new AuthorizationPage(driver);
    }
}



