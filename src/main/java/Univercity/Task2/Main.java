package Univercity.Task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String[]> map = new HashMap<>();
        map.put("Vasya", new String[]{"Math", "Physic", "English"});
        map.put("Petya", new String[]{"English", "Psychology"});
        map.put("Sasha", new String[]{"Physic", "English", "Psychology"});
        map.put("Ivan", new String[]{"Math"});

        University university = new University(map);

        //university.getLessonsByStudent("Vasya");

        try {
            university.getStudentsByLesson("Mat");
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

      /*  Set<Map.Entry<String, String[]>> entrySet = map.entrySet();
        String s = "Math";
        for (Map.Entry<String, String[]> entry : entrySet) {
            if (Arrays.asList(entry.getValue()).contains(s)) {
                System.out.println(entry.getKey());
            }
        }*/

       /* Set<Map.Entry<String, String[]>> entrySet = map.entrySet();
        String s = "Math";
        for (Map.Entry<String, String[]> entry : entrySet) {
            String[] value = entry.getValue();
            for (int i = 0; i < value.length; i++) {
                if (value[i].equals(s)) {
                    System.out.println(entry.getKey());
                }
            }
        }*/
    }
}




