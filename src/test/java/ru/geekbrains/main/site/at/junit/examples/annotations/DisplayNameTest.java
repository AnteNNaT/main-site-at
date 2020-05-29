package ru.geekbrains.main.site.at.junit.examples.annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Простой пример Тестового набора")
public class DisplayNameTest {

    @DisplayName("Простой пример ТК 1")
    @Test
    void example1() {
        assertTrue(true);
        assertEquals(2, 1 + 1);
    }

    @DisplayName("Простой пример ТК 2")
    @Test
    void example2() {
        assertTrue(true);
        assertEquals(2, 1 + 1);
    }
}