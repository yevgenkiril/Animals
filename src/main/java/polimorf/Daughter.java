package polimorf;

public class Daughter extends Parent{
    public Daughter(String name, int age) {
        super(name, age);
    }

    @Override
    public void go() {
        System.out.println(toString() + " я хожу как дочь");
    }
}
