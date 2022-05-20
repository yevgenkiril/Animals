package daniilTask.transport;

public class Vessel extends Vehicles{
    public Vessel(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void go() {
        //TODO: изменить это с исспользованием StringBuilder
        System.out.println(getName()+ " это русский военный корабль, который пошел на*уй со скоростью " + getSpeed() + " узлов");
    }
}
