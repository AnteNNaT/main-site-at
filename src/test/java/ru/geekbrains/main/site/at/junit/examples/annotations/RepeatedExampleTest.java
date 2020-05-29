
package ru.geekbrains.main.site.at.junit.examples.annotations;

import org.junit.jupiter.api.RepeatedTest;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RepeatedExampleTest {

    @RepeatedTest(5)
    void example() throws InterruptedException {
        sleep(1000);
        assertTrue(true);
        assertEquals(2, 1 + 1);

    }
}