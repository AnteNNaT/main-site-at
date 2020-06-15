package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.pages.AuthorizationPage;
import ru.geekbrains.main.site.at.site.base.BaseTest;

    @Feature("Авторизация")
    public class AuthorizationTest extends BaseTest {

        @DisplayName("Проверка авторизации с корректными данными")
        @Test
        void checkValidAuthorization() {
            String login = "nyo08473@eoopy.com";
            String password = "nyo08473";
            new AuthorizationPage(driver)
            .getHeader().LoginLinkClick()
            .login(login,password)
            .getHeader().checkNamePage("Главная");


        }
    }

