package daniilTask.sort;

public class Square implements Comparable<Square> {
    private int sideSize;
    private String color;

    public Square(int sideSize, String color) {
        this.sideSize = sideSize;
        this.color = color;
    }

    public int getSideSize() {
        return sideSize;
    }

    public void setSideSize(int sideSize) {
        this.sideSize = sideSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int compareTo(Square o) {
        return Integer.compare(getSideSize(), o.sideSize);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideSize=" + sideSize +
                ", color='" + color + '\'' +
                '}';
    }
}
