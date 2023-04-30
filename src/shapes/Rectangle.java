package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int length, int width) {
        super(length, width);
    }
    public double getPerimeter() {
               return 2 * getLength() + 2 * getWidth();

    }

    @Override
    public double getArea() {
        return width * length;
    }

    public static class Square extends Quadrilateral{

        protected Square(int side) {
            super(side, side);
        }
        public double getArea() {
            return getWidth() * getWidth();
        }

        public double getPerimeter() {
            return 4 * getWidth();
        }
    }
}

