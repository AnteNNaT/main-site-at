package ru.geekbrains.main.site.at.example.collections.arraylist;

import ru.geekbrains.main.site.at.example.collections.objects.Dog;
import java.util.ArrayList;
import java.util.List;

public class IndexOfExample {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(111));
        dogs.add(new Dog(345));
        dogs.add(new Dog(123));
        dogs.add(new Dog(678));
        dogs.add(new Dog(345));



        System.out.println(dogs.indexOf(new Dog(345)));
    }
}
