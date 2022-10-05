package polimorf;

public class Parent {
    String name;
    int age;

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void go(){
        System.out.println(toString()+" Я хожу как все");
    }

    @Override
    public String toString() {
        return "Я "+ name+ ", мне " + age + " лет. ";
    }
}
