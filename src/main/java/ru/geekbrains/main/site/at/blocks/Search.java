package ru.geekbrains.main.site.at.blocks;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.pages.SearchResultPage;

import java.util.concurrent.TimeUnit;

public class Search {

    @FindBy(css="[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")
    WebElement buttonSearch;

    @FindBy(css="[class=\"search-panel__search-field\"]")
    WebElement inputSearch;

    private WebDriver driver;

    public Search(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Нажатие кнопки 'Поиск'")
    public SearchResultPage ButtonSearchClick() {
        buttonSearch.click();
        return new SearchResultPage(driver);
    }

    @Step("Ввод ключевого слова '{keyword}' в строку поиска")
    public SearchResultPage fillInputSearch(String keyword){
        inputSearch.sendKeys(keyword);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        return new SearchResultPage(driver);
    }
}
