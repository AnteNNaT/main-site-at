package ru.geekbrains.main.site.at.example.exceptions;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionTest {

    @Test
    void example1() throws FileNotFoundException {
        File file = new File("src/test/resources/1.txt");
        new Scanner(file);
    }

    @Test
    void example2(){
        File file = new File("src/test/resources/1.txt");

        try {
            new Scanner(file);
            System.out.println("Блок try (код, в котором может произойти исключение)");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Блок catch (обработка исключения)");
        }finally {
            System.out.println("Необязательный блок finally (выполняется всегда)");
        }

        System.out.println("Программа выполняется дальше!");
    }
}
