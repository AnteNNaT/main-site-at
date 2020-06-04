package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.blocks.Footer;
import ru.geekbrains.main.site.at.blocks.Header;
import ru.geekbrains.main.site.at.blocks.Navigation;

public class Page {

    @FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
    private WebElement buttonPopUpClosed;

    private Navigation navigation;
    private Header header;
    private Footer footer;
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver=driver;
        this.navigation = new Navigation(driver);
        this.header=new Header(driver);
        this.footer=new Footer(driver);
        PageFactory.initElements(driver, this);
    }


   public Navigation getNavigation() {
       return navigation;
   }

   public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

    public Page closedPopUp() {
        this.buttonPopUpClosed.click();
        return this;
    }


}




