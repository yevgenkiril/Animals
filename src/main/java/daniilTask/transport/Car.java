package daniilTask.transport;

public class Car extends Vehicles{

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void go() {
        System.out.println(getName() + " поехали! ");
    }
}
