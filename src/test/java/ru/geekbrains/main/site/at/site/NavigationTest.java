package ru.geekbrains.main.site.at.site;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.geekbrains.main.site.at.pages.Page;
import ru.geekbrains.main.site.at.site.base.BaseTest;

public class NavigationTest extends BaseTest {

    @Description("Тесты, которые проверяют функционал без Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @ValueSource(strings = { "Вебинары", "Форум", "Тесты", "Карьера"})
    void navigationTestWithoutPopUp(String navItemName){

        new Page(driver)
                .getNavigation().clickButton(navItemName)
                .getFooter().checkFooterIsDisplayed()
                .getHeader().checkHeaderIsDisplayed()
                .getHeader().checkNamePage(navItemName);

    }

    @Description("Тесты, которые проверяют функционал с Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @ValueSource(strings = { "Курсы", "Блог"})
    void navigationTestWithPopUp(String navItemName){

        new Page(driver)
                .getNavigation().clickButton(navItemName)
                .closedPopUp()
                .getFooter().checkFooterIsDisplayed()
                .getHeader().checkHeaderIsDisplayed()
                .getHeader().checkNamePage(navItemName);

    }

}
