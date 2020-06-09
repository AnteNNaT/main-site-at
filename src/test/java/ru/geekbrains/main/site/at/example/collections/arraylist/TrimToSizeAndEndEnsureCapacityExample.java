package ru.geekbrains.main.site.at.example.collections.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


public class TrimToSizeAndEndEnsureCapacityExample {

    static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<String> cats = new ArrayList<>();
        cats.ensureCapacity(11);
        cats.add("Том");
        cats.add("Пушок");
        cats.add("Килька");
        System.out.println(getCapacity(cats));
        cats.trimToSize();
        System.out.println(getCapacity(cats));
    }
}
