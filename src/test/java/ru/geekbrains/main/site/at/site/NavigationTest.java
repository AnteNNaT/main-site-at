package ru.geekbrains.main.site.at.site;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.geekbrains.main.site.at.pages.Page;
import ru.geekbrains.main.site.at.site.base.BaseTest;

public class NavigationTest extends BaseTest {

    @ParameterizedTest
    @ValueSource(strings = { "Курсы", "Вебинары", "Форум", "Блог", "Тесты", "Карьера"})
    void navigationTest(String navItemName){

        new Page(driver)
        .getNavigation().clickButton(navItemName)
        .getFooter().checkFooterIsDisplayed()
        .getHeader().checkNamePage(navItemName)
        .getHeader().checkHeaderIsDisplayed();

    }


}
