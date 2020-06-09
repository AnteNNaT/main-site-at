package ru.geekbrains.main.site.at.example.collections.iterations;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Том");
        cats.add("Пушок");
        cats.add("Килька");

        Iterator<String> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();
        }

        for (String cat : cats) {
            System.out.println(cat);
        }
    }
}
