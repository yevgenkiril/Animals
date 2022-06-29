package daniilTask.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Cat");
        stringList.add("Dog");
        stringList.add("Mouse");
        stringList.add("Snake");

        System.out.println(stringList);
        List<Animal> animals = stringList.stream().filter(x -> x.contains("a")).filter(x -> x.contains("C")).map(x -> new Animal(x)).collect(Collectors.toList());
        System.out.println(animals);

        Stream<String> stroke = stringList.stream().filter(x -> x.contains("a")).filter(x -> x.contains("C"));
        stringList = stroke.collect(Collectors.toList());

        // сделать через стрим. отфильтровать строки, у кого есть заглавная буква(добавить без заглавной). по каждому из них добавить(строке) -Upper.
        // делать еще один стрим, который вместо листа строк делает лист цыфр по количеству символов в строке.
        //проект овощи)

        //создать метод, который принимает два значения(лист Стрингов и Стринг "search") и будет искать в листе есть ли строка из второго аргумента.
        //сделать тоже самое, только для листа интеджеров.
        //отфильтровать лист стрингов и оставить только строки, размер которых больше 5 и вывести каждую строку по буквам с новой сроки(filter.forEach)
        // отфильтровать лист стрингов и оставить только строки, размер которых больше 5 и в результате получить как переменную только первую строку и вывести. использовать метод лимит
        //пройстись по коду Грядка. и добавить туда какойто метод от себя.
        //

        List<String> list = stringList.stream().filter(x -> Character.isUpperCase(x.charAt(0))).map(s -> s + "-Upper").collect(Collectors.toList());
        System.out.println(list);

        List<Integer> newList = stringList.stream().map(String::length).collect(Collectors.toList());
        System.out.println(newList);

        List<String> samePart = stringList.stream().filter(x -> x.length() == 5).collect(Collectors.toList());
        System.out.println(samePart);


        List<String> firstLimit = samePart.stream().limit(1).collect(Collectors.toList());
        System.out.println(firstLimit);

        samePart.stream().forEach(s ->{
            char[] y = s.toCharArray();
            for (int i = 0; i < y.length; i++) {
                System.out.println(y[i]);
            }
        });

        checkStringInListSimplify(stringList, "Dog");
        checkStringInListAnyMatch(stringList, "Cat");
        checkStringInListIfElse(stringList, "Snoop Dog");
    }


    public static boolean checkStringInListIfElse(List<String> list, String search) {
        List<String> newList = list.stream().filter(s -> s.contains(search)).collect(Collectors.toList());
        if (newList.isEmpty()) {
            return false;
        } else return true;
    }

    public static boolean checkStringInListSimplify(List<String> list, String search) {
        List<String> newList = list.stream().filter(s -> s.contains(search)).collect(Collectors.toList());
        return !newList.isEmpty();
    }

    public static boolean checkStringInListAnyMatch(List<String> list, String search) {
        return list.stream().anyMatch(x -> x.contains(search));
    }

    public static class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
