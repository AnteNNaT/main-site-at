package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ru.geekbrains.main.site.at.pages.SearchResultPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

@Feature("Поиск")
public class SearchTest extends BaseTest {


    @DisplayName("Проверка отображения и количества блоков в результатах поиска")
    @Test
    void search()  {

        new SearchResultPage(driver)
        .getSearch().ButtonSearchClick()
        .getSearch().fillInputSearch("java")
        .checkBlocksName()
        .verifyProfessionsCountNoLessThanSpecifiedAmount(2)
        .verifyCoursesCountMoreThanSpecifiedAmount(15)
        .verifyEventsCountMoreThanMinAmountAndLessThanMaxAmount(180,300)
        .verifyBlogsCountMoreThanSpecifiedAmount(300)
        .verifyForumsCountNotEqualToSpecifiedAmount(350)
        .verifyTestsCountNotNull()
        .verifyFirstValueOfEventsListContainsRequiredText("Java Junior. Что нужно знать для успешного собеседования?")
        .verifyProjectAndCompanyContainsGeekBrains();

    }

}
