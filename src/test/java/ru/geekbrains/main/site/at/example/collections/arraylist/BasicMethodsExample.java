package ru.geekbrains.main.site.at.example.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicMethodsExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        //Добавление элемента
        cats.add("Пушок");
        cats.add("Том");
        cats.add("Килька");
        cats.add("Том");
        System.out.println(cats);
        //Сортировка элементов коллекции
        Collections.sort(cats);
        System.out.println("Результат сортировки: "+cats);
        //получение элемента коллекции по индексу
        System.out.println("Первый элемент коллекции: "+cats.get(0));
        //получение индекса элемента (первое совпадение)
        System.out.println("Индекс первого вхождения элемента 'Том' в коллекцию: "+cats.indexOf("Том"));
        //проверка на вхождение элемента
        System.out.println("Имя 'Том' встречается в коллекции: "+cats.contains("Том"));
        //удаление элемента
        cats.remove(0);
        System.out.println(cats);
        //подсчет одинаковых объектов в коллекции
        System.out.println("Имя 'Том' встречается (раз(а)): "+Collections.frequency(cats, "Том"));
        //Замена элемента
        cats.set(0,"Бандит");
        System.out.println(cats);
        //Конвертация в массив
        String[] arr =cats.toArray(new String[cats.size()]);
        System.out.println("Конвертация в массив:");
        for(String element : arr){
            System.out.println(element);
        }
        //Объединение коллекций
        List<String> cats2 = new ArrayList<>();
        cats2.add("Барсик");

        List<String> unionCats = new ArrayList<>();
        unionCats.addAll(cats);
        unionCats.addAll(cats2);
        System.out.println(unionCats);


        //Очистка коллекции
        cats.clear();
        System.out.println(cats);




    }
}