package daniilTask.main;

import daniilTask.transport.Car;
import daniilTask.transport.Vehicles;
import daniilTask.transport.Vessel;

public class Main {
    public static void main(String[] args) {
        Vehicles toyota = new Car("Toyota", 80);
        Vehicles warShip = new Vessel("мАсква", 20);
        toyota.go();
        warShip.go();
    }
}
