package staticheskieBloki;

public class Dog {
    String name;
    String poroda;
    int age;
    {
        System.out.println("это нестатический блок инициализации!");
    }

    public Dog(String x, String y, int z) {
        name = x;
        poroda = y;
        age = z;
    }
}
