package ru.geekbrains.main.site.at.pages.content;

import io.qameta.allure.Step;
import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.blocks.Header;
import ru.geekbrains.main.site.at.blocks.Search;
import ru.geekbrains.main.site.at.pages.BasePage;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class SearchResultPage extends BasePage {

    @FindBy(xpath="//div[@id='professions']//h2")
    private WebElement professions;

    @FindBy(xpath =".//header/h2[text()='Курсы']")
    private WebElement courses;

    @FindBy(xpath = ".//header/h2[text()='Вебинары']")
    private WebElement events;

    @FindBy(xpath=".//header/h2[text()='Блоги']")
    private WebElement blogs;

    @FindBy(xpath =".//header/h2[text()='Форум']")
    private WebElement forum;

    @FindBy(xpath = ".//header/h2[text()='Тесты']")
    private WebElement tests;

    @FindBy(xpath = "//header/h2[text()='Проекты и компании']")
    private WebElement projectAndCompany;

    @FindBy(xpath="//a[@class='search-page-block__more' and @data-tab='professions']/span")
    private WebElement professionsCount;

    @FindBy(xpath ="//a[@class='search-page-block__more' and @data-tab='courses']/span")
    private WebElement coursesCount;

    @FindBy(xpath = "//a[@class='search-page-block__more' and @data-tab='webinars']/span")
    private WebElement eventsCount;

    @FindBy(xpath = "//a[@class='search-page-block__more' and @data-tab='blogs']/span")
    private WebElement blogsCount;

    @FindBy(xpath="//a[@class='search-page-block__more' and @data-tab='forums']/span")
    private WebElement forumsCount;

    @FindBy(xpath="//a[@class='search-page-block__more' and @data-tab='tests']/span")
    private WebElement testsCount;

    @FindBy(xpath = "//div[@class='company-items']//h3/a[contains(text(),'GeekBrains')]")
    List<WebElement> GBCompany;

    @FindBy(xpath = "//a[@class='event__title h3 search_text']")
    List<WebElement> eventsList;

    private Search search;
    private Header header;

    public SearchResultPage(WebDriver driver) {
        super(driver);
        this.search=new Search(driver);
        this.header=new Header(driver);
        PageFactory.initElements(driver, this);
    }

    public Search getSearch() {
        return search;
    }

    public Header getHeader() {
        return header;
    }

    @Step("Проверка имени блока в результатах поиска")
    public SearchResultPage checkBlocksName(Tab tab) {
     //   String text = tab.getText();
        wait30second.until(ExpectedConditions.textToBePresentInElement(getTab(tab),tab.getText()));
        return this;
    }

    @Step("Проверка количество найденных элементов в '{tab}': {matcher}")
    public SearchResultPage checkCount(Tab tab, Matcher<Integer> matcher) {
        String actualCount = getTab(tab).findElement(By.xpath("..//span")).getText();
        assertThat(Integer.parseInt(actualCount), matcher);
        return this;
    }

    @Step("Проверка: {Position} элемент в блоке 'Вебинары': '{WebinarName}'")
    public SearchResultPage verifyRequiredValueOfEventsListContainsRequiredText(Integer Position, String WebinarName){
        assertThat(eventsList.get(Position-1).getText(), equalTo(WebinarName));
        return this;
    }
    @Step("Проверка: В 'Проектах и компаниях' отображается GeekBrains")
    public SearchResultPage verifyProjectAndCompanyContainsGeekBrains(){
        assertThat(GBCompany.size(), greaterThan(0));
        return this;
    }

    private WebElement getTab(Tab tab) {
        switch (tab) {
            case Professions:
                return professions;
            case Courses:
                return courses;
            case Webinars:
                return events;
            case Blogs:
                return blogs;
            case Forums:
                return forum;
            case Tests:
                return tests;
            case Companies:
                return projectAndCompany;
            default:
                throw new ButtonNotFoundException();
        }
    }

    public enum Tab {
        Professions("Профессии"),
        Courses("Курсы"),
        Webinars("Вебинары"),
        Blogs("Блоги"),
        Forums("Форум"),
        Tests("Тесты"),
        Companies("Проекты и компании");

        private String text;

        Tab(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }


}





