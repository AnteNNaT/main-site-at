package ru.geekbrains.main.site.at.example.exceptions;

public class StackOverflowErrorExample {

    public static void main(String[] args) {
        example();
    }

    public static int example() {
        return example();
    }

}
