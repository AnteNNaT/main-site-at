package ru.geekbrains.main.site.at.blocks;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.geekbrains.main.site.at.pages.Page;

public class Navigation {
    @FindBy(css="[id='nav'] [href='/courses']")
    private WebElement buttonCourses;

    @FindBy(css="[id='nav'] [href='/events']")
    WebElement buttonEvents;

    @FindBy(css="[id='nav'] [href='/topics']")
    WebElement buttonTopics;

    @FindBy(css="[id='nav'] [href='/posts']")
    WebElement buttonPosts;

    @FindBy(css="[id='nav'] [href='/tests']")
    WebElement buttonTests;

    @FindBy(css="[id='nav'] [href='/career']")
    WebElement buttonCareer;


   private WebDriver driver;

    public Navigation(WebDriver driver) {
       this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    @Step("Нажатие на элемент навигации '{navItemName}'")
    public Page clickButton(String navItemName){
        switch (navItemName){
            case "Курсы" :{
                buttonCourses.click();
                break;
            }
            case "Вебинары" :{
                buttonEvents.click();
                break;
            }
            case "Форум" :{
                buttonTopics.click();
                break;
            }
            case "Блог" :{
                buttonPosts.click();
                break;
            }
            case "Тесты" :{
                buttonTests.click();
                break;
            }
            case "Карьера" :{
                buttonCareer.click();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + navItemName);
        }
        return new Page(driver);

    }
}




