package ru.geekbrains.main.site.at.site;


import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import ru.geekbrains.main.site.at.blocks.LeftNavigation.Button;
import ru.geekbrains.main.site.at.pages.content.Page;
import ru.geekbrains.main.site.at.site.base.BaseTest;

import java.util.stream.Stream;

@Feature("Навигация")
//@DisplayName("Проверка Навигации")
public class LeftNavigationTest extends BaseTest {

    public static Stream<Button> stringProviderNotPopUp() {
        return Stream.of(
                Button.EVENTS,
                Button.TOPICS,
                Button.TESTS,
                Button.CAREER
        );

    }

    public static Stream<Button> stringProviderPopUp() {
        return Stream.of(
                Button.POSTS,
                Button.COURSES
        );
    }

    @Description("Тесты, которые проверяют функционал без Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @MethodSource("stringProviderNotPopUp")
    void navigationTestWithoutPopUp(Button navItemName){

        new Page(driver)
                .getNavigation().clickButton(navItemName)
                .getHeader().checkHeaderIsDisplayed()
                .getHeader().checkNamePage(navItemName.getText())
                .getFooter().checkFooterIsDisplayed();

    }

    @Description("Тесты, которые проверяют функционал с Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @MethodSource("stringProviderPopUp")
    void navigationTestWithPopUp(Button navItemName){

        new Page(driver)
                .getNavigation().clickButton(navItemName)
                .closedPopUp()
                .getHeader().checkHeaderIsDisplayed()
                .getHeader().checkNamePage(navItemName.getText())
                .getFooter().checkFooterIsDisplayed();

    }

}
