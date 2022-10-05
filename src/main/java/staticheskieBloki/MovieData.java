package staticheskieBloki;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    public static List<String> titles = new ArrayList<>(),
    directors = new ArrayList<>();

    static {
        add("Jurassic Park", "Steven Spielberg");
        add("The Dark Night", "Christopher Nolan");
        add("Titanic", "James Cameron");
    }
    private static void add(String title, String director){
        titles.add(title);
        directors.add(director);
    }

    }


