package ru.geekbrains.main.site.at.pages.content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.blocks.CourseNavigation;
import ru.geekbrains.main.site.at.pages.BasePage;

public class CoursePage extends BasePage {

    private CourseNavigation courseNavigation;


    public CoursePage(WebDriver driver) {
        super(driver);
        this.courseNavigation=new CourseNavigation(driver);
        PageFactory.initElements(driver, this);
    }

    public CourseNavigation getCourseNavigation() {
        return courseNavigation;
    }
}
