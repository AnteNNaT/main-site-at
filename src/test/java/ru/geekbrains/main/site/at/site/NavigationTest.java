package ru.geekbrains.main.site.at.site;


import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.geekbrains.main.site.at.pages.Page;
import ru.geekbrains.main.site.at.site.base.BaseTest;

@Feature("Навигация")
//@DisplayName("Проверка Навигации")
public class NavigationTest extends BaseTest {

    @Description("Тесты, которые проверяют функционал без Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @ValueSource(strings = { "Вебинары", "Форум", "Тесты", "Карьера"})
    void navigationTestWithoutPopUp(String navItemName){

        new Page(driver)
                .getNavigation().clickButton(navItemName)
                .getHeader().checkHeaderIsDisplayed()
                .getHeader().checkNamePage(navItemName)
                .getFooter().checkFooterIsDisplayed();

    }

    @Description("Тесты, которые проверяют функционал с Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @ValueSource(strings = { "Курсы", "Блог"})
    void navigationTestWithPopUp(String navItemName){

        new Page(driver)
                .getNavigation().clickButton(navItemName)
                .closedPopUp()
                .getHeader().checkHeaderIsDisplayed()
                .getHeader().checkNamePage(navItemName)
                .getFooter().checkFooterIsDisplayed();

    }

}
