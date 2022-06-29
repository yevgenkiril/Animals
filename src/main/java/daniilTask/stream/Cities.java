package daniilTask.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cities {
    public static void main(String[] args) {
        List<String> citiesList = new ArrayList<>();
        citiesList.add("Kyiv");
        citiesList.add("Odesa");
        citiesList.add("Dnipro");
        citiesList.add("Donetsk");
        citiesList.add("Mariupol");

        System.out.println(citiesList);

        List<String> newList = citiesList.stream().filter(x->x.length()>5).map(s->s + ".UA").collect(Collectors.toList());
        System.out.println(newList);

    }
}
