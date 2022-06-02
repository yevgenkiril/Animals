package daniilTask.sort;

import java.util.Comparator;

public class SquareColorComparator implements Comparator<Square> {

    @Override
    public int compare(Square o1, Square o2) {
        return o1.getColor().compareTo(o2.getColor());
    }
}
