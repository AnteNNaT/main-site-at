package ru.geekbrains.main.site;

public interface Actions {

      String running(float Distance);
       String jumping(float Height);
       String action(Obstacles obstacle);
       boolean possibility(Obstacles obstacle);
}