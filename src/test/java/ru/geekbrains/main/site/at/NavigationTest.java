package ru.geekbrains.main.site.at;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

public class NavigationTest extends BaseTest {

    String getItemLinkName (String navItemName){
        switch (navItemName){
            case "Курсы" :{
                return  "courses";
            }
            case "Вебинары" :{
                return "events";
            }
            case "Форум" :{
                return "topics";
            }
            case "Блог" :{
                return "posts";
            }
            case "Тесты" :{
                return "tests";
            }
            case "Карьера" :{
                return "career";
            }
            default:
                throw new IllegalStateException("Unexpected value: " + navItemName);
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "Курсы", "Вебинары", "Форум", "Блог", "Тесты", "Карьера"})
    void navigationTest(String navItemName){
        WebElement buttonCourses = BaseTest.getDriver().findElement(By.cssSelector("[id='nav'] [href='/"+
                getItemLinkName (navItemName)+"']"));
        buttonCourses.click();
        WebElement header=BaseTest.getDriver().findElement(By.cssSelector("header[id='top-menu']"));
        Assertions.assertTrue(header.isDisplayed());
        WebElement textNamePage = BaseTest.getDriver().findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
        Assertions.assertEquals(navItemName, textNamePage.getText());
        WebElement footer=BaseTest.getDriver().findElement(By.cssSelector("footer[class='site-footer']"));
        Assertions.assertTrue(footer.isDisplayed());
    }


}
