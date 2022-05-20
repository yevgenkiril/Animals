package daniilTask.transport;

public class Vessel extends Vehicles{
    public Vessel(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void go() {
        System.out.println(getName()+ " это русский военный корабль, который пошел на*уй со скоростью " + getSpeed() + " узлов");
    }
}
