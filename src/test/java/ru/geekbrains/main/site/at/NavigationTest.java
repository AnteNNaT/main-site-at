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

    //Много кода
    //Сложно оптимизировать при изменениях
    //Повторяет одни и теже действия
    //тестовые данные в проперти файле
    //6 проверок в одном тесте

    @Test
    void courses() {
        driver.findElement(By.cssSelector("button>[class=\"svg-icon icon-popup-close-button \"]")).click();

        WebElement buttonCourses = driver.findElement(By.cssSelector("[id='nav'] [href='/courses']"));
        buttonCourses.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Курсы", textNamePage.getText());
    }

    @Test
    void events() {
        WebElement buttonEvents = driver.findElement(By.cssSelector("[id='nav'] [href='/events']"));
        buttonEvents.click();
        WebElement textNamePage = driver.findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals("Вебинары", textNamePage.getText());
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
