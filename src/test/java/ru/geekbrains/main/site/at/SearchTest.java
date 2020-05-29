package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class SearchTest extends BaseTest {


    @Test
    void search()  {
        WebElement buttonSearch = BaseTest.getDriver().findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
        buttonSearch.click();
        WebElement inputSearch = BaseTest.getDriver().findElement(By.cssSelector("[class=\"search-panel__search-field\"]"));
        inputSearch.sendKeys("java");


        WebElement professions = BaseTest.getDriver().findElement(By.cssSelector("[id=\"professions\"] h2"));
        WebElement courses = BaseTest.getDriver().findElement(By.xpath(".//header/h2[text()='Курсы']"));
        WebElement events = BaseTest.getDriver().findElement(By.xpath(".//header/h2[text()='Вебинары']"));
        WebElement blogs = BaseTest.getDriver().findElement(By.xpath(".//header/h2[text()='Блоги']"));
        WebElement forum = BaseTest.getDriver().findElement(By.xpath(".//header/h2[text()='Форум']"));
        WebElement tests = BaseTest.getDriver().findElement(By.xpath(".//header/h2[text()='Тесты']"));
        WebElement projectAndCompany = BaseTest.getDriver().findElement(By.xpath("//header/h2[text()='Проекты и компании']"));

        WebElement professionsCount=BaseTest.getDriver().findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='professions']/span"));
        WebElement coursesCount=BaseTest.getDriver().findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='courses']/span"));
        WebElement eventsCount=BaseTest.getDriver().findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='webinars']/span"));
        WebElement blogsCount=BaseTest.getDriver().findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='blogs']/span"));
        WebElement forumsCount=BaseTest.getDriver().findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='forums']/span"));
        WebElement testsCount=BaseTest.getDriver().findElement(By.xpath("//a[@class='search-page-block__more' and @data-tab='tests']/span"));
        Integer GBCompany=BaseTest.getDriver().findElements(By.xpath("//div[@class='company-items']//h3/a[contains(text(),'GeekBrains')]")).size();

        List<WebElement> eventsList=BaseTest.getDriver().findElements(By.xpath("//a[@class='event__title h3 search_text']"));

        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(professions,"Профессии"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(courses,"Курсы"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(events,"Вебинары"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(blogs,"Блоги"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(forum,"Форум"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(tests,"Тесты"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(projectAndCompany,"Проекты и компании"));

        assertThat(Integer.parseInt(professionsCount.getText()), greaterThanOrEqualTo(2));
        assertThat(Integer.parseInt(coursesCount.getText()),greaterThan(15));
        assertThat(Integer.parseInt(eventsCount.getText()), allOf(greaterThan(180),lessThan(300)));
        assertThat(Integer.parseInt(blogsCount.getText()), greaterThan(300));
        assertThat(Integer.parseInt(forumsCount.getText()), not(equalTo(350)));
        assertThat(Integer.parseInt(testsCount.getText()), not(equalTo(0)));
        assertThat(eventsList.get(0).getText(), equalTo("Java Junior. Что нужно знать для успешного собеседования?"));
        assertThat(GBCompany, greaterThan(0));

    }

}
