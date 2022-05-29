package daniilTask.mapa;

import java.util.HashMap;

public class Solution extends HashMap {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.put("1", "2");
        solution.get("1");
    }

    @Override
    public Object put(Object key, Object value) {
        Object s = super.put(key, value);
        System.out.println(key.toString() + value.toString());
        return s;
    }

    @Override
    public Object get(Object key) {
        Object s = super.get(key);
        System.out.println(s);
        return s;
    }

}
