package ru.geekbrains.main.site.at.blocks;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.pages.BasePage;
import ru.geekbrains.main.site.at.pages.content.Page;
import ru.geekbrains.main.site.at.utils.ButtonNotFoundException;

public class LeftNavigation extends BasePage {
    @FindBy(css="[id='nav'] [href='/courses']")
    private WebElement buttonCourses;

    @FindBy(css="[id='nav'] [href='/events']")
    private WebElement buttonEvents;

    @FindBy(css="[id='nav'] [href='/topics']")
    private WebElement buttonTopics;

    @FindBy(css="[id='nav'] [href='/posts']")
    private WebElement buttonPosts;

    @FindBy(css="[id='nav'] [href='/tests']")
    private WebElement buttonTests;

    @FindBy(css="[id='nav'] [href='/career']")
    private WebElement buttonCareer;

    public LeftNavigation(WebDriver driver) {
       super(driver);
       PageFactory.initElements(driver, this);
}

    @Step("Нажатие на элемент навигации '{navItemName}'")
    public Page clickButton(Button navItemName) {
        
        switch (navItemName) {
            case COURSES: {
                buttonCourses.click();
                break;
            }
            case EVENTS: {
                buttonEvents.click();
                break;
            }
            case TOPICS: {
                buttonTopics.click();
                break;
            }
            case POSTS: {
                buttonPosts.click();
                break;
            }
            case TESTS: {
                buttonTests.click();
                break;
            }
            case CAREER: {
                buttonCareer.click();
                break;
            }
            default:
                throw new ButtonNotFoundException();
        }
        return new Page(driver);

    }

    public enum Button {
        ICON("Главная"),
        COURSES("Курсы"),
        EVENTS("Вебинары"),
        TOPICS("Форум"),
        POSTS("Блог"),
        TESTS("Тесты"),
        CAREER("Карьера");

        private String text;

        Button(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}





