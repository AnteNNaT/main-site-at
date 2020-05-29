package ru.geekbrains.main.site.at.junit.examples.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysEqualsTest {

    @Test
    void example() {
        int[] arraysExpected= {1,2,3};
        int[] arraysActual= {1,2,4};

        Assertions.assertArrayEquals(arraysExpected, arraysActual);
    }
}
