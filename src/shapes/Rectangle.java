package shapes;

public class Rectangle {
    protected int length;
    protected int width;
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

//    public int getlengthWidth(int length, int width) {
//        return this.length;
//        return this.width;
//    }

    public int getArea() { return getLength() * getWidth();}

    public int getPerimeter() {
               return 2 * getLength() + 2 * getWidth();

    }

    public static class Square extends Rectangle{

        public Square(int side) {
            super(side, side);
        }
        public int getArea() {
            return 4 * getWidth();
        }

        public int getPerimeter() {
            return getWidth() ^ 2;
        }
    }
}
