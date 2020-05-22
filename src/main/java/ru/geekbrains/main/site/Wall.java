package ru.geekbrains.main.site;

public class Wall extends Obstacles {

    private float Height;

    public Wall (float Height) {
        super("Wall");
        this.Height=Height;
    }

    Float getHeight() {return this.Height;}
}
