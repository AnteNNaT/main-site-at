package ru.geekbrains.main.site.at.pages.content;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.blocks.CourseNavigation;
import ru.geekbrains.main.site.at.blocks.Footer;
import ru.geekbrains.main.site.at.blocks.Header;
import ru.geekbrains.main.site.at.blocks.LeftNavigation;
import ru.geekbrains.main.site.at.pages.BasePage;

public class Page extends BasePage {

    private LeftNavigation navigation;
    private Header header;
    private Footer footer;
    private CourseNavigation courseNavigation;
    private  CoursePage coursePage;

    public Page(WebDriver driver) {
        super(driver);
        this.navigation = new LeftNavigation(driver);
        this.header=new Header(driver);
        this.footer=new Footer(driver);
        this.coursePage=new CoursePage(driver);
        this.courseNavigation=new CourseNavigation(driver);
        PageFactory.initElements(driver, this);
    }

   public LeftNavigation getNavigation() {
       return navigation;
   }

   public Header getHeader() {
        return header;
    }

    public Footer getFooter() {
        return footer;
    }

    public CourseNavigation getCourseNavigation() {
        return courseNavigation;
    }

    public CoursePage getCoursePage() {
        return coursePage;
    }

    @Step("Закрытие Pop Up")
    @Override
    public Page closedPopUp() {
        super.closedPopUp();
        return this;
    }


}




