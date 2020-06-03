package ru.geekbrains.main.site.at.example.junit.hamcrest;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;

public class NumberHamcrestTest {

    @Test
    void name() {
        double numberActual = 100.00;
        double numberExpected = 99.00;

        MatcherAssert.assertThat(numberActual,allOf(
                greaterThan(numberExpected),
                lessThanOrEqualTo(101.00),
                closeTo(numberExpected, 1)
        ));
    }
}