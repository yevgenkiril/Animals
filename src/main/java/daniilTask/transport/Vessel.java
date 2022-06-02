package daniilTask.transport;

public class Vessel extends Vehicles {
    public Vessel(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void go() {
        StringBuilder result = new StringBuilder();
        result.append(getName());
        result.append(" это русский военный корабль, который пошел на*уй со скоростью ");
        result.append(getSpeed());
        result.append(" узлов");
        System.out.println(result);
    }
}
