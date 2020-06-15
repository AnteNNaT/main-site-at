package ru.geekbrains.main.site.at.blocks;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.pages.BasePage;
import ru.geekbrains.main.site.at.pages.content.Page;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

public class CourseNavigation extends BasePage {

    @FindBy(css = "[class*='nav nav-tabs'] [id='prof-link']")
    private WebElement tabProfessions;

    @FindBy(css = "[class*='nav nav-tabs'] [id='free-link']")
    private WebElement tabFreeIntensive;

    @FindBy(css = "[class*='nav nav-tabs'] [id='cour-link']")
    private WebElement tabCourses;

    @FindBy(css = "[class*='nav nav-tabs'] [href*='https://forbusiness']")
    private WebElement tabCompanies;

    public CourseNavigation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Step("Нажатие на элемент навигации '{tab}'")
    public Page clickTab(Tab tab) {
        switch (tab) {
            case Professions: {
                tabProfessions.click();
                //TODO нужно реализовать для данного блока
                return new Page(driver);
            }
            case FreeIntensive: {
                tabFreeIntensive.click();
                //TODO нужно реализовать для данного блока
                return new Page(driver);
            }
            case Courses: {
                tabCourses.click();
                return new Page(driver);
            }
            case Companies: {
                tabCompanies.click();
                //TODO нужно реализовать для данного блока
                return new Page(driver);
            }
        }
        throw new ButtonNotFoundException();
    }

    public enum Tab {
        Professions,
        FreeIntensive,
        Courses,
        Companies;
    }
}
