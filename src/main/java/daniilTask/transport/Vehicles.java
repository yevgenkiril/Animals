package daniilTask.transport;

public abstract class Vehicles implements Go {

    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    public Vehicles(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

}
