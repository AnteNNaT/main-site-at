package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

public class NavigationTest extends BaseTest {


    void navigationTest(String selector, String headerText){
        WebElement buttonCourses = BaseTest.getDriver().findElement(By.cssSelector(selector));
        buttonCourses.click();
        WebElement header=BaseTest.getDriver().findElement(By.cssSelector("header[id='top-menu']"));
        Assertions.assertTrue(header.isDisplayed());
        WebElement textNamePage = BaseTest.getDriver().findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals(headerText, textNamePage.getText());
        WebElement footer=BaseTest.getDriver().findElement(By.cssSelector("footer[class='site-footer']"));
        Assertions.assertTrue(footer.isDisplayed());
    }

    @Test
    void courses() {

        navigationTest("[id='nav'] [href='/courses']", "Курсы");
    }

    @Test
    void events() {

        navigationTest("[id='nav'] [href='/events']", "Вебинары");

    }

    @Test
    void topics() {

        navigationTest("[id='nav'] [href='/topics']", "Форум");

    }

    @Test
    void posts() {

        navigationTest("[id='nav'] [href='/posts']", "Блог");


    }

    @Test
    void tests() {

        navigationTest("[id='nav'] [href='/tests']", "Тесты");

    }

    @Test
    void career() {

        navigationTest("[id='nav'] [href='/career']", "Карьера");

    }



}
