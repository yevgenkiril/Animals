package daniilTask.list;

import java.util.ArrayList;
import java.util.List;

public abstract class Solution implements List {
    public static void main(String[] args) {
        ArrayList<Integer> solution = new ArrayList<Integer>();
        solution.add(0, 10);
        solution.add(1, 20);
        solution.add(2, 30);

    }

    @Override
    public void add(int index, Object element) {
    }
}
