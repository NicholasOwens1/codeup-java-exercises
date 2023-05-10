package shapes;

public class Square extends Rectangle{
    public Square(int length, int width) {
        super(length, width);
    }

    public Square(int length) {
        super(length, length);
    }
    @Override
    public double getPerimeter() {
        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }

    @Override
    public void setLength(int num) {
        this.length = num;
        this.width = num;
    }

    @Override
    public void setWidth(int num) {
        this.length = num;
        this.width = num;
    }
}
