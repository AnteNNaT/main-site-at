package lesson1;

public abstract class Obstacles {
    private String type;

    public Obstacles(String type) {
        this.type=type;
    }

    public String getName() { return type; }
}
