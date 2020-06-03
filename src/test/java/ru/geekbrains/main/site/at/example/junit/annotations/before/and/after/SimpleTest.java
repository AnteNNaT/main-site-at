package ru.geekbrains.main.site.at.example.junit.annotations.before.and.after;

import org.junit.jupiter.api.*;

public class SimpleTest  extends BaseTest{

    @BeforeAll
    static void beforeAll() {
        System.out.println("BeforeAll: SimpleTest");
    }

    @BeforeEach
    void a() {
        System.out.println("BeforeEach a:"+getClass().getName());
    }

    @BeforeEach
    void b() {
        System.out.println("BeforeEach b:"+getClass().getName());
    }

    @BeforeEach
    void c() {
        System.out.println("BeforeEach c:"+getClass().getName());
    }


    @Test
    void name1() {
        Assertions.assertTrue(true);
    }

    @Disabled
    @Test
    void name2() {
        Assertions.fail("Упал преднамеренно!");
    }


    @AfterEach
    void tearDown() throws InterruptedException {
        System.out.println("AfterEach:"+getClass().getName());
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AfterAll: SimpleTest");
    }
}
