package ru.geekbrains.main.site.at.example.junit.assertions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNullExample {

    @Test
    void name() {
        String name = "Том";
        Assertions.assertNotNull(name);

        name = null;
        Assertions.assertNull(name);
    }
}