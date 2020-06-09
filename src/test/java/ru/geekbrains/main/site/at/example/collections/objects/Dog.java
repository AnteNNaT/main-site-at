package ru.geekbrains.main.site.at.example.collections.objects;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private int weight;
    private String gender;

    private int dogPassportNumber;

    public Dog(int dogPassportNumber) {
        this.dogPassportNumber = dogPassportNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                weight == dog.weight &&
                gender == dog.gender &&
                dogPassportNumber == dog.dogPassportNumber &&
                Objects.equals(name, dog.name) &&
                Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age, weight, gender, dogPassportNumber);
    }

    @Override
    public String toString() {
        return "Dog{" +
//                "name='" + name + '\'' +
//                ", breed='" + breed + '\'' +
//                ", age=" + age +
//                ", weight=" + weight +
//                ", gender=" + gender +
                ", dogPassportNumber=" + dogPassportNumber +
                '}';
    }
}
