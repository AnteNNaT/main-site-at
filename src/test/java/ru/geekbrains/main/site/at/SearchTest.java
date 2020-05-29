package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.base.BaseTest;

import java.util.List;


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

        List<WebElement> eventsList=BaseTest.getDriver().findElements(By.xpath("//a[@class='event__title h3 search_text']"));
        WebElement GBCompany=BaseTest.getDriver().findElement(By.xpath("//div[@class='company-items']//h3/a[contains(text(),'GeekBrains')]"));

        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(professions,"Профессии"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(courses,"Курсы"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(events,"Вебинары"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(blogs,"Блоги"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(forum,"Форум"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(tests,"Тесты"));
        getWebDriverWait().until(ExpectedConditions.textToBePresentInElement(projectAndCompany,"Проекты и компании"));

        Assertions.assertTrue((Integer.parseInt(professionsCount.getText()))>=2,"Количество найденных профессий менее 2!");
        Assertions.assertTrue((Integer.parseInt(coursesCount.getText()))>15,"Количество найденных курсов <= 15!");
        Assertions.assertTrue((Integer.parseInt(eventsCount.getText())>180)&(Integer.parseInt(eventsCount.getText())<300),
                "Количество найденных вебинаров не в диапазоне (180; 300)");
        Assertions.assertTrue((Integer.parseInt(blogsCount.getText()))>300,"Количество найденных блогов менее 300!");
        Assertions.assertTrue((Integer.parseInt(forumsCount.getText()))!=350,"Количество найденных форумов равно 350!");
        Assertions.assertTrue((Integer.parseInt(testsCount.getText())) != 0,"Количество найденных тестов равно 0!");

        Assertions.assertEquals("Java Junior. Что нужно знать для успешного собеседования?", eventsList.get(0).getText());
        Assertions.assertNotNull(GBCompany, "В Проектах и компаниях не отображается GeekBrains");

    }
}
