package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.pages.content.SearchResultPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;

@Feature("Поиск")
@DisplayName("Проверка работы функции поиска")
public class SearchTest extends BaseTest {

    @BeforeEach
    void beforeSearchTest() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Description("Проверка работы функции поиска")
    @DisplayName("Проверка отображения блоков и количества найденного контента в результатах поиска")
    @Test
    void search()  {

        new SearchResultPage(driver)
        .getHeader().ButtonSearchClick()
        .getSearch().fillInputSearch("java")
        .checkBlocksName(SearchResultPage.Tab.Professions)
        .checkBlocksName(SearchResultPage.Tab.Courses)
        .checkBlocksName(SearchResultPage.Tab.Webinars)
        .checkBlocksName(SearchResultPage.Tab.Blogs)
        .checkBlocksName(SearchResultPage.Tab.Forums)
        .checkBlocksName(SearchResultPage.Tab.Tests)
        .checkBlocksName(SearchResultPage.Tab.Companies)
        .checkCount(SearchResultPage.Tab.Professions, greaterThanOrEqualTo(2))
        .checkCount(SearchResultPage.Tab.Courses, greaterThan(15))
        .checkCount(SearchResultPage.Tab.Webinars, allOf(greaterThan(180), lessThan(300)))
        .checkCount(SearchResultPage.Tab.Blogs, greaterThan(300))
        .checkCount(SearchResultPage.Tab.Forums, not(350))
        .checkCount(SearchResultPage.Tab.Tests, not(0))
        .verifyRequiredValueOfEventsListContainsRequiredText(1, "Java Junior. Что нужно знать для успешного собеседования?")
        .verifyProjectAndCompanyContainsGeekBrains();
    }

}
