package ru.geekbrains.main.site.at.junit.examples.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertFailTest {

    @Test
    void example()  {
        Assertions.fail("Тест упал");
    }
}