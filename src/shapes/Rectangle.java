package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(int length, int width) {
        return 2 * this.length + 2 * this.width;
    }

    public int getPerimeter(int length, int width) {
        return this.length * this.width;
    }

    public class Square extends Rectangle{

        public Square(int side) {
            super(side, side);
        }
    }
}
