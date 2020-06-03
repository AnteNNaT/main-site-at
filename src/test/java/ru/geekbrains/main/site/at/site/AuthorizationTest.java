package ru.geekbrains.main.site.at.site;

    import org.junit.jupiter.api.Test;
    import ru.geekbrains.main.site.at.pages.AuthorizationPage;
    import ru.geekbrains.main.site.at.site.base.BaseTest;

    public class AuthorizationTest extends BaseTest {

        @Test
        void checkValidAuthorization() {
            driver.get("https://geekbrains.ru/");
            AuthorizationPage authorizationPage = new AuthorizationPage();
            authorizationPage.login("login","password")
                    .getHeader().checkNamePage("Главная");


        }
    }

