package ru.geekbrains.main.site.at.example.collections.hashset;

import java.util.*;

public class BasicMethodsExample {
    public static void main(String[] args) {
        Set<String> cats = new HashSet<>();
        //Добавление элемента
        cats.add("Пушок");
        cats.add("Том");
        cats.add("Килька");
        cats.add("Том");
        System.out.println(cats);
        //проверка на вхождение элемента
        System.out.println("Имя 'Том' встречается в коллекции: "+cats.contains("Том"));
        //удаление элемента
        cats.remove("Том");
        System.out.println(cats);
        //Конвертация в массив
        String[] arr =cats.toArray(new String[cats.size()]);
        System.out.println("Конвертация в массив:");
        for(String element : arr){
            System.out.println(element);
        }
        //Объединение коллекций
        Set<String> cats2 = new HashSet<>();
        cats2.add("Барсик");

        Set<String> unionCats = new HashSet<>();
        unionCats.addAll(cats);
        unionCats.addAll(cats2);
        System.out.println("Результат объединения: "+unionCats);


        //Очистка коллекции
        cats.clear();
        System.out.println(cats);
        //проверка наличия элементов
        System.out.println("Коллеция не содержит элементов: "+cats.isEmpty());



    }
}
