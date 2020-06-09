package ru.geekbrains.main.site.at.example.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class AddExample {
    public static void main(String[] args) {
        Set<String> cats = new HashSet<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармаглот");

        System.out.println(cats);
        System.out.println(cats.size());
    }
}
