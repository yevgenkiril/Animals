package Univercity.Task2;

import java.io.IOException;
import java.util.*;

public class University {

    private final HashMap<String, String[]> useMe;

    public University(HashMap<String, String[]> useMe) {
        this.useMe = useMe;
    }

    public String[] getLessonsByStudent(String name) throws NullPointerException {
        if (!useMe.containsKey(name)) {
            throw new NullPointerException(name + " doesn't exist here");
        }
        String[] result = useMe.get(name);
        System.out.println(Arrays.deepToString(result));
        return result;
    }


    public List<String> getStudentsByLesson(String lesson) throws Exception {
        List<String> returnMe = new ArrayList<>();
        Set<Map.Entry<String, String[]>> entrySet = useMe.entrySet();

        for (Map.Entry<String, String[]> entry : entrySet) {
            String[] value = entry.getValue();
            for (String s : value) {
                if (s.equals(lesson)) {
                    returnMe.add(entry.getKey());
                    System.out.println(entry.getKey());
                }
            }
        }
        if (returnMe.isEmpty()) throw new Exception();
        return returnMe;
    }
}
