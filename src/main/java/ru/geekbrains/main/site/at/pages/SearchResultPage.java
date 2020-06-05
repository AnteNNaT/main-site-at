package ru.geekbrains.main.site.at.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.geekbrains.main.site.at.blocks.Search;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.lessThan;

public class SearchResultPage {

    @FindBy(css="[id=\"professions\"] h2")
    WebElement professions;

    @FindBy(xpath =".//header/h2[text()='Курсы']")
    WebElement courses;

    @FindBy(xpath = ".//header/h2[text()='Вебинары']")
    WebElement events;

    @FindBy(xpath=".//header/h2[text()='Блоги']")
    WebElement blogs;

    @FindBy(xpath =".//header/h2[text()='Форум']")
    WebElement forum;

    @FindBy(xpath = ".//header/h2[text()='Тесты']")
    WebElement tests;

    @FindBy(xpath = "//header/h2[text()='Проекты и компании']")
    WebElement projectAndCompany;

    @FindBy(xpath="//a[@class='search-page-block__more' and @data-tab='professions']/span")
    WebElement professionsCount;

    @FindBy(xpath ="//a[@class='search-page-block__more' and @data-tab='courses']/span")
    WebElement coursesCount;

    @FindBy(xpath = "//a[@class='search-page-block__more' and @data-tab='webinars']/span")
    WebElement eventsCount;

    @FindBy(xpath = "//a[@class='search-page-block__more' and @data-tab='blogs']/span")
    WebElement blogsCount;

    @FindBy(xpath="//a[@class='search-page-block__more' and @data-tab='forums']/span")
    WebElement forumsCount;

    @FindBy(xpath="//a[@class='search-page-block__more' and @data-tab='tests']/span")
    WebElement testsCount;

    @FindBy(xpath = "//div[@class='company-items']//h3/a[contains(text(),'GeekBrains')]")
    List<WebElement> GBCompany;

    @FindBy(xpath = "//a[@class='event__title h3 search_text']")
    List<WebElement> eventsList;

    private WebDriver driver;
    private Search search;

    public SearchResultPage(WebDriver driver) {
        this.driver=driver;
        this.search=new Search(driver);
        PageFactory.initElements(driver, this);
    }

    public Search getSearch() {
        return search;
    }

    @Step("Проверка имени блока в результатах поиска")
    public SearchResultPage checkBlocksName() {

        WebDriverWait wait20second=new WebDriverWait(driver, 20);
        wait20second.until(ExpectedConditions.textToBePresentInElement(professions,"Профессии"));
        wait20second.until(ExpectedConditions.textToBePresentInElement(courses,"Курсы"));
        wait20second.until(ExpectedConditions.textToBePresentInElement(events,"Вебинары"));
        wait20second.until(ExpectedConditions.textToBePresentInElement(blogs,"Блоги"));
        wait20second.until(ExpectedConditions.textToBePresentInElement(forum,"Форум"));
        wait20second.until(ExpectedConditions.textToBePresentInElement(tests,"Тесты"));
        wait20second.until(ExpectedConditions.textToBePresentInElement(projectAndCompany,"Проекты и компании"));
        return this;
    }
    @Step("Проверка: Число профессий не менее чем '{amountOfElements}'")
    public SearchResultPage verifyProfessionsCountNoLessThanSpecifiedAmount(Integer amountOfElements){
        assertThat(Integer.parseInt(professionsCount.getText()), greaterThanOrEqualTo(amountOfElements));
        return this;
    }
    @Step("Проверка: число курсов более чем '{amountOfElements}'")
    public SearchResultPage verifyCoursesCountMoreThanSpecifiedAmount(Integer amountOfElements){
        assertThat(Integer.parseInt(coursesCount.getText()),greaterThan(amountOfElements));
        return this;
    }
    @Step("Проверка: число вебинаров больше чем '{minAmountOfElements}', но меньше чем '{maxAmountOfElements}'")
    public SearchResultPage verifyEventsCountMoreThanMinAmountAndLessThanMaxAmount(Integer minAmountOfElements, Integer maxAmountOfElements){
        assertThat(Integer.parseInt(eventsCount.getText()), allOf(greaterThan(minAmountOfElements),lessThan(maxAmountOfElements)));
        return this;
    }
    @Step("Проверка: число блогов более чем '{amountOfElements}'")
    public SearchResultPage verifyBlogsCountMoreThanSpecifiedAmount(Integer amountOfElements){
        assertThat(Integer.parseInt(blogsCount.getText()), greaterThan(amountOfElements));
        return this;
    }
    @Step("Проверка: число форумов не равно '{amountOfElements}'")
    public SearchResultPage verifyForumsCountNotEqualToSpecifiedAmount(Integer amountOfElements){
        assertThat(Integer.parseInt(forumsCount.getText()), not(equalTo(amountOfElements)));
        return this;
    }
    @Step("Проверка: число тестов не равно 0")
    public SearchResultPage verifyTestsCountNotNull(){
        assertThat(Integer.parseInt(testsCount.getText()), not(equalTo(0)));
        return this;
    }
    @Step("Проверка: первый элемент в блоке 'Вебинары': '{WebinarName}'")
    public SearchResultPage verifyFirstValueOfEventsListContainsRequiredText(String WebinarName){
        assertThat(eventsList.get(0).getText(), equalTo(WebinarName));
        return this;
    }
    @Step("Проверка: В 'Проектах и компаниях' отображается GeekBrains")
    public SearchResultPage verifyProjectAndCompanyContainsGeekBrains(){
        assertThat(GBCompany.size(), greaterThan(0));
        return this;
    }

}


    //Integer GBCompany=driver.findElements(By.xpath("//div[@class='company-items']//h3/a[contains(text(),'GeekBrains')]")).size();



