package ru.geekbrains.main.site.at.lesson7;

/*
1) Создать массив с набором из 10–20 слов, должны встречаться повторяющиеся.
Найти и вывести список уникальных слов, из которых состоит массив.
Посчитать, сколько раз встречается каждое слово.
2) Написать простой класс Телефонный Справочник, который хранит список фамилий и телефонных номеров.
В него с помощью метода add() можно добавлять записи, а с помощью get() — искать номер телефона по фамилии.
Для одной фамилии может быть несколько телефонов (однофамильцы):
тогда при запросе такой фамилии должны выводиться все номера.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    //Задание 1
        ArrayList<String> words = new ArrayList<>();
        String text ="Ведьмаку заплатите Чеканной монетой Чеканной монетой Ведьмаку заплатите Зачтется все это вам";

        Collections.addAll(words, text.toLowerCase().split(" "));

        HashSet<String> uniqueWords= new HashSet<String>(words);

        System.out.println(words);
        for (String word: uniqueWords
             ) {
            System.out.println("Слово '" + word + "' встречается " + Collections.frequency(words, word)+" раз(а).");
        }

// Задание 2
        PhoneBook pb=new PhoneBook();
        pb.add("8-904-11-11111", "Иванов А.В.");
        pb.add("8-902-22-22222","Петрова А.Н.");
        pb.add("8-903-12-33333","Иванов А.В.");
        pb.add("8-904-11-11111","Селедкин А.Л.");
        pb.get("Иванов А.В.");
        pb.get("Селедкин А.Л.");
        pb.allRecords();



    }
}
