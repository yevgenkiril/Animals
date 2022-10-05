package abstct;

abstract class Fruit {
    abstract void taste();
}

class Apple extends Fruit{

    @Override
    void taste() {
        System.out.println("Sweet taste of apple ");
    }
}

class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.taste();
    }
}
