package polimorf;

public class Son extends Parent{
    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public void go() {
        System.out.println(toString() + " я хожу как сын");
    }
}
