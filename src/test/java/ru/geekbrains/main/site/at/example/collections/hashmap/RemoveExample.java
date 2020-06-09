package ru.geekbrains.main.site.at.example.collections.hashmap;

import ru.geekbrains.main.site.at.example.collections.objects.Dog;
import ru.geekbrains.main.site.at.example.collections.objects.Human;

import java.util.HashMap;
import java.util.Map;

public class RemoveExample {

    public static void main(String[] args) {
        Map<Human, Dog> dogs = new HashMap<>();


        dogs.put(
                new Human("Олег"),
                new Dog(111));

        dogs.put(
                new Human("Ольга"),
                new Dog(345));

        dogs.put(
                new Human("Михаил"),
                new Dog(123));


        Dog removeDog = dogs.remove(new Human("Ольга"));
        System.out.println(removeDog);

        System.out.println(dogs);
    }


}
