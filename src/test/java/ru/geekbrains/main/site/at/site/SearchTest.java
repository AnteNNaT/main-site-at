package ru.geekbrains.main.site.at.site;

import org.junit.jupiter.api.Test;

import ru.geekbrains.main.site.at.pages.SearchResultPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;


public class SearchTest extends BaseTest {


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
        .verifyForumsCountNotNull()
        .verifyFirstValueOfEventsListContainsRequiredText("Java Junior. Что нужно знать для успешного собеседования?")
        .verifyProjectAndCompanyContainsGeekBrains();

    }

}
