package ru.geekbrains.main.site;

public class Treadmill extends Obstacles {

    private float Lenght;

    public Treadmill(float Lenght) {
        super("Treadmill");
        this.Lenght=Lenght;
    }

    Float getLenght() {return this.Lenght;}

}
