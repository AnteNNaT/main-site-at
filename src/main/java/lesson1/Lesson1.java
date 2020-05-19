package lesson1;

public class Lesson1 {


    public static void main(String[] args) {

        Robot robot = new Robot("R2D2",1, 3000);
        Cat cat= new Cat("Бегемот",(float) 1.3, 500);
        Human human = new Human("Пилот Пиркс", (float)1.7, 2000);
        Wall wall1=new Wall((float)0.5);
        Treadmill tm1=new Treadmill((float)1000);
        Wall wall2=new Wall((float)1.0);
        Treadmill tm2=new Treadmill((float)2000);
        Wall wall3=new Wall((float)1.5);
        Treadmill tm3=new Treadmill((float)2500);

        Actions[] CreaturesArr= {robot, cat, human};
        Obstacles[] ObstaclesArr={wall1,tm1,wall2,tm2,wall3,tm3};
        for(Actions creature: CreaturesArr){
            for(Obstacles obstacle: ObstaclesArr) {
                if (creature.possibility(obstacle)){
                    System.out.println(creature.action(obstacle));
                }
                else {
                    System.out.println(creature.action(obstacle));
                    System.out.println("Участник сошел с дистанции!");
                    break;
                }
            }
        }
    }
    }
