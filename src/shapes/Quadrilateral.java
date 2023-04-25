package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }
//    abstract int setLength(width) {
//    }

//    abstract int
    protected int length;
    protected int width;

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


}
