package ru.geekbrains.main.site.at.site;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.main.site.at.pages.content.Page;
import ru.geekbrains.main.site.at.site.base.BaseTest;

import java.util.concurrent.TimeUnit;

import static ru.geekbrains.main.site.at.blocks.CourseNavigation.Tab.Courses;
import static ru.geekbrains.main.site.at.blocks.LeftNavigation.Button.COURSES;

@Feature("Фильтрация")
@DisplayName("Проверка Фильтрации на странице Курсы")
public class CheckCourseTest extends BaseTest {

    @BeforeEach
    void beforeCheckCourseTest()  {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @DisplayName("Проверка работы фильтров")
    @Test
    void checkCoursePageFilter(){

        new Page(driver)
                .getNavigation()

                .clickButton(COURSES)
                .closedPopUp()
                .getCourseNavigation()
                .clickTab(Courses);


    }

}
