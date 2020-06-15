package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.blocks.Header;
import ru.geekbrains.main.site.at.pages.content.Page;

public class AuthorizationPage extends BasePage {

    @FindBy(css = "[data-testid='login-email']")
    private WebElement inputLogin;

    @FindBy(css = "[data-testid='login-password']")
    private WebElement inputPassword;

    @FindBy(css = "[data-testid='login-submit'")
    private WebElement buttonSignIn;

    private Header header;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
        this.header=new Header(driver);
        PageFactory.initElements(driver, this);
    }

    public Header getHeader() {
        return header;
    }

    public Page login(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSignIn.click();
        return new Page(driver);
    }
}
