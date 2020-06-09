package ru.geekbrains.main.site.at.example.collections.hashset;

import ru.geekbrains.main.site.at.example.collections.objects.Dog;

import java.util.HashSet;
import java.util.Set;

public class ContainsExample {
    public static void main(String[] args) {
        Set<String> cats = new HashSet<>();
        cats.add("Том");
        cats.add("Барсик");
      cats.add("Бармаглот");

   System.out.println(cats.contains("Том"));




        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog(111));
        dogs.add(new Dog(345));
        dogs.add(new Dog(123));

        System.out.println(dogs.contains(new Dog(111)));
    }
}
