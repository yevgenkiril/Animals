package daniilTask.sort;

import java.util.*;

public class SquareSorted {
    public static void main(String[] args) {
        List<Square> squareList = new ArrayList<>();
        Square square1 = new Square(25, "Red");
        Square square2 = new Square(10, "Black");
        Square square3 = new Square(15, "Green");
        Square square4 = new Square(5, "White");
        squareList.add(square1);
        squareList.add(square2);
        squareList.add(square3);
        squareList.add(square4);

        defaultSorting(squareList);

        sortingByColorUseClass(squareList);

        sortingByColorComparing(squareList);

        Square[] squareArray = arrayDefaultSorting(square1, square2, square3, square4);

        arraySortingByColorUseComparator(squareArray);

        treeSetSortingByColorUsingComparator(square1, square2, square3, square4);

        treeSetDefaultSorting(square1, square2, square3, square4);

    }

    private static void treeSetDefaultSorting(Square square1, Square square2, Square square3, Square square4) {
        Set<Square> squareSet = new TreeSet<>();
        squareSet.add(square1);
        squareSet.add(square2);
        squareSet.add(square3);
        squareSet.add(square4);
        System.out.println("Squares(TreeSet) after default sorting: " + squareSet);
    }

    private static void treeSetSortingByColorUsingComparator(Square square1, Square square2, Square square3, Square square4) {
        Set<Square> squareSet = new TreeSet<>(new SquareColorComparator());
        squareSet.add(square1);
        squareSet.add(square2);
        squareSet.add(square3);
        squareSet.add(square4);
        System.out.println("Squares(TreeSet) after sorting by color using comparator: " + squareSet);
    }

    private static void arraySortingByColorUseComparator(Square[] squareArray) {
        Arrays.sort(squareArray, new SquareColorComparator());
        System.out.println("Squares(array) after sorting by color using comparator: " + Arrays.toString(squareArray));
    }

    private static Square[] arrayDefaultSorting(Square square1, Square square2, Square square3, Square square4) {
        Square[] squareArray = new Square[]{square1, square2, square3, square4};
        System.out.println("Squares(array) before default sorting: " + Arrays.toString(squareArray));
        Arrays.sort(squareArray);
        System.out.println("Squares(array) after default sorting: " + Arrays.toString(squareArray));
        return squareArray;
    }

    private static void sortingByColorComparing(List<Square> squareList) {
        Comparator<Square> byColor = Comparator.comparing(Square::getColor);
        System.out.println("Squares(list) before sorting by color using .comparing: " + squareList);
        squareList.sort(byColor);
        System.out.println("Squares(list) after sorting by color using .comparing: " + squareList);
        System.out.println(" ");
    }

    private static void sortingByColorUseClass(List<Square> squareList) {
        SquareColorComparator squareColorComparator = new SquareColorComparator();
        System.out.println("Squares(list) before sorting by color using a class: " + squareList);
        squareList.sort(squareColorComparator);
        System.out.println("Squares(list) after sorting by color using a class: " + squareList);
        System.out.println(" ");
    }

    private static void defaultSorting(List<Square> squareList) {
        System.out.println("Squares(list) before default sorting: " + squareList);
        Collections.sort(squareList);
        System.out.println("Squares(list) after default sorting: " + squareList);
        System.out.println(" ");
    }
}
