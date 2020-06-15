package ru.geekbrains.main.site.at.pages.content;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.main.site.at.blocks.CourseNavigation;
import ru.geekbrains.main.site.at.blocks.LeftNavigation;
import ru.geekbrains.main.site.at.pages.BasePage;

import java.util.List;

public class CoursePage extends BasePage {

    @FindBy(xpath = "//form/ul//label")
    private List<WebElement> filterList;

    @FindBy(xpath = "//a/div/div/span")
    private List<WebElement> courseList;

    private CourseNavigation courseNavigation;
    private LeftNavigation navigation;

    public CoursePage(WebDriver driver) {
        super(driver);
        this.navigation = new LeftNavigation(driver);
        this.courseNavigation=new CourseNavigation(driver);
        PageFactory.initElements(driver, this);
    }

    public CourseNavigation getCourseNavigation() {
        return courseNavigation;
    }

    public LeftNavigation getNavigation() {
        return navigation;
    }

    @Step("Проверка выбора параметров фильтрации")
    public Page Filter(String... args) {
        for (String text : args) {
            for (WebElement element: filterList) {
                if (element.getText().equals(text)) {
                    element.click();
                }
            }
        }
        return new Page(driver);
    }

    @Step("Проверка результатов фильтрации")
    public Page checkingCourses(String... args) {
        for (String text : args) {
            for (WebElement element: courseList) {
                if (element.getText().toLowerCase().equals(text.toLowerCase())) {
                    wait10second.until(ExpectedConditions.visibilityOf(element));
                }
            }
        }
        return new Page(driver);
    }
}
