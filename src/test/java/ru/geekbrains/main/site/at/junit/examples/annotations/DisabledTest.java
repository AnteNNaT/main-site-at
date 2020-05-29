package ru.geekbrains.main.site.at.junit.examples.annotations;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledTest {

    @Disabled
    @Test
    void example() {
        assertTrue(true);
        assertEquals(2, 1 + 1);
    }
}
