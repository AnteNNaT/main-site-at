package ru.geekbrains.main.site.at.junit.examples.annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Параметризованные тесты")
public class ParameterizedExampleTest {

    @DisplayName("пример хардкода данных")
    @ParameterizedTest
    @ValueSource(strings = { "Hello", "World" })
    void hardcode(String name) {
        System.out.println(name);
        assertTrue(true);
    }

    @DisplayName("пример получения данных из метода")
    @ParameterizedTest
    @MethodSource("stringProvider")
    void method(String name) {
        System.out.println(name);
        assertTrue(true);
    }

    static Stream<String> stringProvider() {
        return Stream.of("Hello", "World");
    }


}