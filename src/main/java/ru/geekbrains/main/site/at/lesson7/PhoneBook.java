package ru.geekbrains.main.site.at.lesson7;


import java.util.HashMap;
import java.util.Map;

public class PhoneBook {


    private Map<String, String> phoneBook = new HashMap<>();

    public void add(String number, String fullName){
        if (phoneBook.putIfAbsent(number, fullName)!=null){
            System.out.println("Запись с номером "+number+" уже существует!");
        }
    }

    public void get(String fullName){
        if (phoneBook.containsValue(fullName)){
        for(Map.Entry<String,String> entry: phoneBook.entrySet()) {
            if (entry.getValue().equals(fullName)) {
                System.out.println("Номер телефона для " + fullName + ": " + entry.getKey());
            }
        }
        }
        else {
            System.out.println("Номер телефона для " +fullName+ " не найден");
        }
    }

    public void allRecords(){
        System.out.println("Все записи в телефонной книге:");
        for(Map.Entry<String,String> entry: phoneBook.entrySet()) {
            System.out.println(entry.getValue()+": "+ entry.getKey());
        }
    }
}
