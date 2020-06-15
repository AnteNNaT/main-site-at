package ru.geekbrains.main.site.at.blocks;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.pages.BasePage;
import ru.geekbrains.main.site.at.pages.content.Page;

public class Footer extends BasePage {

    @FindBy(css="footer[class='site-footer']")
    private WebElement footer;

    @FindBy(css="svg[class='svg-icon icon-facebook_dark']")
    private WebElement facebookLink;

    @FindBy(css="svg[class='svg-icon icon-vk']")
    private WebElement vkLink;

    @FindBy(css="svg[class='svg-icon icon-instagram']")
    private WebElement instagramLink;

    @FindBy(css="svg[class='svg-icon icon-youtube']")
    private WebElement youtubeLink;

    @FindBy(css="svg[class='svg-icon icon-telegram']")
    private WebElement telegramLink;

    @FindBy(css="[href='/feedbacks']")
    private WebElement feedbacksLink;

    @FindBy(css="div[class='site-footer__links'] a[href='https://geekbrains.zendesk.com/hc/ru']")
    private WebElement helpLink;

    @FindBy(css="[href='/company']")
    private WebElement companyLink;

    @FindBy(css="[href='/license.pdf']")
    private WebElement licenseLink;

    @FindBy(css="[href='/career/682']")
    private WebElement careerLink;

    @FindBy(css="[href='https://forbusiness.geekbrains.ru']")
    private WebElement forBusinessLink;

    @FindBy(css="[href='tel:+78007006841']")
    private WebElement phoneLink;

    @FindBy(css="svg[class='svg-icon icon-skolkovo']")
    private WebElement scolkovoLink;


    public Footer(WebDriver driver) {
         super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Проверка видимости футера")
    public Page checkFooterIsDisplayed(){
        Assertions.assertTrue(footer.isDisplayed());
        return new Page(driver);
    }
}

