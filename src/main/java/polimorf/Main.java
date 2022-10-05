package polimorf;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("John", 45);
        Parent son = new Son("Igor", 21);
        Parent daughter = new Daughter("Svetlana", 19);

        List<Parent> parentList = Arrays.asList(parent, son, daughter);
        for (Parent p: parentList){
            p.go();
        }
    }
}
