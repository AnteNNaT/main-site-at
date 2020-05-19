package lesson1;

public class Treadmill extends Obstacles {

    private float Lenght;

    public Treadmill(float Lenght) {
        super("Treadmill");
        this.Lenght=Lenght;
    }
    Float getLenght() {return this.Lenght;}

}
