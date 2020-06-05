package ru.geekbrains.main.site.at.blocks;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.pages.Page;

public class Footer {

    @FindBy(css="footer[class='site-footer']")
    WebElement footer;

    @FindBy(css="svg[class='svg-icon icon-facebook_dark']")
    WebElement facebookLink;

    @FindBy(css="svg[class='svg-icon icon-vk']")
    WebElement vkLink;

    @FindBy(css="svg[class='svg-icon icon-instagram']")
    WebElement instagramLink;

    @FindBy(css="svg[class='svg-icon icon-youtube']")
    WebElement youtubeLink;

    @FindBy(css="svg[class='svg-icon icon-telegram']")
    WebElement telegramLink;

    @FindBy(css="[href='/feedbacks']")
    WebElement feedbacksLink;

    @FindBy(css="div[class='site-footer__links'] a[href='https://geekbrains.zendesk.com/hc/ru']")
    WebElement helpLink;

    @FindBy(css="[href='/company']")
    WebElement companyLink;

    @FindBy(css="[href='/license.pdf']")
    WebElement licenseLink;

    @FindBy(css="[href='/career/682']")
    WebElement careerLink;

    @FindBy(css="[href='https://forbusiness.geekbrains.ru']")
    WebElement forBusinessLink;

    @FindBy(css="[href='tel:+78007006841']")
    WebElement phoneLink;

    @FindBy(css="svg[class='svg-icon icon-skolkovo']")
    WebElement scolkovoLink;


   private WebDriver driver;

    public Footer(WebDriver driver) {
     this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Проверка видимости футера")
    public Page checkFooterIsDisplayed(){
        Assertions.assertTrue(footer.isDisplayed());
        return new Page(driver);
    }
}

