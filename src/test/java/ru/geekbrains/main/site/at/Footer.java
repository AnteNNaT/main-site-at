package ru.geekbrains.main.site.at;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.geekbrains.main.site.at.base.BaseTest;

public class Footer extends BaseTest {

    WebElement facebookLink=BaseTest.getDriver().findElement(By.cssSelector("svg[class='svg-icon icon-facebook_dark']"));
    WebElement vkLink=BaseTest.getDriver().findElement(By.cssSelector("svg[class='svg-icon icon-vk']"));
    WebElement instagramLink=BaseTest.getDriver().findElement(By.cssSelector("svg[class='svg-icon icon-instagram']"));
    WebElement youtubeLink=BaseTest.getDriver().findElement(By.cssSelector("svg[class='svg-icon icon-youtube']"));
    WebElement telegramLink=BaseTest.getDriver().findElement(By.cssSelector("svg[class='svg-icon icon-telegram']"));

    WebElement feedbacksLink=BaseTest.getDriver().findElement(By.cssSelector("[href='/feedbacks']"));
    WebElement helpLink=BaseTest.getDriver().findElement(By.cssSelector("div[class='site-footer__links'] a[href='https://geekbrains.zendesk.com/hc/ru']"));
    WebElement companyLink=BaseTest.getDriver().findElement(By.cssSelector("[href='/company']"));
    WebElement licenseLink=BaseTest.getDriver().findElement(By.cssSelector("[href='/license.pdf']"));
    WebElement careerLink=BaseTest.getDriver().findElement(By.cssSelector("[href='/career/682']"));
    WebElement forBusinessLink=BaseTest.getDriver().findElement(By.cssSelector("[href='https://forbusiness.geekbrains.ru']"));
    WebElement phoneLink=BaseTest.getDriver().findElement(By.cssSelector("[href='tel:+78007006841']"));

    WebElement scolkovoLink=BaseTest.getDriver().findElement(By.cssSelector("svg[class='svg-icon icon-skolkovo']"));




}