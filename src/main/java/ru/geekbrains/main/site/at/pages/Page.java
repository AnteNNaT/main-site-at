package ru.geekbrains.main.site.at.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.blocks.Footer;
import ru.geekbrains.main.site.at.blocks.Header;
import ru.geekbrains.main.site.at.blocks.Navigation;

public class Page {


    private Navigation navigation;
    private Header header;
    private Footer footer;
    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver=driver;
        navigation = new Navigation(driver);
        header=new Header(driver);
        footer=new Footer(driver);
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
}




