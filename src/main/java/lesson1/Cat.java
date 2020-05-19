package lesson1;

import java.util.Random;

public class Cat implements Actions{
    private String type;
    private String name;
    private float maxHeight;
    private float maxDistance;
    //private final Random random = new Random();

    public Cat(String name, float maxHeight, float maxDistance) {
       // float HeightDiff = random.nextFloat() * maxHeight - (maxHeight / 2);
        //float DistanceDiff = random.nextFloat() * maxDistance - (maxDistance / 2);

        this.type= "Cat";
        this.name = name;
        this.maxHeight = maxHeight; //+ HeightDiff;
        this.maxDistance = maxDistance; // + DistanceDiff;
    }

    String getType() {return this.type;}
    String getName() {return this.name;}
    Float getMaxHeight() {return this.maxHeight;}
    Float getMaxDistance() {return this.maxDistance;}

    public String running(float Distance) {
        return Distance <= this.maxDistance? this.type +" " + this.name + " пробежал " + Distance + " м.!" :
                this.type+" " + this.name + " пробежал " + this.maxDistance + " м., устал и не смог пробежать " + Distance + " м.!";
    }

    public String jumping(float Height) {
        return Height <= this.maxHeight ? this.type +" " + this.name + " подпрыгнул на " + Height + " м.!" :
                this.type +" " + this.name + " не смог подпрыгнуть на " + Height + " м.! Он подпрыгнул на " + this.maxHeight + " м. ";
    }

    public String action(Obstacles obstacle) {
        if (obstacle instanceof Wall) {
            return jumping (((Wall) obstacle).getHeight());
        }
        if (obstacle instanceof Treadmill) {
            return running(((Treadmill) obstacle).getLenght());
        }
        return null;
    }
}
