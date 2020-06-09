package ru.geekbrains.main.site.at.example.collections.hashmap;

import ru.geekbrains.main.site.at.example.collections.objects.Dog;
import ru.geekbrains.main.site.at.example.collections.objects.Human;

import java.util.HashMap;
import java.util.Map;

public class PutExample {

    public static void main(String[] args) {
        Map<Human, Dog> dogs = new HashMap<>();

        System.out.println(dogs.isEmpty());

        dogs.put(
                new Human("Олег"),
                new Dog(111));

        dogs.put(
                new Human("Ольга"),
                new Dog(345));

        dogs.put(
                new Human("Михаил"),
                new Dog(123));



        System.out.println(dogs.isEmpty());
        System.out.println(dogs.size());
        System.out.println(dogs);
    }


}
