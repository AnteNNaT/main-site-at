package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

public class Header extends BaseTest {

    WebElement textNamePage = BaseTest.getDriver().findElement(By.cssSelector("h2[class=\"gb-header__title\"]"));
    WebElement buttonSearch=BaseTest.getDriver().findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]"));
    WebElement loginLink=BaseTest.getDriver().findElement(By.cssSelector("[href='/login']"));
    WebElement registerLink=BaseTest.getDriver().findElement(By.cssSelector("[href='/register']"));

}
