package lesson1;

import java.util.Random;

public class Robot implements Actions {
    private String type;
    private String name;
    private float maxHeight;
    private float maxDistance;

    public Robot(String name, float maxHeight, float maxDistance) {

        this.type= "Robot";
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxDistance = maxDistance;
    }

    String getType() {return this.type;}
    String getName() {return this.name;}
    Float getMaxHeight() {return this.maxHeight;}
    Float getMaxDistance() {return this.maxDistance;}

    public String running(float Distance) {
        return Distance <= this.maxDistance? this.type +" " + this.name + " пробежал " + Distance + " м.!" :
                this.type+" " + this.name + " пробежал " + this.maxDistance + " м., сломался и не смог пробежать " + Distance + " м.!";
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
