package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

public class NavigationTest extends BaseTest {
//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Курсы
//    Проверить что страница Курсы открылась
//    Повторить для
//    Курсы
//    Вебинары
//    Форум
//    Блог
//    Тесты
//    Карьера
    /* Улучшить “Тест 1”
        Вынести проверку каждой страницы в отдельный тест
    Реализовать проверку отображения блоков Header и Footer на каждой странице сайта (как минимум самого блока)
    *Создать классы Header и Footer в которых создать локаторы ко всем элементам в этих блоках

     */

    //Много кода
    //Сложно оптимизировать при изменениях
    //Повторяет одни и теже действия
    //тестовые данные в проперти файле
    //6 проверок в одном тесте

    void navigationTest(String selector, String headerText){
        WebElement buttonCourses = driver.findElement(By.cssSelector(selector));
        buttonCourses.click();
        WebElement header=driver.findElement(By.cssSelector("header[id='top-menu']"));
        Assertions.assertTrue(header.isDisplayed());
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals(headerText, textNamePage.getText());
        WebElement footer=driver.findElement(By.cssSelector("footer[class='site-footer']"));
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


//    @Test
//    void checkNavigation(){
//        driver.get("https://geekbrains.ru/courses");
//        WebElement textNamePage;
//
//        driver.findElement(By.cssSelector("button>[class=\"svg-icon icon-popup-close-button \"]")).click();
//
//        WebElement buttonCourses = driver.findElement(By.cssSelector("[id='nav'] [href='/courses']"));
//        buttonCourses.click();
//        textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
//        Assertions.assertEquals("Курсы",textNamePage.getText());
////
////        Вебинары href="/events"
//        WebElement buttonEvents = driver.findElement(By.cssSelector("[id='nav'] [href='/events']"));
//        buttonEvents.click();
//        textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
//        Assertions.assertEquals("Вебинары",textNamePage.getText());
////
////                Форум href="/topics"
//        WebElement topics = driver.findElement(By.cssSelector("[id='nav'] [href='/topics']"));
//        topics.click();
//        textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
//        Assertions.assertEquals("Форум",textNamePage.getText());
////
////        Блог href="/posts"
//        WebElement posts = driver.findElement(By.cssSelector("[id='nav'] [href='/posts']"));
//        posts.click();
//        textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
//        Assertions.assertEquals("Блог",textNamePage.getText());
////
////                Тесты href="/tests"
//        WebElement tests = driver.findElement(By.cssSelector("[id='nav'] [href='/tests']"));
//        tests.click();
//        textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
//        Assertions.assertEquals("Тесты",textNamePage.getText());
////
////        Карьера href="/career"
//        WebElement career = driver.findElement(By.cssSelector("[id='nav'] [href='/career']"));
//        career.click();
//        textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
//        Assertions.assertEquals("Карьера",textNamePage.getText());
//    }


}
