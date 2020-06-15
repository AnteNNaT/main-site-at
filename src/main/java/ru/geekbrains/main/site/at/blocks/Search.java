package ru.geekbrains.main.site.at.blocks;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.pages.BasePage;
import ru.geekbrains.main.site.at.pages.content.SearchResultPage;

public class Search  extends BasePage {


    @FindBy(css="[class=\"search-panel__search-field\"]")
    private WebElement inputSearch;


    public Search(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Ввод ключевого слова '{keyword}' в строку поиска")
    public SearchResultPage fillInputSearch(String keyword){
        inputSearch.sendKeys(keyword);
        return new SearchResultPage(driver);
    }
}
